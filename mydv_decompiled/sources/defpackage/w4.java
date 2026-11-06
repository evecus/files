package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class w4 extends ClickableSpan {
    public final int I;
    public final p5 J;
    public final int K;

    public w4(int i, p5 p5Var, int i2) {
        this.I = i;
        this.J = p5Var;
        this.K = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.I);
        this.J.a.performAction(this.K, bundle);
    }
}
