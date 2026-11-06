package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class u71 extends w71 {
    public lq1 d = jq1.a;

    @Override // defpackage.k71
    public final k71 a() {
        u71 u71Var = new u71();
        u71Var.d = this.d;
        u71Var.a = this.a;
        u71Var.b = this.b;
        u71Var.c = this.c;
        return u71Var;
    }

    @Override // defpackage.k71
    public final lq1 b() {
        return this.d;
    }

    @Override // defpackage.k71
    public final void c(lq1 lq1Var) {
        this.d = lq1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmittableText(");
        sb.append(this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", modifier=");
        sb.append(this.d);
        sb.append(", maxLines=");
        return hf1.y(sb, this.c, ')');
    }
}
