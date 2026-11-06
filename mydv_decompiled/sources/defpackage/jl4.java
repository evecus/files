package defpackage;

import com.github.mytv.dv.model.Aweme;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jl4 implements rm1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ t43 J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ jl4(t43 t43Var, Aweme aweme, boolean z, rm1 rm1Var, dl0 dl0Var, t43 t43Var2, t43 t43Var3, ki1 ki1Var) {
        this.J = t43Var;
        this.N = aweme;
        this.K = z;
        this.O = rm1Var;
        this.P = dl0Var;
        this.L = t43Var2;
        this.M = t43Var3;
        this.Q = ki1Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj = this.Q;
        t43 t43Var = this.M;
        t43 t43Var2 = this.L;
        Object obj2 = this.P;
        Object obj3 = this.O;
        boolean z = this.K;
        Object obj4 = this.N;
        t43 t43Var3 = this.J;
        switch (b) {
            case 0:
                dl4 dl4Var = (dl4) obj4;
                hu2 hu2Var = (hu2) obj3;
                t43 t43Var4 = (t43) obj2;
                t43 t43Var5 = (t43) obj;
                if (!z) {
                    if (!dl4Var.b()) {
                        hu2Var.H(dl4Var.a);
                        t43Var2.setValue(dl4Var.b);
                        t43Var.setValue(dl4Var.c);
                        t43Var4.setValue(dl4Var.f);
                        qm4.m(t43Var5, true);
                        break;
                    } else {
                        t43Var3.setValue(dl4Var);
                        break;
                    }
                }
                break;
            default:
                rm1 rm1Var = (rm1) obj3;
                dl0 dl0Var = (dl0) obj2;
                ki1 ki1Var = (ki1) obj;
                t43Var3.setValue(Boolean.FALSE);
                if (!jx4.L(((Aweme) obj4).getDesc())) {
                    Boolean bool = Boolean.TRUE;
                    t43Var2.setValue(bool);
                    t43Var.setValue(bool);
                    if (!z && rm1Var != null) {
                        rm1Var.invoke();
                    }
                    p70.g0(dl0Var, null, null, new oo0(ki1Var, null, (byte) 19), 3);
                    break;
                }
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ jl4(boolean z, dl4 dl4Var, hu2 hu2Var, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, t43 t43Var5) {
        this.K = z;
        this.N = dl4Var;
        this.O = hu2Var;
        this.J = t43Var;
        this.L = t43Var2;
        this.M = t43Var3;
        this.P = t43Var4;
        this.Q = t43Var5;
    }
}
