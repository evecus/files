package defpackage;

import android.os.Build;
import android.view.View;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ne2 implements in1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ t43 J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ ne2(bf2 bf2Var, l13 l13Var, oe2 oe2Var, t43 t43Var) {
        this.K = bf2Var;
        this.L = l13Var;
        this.M = oe2Var;
        this.J = t43Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l13 then;
        Object obj4;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj5 = de0.a;
        Object obj6 = this.M;
        Object obj7 = this.L;
        Object obj8 = this.K;
        switch (b) {
            case 0:
                bf2 bf2Var = (bf2) obj8;
                l13 l13Var = (l13) obj7;
                Object obj9 = (oe2) obj6;
                g94 g94Var = (g94) obj;
                ((Integer) obj3).getClass();
                go1 go1Var = (go1) ((fe0) obj2);
                Object Q = go1Var.Q();
                if (Q == obj5) {
                    Q = new le2(g94Var, new gu1(this.J, (byte) 1));
                    go1Var.o0(Q);
                }
                le2 le2Var = (le2) Q;
                Object Q2 = go1Var.Q();
                if (Q2 == obj5) {
                    Q2 = new vy4(new da(le2Var));
                    go1Var.o0(Q2);
                }
                vy4 vy4Var = (vy4) Q2;
                if (bf2Var != null) {
                    go1Var.d0(1743490539);
                    go1Var.d0(887527095);
                    String str = Build.FINGERPRINT;
                    if (str == null || !str.equals("robolectric")) {
                        go1Var.d0(1345729441);
                        View view = (View) go1Var.k(rb.f);
                        boolean g = go1Var.g(view);
                        Object Q3 = go1Var.Q();
                        if (g || Q3 == obj5) {
                            Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                            Object obj10 = tag instanceof ns3 ? (ns3) tag : null;
                            if (obj10 == null) {
                                obj10 = new se(view);
                                view.setTag(R.id.compose_prefetch_scheduler, obj10);
                            }
                            Q3 = obj10;
                            go1Var.o0(Q3);
                        }
                        obj4 = (ns3) Q3;
                        go1Var.q(false);
                    } else {
                        go1Var.d0(1345548711);
                        Object Q4 = go1Var.Q();
                        if (Q4 == obj5) {
                            Q4 = new os3();
                            go1Var.o0(Q4);
                        }
                        obj4 = (os3) Q4;
                        go1Var.q(false);
                    }
                    Object obj11 = obj4;
                    go1Var.q(false);
                    Object[] objArr = {bf2Var, le2Var, vy4Var, obj11};
                    boolean g2 = go1Var.g(bf2Var) | go1Var.i(le2Var) | go1Var.i(vy4Var) | go1Var.i(obj11);
                    Object Q5 = go1Var.Q();
                    if (g2 || Q5 == obj5) {
                        Object xgVar = new xg(bf2Var, le2Var, vy4Var, obj11, (byte) 1);
                        go1Var.o0(xgVar);
                        Q5 = xgVar;
                    }
                    mw2.g(objArr, (tm1) Q5, go1Var);
                    go1Var.q(false);
                } else {
                    go1Var.d0(1744076749);
                    go1Var.q(false);
                }
                int i = cf2.a;
                if (bf2Var != null && (then = l13Var.then(new ma5(bf2Var))) != null) {
                    l13Var = then;
                }
                boolean g3 = go1Var.g(le2Var) | go1Var.g(obj9);
                Object Q6 = go1Var.Q();
                if (g3 || Q6 == obj5) {
                    Q6 = new uh0(le2Var, obj9, (byte) 7);
                    go1Var.o0(Q6);
                }
                i42.Z(vy4Var, l13Var, (hn1) Q6, go1Var, 8);
                break;
            default:
                ab4 ab4Var = (ab4) obj8;
                hu2 hu2Var = (hu2) obj7;
                t43 t43Var = (t43) obj6;
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ui) obj).getClass();
                go1 go1Var2 = (go1) fe0Var;
                if (!go1Var2.T(intValue & 1, (intValue & 17) != 16)) {
                    go1Var2.W();
                    break;
                } else {
                    ku2 f = ou2.f(ab4Var);
                    boolean e = go1Var2.e(ab4Var.ordinal()) | go1Var2.i(hu2Var);
                    Object Q7 = go1Var2.Q();
                    if (e || Q7 == obj5) {
                        Object tt1Var = new tt1(ab4Var, hu2Var, this.J, t43Var, (byte) 0);
                        go1Var2.o0(tt1Var);
                        Q7 = tt1Var;
                    }
                    ou2.e(f, (tm1) Q7, null, go1Var2, 0);
                    break;
                }
        }
        return wd5Var;
    }

    public /* synthetic */ ne2(ab4 ab4Var, hu2 hu2Var, t43 t43Var, t43 t43Var2) {
        this.K = ab4Var;
        this.L = hu2Var;
        this.J = t43Var;
        this.M = t43Var2;
    }
}
