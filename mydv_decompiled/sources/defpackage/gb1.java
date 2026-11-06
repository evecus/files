package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gb1 extends hb1 {
    public final Runnable K;

    public gb1(Runnable runnable, long j) {
        super(j);
        this.K = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.K.run();
    }

    @Override // defpackage.hb1
    public final String toString() {
        return super.toString() + this.K;
    }
}
