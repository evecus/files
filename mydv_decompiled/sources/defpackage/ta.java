package defpackage;

import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ta extends k13 implements zx, pi4, t82, na2, la5 {
    public final i9 I = new i9(this, (byte) 1);
    public final /* synthetic */ AndroidComposeView J;

    public ta(AndroidComposeView androidComposeView) {
        this.J = androidComposeView;
    }

    @Override // defpackage.t82
    public final boolean b(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.zx
    public final Object d0(na3 na3Var, k9 k9Var, gj0 gj0Var) {
        long M = na3Var.M(0L);
        m14 m14Var = (m14) k9Var.invoke();
        m14 i = m14Var != null ? m14Var.i(M) : null;
        if (i != null) {
            this.J.requestRectangleOnScreen(sp0.h0(i), false);
        }
        return wd5.a;
    }

    @Override // defpackage.la5
    public final Object g() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.pi4
    public final boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean isImportantForBounds() {
        return true;
    }

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.i(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.l(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        bn3 u = pw2Var.u(j);
        return ww2Var.W(u.I, u.J, p91.I, this.I, new sa(u, (byte) 0));
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.o(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.r(this, b42Var, a42Var, i);
    }

    @Override // defpackage.t82
    public final boolean t(KeyEvent keyEvent) {
        oh1 oh1Var;
        int[] iArr = yh1.a;
        long w = e21.w(keyEvent);
        int i = j82.O;
        if (j82.a(w, k21.L())) {
            oh1Var = new oh1(2);
        } else if (j82.a(w, k21.K())) {
            oh1Var = new oh1(1);
        } else if (j82.a(w, k21.S())) {
            oh1Var = new oh1(e21.H(keyEvent) ? 2 : 1);
        } else {
            oh1Var = j82.a(w, k21.B()) ? new oh1(4) : j82.a(w, k21.A()) ? new oh1(3) : (j82.a(w, k21.C()) || j82.a(w, k21.O())) ? new oh1(5) : (j82.a(w, k21.z()) || j82.a(w, k21.N())) ? new oh1(6) : (j82.a(w, k21.y()) || j82.a(w, k21.E()) || j82.a(w, k21.M())) ? new oh1(7) : (j82.a(w, k21.x()) || j82.a(w, k21.F())) ? new oh1(8) : null;
        }
        if (oh1Var != null) {
            int i2 = oh1Var.a;
            if (c21.r(e21.C(keyEvent), 2)) {
                AndroidComposeView androidComposeView = this.J;
                ui1 g = ((di1) androidComposeView.getFocusOwner()).g();
                if (g != null && g.I && androidComposeView.mo23moveFocusInChildren3ESFkO8(i2)) {
                    androidComposeView.getPlayNavigationSoundEffect$ui().invoke(oh1Var, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                Boolean f = ((di1) androidComposeView.getFocusOwner()).f(i2, androidComposeView.getEmbeddedViewFocusRect(), new v1(oh1Var, (byte) 5));
                if (f == null) {
                    return true;
                }
                if (f.booleanValue()) {
                    androidComposeView.getPlayNavigationSoundEffect$ui().invoke(oh1Var, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                if (c21.B(i2)) {
                    Integer c = yh1.c(i2);
                    int intValue = c != null ? c.intValue() : 2;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View rootView = androidComposeView.getRootView();
                    rootView.getClass();
                    View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, androidComposeView.getView(), intValue);
                    if (findNextFocus == null || findNextFocus.equals(androidComposeView)) {
                        return ((di1) androidComposeView.getFocusOwner()).i(i2);
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.pi4
    public final void applySemantics(cj4 cj4Var) {
    }
}
