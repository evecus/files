package defpackage;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.github.mytv.dv.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ic0 extends hc0 implements wr5, ws1, w94, le3, k83, y7, me3 {
    private static final cc0 Companion = new cc0();
    public final vi0 J = new vi0();
    public final pn K;
    public final da L;
    public vr5 M;
    public final ec0 N;
    public final u05 O;
    public final gc0 P;
    public final CopyOnWriteArrayList Q;
    public final CopyOnWriteArrayList R;
    public final CopyOnWriteArrayList S;
    public final CopyOnWriteArrayList T;
    public final CopyOnWriteArrayList U;
    public final CopyOnWriteArrayList V;
    public final CopyOnWriteArrayList W;
    public boolean X;
    public boolean Y;
    public final u05 Z;
    public final u05 a0;
    public final u05 b0;

    public ic0() {
        final nk nkVar = (nk) this;
        final byte b = 1;
        this.K = new pn((Runnable) new wb0(nkVar, b));
        v94 v94Var = new v94(this, new q94(this, b));
        da daVar = new da(v94Var);
        this.L = daVar;
        this.N = new ec0(nkVar);
        final byte b2 = 0;
        this.O = new u05(new rm1() { // from class: yb0
            @Override // defpackage.rm1
            public final Object invoke() {
                byte b3 = b2;
                nk nkVar2 = nkVar;
                switch (b3) {
                    case 0:
                        return new qm1(nkVar2.N, new ce(nkVar2, (byte) 9));
                    case 1:
                        ix0 ix0Var = new ix0();
                        nkVar2.a().c(ix0Var);
                        return ix0Var;
                    case 2:
                        return new x94(nkVar2.getApplication(), nkVar2, nkVar2.getIntent() != null ? nkVar2.getIntent().getExtras() : null);
                    default:
                        je3 je3Var = new je3(new wb0(nkVar2, (byte) 0));
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (j42.c(Looper.myLooper(), Looper.getMainLooper())) {
                                nkVar2.I.a(new xb0(je3Var, nkVar2));
                            } else {
                                new Handler(Looper.getMainLooper()).post(new lr(nkVar2, je3Var, (byte) 4));
                            }
                        }
                        return je3Var;
                }
            }
        });
        new AtomicInteger();
        this.P = new gc0(nkVar);
        this.Q = new CopyOnWriteArrayList();
        this.R = new CopyOnWriteArrayList();
        this.S = new CopyOnWriteArrayList();
        this.T = new CopyOnWriteArrayList();
        this.U = new CopyOnWriteArrayList();
        this.V = new CopyOnWriteArrayList();
        this.W = new CopyOnWriteArrayList();
        this.Z = new u05(new rm1() { // from class: yb0
            @Override // defpackage.rm1
            public final Object invoke() {
                byte b3 = b;
                nk nkVar2 = nkVar;
                switch (b3) {
                    case 0:
                        return new qm1(nkVar2.N, new ce(nkVar2, (byte) 9));
                    case 1:
                        ix0 ix0Var = new ix0();
                        nkVar2.a().c(ix0Var);
                        return ix0Var;
                    case 2:
                        return new x94(nkVar2.getApplication(), nkVar2, nkVar2.getIntent() != null ? nkVar2.getIntent().getExtras() : null);
                    default:
                        je3 je3Var = new je3(new wb0(nkVar2, (byte) 0));
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (j42.c(Looper.myLooper(), Looper.getMainLooper())) {
                                nkVar2.I.a(new xb0(je3Var, nkVar2));
                            } else {
                                new Handler(Looper.getMainLooper()).post(new lr(nkVar2, je3Var, (byte) 4));
                            }
                        }
                        return je3Var;
                }
            }
        });
        xi2 xi2Var = this.I;
        if (xi2Var == null) {
            zy.i("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        xi2Var.a(new ti2() { // from class: zb0
            @Override // defpackage.ti2
            public final void e(vi2 vi2Var, ji2 ji2Var) {
                Window window;
                View peekDecorView;
                byte b3 = b2;
                nk nkVar2 = nkVar;
                switch (b3) {
                    case 0:
                        if (ji2Var == ji2.ON_STOP && (window = nkVar2.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (ji2Var == ji2.ON_DESTROY) {
                            nkVar2.J.b = null;
                            if (!nkVar2.isChangingConfigurations()) {
                                nkVar2.f().a();
                            }
                            ec0 ec0Var = nkVar2.N;
                            nk nkVar3 = ec0Var.L;
                            nkVar3.getWindow().getDecorView().removeCallbacks(ec0Var);
                            nkVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(ec0Var);
                            break;
                        }
                        break;
                }
            }
        });
        this.I.a(new ti2() { // from class: zb0
            @Override // defpackage.ti2
            public final void e(vi2 vi2Var, ji2 ji2Var) {
                Window window;
                View peekDecorView;
                byte b3 = b;
                nk nkVar2 = nkVar;
                switch (b3) {
                    case 0:
                        if (ji2Var == ji2.ON_STOP && (window = nkVar2.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (ji2Var == ji2.ON_DESTROY) {
                            nkVar2.J.b = null;
                            if (!nkVar2.isChangingConfigurations()) {
                                nkVar2.f().a();
                            }
                            ec0 ec0Var = nkVar2.N;
                            nk nkVar3 = ec0Var.L;
                            nkVar3.getWindow().getDecorView().removeCallbacks(ec0Var);
                            nkVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(ec0Var);
                            break;
                        }
                        break;
                }
            }
        });
        this.I.a(new l14(nkVar, b));
        v94Var.a();
        qb.E(this);
        if (Build.VERSION.SDK_INT == 23) {
            this.I.a(new qx1(nkVar));
        }
        ((da) daVar.K).s("android:support:activity-result", new ac0(nkVar, b2));
        m(new bc0(nkVar, b2));
        final byte b3 = 2;
        this.a0 = new u05(new rm1() { // from class: yb0
            @Override // defpackage.rm1
            public final Object invoke() {
                byte b32 = b3;
                nk nkVar2 = nkVar;
                switch (b32) {
                    case 0:
                        return new qm1(nkVar2.N, new ce(nkVar2, (byte) 9));
                    case 1:
                        ix0 ix0Var = new ix0();
                        nkVar2.a().c(ix0Var);
                        return ix0Var;
                    case 2:
                        return new x94(nkVar2.getApplication(), nkVar2, nkVar2.getIntent() != null ? nkVar2.getIntent().getExtras() : null);
                    default:
                        je3 je3Var = new je3(new wb0(nkVar2, (byte) 0));
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (j42.c(Looper.myLooper(), Looper.getMainLooper())) {
                                nkVar2.I.a(new xb0(je3Var, nkVar2));
                            } else {
                                new Handler(Looper.getMainLooper()).post(new lr(nkVar2, je3Var, (byte) 4));
                            }
                        }
                        return je3Var;
                }
            }
        });
        final byte b4 = 3;
        this.b0 = new u05(new rm1() { // from class: yb0
            @Override // defpackage.rm1
            public final Object invoke() {
                byte b32 = b4;
                nk nkVar2 = nkVar;
                switch (b32) {
                    case 0:
                        return new qm1(nkVar2.N, new ce(nkVar2, (byte) 9));
                    case 1:
                        ix0 ix0Var = new ix0();
                        nkVar2.a().c(ix0Var);
                        return ix0Var;
                    case 2:
                        return new x94(nkVar2.getApplication(), nkVar2, nkVar2.getIntent() != null ? nkVar2.getIntent().getExtras() : null);
                    default:
                        je3 je3Var = new je3(new wb0(nkVar2, (byte) 0));
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (j42.c(Looper.myLooper(), Looper.getMainLooper())) {
                                nkVar2.I.a(new xb0(je3Var, nkVar2));
                            } else {
                                new Handler(Looper.getMainLooper()).post(new lr(nkVar2, je3Var, (byte) 4));
                            }
                        }
                        return je3Var;
                }
            }
        });
    }

    public static final void l(je3 je3Var, ic0 ic0Var, vi2 vi2Var, ji2 ji2Var) {
        if (ji2Var == ji2.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = ic0Var.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            je3Var.c(onBackInvokedDispatcher);
        }
    }

    public static final void o(nk nkVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!j42.c(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!j42.c(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.k83
    public final ts0 a() {
        return b().b().c;
    }

    @Override // defpackage.le3
    public final je3 b() {
        return (je3) this.b0.getValue();
    }

    @Override // defpackage.ws1
    public final ur5 c() {
        return (ur5) this.a0.getValue();
    }

    @Override // defpackage.ws1
    public final l33 d() {
        l33 l33Var = new l33();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = l33Var.a;
        if (application != null) {
            linkedHashMap.put(tr5.e, getApplication());
        }
        linkedHashMap.put(qb.l, this);
        linkedHashMap.put(qb.m, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(qb.n, extras);
        }
        return l33Var;
    }

    @Override // defpackage.y7
    public final gc0 e() {
        return this.P;
    }

    @Override // defpackage.wr5
    public final vr5 f() {
        if (getApplication() == null) {
            zy.i("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        vr5 vr5Var = this.M;
        if (vr5Var == null) {
            dc0 dc0Var = (dc0) getLastNonConfigurationInstance();
            if (dc0Var != null) {
                this.M = dc0Var.a;
            }
            vr5Var = this.M;
            if (vr5Var == null) {
                vr5Var = new vr5();
                this.M = vr5Var;
            }
        }
        vr5Var.getClass();
        return vr5Var;
    }

    @Override // defpackage.w94
    public final da g() {
        return (da) this.L.K;
    }

    @Override // defpackage.me3
    public final void i(kh0 kh0Var) {
        kh0Var.getClass();
        this.Q.add(kh0Var);
    }

    @Override // defpackage.me3
    public final void j(kh0 kh0Var) {
        kh0Var.getClass();
        this.Q.remove(kh0Var);
    }

    @Override // defpackage.vi2
    public final li2 k() {
        return this.I;
    }

    public final void m(oe3 oe3Var) {
        vi0 vi0Var = this.J;
        vi0Var.getClass();
        ic0 ic0Var = vi0Var.b;
        if (ic0Var != null) {
            oe3Var.a(ic0Var);
        }
        vi0Var.a.add(oe3Var);
    }

    public final void n() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ViewTreeLifecycleOwner.set(decorView, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        ViewTreeViewModelStoreOwner.set(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        ViewTreeSavedStateRegistryOwner.set(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.P.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((ix0) this.Z.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.Q.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((kh0) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.hc0, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.L.p(bundle);
        vi0 vi0Var = this.J;
        vi0Var.getClass();
        vi0Var.b = this;
        Iterator it = vi0Var.a.iterator();
        while (it.hasNext()) {
            ((oe3) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = i44.J;
        g44.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        this.K.O();
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        this.K.P();
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.X = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.X = false;
            Iterator it = this.T.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((kh0) it.next()).accept(new e33(z, configuration));
            }
        } catch (Throwable th) {
            this.X = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.S.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((kh0) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.K.d).iterator();
        while (it.hasNext()) {
            tl1 tl1Var = ((ql1) it.next()).a;
            if (tl1Var.q >= 1) {
                Iterator it2 = tl1Var.c.o().iterator();
                while (it2.hasNext()) {
                    r7.K(it2.next());
                }
            }
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.Y = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.Y = false;
            Iterator it = this.U.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((kh0) it.next()).accept(new vm3(z, configuration));
            }
        } catch (Throwable th) {
            this.Y = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        j81 b = e71.b(pictureInPictureUiState);
        Iterator it = this.V.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((kh0) it.next()).accept(b);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.K.Q();
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.P.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        dc0 dc0Var;
        vr5 vr5Var = this.M;
        if (vr5Var == null && (dc0Var = (dc0) getLastNonConfigurationInstance()) != null) {
            vr5Var = dc0Var.a;
        }
        if (vr5Var == null) {
            return null;
        }
        dc0 dc0Var2 = new dc0();
        dc0Var2.a = vr5Var;
        return dc0Var2;
    }

    @Override // defpackage.hc0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        xi2 xi2Var = this.I;
        if (r7.O(xi2Var)) {
            xi2Var.getClass();
            xi2Var.d("setCurrentState");
            xi2Var.f(ki2.K);
        }
        super.onSaveInstanceState(bundle);
        this.L.q(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.R.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((kh0) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.W.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (ui4.m()) {
                Trace.beginSection(ui4.s("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            ((qm1) this.O.getValue()).a();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        n();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ec0 ec0Var = this.N;
        ec0Var.getClass();
        if (!ec0Var.K) {
            ec0Var.K = true;
            decorView.getViewTreeObserver().addOnDrawListener(ec0Var);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.X) {
            return;
        }
        Iterator it = this.T.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((kh0) it.next()).accept(new e33(z));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.Y) {
            return;
        }
        Iterator it = this.U.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((kh0) it.next()).accept(new vm3(z));
        }
    }
}
