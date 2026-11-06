package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class e5 extends b5 {
    public static e5 e;
    public static final s44 f = s44.J;
    public static final s44 g = s44.I;
    public u55 c;
    public si4 d;

    @Override // defpackage.g5
    public final int[] b(int i) {
        int i2;
        if (i().length() <= 0 || i >= i().length()) {
            return null;
        }
        try {
            si4 si4Var = this.d;
            if (si4Var == null) {
                j42.g0("node");
                throw null;
            }
            m14 g2 = si4Var.g();
            int round = Math.round(g2.d - g2.b);
            if (i <= 0) {
                i = 0;
            }
            u55 u55Var = this.c;
            if (u55Var == null) {
                j42.g0("layoutResult");
                throw null;
            }
            int d = u55Var.b.d(i);
            u55 u55Var2 = this.c;
            if (u55Var2 == null) {
                j42.g0("layoutResult");
                throw null;
            }
            float f2 = u55Var2.b.f(d) + round;
            u55 u55Var3 = this.c;
            if (u55Var3 == null) {
                j42.g0("layoutResult");
                throw null;
            }
            if (u55Var3 == null) {
                j42.g0("layoutResult");
                throw null;
            }
            float f3 = u55Var3.b.f(r0.f - 1);
            u55 u55Var4 = this.c;
            if (f2 < f3) {
                if (u55Var4 == null) {
                    j42.g0("layoutResult");
                    throw null;
                }
                i2 = u55Var4.b.e(f2);
            } else {
                if (u55Var4 == null) {
                    j42.g0("layoutResult");
                    throw null;
                }
                i2 = u55Var4.b.f;
            }
            return h(i, m(i2 - 1, g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // defpackage.g5
    public final int[] d(int i) {
        int i2;
        if (i().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            si4 si4Var = this.d;
            if (si4Var == null) {
                j42.g0("node");
                throw null;
            }
            m14 g2 = si4Var.g();
            int round = Math.round(g2.d - g2.b);
            int length = i().length();
            if (length <= i) {
                i = length;
            }
            u55 u55Var = this.c;
            if (u55Var == null) {
                j42.g0("layoutResult");
                throw null;
            }
            int d = u55Var.b.d(i);
            u55 u55Var2 = this.c;
            if (u55Var2 == null) {
                j42.g0("layoutResult");
                throw null;
            }
            float f2 = u55Var2.b.f(d) - round;
            if (f2 > 0.0f) {
                u55 u55Var3 = this.c;
                if (u55Var3 == null) {
                    j42.g0("layoutResult");
                    throw null;
                }
                i2 = u55Var3.b.e(f2);
            } else {
                i2 = 0;
            }
            if (i == i().length() && i2 < d) {
                i2++;
            }
            return h(m(i2, f), i);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int m(int i, s44 s44Var) {
        u55 u55Var = this.c;
        if (u55Var == null) {
            j42.g0("layoutResult");
            throw null;
        }
        int h = u55Var.h(i);
        u55 u55Var2 = this.c;
        if (u55Var2 == null) {
            j42.g0("layoutResult");
            throw null;
        }
        s44 i2 = u55Var2.i(h);
        u55 u55Var3 = this.c;
        if (s44Var != i2) {
            if (u55Var3 != null) {
                return u55Var3.h(i);
            }
            j42.g0("layoutResult");
            throw null;
        }
        if (u55Var3 != null) {
            return u55Var3.b.c(i, false) - 1;
        }
        j42.g0("layoutResult");
        throw null;
    }

    public final void n(String str, u55 u55Var, si4 si4Var) {
        this.a = str;
        this.c = u55Var;
        this.d = si4Var;
    }
}
