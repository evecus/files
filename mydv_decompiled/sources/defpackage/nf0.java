package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class nf0 implements dh5 {
    public final tm1 a;

    public nf0(tm1 tm1Var) {
        this.a = tm1Var;
    }

    @Override // defpackage.dh5
    public final Object a(am3 am3Var) {
        return this.a.invoke(am3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nf0) && j42.c(this.a, ((nf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ")";
    }
}
