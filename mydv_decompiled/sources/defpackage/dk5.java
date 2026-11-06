package defpackage;

import com.github.mytv.dv.model.Aweme;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dk5 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ t43 J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ dl0 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ boolean P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ t43 R;
    public final /* synthetic */ t43 S;
    public final /* synthetic */ Object T;
    public final /* synthetic */ t43 U;
    public final /* synthetic */ Object V;

    public /* synthetic */ dk5(t43 t43Var, t43 t43Var2, t43 t43Var3, tm1 tm1Var, dl0 dl0Var, ki1 ki1Var, t43 t43Var4, tm1 tm1Var2, t43 t43Var5, hk3 hk3Var, t43 t43Var6, boolean z, t43 t43Var7) {
        this.I = (byte) 2;
        this.J = t43Var;
        this.M = t43Var2;
        this.N = t43Var3;
        this.V = tm1Var;
        this.L = dl0Var;
        this.K = ki1Var;
        this.O = t43Var4;
        this.Q = tm1Var2;
        this.R = t43Var5;
        this.T = hk3Var;
        this.S = t43Var6;
        this.P = z;
        this.U = t43Var7;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj = this.T;
        Object obj2 = this.Q;
        Object obj3 = this.K;
        Object obj4 = this.V;
        switch (b) {
            case 0:
                t43 t43Var = this.J;
                on5.x0(t43Var, (kq5) obj3, this.L, this.M, this.N, this.O, this.P, (s33) obj2, this.R, this.S, (Aweme) obj, this.U, (t43) obj4, true);
                break;
            case 1:
                t43 t43Var2 = (t43) obj4;
                on5.x0(this.J, (kq5) obj3, this.L, this.M, this.N, this.O, this.P, (s33) obj2, this.R, this.S, (Aweme) obj, this.U, t43Var2, false);
                break;
            default:
                tm1 tm1Var = (tm1) obj4;
                ki1 ki1Var = (ki1) obj3;
                tm1 tm1Var2 = (tm1) obj2;
                hk3 hk3Var = (hk3) obj;
                t43 t43Var3 = this.J;
                if (((Boolean) t43Var3.getValue()).booleanValue()) {
                    t43Var3.setValue(Boolean.FALSE);
                }
                t43 t43Var4 = this.M;
                if (!((Boolean) t43Var4.getValue()).booleanValue()) {
                    t43 t43Var5 = this.N;
                    boolean booleanValue = ((Boolean) t43Var5.getValue()).booleanValue();
                    dl0 dl0Var = this.L;
                    if (!booleanValue) {
                        t43 t43Var6 = this.O;
                        if (!((Boolean) t43Var6.getValue()).booleanValue()) {
                            t43 t43Var7 = this.R;
                            if (!((Boolean) t43Var7.getValue()).booleanValue()) {
                                on5.A0(this.P, t43Var4, this.U);
                                break;
                            } else {
                                on5.M(t43Var7, hk3Var, this.S, ki1Var);
                                break;
                            }
                        } else {
                            on5.J(tm1Var2, dl0Var, t43Var6, ki1Var);
                            break;
                        }
                    } else {
                        on5.L(tm1Var, dl0Var, t43Var5, ki1Var, true);
                        break;
                    }
                } else {
                    t43Var4.setValue(Boolean.FALSE);
                    break;
                }
        }
        return wd5Var;
    }

    public /* synthetic */ dk5(t43 t43Var, kq5 kq5Var, dl0 dl0Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, boolean z, s33 s33Var, t43 t43Var5, t43 t43Var6, Aweme aweme, t43 t43Var7, t43 t43Var8, byte b) {
        this.I = b;
        this.J = t43Var;
        this.K = kq5Var;
        this.L = dl0Var;
        this.M = t43Var2;
        this.N = t43Var3;
        this.O = t43Var4;
        this.P = z;
        this.Q = s33Var;
        this.R = t43Var5;
        this.S = t43Var6;
        this.T = aweme;
        this.U = t43Var7;
        this.V = t43Var8;
    }
}
