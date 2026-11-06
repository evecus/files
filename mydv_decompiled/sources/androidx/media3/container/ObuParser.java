package androidx.media3.container;

import androidx.media3.common.util.ParsableBitArray;
import defpackage.sp0;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ObuParser {
    public static final int OBU_FRAME = 6;
    public static final int OBU_FRAME_HEADER = 3;
    public static final int OBU_METADATA = 5;
    public static final int OBU_PADDING = 15;
    public static final int OBU_SEQUENCE_HEADER = 1;
    public static final int OBU_TEMPORAL_DELIMITER = 2;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class FrameHeader {
        private static final int FRAME_TYPE_INTRA_ONLY_FRAME = 2;
        private static final int FRAME_TYPE_KEY_FRAME = 0;
        private static final int FRAME_TYPE_SWITCH_FRAME = 3;
        private static final int PROBE_BYTES = 4;
        private final boolean isDependedOn;

        private FrameHeader(SequenceHeader sequenceHeader, Obu obu) {
            int i = obu.type;
            sp0.o(i == 6 || i == 3);
            byte[] bArr = new byte[Math.min(4, obu.payload.remaining())];
            obu.payload.asReadOnlyBuffer().get(bArr);
            ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
            ObuParser.throwWhenFeatureRequired(sequenceHeader.reducedStillPictureHeader);
            if (parsableBitArray.readBit()) {
                this.isDependedOn = false;
                return;
            }
            int readBits = parsableBitArray.readBits(2);
            boolean readBit = parsableBitArray.readBit();
            ObuParser.throwWhenFeatureRequired(sequenceHeader.decoderModelInfoPresentFlag);
            if (!readBit) {
                this.isDependedOn = true;
                return;
            }
            boolean readBit2 = (readBits == 3 || readBits == 0) ? true : parsableBitArray.readBit();
            parsableBitArray.skipBit();
            ObuParser.throwWhenFeatureRequired(!sequenceHeader.seqForceScreenContentTools);
            if (parsableBitArray.readBit()) {
                ObuParser.throwWhenFeatureRequired(!sequenceHeader.seqForceIntegerMv);
                parsableBitArray.skipBit();
            }
            ObuParser.throwWhenFeatureRequired(sequenceHeader.frameIdNumbersPresentFlag);
            if (readBits != 3) {
                parsableBitArray.skipBit();
            }
            parsableBitArray.skipBits(sequenceHeader.orderHintBits);
            if (readBits != 2 && readBits != 0 && !readBit2) {
                parsableBitArray.skipBits(3);
            }
            this.isDependedOn = ((readBits == 3 || readBits == 0) ? 255 : parsableBitArray.readBits(8)) != 0;
        }

        public static FrameHeader parse(SequenceHeader sequenceHeader, Obu obu) {
            try {
                return new FrameHeader(sequenceHeader, obu);
            } catch (NotYetImplementedException unused) {
                return null;
            }
        }

        public boolean isDependedOn() {
            return this.isDependedOn;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Metadata {
        public static final int METADATA_TYPE_HDR_CLL = 1;
        public static final int METADATA_TYPE_HDR_MDCV = 2;
        public static final int METADATA_TYPE_ITUT_T35 = 4;
        public static final int METADATA_TYPE_SCALABILITY = 3;
        public static final int METADATA_TYPE_TIMECODE = 5;
        public final ByteBuffer payload;
        public final int type;

        private Metadata(int i, ByteBuffer byteBuffer) {
            this.type = i;
            this.payload = byteBuffer;
        }

        public static Metadata parse(Obu obu) {
            sp0.o(obu.type == 5);
            ByteBuffer asReadOnlyBuffer = obu.payload.asReadOnlyBuffer();
            return new Metadata(ObuParser.leb128(asReadOnlyBuffer), asReadOnlyBuffer);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class NotYetImplementedException extends Exception {
        private NotYetImplementedException() {
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Obu {
        public final ByteBuffer header;
        public final ByteBuffer payload;
        public final int type;

        private Obu(int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            this.type = i;
            this.header = byteBuffer;
            this.payload = byteBuffer2;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class SequenceHeader {
        public final int chromaSamplePosition;
        public final byte colorPrimaries;
        public final boolean decoderModelInfoPresentFlag;
        public final boolean frameIdNumbersPresentFlag;
        public final boolean highBitdepth;
        public final int initialDisplayDelayMinus1;
        public final boolean initialDisplayDelayPresentFlag;
        public final byte matrixCoefficients;
        public final boolean monochrome;
        public final int orderHintBits;
        public final boolean reducedStillPictureHeader;
        public final boolean seqForceIntegerMv;
        public final boolean seqForceScreenContentTools;
        public final int seqLevelIdx0;
        public final int seqProfile;
        public final int seqTier0;
        public final boolean subsamplingX;
        public final boolean subsamplingY;
        public final byte transferCharacteristics;
        public final boolean twelveBit;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        private SequenceHeader(Obu obu) {
            int i;
            int i2;
            boolean z;
            ?? r8;
            boolean z2;
            boolean readBit;
            boolean z3;
            boolean z4;
            byte b;
            byte b2;
            byte b3;
            boolean z5;
            boolean z6 = true;
            sp0.o(obu.type == 1);
            byte[] bArr = new byte[obu.payload.remaining()];
            obu.payload.asReadOnlyBuffer().get(bArr);
            ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
            this.seqProfile = parsableBitArray.readBits(3);
            parsableBitArray.skipBit();
            boolean readBit2 = parsableBitArray.readBit();
            this.reducedStillPictureHeader = readBit2;
            if (readBit2) {
                i2 = parsableBitArray.readBits(5);
                this.decoderModelInfoPresentFlag = false;
                this.initialDisplayDelayPresentFlag = false;
                r8 = 0;
                i = 0;
            } else {
                if (parsableBitArray.readBit()) {
                    skipTimingInfo(parsableBitArray);
                    boolean readBit3 = parsableBitArray.readBit();
                    this.decoderModelInfoPresentFlag = readBit3;
                    if (readBit3) {
                        parsableBitArray.skipBits(47);
                    }
                } else {
                    this.decoderModelInfoPresentFlag = false;
                }
                this.initialDisplayDelayPresentFlag = parsableBitArray.readBit();
                int readBits = parsableBitArray.readBits(5);
                int i3 = 0;
                int i4 = 0;
                boolean z7 = false;
                i = 0;
                while (i4 <= readBits) {
                    parsableBitArray.skipBits(12);
                    if (i4 == 0) {
                        i3 = parsableBitArray.readBits(5);
                        z = z7;
                        if (i3 > 7) {
                            z = parsableBitArray.readBit();
                        }
                    } else {
                        z = z7;
                        if (parsableBitArray.readBits(5) > 7) {
                            parsableBitArray.skipBit();
                            z = z7;
                        }
                    }
                    if (this.decoderModelInfoPresentFlag) {
                        parsableBitArray.skipBit();
                    }
                    if (this.initialDisplayDelayPresentFlag && parsableBitArray.readBit()) {
                        if (i4 == 0) {
                            i = parsableBitArray.readBits(4);
                        } else {
                            parsableBitArray.skipBits(4);
                        }
                    }
                    i4++;
                    z7 = z;
                }
                i2 = i3;
                r8 = z7;
            }
            int readBits2 = parsableBitArray.readBits(4);
            int readBits3 = parsableBitArray.readBits(4);
            parsableBitArray.skipBits(readBits2 + 1);
            parsableBitArray.skipBits(readBits3 + 1);
            if (this.reducedStillPictureHeader) {
                this.frameIdNumbersPresentFlag = false;
                z2 = false;
            } else {
                z2 = parsableBitArray.readBit();
                this.frameIdNumbersPresentFlag = z2;
            }
            if (z2) {
                parsableBitArray.skipBits(4);
                parsableBitArray.skipBits(3);
            }
            parsableBitArray.skipBits(3);
            if (this.reducedStillPictureHeader) {
                this.seqForceIntegerMv = true;
                this.seqForceScreenContentTools = true;
                this.orderHintBits = 0;
            } else {
                parsableBitArray.skipBits(4);
                boolean readBit4 = parsableBitArray.readBit();
                if (readBit4) {
                    parsableBitArray.skipBits(2);
                }
                if (parsableBitArray.readBit()) {
                    this.seqForceScreenContentTools = true;
                    readBit = true;
                } else {
                    readBit = parsableBitArray.readBit();
                    this.seqForceScreenContentTools = readBit;
                }
                if (!readBit) {
                    this.seqForceIntegerMv = true;
                } else if (parsableBitArray.readBit()) {
                    this.seqForceIntegerMv = true;
                } else {
                    this.seqForceIntegerMv = parsableBitArray.readBit();
                }
                if (readBit4) {
                    this.orderHintBits = parsableBitArray.readBits(3) + 1;
                } else {
                    this.orderHintBits = 0;
                }
            }
            this.seqLevelIdx0 = i2;
            this.seqTier0 = r8;
            this.initialDisplayDelayMinus1 = i;
            parsableBitArray.skipBits(3);
            boolean readBit5 = parsableBitArray.readBit();
            this.highBitdepth = readBit5;
            if (this.seqProfile == 2 && readBit5) {
                z3 = parsableBitArray.readBit();
                this.twelveBit = z3;
            } else {
                this.twelveBit = false;
                z3 = false;
            }
            if (this.seqProfile != 1) {
                z4 = parsableBitArray.readBit();
                this.monochrome = z4;
            } else {
                this.monochrome = false;
                z4 = false;
            }
            if (parsableBitArray.readBit()) {
                b2 = (byte) parsableBitArray.readBits(8);
                this.colorPrimaries = b2;
                b3 = (byte) parsableBitArray.readBits(8);
                this.transferCharacteristics = b3;
                b = (byte) parsableBitArray.readBits(8);
                this.matrixCoefficients = b;
            } else {
                this.colorPrimaries = (byte) 0;
                this.transferCharacteristics = (byte) 0;
                this.matrixCoefficients = (byte) 0;
                b = 0;
                b2 = 0;
                b3 = 0;
            }
            if (z4) {
                parsableBitArray.skipBit();
                this.subsamplingX = false;
                this.subsamplingY = false;
                this.chromaSamplePosition = 0;
            } else if (b2 == 1 && b3 == 13 && b == 0) {
                this.subsamplingX = false;
                this.subsamplingY = false;
                this.chromaSamplePosition = 0;
            } else {
                parsableBitArray.skipBit();
                int i5 = this.seqProfile;
                if (i5 == 0) {
                    this.subsamplingX = true;
                    this.subsamplingY = true;
                    z5 = true;
                } else if (i5 == 1) {
                    this.subsamplingX = false;
                    this.subsamplingY = false;
                    z5 = false;
                    z6 = false;
                } else {
                    if (z3) {
                        z6 = parsableBitArray.readBit();
                        this.subsamplingX = z6;
                        if (z6) {
                            z5 = parsableBitArray.readBit();
                            this.subsamplingY = z5;
                        } else {
                            this.subsamplingY = false;
                        }
                    } else {
                        this.subsamplingX = true;
                        this.subsamplingY = false;
                    }
                    z5 = false;
                }
                if (z6 && z5) {
                    this.chromaSamplePosition = parsableBitArray.readBits(2);
                } else {
                    this.chromaSamplePosition = 0;
                }
            }
            parsableBitArray.skipBit();
        }

        public static SequenceHeader parse(Obu obu) {
            try {
                return new SequenceHeader(obu);
            } catch (NotYetImplementedException unused) {
                return null;
            }
        }

        private static void skipTimingInfo(ParsableBitArray parsableBitArray) {
            parsableBitArray.skipBits(64);
            if (parsableBitArray.readBit()) {
                ObuParser.skipUvlc(parsableBitArray);
            }
        }
    }

    private ObuParser() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int leb128(ByteBuffer byteBuffer) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            byte b = byteBuffer.get();
            i |= (b & Byte.MAX_VALUE) << (i2 * 7);
            if ((b & 128) == 0) {
                return i;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void skipUvlc(ParsableBitArray parsableBitArray) {
        int i = 0;
        while (!parsableBitArray.readBit()) {
            i++;
        }
        if (i < 32) {
            parsableBitArray.skipBits(i);
        }
    }

    public static List<Obu> split(ByteBuffer byteBuffer) {
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
            try {
                byte b = asReadOnlyBuffer.get();
                int i = (b >> 3) & 15;
                if (((b >> 2) & 1) != 0) {
                    asReadOnlyBuffer.get();
                }
                int leb128 = ((b >> 1) & 1) != 0 ? leb128(asReadOnlyBuffer) : asReadOnlyBuffer.remaining();
                if (asReadOnlyBuffer.position() + leb128 > asReadOnlyBuffer.limit()) {
                    break;
                }
                duplicate.limit(asReadOnlyBuffer.position());
                ByteBuffer duplicate2 = asReadOnlyBuffer.duplicate();
                duplicate2.limit(asReadOnlyBuffer.position() + leb128);
                arrayList.add(new Obu(i, duplicate, duplicate2));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + leb128);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void throwWhenFeatureRequired(boolean z) {
        if (z) {
            throw new NotYetImplementedException();
        }
    }
}
