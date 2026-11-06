package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sa1 extends qa2 implements y92 {
    public ea5 I;
    public y95 J;
    public y95 K;
    public y95 L;
    public ta1 M;
    public bc1 N;
    public on4 O;
    public rm1 P;
    public ca1 Q;
    public long R = -9223372034707292160L;
    public u8 S;
    public final ra1 T;
    public final ra1 U;

    public sa1(ea5 ea5Var, y95 y95Var, y95 y95Var2, y95 y95Var3, ta1 ta1Var, bc1 bc1Var, on4 on4Var, rm1 rm1Var, ca1 ca1Var) {
        this.I = ea5Var;
        this.J = y95Var;
        this.K = y95Var2;
        this.L = y95Var3;
        this.M = ta1Var;
        this.N = bc1Var;
        this.O = on4Var;
        this.P = rm1Var;
        this.Q = ca1Var;
        eh0.b(0, 0, 0, 0, 15);
        this.T = new ra1(this, (byte) 0);
        this.U = new ra1(this, (byte) 1);
    }

    public final u8 getAlignment() {
        u8 u8Var;
        u8 u8Var2;
        if (this.I.g().c(aa1.I, aa1.J)) {
            i20 i20Var = this.M.a.c;
            if (i20Var != null && (u8Var2 = i20Var.a) != null) {
                return u8Var2;
            }
            i20 i20Var2 = this.N.a.c;
            if (i20Var2 != null) {
                return i20Var2.a;
            }
            return null;
        }
        i20 i20Var3 = this.N.a.c;
        if (i20Var3 != null && (u8Var = i20Var3.a) != null) {
            return u8Var;
        }
        i20 i20Var4 = this.M.a.c;
        if (i20Var4 != null) {
            return i20Var4.a;
        }
        return null;
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        char c;
        x95 x95Var;
        x95 x95Var2;
        r95 r95Var;
        x95 x95Var3;
        long j2;
        long j3;
        long j4;
        x95 x95Var4;
        ej ejVar;
        dj djVar;
        float f;
        if (this.I.a.d() == this.I.d.getValue()) {
            this.S = null;
        } else if (this.S == null) {
            u8 alignment = getAlignment();
            if (alignment == null) {
                alignment = q8.J;
            }
            this.S = alignment;
        }
        boolean N = ww2Var.N();
        byte b = 0;
        p91 p91Var = p91.I;
        if (N) {
            bn3 u = pw2Var.u(j);
            long j5 = (u.I << 32) | (u.J & 4294967295L);
            this.R = j5;
            return ww2Var.A((int) (j5 >> 32), (int) (4294967295L & j5), p91Var, new na1(u, (byte) 0));
        }
        byte b2 = 1;
        if (!((Boolean) this.P.invoke()).booleanValue()) {
            bn3 u2 = pw2Var.u(j);
            return ww2Var.A(u2.I, u2.J, p91Var, new na1(u2, (byte) 1));
        }
        ca1 ca1Var = this.Q;
        y95 y95Var = ca1Var.a;
        on4 on4Var = ca1Var.b;
        y95 y95Var2 = ca1Var.c;
        ea5 ea5Var = ca1Var.d;
        ta1 ta1Var = ca1Var.e;
        bc1 bc1Var = ca1Var.f;
        y95 y95Var3 = ca1Var.g;
        if (y95Var != null) {
            c = ' ';
            x95Var = y95Var.a(new ea1(ta1Var, bc1Var, b), on4Var.a() ? Float.valueOf(on4Var.f) : null, null, new nh(ta1Var, bc1Var, on4Var, (byte) 1));
        } else {
            c = ' ';
            x95Var = null;
        }
        if (y95Var2 != null) {
            x31 x31Var = new x31(ta1Var, bc1Var, b2);
            Float valueOf = on4Var.a() ? Float.valueOf(on4Var.g) : null;
            if (on4Var.a()) {
                li5 li5Var = on4Var.j;
                if (li5Var != null) {
                    float b3 = li5Var.b();
                    Float valueOf2 = Float.valueOf(b3);
                    if (Float.isNaN(b3)) {
                        valueOf2 = null;
                    }
                    if (valueOf2 != null) {
                        f = valueOf2.floatValue();
                        djVar = new dj(f);
                    }
                }
                f = 0.0f;
                djVar = new dj(f);
            } else {
                djVar = null;
            }
            x95Var2 = y95Var2.a(x31Var, valueOf, djVar, new ga1(ta1Var, bc1Var, on4Var));
        } else {
            x95Var2 = null;
        }
        if (ea5Var.a.d() == aa1.I) {
            ga4 ga4Var = ta1Var.a.d;
            if (ga4Var != null) {
                r95Var = new r95(ga4Var.b);
            } else {
                ga4 ga4Var2 = bc1Var.a.d;
                if (ga4Var2 != null) {
                    r95Var = new r95(ga4Var2.b);
                }
                r95Var = null;
            }
        } else {
            ga4 ga4Var3 = bc1Var.a.d;
            if (ga4Var3 != null) {
                r95Var = new r95(ga4Var3.b);
            } else {
                ga4 ga4Var4 = ta1Var.a.d;
                if (ga4Var4 != null) {
                    r95Var = new r95(ga4Var4.b);
                }
                r95Var = null;
            }
        }
        if (y95Var3 != null) {
            x95Var3 = y95Var3.a(fh.O, on4Var.a() ? new r95(on4Var.h) : null, null, new ha1(r95Var, ta1Var, bc1Var, on4Var));
        } else {
            x95Var3 = null;
        }
        fa1 fa1Var = new fa1(on4Var, x95Var, x95Var2, x95Var3);
        bn3 u3 = pw2Var.u(j);
        long j6 = (u3.I << c) | (u3.J & 4294967295L);
        long j7 = !z22.b(this.R, -9223372034707292160L) ? this.R : j6;
        y95 y95Var4 = this.J;
        x95 a = y95Var4 != null ? y95Var4.a(this.T, null, null, new pa1(this, j7, b)) : null;
        long d = eh0.d(j, a != null ? ((z22) a.getValue()).a : j6);
        y95 y95Var5 = this.K;
        if (y95Var5 != null) {
            j2 = 0;
            j3 = ((r22) y95Var5.a(fh.Q, null, null, new pa1(this, j7, (byte) 1)).getValue()).a;
        } else {
            j2 = 0;
            j3 = 0;
        }
        y95 y95Var6 = this.L;
        if (y95Var6 != null) {
            on4 on4Var2 = this.O;
            j4 = d;
            r22 r22Var = on4Var2.a() ? new r22(on4Var2.i) : null;
            if (this.O.a()) {
                float d2 = ji5.d(j2);
                Float valueOf3 = Float.valueOf(d2);
                if (Float.isNaN(d2)) {
                    valueOf3 = null;
                }
                float floatValue = valueOf3 != null ? valueOf3.floatValue() : 0.0f;
                float e = ji5.e(j2);
                Float valueOf4 = !Float.isNaN(e) ? Float.valueOf(e) : null;
                ejVar = new ej(floatValue, valueOf4 != null ? valueOf4.floatValue() : 0.0f);
            } else {
                ejVar = null;
            }
            x95Var4 = y95Var6.a(this.U, r22Var, ejVar, new qa1(this, j7));
        } else {
            j4 = d;
            x95Var4 = null;
        }
        return ww2Var.A((int) (j4 >> c), (int) (j4 & 4294967295L), p91Var, new oa1(this, x95Var4, j6, j7, j4, u3, j3, fa1Var));
    }

    @Override // defpackage.k13
    public final void onAttach() {
        super.onAttach();
        this.R = -9223372034707292160L;
    }

    @Override // defpackage.y92
    public final void f(ca2 ca2Var) {
    }

    @Override // defpackage.cx2
    public final void i(long j) {
    }
}
