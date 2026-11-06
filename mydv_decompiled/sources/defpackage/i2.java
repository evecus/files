package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class i2 {
    public static final i2 d = new i2();
    public final Runnable a;
    public final Executor b;
    public i2 c;

    public i2() {
        this.a = null;
        this.b = null;
    }

    public i2(Executor executor, Runnable runnable) {
        this.a = runnable;
        this.b = executor;
    }
}
