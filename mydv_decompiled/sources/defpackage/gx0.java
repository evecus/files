package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gx0 implements Executor {
    public static final gx0 I;
    public static final /* synthetic */ gx0[] J;

    static {
        gx0 gx0Var = new gx0("INSTANCE", 0);
        I = gx0Var;
        J = new gx0[]{gx0Var};
    }

    public static gx0 valueOf(String str) {
        return (gx0) Enum.valueOf(gx0.class, str);
    }

    public static gx0[] values() {
        return (gx0[]) J.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
