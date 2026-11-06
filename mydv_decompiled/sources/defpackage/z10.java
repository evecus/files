package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class z10 implements Runnable {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public z10(uu2 uu2Var, a20 a20Var, ky2 ky2Var, sx2 sx2Var) {
        this.M = uu2Var;
        this.J = a20Var;
        this.K = ky2Var;
        this.L = sx2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        Object obj = this.M;
        Object obj2 = this.L;
        Object obj3 = this.K;
        Object obj4 = this.J;
        switch (b) {
            case 0:
                b20 b20Var = (b20) ((uu2) obj).I;
                ky2 ky2Var = (ky2) obj3;
                a20 a20Var = (a20) obj4;
                if (a20Var != null) {
                    b20Var.h0 = true;
                    a20Var.b.d(false);
                    b20Var.h0 = false;
                }
                if (ky2Var.isEnabled() && ky2Var.hasSubMenu()) {
                    ((sx2) obj2).r(ky2Var, null, 4);
                    break;
                }
                break;
            default:
                zu5.i((View) obj4, (ev5) obj3, (da) obj2);
                ((ValueAnimator) obj).start();
                break;
        }
    }

    public z10(View view, ev5 ev5Var, da daVar, ValueAnimator valueAnimator) {
        this.J = view;
        this.K = ev5Var;
        this.L = daVar;
        this.M = valueAnimator;
    }
}
