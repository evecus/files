package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class k2 implements Runnable {
    public final al4 I;
    public final fl2 J;

    public k2(al4 al4Var, fl2 fl2Var) {
        this.I = al4Var;
        this.J = fl2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.I.I != this) {
            return;
        }
        if (r2.N.i(this.I, this, r2.h(this.J))) {
            r2.e(this.I, false);
        }
    }
}
