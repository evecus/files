package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class q40 extends p40 {
    public final hn1 L;

    public q40(hn1 hn1Var, tk0 tk0Var, int i, ez ezVar) {
        super(tk0Var, i, ezVar);
        this.L = hn1Var;
    }

    @Override // defpackage.p40
    public Object d(bu3 bu3Var, fj0 fj0Var) {
        Object invoke = this.L.invoke(bu3Var, fj0Var);
        return invoke == el0.I ? invoke : wd5.a;
    }

    @Override // defpackage.p40
    public p40 e(tk0 tk0Var, int i, ez ezVar) {
        return new q40(this.L, tk0Var, i, ezVar);
    }

    @Override // defpackage.p40
    public final String toString() {
        return "block[" + this.L + "] -> " + super.toString();
    }
}
