package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vf3 extends jg3 {
    public static final vf3 c = new vf3(0, 1, 1);

    @Override // defpackage.jg3
    public final void a(mo1 mo1Var, ap apVar, wr4 wr4Var, j34 j34Var, kg3 kg3Var) {
        x04 x04Var = (x04) mo1Var.d(0);
        Set set = j34Var.a;
        if (set == null) {
            return;
        }
        nl3 nl3Var = new nl3(set);
        n43 n43Var = j34Var.i;
        if (n43Var == null) {
            long[] jArr = ia4.a;
            n43Var = new n43();
            j34Var.i = n43Var;
        }
        n43Var.m(x04Var, nl3Var);
        j34Var.e.c(new lo1(nl3Var, -1));
    }
}
