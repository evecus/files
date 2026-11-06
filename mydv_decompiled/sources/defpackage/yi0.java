package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yi0 {
    public final gt4 a = new gt4();

    public static void b(yi0 yi0Var, hn1 hn1Var, tc0 tc0Var, rm1 rm1Var, int i) {
        if ((i & 8) != 0) {
            tc0Var = null;
        }
        yi0Var.a.add(new tc0(-1789283891, new ku3(hn1Var, yi0Var, tc0Var, rm1Var, (byte) 2), true));
    }

    public final void a(xi0 xi0Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-798501095);
        int i2 = (go1Var.g(xi0Var) ? 4 : 2) | i | (go1Var.g(this) ? 32 : 16);
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            gt4 gt4Var = this.a;
            int size = gt4Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((in1) gt4Var.get(i3)).invoke(xi0Var, go1Var, Integer.valueOf(i2 & 14));
            }
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new bj1((byte) 7, i, this, xi0Var);
        }
    }
}
