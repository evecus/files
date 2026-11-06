package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class mh3 extends q13 {
    @Override // defpackage.q13
    public final k13 create() {
        nh3 nh3Var = new nh3();
        nh3Var.K = null;
        return nh3Var;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mh3);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "overscroll";
        z12Var.c.b(null, "overscrollEffect");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        nh3 nh3Var = (nh3) k13Var;
        tt0 tt0Var = nh3Var.K;
        if (tt0Var != null) {
            nh3Var.k0(tt0Var);
        }
        nh3Var.K = null;
        nh3Var.K = null;
    }
}
