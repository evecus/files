package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class ez5 {
    public static final String a = fr2.h("WorkerWrapper");

    public static final Object a(fl2 fl2Var, ol2 ol2Var, k05 k05Var) {
        Object obj;
        try {
            boolean z = false;
            byte b = 1;
            if (!fl2Var.isDone()) {
                k10 k10Var = new k10(1, mu0.G(k05Var));
                k10Var.t();
                fl2Var.a(fx0.I, new g85(fl2Var, k10Var, (byte) 0));
                k10Var.v(new jm5(ol2Var, fl2Var, b));
                return k10Var.r();
            }
            while (true) {
                try {
                    obj = fl2Var.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
