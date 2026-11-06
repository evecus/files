package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class as5 extends fb4 {
    public boolean e = false;
    public int f = 0;
    public final /* synthetic */ bs5 g;

    public as5(bs5 bs5Var) {
        this.g = bs5Var;
    }

    @Override // defpackage.fb4, defpackage.cs5
    public final void b() {
        if (this.e) {
            return;
        }
        this.e = true;
        cs5 cs5Var = this.g.d;
        if (cs5Var != null) {
            cs5Var.b();
        }
    }

    @Override // defpackage.cs5
    public final void c() {
        int i = this.f + 1;
        this.f = i;
        bs5 bs5Var = this.g;
        if (i == bs5Var.a.size()) {
            cs5 cs5Var = bs5Var.d;
            if (cs5Var != null) {
                cs5Var.c();
            }
            this.f = 0;
            this.e = false;
            bs5Var.e = false;
        }
    }
}
