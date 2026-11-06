package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class oa0 implements lq1 {
    public final lq1 a;
    public final lq1 b;

    public oa0(lq1 lq1Var, lq1 lq1Var2) {
        this.a = lq1Var;
        this.b = lq1Var2;
    }

    @Override // defpackage.lq1
    public final /* synthetic */ lq1 a(lq1 lq1Var) {
        return jp0.i(this, lq1Var);
    }

    @Override // defpackage.lq1
    public final boolean b(tm1 tm1Var) {
        return this.a.b(tm1Var) || this.b.b(tm1Var);
    }

    @Override // defpackage.lq1
    public final boolean c(c22 c22Var) {
        return this.a.c(c22Var) && this.b.c(c22Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oa0)) {
            return false;
        }
        oa0 oa0Var = (oa0) obj;
        return j42.c(this.a, oa0Var.a) && j42.c(this.b, oa0Var.b);
    }

    @Override // defpackage.lq1
    public final Object foldIn(Object obj, hn1 hn1Var) {
        return this.b.foldIn(this.a.foldIn(obj, hn1Var), hn1Var);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "[" + ((String) foldIn("", new bd0((byte) 16))) + ']';
    }
}
