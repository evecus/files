package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ho1 implements te0 {
    public final qe0 I;

    public ho1(qe0 qe0Var) {
        this.I = qe0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ho1) {
            return this.I.equals(((ho1) obj).I);
        }
        return false;
    }

    public final int hashCode() {
        return this.I.hashCode() * 31;
    }
}
