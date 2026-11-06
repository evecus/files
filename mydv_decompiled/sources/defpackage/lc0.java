package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class lc0 extends Dialog implements vi2, le3, k83, w94 {
    public xi2 I;
    public final da J;
    public final u05 K;
    public final u05 L;

    public lc0(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, i);
        final byte b = 1;
        this.J = new da(new v94(this, new q94(this, b)));
        final byte b2 = 0;
        this.K = new u05(new rm1(this) { // from class: kc0
            public final /* synthetic */ lc0 J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                byte b3 = b2;
                lc0 lc0Var = this.J;
                switch (b3) {
                    case 0:
                        ix0 ix0Var = new ix0();
                        lc0Var.a().c(ix0Var);
                        return ix0Var;
                    default:
                        return new je3(new h(lc0Var, (byte) 7));
                }
            }
        });
        this.L = new u05(new rm1(this) { // from class: kc0
            public final /* synthetic */ lc0 J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                byte b3 = b;
                lc0 lc0Var = this.J;
                switch (b3) {
                    case 0:
                        ix0 ix0Var = new ix0();
                        lc0Var.a().c(ix0Var);
                        return ix0Var;
                    default:
                        return new je3(new h(lc0Var, (byte) 7));
                }
            }
        });
    }

    public static final void e(lc0 lc0Var) {
        super.onBackPressed();
    }

    @Override // defpackage.k83
    public final ts0 a() {
        return b().b().c;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.le3
    public final je3 b() {
        return (je3) this.L.getValue();
    }

    public final xi2 c() {
        xi2 xi2Var = this.I;
        if (xi2Var != null) {
            return xi2Var;
        }
        xi2 xi2Var2 = new xi2(this, true);
        this.I = xi2Var2;
        return xi2Var2;
    }

    public final void d() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        ViewTreeLifecycleOwner.set(decorView, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        ViewTreeSavedStateRegistryOwner.set(decorView3, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.w94
    public final da g() {
        return (da) this.J.K;
    }

    @Override // defpackage.vi2
    public final li2 k() {
        return c();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((ix0) this.K.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            je3 b = b();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            b.c(onBackInvokedDispatcher);
        }
        this.J.p(bundle);
        c().e(ji2.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.J.q(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        c().e(ji2.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        c().e(ji2.ON_DESTROY);
        this.I = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.setContentView(view, layoutParams);
    }
}
