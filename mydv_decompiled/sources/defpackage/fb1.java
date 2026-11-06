package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fb1 extends hb1 {
    public final k10 K;
    public final /* synthetic */ jb1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb1(jb1 jb1Var, long j, k10 k10Var) {
        super(j);
        this.L = jb1Var;
        this.K = k10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.K.C(this.L);
    }

    @Override // defpackage.hb1
    public final String toString() {
        return super.toString() + this.K;
    }
}
