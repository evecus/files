package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class fp implements Executor {
    public final /* synthetic */ byte I;

    public /* synthetic */ fp(byte b) {
        this.I = b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.I) {
            case 0:
                gp.u().b.c.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
