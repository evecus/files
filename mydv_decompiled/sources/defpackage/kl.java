package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class kl extends xk implements qx2, LayoutInflater.Factory2 {
    public static final oo4 N0 = new oo4(0);
    public static final int[] O0 = {R.attr.windowBackground};
    public static final boolean P0 = !"robolectric".equals(Build.FINGERPRINT);
    public int A0;
    public boolean B0;
    public gl C0;
    public gl D0;
    public boolean E0;
    public int F0;
    public boolean H0;
    public Rect I0;
    public Rect J0;
    public an K0;
    public OnBackInvokedDispatcher L0;
    public hk M0;
    public final Object R;
    public final Context S;
    public Window T;
    public fl U;
    public qu5 V;
    public mz4 W;
    public CharSequence X;
    public ActionBarOverlayLayout Y;
    public cl Z;
    public cl a0;
    public y6 b0;
    public ActionBarContextView c0;
    public PopupWindow d0;
    public bl e0;
    public boolean g0;
    public ViewGroup h0;
    public TextView i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public jl[] r0;
    public jl s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public Configuration x0;
    public final int y0;
    public int z0;
    public zr5 f0 = null;
    public final yk G0 = new yk(this, (byte) 0);

    public kl(Context context, Window window, rk rkVar, Object obj) {
        nk nkVar = null;
        this.y0 = -100;
        this.S = context;
        this.R = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof nk)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        nkVar = (nk) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (nkVar != null) {
                this.y0 = ((kl) nkVar.p()).y0;
            }
        }
        if (this.y0 == -100) {
            String name = this.R.getClass().getName();
            oo4 oo4Var = N0;
            Integer num = (Integer) oo4Var.get(name);
            if (num != null) {
                this.y0 = num.intValue();
                oo4Var.remove(this.R.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        nl.c();
    }

    public static uq2 o(Context context) {
        uq2 uq2Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (uq2Var = xk.K) == null) {
            return null;
        }
        wq2 wq2Var = uq2Var.a;
        uq2 x = x(context.getApplicationContext().getResources().getConfiguration());
        uq2 m = i >= 24 ? il2.m(uq2Var, x) : wq2Var.isEmpty() ? uq2.b : uq2.b(wq2Var.get(0).toLanguageTag());
        return m.a.isEmpty() ? x : m;
    }

    public static Configuration s(Context context, int i, uq2 uq2Var, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (uq2Var != null) {
            wq2 wq2Var = uq2Var.a;
            if (Build.VERSION.SDK_INT >= 24) {
                dl.g(configuration2, uq2Var);
                return configuration2;
            }
            configuration2.setLocale(wq2Var.get(0));
            configuration2.setLayoutDirection(wq2Var.get(0));
        }
        return configuration2;
    }

    public static uq2 x(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? dl.d(configuration) : uq2.b(configuration.locale.toLanguageTag());
    }

    public final void A(int i) {
        this.F0 = (1 << i) | this.F0;
        if (this.E0) {
            return;
        }
        View decorView = this.T.getDecorView();
        WeakHashMap weakHashMap = dr5.a;
        decorView.postOnAnimation(this.G0);
        this.E0 = true;
    }

    public final int B(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            zy.i("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        gl glVar = this.D0;
                        if (glVar == null) {
                            glVar = new gl(this, context);
                            this.D0 = glVar;
                        }
                        return glVar.m();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    gl glVar2 = this.C0;
                    if (glVar2 == null) {
                        glVar2 = new gl(this, x81.h(context));
                        this.C0 = glVar2;
                    }
                    return glVar2.m();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean C() {
        boolean z = this.t0;
        this.t0 = false;
        jl y = y(0);
        if (!y.m) {
            y6 y6Var = this.b0;
            if (y6Var != null) {
                y6Var.a();
                return true;
            }
            z();
            qu5 qu5Var = this.V;
            if (qu5Var == null || !qu5Var.b()) {
                return false;
            }
        } else if (!z) {
            r(y, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0130, code lost:
    
        if (r2 != null) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(defpackage.jl r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl.D(jl, android.view.KeyEvent):void");
    }

    public final boolean E(jl jlVar, int i, KeyEvent keyEvent) {
        sx2 sx2Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((jlVar.k || F(jlVar, keyEvent)) && (sx2Var = jlVar.h) != null) {
            return sx2Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c4, code lost:
    
        if (r6 == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F(defpackage.jl r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl.F(jl, android.view.KeyEvent):boolean");
    }

    public final void G() {
        if (this.g0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        hk hkVar;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.L0 != null && (y(0).m || this.b0 != null)) {
                z = true;
            }
            if (z && this.M0 == null) {
                this.M0 = el.h(this.L0, this);
            } else {
                if (z || (hkVar = this.M0) == null) {
                    return;
                }
                el.j(this.L0, hkVar);
                this.M0 = null;
            }
        }
    }

    @Override // defpackage.xk
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.S);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof kl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.qx2
    public final boolean b(sx2 sx2Var, MenuItem menuItem) {
        jl jlVar;
        Window.Callback callback = this.T.getCallback();
        if (callback != null && !this.w0) {
            sx2 l = sx2Var.l();
            jl[] jlVarArr = this.r0;
            int length = jlVarArr != null ? jlVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    jlVar = jlVarArr[i];
                    if (jlVar != null && jlVar.h == l) {
                        break;
                    }
                    i++;
                } else {
                    jlVar = null;
                    break;
                }
            }
            if (jlVar != null) {
                return callback.onMenuItemSelected(jlVar.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.xk
    public final void d() {
        String str;
        this.u0 = true;
        m(false, true);
        w();
        Object obj = this.R;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = vt0.B(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                qu5 qu5Var = this.V;
                if (qu5Var == null) {
                    this.H0 = true;
                } else {
                    qu5Var.i(true);
                }
            }
            synchronized (xk.P) {
                xk.f(this);
                xk.O.add(new WeakReference(this));
            }
        }
        this.x0 = new Configuration(this.S.getResources().getConfiguration());
        this.v0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.xk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.R
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.xk.P
            monitor-enter(r0)
            defpackage.xk.f(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            boolean r0 = r3.E0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.T
            android.view.View r0 = r0.getDecorView()
            yk r1 = r3.G0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.w0 = r0
            int r0 = r3.y0
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.R
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            oo4 r0 = defpackage.kl.N0
            java.lang.Object r1 = r3.R
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.y0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            oo4 r0 = defpackage.kl.N0
            java.lang.Object r1 = r3.R
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            gl r0 = r3.C0
            if (r0 == 0) goto L63
            r0.e()
        L63:
            gl r3 = r3.D0
            if (r3 == 0) goto L6a
            r3.e()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl.e():void");
    }

    @Override // defpackage.qx2
    public final void g(sx2 sx2Var) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.Y;
        if (actionBarOverlayLayout == null || !actionBarOverlayLayout.b() || (ViewConfiguration.get(this.S).hasPermanentMenuKey() && !this.Y.m())) {
            jl y = y(0);
            y.n = true;
            r(y, false);
            D(y, null);
            return;
        }
        Window.Callback callback = this.T.getCallback();
        if (this.Y.n()) {
            this.Y.j();
            if (this.w0) {
                return;
            }
            callback.onPanelClosed(108, y(0).h);
            return;
        }
        if (callback == null || this.w0) {
            return;
        }
        if (this.E0 && (1 & this.F0) != 0) {
            View decorView = this.T.getDecorView();
            yk ykVar = this.G0;
            decorView.removeCallbacks(ykVar);
            ykVar.run();
        }
        jl y2 = y(0);
        sx2 sx2Var2 = y2.h;
        if (sx2Var2 == null || y2.o || !callback.onPreparePanel(0, y2.g, sx2Var2)) {
            return;
        }
        callback.onMenuOpened(108, y2.h);
        this.Y.s();
    }

    @Override // defpackage.xk
    public final boolean h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.p0 && i == 108) {
            return false;
        }
        if (this.l0 && i == 1) {
            this.l0 = false;
        }
        if (i == 1) {
            G();
            this.p0 = true;
            return true;
        }
        if (i == 2) {
            G();
            this.j0 = true;
            return true;
        }
        if (i == 5) {
            G();
            this.k0 = true;
            return true;
        }
        if (i == 10) {
            G();
            this.n0 = true;
            return true;
        }
        if (i == 108) {
            G();
            this.l0 = true;
            return true;
        }
        if (i != 109) {
            return this.T.requestFeature(i);
        }
        G();
        this.m0 = true;
        return true;
    }

    @Override // defpackage.xk
    public final void i(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.h0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.S).inflate(i, viewGroup);
        this.U.a(this.T.getCallback());
    }

    @Override // defpackage.xk
    public final void j(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.h0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.U.a(this.T.getCallback());
    }

    @Override // defpackage.xk
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.h0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.U.a(this.T.getCallback());
    }

    @Override // defpackage.xk
    public final void l(CharSequence charSequence) {
        this.X = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.Y;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        qu5 qu5Var = this.V;
        if (qu5Var != null) {
            qu5Var.l(charSequence);
            return;
        }
        TextView textView = this.i0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl.m(boolean, boolean):boolean");
    }

    public final void n(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        hk hkVar;
        int resourceId;
        if (this.T != null) {
            zy.i("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof fl) {
            zy.i("AppCompat has already installed itself into the Window");
            return;
        }
        fl flVar = new fl(this, callback);
        this.U = flVar;
        window.setCallback(flVar);
        Context context = this.S;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, O0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            nl a = nl.a();
            synchronized (a) {
                drawable = a.a.g(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.T = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.L0) != null) {
            return;
        }
        Object obj = this.R;
        if (onBackInvokedDispatcher != null && (hkVar = this.M0) != null) {
            el.j(onBackInvokedDispatcher, hkVar);
            this.M0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.L0 = el.a(activity);
                H();
            }
        }
        this.L0 = null;
        H();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0109, code lost:
    
        if (r9.equals("ImageButton") == false) goto L24;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(int i, jl jlVar, sx2 sx2Var) {
        if (sx2Var == null) {
            if (jlVar == null && i >= 0) {
                jl[] jlVarArr = this.r0;
                if (i < jlVarArr.length) {
                    jlVar = jlVarArr[i];
                }
            }
            if (jlVar != null) {
                sx2Var = jlVar.h;
            }
        }
        if ((jlVar == null || jlVar.m) && !this.w0) {
            fl flVar = this.U;
            Window.Callback callback = this.T.getCallback();
            flVar.getClass();
            try {
                flVar.L = true;
                callback.onPanelClosed(i, sx2Var);
            } finally {
                flVar.L = false;
            }
        }
    }

    public final void q(sx2 sx2Var) {
        if (this.q0) {
            return;
        }
        this.q0 = true;
        this.Y.d();
        Window.Callback callback = this.T.getCallback();
        if (callback != null && !this.w0) {
            callback.onPanelClosed(108, sx2Var);
        }
        this.q0 = false;
    }

    public final void r(jl jlVar, boolean z) {
        il ilVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && jlVar.a == 0 && (actionBarOverlayLayout = this.Y) != null && actionBarOverlayLayout.n()) {
            q(jlVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.S.getSystemService("window");
        if (windowManager != null && jlVar.m && (ilVar = jlVar.e) != null) {
            windowManager.removeView(ilVar);
            if (z) {
                p(jlVar.a, jlVar, null);
            }
        }
        jlVar.k = false;
        jlVar.l = false;
        jlVar.m = false;
        jlVar.f = null;
        jlVar.n = true;
        if (this.s0 == jlVar) {
            this.s0 = null;
        }
        if (jlVar.a == 0) {
            H();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl.t(android.view.KeyEvent):boolean");
    }

    public final void u(int i) {
        jl y = y(i);
        if (y.h != null) {
            Bundle bundle = new Bundle();
            y.h.u(bundle);
            if (bundle.size() > 0) {
                y.p = bundle;
            }
            y.h.z();
            y.h.clear();
        }
        y.o = true;
        y.n = true;
        if ((i == 108 || i == 0) && this.Y != null) {
            jl y2 = y(0);
            y2.k = false;
            F(y2, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        if (this.g0) {
            return;
        }
        Context context = this.S;
        int[] iArr = qz3.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            zy.i("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (obtainStyledAttributes.getBoolean(WebSocketProtocol.PAYLOAD_SHORT, false)) {
            h(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            h(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            h(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            h(10);
        }
        this.o0 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.T.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.p0) {
            viewGroup = this.n0 ? (ViewGroup) from.inflate(com.github.mytv.dv.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.github.mytv.dv.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.o0) {
            viewGroup = (ViewGroup) from.inflate(com.github.mytv.dv.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.m0 = false;
            this.l0 = false;
        } else if (this.l0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.github.mytv.dv.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ej0(context, typedValue.resourceId) : context).inflate(com.github.mytv.dv.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(com.github.mytv.dv.R.id.decor_content_parent);
            this.Y = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.T.getCallback());
            if (this.m0) {
                this.Y.l(109);
            }
            if (this.j0) {
                this.Y.l(2);
            }
            if (this.k0) {
                this.Y.l(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.l0 + ", windowActionBarOverlay: " + this.m0 + ", android:windowIsFloating: " + this.o0 + ", windowActionModeOverlay: " + this.n0 + ", windowNoTitle: " + this.p0 + " }");
        }
        zk zkVar = new zk(this);
        WeakHashMap weakHashMap = dr5.a;
        vq5.c(viewGroup, zkVar);
        if (this.Y == null) {
            this.i0 = (TextView) viewGroup.findViewById(com.github.mytv.dv.R.id.title);
        }
        boolean z = fs5.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.github.mytv.dv.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.T.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.T.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new zk(this));
        this.h0 = viewGroup;
        Object obj = this.R;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.X;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.Y;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                qu5 qu5Var = this.V;
                if (qu5Var != null) {
                    qu5Var.l(title);
                } else {
                    TextView textView = this.i0;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.h0.findViewById(R.id.content);
        View decorView = this.T.getDecorView();
        contentFrameLayout2.O.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.g0 = true;
        jl y = y(0);
        if (this.w0 || y.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.T == null) {
            Object obj = this.R;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.T != null) {
            return;
        }
        zy.i("We have not been given a Window");
    }

    public final jl y(int i) {
        jl[] jlVarArr = this.r0;
        if (jlVarArr == null || jlVarArr.length <= i) {
            jl[] jlVarArr2 = new jl[i + 1];
            if (jlVarArr != null) {
                System.arraycopy(jlVarArr, 0, jlVarArr2, 0, jlVarArr.length);
            }
            this.r0 = jlVarArr2;
            jlVarArr = jlVarArr2;
        }
        jl jlVar = jlVarArr[i];
        if (jlVar != null) {
            return jlVar;
        }
        jl jlVar2 = new jl();
        jlVar2.a = i;
        jlVar2.n = false;
        jlVarArr[i] = jlVar2;
        return jlVar2;
    }

    public final void z() {
        qu5 qu5Var;
        v();
        if (this.l0 && (qu5Var = this.V) == null) {
            Object obj = this.R;
            if (obj instanceof Activity) {
                qu5Var = new qu5((Activity) obj, this.m0);
                this.V = qu5Var;
            } else if (obj instanceof Dialog) {
                qu5Var = new qu5((Dialog) obj);
                this.V = qu5Var;
            }
            if (qu5Var != null) {
                qu5Var.i(this.H0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
