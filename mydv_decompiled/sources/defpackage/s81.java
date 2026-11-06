package defpackage;

import android.content.Context;
import coil3.ImageLoader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class s81 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s81(ab4 ab4Var, hu2 hu2Var, t43 t43Var, t43 t43Var2, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = ab4Var;
        this.K = hu2Var;
        this.L = t43Var;
        this.M = t43Var2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.M;
        Object obj3 = this.L;
        Object obj4 = this.K;
        switch (b) {
            case 0:
                s81 s81Var = new s81((ArrayList) obj4, (Context) obj3, (ImageLoader) obj2, fj0Var);
                s81Var.J = obj;
                return s81Var;
            default:
                return new s81((ab4) this.J, (hu2) obj4, (t43) obj3, (t43) obj2, fj0Var);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 0:
                ((s81) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((s81) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = 0;
        Object obj2 = this.K;
        Object obj3 = this.L;
        Object obj4 = this.M;
        switch (b) {
            case 0:
                dl0 dl0Var = (dl0) this.J;
                mu0.V(obj);
                ArrayList arrayList = (ArrayList) obj2;
                Context context = (Context) obj3;
                ImageLoader imageLoader = (ImageLoader) obj4;
                int size = arrayList.size();
                while (i < size) {
                    Object obj5 = arrayList.get(i);
                    i++;
                    os0 os0Var = sx0.a;
                    p70.g0(dl0Var, ur0.I, null, new r81((String) obj5, context, imageLoader, null), 2);
                }
                break;
            default:
                t43 t43Var = (t43) obj4;
                mu0.V(obj);
                List list = ou2.a;
                ab4 ab4Var = (ab4) this.J;
                if (list.contains(ab4Var)) {
                    ((t43) obj3).setValue(ab4Var);
                }
                hu2 hu2Var = (hu2) obj2;
                ab4 ab4Var2 = (ab4) t43Var.getValue();
                gx3 gx3Var = hu2Var.p;
                ab4Var.getClass();
                fw4 fw4Var = hu2Var.v;
                fw4Var.getClass();
                fw4Var.i(null, ab4Var);
                if (mw2.J(ab4Var)) {
                    hu2Var.c.c(ab4Var.name(), "navigation.currentTopLevelScreen");
                }
                ab4 ab4Var3 = ab4.R;
                ab4 ab4Var4 = ab4.S;
                ab4 ab4Var5 = ab4.T;
                ab4 ab4Var6 = ab4.P;
                if (ab4Var2 == ab4Var6 && ab4Var != ab4Var6 && ab4Var != ab4Var3 && ab4Var != ab4Var4 && ab4Var != ab4Var5) {
                    gx3Var.Q();
                }
                if (ab4Var2 == ab4Var3 && ab4Var != ab4Var3 && ab4Var != ab4Var4 && ab4Var != ab4Var5) {
                    gx3Var.Q();
                }
                if (ab4Var2 == ab4Var4 && ab4Var != ab4Var4 && ab4Var != ab4Var5) {
                    gx3Var.H0.h(null);
                    gx3Var.J0.i(null, o91.I);
                    gx3Var.N0.i(null, p91.I);
                    gx3Var.P0 = 0L;
                    gx3Var.Q0 = true;
                    gx3Var.R0 = false;
                }
                if (ab4Var2 == ab4Var5 && ab4Var != ab4Var5 && ab4Var != ab4Var3) {
                    gx3Var.q();
                }
                t43Var.setValue(ab4Var);
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s81(ArrayList arrayList, Context context, ImageLoader imageLoader, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = arrayList;
        this.L = context;
        this.M = imageLoader;
    }
}
