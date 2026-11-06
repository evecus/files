package defpackage;

import android.view.View;
import androidx.compose.runtime.Recomposer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class qw5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View I;
    public final /* synthetic */ Recomposer J;

    public qw5(View view, Recomposer recomposer) {
        this.I = view;
        this.J = recomposer;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.I.removeOnAttachStateChangeListener(this);
        this.J.cancel();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
