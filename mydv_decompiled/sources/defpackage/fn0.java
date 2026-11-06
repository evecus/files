package defpackage;

/* loaded from: classes2.dex */
public final class fn0 extends u0 {
    public static final y O = new y(fn0.class, (byte) 4);
    public q0 I;
    public l0 J;
    public u0 K;
    public int L;
    public u0 M;
    public final /* synthetic */ byte N;

    public fn0(x0 x0Var, byte b) {
        int i;
        u0 d;
        this.N = b;
        u0 w = w(x0Var, 0);
        if (w instanceof q0) {
            this.I = (q0) w;
            w = w(x0Var, 1);
            i = 1;
        } else {
            i = 0;
        }
        if (w instanceof l0) {
            this.J = (l0) w;
            i++;
            w = w(x0Var, i);
        }
        if (!(w instanceof ct)) {
            this.K = w;
            i++;
            w = w(x0Var, i);
        }
        if (x0Var.size() != i + 1) {
            s83.t("input sequence too large");
            throw null;
        }
        if (!(w instanceof ct)) {
            s83.t("No tagged object found in sequence. Structure doesn't seem to be of type External");
            throw null;
        }
        ct ctVar = (ct) w;
        int i2 = ctVar.K;
        if (i2 < 0 || i2 > 2) {
            s83.t(hf1.u(i2, "invalid encoding value: "));
            throw null;
        }
        this.L = i2;
        wx5.f(ctVar);
        if (i2 == 0) {
            d = ctVar.x().d();
        } else if (i2 == 1) {
            wx5.f(ctVar);
            y yVar = r0.J;
            u0 v = ctVar.v(false, yVar);
            yVar.c(v);
            d = (r0) v;
        } else {
            if (i2 != 2) {
                s83.t("invalid tag: ".concat(wx5.i(ctVar.J, i2)));
                throw null;
            }
            wx5.f(ctVar);
            y yVar2 = a0.J;
            u0 v2 = ctVar.v(false, yVar2);
            yVar2.c(v2);
            d = (a0) v2;
        }
        this.M = d;
    }

    public static u0 w(x0 x0Var, int i) {
        if (x0Var.size() > i) {
            return x0Var.y(i).d();
        }
        s83.t("too few objects in input sequence");
        return null;
    }

    @Override // defpackage.u0, defpackage.n0
    public final int hashCode() {
        q0 q0Var = this.I;
        int hashCode = q0Var == null ? 0 : q0Var.hashCode();
        l0 l0Var = this.J;
        int hashCode2 = hashCode ^ (l0Var == null ? 0 : l0Var.hashCode());
        u0 u0Var = this.K;
        return this.M.hashCode() ^ ((hashCode2 ^ (u0Var != null ? u0Var.hashCode() : 0)) ^ this.L);
    }

    @Override // defpackage.u0
    public final boolean m(u0 u0Var) {
        if (this == u0Var) {
            return true;
        }
        if (!(u0Var instanceof fn0)) {
            return false;
        }
        fn0 fn0Var = (fn0) u0Var;
        return il2.j(this.I, fn0Var.I) && il2.j(this.J, fn0Var.J) && il2.j(this.K, fn0Var.K) && this.L == fn0Var.L && this.M.r(fn0Var.M);
    }

    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        uu2Var.U(40, z);
        v().n(uu2Var, false);
    }

    @Override // defpackage.u0
    public final boolean o() {
        return true;
    }

    @Override // defpackage.u0
    public final int q(boolean z) {
        return v().q(z);
    }

    @Override // defpackage.u0
    public u0 t() {
        switch (this.N) {
            case 0:
                return this;
            default:
                q0 q0Var = this.I;
                l0 l0Var = this.J;
                u0 u0Var = this.K;
                int i = this.L;
                u0 u0Var2 = this.M;
                fn0 fn0Var = new fn0();
                fn0Var.I = q0Var;
                fn0Var.J = l0Var;
                fn0Var.K = u0Var;
                if (i < 0 || i > 2) {
                    s83.t(hf1.u(i, "invalid encoding value: "));
                } else {
                    fn0Var.L = i;
                    if (i == 1 ? r0.class.isInstance(u0Var2) : !(i == 2 && !a0.class.isInstance(u0Var2))) {
                        fn0Var.M = u0Var2;
                        return fn0Var;
                    }
                    s83.t("unexpected object: ".concat(il2.E(u0Var2)));
                }
                return null;
        }
    }

    @Override // defpackage.u0
    public final u0 u() {
        byte b = this.N;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final x0 v() {
        Object[] objArr = 0;
        byte b = 1;
        switch (this.N) {
            case 0:
                f0 f0Var = new f0(4);
                q0 q0Var = this.I;
                if (q0Var != null) {
                    f0Var.a(q0Var);
                }
                l0 l0Var = this.J;
                if (l0Var != null) {
                    f0Var.a(l0Var);
                }
                u0 u0Var = this.K;
                if (u0Var != null) {
                    f0Var.a(u0Var.t());
                }
                int i = this.L;
                f0Var.a(new ct(i == 0, i, this.M, (byte) 1));
                pn0 pn0Var = new pn0(f0Var, (byte) (objArr == true ? 1 : 0));
                pn0Var.L = -1;
                return pn0Var;
            default:
                f0 f0Var2 = new f0(4);
                q0 q0Var2 = this.I;
                if (q0Var2 != null) {
                    f0Var2.a(q0Var2);
                }
                l0 l0Var2 = this.J;
                if (l0Var2 != null) {
                    f0Var2.a(l0Var2);
                }
                u0 u0Var2 = this.K;
                if (u0Var2 != null) {
                    f0Var2.a(u0Var2.u());
                }
                int i2 = this.L;
                f0Var2.a(new ct(i2 == 0, i2, this.M, (byte) 2));
                pn0 pn0Var2 = new pn0(f0Var2, b);
                pn0Var2.L = -1;
                return pn0Var2;
        }
    }

    public /* synthetic */ fn0() {
        this.N = (byte) 0;
    }
}
