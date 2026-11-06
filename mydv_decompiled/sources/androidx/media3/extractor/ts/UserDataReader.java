package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.ReorderingBufferQueue;
import androidx.media3.extractor.CeaUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import defpackage.sp0;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class UserDataReader {
    private static final int USER_DATA_START_CODE = 434;
    private final List<Format> closedCaptionFormats;
    private final String containerMimeType;
    private final TrackOutput[] outputs;
    private final ReorderingBufferQueue reorderingBufferQueue;

    public UserDataReader(List<Format> list, String str) {
        this.closedCaptionFormats = list;
        this.containerMimeType = str;
        this.outputs = new TrackOutput[list.size()];
        ReorderingBufferQueue reorderingBufferQueue = new ReorderingBufferQueue(new ReorderingBufferQueue.OutputConsumer() { // from class: androidx.media3.extractor.ts.a
            @Override // androidx.media3.container.ReorderingBufferQueue.OutputConsumer
            public final void consume(long j, ParsableByteArray parsableByteArray) {
                UserDataReader.this.lambda$new$0(j, parsableByteArray);
            }
        });
        this.reorderingBufferQueue = reorderingBufferQueue;
        reorderingBufferQueue.setMaxSize(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(long j, ParsableByteArray parsableByteArray) {
        CeaUtil.consumeCcData(j, parsableByteArray, this.outputs);
    }

    public void consume(long j, ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 9) {
            return;
        }
        int readInt = parsableByteArray.readInt();
        int readInt2 = parsableByteArray.readInt();
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if (readInt == USER_DATA_START_CODE && readInt2 == 1195456820 && readUnsignedByte == 3) {
            this.reorderingBufferQueue.add(j, parsableByteArray);
        }
    }

    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        for (int i = 0; i < this.outputs.length; i++) {
            trackIdGenerator.generateNewId();
            TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 3);
            Format format = this.closedCaptionFormats.get(i);
            String str = format.sampleMimeType;
            sp0.s(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption MIME type provided: %s", str);
            track.format(new Format.Builder().setId(trackIdGenerator.getFormatId()).setContainerMimeType(this.containerMimeType).setSampleMimeType(str).setSelectionFlags(format.selectionFlags).setLanguage(format.language).setAccessibilityChannel(format.accessibilityChannel).setInitializationData(format.initializationData).build());
            this.outputs[i] = track;
        }
    }
}
