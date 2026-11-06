package androidx.media3.extractor.ts;

import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ConstantBitrateSeekMap;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.ts.TsPayloadReader;
import defpackage.e1;
import defpackage.jp0;
import java.io.EOFException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AdtsExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new e1(17);
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    private static final int MAX_PACKET_SIZE = 2048;
    private static final int MAX_SNIFF_BYTES = 8192;
    private static final int NUM_FRAMES_FOR_AVERAGE_FRAME_SIZE = 1000;
    private int averageFrameSize;
    private ExtractorOutput extractorOutput;
    private long firstFramePosition;
    private long firstSampleTimestampUs;
    private final int flags;
    private boolean hasCalculatedAverageFrameSize;
    private boolean hasOutputSeekMap;
    private final ParsableByteArray packetBuffer;
    private final AdtsReader reader;
    private final ParsableByteArray scratch;
    private final ParsableBitArray scratchBits;
    private boolean startedPacket;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Flags {
    }

    public AdtsExtractor(int i) {
        this.flags = (i & 2) != 0 ? i | 1 : i;
        this.reader = new AdtsReader(true, MimeTypes.AUDIO_AAC);
        this.packetBuffer = new ParsableByteArray(2048);
        this.averageFrameSize = -1;
        this.firstFramePosition = -1L;
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        this.scratch = parsableByteArray;
        this.scratchBits = new ParsableBitArray(parsableByteArray.getData());
    }

    private void calculateAverageFrameSize(ExtractorInput extractorInput) {
        if (this.hasCalculatedAverageFrameSize) {
            return;
        }
        this.averageFrameSize = -1;
        extractorInput.resetPeekPosition();
        long j = 0;
        if (extractorInput.getPosition() == 0) {
            peekId3Header(extractorInput);
        }
        int i = 0;
        int i2 = 0;
        while (extractorInput.peekFully(this.scratch.getData(), 0, 2, true)) {
            try {
                this.scratch.setPosition(0);
                if (!AdtsReader.isAdtsSyncWord(this.scratch.readUnsignedShort())) {
                    break;
                }
                if (!extractorInput.peekFully(this.scratch.getData(), 0, 4, true)) {
                    break;
                }
                this.scratchBits.setPosition(14);
                int readBits = this.scratchBits.readBits(13);
                if (readBits <= 6) {
                    this.hasCalculatedAverageFrameSize = true;
                    throw ParserException.createForMalformedContainer("Malformed ADTS stream", null);
                }
                j += readBits;
                i2++;
                if (i2 != 1000 && extractorInput.advancePeekPosition(readBits - 6, true)) {
                }
                break;
            } catch (EOFException unused) {
            }
        }
        i = i2;
        extractorInput.resetPeekPosition();
        if (i > 0) {
            this.averageFrameSize = (int) (j / i);
        } else {
            this.averageFrameSize = -1;
        }
        this.hasCalculatedAverageFrameSize = true;
    }

    private static int getBitrateFromFrameSize(int i, long j) {
        return (int) ((i * 8000000) / j);
    }

    private SeekMap getConstantBitrateSeekMap(long j, boolean z) {
        return new ConstantBitrateSeekMap(j, this.firstFramePosition, getBitrateFromFrameSize(this.averageFrameSize, this.reader.getSampleDurationUs()), this.averageFrameSize, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new AdtsExtractor()};
    }

    @RequiresNonNull({"extractorOutput"})
    private void maybeOutputSeekMap(long j, boolean z) {
        if (this.hasOutputSeekMap) {
            return;
        }
        boolean z2 = (this.flags & 1) != 0 && this.averageFrameSize > 0;
        if (z2 && this.reader.getSampleDurationUs() == C.TIME_UNSET && !z) {
            return;
        }
        if (!z2 || this.reader.getSampleDurationUs() == C.TIME_UNSET) {
            this.extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
        } else {
            this.extractorOutput.seekMap(getConstantBitrateSeekMap(j, (this.flags & 2) != 0));
        }
        this.hasOutputSeekMap = true;
    }

    private int peekId3Header(ExtractorInput extractorInput) {
        int i = 0;
        while (true) {
            extractorInput.peekFully(this.scratch.getData(), 0, 10);
            this.scratch.setPosition(0);
            if (this.scratch.readUnsignedInt24() != 4801587) {
                break;
            }
            this.scratch.skipBytes(3);
            int readSynchSafeInt = this.scratch.readSynchSafeInt();
            i += readSynchSafeInt + 10;
            extractorInput.advancePeekPosition(readSynchSafeInt);
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i);
        if (this.firstFramePosition == -1) {
            this.firstFramePosition = i;
        }
        return i;
    }

    @Override // androidx.media3.extractor.Extractor
    public final /* synthetic */ List getSniffFailureDetails() {
        return jp0.f();
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.reader.createTracks(extractorOutput, new TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        this.extractorOutput.getClass();
        long length = extractorInput.getLength();
        int i = this.flags;
        if ((i & 2) != 0 || ((i & 1) != 0 && length != -1)) {
            calculateAverageFrameSize(extractorInput);
        }
        int read = extractorInput.read(this.packetBuffer.getData(), 0, 2048);
        boolean z = read == -1;
        maybeOutputSeekMap(length, z);
        if (z) {
            return -1;
        }
        this.packetBuffer.setPosition(0);
        this.packetBuffer.setLimit(read);
        if (!this.startedPacket) {
            this.reader.packetStarted(this.firstSampleTimestampUs, 4);
            this.startedPacket = true;
        }
        this.reader.consume(this.packetBuffer);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.startedPacket = false;
        this.reader.seek();
        this.firstSampleTimestampUs = j2;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        int peekId3Header = peekId3Header(extractorInput);
        int i = peekId3Header;
        int i2 = 0;
        int i3 = 0;
        do {
            extractorInput.peekFully(this.scratch.getData(), 0, 2);
            this.scratch.setPosition(0);
            if (AdtsReader.isAdtsSyncWord(this.scratch.readUnsignedShort())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                extractorInput.peekFully(this.scratch.getData(), 0, 4);
                this.scratchBits.setPosition(14);
                int readBits = this.scratchBits.readBits(13);
                if (readBits <= 6) {
                    i++;
                    extractorInput.resetPeekPosition();
                    extractorInput.advancePeekPosition(i);
                } else {
                    extractorInput.advancePeekPosition(readBits - 6);
                    i3 += readBits;
                }
            } else {
                i++;
                extractorInput.resetPeekPosition();
                extractorInput.advancePeekPosition(i);
            }
            i2 = 0;
            i3 = 0;
        } while (i - peekId3Header < 8192);
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final /* synthetic */ Extractor getUnderlyingImplementation() {
        return this;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    public AdtsExtractor() {
        this(0);
    }
}
