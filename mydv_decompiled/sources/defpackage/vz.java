package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class vz extends og3 implements Serializable {
    public final pn1 I;
    public final og3 J;

    public vz(pn1 pn1Var, og3 og3Var) {
        this.I = pn1Var;
        this.J = og3Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        pn1 pn1Var = this.I;
        return this.J.compare(pn1Var.apply(obj), pn1Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vz)) {
            return false;
        }
        vz vzVar = (vz) obj;
        return this.I.equals(vzVar.I) && this.J.equals(vzVar.J);
    }

    public final int hashCode() {
        return jl2.M(this.I, this.J);
    }

    public final String toString() {
        return this.J + ".onResultOf(" + this.I + ")";
    }
}
