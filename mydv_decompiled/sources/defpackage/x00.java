package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class x00 extends n4 {
    public final /* synthetic */ y00 P;

    public x00(y00 y00Var) {
        this.P = y00Var;
    }

    @Override // defpackage.n4
    public final String g() {
        v00 v00Var = (v00) this.P.I.get();
        if (v00Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + v00Var.a + "]";
    }
}
