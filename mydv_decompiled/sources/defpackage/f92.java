package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class f92 implements jt5 {
    public final ht5 I;

    public f92(ht5 ht5Var) {
        ht5Var.getClass();
        this.I = ht5Var;
        n84 n84Var = w80.a;
        n84[] n84VarArr = {new n84("L", 0.0f, 100.0f), new n84("A", -128.0f, 128.0f), new n84("B", -128.0f, 128.0f)};
        d63 d63Var = new d63((byte) 3);
        d63Var.a(n84VarArr);
        n84 n84Var2 = w80.a;
        ArrayList arrayList = d63Var.J;
        arrayList.add(n84Var2);
        p70.k0(arrayList.toArray(new n84[arrayList.size()]));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f92) {
            return j42.c(this.I, ((f92) obj).I);
        }
        return false;
    }

    @Override // defpackage.jt5
    public final ht5 h() {
        throw null;
    }

    public final int hashCode() {
        return this.I.hashCode();
    }

    public final String toString() {
        return "LABColorSpace(" + this.I + ')';
    }
}
