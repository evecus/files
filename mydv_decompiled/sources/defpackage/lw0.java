package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lw0 implements hn1 {
    public final /* synthetic */ rw0 I;
    public final /* synthetic */ p63 J;

    public lw0(rw0 rw0Var, p63 p63Var) {
        this.I = rw0Var;
        this.J = p63Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        fe0 fe0Var = (fe0) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            go1 go1Var = (go1) fe0Var;
            if (go1Var.F()) {
                go1Var.W();
                return wd5.a;
            }
        }
        this.I.O.invoke(this.J, fe0Var, 0);
        return wd5.a;
    }
}
