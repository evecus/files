package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class k05 extends gj0 implements rn1 {
    private final int arity;

    public k05(int i, fj0 fj0Var) {
        super(fj0Var);
        this.arity = i;
    }

    @Override // defpackage.rn1
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.fu
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        s24.a.getClass();
        return t24.a(this);
    }
}
