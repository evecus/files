package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class eg3 extends jg3 {
    public static final eg3 c = new eg3(1, 0, 2);

    @Override // defpackage.jg3
    public final void a(mo1 mo1Var, ap apVar, wr4 wr4Var, j34 j34Var, kg3 kg3Var) {
        int c2 = mo1Var.c(0);
        int i = wr4Var.v;
        int O = wr4Var.O(wr4Var.q(i), wr4Var.b);
        int f = wr4Var.f(wr4Var.q(i + 1), wr4Var.b);
        for (int max = Math.max(O, f - c2); max < f; max++) {
            Object obj = wr4Var.c[wr4Var.g(max)];
            if (obj instanceof lo1) {
                j34Var.e((lo1) obj);
            } else if (obj instanceof x04) {
                ((x04) obj).c();
            }
        }
        if (c2 <= 0) {
            ke0.a("Check failed");
        }
        int i2 = wr4Var.v;
        int O2 = wr4Var.O(wr4Var.q(i2), wr4Var.b);
        int f2 = wr4Var.f(wr4Var.q(i2 + 1), wr4Var.b) - c2;
        if (f2 < O2) {
            ke0.a("Check failed");
        }
        wr4Var.K(f2, c2, i2);
        int i3 = wr4Var.i;
        if (i3 >= O2) {
            wr4Var.i = i3 - c2;
        }
    }
}
