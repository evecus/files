package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class g45 {
    public final oj a;
    public final long b;
    public final u55 c;
    public final td3 d;
    public final c65 e;
    public long f;
    public final oj g;
    public final d55 h;
    public final v55 i;

    public g45(d55 d55Var, td3 td3Var, v55 v55Var, c65 c65Var) {
        oj ojVar = d55Var.a;
        long j = d55Var.b;
        u55 u55Var = v55Var != null ? v55Var.a : null;
        this.a = ojVar;
        this.b = j;
        this.c = u55Var;
        this.d = td3Var;
        this.e = c65Var;
        this.f = j;
        this.g = ojVar;
        this.h = d55Var;
        this.i = v55Var;
    }

    public final List a(tm1 tm1Var) {
        if (!d65.c(this.f)) {
            return p70.k0(new eb0("", 0), new uk4(d65.f(this.f), d65.f(this.f)));
        }
        c71 c71Var = (c71) tm1Var.invoke(this);
        if (c71Var != null) {
            return p70.j0(c71Var);
        }
        return null;
    }

    public final Integer b() {
        u55 u55Var = this.c;
        if (u55Var == null) {
            return null;
        }
        w23 w23Var = u55Var.b;
        int e = d65.e(this.f);
        td3 td3Var = this.d;
        return Integer.valueOf(td3Var.c(w23Var.c(w23Var.d(td3Var.k(e)), true)));
    }

    public final Integer c() {
        u55 u55Var = this.c;
        if (u55Var == null) {
            return null;
        }
        int f = d65.f(this.f);
        td3 td3Var = this.d;
        return Integer.valueOf(td3Var.c(u55Var.h(u55Var.b.d(td3Var.k(f)))));
    }

    public final Integer d() {
        int length;
        u55 u55Var = this.c;
        if (u55Var == null) {
            return null;
        }
        int r = r();
        while (true) {
            oj ojVar = this.a;
            if (r < ojVar.J.length()) {
                int length2 = this.g.J.length() - 1;
                if (r <= length2) {
                    length2 = r;
                }
                long k = u55Var.k(length2);
                int i = d65.c;
                int i2 = (int) (k & 4294967295L);
                if (i2 > r) {
                    length = this.d.c(i2);
                    break;
                }
                r++;
            } else {
                length = ojVar.J.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int i;
        u55 u55Var = this.c;
        if (u55Var == null) {
            return null;
        }
        int r = r();
        while (true) {
            if (r <= 0) {
                i = 0;
                break;
            }
            int length = this.g.J.length() - 1;
            if (r <= length) {
                length = r;
            }
            long k = u55Var.k(length);
            int i2 = d65.c;
            int i3 = (int) (k >> 32);
            if (i3 < r) {
                i = this.d.c(i3);
                break;
            }
            r--;
        }
        return Integer.valueOf(i);
    }

    public final boolean f() {
        u55 u55Var = this.c;
        return (u55Var != null ? u55Var.i(r()) : null) != s44.J;
    }

    public final int g(u55 u55Var, int i) {
        int r = r();
        c65 c65Var = this.e;
        if (c65Var.a == null) {
            c65Var.a = Float.valueOf(u55Var.c(r).a);
        }
        w23 w23Var = u55Var.b;
        int d = w23Var.d(r) + i;
        if (d < 0) {
            return 0;
        }
        if (d >= w23Var.f) {
            return this.g.J.length();
        }
        float b = w23Var.b(d) - 1.0f;
        Float f = c65Var.a;
        f.getClass();
        float floatValue = f.floatValue();
        if ((f() && floatValue >= u55Var.g(d)) || (!f() && floatValue <= u55Var.f(d))) {
            return w23Var.c(d, true);
        }
        return this.d.c(w23Var.g((Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r9 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(defpackage.v55 r9, int r10) {
        /*
            r8 = this;
            ca2 r0 = r9.b
            u55 r1 = r9.a
            if (r0 == 0) goto L13
            ca2 r9 = r9.c
            if (r9 == 0) goto L10
            r2 = 1
            m14 r9 = r9.J(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            m14 r9 = defpackage.m14.e
        L15:
            d55 r0 = r8.h
            long r2 = r0.b
            int r0 = defpackage.d65.c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            td3 r8 = r8.d
            int r0 = r8.k(r0)
            m14 r0 = r1.c(r0)
            float r2 = r0.a
            float r0 = r0.b
            long r6 = r9.c()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r2 = r2 << r0
            long r9 = r9 & r4
            long r9 = r9 | r2
            w23 r0 = r1.b
            int r9 = r0.g(r9)
            int r8 = r8.c(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g45.h(v55, int):int");
    }

    public final void i() {
        c65 c65Var = this.e;
        c65Var.a = null;
        oj ojVar = this.g;
        if (ojVar.J.length() > 0) {
            if (f()) {
                k();
                return;
            }
            c65Var.a = null;
            if (ojVar.J.length() > 0) {
                String str = ojVar.J;
                long j = this.f;
                int i = d65.c;
                int y = hc4.y((int) (j & 4294967295L), str);
                if (y != -1) {
                    q(y, y);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        oj ojVar = this.g;
        String str = ojVar.J;
        String str2 = ojVar.J;
        if (str.length() > 0) {
            int s = kb4.s(str2, d65.e(this.f));
            if (s == d65.e(this.f) && s != str2.length()) {
                s = kb4.s(str2, s + 1);
            }
            q(s, s);
        }
    }

    public final void k() {
        this.e.a = null;
        oj ojVar = this.g;
        if (ojVar.J.length() > 0) {
            String str = ojVar.J;
            long j = this.f;
            int i = d65.c;
            int z = hc4.z((int) (j & 4294967295L), str);
            if (z != -1) {
                q(z, z);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        oj ojVar = this.g;
        String str = ojVar.J;
        String str2 = ojVar.J;
        if (str.length() > 0) {
            int t = kb4.t(str2, d65.f(this.f));
            if (t == d65.f(this.f) && t != 0) {
                t = kb4.t(str2, t - 1);
            }
            q(t, t);
        }
    }

    public final void m() {
        c65 c65Var = this.e;
        c65Var.a = null;
        oj ojVar = this.g;
        if (ojVar.J.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            c65Var.a = null;
            if (ojVar.J.length() > 0) {
                String str = ojVar.J;
                long j = this.f;
                int i = d65.c;
                int y = hc4.y((int) (j & 4294967295L), str);
                if (y != -1) {
                    q(y, y);
                }
            }
        }
    }

    public final void n() {
        Integer b;
        this.e.a = null;
        if (this.g.J.length() <= 0 || (b = b()) == null) {
            return;
        }
        int intValue = b.intValue();
        q(intValue, intValue);
    }

    public final void o() {
        Integer c;
        this.e.a = null;
        if (this.g.J.length() <= 0 || (c = c()) == null) {
            return;
        }
        int intValue = c.intValue();
        q(intValue, intValue);
    }

    public final void p() {
        if (this.g.J.length() > 0) {
            int i = d65.c;
            this.f = ui4.c((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = ui4.c(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = d65.c;
        return this.d.k((int) (j & 4294967295L));
    }
}
