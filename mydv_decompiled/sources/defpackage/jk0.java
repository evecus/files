package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jk0 extends q13 {
    public final u95 a;
    public final d55 b;
    public final oh2 c;
    public final boolean d;
    public final td3 e;
    public final u45 f;
    public final mx1 g;
    public final ki1 h;

    public jk0(u95 u95Var, d55 d55Var, oh2 oh2Var, boolean z, td3 td3Var, u45 u45Var, mx1 mx1Var, ki1 ki1Var) {
        this.a = u95Var;
        this.b = d55Var;
        this.c = oh2Var;
        this.d = z;
        this.e = td3Var;
        this.f = u45Var;
        this.g = mx1Var;
        this.h = ki1Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        mk0 mk0Var = new mk0();
        mk0Var.K = this.a;
        mk0Var.L = this.b;
        mk0Var.M = this.c;
        mk0Var.N = this.d;
        mk0Var.O = this.e;
        u45 u45Var = this.f;
        mk0Var.P = u45Var;
        mk0Var.Q = this.g;
        mk0Var.R = this.h;
        u45Var.f = new kk0(mk0Var, (byte) 4);
        return mk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jk0) {
            jk0 jk0Var = (jk0) obj;
            if (this.a.equals(jk0Var.a) && this.b.equals(jk0Var.b) && this.c == jk0Var.c && this.d == jk0Var.d && this.e.equals(jk0Var.e) && this.f == jk0Var.f && j42.c(this.g, jk0Var.g) && j42.c(this.h, jk0Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((((((((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31) + 1237) * 31) + (this.d ? 1231 : 1237)) * 31) + 1237) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.a + ", value=" + this.b + ", state=" + this.c + ", readOnly=false, enabled=" + this.d + ", isPassword=false, offsetMapping=" + this.e + ", manager=" + this.f + ", imeOptions=" + this.g + ", focusRequester=" + this.h + ")";
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        mk0 mk0Var = (mk0) k13Var;
        boolean z = mk0Var.N;
        mx1 mx1Var = mk0Var.Q;
        u45 u45Var = mk0Var.P;
        mk0Var.K = this.a;
        d55 d55Var = this.b;
        mk0Var.L = d55Var;
        mk0Var.M = this.c;
        boolean z2 = this.d;
        mk0Var.N = z2;
        mk0Var.O = this.e;
        u45 u45Var2 = this.f;
        mk0Var.P = u45Var2;
        mx1 mx1Var2 = this.g;
        mk0Var.Q = mx1Var2;
        mk0Var.R = this.h;
        if (z2 != z || z2 != z || !j42.c(mx1Var2, mx1Var) || !d65.c(d55Var.b)) {
            ut0.U(mk0Var).I();
        }
        if (u45Var2 != u45Var) {
            u45Var2.f = new kk0(mk0Var, (byte) 0);
        }
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
    }
}
