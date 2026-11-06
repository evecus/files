package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class eu implements og0 {
    public final pg0 a;

    public eu(pg0 pg0Var) {
        this.a = pg0Var;
    }

    @Override // defpackage.og0
    public final boolean a(ky5 ky5Var) {
        return c(ky5Var) && e(this.a.a());
    }

    @Override // defpackage.og0
    public final u00 b(ch0 ch0Var) {
        ch0Var.getClass();
        return new u00(new r(this, null, (byte) 5));
    }

    public int d() {
        return 7;
    }

    public boolean e(Object obj) {
        t93 t93Var = (t93) obj;
        t93Var.getClass();
        boolean z = t93Var.a;
        if (Build.VERSION.SDK_INT >= 26) {
            return (z && t93Var.c) ? false : true;
        }
        fr2.e().a(p93.b, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !z;
    }
}
