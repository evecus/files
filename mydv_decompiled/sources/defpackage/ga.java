package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ga implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ r24 J;

    public /* synthetic */ ga(r24 r24Var, byte b) {
        this.I = b;
        this.J = r24Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        boolean focusSearch$lambda$1;
        byte b = this.I;
        boolean z = true;
        r24 r24Var = this.J;
        switch (b) {
            case 0:
                focusSearch$lambda$1 = AndroidComposeView.focusSearch$lambda$1(r24Var, (ui1) obj);
                return Boolean.valueOf(focusSearch$lambda$1);
            case 1:
                jp1 jp1Var = (jp1) obj;
                if (j42.c(jp1Var.E(), "waiting")) {
                    r24Var.I = jp1Var;
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                lv1 lv1Var = (lv1) obj;
                Object obj2 = r24Var.I;
                if (obj2 == null && lv1Var.K) {
                    r24Var.I = lv1Var;
                } else if (obj2 != null) {
                    lv1Var.getClass();
                }
                return Boolean.TRUE;
            default:
                tt0 tt0Var = (la5) obj;
                if (((k13) tt0Var).getNode().isAttached()) {
                    r24Var.I = tt0Var;
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
