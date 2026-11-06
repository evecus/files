package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mo implements hn1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ vo J;
    public final /* synthetic */ Context K;

    public /* synthetic */ mo(vo voVar, Context context) {
        this.J = voVar;
        this.K = context;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        vo voVar;
        wd5 wd5Var;
        wd5 wd5Var2;
        byte b = this.I;
        wd5 wd5Var3 = wd5.a;
        switch (b) {
            case 0:
                fe0 fe0Var = (fe0) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    go1 go1Var = (go1) fe0Var;
                    if (go1Var.F()) {
                        go1Var.W();
                        break;
                    }
                }
                i51 i51Var = ff0.b;
                Context context = this.K;
                ay3 a = i51Var.a(context);
                i51 i51Var2 = ff0.d;
                vo voVar2 = this.J;
                ay3 a2 = i51Var2.a(voVar2.f);
                i51 i51Var3 = gf0.a;
                Bundle bundle = (Bundle) voVar2.i.getValue();
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                mw2.c(new ay3[]{a, a2, i51Var3.a(bundle), ff0.c.a(voVar2.h.getValue())}, p70.u0(-1811403166, new mo(voVar2, context), fe0Var), fe0Var, 56);
                break;
            default:
                fe0 fe0Var2 = (fe0) obj;
                if ((3 & ((Integer) obj2).intValue()) == 2) {
                    go1 go1Var2 = (go1) fe0Var2;
                    if (go1Var2.F()) {
                        go1Var2.W();
                        break;
                    }
                }
                go1 go1Var3 = (go1) fe0Var2;
                Object Q = go1Var3.Q();
                Object obj3 = de0.a;
                if (Q == obj3) {
                    Q = ad4.w(new v11(0L));
                    go1Var3.o0(Q);
                }
                t43 t43Var = (t43) Q;
                Boolean bool = Boolean.FALSE;
                vo voVar3 = this.J;
                boolean i = go1Var3.i(voVar3);
                Context context2 = this.K;
                boolean i2 = go1Var3.i(context2) | i;
                Object Q2 = go1Var3.Q();
                if (i2 || Q2 == obj3) {
                    Object n6Var = new n6((Object) voVar3, context2, (Object) t43Var, (fj0) null, (byte) 2);
                    voVar = voVar3;
                    go1Var3.o0(n6Var);
                    Q2 = n6Var;
                } else {
                    voVar = voVar3;
                }
                if (((Boolean) ui4.n(go1Var3, (hn1) Q2, bool).getValue()).booleanValue()) {
                    go1Var3.d0(-1541018146);
                    Object Q3 = go1Var3.Q();
                    if (Q3 == obj3) {
                        wd5Var = null;
                        Object q40Var = new q40(new n6((Object) voVar.e, context2, (Object) voVar.f, (fj0) null, (byte) 3), l91.I, -2, ez.I);
                        go1Var3.o0(q40Var);
                        Q3 = q40Var;
                    } else {
                        wd5Var = null;
                    }
                    hn1 hn1Var = (hn1) wi4.f((zf1) Q3, wd5Var, go1Var3, 48, 2).getValue();
                    if (hn1Var == null) {
                        go1Var3.d0(-1540889931);
                        go1Var3.q(false);
                        wd5Var2 = wd5Var;
                    } else {
                        go1Var3.d0(-1540889930);
                        eg5.a(0, ((v11) t43Var.getValue()).a, go1Var3, hn1Var, voVar.g);
                        go1Var3.q(false);
                        wd5Var2 = wd5Var3;
                    }
                    if (wd5Var2 == null) {
                        go1Var3.d0(-1296630672);
                        e41.f(go1Var3, 0);
                        go1Var3.q(false);
                    } else {
                        go1Var3.d0(-1296636252);
                        go1Var3.q(false);
                    }
                    go1Var3.q(false);
                } else {
                    go1Var3.d0(-1540810446);
                    e41.f(go1Var3, 0);
                    go1Var3.q(false);
                }
                boolean i3 = go1Var3.i(voVar);
                Object Q4 = go1Var3.Q();
                if (i3 || Q4 == obj3) {
                    Q4 = new ce(voVar, (byte) 4);
                    go1Var3.o0(Q4);
                }
                mw2.L(go1Var3, (rm1) Q4);
                break;
        }
        return wd5Var3;
    }

    public /* synthetic */ mo(Context context, vo voVar) {
        this.K = context;
        this.J = voVar;
    }
}
