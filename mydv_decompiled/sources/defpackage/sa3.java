package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class sa3 {
    public final b53 a = new b53(new ga3[16]);
    public final e43 b = new e43(10);

    public boolean a(bs2 bs2Var, ca2 ca2Var, s32 s32Var, boolean z) {
        b53 b53Var = this.a;
        Object[] objArr = b53Var.I;
        int i = b53Var.K;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((ga3) objArr[i2]).a(bs2Var, ca2Var, s32Var, z) || z2;
        }
        return z2;
    }

    public void b(s32 s32Var) {
        b53 b53Var = this.a;
        int i = b53Var.K;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((ga3) b53Var.I[i]).d.l()) {
                b53Var.l(i);
            }
        }
    }
}
