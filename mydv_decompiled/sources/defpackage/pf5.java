package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pf5 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ dl0 J;
    public final /* synthetic */ t43 K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ hu2 N;
    public final /* synthetic */ it4 O;

    public /* synthetic */ pf5(dl0 dl0Var, t43 t43Var, t43 t43Var2, t43 t43Var3, hu2 hu2Var, it4 it4Var, byte b) {
        this.I = b;
        this.J = dl0Var;
        this.K = t43Var;
        this.L = t43Var2;
        this.M = t43Var3;
        this.N = hu2Var;
        this.O = it4Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                String str3 = (String) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                str3.getClass();
                t43 t43Var = this.K;
                if (!((Boolean) t43Var.getValue()).booleanValue()) {
                    t43Var.setValue(Boolean.TRUE);
                    str = booleanValue ? "正在点赞..." : "正在取消点赞...";
                    t43 t43Var2 = this.L;
                    t43Var2.setValue(str);
                    Boolean bool = Boolean.FALSE;
                    t43 t43Var3 = this.M;
                    t43Var3.setValue(bool);
                    hu2 hu2Var = this.N;
                    it4 it4Var = this.O;
                    dl0 dl0Var = this.J;
                    p70.g0(dl0Var, null, null, new zf5(hu2Var, str3, booleanValue, it4Var, dl0Var, t43Var2, t43Var3, t43Var, (fj0) null, (byte) 0), 3);
                    break;
                }
                break;
            case 1:
                String str4 = (String) obj;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                str4.getClass();
                t43 t43Var4 = this.K;
                if (!((Boolean) t43Var4.getValue()).booleanValue()) {
                    t43Var4.setValue(Boolean.TRUE);
                    str2 = booleanValue2 ? "正在收藏..." : "正在取消收藏...";
                    t43 t43Var5 = this.L;
                    t43Var5.setValue(str2);
                    Boolean bool2 = Boolean.FALSE;
                    t43 t43Var6 = this.M;
                    t43Var6.setValue(bool2);
                    hu2 hu2Var2 = this.N;
                    it4 it4Var2 = this.O;
                    dl0 dl0Var2 = this.J;
                    p70.g0(dl0Var2, null, null, new zf5(hu2Var2, str4, booleanValue2, it4Var2, dl0Var2, t43Var5, t43Var6, t43Var4, (fj0) null, (byte) 1), 3);
                    break;
                }
                break;
            case 2:
                String str5 = (String) obj;
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                str5.getClass();
                t43 t43Var7 = this.K;
                if (!((Boolean) t43Var7.getValue()).booleanValue()) {
                    t43Var7.setValue(Boolean.TRUE);
                    str = booleanValue3 ? "正在点赞..." : "正在取消点赞...";
                    t43 t43Var8 = this.L;
                    t43Var8.setValue(str);
                    Boolean bool3 = Boolean.FALSE;
                    t43 t43Var9 = this.M;
                    t43Var9.setValue(bool3);
                    hu2 hu2Var3 = this.N;
                    it4 it4Var3 = this.O;
                    dl0 dl0Var3 = this.J;
                    p70.g0(dl0Var3, null, null, new zf5(hu2Var3, str5, booleanValue3, it4Var3, dl0Var3, t43Var8, t43Var9, t43Var7, (fj0) null, (byte) 2), 3);
                    break;
                }
                break;
            default:
                String str6 = (String) obj;
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                str6.getClass();
                t43 t43Var10 = this.K;
                if (!((Boolean) t43Var10.getValue()).booleanValue()) {
                    t43Var10.setValue(Boolean.TRUE);
                    str2 = booleanValue4 ? "正在收藏..." : "正在取消收藏...";
                    t43 t43Var11 = this.L;
                    t43Var11.setValue(str2);
                    Boolean bool4 = Boolean.FALSE;
                    t43 t43Var12 = this.M;
                    t43Var12.setValue(bool4);
                    hu2 hu2Var4 = this.N;
                    it4 it4Var4 = this.O;
                    dl0 dl0Var4 = this.J;
                    p70.g0(dl0Var4, null, null, new zf5(hu2Var4, str6, booleanValue4, it4Var4, dl0Var4, t43Var11, t43Var12, t43Var10, (fj0) null, (byte) 3), 3);
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
