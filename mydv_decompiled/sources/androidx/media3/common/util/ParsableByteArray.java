package androidx.media3.common.util;

import android.app.ActivityManager;
import android.os.Build;
import com.google.errorprone.annotations.CheckReturnValue;
import defpackage.a5;
import defpackage.b13;
import defpackage.hc4;
import defpackage.hf1;
import defpackage.j42;
import defpackage.kb4;
import defpackage.mm0;
import defpackage.pn1;
import defpackage.qz;
import defpackage.r7;
import defpackage.sp0;
import defpackage.sy1;
import defpackage.zy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@CheckReturnValue
/* loaded from: classes.dex */
public final class ParsableByteArray {
    public static final int INVALID_CODE_POINT = 1114112;
    private byte[] data;
    private int limit;
    private int position;
    private static final char[] CR_AND_LF = {'\r', '\n'};
    private static final char[] LF = {'\n'};
    private static final sy1 SUPPORTED_CHARSETS_FOR_READLINE = sy1.n(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private static final AtomicReference<Boolean> shouldEnforceLimitOnLegacyMethods = new AtomicReference<>();

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class IsRunningInTestHolder {
        static final boolean IS_RUNNING_IN_TEST = ParsableByteArray.isRunningInTest();

        private IsRunningInTestHolder() {
        }
    }

    public ParsableByteArray(int i) {
        this.data = new byte[i];
        this.limit = i;
    }

    private static int decodeUtf8CodeUnit(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return sp0.M((byte) 0, kb4.k(((i & 7) << 2) | ((i2 & 48) >> 4)), kb4.k(((((byte) i2) & 15) << 4) | ((b & 60) >> 2)), kb4.k(((b & 3) << 6) | (((byte) i4) & 63)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int findNextLineTerminator(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L33
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L11
            goto L33
        L11:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L31
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L31
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L2a
            goto L31
        L2a:
            java.lang.String r4 = "Unsupported charset: "
            defpackage.hn3.i(r5, r4)
            r4 = 0
            return r4
        L31:
            r0 = 2
            goto L34
        L33:
            r0 = 1
        L34:
            int r1 = r4.position
        L36:
            int r2 = r4.limit
            int r3 = r0 + (-1)
            int r3 = r2 - r3
            if (r1 >= r3) goto L95
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L4e
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L59
        L4e:
            byte[] r2 = r4.data
            r2 = r2[r1]
            boolean r2 = androidx.media3.common.util.Util.isLinebreak(r2)
            if (r2 == 0) goto L59
            goto L92
        L59:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L69
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L7a
        L69:
            byte[] r2 = r4.data
            r3 = r2[r1]
            if (r3 != 0) goto L7a
            int r3 = r1 + 1
            r2 = r2[r3]
            boolean r2 = androidx.media3.common.util.Util.isLinebreak(r2)
            if (r2 == 0) goto L7a
            goto L92
        L7a:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L93
            byte[] r2 = r4.data
            int r3 = r1 + 1
            r3 = r2[r3]
            if (r3 != 0) goto L93
            r2 = r2[r1]
            boolean r2 = androidx.media3.common.util.Util.isLinebreak(r2)
            if (r2 == 0) goto L93
        L92:
            return r1
        L93:
            int r1 = r1 + r0
            goto L36
        L95:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.ParsableByteArray.findNextLineTerminator(java.nio.charset.Charset):int");
    }

    private static int getSmallestCodeUnitSize(Charset charset) {
        sp0.s(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isRunningInTest() {
        if (j42.w("robolectric", Build.FINGERPRINT)) {
            return true;
        }
        ClassLoader classLoader = ParsableByteArray.class.getClassLoader();
        return !(classLoader == null || (classLoader.getResource("androidx/test/espresso/Espresso.class") == null && classLoader.getResource("org/junit/runner/Runner.class") == null && classLoader.getResource("androidx/test/platform/app/InstrumentationRegistry.class") == null)) || ActivityManager.isRunningInTestHarness();
    }

    private static boolean isUtf8ContinuationByte(byte b) {
        return (b & 192) == 128;
    }

    private void maybeAssertAtLeastBytesLeftForLegacyMethod(int i, pn1 pn1Var) {
        Boolean bool = shouldEnforceLimitOnLegacyMethods.get();
        if (!(bool != null ? bool.booleanValue() : IsRunningInTestHolder.IS_RUNNING_IN_TEST) || bytesLeft() >= i) {
            return;
        }
        StringBuilder C = hf1.C("bytesNeeded= ", i, ", bytesLeft=");
        C.append(bytesLeft());
        throw ((RuntimeException) pn1Var.apply(C.toString()));
    }

    private int peekCodePointAndSize(Charset charset) {
        int i;
        sp0.s(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: %s", charset);
        if (bytesLeft() < getSmallestCodeUnitSize(charset)) {
            b13.h(this.position, this.limit);
            return 0;
        }
        byte b = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b2 = this.data[this.position];
            if ((b2 & 128) == 0) {
                i = kb4.i0(b2);
                return (i << 8) | b;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte peekUtf8CodeUnitSize = peekUtf8CodeUnitSize();
            if (peekUtf8CodeUnitSize == 1) {
                i = kb4.i0(this.data[this.position]);
            } else if (peekUtf8CodeUnitSize == 2) {
                byte[] bArr = this.data;
                int i2 = this.position;
                i = decodeUtf8CodeUnit(0, 0, bArr[i2], bArr[i2 + 1]);
            } else {
                if (peekUtf8CodeUnitSize != 3) {
                    if (peekUtf8CodeUnitSize == 4) {
                        byte[] bArr2 = this.data;
                        int i3 = this.position;
                        i = decodeUtf8CodeUnit(bArr2[i3], bArr2[i3 + 1], bArr2[i3 + 2], bArr2[i3 + 3]);
                    }
                    return 0;
                }
                byte[] bArr3 = this.data;
                int i4 = this.position;
                i = decodeUtf8CodeUnit(0, bArr3[i4] & 15, bArr3[i4 + 1], bArr3[i4 + 2]);
            }
            b = peekUtf8CodeUnitSize;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char peekChar = peekChar(byteOrder, 0);
            if (!Character.isHighSurrogate(peekChar) || bytesLeft() < 4) {
                i = peekChar;
                b = 2;
            } else {
                i = Character.toCodePoint(peekChar, peekChar(byteOrder, 2));
                b = 4;
            }
        }
        return (i << 8) | b;
    }

    private byte peekUtf8CodeUnitSize() {
        byte b = this.data[this.position];
        if ((b & 128) == 0) {
            return (byte) 1;
        }
        if ((b & 224) == 192 && bytesLeft() >= 2 && isUtf8ContinuationByte(this.data[this.position + 1])) {
            return (byte) 2;
        }
        if ((this.data[this.position] & 240) == 224 && bytesLeft() >= 3 && isUtf8ContinuationByte(this.data[this.position + 1]) && isUtf8ContinuationByte(this.data[this.position + 2])) {
            return (byte) 3;
        }
        return ((this.data[this.position] & 248) == 240 && bytesLeft() >= 4 && isUtf8ContinuationByte(this.data[this.position + 1]) && isUtf8ContinuationByte(this.data[this.position + 2]) && isUtf8ContinuationByte(this.data[this.position + 3])) ? (byte) 4 : (byte) 0;
    }

    private char readCharacterIfInList(Charset charset, char[] cArr) {
        int peekCodePointAndSize;
        if (bytesLeft() < getSmallestCodeUnitSize(charset) || (peekCodePointAndSize = peekCodePointAndSize(charset)) == 0) {
            return (char) 0;
        }
        int k = hc4.k(peekCodePointAndSize >>> 8);
        if (Character.isSupplementaryCodePoint(k)) {
            return (char) 0;
        }
        char q = a5.q(k);
        if (!a5.r(cArr, q)) {
            return (char) 0;
        }
        this.position = sp0.B(peekCodePointAndSize & 255) + this.position;
        return q;
    }

    public static void setShouldEnforceLimitOnLegacyMethods(Boolean bool) {
        shouldEnforceLimitOnLegacyMethods.set(bool);
    }

    private void skipLineTerminator(Charset charset) {
        if (readCharacterIfInList(charset, CR_AND_LF) == '\r') {
            readCharacterIfInList(charset, LF);
        }
    }

    public int bytesLeft() {
        return Math.max(this.limit - this.position, 0);
    }

    public int capacity() {
        return this.data.length;
    }

    public void ensureCapacity(int i) {
        if (i > capacity()) {
            this.data = Arrays.copyOf(this.data, i);
        }
    }

    public byte[] getData() {
        return this.data;
    }

    public int getPosition() {
        return this.position;
    }

    public int limit() {
        return this.limit;
    }

    @Deprecated
    public char peekChar(Charset charset) {
        int peekUnsignedByte;
        sp0.s(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: %s", charset);
        if (bytesLeft() != 0) {
            if (charset.equals(StandardCharsets.US_ASCII)) {
                peekUnsignedByte = peekUnsignedByte();
            } else if (charset.equals(StandardCharsets.UTF_8)) {
                if ((this.data[this.position] & 128) == 0) {
                    peekUnsignedByte = peekUnsignedByte();
                }
            } else if (bytesLeft() >= 2) {
                return peekChar(charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN, 0);
            }
            return (char) peekUnsignedByte;
        }
        return (char) 0;
    }

    public int peekCodePoint(Charset charset) {
        return peekCodePointAndSize(charset) != 0 ? sp0.B(r0 >>> 8) : INVALID_CODE_POINT;
    }

    public int peekInt() {
        if (bytesLeft() < 4) {
            b13.h(this.position, this.limit);
            return 0;
        }
        int readInt = readInt();
        this.position -= 4;
        return readInt;
    }

    public int peekUnsignedByte() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(1);
        return this.data[this.position] & 255;
    }

    public int peekUnsignedInt24() {
        if (bytesLeft() < 3) {
            b13.h(this.position, this.limit);
            return 0;
        }
        int readUnsignedInt24 = readUnsignedInt24();
        this.position -= 3;
        return readUnsignedInt24;
    }

    public void readBytes(byte[] bArr, int i, int i2) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(i2);
        System.arraycopy(this.data, this.position, bArr, i, i2);
        this.position += i2;
    }

    public String readDelimiterTerminatedString(char c) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i = this.position;
        while (i < this.limit && this.data[i] != c) {
            i++;
        }
        byte[] bArr = this.data;
        int i2 = this.position;
        String fromUtf8Bytes = Util.fromUtf8Bytes(bArr, i2, i - i2);
        this.position = i;
        if (i < this.limit) {
            this.position = i + 1;
        }
        return fromUtf8Bytes;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public int readInt() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.position = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.position = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.position = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    public int readInt24() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(3);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        int i4 = i + 2;
        this.position = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.position = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public String readLine(Charset charset) {
        sp0.s(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: %s", charset);
        if (bytesLeft() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            readUtfCharsetFromBom();
        }
        String readString = readString(findNextLineTerminator(charset) - this.position, charset);
        if (this.position == this.limit) {
            return readString;
        }
        skipLineTerminator(charset);
        return readString;
    }

    public int readLittleEndianInt() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.position = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.position = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.position = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public int readLittleEndianInt24() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(3);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.position = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.position = i + 3;
        return ((bArr[i4] & 255) << 16) | i5;
    }

    public long readLittleEndianLong() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(8);
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        this.position = i + 2;
        long j = (bArr[i] & 255) | ((bArr[r3] & 255) << 8);
        this.position = i + 3;
        long j2 = j | ((bArr[r8] & 255) << 16);
        this.position = i + 4;
        long j3 = j2 | ((bArr[r3] & 255) << 24);
        this.position = i + 5;
        long j4 = j3 | ((bArr[r8] & 255) << 32);
        this.position = i + 6;
        long j5 = j4 | ((bArr[r3] & 255) << 40);
        this.position = i + 7;
        long j6 = j5 | ((bArr[r8] & 255) << 48);
        this.position = i + 8;
        return ((bArr[r3] & 255) << 56) | j6;
    }

    public short readLittleEndianShort() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & 255;
        this.position = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public long readLittleEndianUnsignedInt() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        this.position = i + 2;
        long j = (bArr[i] & 255) | ((bArr[r3] & 255) << 8);
        this.position = i + 3;
        long j2 = j | ((bArr[r8] & 255) << 16);
        this.position = i + 4;
        return ((bArr[r3] & 255) << 24) | j2;
    }

    public int readLittleEndianUnsignedInt24() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(3);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.position = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.position = i + 3;
        return ((bArr[i4] & 255) << 16) | i5;
    }

    public int readLittleEndianUnsignedIntToInt() {
        int readLittleEndianInt = readLittleEndianInt();
        if (readLittleEndianInt >= 0) {
            return readLittleEndianInt;
        }
        zy.i(hf1.u(readLittleEndianInt, "Top bit not zero: "));
        return 0;
    }

    public int readLittleEndianUnsignedShort() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & 255;
        this.position = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public long readLong() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(8);
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        this.position = i + 2;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r3] & 255) << 48);
        this.position = i + 3;
        long j2 = j | ((bArr[r8] & 255) << 40);
        this.position = i + 4;
        long j3 = j2 | ((bArr[r3] & 255) << 32);
        this.position = i + 5;
        long j4 = j3 | ((bArr[r8] & 255) << 24);
        this.position = i + 6;
        long j5 = j4 | ((bArr[r3] & 255) << 16);
        this.position = i + 7;
        long j6 = j5 | ((bArr[r8] & 255) << 8);
        this.position = i + 8;
        return (bArr[r3] & 255) | j6;
    }

    public String readNullTerminatedString(int i) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(i, new mm0((byte) 17));
        if (i == 0) {
            return "";
        }
        int i2 = this.position;
        int i3 = (i2 + i) - 1;
        String fromUtf8Bytes = Util.fromUtf8Bytes(this.data, i2, (i3 >= this.limit || this.data[i3] != 0) ? i : i - 1);
        this.position += i;
        return fromUtf8Bytes;
    }

    public short readShort() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.position = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public String readString(int i, Charset charset) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(i, new mm0((byte) 17));
        String str = new String(this.data, this.position, i, charset);
        this.position += i;
        return str;
    }

    public int readSynchSafeInt() {
        return readUnsignedByte() | (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7);
    }

    public int readUnsignedByte() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(1);
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] & 255;
    }

    public int readUnsignedFixedPoint1616() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.position = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.position = i + 4;
        return i4;
    }

    public long readUnsignedInt() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        this.position = i + 2;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r3] & 255) << 16);
        this.position = i + 3;
        long j2 = j | ((bArr[r8] & 255) << 8);
        this.position = i + 4;
        return (bArr[r3] & 255) | j2;
    }

    public int readUnsignedInt24() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(3);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.position = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.position = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public int readUnsignedIntToInt() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        zy.i(hf1.u(readInt, "Top bit not zero: "));
        return 0;
    }

    public int readUnsignedLeb128ToInt() {
        return sp0.B(readUnsignedLeb128ToLong());
    }

    public long readUnsignedLeb128ToLong() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.position == this.limit) {
                zy.i("Attempting to read a byte over the limit.");
                return 0L;
            }
            long readUnsignedByte = readUnsignedByte();
            j |= (127 & readUnsignedByte) << (i * 7);
            if ((readUnsignedByte & 128) == 0) {
                return j;
            }
        }
        return j;
    }

    public long readUnsignedLongToLong() {
        long readLong = readLong();
        if (readLong >= 0) {
            return readLong;
        }
        zy.i(r7.A("Top bit not zero: ", readLong));
        return 0L;
    }

    public int readUnsignedShort() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.position = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public long readUtf8EncodedLong() {
        int i;
        maybeAssertAtLeastBytesLeftForLegacyMethod(1);
        long j = this.data[this.position];
        int i2 = 7;
        while (true) {
            if (i2 < 0) {
                break;
            }
            if (((1 << i2) & j) != 0) {
                i2--;
            } else if (i2 < 6) {
                j &= r6 - 1;
                i = 7 - i2;
            } else if (i2 == 7) {
                i = 1;
            }
        }
        i = 0;
        if (i == 0) {
            throw new NumberFormatException(r7.A("Invalid UTF-8 sequence first byte: ", j));
        }
        maybeAssertAtLeastBytesLeftForLegacyMethod(i);
        for (int i3 = 1; i3 < i; i3++) {
            if ((this.data[this.position + i3] & 192) != 128) {
                throw new NumberFormatException(r7.A("Invalid UTF-8 sequence continuation byte: ", j));
            }
            j = (j << 6) | (r4 & 63);
        }
        this.position += i;
        return j;
    }

    public Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.data;
            int i = this.position;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.position = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (bytesLeft() < 2) {
            return null;
        }
        byte[] bArr2 = this.data;
        int i2 = this.position;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.position = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.position = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public void reset(int i) {
        reset(capacity() < i ? new byte[i] : this.data, i);
    }

    public void setLimit(int i) {
        sp0.o(i >= 0 && i <= this.data.length);
        this.limit = i;
    }

    public void setPosition(int i) {
        sp0.o(i >= 0 && i <= this.limit);
        this.position = i;
    }

    public void skipBytes(int i) {
        setPosition(this.position + i);
    }

    public void skipLeb128() {
        while ((readUnsignedByte() & 128) != 0) {
        }
    }

    public ParsableByteArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public ParsableByteArray(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public void readBytes(ParsableBitArray parsableBitArray, int i) {
        readBytes(parsableBitArray.data, 0, i);
        parsableBitArray.setPosition(0);
    }

    public void reset(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
        this.position = 0;
    }

    public void readBytes(ByteBuffer byteBuffer, int i) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(i);
        byteBuffer.put(this.data, this.position, i);
        this.position += i;
    }

    public String readString(int i) {
        return readString(i, StandardCharsets.UTF_8);
    }

    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public String readLine() {
        return readLine(StandardCharsets.UTF_8);
    }

    private void maybeAssertAtLeastBytesLeftForLegacyMethod(int i) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(i, new qz((byte) 3));
    }

    public char peekChar() {
        return peekChar(ByteOrder.BIG_ENDIAN, 0);
    }

    private char peekChar(ByteOrder byteOrder, int i) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.data;
        if (byteOrder == byteOrder2) {
            int i2 = this.position;
            return a5.y(bArr[i2 + i], bArr[i2 + i + 1]);
        }
        int i3 = this.position;
        return a5.y(bArr[i3 + i + 1], bArr[i3 + i]);
    }
}
