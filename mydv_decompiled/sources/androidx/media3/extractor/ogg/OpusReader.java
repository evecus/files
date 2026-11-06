package androidx.media3.extractor.ogg;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.OpusUtil;
import androidx.media3.extractor.VorbisUtil;
import androidx.media3.extractor.ogg.StreamReader;
import defpackage.dy1;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class OpusReader extends StreamReader {
    private boolean firstCommentHeaderSeen;
    private static final byte[] OPUS_ID_HEADER_SIGNATURE = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] OPUS_COMMENT_HEADER_SIGNATURE = {79, 112, 117, 115, 84, 97, 103, 115};

    private static boolean peekPacketStartsWith(ParsableByteArray parsableByteArray, byte[] bArr) {
        if (parsableByteArray.bytesLeft() < bArr.length) {
            return false;
        }
        int position = parsableByteArray.getPosition();
        byte[] bArr2 = new byte[bArr.length];
        parsableByteArray.readBytes(bArr2, 0, bArr.length);
        parsableByteArray.setPosition(position);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean verifyBitstreamType(ParsableByteArray parsableByteArray) {
        return peekPacketStartsWith(parsableByteArray, OPUS_ID_HEADER_SIGNATURE);
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public long preparePayload(ParsableByteArray parsableByteArray) {
        return convertTimeToGranule(OpusUtil.getPacketDurationUs(parsableByteArray.getData()));
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean readHeaders(ParsableByteArray parsableByteArray, long j, StreamReader.SetupData setupData) {
        if (peekPacketStartsWith(parsableByteArray, OPUS_ID_HEADER_SIGNATURE)) {
            byte[] copyOf = Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit());
            int channelCount = OpusUtil.getChannelCount(copyOf);
            List<byte[]> buildInitializationData = OpusUtil.buildInitializationData(copyOf);
            if (setupData.format == null) {
                setupData.format = new Format.Builder().setContainerMimeType(MimeTypes.AUDIO_OGG).setSampleMimeType(MimeTypes.AUDIO_OPUS).setChannelCount(channelCount).setSampleRate(OpusUtil.SAMPLE_RATE).setInitializationData(buildInitializationData).build();
                return true;
            }
        } else {
            byte[] bArr = OPUS_COMMENT_HEADER_SIGNATURE;
            if (!peekPacketStartsWith(parsableByteArray, bArr)) {
                setupData.format.getClass();
                return false;
            }
            setupData.format.getClass();
            if (!this.firstCommentHeaderSeen) {
                this.firstCommentHeaderSeen = true;
                parsableByteArray.skipBytes(bArr.length);
                Metadata parseVorbisComments = VorbisUtil.parseVorbisComments(dy1.q(androidx.media3.container.VorbisUtil.readVorbisCommentHeader(parsableByteArray, false, false).comments));
                if (parseVorbisComments != null) {
                    setupData.format = setupData.format.buildUpon().setMetadata(parseVorbisComments.copyWithAppendedEntriesFrom(setupData.format.metadata)).build();
                    return true;
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public void reset(boolean z) {
        super.reset(z);
        if (z) {
            this.firstCommentHeaderSeen = false;
        }
    }
}
