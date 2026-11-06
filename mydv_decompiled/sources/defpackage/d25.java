package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class d25 extends b25 {
    public final Runnable K;

    public d25(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.K = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.K.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.K;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(o7.y(runnable));
        sb.append(", ");
        sb.append(this.I);
        sb.append(", ");
        sb.append(this.J ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
