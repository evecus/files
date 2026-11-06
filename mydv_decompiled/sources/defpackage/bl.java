package defpackage;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bl implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ bl(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        Object obj;
        u6 u6Var;
        byte b = 0;
        switch (this.I) {
            case 0:
                kl klVar = (kl) this.J;
                klVar.d0.showAtLocation(klVar.c0, 55, 0, 0);
                zr5 zr5Var = klVar.f0;
                if (zr5Var != null) {
                    zr5Var.b();
                }
                if (!klVar.g0 || (viewGroup = klVar.h0) == null || !viewGroup.isLaidOut()) {
                    klVar.c0.setAlpha(1.0f);
                    klVar.c0.setVisibility(0);
                    return;
                }
                klVar.c0.setAlpha(0.0f);
                zr5 a = dr5.a(klVar.c0);
                a.a(1.0f);
                klVar.f0 = a;
                a.d(new al(this, b));
                return;
            case 1:
                el2 el2Var = (el2) this.J;
                m41 m41Var = el2Var.K;
                xr xrVar = el2Var.I;
                if (el2Var.V) {
                    if (el2Var.T) {
                        el2Var.T = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        xrVar.e = currentAnimationTimeMillis;
                        xrVar.g = -1L;
                        xrVar.f = currentAnimationTimeMillis;
                        xrVar.h = 0.5f;
                    }
                    if ((xrVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > xrVar.g + xrVar.i) || !el2Var.e()) {
                        el2Var.V = false;
                        return;
                    }
                    if (el2Var.U) {
                        el2Var.U = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        m41Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (xrVar.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = xrVar.a(currentAnimationTimeMillis2);
                    long j = currentAnimationTimeMillis2 - xrVar.f;
                    xrVar.f = currentAnimationTimeMillis2;
                    el2Var.X.scrollListBy((int) (j * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * xrVar.d));
                    WeakHashMap weakHashMap = dr5.a;
                    m41Var.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                gi giVar = (gi) this.J;
                giVar.a(true);
                giVar.invalidateSelf();
                return;
            case 3:
                m41 m41Var2 = (m41) this.J;
                m41Var2.T = null;
                m41Var2.drawableStateChanged();
                return;
            case 4:
                md1 md1Var = (md1) this.J;
                ValueAnimator valueAnimator = md1Var.z;
                byte b2 = md1Var.A;
                if (b2 == 1) {
                    valueAnimator.cancel();
                } else if (b2 != 2) {
                    return;
                }
                md1Var.A = (byte) 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 5:
                synchronized (((u33) this.J).a) {
                    obj = ((u33) this.J).d;
                    ((u33) this.J).d = u33.h;
                }
                ((u33) this.J).b(obj);
                return;
            case 6:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.J;
                if (searchView$SearchAutoComplete.N) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.N = false;
                    return;
                }
                return;
            case 7:
                ((StaggeredGridLayoutManager) this.J).s0();
                return;
            default:
                ActionMenuView actionMenuView = ((Toolbar) this.J).I;
                if (actionMenuView == null || (u6Var = actionMenuView.e0) == null) {
                    return;
                }
                u6Var.l();
                return;
        }
    }
}
