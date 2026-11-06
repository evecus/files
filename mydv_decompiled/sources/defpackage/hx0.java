package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hx0 implements Executor {
    public static final hx0 I;
    public static final /* synthetic */ hx0[] J;

    static {
        hx0 hx0Var = new hx0("INSTANCE", 0);
        I = hx0Var;
        J = new hx0[]{hx0Var};
    }

    public static hx0 valueOf(String str) {
        return (hx0) Enum.valueOf(hx0.class, str);
    }

    public static hx0[] values() {
        return (hx0[]) J.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
