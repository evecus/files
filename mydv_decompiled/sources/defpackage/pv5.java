package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class pv5 extends ov5 {
    public pv5(yv5 yv5Var, WindowInsets windowInsets) {
        super(yv5Var, windowInsets);
    }

    @Override // defpackage.vv5
    public yv5 a() {
        return yv5.c(this.c.consumeDisplayCutout(), null);
    }

    @Override // defpackage.nv5, defpackage.vv5
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv5)) {
            return false;
        }
        pv5 pv5Var = (pv5) obj;
        return Objects.equals(this.c, pv5Var.c) && Objects.equals(this.g, pv5Var.g) && nv5.M(this.h, pv5Var.h);
    }

    @Override // defpackage.vv5
    public tx0 h() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new tx0(displayCutout);
    }

    @Override // defpackage.vv5
    public int hashCode() {
        return this.c.hashCode();
    }

    public pv5(yv5 yv5Var, pv5 pv5Var) {
        super(yv5Var, pv5Var);
    }
}
