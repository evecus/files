package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rt implements st {
    public final te a;
    public final b80 b;

    public rt(te teVar, b80 b80Var) {
        this.a = teVar;
        this.b = b80Var;
    }

    @Override // defpackage.lq1
    public final /* synthetic */ lq1 a(lq1 lq1Var) {
        return jp0.i(this, lq1Var);
    }

    @Override // defpackage.lq1
    public final boolean b(tm1 tm1Var) {
        return ((Boolean) tm1Var.invoke(this)).booleanValue();
    }

    @Override // defpackage.lq1
    public final boolean c(c22 c22Var) {
        return ((Boolean) c22Var.invoke(this)).booleanValue();
    }

    @Override // defpackage.lq1
    public final Object foldIn(Object obj, hn1 hn1Var) {
        return hn1Var.invoke(obj, this);
    }

    public final String toString() {
        return "BackgroundModifier(colorFilter=" + this.b + ", imageProvider=" + this.a + ", contentScale=" + ((Object) mi0.a(2)) + ", alpha=null)";
    }
}
