package defpackage;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class p85 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Toolbar J;

    public /* synthetic */ p85(Toolbar toolbar, byte b) {
        this.I = b;
        this.J = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        Toolbar toolbar = this.J;
        switch (b) {
            case 0:
                r85 r85Var = toolbar.w0;
                ky2 ky2Var = r85Var == null ? null : r85Var.J;
                if (ky2Var != null) {
                    ky2Var.collapseActionView();
                    break;
                }
                break;
            default:
                toolbar.m();
                break;
        }
    }
}
