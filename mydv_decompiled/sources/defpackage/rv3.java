package defpackage;

import com.github.mytv.dv.model.Aweme;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rv3 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ tm1 J;
    public final /* synthetic */ Aweme K;

    public /* synthetic */ rv3(tm1 tm1Var, Aweme aweme, byte b) {
        this.I = b;
        this.J = tm1Var;
        this.K = aweme;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Aweme aweme = this.K;
        tm1 tm1Var = this.J;
        switch (b) {
            case 0:
                tm1Var.invoke(aweme);
                break;
            case 1:
                tm1Var.invoke(aweme);
                break;
            default:
                if (tm1Var != null) {
                    tm1Var.invoke(aweme.getAuthor());
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
