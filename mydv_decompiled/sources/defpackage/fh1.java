package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fh1 {
    public final void a(a42 a42Var, a42 a42Var2, long j) {
        long v = dq2.v(j, lb2.I);
        if (a42Var != null) {
            int p = a42Var.p(dh0.g(v));
            new k22(k22.a(p, a42Var.Q(p)));
        }
        if (a42Var2 != null) {
            int p2 = a42Var2.p(dh0.g(v));
            new k22(k22.a(p2, a42Var2.Q(p2)));
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fh1);
    }

    public final int hashCode() {
        return dh1.I.hashCode() * 961;
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + dh1.I + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
