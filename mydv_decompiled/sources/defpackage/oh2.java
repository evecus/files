package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class oh2 {
    public final jk3 A;
    public final jk3 B;
    public p35 a;
    public final x04 b;
    public final ot4 c;
    public final g12 d;
    public m55 e;
    public final jk3 f;
    public final jk3 g;
    public ca2 h;
    public final jk3 i;
    public oj j;
    public final jk3 k;
    public final jk3 l;
    public final jk3 m;
    public final jk3 n;
    public final jk3 o;
    public boolean p;
    public final jk3 q;
    public final w82 r;
    public final jk3 s;
    public final jk3 t;
    public tm1 u;
    public final xj0 v;
    public final xj0 w;
    public final xj0 x;
    public final pd y;
    public long z;

    public oh2(p35 p35Var, x04 x04Var, ot4 ot4Var) {
        this.a = p35Var;
        this.b = x04Var;
        this.c = ot4Var;
        g12 g12Var = new g12((byte) 9, false);
        oj ojVar = pj.a;
        long j = d65.b;
        d55 d55Var = new d55(ojVar, j, (d65) null);
        g12Var.J = d55Var;
        g12Var.K = new d71(ojVar, d55Var.b);
        this.d = g12Var;
        Boolean bool = Boolean.FALSE;
        this.f = ad4.w(bool);
        this.g = ad4.w(new r11(0.0f));
        this.i = ad4.w(null);
        this.k = ad4.w(ks1.I);
        this.l = ad4.w(bool);
        this.m = ad4.w(bool);
        this.n = ad4.w(bool);
        this.o = ad4.w(bool);
        this.p = true;
        this.q = ad4.w(Boolean.TRUE);
        this.r = new w82(ot4Var);
        this.s = ad4.w(bool);
        this.t = ad4.w(bool);
        this.u = new c22((byte) 17);
        this.v = new xj0(this, (byte) 1);
        this.w = new xj0(this, (byte) 2);
        this.x = new xj0(this, (byte) 3);
        this.y = i42.U();
        this.z = x70.g;
        this.A = ad4.w(new d65(j));
        this.B = ad4.w(new d65(j));
    }

    public final ks1 a() {
        return (ks1) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final ca2 c() {
        ca2 ca2Var = this.h;
        if (ca2Var == null || !ca2Var.h()) {
            return null;
        }
        return ca2Var;
    }

    public final v55 d() {
        return (v55) this.i.getValue();
    }

    public final void e(long j) {
        this.B.setValue(new d65(j));
    }

    public final void f(long j) {
        this.A.setValue(new d65(j));
    }
}
