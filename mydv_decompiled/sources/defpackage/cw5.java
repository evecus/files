package defpackage;

import android.view.Window;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cw5 extends bw5 {
    public cw5(Window window, ep epVar) {
        super(window, epVar);
    }

    @Override // defpackage.bw5, defpackage.ui4
    public final void o(boolean z) {
        this.h.setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // defpackage.bw5, defpackage.ui4
    public final void p(boolean z) {
        this.h.setSystemBarsAppearance(z ? 8 : 0, 8);
    }

    @Override // defpackage.bw5, defpackage.ui4
    public final void q() {
        this.h.setSystemBarsBehavior(2);
    }
}
