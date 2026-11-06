package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class rm4 implements ag1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ wm4 J;

    public /* synthetic */ rm4(wm4 wm4Var, byte b) {
        this.I = b;
        this.J = wm4Var;
    }

    @Override // defpackage.ag1
    public final Object emit(Object obj, fj0 fj0Var) {
        Object obj2;
        Object obj3;
        Object obj4;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        wm4 wm4Var = this.J;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                fw4 fw4Var = wm4Var.q;
                fw4Var.getClass();
                fw4Var.i(null, bool);
                break;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                fw4 fw4Var2 = wm4Var.Z;
                Iterator it = vo0.M.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((vo0) obj2).J == floatValue) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                vo0 vo0Var = (vo0) obj2;
                if (vo0Var == null) {
                    vo0Var = vo0.K;
                }
                fw4Var2.getClass();
                fw4Var2.i(null, vo0Var);
                break;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                fw4 fw4Var3 = wm4Var.h0;
                fw4Var3.getClass();
                fw4Var3.i(null, bool2);
                break;
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                fw4 fw4Var4 = wm4Var.s;
                fw4Var4.getClass();
                fw4Var4.i(null, bool3);
                break;
            case 4:
                wm4Var.u.h((an2) obj);
                break;
            case 5:
                float floatValue2 = ((Number) obj).floatValue();
                fw4 fw4Var5 = wm4Var.N;
                Float f = new Float(ut0.q(floatValue2, 0.01f, 1.0f));
                fw4Var5.getClass();
                fw4Var5.i(null, f);
                break;
            case 6:
                float floatValue3 = ((Number) obj).floatValue();
                fw4 fw4Var6 = wm4Var.J;
                Iterator it2 = on.a().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (((on) obj3).b() == floatValue3) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                on onVar = (on) obj3;
                if (onVar == null) {
                    onVar = on.K;
                }
                fw4Var6.getClass();
                fw4Var6.i(null, onVar);
                break;
            case 7:
                int r = ut0.r(((Number) obj).intValue(), 1, 100);
                fw4 fw4Var7 = wm4Var.P;
                Integer num = new Integer(r);
                fw4Var7.getClass();
                fw4Var7.i(null, num);
                fw4 fw4Var8 = wm4Var.R;
                ro0 o = oh4.o(r / 100.0f);
                fw4Var8.getClass();
                fw4Var8.i(null, o);
                break;
            case 8:
                float floatValue4 = ((Number) obj).floatValue();
                fw4 fw4Var9 = wm4Var.T;
                Float f2 = new Float(ut0.q(floatValue4, 0.5f, 2.0f));
                fw4Var9.getClass();
                fw4Var9.i(null, f2);
                break;
            case 9:
                float floatValue5 = ((Number) obj).floatValue();
                fw4 fw4Var10 = wm4Var.V;
                Float f3 = new Float(ut0.q(floatValue5, 0.5f, 2.0f));
                fw4Var10.getClass();
                fw4Var10.i(null, f3);
                break;
            default:
                float floatValue6 = ((Number) obj).floatValue();
                fw4 fw4Var11 = wm4Var.X;
                Iterator it3 = so0.M.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj4 = it3.next();
                        if (((so0) obj4).J == floatValue6) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                so0 so0Var = (so0) obj4;
                if (so0Var == null) {
                    so0Var = so0.K;
                }
                fw4Var11.getClass();
                fw4Var11.i(null, so0Var);
                break;
        }
        return wd5Var;
    }
}
