package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hi1 implements qn1 {
    public final /* synthetic */ tm1 I;

    public hi1(tm1 tm1Var) {
        this.I = tm1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hi1)) {
            return false;
        }
        return j42.c(this.I, ((qn1) obj).getFunctionDelegate());
    }

    @Override // defpackage.qn1
    public final dn1 getFunctionDelegate() {
        return this.I;
    }

    public final int hashCode() {
        return this.I.hashCode();
    }
}
