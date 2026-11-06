package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class q71 implements k71 {
    public float b;
    public lq1 a = jq1.a;
    public i80 c = ix3.a;
    public i80 d = ix3.b;

    @Override // defpackage.k71
    public final k71 a() {
        q71 q71Var = new q71();
        q71Var.a = this.a;
        q71Var.b = this.b;
        q71Var.c = this.c;
        q71Var.d = this.d;
        return q71Var;
    }

    @Override // defpackage.k71
    public final lq1 b() {
        return this.a;
    }

    @Override // defpackage.k71
    public final void c(lq1 lq1Var) {
        this.a = lq1Var;
    }

    public final String toString() {
        return "EmittableLinearProgressIndicator(modifier=" + this.a + ", progress=" + this.b + ", indeterminate=false, color=" + this.c + ", backgroundColor=" + this.d + ')';
    }
}
