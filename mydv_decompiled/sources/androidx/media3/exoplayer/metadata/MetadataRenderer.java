package androidx.media3.exoplayer.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.extractor.metadata.MetadataDecoder;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import defpackage.hf1;
import defpackage.s83;
import defpackage.sp0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class MetadataRenderer extends BaseRenderer implements Handler.Callback {
    private static final long MAX_READ_AHEAD_DURATION_US = 1000000;
    private static final int MSG_INVOKE_RENDERER = 1;
    private static final String TAG = "MetadataRenderer";
    private final MetadataInputBuffer buffer;
    private MetadataDecoder decoder;
    private final MetadataDecoderFactory decoderFactory;
    private boolean inputStreamEnded;
    private final MetadataOutput output;
    private final Handler outputHandler;
    private final boolean outputMetadataEarly;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    private Metadata pendingMetadata;
    private long subsampleOffsetUs;

    public MetadataRenderer(MetadataOutput metadataOutput, Looper looper, MetadataDecoderFactory metadataDecoderFactory, boolean z) {
        super(5);
        metadataOutput.getClass();
        this.output = metadataOutput;
        this.outputHandler = looper == null ? null : Util.createHandler(looper, this);
        metadataDecoderFactory.getClass();
        this.decoderFactory = metadataDecoderFactory;
        this.outputMetadataEarly = z;
        this.buffer = new MetadataInputBuffer();
        this.outputStreamOffsetUs = C.TIME_UNSET;
    }

    private void decodeWrappedMetadata(Metadata metadata, List<Metadata.Entry> list) {
        for (int i = 0; i < metadata.length(); i++) {
            Format wrappedMetadataFormat = metadata.get(i).getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !this.decoderFactory.supportsFormat(wrappedMetadataFormat)) {
                list.add(metadata.get(i));
            } else {
                MetadataDecoder createDecoder = this.decoderFactory.createDecoder(wrappedMetadataFormat);
                byte[] wrappedMetadataBytes = metadata.get(i).getWrappedMetadataBytes();
                wrappedMetadataBytes.getClass();
                this.buffer.clear();
                this.buffer.ensureSpaceForWrite(wrappedMetadataBytes.length);
                ((ByteBuffer) Util.castNonNull(this.buffer.data)).put(wrappedMetadataBytes);
                this.buffer.flip();
                Metadata decode = createDecoder.decode(this.buffer);
                if (decode != null) {
                    decodeWrappedMetadata(decode, list);
                }
            }
        }
    }

    @SideEffectFree
    private long getPresentationTimeUs(long j) {
        sp0.z(j != C.TIME_UNSET);
        sp0.z(this.outputStreamOffsetUs != C.TIME_UNSET);
        return j - this.outputStreamOffsetUs;
    }

    private void invokeRenderer(Metadata metadata) {
        Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(1, metadata).sendToTarget();
        } else {
            invokeRendererInternal(metadata);
        }
    }

    private void invokeRendererInternal(Metadata metadata) {
        this.output.onMetadata(metadata);
    }

    private boolean outputMetadata(long j) {
        boolean z;
        Metadata metadata = this.pendingMetadata;
        if (metadata == null || (!this.outputMetadataEarly && metadata.presentationTimeUs > getPresentationTimeUs(j))) {
            z = false;
        } else {
            invokeRenderer(this.pendingMetadata);
            this.pendingMetadata = null;
            z = true;
        }
        if (this.inputStreamEnded && this.pendingMetadata == null) {
            this.outputStreamEnded = true;
        }
        return z;
    }

    private void readMetadata(long j) {
        if (this.inputStreamEnded || this.pendingMetadata != null) {
            return;
        }
        this.buffer.clear();
        FormatHolder formatHolder = getFormatHolder();
        int readSource = readSource(formatHolder, this.buffer, 5);
        if (readSource != -3 || this.buffer.isEndOfStream()) {
            if (readSource != -4 || this.buffer.isEndOfStream()) {
                if (readSource == -4 || readSource == -3) {
                    long streamEndPositionUs = getStreamEndPositionUs();
                    long streamOffsetUs = j - getStreamOffsetUs();
                    if (streamEndPositionUs == C.TIME_UNSET || streamOffsetUs < streamEndPositionUs - 1000000) {
                        return;
                    }
                }
            } else if (!this.outputMetadataEarly && j < this.buffer.timeUs - 1000000) {
                return;
            }
            int readSource2 = readSource(formatHolder, this.buffer, 0);
            if (readSource2 != -4) {
                if (readSource2 == -5) {
                    Format format = formatHolder.format;
                    format.getClass();
                    this.subsampleOffsetUs = format.subsampleOffsetUs;
                    return;
                }
                return;
            }
            if (this.buffer.isEndOfStream()) {
                this.inputStreamEnded = true;
                return;
            }
            if (this.buffer.timeUs >= getLastResetPositionUs()) {
                MetadataInputBuffer metadataInputBuffer = this.buffer;
                metadataInputBuffer.subsampleOffsetUs = this.subsampleOffsetUs;
                metadataInputBuffer.flip();
                Metadata decode = ((MetadataDecoder) Util.castNonNull(this.decoder)).decode(this.buffer);
                if (decode != null) {
                    ArrayList arrayList = new ArrayList(decode.length());
                    decodeWrappedMetadata(decode, arrayList);
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    this.pendingMetadata = new Metadata(getPresentationTimeUs(this.buffer.timeUs), arrayList);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public String getName() {
        return TAG;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            invokeRendererInternal((Metadata) message.obj);
            return true;
        }
        s83.r();
        return false;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.pendingMetadata = null;
        this.decoder = null;
        this.outputStreamOffsetUs = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j, boolean z, boolean z2) {
        this.pendingMetadata = null;
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        this.decoder = this.decoderFactory.createDecoder(formatArr[0]);
        Metadata metadata = this.pendingMetadata;
        if (metadata != null) {
            this.pendingMetadata = metadata.copyWithPresentationTimeUs((metadata.presentationTimeUs + this.outputStreamOffsetUs) - j2);
        }
        this.outputStreamOffsetUs = j2;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) {
        boolean z = true;
        while (z) {
            readMetadata(j);
            z = outputMetadata(j);
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(Format format) {
        if (this.decoderFactory.supportsFormat(format)) {
            return hf1.k(format.cryptoType == 0 ? 4 : 2, 0, 0, 0);
        }
        return hf1.k(0, 0, 0, 0);
    }

    public MetadataRenderer(MetadataOutput metadataOutput, Looper looper, MetadataDecoderFactory metadataDecoderFactory) {
        this(metadataOutput, looper, metadataDecoderFactory, false);
    }

    public MetadataRenderer(MetadataOutput metadataOutput, Looper looper) {
        this(metadataOutput, looper, MetadataDecoderFactory.DEFAULT);
    }
}
