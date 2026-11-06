package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class gu1 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ t43 J;

    public /* synthetic */ gu1(t43 t43Var, byte b) {
        this.I = b;
        this.J = t43Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        t43 t43Var = this.J;
        switch (b) {
            case 0:
                t43Var.setValue(null);
                return wd5.a;
            case 1:
                return (me2) ((rm1) t43Var.getValue()).invoke();
            case 2:
                return Integer.valueOf(((List) t43Var.getValue()).size());
            default:
                Boolean bool = (Boolean) t43Var.getValue();
                bool.getClass();
                return bool;
        }
    }
}
