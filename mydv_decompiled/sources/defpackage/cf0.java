package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class cf0 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ cf0(Object obj, Object obj2, dn1 dn1Var, int i, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = dn1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        fj0 fj0Var = null;
        byte b2 = 1;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.L;
        Object obj4 = this.K;
        Object obj5 = this.J;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                hf0.a((qh3) obj5, (fg) obj4, (tc0) obj3, (fe0) obj, mu0.X(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                i42.J((hu2) obj5, (l13) obj4, (tm1) obj3, (fe0) obj, mu0.X(9));
                break;
            case 2:
                ((Integer) obj2).getClass();
                rt0.c((p63) obj5, (g94) obj4, (tc0) obj3, (fe0) obj, mu0.X(385));
                break;
            case 3:
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                p70.g0((dl0) obj5, null, null, new x73(floatValue, (jh4) obj4, (p63) obj3, null), 3);
                break;
            default:
                jz5 jz5Var = (jz5) obj5;
                be0 be0Var = (be0) obj4;
                tc0 tc0Var = (tc0) obj3;
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                byte b3 = 0;
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    AndroidComposeView androidComposeView = jz5Var.I;
                    boolean i = go1Var.i(jz5Var);
                    Object Q = go1Var.Q();
                    jp jpVar = de0.a;
                    if (i || Q == jpVar) {
                        Q = new iz5(jz5Var, fj0Var, b3);
                        go1Var.o0(Q);
                    }
                    mw2.h(go1Var, (hn1) Q, androidComposeView);
                    boolean i2 = go1Var.i(jz5Var);
                    Object Q2 = go1Var.Q();
                    if (i2 || Q2 == jpVar) {
                        Q2 = new iz5(jz5Var, fj0Var, b2);
                        go1Var.o0(Q2);
                    }
                    mw2.h(go1Var, (hn1) Q2, androidComposeView);
                    be0Var.a(androidComposeView, tc0Var, go1Var, 0);
                    break;
                }
        }
        return wd5Var;
    }

    public /* synthetic */ cf0(Object obj, Object obj2, Object obj3, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
    }
}
