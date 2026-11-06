package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tn3 implements pn3 {
    public static final tn3 a = new tn3();

    @Override // defpackage.pn3
    public final boolean a() {
        return true;
    }

    @Override // defpackage.pn3
    public final on3 b(View view, boolean z, long j, float f, float f2, boolean z2, iu0 iu0Var, float f3) {
        if (z) {
            return new sn3(new Magnifier(view));
        }
        long c0 = iu0Var.c0(j);
        float P = iu0Var.P(f);
        float P2 = iu0Var.P(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (c0 != 9205357640488583168L) {
            builder.setSize(mw2.P(Float.intBitsToFloat((int) (c0 >> 32))), mw2.P(Float.intBitsToFloat((int) (c0 & 4294967295L))));
        }
        if (!Float.isNaN(P)) {
            builder.setCornerRadius(P);
        }
        if (!Float.isNaN(P2)) {
            builder.setElevation(P2);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new sn3(builder.build());
    }
}
