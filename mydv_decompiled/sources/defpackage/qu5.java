package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qu5 implements i6 {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public wp0 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public pu5 i;
    public pu5 j;
    public g12 k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public bs5 s;
    public boolean t;
    public boolean u;
    public final ou5 v;
    public final ou5 w;
    public final g73 x;

    public qu5(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new ou5(this, (byte) 0);
        this.w = new ou5(this, (byte) 1);
        this.x = new g73((Object) this, (byte) 19);
        View decorView = activity.getWindow().getDecorView();
        f(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z2) {
        zr5 k;
        zr5 zr5Var;
        boolean z3 = this.q;
        if (z2) {
            if (!z3) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                n(false);
            }
        } else if (z3) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            n(false);
        }
        boolean isLaidOut = this.d.isLaidOut();
        wp0 wp0Var = this.e;
        if (!isLaidOut) {
            if (z2) {
                ((y85) wp0Var).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((y85) wp0Var).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            y85 y85Var = (y85) wp0Var;
            k = dr5.a(y85Var.a);
            k.a(0.0f);
            k.c(100L);
            k.d(new x85(y85Var, 4));
            zr5Var = this.f.k(0, 200L);
        } else {
            y85 y85Var2 = (y85) wp0Var;
            zr5 a = dr5.a(y85Var2.a);
            a.a(1.0f);
            a.c(200L);
            a.d(new x85(y85Var2, 0));
            k = this.f.k(8, 100L);
            zr5Var = a;
        }
        bs5 bs5Var = new bs5();
        ArrayList arrayList = bs5Var.a;
        arrayList.add(k);
        View view = (View) k.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) zr5Var.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(zr5Var);
        bs5Var.b();
    }

    public final boolean b() {
        r85 r85Var;
        wp0 wp0Var = this.e;
        if (wp0Var == null || (r85Var = ((y85) wp0Var).a.w0) == null || r85Var.J == null) {
            return false;
        }
        r85 r85Var2 = ((y85) wp0Var).a.w0;
        ky2 ky2Var = r85Var2 == null ? null : r85Var2.J;
        if (ky2Var == null) {
            return true;
        }
        ky2Var.collapseActionView();
        return true;
    }

    public final void c(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        ArrayList arrayList = this.m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        zl1.c();
    }

    public final int d() {
        return ((y85) this.e).b;
    }

    public final Context e() {
        Context context = this.b;
        if (context != null) {
            return context;
        }
        TypedValue typedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(com.github.mytv.dv.R.attr.actionBarWidgetTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.a, i);
            this.b = contextThemeWrapper;
            return contextThemeWrapper;
        }
        Context context2 = this.a;
        this.b = context2;
        return context2;
    }

    public final void f(View view) {
        wp0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.github.mytv.dv.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.github.mytv.dv.R.id.action_bar);
        if (findViewById instanceof wp0) {
            wrapper = (wp0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(com.github.mytv.dv.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.github.mytv.dv.R.id.action_bar_container);
        this.d = actionBarContainer;
        wp0 wp0Var = this.e;
        if (wp0Var == null || this.f == null || actionBarContainer == null) {
            zy.i(qu5.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((y85) wp0Var).a.getContext();
        this.a = context;
        if ((((y85) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        j(context.getResources().getBoolean(com.github.mytv.dv.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, qz3.a, com.github.mytv.dv.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.O) {
                zy.i("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.u = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = dr5.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void g() {
        j(this.a.getResources().getBoolean(com.github.mytv.dv.R.bool.abc_action_bar_embed_tabs));
    }

    public final boolean h(int i, KeyEvent keyEvent) {
        sx2 sx2Var;
        pu5 pu5Var = this.i;
        if (pu5Var == null || (sx2Var = pu5Var.L) == null) {
            return false;
        }
        sx2Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return sx2Var.performShortcut(i, keyEvent, 0);
    }

    public final void i(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        y85 y85Var = (y85) this.e;
        int i2 = y85Var.b;
        this.h = true;
        y85Var.a((i & 4) | (i2 & (-5)));
    }

    public final void j(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((y85) this.e).getClass();
        } else {
            ((y85) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((y85) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void k(boolean z2) {
        bs5 bs5Var;
        this.t = z2;
        if (z2 || (bs5Var = this.s) == null) {
            return;
        }
        bs5Var.a();
    }

    public final void l(CharSequence charSequence) {
        y85 y85Var = (y85) this.e;
        if (y85Var.g) {
            return;
        }
        Toolbar toolbar = y85Var.a;
        y85Var.h = charSequence;
        if ((y85Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (y85Var.g) {
                dr5.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final pu5 m(g12 g12Var) {
        pu5 pu5Var = this.i;
        if (pu5Var != null) {
            pu5Var.a();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.e();
        pu5 pu5Var2 = new pu5(this, this.f.getContext(), g12Var);
        sx2 sx2Var = pu5Var2.L;
        sx2Var.z();
        try {
            if (!((mc3) pu5Var2.M.J).l(pu5Var2, sx2Var)) {
                return null;
            }
            this.i = pu5Var2;
            pu5Var2.i();
            this.f.c(pu5Var2);
            a(true);
            return pu5Var2;
        } finally {
            sx2Var.y();
        }
    }

    public final void n(boolean z2) {
        boolean z3 = this.q || !this.p;
        boolean z4 = this.r;
        final g73 g73Var = this.x;
        View view = this.g;
        if (!z3) {
            if (z4) {
                this.r = false;
                bs5 bs5Var = this.s;
                if (bs5Var != null) {
                    bs5Var.a();
                }
                int i = this.n;
                ou5 ou5Var = this.v;
                if (i != 0 || (!this.t && !z2)) {
                    ou5Var.c();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                bs5 bs5Var2 = new bs5();
                float f = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                zr5 a = dr5.a(this.d);
                a.e(f);
                final View view2 = (View) a.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(g73Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: xr5
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((qu5) g73.this.J).d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z5 = bs5Var2.e;
                ArrayList arrayList = bs5Var2.a;
                if (!z5) {
                    arrayList.add(a);
                }
                if (this.o && view != null) {
                    zr5 a2 = dr5.a(view);
                    a2.e(f);
                    if (!bs5Var2.e) {
                        arrayList.add(a2);
                    }
                }
                boolean z6 = bs5Var2.e;
                if (!z6) {
                    bs5Var2.c = y;
                }
                if (!z6) {
                    bs5Var2.b = 250L;
                }
                if (!z6) {
                    bs5Var2.d = ou5Var;
                }
                this.s = bs5Var2;
                bs5Var2.b();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.r = true;
        bs5 bs5Var3 = this.s;
        if (bs5Var3 != null) {
            bs5Var3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        ou5 ou5Var2 = this.w;
        if (i2 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.d.setTranslationY(f2);
            bs5 bs5Var4 = new bs5();
            zr5 a3 = dr5.a(this.d);
            a3.e(0.0f);
            final View view3 = (View) a3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(g73Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: xr5
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((qu5) g73.this.J).d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z7 = bs5Var4.e;
            ArrayList arrayList2 = bs5Var4.a;
            if (!z7) {
                arrayList2.add(a3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                zr5 a4 = dr5.a(view);
                a4.e(0.0f);
                if (!bs5Var4.e) {
                    arrayList2.add(a4);
                }
            }
            boolean z8 = bs5Var4.e;
            if (!z8) {
                bs5Var4.c = z;
            }
            if (!z8) {
                bs5Var4.b = 250L;
            }
            if (!z8) {
                bs5Var4.d = ou5Var2;
            }
            this.s = bs5Var4;
            bs5Var4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            ou5Var2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = dr5.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public qu5(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new ou5(this, (byte) 0);
        this.w = new ou5(this, (byte) 1);
        this.x = new g73((Object) this, (byte) 19);
        f(dialog.getWindow().getDecorView());
    }
}
