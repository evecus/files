package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class fu implements fj0, fl0, Serializable {
    private final fj0 completion;

    public fu(fj0 fj0Var) {
        this.completion = fj0Var;
    }

    public fj0 create(fj0 fj0Var) {
        fj0Var.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // defpackage.fl0
    public fl0 getCallerFrame() {
        fj0 fj0Var = this.completion;
        if (fj0Var instanceof fl0) {
            return (fl0) fj0Var;
        }
        return null;
    }

    public final fj0 getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return a5.N(this);
    }

    public Object invokeSuspend(Object obj) {
        mu0.V(obj);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fj0
    public final void resumeWith(Object obj) {
        while (true) {
            fu fuVar = this;
            fj0 fj0Var = fuVar.completion;
            fj0Var.getClass();
            try {
                obj = fuVar.invokeSuspend(obj);
                if (obj == el0.I) {
                    return;
                }
            } catch (Throwable th) {
                obj = new g54(th);
            }
            fuVar.releaseIntercepted();
            if (!(fj0Var instanceof fu)) {
                fj0Var.resumeWith(obj);
                return;
            }
            this = fj0Var;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public fj0 create(Object obj, fj0 fj0Var) {
        fj0Var.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
