package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hl2 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ AtomicBoolean J;
    public final /* synthetic */ v00 K;
    public final /* synthetic */ rm1 L;

    public /* synthetic */ hl2(AtomicBoolean atomicBoolean, v00 v00Var, rm1 rm1Var, byte b) {
        this.I = b;
        this.J = atomicBoolean;
        this.K = v00Var;
        this.L = rm1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        rm1 rm1Var = this.L;
        v00 v00Var = this.K;
        AtomicBoolean atomicBoolean = this.J;
        switch (b) {
            case 0:
                if (!atomicBoolean.get()) {
                    try {
                        v00Var.a(rm1Var.invoke());
                        break;
                    } catch (Throwable th) {
                        v00Var.b(th);
                        return;
                    }
                }
                break;
            default:
                if (!atomicBoolean.get()) {
                    try {
                        v00Var.a(rm1Var.invoke());
                        break;
                    } catch (Throwable th2) {
                        v00Var.b(th2);
                    }
                }
                break;
        }
    }
}
