package defpackage;

import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class cl1 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float I;
    public final int J;
    public final int K;
    public final View L;
    public bl1 M;
    public bl1 N;
    public boolean O;
    public int P;
    public final int[] Q = new int[2];

    public cl1(View view) {
        this.L = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.I = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.J = tapTimeout;
        this.K = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        bl1 bl1Var = this.N;
        View view = this.L;
        if (bl1Var != null) {
            view.removeCallbacks(bl1Var);
        }
        bl1 bl1Var2 = this.M;
        if (bl1Var2 != null) {
            view.removeCallbacks(bl1Var2);
        }
    }

    public abstract xn4 b();

    public abstract boolean c();

    public boolean d() {
        xn4 b = b();
        if (b == null || !b.b()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cl1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.O = false;
        this.P = -1;
        bl1 bl1Var = this.M;
        if (bl1Var != null) {
            this.L.removeCallbacks(bl1Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
