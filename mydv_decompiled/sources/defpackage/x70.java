package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class x70 {
    public static final long b = qb.j(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final long a;

    static {
        qb.j(4282664004L);
        qb.j(4287137928L);
        qb.j(4291611852L);
        c = qb.j(4294967295L);
        d = qb.j(4294901760L);
        qb.j(4278255360L);
        e = qb.j(4278190335L);
        qb.j(4294967040L);
        qb.j(4278255615L);
        qb.j(4294902015L);
        f = qb.i(0);
        float[] fArr = z80.a;
        g = qb.h(0.0f, 0.0f, 0.0f, 0.0f, z80.u);
    }

    public /* synthetic */ x70(long j) {
        this.a = j;
    }

    public static final /* synthetic */ x70 a(long j) {
        return new x70(j);
    }

    public static final long b(long j, v80 v80Var) {
        jg0 jg0Var;
        v80 f2 = f(j);
        int i = f2.c;
        int i2 = v80Var.c;
        if ((i | i2) < 0) {
            jg0Var = i42.p0(f2, v80Var);
        } else {
            q33 q33Var = kg0.a;
            int i3 = i | (i2 << 6);
            Object b2 = q33Var.b(i3);
            if (b2 == null) {
                b2 = i42.p0(f2, v80Var);
                q33Var.i(i3, b2);
            }
            jg0Var = (jg0) b2;
        }
        return jg0Var.a(j);
    }

    public static long c(long j, float f2) {
        return qb.h(h(j), g(j), e(j), f2, f(j));
    }

    public static final float d(long j) {
        float s;
        float f2;
        if ((63 & j) == 0) {
            s = (float) li4.s((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            s = (float) li4.s((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return s / f2;
    }

    public static final float e(long j) {
        int i;
        int i2;
        int i3;
        float f2;
        if ((63 & j) == 0) {
            return ((float) li4.s((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608);
                f2 = mf1.a;
                float f3 = intBitsToFloat - f2;
                return i4 == 0 ? f3 : -f3;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final v80 f(long j) {
        float[] fArr = z80.a;
        return z80.y[(int) (j & 63)];
    }

    public static final float g(long j) {
        int i;
        int i2;
        int i3;
        float f2;
        if ((63 & j) == 0) {
            return ((float) li4.s((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608);
                f2 = mf1.a;
                float f3 = intBitsToFloat - f2;
                return i4 == 0 ? f3 : -f3;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float h(long j) {
        int i;
        int i2;
        int i3;
        float f2;
        if ((63 & j) == 0) {
            return ((float) li4.s((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608);
                f2 = mf1.a;
                float f3 = intBitsToFloat - f2;
                return i4 == 0 ? f3 : -f3;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static String i(long j) {
        float h2 = h(j);
        float g2 = g(j);
        float e2 = e(j);
        float d2 = d(j);
        String str = f(j).a;
        StringBuilder B = hf1.B("Color(", h2, ", ", g2, ", ");
        B.append(e2);
        B.append(", ");
        B.append(d2);
        B.append(", ");
        return hf1.z(B, str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x70) {
            return this.a == ((x70) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return i82.Q(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
