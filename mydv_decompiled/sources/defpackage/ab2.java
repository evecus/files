package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ab2 {
    public final wa2 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public ns2 q;
    public sa2 d = sa2.M;
    public final tw2 p = new tw2(this);

    public ab2(wa2 wa2Var) {
        this.a = wa2Var;
    }

    public final na3 a() {
        return this.a.n0.d;
    }

    public final void b() {
        sa2 sa2Var = this.a.o0.d;
        sa2 sa2Var2 = sa2.K;
        sa2 sa2Var3 = sa2.L;
        if (sa2Var == sa2Var2 || sa2Var == sa2Var3) {
            if (this.p.i0) {
                f(true);
            } else {
                e(true);
            }
        }
        if (sa2Var == sa2Var3) {
            ns2 ns2Var = this.q;
            if (ns2Var == null || !ns2Var.l0()) {
                g(true);
            } else {
                h(true);
            }
        }
    }

    public final void c(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            wa2 v = this.a.v();
            ab2 ab2Var = v != null ? v.o0 : null;
            if (ab2Var != null) {
                int i3 = ab2Var.l;
                if (i == 0) {
                    ab2Var.c(i3 - 1);
                } else {
                    ab2Var.c(i3 + 1);
                }
            }
        }
    }

    public final void d(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            wa2 v = this.a.v();
            ab2 ab2Var = v != null ? v.o0 : null;
            if (ab2Var != null) {
                int i3 = ab2Var.o;
                if (i == 0) {
                    ab2Var.d(i3 - 1);
                } else {
                    ab2Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                c(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                c(this.l - 1);
            }
        }
    }

    public final void f(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                c(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                c(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                d(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                d(this.o - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                d(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                d(this.o - 1);
            }
        }
    }

    public final void i() {
        tw2 tw2Var = this.p;
        ab2 ab2Var = tw2Var.N;
        Object obj = tw2Var.Z;
        wa2 wa2Var = this.a;
        if ((obj != null || ab2Var.a().z() != null) && tw2Var.Y) {
            tw2Var.Y = false;
            tw2Var.Z = ab2Var.a().z();
            wa2 v = wa2Var.v();
            if (v != null) {
                wa2.Y(v, false, 7);
            }
        }
        ns2 ns2Var = this.q;
        if (ns2Var == null || !ns2Var.H0()) {
            return;
        }
        if (sv2.G(wa2Var)) {
            wa2 v2 = wa2Var.v();
            if (v2 != null) {
                wa2.Y(v2, false, 7);
                return;
            }
            return;
        }
        wa2 v3 = wa2Var.v();
        if (v3 != null) {
            wa2.W(v3, false, 7);
        }
    }
}
