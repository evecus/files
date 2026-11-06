package coil3.request;

import defpackage.fj0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface RequestDelegate {
    void assertActive();

    Object awaitStarted(fj0 fj0Var);

    void complete();

    void dispose();

    void start();
}
