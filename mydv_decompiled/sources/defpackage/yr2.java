package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yr2 extends wr2 {
    public static final yr2 L = new yr2(1, 0);

    public yr2(long j, long j2) {
        super(j, j2, 1L);
    }

    @Override // defpackage.wr2
    public final boolean equals(Object obj) {
        if (!(obj instanceof yr2)) {
            return false;
        }
        if (isEmpty() && ((yr2) obj).isEmpty()) {
            return true;
        }
        yr2 yr2Var = (yr2) obj;
        return this.I == yr2Var.I && this.J == yr2Var.J;
    }

    public final Comparable f() {
        return Long.valueOf(this.J);
    }

    public final Comparable h() {
        return Long.valueOf(this.I);
    }

    @Override // defpackage.wr2
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.I;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.J;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    @Override // defpackage.wr2
    public final boolean isEmpty() {
        return this.I > this.J;
    }

    @Override // defpackage.wr2
    public final String toString() {
        return this.I + ".." + this.J;
    }
}
