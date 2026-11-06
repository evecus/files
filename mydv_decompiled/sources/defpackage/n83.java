package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class n83 {
    public ts0 a;
    public boolean b;

    public final void a() {
        ts0 ts0Var = this.a;
        if (ts0Var == null) {
            zy.i("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            ts0Var.g(this, null);
        }
        o83 o83Var = (o83) ts0Var.K;
        sr srVar = (sr) ts0Var.J;
        if (equals(o83Var.h) && -1 == o83Var.g) {
            l83 l83Var = o83Var.f;
            if (l83Var == null) {
                l83Var = o83Var.c(-1);
            }
            o83Var.f = null;
            o83Var.g = 0;
            o83Var.h = null;
            if (l83Var == null) {
                ((je3) srVar.J).a.run();
            } else {
                l83Var.b();
            }
            o83Var.a.i(null, p83.g);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
