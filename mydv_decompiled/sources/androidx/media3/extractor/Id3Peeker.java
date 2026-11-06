package androidx.media3.extractor;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import defpackage.hf1;
import java.io.EOFException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Id3Peeker {
    private static final String TAG = "Id3Peeker";
    private final ParsableByteArray scratch = new ParsableByteArray(10);

    private boolean peekId3HeaderIntoScratch(ExtractorInput extractorInput, int i) {
        int i2 = 0;
        do {
            int i3 = i2 % 10;
            int i4 = i3 + 10;
            if (i3 == 0 && i2 != 0) {
                System.arraycopy(this.scratch.getData(), 10, this.scratch.getData(), 0, 9);
            }
            int i5 = i2 != 0 ? 1 : 10;
            try {
                extractorInput.peekFully(this.scratch.getData(), i4 - i5, i5);
                this.scratch.setPosition(i3);
                this.scratch.setLimit(i4);
                int peekUnsignedInt24 = this.scratch.peekUnsignedInt24();
                ParsableByteArray parsableByteArray = this.scratch;
                if (peekUnsignedInt24 == 4801587) {
                    parsableByteArray.skipBytes(3);
                    if (Id3Decoder.isSupportedMajorVersion(this.scratch.readUnsignedByte())) {
                        this.scratch.setPosition(i3);
                        return true;
                    }
                } else if (MpegAudioUtil.getFrameSize(parsableByteArray.peekInt()) != -1) {
                    return false;
                }
                if (i2 == 0) {
                    this.scratch.ensureCapacity(20);
                }
                i2++;
            } catch (EOFException unused) {
            }
        } while (i2 <= i);
        return false;
    }

    public Metadata peekId3Data(ExtractorInput extractorInput, Id3Decoder.FramePredicate framePredicate, int i) {
        Metadata metadata = null;
        int i2 = 0;
        while (true) {
            if (!peekId3HeaderIntoScratch(extractorInput, i)) {
                break;
            }
            int position = this.scratch.getPosition();
            this.scratch.skipBytes(6);
            int readSynchSafeInt = this.scratch.readSynchSafeInt();
            int i3 = readSynchSafeInt + 10;
            if (extractorInput.getLength() != -1 && extractorInput.getPeekPosition() + readSynchSafeInt > extractorInput.getLength()) {
                StringBuilder C = hf1.C("Skipping ID3 tag with tagLength=", i3, " greater than input length=");
                C.append(extractorInput.getLength());
                Log.w(TAG, C.toString());
                break;
            }
            if (metadata == null) {
                byte[] bArr = new byte[i3];
                System.arraycopy(this.scratch.getData(), position, bArr, 0, 10);
                extractorInput.peekFully(bArr, 10, readSynchSafeInt);
                metadata = new Id3Decoder(framePredicate).decode(bArr, i3);
            } else {
                extractorInput.advancePeekPosition(readSynchSafeInt);
            }
            i2 += i3;
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i2);
        return metadata;
    }

    @Deprecated
    public Metadata peekId3Data(ExtractorInput extractorInput, Id3Decoder.FramePredicate framePredicate) {
        return peekId3Data(extractorInput, framePredicate, 0);
    }
}
