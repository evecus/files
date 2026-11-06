package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cs0 {
    public int a;
    public boolean b;
    public int c;
    public float d;
    public Object e;

    public static int a(uf2 uf2Var, boolean z) {
        return z ? ((vf2) o70.a1(uf2Var.l)).a + 1 : ((vf2) o70.T0(uf2Var.l)).a - 1;
    }

    public static int b(ld2 ld2Var, boolean z) {
        pg3 pg3Var = pg3.I;
        if (z) {
            md2 md2Var = (md2) o70.a1(ld2Var.n);
            return (ld2Var.r == pg3Var ? md2Var.s : md2Var.t) + 1;
        }
        md2 md2Var2 = (md2) o70.T0(ld2Var.n);
        return (ld2Var.r == pg3Var ? md2Var2.s : md2Var2.t) - 1;
    }
}
