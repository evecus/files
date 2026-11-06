package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class my2 extends FrameLayout implements k70 {
    public final CollapsibleActionView I;

    /* JADX WARN: Multi-variable type inference failed */
    public my2(View view) {
        super(view.getContext());
        this.I = (CollapsibleActionView) view;
        addView(view);
    }
}
