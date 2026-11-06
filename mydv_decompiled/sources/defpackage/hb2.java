package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class hb2 extends ta2 {
    public final /* synthetic */ kb2 b;
    public final /* synthetic */ hn1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb2(kb2 kb2Var, hn1 hn1Var, String str) {
        super(str);
        this.b = kb2Var;
        this.c = hn1Var;
    }

    @Override // defpackage.uw2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo35measure3p2s80s(ww2 ww2Var, List list, long j) {
        kb2 kb2Var = this.b;
        eb2 eb2Var = kb2Var.P;
        eb2Var.I = ww2Var.getLayoutDirection();
        eb2Var.J = ww2Var.getDensity();
        eb2Var.K = ww2Var.L();
        boolean N = ww2Var.N();
        hn1 hn1Var = this.c;
        if (N || kb2Var.I.P == null) {
            kb2Var.L = 0;
            vw2 vw2Var = (vw2) hn1Var.invoke(eb2Var, new dh0(j));
            return new gb2(vw2Var, kb2Var, kb2Var.L, vw2Var);
        }
        kb2Var.M = 0;
        vw2 vw2Var2 = (vw2) hn1Var.invoke(kb2Var.Q, new dh0(j));
        return new fb2(vw2Var2, kb2Var, kb2Var.M, vw2Var2);
    }
}
