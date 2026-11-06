package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class jz5 implements qe0, ti2 {
    public final AndroidComposeView I;
    public final we0 J;
    public boolean K;
    public li2 L;
    public tc0 M = mw2.d;

    public jz5(AndroidComposeView androidComposeView, we0 we0Var) {
        this.I = androidComposeView;
        this.J = we0Var;
    }

    public final void a(hn1 hn1Var) {
        this.I.setOnReadyForComposition(new m1(this, (tc0) hn1Var, (byte) 27));
    }

    @Override // defpackage.qe0
    public final void dispose() {
        if (!this.K) {
            this.K = true;
            AndroidComposeView androidComposeView = this.I;
            androidComposeView.getView().setTag(R.id.wrapped_composition_tag, null);
            li2 li2Var = this.L;
            if (li2Var != null) {
                li2Var.b(this);
            }
            this.L = null;
            androidComposeView.disposeSavedStateRegistry$ui();
        }
        this.J.dispose();
    }

    @Override // defpackage.ti2
    public final void e(vi2 vi2Var, ji2 ji2Var) {
        if (ji2Var == ji2.ON_DESTROY) {
            dispose();
        } else {
            if (ji2Var != ji2.ON_CREATE || this.K) {
                return;
            }
            a(this.M);
        }
    }
}
