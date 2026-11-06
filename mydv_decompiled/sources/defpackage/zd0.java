package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class zd0 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ be0 J;
    public final /* synthetic */ AndroidComposeView K;
    public final /* synthetic */ tc0 L;

    public /* synthetic */ zd0(be0 be0Var, AndroidComposeView androidComposeView, tc0 tc0Var, int i) {
        this.J = be0Var;
        this.K = androidComposeView;
        this.L = tc0Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        tc0 tc0Var = this.L;
        AndroidComposeView androidComposeView = this.K;
        be0 be0Var = this.J;
        fe0 fe0Var = (fe0) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int intValue = num.intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    go1Var.d0(866651995);
                    hf0.a(androidComposeView, be0Var.l, tc0Var, go1Var, 0);
                    go1Var.q(false);
                    break;
                }
            default:
                num.getClass();
                be0Var.a(androidComposeView, tc0Var, fe0Var, mu0.X(1));
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ zd0(AndroidComposeView androidComposeView, be0 be0Var, tc0 tc0Var) {
        this.K = androidComposeView;
        this.J = be0Var;
        this.L = tc0Var;
    }
}
