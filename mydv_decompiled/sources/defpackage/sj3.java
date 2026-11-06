package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class sj3 extends q13 {
    public final rj3 a;
    public final u8 b;
    public final ni0 c;
    public final float d;
    public final c80 e;

    public sj3(rj3 rj3Var, u8 u8Var, ni0 ni0Var, float f, c80 c80Var) {
        this.a = rj3Var;
        this.b = u8Var;
        this.c = ni0Var;
        this.d = f;
        this.e = c80Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        tj3 tj3Var = new tj3();
        tj3Var.I = this.a;
        tj3Var.J = true;
        tj3Var.K = this.b;
        tj3Var.L = this.c;
        tj3Var.M = this.d;
        tj3Var.N = this.e;
        return tj3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj3)) {
            return false;
        }
        sj3 sj3Var = (sj3) obj;
        return j42.c(this.a, sj3Var.a) && j42.c(this.b, sj3Var.b) && j42.c(this.c, sj3Var.c) && Float.compare(this.d, sj3Var.d) == 0 && j42.c(this.e, sj3Var.e);
    }

    public final int hashCode() {
        int o = jp0.o(this.d, (this.c.hashCode() + ((this.b.hashCode() + (((this.a.hashCode() * 31) + 1231) * 31)) * 31)) * 31, 31);
        c80 c80Var = this.e;
        return o + (c80Var == null ? 0 : c80Var.hashCode());
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("paint");
        z12Var.b().b(this.a, "painter");
        z12Var.b().b(Boolean.TRUE, "sizeToIntrinsics");
        z12Var.b().b(this.b, "alignment");
        z12Var.b().b(this.c, "contentScale");
        z12Var.b().b(Float.valueOf(this.d), "alpha");
        z12Var.b().b(this.e, "colorFilter");
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.d + ", colorFilter=" + this.e + ")";
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        tj3 tj3Var = (tj3) k13Var;
        boolean z = tj3Var.J;
        rj3 rj3Var = this.a;
        boolean z2 = (z && fq4.a(tj3Var.I.mo43getIntrinsicSizeNHjbRc(), rj3Var.mo43getIntrinsicSizeNHjbRc())) ? false : true;
        tj3Var.I = rj3Var;
        tj3Var.J = true;
        tj3Var.K = this.b;
        tj3Var.L = this.c;
        tj3Var.M = this.d;
        tj3Var.N = this.e;
        if (z2) {
            ut0.U(tj3Var).H();
        }
        mu0.I(tj3Var);
    }
}
