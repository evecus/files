package defpackage;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class l83 {
    public mu0 a;
    public boolean b;
    public ts0 c;

    public abstract void a();

    public abstract void b();

    public abstract void c(j83 j83Var);

    public abstract void d(j83 j83Var);

    public final void e() {
        ts0 ts0Var = this.c;
        if (ts0Var == null || !((LinkedHashSet) ts0Var.L).remove(this)) {
            return;
        }
        o83 o83Var = (o83) ts0Var.K;
        if (equals(o83Var.f)) {
            if (o83Var.g == -1) {
                a();
            }
            o83Var.f = null;
            o83Var.g = 0;
            o83Var.h = null;
        }
        o83Var.d.remove(this);
        o83Var.e.remove(this);
        this.c = null;
        o83Var.b();
    }

    public final void f(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        ts0 ts0Var = this.c;
        if (ts0Var != null) {
            ((o83) ts0Var.K).b();
        }
    }
}
