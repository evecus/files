package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sh1 extends k13 implements ii1, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View I;
    public ViewTreeObserver J;
    public final rh1 K;
    public final rh1 L;

    /* JADX WARN: Type inference failed for: r0v0, types: [rh1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [rh1] */
    public sh1() {
        final byte b = 0;
        this.K = new tm1(this) { // from class: rh1
            public final /* synthetic */ sh1 J;

            {
                this.J = this;
            }

            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                byte b2 = b;
                wd5 wd5Var = wd5.a;
                sh1 sh1Var = this.J;
                g10 g10Var = (g10) obj;
                switch (b2) {
                    case 0:
                        View x = rt0.x(sh1Var);
                        if (!x.isFocused() && !x.hasFocus()) {
                            bi1 focusOwner = ut0.V(sh1Var).getFocusOwner();
                            View T = vt0.T(sh1Var);
                            Integer c = yh1.c(g10Var.a);
                            int[] iArr = new int[2];
                            T.getLocationOnScreen(iArr);
                            int[] iArr2 = new int[2];
                            x.getLocationOnScreen(iArr2);
                            ui1 p = mu0.p(((di1) focusOwner).c);
                            Rect rect = null;
                            m14 r = p != null ? mu0.r(p) : null;
                            if (r != null) {
                                int i = (int) r.a;
                                int i2 = iArr[0];
                                int i3 = iArr2[0];
                                int i4 = (int) r.b;
                                int i5 = iArr[1];
                                int i6 = iArr2[1];
                                rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) r.c) + i2) - i3, (((int) r.d) + i5) - i6);
                            }
                            if (!yh1.b(x, c, rect)) {
                                g10Var.b = true;
                                break;
                            }
                        }
                        break;
                    default:
                        rt0.x(sh1Var);
                        break;
                }
                return wd5Var;
            }
        };
        final byte b2 = 1;
        this.L = new tm1(this) { // from class: rh1
            public final /* synthetic */ sh1 J;

            {
                this.J = this;
            }

            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                byte b22 = b2;
                wd5 wd5Var = wd5.a;
                sh1 sh1Var = this.J;
                g10 g10Var = (g10) obj;
                switch (b22) {
                    case 0:
                        View x = rt0.x(sh1Var);
                        if (!x.isFocused() && !x.hasFocus()) {
                            bi1 focusOwner = ut0.V(sh1Var).getFocusOwner();
                            View T = vt0.T(sh1Var);
                            Integer c = yh1.c(g10Var.a);
                            int[] iArr = new int[2];
                            T.getLocationOnScreen(iArr);
                            int[] iArr2 = new int[2];
                            x.getLocationOnScreen(iArr2);
                            ui1 p = mu0.p(((di1) focusOwner).c);
                            Rect rect = null;
                            m14 r = p != null ? mu0.r(p) : null;
                            if (r != null) {
                                int i = (int) r.a;
                                int i2 = iArr[0];
                                int i3 = iArr2[0];
                                int i4 = (int) r.b;
                                int i5 = iArr[1];
                                int i6 = iArr2[1];
                                rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) r.c) + i2) - i3, (((int) r.d) + i5) - i6);
                            }
                            if (!yh1.b(x, c, rect)) {
                                g10Var.b = true;
                                break;
                            }
                        }
                        break;
                    default:
                        rt0.x(sh1Var);
                        break;
                }
                return wd5Var;
            }
        };
    }

    public final ui1 j0() {
        boolean z;
        if (!getNode().isAttached()) {
            q02.b("visitLocalDescendants called on an unattached node");
        }
        k13 node = getNode();
        if ((node.getAggregateChildKindSet$ui() & 1024) != 0) {
            boolean z2 = false;
            for (k13 child$ui = node.getChild$ui(); child$ui != null; child$ui = child$ui.getChild$ui()) {
                if ((child$ui.getKindSet$ui() & 1024) != 0) {
                    k13 k13Var = child$ui;
                    b53 b53Var = null;
                    while (k13Var != null) {
                        if (k13Var instanceof ui1) {
                            ui1 ui1Var = (ui1) k13Var;
                            if (z2) {
                                return ui1Var;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (k13Var.getKindSet$ui() & 1024) != 0 && (k13Var instanceof wt0)) {
                            int i = 0;
                            for (k13 k13Var2 = ((wt0) k13Var).J; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
                                if ((k13Var2.getKindSet$ui() & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        k13Var = k13Var2;
                                    } else {
                                        if (b53Var == null) {
                                            b53Var = new b53(new k13[16]);
                                        }
                                        if (k13Var != null) {
                                            b53Var.c(k13Var);
                                            k13Var = null;
                                        }
                                        b53Var.c(k13Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        k13Var = ut0.M(b53Var);
                    }
                }
            }
        }
        zy.i("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // defpackage.k13
    public final void onAttach() {
        super.onAttach();
        ViewTreeObserver viewTreeObserver = vt0.T(this).getViewTreeObserver();
        this.J = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // defpackage.k13
    public final void onDetach() {
        ViewTreeObserver viewTreeObserver = this.J;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.J = null;
        vt0.T(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.I = null;
        super.onDetach();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        if (ut0.U(this).V == null) {
            return;
        }
        View x = rt0.x(this);
        bi1 focusOwner = ut0.V(this).getFocusOwner();
        qh3 V = ut0.V(this);
        boolean z2 = true;
        if (view != null && !view.equals(V)) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == x.getParent()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (view2 != null && !view2.equals(V)) {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == x.getParent()) {
                    break;
                }
            }
        }
        z2 = false;
        if (z && z2) {
            this.I = view2;
            return;
        }
        if (z2) {
            this.I = view2;
            ui1 j0 = j0();
            if (j0.o0().a()) {
                return;
            }
            vt0.Q(j0);
            return;
        }
        if (!z) {
            this.I = null;
            return;
        }
        this.I = null;
        if (j0().o0().b()) {
            ((di1) focusOwner).b(8, false, false);
        }
    }

    @Override // defpackage.ii1
    public final void s(ei1 ei1Var) {
        ei1Var.e(false);
        ei1Var.d(this.K);
        ei1Var.f(this.L);
    }
}
