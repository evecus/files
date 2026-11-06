package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class g85 implements Runnable {
    public final /* synthetic */ byte I;
    public final fl2 J;
    public final k10 K;

    public /* synthetic */ g85(fl2 fl2Var, k10 k10Var, byte b) {
        this.I = b;
        this.J = fl2Var;
        this.K = k10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        k10 k10Var = this.K;
        fl2 fl2Var = this.J;
        switch (b) {
            case 0:
                if (fl2Var.isCancelled()) {
                    k10Var.j(null);
                    return;
                }
                boolean z = false;
                while (true) {
                    try {
                        try {
                            Object obj = fl2Var.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            k10Var.resumeWith(obj);
                            return;
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            cause.getClass();
                            k10Var.resumeWith(new g54(cause));
                            return;
                        }
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
            default:
                if (fl2Var.isCancelled()) {
                    k10Var.j(null);
                    return;
                }
                try {
                    k10Var.resumeWith(n4.f(fl2Var));
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause2 = e2.getCause();
                    cause2.getClass();
                    k10Var.resumeWith(new g54(cause2));
                    return;
                }
        }
    }
}
