package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lb4 implements mb4 {
    public final ScrollFeedbackProvider I;

    public lb4(NestedScrollView nestedScrollView) {
        this.I = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.mb4
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.I.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.mb4
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.I.onScrollProgress(i, i2, i3, i4);
    }
}
