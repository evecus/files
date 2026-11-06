package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class s84 extends gj0 implements ag1 {
    public final ag1 I;
    public final tk0 J;
    public final int K;
    public tk0 L;
    public fj0 M;

    public s84(ag1 ag1Var, tk0 tk0Var) {
        super(tb0.K, l91.I);
        this.I = ag1Var;
        this.J = tk0Var;
        this.K = ((Number) tk0Var.fold(0, new sg((byte) 25))).intValue();
    }

    @Override // defpackage.ag1
    public final Object emit(Object obj, fj0 fj0Var) {
        try {
            Object f = f(fj0Var, obj);
            return f == el0.I ? f : wd5.a;
        } catch (Throwable th) {
            this.L = new q11(fj0Var.getContext(), th);
            throw th;
        }
    }

    public final Object f(fj0 fj0Var, Object obj) {
        tk0 context = fj0Var.getContext();
        vt0.p(context);
        tk0 tk0Var = this.L;
        if (tk0Var != context) {
            if (tk0Var instanceof q11) {
                throw new IllegalStateException(kx4.p("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((q11) tk0Var).J + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new y1(this, (byte) 10))).intValue() != this.K) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.J + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.L = context;
        }
        this.M = fj0Var;
        in1 in1Var = u84.a;
        ag1 ag1Var = this.I;
        ag1Var.getClass();
        Object invoke = in1Var.invoke(ag1Var, obj, this);
        if (!j42.c(invoke, el0.I)) {
            this.M = null;
        }
        return invoke;
    }

    @Override // defpackage.fu, defpackage.fl0
    public final fl0 getCallerFrame() {
        fj0 fj0Var = this.M;
        if (fj0Var instanceof fl0) {
            return (fl0) fj0Var;
        }
        return null;
    }

    @Override // defpackage.gj0, defpackage.fj0
    public final tk0 getContext() {
        tk0 tk0Var = this.L;
        return tk0Var == null ? l91.I : tk0Var;
    }

    @Override // defpackage.fu
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Throwable a = h54.a(obj);
        if (a != null) {
            this.L = new q11(getContext(), a);
        }
        fj0 fj0Var = this.M;
        if (fj0Var != null) {
            fj0Var.resumeWith(obj);
        }
        return el0.I;
    }
}
