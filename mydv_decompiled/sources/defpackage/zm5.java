package defpackage;

import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.github.mytv.dv.model.Aweme;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zm5 extends k05 implements hn1 {
    public String I;
    public boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ String L;
    public final /* synthetic */ byte M;
    public final /* synthetic */ Aweme N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ t43 P;
    public final /* synthetic */ t43 Q;
    public final /* synthetic */ t43 R;
    public final /* synthetic */ s33 S;
    public final /* synthetic */ t43 T;
    public final /* synthetic */ s33 U;
    public final /* synthetic */ t43 V;
    public final /* synthetic */ t43 W;
    public final /* synthetic */ s33 X;
    public final /* synthetic */ t43 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zm5(boolean z, String str, int i, Aweme aweme, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, s33 s33Var, t43 t43Var5, s33 s33Var2, t43 t43Var6, t43 t43Var7, s33 s33Var3, t43 t43Var8, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = z;
        this.L = str;
        this.M = i;
        this.N = aweme;
        this.O = t43Var;
        this.P = t43Var2;
        this.Q = t43Var3;
        this.R = t43Var4;
        this.S = s33Var;
        this.T = t43Var5;
        this.U = s33Var2;
        this.V = t43Var6;
        this.W = t43Var7;
        this.X = s33Var3;
        this.Y = t43Var8;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new zm5(this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((zm5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z = this.J;
        byte b = this.M;
        String str2 = this.L;
        boolean z2 = this.K;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.P;
        t43 t43Var2 = this.O;
        if (!z) {
            mu0.V(obj);
            if (z2) {
                ta1 ta1Var = on5.a;
                if (((Boolean) t43Var2.getValue()).booleanValue() && ((String) t43Var.getValue()) == null) {
                    byte b2 = b < 1 ? (byte) 1 : b;
                    this.I = str2;
                    this.J = true;
                    Object n = rt0.n(b2 * 1000, this);
                    el0 el0Var = el0.I;
                    if (n == el0Var) {
                        return el0Var;
                    }
                    str = str2;
                }
            }
            return wd5Var;
        }
        if (!z) {
            zy.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = this.I;
        mu0.V(obj);
        if (j42.c(str, str2) && z2) {
            ta1 ta1Var2 = on5.a;
            if (((Boolean) t43Var2.getValue()).booleanValue()) {
                t43 t43Var3 = this.Q;
                if (!((Boolean) t43Var3.getValue()).booleanValue() && ((String) t43Var.getValue()) == null) {
                    Aweme aweme = this.N;
                    String awemeId = aweme.getAwemeId();
                    t43 t43Var4 = this.R;
                    pn5 pn5Var = (pn5) t43Var4.getValue();
                    s33 s33Var = this.S;
                    gk3 gk3Var = (gk3) s33Var;
                    Log.w("VideoItem", "首帧超时: awemeId=" + awemeId + " source=" + pn5Var + " attempt=" + gk3Var.h() + "/3 timeout=" + ((int) b) + CmcdData.STREAMING_FORMAT_SS);
                    Boolean bool = Boolean.FALSE;
                    t43Var2.setValue(bool);
                    this.T.setValue(bool);
                    int h = gk3Var.h();
                    pn5 pn5Var2 = pn5.I;
                    t43 t43Var5 = this.V;
                    s33 s33Var2 = this.U;
                    if (h < 3) {
                        on5.W(s33Var, gk3Var.h() + 1);
                        on5.c0(s33Var2, ((gk3) s33Var2).h() + 1);
                        t43Var3.setValue(bool);
                        if (((pn5) t43Var4.getValue()) == pn5Var2) {
                            t43Var5.setValue(Boolean.TRUE);
                            this.W.setValue(null);
                            gk3 gk3Var2 = (gk3) this.X;
                            gk3Var2.i(gk3Var2.h() + 1);
                            return wd5Var;
                        }
                    } else {
                        if (((pn5) t43Var4.getValue()) == pn5Var2) {
                            t43Var5.setValue(bool);
                            t43Var4.setValue(pn5.J);
                            on5.W(s33Var, 1);
                            on5.c0(s33Var2, ((gk3) s33Var2).h() + 1);
                            t43Var3.setValue(bool);
                            return wd5Var;
                        }
                        t43Var.setValue("加载超时");
                        on5.I(aweme, this.Y, "timeout");
                    }
                }
            }
        }
        return wd5Var;
    }
}
