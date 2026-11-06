package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ta3 extends d2 implements v52 {
    public static final ta3 I = new ta3(q8.r0);

    @Override // defpackage.v52
    public final cy0 Q(tm1 tm1Var) {
        return ua3.I;
    }

    @Override // defpackage.v52
    public final cy0 R(boolean z, boolean z2, sd sdVar) {
        return ua3.I;
    }

    @Override // defpackage.v52
    public final Object W(gj0 gj0Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.v52
    public final boolean isActive() {
        return true;
    }

    @Override // defpackage.v52
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.v52
    public final c60 n(e62 e62Var) {
        return ua3.I;
    }

    @Override // defpackage.v52
    public final boolean start() {
        return false;
    }

    @Override // defpackage.v52
    public final CancellationException t() {
        throw new IllegalStateException("This job is always active");
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.v52, defpackage.k20
    public final void e(CancellationException cancellationException) {
    }
}
