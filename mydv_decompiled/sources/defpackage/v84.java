package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class v84 implements fj0, fl0 {
    public static final AtomicReferenceFieldUpdater J = AtomicReferenceFieldUpdater.newUpdater(v84.class, Object.class, "result");
    public final fj0 I;
    private volatile Object result;

    public v84(fj0 fj0Var) {
        el0 el0Var = el0.I;
        this.I = fj0Var;
        this.result = el0Var;
    }

    @Override // defpackage.fl0
    public final fl0 getCallerFrame() {
        fj0 fj0Var = this.I;
        if (fj0Var instanceof fl0) {
            return (fl0) fj0Var;
        }
        return null;
    }

    @Override // defpackage.fj0
    public final tk0 getContext() {
        return this.I.getContext();
    }

    @Override // defpackage.fj0
    public final void resumeWith(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = J;
        while (true) {
            Object obj2 = this.result;
            el0 el0Var = el0.J;
            if (obj2 == el0Var) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, el0Var, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != el0Var) {
                        break;
                    }
                }
                return;
            }
            el0 el0Var2 = el0.I;
            if (obj2 != el0Var2) {
                zy.i("Already resumed");
                return;
            }
            el0 el0Var3 = el0.K;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, el0Var2, el0Var3)) {
                if (atomicReferenceFieldUpdater.get(this) != el0Var2) {
                    break;
                }
            }
            this.I.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.I;
    }
}
