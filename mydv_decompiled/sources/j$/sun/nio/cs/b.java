package j$.sun.nio.cs;

import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class b extends CharsetEncoder {
    public final e a;

    public b(c cVar) {
        super(cVar, 1.0f, 1.0f);
        e eVar = new e();
        eVar.a = CoderResult.UNDERFLOW;
        this.a = eVar;
    }

    public static int a(char[] cArr, int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        if (i3 <= 0) {
            return 0;
        }
        Objects.requireNonNull(cArr);
        Objects.requireNonNull(bArr);
        if (i < 0 || i >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        if (i2 < 0 || i2 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i2);
        }
        int i5 = (i + i3) - 1;
        if (i5 < 0 || i5 >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i5);
        }
        int i6 = (i2 + i3) - 1;
        if (i6 < 0 || i6 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i6);
        }
        while (i4 < i3) {
            int i7 = i + 1;
            char c = cArr[i];
            if (c > 255) {
                break;
            }
            bArr[i2] = (byte) c;
            i4++;
            i = i7;
            i2++;
        }
        return i4;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c) {
        return c <= 255;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        int i = 2;
        if (!charBuffer.hasArray() || !byteBuffer.hasArray()) {
            int position = charBuffer.position();
            while (charBuffer.hasRemaining()) {
                try {
                    char c = charBuffer.get();
                    if (c > 255) {
                        int a = this.a.a(c, charBuffer);
                        e eVar = this.a;
                        if (a < 0) {
                            return eVar.a;
                        }
                        if (!eVar.b) {
                            i = 1;
                        }
                        return CoderResult.unmappableForLength(i);
                    }
                    if (!byteBuffer.hasRemaining()) {
                        return CoderResult.OVERFLOW;
                    }
                    byteBuffer.put((byte) c);
                    position++;
                } finally {
                }
            }
            return CoderResult.UNDERFLOW;
        }
        char[] array = charBuffer.array();
        int arrayOffset = charBuffer.arrayOffset();
        int position2 = charBuffer.position() + arrayOffset;
        int limit = charBuffer.limit() + arrayOffset;
        if (position2 > limit) {
            position2 = limit;
        }
        byte[] array2 = byteBuffer.array();
        int arrayOffset2 = byteBuffer.arrayOffset();
        int position3 = byteBuffer.position() + arrayOffset2;
        int limit2 = byteBuffer.limit() + arrayOffset2;
        if (position3 > limit2) {
            position3 = limit2;
        }
        int i2 = limit2 - position3;
        int i3 = limit - position2;
        if (i2 >= i3) {
            i2 = i3;
        }
        try {
            int a2 = a(array, position2, array2, position3, i2);
            int i4 = position2 + a2;
            int i5 = position3 + a2;
            if (a2 == i2) {
                if (i2 < i3) {
                    CoderResult coderResult = CoderResult.OVERFLOW;
                    return coderResult;
                }
                CoderResult coderResult2 = CoderResult.UNDERFLOW;
                return coderResult2;
            }
            int b = this.a.b(array[i4], array, i4, limit);
            e eVar2 = this.a;
            if (b < 0) {
                CoderResult coderResult3 = eVar2.a;
                return coderResult3;
            }
            if (!eVar2.b) {
                i = 1;
            }
            CoderResult unmappableForLength = CoderResult.unmappableForLength(i);
            return unmappableForLength;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean isLegalReplacement(byte[] bArr) {
        return true;
    }
}
