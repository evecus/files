package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class de3 extends l83 {
    public final ee3 d;
    public boolean e;

    public de3(ee3 ee3Var, fe3 fe3Var) {
        boolean z = ee3Var.b;
        this.a = fe3Var;
        this.b = z;
        this.d = ee3Var;
        this.e = true;
    }

    @Override // defpackage.l83
    public final void a() {
        this.d.a();
    }

    @Override // defpackage.l83
    public final void b() {
        this.d.b();
    }

    @Override // defpackage.l83
    public final void c(j83 j83Var) {
        this.d.c(new gt(j83Var));
    }

    @Override // defpackage.l83
    public final void d(j83 j83Var) {
        j83Var.getClass();
        this.d.d(new gt(j83Var));
    }

    public final void g(boolean z) {
        this.e = z;
        f(z && this.d.b);
    }
}
