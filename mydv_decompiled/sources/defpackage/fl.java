package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.github.mytv.dv.R;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fl implements Window.Callback {
    public final Window.Callback I;
    public boolean J;
    public boolean K;
    public boolean L;
    public final /* synthetic */ kl M;

    public fl(kl klVar, Window.Callback callback) {
        this.M = klVar;
        if (callback != null) {
            this.I = callback;
        } else {
            s83.t("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.J = true;
            callback.onContentChanged();
        } finally {
            this.J = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.I.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.I.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        g7.p(this.I, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.I.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.K;
        Window.Callback callback = this.I;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.M.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.I.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            kl klVar = this.M;
            klVar.z();
            qu5 qu5Var = klVar.V;
            if (qu5Var == null || !qu5Var.h(keyCode, keyEvent)) {
                jl jlVar = klVar.s0;
                if (jlVar == null || !klVar.E(jlVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (klVar.s0 == null) {
                        jl y = klVar.y(0);
                        klVar.F(y, keyEvent);
                        boolean E = klVar.E(y, keyEvent.getKeyCode(), keyEvent);
                        y.k = false;
                        if (E) {
                        }
                    }
                    return false;
                }
                jl jlVar2 = klVar.s0;
                if (jlVar2 != null) {
                    jlVar2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.I.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.I.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.I.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.I.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.I.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.I.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.J) {
            this.I.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof sx2)) {
            return this.I.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.I.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.I.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.I.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            kl klVar = this.M;
            klVar.z();
            qu5 qu5Var = klVar.V;
            if (qu5Var != null) {
                qu5Var.c(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.L) {
            this.I.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        kl klVar = this.M;
        if (i == 108) {
            klVar.z();
            qu5 qu5Var = klVar.V;
            if (qu5Var != null) {
                qu5Var.c(false);
                return;
            }
            return;
        }
        if (i == 0) {
            jl y = klVar.y(i);
            if (y.m) {
                klVar.r(y, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        x9.r(this.I, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        sx2 sx2Var = menu instanceof sx2 ? (sx2) menu : null;
        if (i == 0 && sx2Var == null) {
            return false;
        }
        if (sx2Var != null) {
            sx2Var.x(true);
        }
        boolean onPreparePanel = this.I.onPreparePanel(i, view, menu);
        if (sx2Var != null) {
            sx2Var.x(false);
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        sx2 sx2Var = this.M.y(0).h;
        if (sx2Var != null) {
            d(list, sx2Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.I.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.I.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.I.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        kl klVar = this.M;
        Context context = klVar.S;
        if (i != 0) {
            return this.I.onWindowStartingActionMode(callback, i);
        }
        mc3 mc3Var = new mc3(context, callback);
        y6 y6Var = klVar.b0;
        if (y6Var != null) {
            y6Var.a();
        }
        g12 g12Var = new g12(klVar, mc3Var);
        klVar.z();
        qu5 qu5Var = klVar.V;
        if (qu5Var != null) {
            klVar.b0 = qu5Var.m(g12Var);
        }
        if (klVar.b0 == null) {
            zr5 zr5Var = klVar.f0;
            if (zr5Var != null) {
                zr5Var.b();
            }
            y6 y6Var2 = klVar.b0;
            if (y6Var2 != null) {
                y6Var2.a();
            }
            byte b = 1;
            if (klVar.c0 == null) {
                if (klVar.o0) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        ej0 ej0Var = new ej0(context, 0);
                        ej0Var.getTheme().setTo(newTheme);
                        context = ej0Var;
                    }
                    klVar.c0 = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    klVar.d0 = popupWindow;
                    il2.c0(popupWindow);
                    klVar.d0.setContentView(klVar.c0);
                    klVar.d0.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    klVar.c0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    klVar.d0.setHeight(-2);
                    klVar.e0 = new bl(klVar, (byte) 0);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) klVar.h0.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        klVar.z();
                        qu5 qu5Var2 = klVar.V;
                        Context e = qu5Var2 != null ? qu5Var2.e() : null;
                        if (e != null) {
                            context = e;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        klVar.c0 = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (klVar.c0 != null) {
                zr5 zr5Var2 = klVar.f0;
                if (zr5Var2 != null) {
                    zr5Var2.b();
                }
                klVar.c0.e();
                qv4 qv4Var = new qv4(klVar.c0.getContext(), klVar.c0, g12Var);
                if (g12Var.M(qv4Var, qv4Var.d())) {
                    qv4Var.i();
                    klVar.c0.c(qv4Var);
                    klVar.b0 = qv4Var;
                    boolean z = klVar.g0 && (viewGroup = klVar.h0) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView = klVar.c0;
                    if (z) {
                        actionBarContextView.setAlpha(0.0f);
                        zr5 a = dr5.a(klVar.c0);
                        a.a(1.0f);
                        klVar.f0 = a;
                        a.d(new al(klVar, b));
                    } else {
                        actionBarContextView.setAlpha(1.0f);
                        klVar.c0.setVisibility(0);
                        if (klVar.c0.getParent() instanceof View) {
                            View view = (View) klVar.c0.getParent();
                            WeakHashMap weakHashMap = dr5.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (klVar.d0 != null) {
                        klVar.T.getDecorView().post(klVar.e0);
                    }
                } else {
                    klVar.b0 = null;
                }
            }
            klVar.H();
            klVar.b0 = klVar.b0;
        }
        klVar.H();
        y6 y6Var3 = klVar.b0;
        if (y6Var3 != null) {
            return mc3Var.c(y6Var3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.I.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
