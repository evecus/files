package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yk2 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ cl2 J;

    public /* synthetic */ yk2(cl2 cl2Var, byte b) {
        this.I = b;
        this.J = cl2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        cl2 cl2Var = this.J;
        switch (b) {
            case 0:
                m41 m41Var = cl2Var.K;
                if (m41Var != null) {
                    m41Var.setListSelectionHidden(true);
                    m41Var.requestLayout();
                    break;
                }
                break;
            default:
                m41 m41Var2 = cl2Var.K;
                if (m41Var2 != null && m41Var2.isAttachedToWindow() && cl2Var.K.getCount() > cl2Var.K.getChildCount() && cl2Var.K.getChildCount() <= cl2Var.U) {
                    cl2Var.g0.setInputMethodMode(2);
                    cl2Var.g();
                    break;
                }
                break;
        }
    }
}
