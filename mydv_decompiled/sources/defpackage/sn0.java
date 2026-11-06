package defpackage;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class sn0 extends u0 implements b1 {
    public static final y J = new y(sn0.class, (byte) 21);
    public final byte[] I;

    public sn0(byte[] bArr) {
        this.I = bArr;
    }

    @Override // defpackage.b1
    public final String e() {
        String str = ix4.a;
        byte[] bArr = this.I;
        int length = bArr.length;
        char[] cArr = new char[length];
        short[] sArr = kd5.a;
        int i = 0;
        int i2 = 0;
        loop0: while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                short s = kd5.a[b & Byte.MAX_VALUE];
                int i4 = s >>> 8;
                byte b2 = (byte) s;
                while (true) {
                    if (b2 >= 0) {
                        if (i3 >= length) {
                            break loop0;
                        }
                        int i5 = i3 + 1;
                        byte b3 = bArr[i3];
                        i4 = (i4 << 6) | (b3 & 63);
                        b2 = kd5.b[b2 + ((b3 & 255) >>> 4)];
                        i3 = i5;
                    } else if (b2 != -2) {
                        if (i4 <= 65535) {
                            if (i2 < length) {
                                cArr[i2] = (char) i4;
                                i2++;
                                i = i3;
                            }
                        } else if (i2 < length - 1) {
                            int i6 = i2 + 1;
                            cArr[i2] = (char) ((i4 >>> 10) + 55232);
                            i2 += 2;
                            cArr[i6] = (char) ((i4 & AnalyticsListener.EVENT_DRM_KEYS_LOADED) | 56320);
                            i = i3;
                        }
                    }
                }
                i2 = -1;
                break;
            }
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            cArr[i2] = (char) b;
            i = i3;
            i2++;
        }
        if (i2 >= 0) {
            return new String(cArr, 0, i2);
        }
        s83.t("Invalid UTF-8 input");
        return null;
    }

    @Override // defpackage.u0, defpackage.n0
    public final int hashCode() {
        return g4.N(this.I);
    }

    @Override // defpackage.u0
    public final boolean m(u0 u0Var) {
        if (u0Var instanceof sn0) {
            return Arrays.equals(this.I, ((sn0) u0Var).I);
        }
        return false;
    }

    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        uu2Var.P(this.I, 12, z);
    }

    @Override // defpackage.u0
    public final boolean o() {
        return false;
    }

    @Override // defpackage.u0
    public final int q(boolean z) {
        return uu2.z(this.I.length, z);
    }

    public final String toString() {
        return e();
    }
}
