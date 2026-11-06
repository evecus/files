package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class al4 extends n2 {
    public final boolean l(Object obj) {
        if (obj == null) {
            obj = r2.O;
        }
        if (!r2.N.i(this, null, obj)) {
            return false;
        }
        r2.e(this, false);
        return true;
    }

    public final boolean m(fl2 fl2Var) {
        h2 h2Var;
        fl2Var.getClass();
        Object obj = this.I;
        if (obj == null) {
            if (fl2Var.isDone()) {
                if (r2.N.i(this, null, r2.h(fl2Var))) {
                    r2.e(this, false);
                    return true;
                }
                return false;
            }
            k2 k2Var = new k2(this, fl2Var);
            if (r2.N.i(this, null, k2Var)) {
                try {
                    fl2Var.a(gx0.I, k2Var);
                    return true;
                } catch (Throwable th) {
                    try {
                        h2Var = new h2(th);
                    } catch (Error | Exception unused) {
                        h2Var = h2.b;
                    }
                    r2.N.i(this, k2Var, h2Var);
                    return true;
                }
            }
            obj = this.I;
        }
        if (obj instanceof f2) {
            fl2Var.cancel(((f2) obj).a);
        }
        return false;
    }
}
