package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface v52 extends rk0 {
    cy0 Q(tm1 tm1Var);

    cy0 R(boolean z, boolean z2, sd sdVar);

    Object W(gj0 gj0Var);

    void e(CancellationException cancellationException);

    boolean isActive();

    boolean isCancelled();

    c60 n(e62 e62Var);

    boolean start();

    CancellationException t();
}
