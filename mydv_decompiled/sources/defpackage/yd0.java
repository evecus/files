package defpackage;

import com.github.mytv.dv.MainActivity;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yd0 extends a2 {
    public final jk3 R;
    public boolean S;

    public yd0(MainActivity mainActivity) {
        super(mainActivity);
        this.R = ad4.w(null);
    }

    @Override // defpackage.a2
    public final void a(fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(420213850);
        int i2 = (go1Var.i(this) ? 4 : 2) | i;
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            hn1 hn1Var = (hn1) this.R.getValue();
            if (hn1Var == null) {
                go1Var.d0(-1238823553);
            } else {
                go1Var.d0(98585282);
                hn1Var.invoke(go1Var, 0);
            }
            go1Var.q(false);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new y1(this, i, (byte) 3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return yd0.class.getName();
    }

    @Override // defpackage.a2
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.S;
    }

    public final void setContent(hn1 hn1Var) {
        this.S = true;
        this.R.setValue(hn1Var);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            d();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
