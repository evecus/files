package defpackage;

import android.view.Window;
import androidx.media3.common.C;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class aw5 extends zv5 {
    public aw5(Window window, ep epVar) {
        super(window, epVar, 0);
    }

    @Override // defpackage.ui4
    public final void o(boolean z) {
        if (!z) {
            u(16);
            return;
        }
        Window window = this.h;
        window.clearFlags(C.BUFFER_FLAG_FIRST_SAMPLE);
        window.addFlags(Integer.MIN_VALUE);
        t(16);
    }
}
