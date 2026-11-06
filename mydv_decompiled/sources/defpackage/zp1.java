package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zp1 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ gq1 J;
    public final /* synthetic */ int[] K;

    public /* synthetic */ zp1(gq1 gq1Var, int[] iArr, byte b) {
        this.I = b;
        this.J = gq1Var;
        this.K = iArr;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int[] iArr = this.K;
        gq1 gq1Var = this.J;
        mb2 mb2Var = (mb2) obj;
        switch (b) {
            case 0:
                nb2 q = ob2.q();
                String canonicalName = gq1Var.getClass().getCanonicalName();
                q.d();
                ((ob2) q.J).r(canonicalName);
                List n1 = dq.n1(iArr);
                q.d();
                ((ob2) q.J).m(n1);
                ob2 ob2Var = (ob2) q.b();
                mb2Var.d();
                ((zb2) mb2Var.J).z(ob2Var);
                break;
            default:
                xb2 q2 = yb2.q();
                String canonicalName2 = gq1Var.getClass().getCanonicalName();
                q2.d();
                ((yb2) q2.J).r(canonicalName2);
                List n12 = dq.n1(iArr);
                q2.d();
                ((yb2) q2.J).m(n12);
                yb2 yb2Var = (yb2) q2.b();
                mb2Var.d();
                ((zb2) mb2Var.J).E(yb2Var);
                break;
        }
        return wd5Var;
    }
}
