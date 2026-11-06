package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ry extends ms {
    public k10 a;
    public tm1 b;

    @Override // defpackage.ms
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // defpackage.ms
    public final void b(Throwable th) {
        k10 k10Var = this.a;
        if (k10Var != null) {
            k10Var.resumeWith(mu0.o(th));
        }
    }
}
