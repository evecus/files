package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nk0 implements kq1 {
    public final ax0 a;

    public nk0(ax0 ax0Var) {
        this.a = ax0Var;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nk0) && this.a == ((nk0) obj).a;
    }

    @Override // defpackage.lq1
    public final Object foldIn(Object obj, hn1 hn1Var) {
        return hn1Var.invoke(obj, this);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CornerRadiusModifier(radius=" + this.a + ')';
    }
}
