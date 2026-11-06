package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class e81 extends vt0 {
    public final /* synthetic */ vt0 d;
    public final /* synthetic */ ThreadPoolExecutor e;

    public e81(vt0 vt0Var, ThreadPoolExecutor threadPoolExecutor) {
        this.d = vt0Var;
        this.e = threadPoolExecutor;
    }

    @Override // defpackage.vt0
    public final void K(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.e;
        try {
            this.d.K(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.vt0
    public final void L(mc3 mc3Var) {
        ThreadPoolExecutor threadPoolExecutor = this.e;
        try {
            this.d.L(mc3Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
