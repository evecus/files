package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class e91 extends mu0 {
    public final d91 d;

    public e91(TextView textView) {
        this.d = new d91(textView);
    }

    @Override // defpackage.mu0
    public final void T(boolean z) {
        if (c81.d()) {
            this.d.T(z);
        }
    }

    @Override // defpackage.mu0
    public final void U(boolean z) {
        boolean d = c81.d();
        d91 d91Var = this.d;
        if (d) {
            d91Var.U(z);
        } else {
            d91Var.f = z;
        }
    }

    @Override // defpackage.mu0
    public final InputFilter[] w(InputFilter[] inputFilterArr) {
        return !c81.d() ? inputFilterArr : this.d.w(inputFilterArr);
    }
}
