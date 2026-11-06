package defpackage;

import com.github.mytv.dv.model.Aweme;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class hn implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ t43 J;

    public /* synthetic */ hn(t43 t43Var, byte b) {
        this.I = b;
        this.J = t43Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        oi1 oi1Var;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.J;
        switch (b) {
            case 0:
                oi1Var = (oi1) obj;
                oi1Var.getClass();
                break;
            case 1:
                return ((Aweme) ((List) t43Var.getValue()).get(((Integer) obj).intValue())).getAwemeId();
            default:
                oi1Var = (oi1) obj;
                oi1Var.getClass();
                break;
        }
        r7.I(oi1Var, t43Var);
        return wd5Var;
    }
}
