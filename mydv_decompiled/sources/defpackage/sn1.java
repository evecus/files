package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class sn1 extends s00 implements rn1, v72 {
    private final int arity;

    public sn1(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // defpackage.s00
    public s72 computeReflected() {
        s24.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sn1) {
            sn1 sn1Var = (sn1) obj;
            return getName().equals(sn1Var.getName()) && getSignature().equals(sn1Var.getSignature()) && j42.c(getBoundReceiver(), sn1Var.getBoundReceiver()) && j42.c(getOwner(), sn1Var.getOwner());
        }
        if (obj instanceof v72) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.rn1
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.s00
    public v72 getReflected() {
        s72 compute = compute();
        if (compute != this) {
            return (v72) compute;
        }
        throw new jl0();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.v72
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.v72
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.v72
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.v72
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.v72
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        s72 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
