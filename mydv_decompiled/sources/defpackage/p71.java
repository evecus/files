package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class p71 implements k71 {
    public ex1 b;
    public d80 c;
    public Float d;
    public lq1 a = jq1.a;
    public int e = 1;

    @Override // defpackage.k71
    public final k71 a() {
        p71 p71Var = new p71();
        p71Var.a = this.a;
        p71Var.b = this.b;
        p71Var.c = this.c;
        p71Var.d = this.d;
        p71Var.e = this.e;
        return p71Var;
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
        return "EmittableImage(modifier=" + this.a + ", provider=" + this.b + ", colorFilterParams=" + this.c + ", alpha=" + this.d + ", contentScale=" + ((Object) mi0.a(this.e)) + ')';
    }
}
