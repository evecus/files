package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class f54 extends e54 implements rn1 {
    public final byte I;

    /* JADX WARN: Multi-variable type inference failed */
    public f54(int i, fj0 fj0Var) {
        super(fj0Var);
        this.I = i;
    }

    @Override // defpackage.rn1
    public final int getArity() {
        return this.I;
    }

    @Override // defpackage.fu
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        s24.a.getClass();
        return t24.a(this);
    }
}
