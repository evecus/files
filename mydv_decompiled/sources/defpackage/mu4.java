package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mu4 implements fj0, fl0 {
    public final r40 I;
    public final tk0 J;

    public mu4(r40 r40Var, tk0 tk0Var) {
        this.I = r40Var;
        this.J = tk0Var;
    }

    @Override // defpackage.fl0
    public final fl0 getCallerFrame() {
        return this.I;
    }

    @Override // defpackage.fj0
    public final tk0 getContext() {
        return this.J;
    }

    @Override // defpackage.fj0
    public final void resumeWith(Object obj) {
        this.I.resumeWith(obj);
    }
}
