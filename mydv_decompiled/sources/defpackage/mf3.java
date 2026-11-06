package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mf3 extends jg3 {
    public static final mf3 c = new mf3(0, 1, 1);

    @Override // defpackage.jg3
    public final void a(mo1 mo1Var, ap apVar, wr4 wr4Var, j34 j34Var, kg3 kg3Var) {
        b53 b53Var;
        x04 x04Var = (x04) mo1Var.d(0);
        n43 n43Var = j34Var.i;
        if (n43Var == null || ((nl3) n43Var.g(x04Var)) == null) {
            return;
        }
        ArrayList arrayList = j34Var.j;
        if (arrayList != null && (b53Var = (b53) arrayList.remove(arrayList.size() - 1)) != null) {
            j34Var.e = b53Var;
        }
        n43Var.k(x04Var);
    }
}
