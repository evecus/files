package defpackage;

import androidx.media3.common.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class c70 {
    public int a;
    public final byte[] c;
    public final int d;
    public int e;
    public int g;
    public final byte b = 100;
    public int h = Log.LOG_LEVEL_OFF;
    public int f = 0;

    public c70(byte[] bArr, int i) {
        this.c = bArr;
        this.d = i;
        this.e = i;
    }

    public static c70 b(byte[] bArr) {
        int length = bArr.length;
        c70 c70Var = new c70(bArr, length);
        try {
            c70Var.c(length);
            return c70Var;
        } catch (y42 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean a() {
        return this.f == this.e;
    }

    public final void c(int i) {
        if (i < 0) {
            throw new y42("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.f;
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Log.LOG_LEVEL_OFF;
            if (i > Log.LOG_LEVEL_OFF - i2) {
                throw new y42("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
        }
        if (i3 > this.h) {
            throw y42.a();
        }
        this.h = i3;
        int i4 = this.d;
        if (i3 <= i4) {
            this.e = i3;
        } else {
            this.e = i4;
        }
    }

    public final byte[] d() {
        int f = f();
        if (f > 0) {
            int i = this.e;
            int i2 = this.f;
            if (f <= i - i2) {
                int i3 = f + i2;
                this.f = i3;
                return Arrays.copyOfRange(this.c, i2, i3);
            }
        }
        if (f > 0) {
            throw y42.a();
        }
        if (f == 0) {
            return q32.a;
        }
        throw new y42("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final int e() {
        return f();
    }

    public final int f() {
        int i;
        int i2 = this.f;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.c;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f = i5;
                return i;
            }
        }
        return (int) h();
    }

    public final long g() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f;
        int i2 = this.e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.c;
            byte b = bArr[i];
            if (b >= 0) {
                this.f = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j2 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            j6 = j7 ^ (bArr[i8] << 56);
                                            if (j6 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i10 = i + 10;
                                                long j8 = (bArr[i4] << 63) ^ j6;
                                                if (j8 >= 0) {
                                                    j = j8 ^ (-9151873028817141888L);
                                                    i4 = i10;
                                                }
                                            }
                                        }
                                    }
                                }
                                j4 = j3 ^ j7;
                            }
                            j = j2 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f = i4;
                return j;
            }
        }
        return h();
    }

    public final long h() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f;
            if (i2 == this.e) {
                throw y42.a();
            }
            this.f = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.c[i2] & 128) == 0) {
                return j;
            }
        }
        throw new y42("CodedInputStream encountered a malformed varint.");
    }

    public final String i() {
        int f = f();
        if (f > 0) {
            int i = this.e;
            int i2 = this.f;
            if (f <= i - i2) {
                String str = new String(this.c, i2, f, StandardCharsets.UTF_8);
                this.f += f;
                return str;
            }
        }
        if (f == 0) {
            return "";
        }
        if (f < 0) {
            throw new y42("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw y42.a();
    }

    public final int j() {
        if (a()) {
            this.g = 0;
            return 0;
        }
        int e = e();
        this.g = e;
        if ((e >>> 3) != 0) {
            return e;
        }
        throw new y42("Protocol message contained an invalid tag (zero).");
    }

    public final boolean k(int i) {
        boolean k;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.e - this.f;
            byte[] bArr = this.c;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f;
                    this.f = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw new y42("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                int i6 = this.f;
                if (i6 == this.e) {
                    throw y42.a();
                }
                this.f = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw new y42("CodedInputStream encountered a malformed varint.");
        }
        if (i2 == 1) {
            l(8);
            return true;
        }
        if (i2 == 2) {
            l(e());
            return true;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new v42("Protocol message tag had invalid wire type.");
                }
                l(4);
                return true;
            }
            if (this.a != 0 || this.g == 0) {
                return false;
            }
            throw new y42("Protocol message end-group tag did not match expected tag.");
        }
        do {
            int j = j();
            if (j == 0) {
                break;
            }
            int i7 = this.a;
            if (i7 >= this.b) {
                throw new y42("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.a = i7 + 1;
            k = k(j);
            this.a--;
        } while (k);
        if (this.g != (((i >>> 3) << 3) | 4)) {
            throw new y42("Protocol message end-group tag did not match expected tag.");
        }
        return true;
    }

    public final void l(int i) {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = this.f;
            if (i <= i2 - i3) {
                this.f = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw y42.a();
        }
        throw new y42("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
