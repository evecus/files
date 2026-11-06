package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class u22 extends s22 {
    public static final u22 L = new u22(1, 0, 1);

    @Override // defpackage.s22
    public final boolean equals(Object obj) {
        if (!(obj instanceof u22)) {
            return false;
        }
        if (isEmpty() && ((u22) obj).isEmpty()) {
            return true;
        }
        u22 u22Var = (u22) obj;
        return this.I == u22Var.I && this.J == u22Var.J;
    }

    @Override // defpackage.s22
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.I * 31) + this.J;
    }

    @Override // defpackage.s22
    public final boolean isEmpty() {
        return this.I > this.J;
    }

    @Override // defpackage.s22
    public final String toString() {
        return this.I + ".." + this.J;
    }
}
