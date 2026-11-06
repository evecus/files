package defpackage;

import android.os.Build;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class mv {
    public static final i51 a = new i51(new q7((byte) 11), (byte) 1);
    public static Boolean b;

    public static final void a(oj ojVar, m65 m65Var, kj1 kj1Var, List list, boolean z, fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        Executor executor = (Executor) go1Var.k(a);
        if (executor == null || !b(ojVar.J.length())) {
            go1Var.d0(317137883);
            go1Var.q(false);
        } else {
            go1Var.d0(315439796);
            try {
                executor.execute(new kv(m65Var, (da2) go1Var.k(hf0.n), list, ojVar, (iu0) go1Var.k(hf0.h), kj1Var, z));
            } catch (RejectedExecutionException unused) {
            }
            go1Var.q(false);
        }
    }

    public static final boolean b(int i) {
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            Boolean bool = b;
            if (bool == null) {
                bool = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                b = bool;
            }
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
