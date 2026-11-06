package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class rx3 extends s00 implements d82 {
    public final boolean I;

    public rx3(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.I = false;
    }

    @Override // defpackage.s00
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d82 getReflected() {
        if (this.I) {
            zy.p("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        s72 compute = compute();
        if (compute != this) {
            return (d82) compute;
        }
        throw new jl0();
    }

    @Override // defpackage.s00
    public final s72 compute() {
        return this.I ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rx3) {
            rx3 rx3Var = (rx3) obj;
            return getOwner().equals(rx3Var.getOwner()) && getName().equals(rx3Var.getName()) && getSignature().equals(rx3Var.getSignature()) && j42.c(getBoundReceiver(), rx3Var.getBoundReceiver());
        }
        if (obj instanceof d82) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        s72 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
