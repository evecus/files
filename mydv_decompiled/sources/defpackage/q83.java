package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class q83 extends sp0 {
    public final j83 g;

    public q83(j83 j83Var) {
        j83Var.getClass();
        this.g = j83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && q83.class == obj.getClass() && j42.c(this.g, ((q83) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.g + ", direction=-1)";
    }
}
