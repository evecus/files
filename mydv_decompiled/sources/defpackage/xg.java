package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class xg implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ xg(n24 n24Var, a73 a73Var, i73 i73Var, Bundle bundle) {
        this.I = (byte) 2;
        this.M = n24Var;
        this.J = a73Var;
        this.K = i73Var;
        this.L = bundle;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        byte b2 = 1;
        Object obj2 = this.L;
        Object obj3 = this.K;
        Object obj4 = this.J;
        Object obj5 = this.M;
        switch (b) {
            case 0:
                bh bhVar = (bh) obj4;
                cj cjVar = (cj) obj3;
                tm1 tm1Var = (tm1) obj2;
                n24 n24Var = (n24) obj5;
                aj ajVar = (aj) obj;
                ad4.G(ajVar, bhVar.c);
                jk3 jk3Var = ajVar.e;
                Object b3 = bhVar.b(jk3Var.getValue());
                if (!j42.c(b3, jk3Var.getValue())) {
                    bhVar.c.J.setValue(b3);
                    cjVar.J.setValue(b3);
                    if (tm1Var != null) {
                        tm1Var.invoke(bhVar);
                    }
                    ajVar.a();
                    n24Var.I = true;
                } else if (tm1Var != null) {
                    tm1Var.invoke(bhVar);
                }
                return wd5Var;
            case 1:
                bf2 bf2Var = (bf2) obj4;
                bf2Var.c = new u92((le2) obj3, (vy4) obj2, (ns3) obj5);
                return new je2(bf2Var, b2);
            default:
                p63 p63Var = (p63) obj;
                p63Var.getClass();
                ((n24) obj5).I = true;
                ((a73) obj4).a((i73) obj3, (Bundle) obj2, p63Var, o91.I);
                return wd5Var;
        }
    }

    public /* synthetic */ xg(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
        this.M = obj4;
    }
}
