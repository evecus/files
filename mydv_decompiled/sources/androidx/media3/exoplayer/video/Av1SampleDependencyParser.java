package androidx.media3.exoplayer.video;

import androidx.media3.container.ObuParser;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Av1SampleDependencyParser {
    private static final int MAX_BYTES_FROM_KEYFRAME_TO_READ = 500;
    private static final int MAX_OBU_COUNT_FOR_PARTIAL_SKIP = 8;
    private final ByteBuffer delayedKeyFrameTruncatedSample = ByteBuffer.allocateDirect(MAX_BYTES_FROM_KEYFRAME_TO_READ);
    private ObuParser.SequenceHeader sequenceHeader;

    private boolean canSkipObu(ObuParser.Obu obu, boolean z) {
        ObuParser.SequenceHeader sequenceHeader;
        ObuParser.FrameHeader parse;
        int i = obu.type;
        if (i == 2 || i == 15) {
            return true;
        }
        if (i != 3 || z) {
            return ((i != 6 && i != 3) || (sequenceHeader = this.sequenceHeader) == null || (parse = ObuParser.FrameHeader.parse(sequenceHeader, obu)) == null || parse.isDependedOn()) ? false : true;
        }
        return false;
    }

    private void emptyDelayedKeyFrameTruncatedSample() {
        ByteBuffer byteBuffer = this.delayedKeyFrameTruncatedSample;
        byteBuffer.position(byteBuffer.limit());
    }

    private void updateSequenceHeaders(List<ObuParser.Obu> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).type == 1) {
                this.sequenceHeader = ObuParser.SequenceHeader.parse(list.get(i));
            }
        }
    }

    public void queueInputBuffer(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, position + MAX_BYTES_FROM_KEYFRAME_TO_READ));
        this.delayedKeyFrameTruncatedSample.clear();
        this.delayedKeyFrameTruncatedSample.put(byteBuffer);
        this.delayedKeyFrameTruncatedSample.flip();
        byteBuffer.position(position);
        byteBuffer.limit(limit);
    }

    public void reset() {
        this.sequenceHeader = null;
        emptyDelayedKeyFrameTruncatedSample();
    }

    public int sampleLimitAfterSkippingNonReferenceFrame(ByteBuffer byteBuffer, boolean z) {
        if (this.delayedKeyFrameTruncatedSample.hasRemaining()) {
            updateSequenceHeaders(ObuParser.split(this.delayedKeyFrameTruncatedSample));
            emptyDelayedKeyFrameTruncatedSample();
        }
        List<ObuParser.Obu> split = ObuParser.split(byteBuffer);
        updateSequenceHeaders(split);
        int size = split.size() - 1;
        int i = 0;
        while (size >= 0 && canSkipObu(split.get(size), z)) {
            if (split.get(size).type == 6 || split.get(size).type == 3) {
                i++;
            }
            size--;
        }
        return (i > 1 || size + 1 >= 8) ? byteBuffer.limit() : size >= 0 ? split.get(size).payload.limit() : byteBuffer.position();
    }
}
