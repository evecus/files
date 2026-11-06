package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class m71 extends w71 {
    public rz e;
    public lq1 d = jq1.a;
    public boolean f = true;

    @Override // defpackage.k71
    public final k71 a() {
        m71 m71Var = new m71();
        m71Var.d = this.d;
        m71Var.a = this.a;
        m71Var.b = this.b;
        m71Var.e = this.e;
        m71Var.f = this.f;
        m71Var.c = this.c;
        return m71Var;
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
        StringBuilder sb = new StringBuilder("EmittableButton('");
        sb.append(this.a);
        sb.append("', enabled=");
        sb.append(this.f);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", colors=");
        sb.append(this.e);
        sb.append(" modifier=");
        sb.append(this.d);
        sb.append(", maxLines=");
        return hf1.y(sb, this.c, ')');
    }
}
