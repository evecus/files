package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.spherical.Projection;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class ProjectionDecoder {
    private static final double LOG2 = Math.log(2.0d);
    private static final int MAX_COORDINATE_COUNT = 10000;
    private static final int MAX_TRIANGLE_INDICES = 128000;
    private static final int MAX_VERTEX_COUNT = 32000;
    private static final int TYPE_DFL8 = 1684433976;
    private static final int TYPE_MESH = 1835365224;
    private static final int TYPE_MSHP = 1836279920;
    private static final int TYPE_PROJ = 1886547818;
    private static final int TYPE_RAW = 1918990112;
    private static final int TYPE_YTMP = 2037673328;

    private ProjectionDecoder() {
    }

    public static Projection decode(byte[] bArr, int i) {
        ArrayList<Projection.Mesh> arrayList;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        try {
            arrayList = isProj(parsableByteArray) ? parseProj(parsableByteArray) : parseMshp(parsableByteArray);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new Projection(arrayList.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new Projection(arrayList.get(0), arrayList.get(1), i);
    }

    private static int decodeZigZag(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    private static boolean isProj(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        int readInt = parsableByteArray.readInt();
        parsableByteArray.setPosition(0);
        return readInt == 1886547818;
    }

    private static Projection.Mesh parseMesh(ParsableByteArray parsableByteArray) {
        int readInt = parsableByteArray.readInt();
        if (readInt <= 0 || readInt > 10000) {
            return null;
        }
        float[] fArr = new float[readInt];
        for (int i = 0; i < readInt; i++) {
            fArr[i] = parsableByteArray.readFloat();
        }
        int readInt2 = parsableByteArray.readInt();
        if (readInt2 <= 0 || readInt2 > MAX_VERTEX_COUNT) {
            return null;
        }
        double d = 2.0d;
        int ceil = (int) Math.ceil(Math.log(readInt * 2.0d) / LOG2);
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        float[] fArr2 = new float[readInt2 * 5];
        int[] iArr = new int[5];
        int i2 = 0;
        for (int i3 = 0; i3 < readInt2; i3++) {
            int i4 = 0;
            while (i4 < 5) {
                int decodeZigZag = iArr[i4] + decodeZigZag(parsableBitArray.readBits(ceil));
                if (decodeZigZag >= readInt || decodeZigZag < 0) {
                    return null;
                }
                fArr2[i2] = fArr[decodeZigZag];
                iArr[i4] = decodeZigZag;
                i4++;
                i2++;
            }
        }
        parsableBitArray.setPosition((parsableBitArray.getPosition() + 7) & (-8));
        int i5 = 32;
        int readBits = parsableBitArray.readBits(32);
        if (readBits <= 0) {
            return null;
        }
        Projection.SubMesh[] subMeshArr = new Projection.SubMesh[readBits];
        int i6 = 0;
        while (i6 < readBits) {
            int readBits2 = parsableBitArray.readBits(8);
            int readBits3 = parsableBitArray.readBits(8);
            int readBits4 = parsableBitArray.readBits(i5);
            if (readBits4 <= 0 || readBits4 > MAX_TRIANGLE_INDICES) {
                return null;
            }
            int ceil2 = (int) Math.ceil(Math.log(readInt2 * d) / LOG2);
            float[] fArr3 = new float[readBits4 * 3];
            float[] fArr4 = new float[readBits4 * 2];
            int i7 = 0;
            int i8 = 0;
            while (i7 < readBits4) {
                int decodeZigZag2 = i8 + decodeZigZag(parsableBitArray.readBits(ceil2));
                if (decodeZigZag2 < 0 || decodeZigZag2 >= readInt2) {
                    return null;
                }
                int i9 = i7 * 3;
                int i10 = decodeZigZag2 * 5;
                fArr3[i9] = fArr2[i10];
                fArr3[i9 + 1] = fArr2[i10 + 1];
                fArr3[i9 + 2] = fArr2[i10 + 2];
                int i11 = i7 * 2;
                fArr4[i11] = fArr2[i10 + 3];
                fArr4[i11 + 1] = fArr2[i10 + 4];
                i7++;
                i8 = decodeZigZag2;
            }
            subMeshArr[i6] = new Projection.SubMesh(readBits2, fArr3, fArr4, readBits3);
            i6++;
            i5 = 32;
            d = 2.0d;
        }
        return new Projection.Mesh(subMeshArr);
    }

    private static ArrayList<Projection.Mesh> parseMshp(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.readUnsignedByte() != 0) {
            return null;
        }
        parsableByteArray.skipBytes(7);
        int readInt = parsableByteArray.readInt();
        if (readInt == TYPE_DFL8) {
            ParsableByteArray parsableByteArray2 = new ParsableByteArray();
            Inflater inflater = new Inflater(true);
            try {
                if (!Util.inflate(parsableByteArray, parsableByteArray2, inflater)) {
                    return null;
                }
                inflater.end();
                parsableByteArray = parsableByteArray2;
            } finally {
                inflater.end();
            }
        } else if (readInt != TYPE_RAW) {
            return null;
        }
        return parseRawMshpData(parsableByteArray);
    }

    private static ArrayList<Projection.Mesh> parseProj(ParsableByteArray parsableByteArray) {
        int readInt;
        parsableByteArray.skipBytes(8);
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        while (position < limit && (readInt = parsableByteArray.readInt() + position) > position && readInt <= limit) {
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == TYPE_YTMP || readInt2 == TYPE_MSHP) {
                parsableByteArray.setLimit(readInt);
                return parseMshp(parsableByteArray);
            }
            parsableByteArray.setPosition(readInt);
            position = readInt;
        }
        return null;
    }

    private static ArrayList<Projection.Mesh> parseRawMshpData(ParsableByteArray parsableByteArray) {
        ArrayList<Projection.Mesh> arrayList = new ArrayList<>();
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        while (position < limit) {
            int readInt = parsableByteArray.readInt() + position;
            if (readInt <= position || readInt > limit) {
                return null;
            }
            if (parsableByteArray.readInt() == TYPE_MESH) {
                Projection.Mesh parseMesh = parseMesh(parsableByteArray);
                if (parseMesh == null) {
                    return null;
                }
                arrayList.add(parseMesh);
            }
            parsableByteArray.setPosition(readInt);
            position = readInt;
        }
        return arrayList;
    }
}
