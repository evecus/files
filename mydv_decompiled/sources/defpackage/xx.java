package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xx implements wx, tx {
    public final iu0 a;
    public final long b;

    public xx(wy4 wy4Var, long j) {
        this.a = wy4Var;
        this.b = j;
    }

    public final float a() {
        long j = this.b;
        if (!dh0.d(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.F(dh0.h(j));
    }

    @Override // defpackage.tx
    public final l13 align(l13 l13Var, u8 u8Var) {
        return l13Var.then(new jx(u8Var, false));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx)) {
            return false;
        }
        xx xxVar = (xx) obj;
        return j42.c(this.a, xxVar.a) && dh0.b(this.b, xxVar.b);
    }

    public final int hashCode() {
        return i82.Q(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.tx
    public final l13 matchParentSize(l13 l13Var) {
        return l13Var.then(new jx(q8.N, true));
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + dh0.l(this.b) + ")";
    }
}
