package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.Mp4Box;
import defpackage.r7;
import java.nio.ByteBuffer;
import java.util.UUID;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class PsshAtomUtil {
    private static final String TAG = "PsshAtomUtil";

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class PsshAtom {
        public final UUID[] keyIds;
        public final byte[] schemeData;
        public final UUID uuid;
        public final int version;

        public PsshAtom(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
            this.uuid = uuid;
            this.version = i;
            this.schemeData = bArr;
            this.keyIds = uuidArr;
        }
    }

    private PsshAtomUtil() {
    }

    public static byte[] buildPsshAtom(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(Mp4Box.TYPE_pssh);
        allocate.putInt(uuidArr != null ? Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean isPsshAtom(byte[] bArr) {
        return parsePsshAtom(bArr) != null;
    }

    public static PsshAtom parsePsshAtom(byte[] bArr) {
        UUID[] uuidArr;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        if (parsableByteArray.limit() < 32) {
            return null;
        }
        parsableByteArray.setPosition(0);
        int bytesLeft = parsableByteArray.bytesLeft();
        int readInt = parsableByteArray.readInt();
        if (readInt != bytesLeft) {
            Log.w(TAG, "Advertised atom size (" + readInt + ") does not match buffer size: " + bytesLeft);
            return null;
        }
        int readInt2 = parsableByteArray.readInt();
        if (readInt2 != 1886614376) {
            r7.L("Atom type is not pssh: ", readInt2, TAG);
            return null;
        }
        int parseFullBoxVersion = BoxParser.parseFullBoxVersion(parsableByteArray.readInt());
        if (parseFullBoxVersion > 1) {
            r7.L("Unsupported pssh version: ", parseFullBoxVersion, TAG);
            return null;
        }
        UUID uuid = new UUID(parsableByteArray.readLong(), parsableByteArray.readLong());
        if (parseFullBoxVersion == 1) {
            int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            uuidArr = new UUID[readUnsignedIntToInt];
            for (int i = 0; i < readUnsignedIntToInt; i++) {
                uuidArr[i] = new UUID(parsableByteArray.readLong(), parsableByteArray.readLong());
            }
        } else {
            uuidArr = null;
        }
        int readUnsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
        int bytesLeft2 = parsableByteArray.bytesLeft();
        if (readUnsignedIntToInt2 == bytesLeft2) {
            byte[] bArr2 = new byte[readUnsignedIntToInt2];
            parsableByteArray.readBytes(bArr2, 0, readUnsignedIntToInt2);
            return new PsshAtom(uuid, parseFullBoxVersion, bArr2, uuidArr);
        }
        Log.w(TAG, "Atom data size (" + readUnsignedIntToInt2 + ") does not match the bytes left: " + bytesLeft2);
        return null;
    }

    public static byte[] parseSchemeSpecificData(byte[] bArr, UUID uuid) {
        PsshAtom parsePsshAtom = parsePsshAtom(bArr);
        if (parsePsshAtom == null) {
            return null;
        }
        if (uuid.equals(parsePsshAtom.uuid)) {
            return parsePsshAtom.schemeData;
        }
        Log.w(TAG, "UUID mismatch. Expected: " + uuid + ", got: " + parsePsshAtom.uuid + ".");
        return null;
    }

    public static UUID parseUuid(byte[] bArr) {
        PsshAtom parsePsshAtom = parsePsshAtom(bArr);
        if (parsePsshAtom == null) {
            return null;
        }
        return parsePsshAtom.uuid;
    }

    public static int parseVersion(byte[] bArr) {
        PsshAtom parsePsshAtom = parsePsshAtom(bArr);
        if (parsePsshAtom == null) {
            return -1;
        }
        return parsePsshAtom.version;
    }

    public static byte[] buildPsshAtom(UUID uuid, byte[] bArr) {
        return buildPsshAtom(uuid, null, bArr);
    }
}
