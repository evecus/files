package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class z00 implements Runnable {
    public final /* synthetic */ g73 I;
    public final /* synthetic */ int J;

    public z00(g73 g73Var, int i) {
        this.I = g73Var;
        this.J = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lm lmVar = (lm) this.I.J;
        if (lmVar != null) {
            lmVar.b(this.J);
        }
    }
}
