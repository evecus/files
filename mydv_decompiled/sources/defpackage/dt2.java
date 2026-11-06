package defpackage;

import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dt2 extends q13 {
    public final b40 a;
    public final y45 b;
    public final pn3 c;

    public dt2(b40 b40Var, y45 y45Var, pn3 pn3Var) {
        this.a = b40Var;
        this.b = y45Var;
        this.c = pn3Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new gt2(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((((Float.floatToIntBits(Float.NaN) + jp0.o(Float.NaN, (i82.Q(9205357640488583168L) + ((((Float.floatToIntBits(Float.NaN) + (this.a.hashCode() * 961)) * 31) + 1231) * 31)) * 31, 31)) * 31) + 1231) * 31)) * 31);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "magnifier";
        fq fqVar = z12Var.c;
        fqVar.b(this.a, "sourceCenter");
        fqVar.b(null, "magnifierCenter");
        fqVar.b(Float.valueOf(Float.NaN), "zoom");
        fqVar.b(new v11(9205357640488583168L), "size");
        fqVar.b(new r11(Float.NaN), "cornerRadius");
        fqVar.b(new r11(Float.NaN), "elevation");
        fqVar.b(Boolean.TRUE, "clippingEnabled");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        gt2 gt2Var = (gt2) k13Var;
        float f = gt2Var.K;
        long j = gt2Var.M;
        float f2 = gt2Var.N;
        boolean z = gt2Var.L;
        float f3 = gt2Var.O;
        boolean z2 = gt2Var.P;
        pn3 pn3Var = gt2Var.Q;
        View view = gt2Var.R;
        iu0 iu0Var = gt2Var.S;
        gt2Var.I = this.a;
        gt2Var.K = Float.NaN;
        gt2Var.L = true;
        gt2Var.M = 9205357640488583168L;
        gt2Var.N = Float.NaN;
        gt2Var.O = Float.NaN;
        gt2Var.P = true;
        gt2Var.J = this.b;
        pn3 pn3Var2 = this.c;
        gt2Var.Q = pn3Var2;
        View T = vt0.T(gt2Var);
        iu0 iu0Var2 = ut0.U(gt2Var).g0;
        if (gt2Var.T != null) {
            bj4 bj4Var = ht2.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(f)) && Float.NaN != f && !pn3Var2.a()) || 9205357640488583168L != j || !r11.c(Float.NaN, f2) || !r11.c(Float.NaN, f3) || true != z || true != z2 || !pn3Var2.equals(pn3Var) || !T.equals(view) || !j42.c(iu0Var2, iu0Var)) {
                gt2Var.k0();
            }
        }
        gt2Var.l0();
    }
}
