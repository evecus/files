package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class w13 extends n2 implements Runnable {
    public final Runnable P;

    public w13(Runnable runnable) {
        runnable.getClass();
        this.P = runnable;
    }

    @Override // defpackage.r2
    public final String i() {
        return "task=[" + this.P + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.P.run();
        } catch (Throwable th) {
            k(th);
            throw th;
        }
    }
}
