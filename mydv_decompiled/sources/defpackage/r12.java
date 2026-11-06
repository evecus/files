package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class r12 extends wu5 implements Runnable, yd3, View.OnAttachStateChangeListener {
    public final dw5 K;
    public boolean L;
    public boolean M;
    public yv5 N;

    public r12(dw5 dw5Var) {
        super(!dw5Var.t ? 1 : 0);
        this.K = dw5Var;
    }

    @Override // defpackage.wu5
    public final void a(ev5 ev5Var) {
        this.L = false;
        this.M = false;
        yv5 yv5Var = this.N;
        if (ev5Var.a.b() > 0 && yv5Var != null) {
            vv5 vv5Var = yv5Var.a;
            dw5 dw5Var = this.K;
            dw5Var.s.f(oh4.v(vv5Var.i(8)));
            dw5Var.r.f(oh4.v(vv5Var.i(8)));
            dw5.b(dw5Var, yv5Var);
        }
        this.N = null;
    }

    @Override // defpackage.wu5
    public final void b(ev5 ev5Var) {
        this.L = true;
        this.M = true;
    }

    @Override // defpackage.wu5
    public final yv5 c(yv5 yv5Var, List list) {
        dw5 dw5Var = this.K;
        dw5.b(dw5Var, yv5Var);
        return dw5Var.t ? yv5.b : yv5Var;
    }

    @Override // defpackage.wu5
    public final da d(ev5 ev5Var, da daVar) {
        this.L = false;
        return daVar;
    }

    @Override // defpackage.yd3
    public final yv5 j(View view, yv5 yv5Var) {
        this.N = yv5Var;
        dw5 dw5Var = this.K;
        eh5 eh5Var = dw5Var.r;
        vv5 vv5Var = yv5Var.a;
        eh5Var.f(oh4.v(vv5Var.i(8)));
        if (this.L) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.M) {
            dw5Var.s.f(oh4.v(vv5Var.i(8)));
            dw5.b(dw5Var, yv5Var);
        }
        return dw5Var.t ? yv5.b : yv5Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.L) {
            this.L = false;
            this.M = false;
            yv5 yv5Var = this.N;
            if (yv5Var != null) {
                dw5 dw5Var = this.K;
                dw5Var.s.f(oh4.v(yv5Var.a.i(8)));
                dw5.b(dw5Var, yv5Var);
                this.N = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
