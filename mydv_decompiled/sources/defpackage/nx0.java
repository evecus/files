package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class nx0 extends px0 implements fl0, fj0 {
    public static final /* synthetic */ long P = gq.a.objectFieldOffset(nx0.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    public final vk0 L;
    public final fj0 M;
    public Object N;
    public final Object O;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    public nx0(vk0 vk0Var, fj0 fj0Var) {
        super(-1);
        this.L = vk0Var;
        this.M = fj0Var;
        this.N = qb.e;
        this.O = j42.e0(fj0Var.getContext());
    }

    @Override // defpackage.fl0
    public final fl0 getCallerFrame() {
        fj0 fj0Var = this.M;
        if (fj0Var instanceof fl0) {
            return (fl0) fj0Var;
        }
        return null;
    }

    @Override // defpackage.fj0
    public final tk0 getContext() {
        return this.M.getContext();
    }

    @Override // defpackage.px0
    public final Object h() {
        Object obj = this.N;
        this.N = qb.e;
        return obj;
    }

    @Override // defpackage.fj0
    public final void resumeWith(Object obj) {
        Throwable a = h54.a(obj);
        Object ub0Var = a == null ? obj : new ub0(a, false);
        fj0 fj0Var = this.M;
        tk0 context = fj0Var.getContext();
        vk0 vk0Var = this.L;
        if (qb.e0(vk0Var, context)) {
            this.N = ub0Var;
            this.K = 0;
            qb.d0(vk0Var, fj0Var.getContext(), this);
            return;
        }
        eb1 a2 = x65.a();
        if (a2.I >= 4294967296L) {
            this.N = ub0Var;
            this.K = 0;
            a2.b0(this);
            return;
        }
        a2.c0(true);
        try {
            tk0 context2 = fj0Var.getContext();
            Object l0 = j42.l0(context2, this.O);
            try {
                fj0Var.resumeWith(obj);
                while (a2.e0()) {
                }
            } finally {
                j42.Y(context2, l0);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.L + ", " + o7.R(this.M) + ']';
    }

    @Override // defpackage.px0
    public final fj0 d() {
        return this;
    }
}
