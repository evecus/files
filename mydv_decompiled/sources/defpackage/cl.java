package defpackage;

import android.view.Window;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cl implements uy2 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ kl J;

    public /* synthetic */ cl(kl klVar, byte b) {
        this.I = b;
        this.J = klVar;
    }

    @Override // defpackage.uy2
    public final void a(sx2 sx2Var, boolean z) {
        jl jlVar;
        byte b = this.I;
        kl klVar = this.J;
        switch (b) {
            case 0:
                klVar.q(sx2Var);
                break;
            default:
                sx2 l = sx2Var.l();
                int i = 0;
                boolean z2 = l != sx2Var;
                if (z2) {
                    sx2Var = l;
                }
                jl[] jlVarArr = klVar.r0;
                int length = jlVarArr != null ? jlVarArr.length : 0;
                while (true) {
                    if (i >= length) {
                        jlVar = null;
                    } else {
                        jlVar = jlVarArr[i];
                        if (jlVar == null || jlVar.h != sx2Var) {
                            i++;
                        }
                    }
                }
                if (jlVar != null) {
                    if (!z2) {
                        klVar.r(jlVar, z);
                        break;
                    } else {
                        klVar.p(jlVar.a, jlVar, l);
                        klVar.r(jlVar, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.uy2
    public final boolean k(sx2 sx2Var) {
        Window.Callback callback;
        byte b = this.I;
        kl klVar = this.J;
        switch (b) {
            case 0:
                Window.Callback callback2 = klVar.T.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, sx2Var);
                    break;
                }
                break;
            default:
                if (sx2Var == sx2Var.l() && klVar.l0 && (callback = klVar.T.getCallback()) != null && !klVar.w0) {
                    callback.onMenuOpened(108, sx2Var);
                    break;
                }
                break;
        }
        return true;
    }
}
