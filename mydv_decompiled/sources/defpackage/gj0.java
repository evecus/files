package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class gj0 extends fu {
    private final tk0 _context;
    private transient fj0 intercepted;

    public gj0(fj0 fj0Var) {
        this(fj0Var, fj0Var != null ? fj0Var.getContext() : null);
    }

    @Override // defpackage.fj0
    public tk0 getContext() {
        tk0 tk0Var = this._context;
        tk0Var.getClass();
        return tk0Var;
    }

    public final fj0 intercepted() {
        fj0 fj0Var = this.intercepted;
        if (fj0Var == null) {
            vk0 vk0Var = (vk0) getContext().get(q8.i0);
            if (vk0Var == null || (fj0Var = vk0Var.interceptContinuation(this)) == null) {
                fj0Var = this;
            }
            this.intercepted = fj0Var;
        }
        return fj0Var;
    }

    @Override // defpackage.fu
    public void releaseIntercepted() {
        fj0 fj0Var = this.intercepted;
        if (fj0Var != null && fj0Var != this) {
            rk0 rk0Var = getContext().get(q8.i0);
            rk0Var.getClass();
            ((vk0) rk0Var).releaseInterceptedContinuation(fj0Var);
        }
        this.intercepted = tb0.J;
    }

    public gj0(fj0 fj0Var, tk0 tk0Var) {
        super(fj0Var);
        this._context = tk0Var;
    }
}
