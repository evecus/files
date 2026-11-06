package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.media3.extractor.ts.PsExtractor;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class nk extends ic0 implements rk {
    public boolean e0;
    public boolean f0;
    public kl h0;
    public final ep c0 = new ep((Object) new ll1(this), (byte) 9);
    public final xi2 d0 = new xi2(this, true);
    public boolean g0 = true;

    public nk() {
        final byte b = 1;
        ((da) this.L.K).s("android:support:lifecycle", new ac0(this, b));
        final byte b2 = 0;
        this.Q.add(new kh0(this) { // from class: kl1
            public final /* synthetic */ nk b;

            {
                this.b = this;
            }

            @Override // defpackage.kh0
            public final void accept(Object obj) {
                byte b3 = b2;
                nk nkVar = this.b;
                switch (b3) {
                    case 0:
                        nkVar.c0.A();
                        break;
                    default:
                        nkVar.c0.A();
                        break;
                }
            }
        });
        this.S.add(new kh0(this) { // from class: kl1
            public final /* synthetic */ nk b;

            {
                this.b = this;
            }

            @Override // defpackage.kh0
            public final void accept(Object obj) {
                byte b3 = b;
                nk nkVar = this.b;
                switch (b3) {
                    case 0:
                        nkVar.c0.A();
                        break;
                    default:
                        nkVar.c0.A();
                        break;
                }
            }
        });
        m(new bc0(this, b));
        ((da) this.L.K).s("androidx:appcompat", new lk(this));
        m(new mk(this));
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n();
        kl klVar = (kl) p();
        klVar.v();
        ((ViewGroup) klVar.h0.findViewById(R.id.content)).addView(view, layoutParams);
        klVar.U.a(klVar.T.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        kl klVar = (kl) p();
        klVar.u0 = true;
        int i = klVar.y0;
        if (i == -100) {
            i = xk.J;
        }
        int B = klVar.B(context, i);
        if (xk.c(context) && xk.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (xk.Q) {
                    try {
                        uq2 uq2Var = xk.K;
                        if (uq2Var == null) {
                            uq2 uq2Var2 = xk.L;
                            if (uq2Var2 == null) {
                                uq2Var2 = uq2.b(eu5.c0(context));
                                xk.L = uq2Var2;
                            }
                            if (!uq2Var2.a.isEmpty()) {
                                xk.K = xk.L;
                            }
                        } else if (!uq2Var.equals(xk.L)) {
                            uq2 uq2Var3 = xk.K;
                            xk.L = uq2Var3;
                            eu5.a0(context, uq2Var3.a.a());
                        }
                    } finally {
                    }
                }
            } else if (!xk.N) {
                xk.I.execute(new h(context, (byte) 4));
            }
        }
        uq2 o = kl.o(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(kl.s(context, B, o, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof ej0) {
            try {
                ((ej0) context).a(kl.s(context, B, o, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (kl.P0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 24) {
                        dl.b(configuration3, configuration4, configuration);
                    } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i7 = configuration3.touchscreen;
                    int i8 = configuration4.touchscreen;
                    if (i7 != i8) {
                        configuration.touchscreen = i8;
                    }
                    int i9 = configuration3.keyboard;
                    int i10 = configuration4.keyboard;
                    if (i9 != i10) {
                        configuration.keyboard = i10;
                    }
                    int i11 = configuration3.keyboardHidden;
                    int i12 = configuration4.keyboardHidden;
                    if (i11 != i12) {
                        configuration.keyboardHidden = i12;
                    }
                    int i13 = configuration3.navigation;
                    int i14 = configuration4.navigation;
                    if (i13 != i14) {
                        configuration.navigation = i14;
                    }
                    int i15 = configuration3.navigationHidden;
                    int i16 = configuration4.navigationHidden;
                    if (i15 != i16) {
                        configuration.navigationHidden = i16;
                    }
                    int i17 = configuration3.orientation;
                    int i18 = configuration4.orientation;
                    if (i17 != i18) {
                        configuration.orientation = i18;
                    }
                    int i19 = configuration3.screenLayout & 15;
                    int i20 = configuration4.screenLayout & 15;
                    if (i19 != i20) {
                        configuration.screenLayout |= i20;
                    }
                    int i21 = configuration3.screenLayout & PsExtractor.AUDIO_STREAM;
                    int i22 = configuration4.screenLayout & PsExtractor.AUDIO_STREAM;
                    if (i21 != i22) {
                        configuration.screenLayout |= i22;
                    }
                    int i23 = configuration3.screenLayout & 48;
                    int i24 = configuration4.screenLayout & 48;
                    if (i23 != i24) {
                        configuration.screenLayout |= i24;
                    }
                    int i25 = configuration3.screenLayout & 768;
                    int i26 = configuration4.screenLayout & 768;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    if (i6 >= 26) {
                        x9.j(configuration3, configuration4, configuration);
                    }
                    int i27 = configuration3.uiMode & 15;
                    int i28 = configuration4.uiMode & 15;
                    if (i27 != i28) {
                        configuration.uiMode |= i28;
                    }
                    int i29 = configuration3.uiMode & 48;
                    int i30 = configuration4.uiMode & 48;
                    if (i29 != i30) {
                        configuration.uiMode |= i30;
                    }
                    int i31 = configuration3.screenWidthDp;
                    int i32 = configuration4.screenWidthDp;
                    if (i31 != i32) {
                        configuration.screenWidthDp = i32;
                    }
                    int i33 = configuration3.screenHeightDp;
                    int i34 = configuration4.screenHeightDp;
                    if (i33 != i34) {
                        configuration.screenHeightDp = i34;
                    }
                    int i35 = configuration3.smallestScreenWidthDp;
                    int i36 = configuration4.smallestScreenWidthDp;
                    if (i35 != i36) {
                        configuration.smallestScreenWidthDp = i36;
                    }
                    int i37 = configuration3.densityDpi;
                    int i38 = configuration4.densityDpi;
                    if (i37 != i38) {
                        configuration.densityDpi = i38;
                    }
                }
            }
            Configuration s = kl.s(context, B, o, configuration, true);
            ej0 ej0Var = new ej0(context, com.github.mytv.dv.R.style.Theme_AppCompat_Empty);
            ej0Var.a(s);
            try {
                if (context.getTheme() != null) {
                    il2.a0(ej0Var.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = ej0Var;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((kl) p()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.hc0, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((kl) p()).z();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r8.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r8.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        kl klVar = (kl) p();
        klVar.v();
        return klVar.T.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        kl klVar = (kl) p();
        mz4 mz4Var = klVar.W;
        if (mz4Var == null) {
            klVar.z();
            qu5 qu5Var = klVar.V;
            mz4Var = new mz4(qu5Var != null ? qu5Var.e() : klVar.S);
            klVar.W = mz4Var;
        }
        return mz4Var;
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        kl klVar = (kl) p();
        if (klVar.V != null) {
            klVar.z();
            klVar.V.getClass();
            klVar.A(0);
        }
    }

    @Override // defpackage.ic0, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.c0.A();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.ic0, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        kl klVar = (kl) p();
        if (klVar.l0 && klVar.g0) {
            klVar.z();
            qu5 qu5Var = klVar.V;
            if (qu5Var != null) {
                qu5Var.g();
            }
        }
        nl a = nl.a();
        Context context = klVar.S;
        synchronized (a) {
            a.a.l(context);
        }
        klVar.x0 = new Configuration(klVar.S.getResources().getConfiguration());
        klVar.m(false, false);
    }

    @Override // defpackage.ic0, defpackage.hc0, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d0.e(ji2.ON_CREATE);
        tl1 tl1Var = ((ll1) this.c0.J).K;
        tl1Var.y = false;
        tl1Var.z = false;
        tl1Var.E.getClass();
        tl1Var.c(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((ll1) this.c0.J).K.e.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        q();
        p().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.ic0, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent z;
        if (!r(i, menuItem)) {
            kl klVar = (kl) p();
            klVar.z();
            qu5 qu5Var = klVar.V;
            if (menuItem.getItemId() != 16908332 || qu5Var == null || (qu5Var.d() & 4) == 0 || (z = vt0.z(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(z)) {
                navigateUpTo(z);
                return true;
            }
            c63 f = c63.f(this);
            f.d(this);
            f.h();
            try {
                f7.l(this);
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f0 = false;
        ((ll1) this.c0.J).K.c(5);
        this.d0.e(ji2.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((kl) p()).v();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        s();
        kl klVar = (kl) p();
        klVar.z();
        qu5 qu5Var = klVar.V;
        if (qu5Var != null) {
            qu5Var.k(true);
        }
    }

    @Override // defpackage.ic0, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.c0.A();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        ep epVar = this.c0;
        epVar.A();
        super.onResume();
        this.f0 = true;
        ((ll1) epVar.J).K.e(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        t();
        ((kl) p()).m(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.c0.A();
    }

    @Override // android.app.Activity
    public void onStop() {
        u();
        kl klVar = (kl) p();
        klVar.z();
        qu5 qu5Var = klVar.V;
        if (qu5Var != null) {
            qu5Var.k(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        p().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((kl) p()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final xk p() {
        kl klVar = this.h0;
        if (klVar != null) {
            return klVar;
        }
        vk vkVar = xk.I;
        kl klVar2 = new kl(this, null, this, this);
        this.h0 = klVar2;
        return klVar2;
    }

    public final void q() {
        super.onDestroy();
        tl1 tl1Var = ((ll1) this.c0.J).K;
        tl1Var.A = true;
        tl1Var.e(true);
        Iterator it = tl1Var.b().iterator();
        while (it.hasNext()) {
            ((eu4) it.next()).a();
        }
        ts0 ts0Var = tl1Var.c;
        if (r7.O(tl1Var.r) ? ((wl1) ts0Var.M).e : true ^ tl1Var.r.I.isChangingConfigurations()) {
            Iterator it2 = tl1Var.i.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((ot) it2.next()).I;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str = (String) obj;
                    wl1 wl1Var = (wl1) ts0Var.M;
                    wl1Var.getClass();
                    if (tl1.h(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    HashMap hashMap = wl1Var.d;
                    HashMap hashMap2 = wl1Var.c;
                    wl1 wl1Var2 = (wl1) hashMap2.get(str);
                    if (wl1Var2 != null) {
                        wl1Var2.o();
                        hashMap2.remove(str);
                    }
                    vr5 vr5Var = (vr5) hashMap.get(str);
                    if (vr5Var != null) {
                        vr5Var.a();
                        hashMap.remove(str);
                    }
                }
            }
        }
        tl1Var.c(-1);
        if (r7.O(tl1Var.r)) {
            ll1 ll1Var = tl1Var.r;
            ol1 ol1Var = tl1Var.m;
            nk nkVar = ll1Var.L;
            ol1Var.getClass();
            nkVar.R.remove(ol1Var);
        }
        if (r7.O(tl1Var.r)) {
            tl1Var.r.j(tl1Var.l);
        }
        if (r7.O(tl1Var.r)) {
            ll1 ll1Var2 = tl1Var.r;
            ol1 ol1Var2 = tl1Var.n;
            nk nkVar2 = ll1Var2.L;
            ol1Var2.getClass();
            nkVar2.T.remove(ol1Var2);
        }
        if (r7.O(tl1Var.r)) {
            ll1 ll1Var3 = tl1Var.r;
            ol1 ol1Var3 = tl1Var.o;
            nk nkVar3 = ll1Var3.L;
            ol1Var3.getClass();
            nkVar3.U.remove(ol1Var3);
        }
        if (r7.O(tl1Var.r)) {
            ll1 ll1Var4 = tl1Var.r;
            ql1 ql1Var = tl1Var.p;
            nk nkVar4 = ll1Var4.L;
            ql1Var.getClass();
            pn pnVar = nkVar4.K;
            ((CopyOnWriteArrayList) pnVar.d).remove(ql1Var);
            r7.K(((HashMap) pnVar.b).remove(ql1Var));
            ((Runnable) pnVar.c).run();
        }
        tl1Var.r = null;
        tl1Var.s = null;
        if (tl1Var.f != null) {
            tl1Var.g.e();
            tl1Var.f = null;
        }
        t7 t7Var = tl1Var.u;
        if (t7Var != null) {
            t7Var.L0();
            tl1Var.v.L0();
            tl1Var.w.L0();
        }
        this.d0.e(ji2.ON_DESTROY);
    }

    public final boolean r(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 6) {
            return false;
        }
        tl1 tl1Var = ((ll1) this.c0.J).K;
        if (tl1Var.q < 1) {
            return false;
        }
        Iterator it = tl1Var.c.o().iterator();
        while (it.hasNext()) {
            r7.K(it.next());
        }
        return false;
    }

    public final void s() {
        super.onPostResume();
        this.d0.e(ji2.ON_RESUME);
        tl1 tl1Var = ((ll1) this.c0.J).K;
        tl1Var.y = false;
        tl1Var.z = false;
        tl1Var.E.getClass();
        tl1Var.c(7);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        n();
        p().i(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((kl) p()).z0 = i;
    }

    public final void t() {
        ep epVar = this.c0;
        epVar.A();
        ll1 ll1Var = (ll1) epVar.J;
        super.onStart();
        this.g0 = false;
        if (!this.e0) {
            this.e0 = true;
            tl1 tl1Var = ll1Var.K;
            tl1Var.y = false;
            tl1Var.z = false;
            tl1Var.E.getClass();
            tl1Var.c(4);
        }
        ll1Var.K.e(true);
        this.d0.e(ji2.ON_START);
        tl1 tl1Var2 = ll1Var.K;
        tl1Var2.y = false;
        tl1Var2.z = false;
        tl1Var2.E.getClass();
        tl1Var2.c(5);
    }

    public final void u() {
        super.onStop();
        this.g0 = true;
        ep epVar = this.c0;
        Iterator it = ((ll1) epVar.J).K.c.o().iterator();
        while (it.hasNext()) {
            r7.K(it.next());
        }
        tl1 tl1Var = ((ll1) epVar.J).K;
        tl1Var.z = true;
        tl1Var.E.getClass();
        tl1Var.c(4);
        this.d0.e(ji2.ON_STOP);
    }

    @Override // defpackage.ic0, android.app.Activity
    public void setContentView(View view) {
        n();
        p().j(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n();
        p().k(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((ll1) this.c0.J).K.e.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
