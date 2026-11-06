package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bg3 extends jg3 {
    public static final bg3 c = new bg3(0, 1, 1);

    @Override // defpackage.jg3
    public final void a(mo1 mo1Var, ap apVar, wr4 wr4Var, j34 j34Var, kg3 kg3Var) {
        x04 x04Var = (x04) mo1Var.d(0);
        n43 n43Var = j34Var.i;
        nl3 nl3Var = n43Var != null ? (nl3) n43Var.g(x04Var) : null;
        if (nl3Var != null) {
            ArrayList arrayList = j34Var.j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                j34Var.j = arrayList;
            }
            arrayList.add(j34Var.e);
            j34Var.e = nl3Var.J;
        }
    }
}
