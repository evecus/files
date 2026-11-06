package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class j4 {
    public static final j4 d = new j4(null, null);
    public final Runnable a;
    public final Executor b;
    public j4 c;

    public j4(Executor executor, Runnable runnable) {
        this.a = runnable;
        this.b = executor;
    }
}
