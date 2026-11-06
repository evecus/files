package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fd4 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ List J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ tm1 L;

    public /* synthetic */ fd4(List list, boolean z, tm1 tm1Var, byte b) {
        this.I = b;
        this.J = list;
        this.K = z;
        this.L = tm1Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        tm1 tm1Var = this.L;
        boolean z = this.K;
        List list = this.J;
        switch (b) {
            case 0:
                kg2 kg2Var = (kg2) obj;
                kg2Var.getClass();
                kg2Var.a0(list.size(), new ee(new fa4((byte) 10), list, (byte) 22), new v30(list, (byte) 16), null, new tc0(-1466459515, new qo0((byte) 4, tm1Var, list), true));
                if (z) {
                    kg2Var.Z("loading_more", "loading", n84.O0, wx5.i);
                    break;
                }
                break;
            default:
                of2 of2Var = (of2) obj;
                of2Var.getClass();
                of2Var.a0(list.size(), new ee(new fa4((byte) 8), list, (byte) 24), new v30(list, (byte) 18), new tc0(2039820996, new qo0((byte) 5, tm1Var, list), true));
                if (z) {
                    of2Var.Z("loading_more", "loading", wx5.k);
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
