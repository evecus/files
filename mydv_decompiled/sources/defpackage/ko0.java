package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ko0 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ k80 J;

    public /* synthetic */ ko0(k80 k80Var, byte b) {
        this.I = b;
        this.J = k80Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        k80 k80Var = this.J;
        switch (b) {
            case 0:
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    r55.b("输入要屏蔽的词", null, k80Var.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, go1Var, 6, 0, 262138);
                    break;
                }
            default:
                fe0 fe0Var2 = (fe0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    go1Var2.W();
                    break;
                } else {
                    r55.b("输入配置名称...", null, k80Var.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, go1Var2, 6, 0, 262138);
                    break;
                }
        }
        return wd5Var;
    }
}
