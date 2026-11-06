package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class yn5 extends q13 {
    public final boolean a;
    public final pq5 b;
    public final tm1 c;

    public yn5(boolean z, pq5 pq5Var, tm1 tm1Var) {
        pq5Var.getClass();
        tm1Var.getClass();
        this.a = z;
        this.b = pq5Var;
        this.c = tm1Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new ao5(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn5)) {
            return false;
        }
        yn5 yn5Var = (yn5) obj;
        return this.a == yn5Var.a && j42.c(this.b, yn5Var.b) && j42.c(this.c, yn5Var.c);
    }

    public final int hashCode() {
        int i = this.a ? 1231 : 1237;
        return this.c.hashCode() + ((this.b.hashCode() + (i * 31)) * 31);
    }

    public final String toString() {
        return "VideoPinchZoomElement(enabled=" + this.a + ", state=" + this.b + ", imageSizeProvider=" + this.c + ")";
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ao5 ao5Var = (ao5) k13Var;
        ao5Var.K = this.a;
        pq5 pq5Var = this.b;
        pq5Var.getClass();
        ao5Var.L = pq5Var;
        tm1 tm1Var = this.c;
        tm1Var.getClass();
        ao5Var.M = tm1Var;
    }
}
