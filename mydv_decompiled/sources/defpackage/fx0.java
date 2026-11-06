package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fx0 implements Executor {
    public static final fx0 I;
    public static final /* synthetic */ fx0[] J;

    static {
        fx0 fx0Var = new fx0("INSTANCE", 0);
        I = fx0Var;
        J = new fx0[]{fx0Var};
    }

    public static fx0 valueOf(String str) {
        return (fx0) Enum.valueOf(fx0.class, str);
    }

    public static fx0[] values() {
        return (fx0[]) J.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
