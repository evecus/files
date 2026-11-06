package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jd4 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ List J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ tm1 L;
    public final /* synthetic */ int M;

    public /* synthetic */ jd4(List list, boolean z, tm1 tm1Var, int i, byte b) {
        this.I = b;
        this.J = list;
        this.K = z;
        this.L = tm1Var;
        this.M = i;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        zw1 zw1Var = cd2.g;
        int i = this.M;
        tm1 tm1Var = this.L;
        boolean z = this.K;
        List list = this.J;
        cd2 cd2Var = (cd2) obj;
        cd2Var.getClass();
        switch (b) {
            case 0:
                fa4 fa4Var = new fa4((byte) 9);
                cd2Var.e.a(list.size(), new zc2(new ee(fa4Var, list, (byte) 25), zw1Var, new v30(list, (byte) 19), new tc0(-1942245546, new qo0((byte) 6, tm1Var, list), true)));
                if (z) {
                    cd2Var.Z(new ia((byte) 8, i), wx5.l);
                    break;
                }
                break;
            default:
                fa4 fa4Var2 = new fa4((byte) 11);
                cd2Var.e.a(list.size(), new zc2(new ee(fa4Var2, list, (byte) 19), zw1Var, new v30(list, (byte) 13), new tc0(-1942245546, new qo0((byte) 1, tm1Var, list), true)));
                if (z) {
                    cd2Var.Z(new ia((byte) 9, i), wx5.m);
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
