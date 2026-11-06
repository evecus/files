package defpackage;

import androidx.compose.runtime.Recomposer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class a14 {
    public static void a(c14 c14Var) {
        w43 w43Var;
        pm3 pm3Var;
        pm3 pm3Var2;
        w43 w43Var2;
        fw4 fw4Var;
        do {
            w43Var = Recomposer._runningRecomposers;
            pm3Var = (pm3) ((fw4) w43Var).getValue();
            bm3 bm3Var = pm3Var.K;
            ik2 ik2Var = (ik2) bm3Var.get(c14Var);
            if (ik2Var == null) {
                pm3Var2 = pm3Var;
            } else {
                Object obj = ik2Var.a;
                Object obj2 = ik2Var.b;
                sa5 sa5Var = bm3Var.I;
                sa5 v = sa5Var.v(c14Var != null ? c14Var.hashCode() : 0, 0, c14Var);
                if (sa5Var != v) {
                    bm3Var = v == null ? bm3.K : new bm3(v, bm3Var.J - 1);
                }
                q8 q8Var = q8.n0;
                if (obj != q8Var) {
                    Object obj3 = bm3Var.get(obj);
                    obj3.getClass();
                    bm3Var = bm3Var.b(obj, new ik2(((ik2) obj3).a, obj2));
                }
                if (obj2 != q8Var) {
                    Object obj4 = bm3Var.get(obj2);
                    obj4.getClass();
                    bm3Var = bm3Var.b(obj2, new ik2(obj, ((ik2) obj4).b));
                }
                Object obj5 = obj != q8Var ? pm3Var.I : obj2;
                if (obj2 != q8Var) {
                    obj = pm3Var.J;
                }
                pm3Var2 = new pm3(obj5, obj, bm3Var);
            }
            if (pm3Var == pm3Var2) {
                return;
            }
            w43Var2 = Recomposer._runningRecomposers;
            fw4Var = (fw4) w43Var2;
            fw4Var.getClass();
        } while (!fw4Var.i(pm3Var, pm3Var2));
    }
}
