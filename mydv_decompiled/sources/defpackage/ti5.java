package defpackage;

import java.math.BigInteger;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ti5 implements Comparable {
    public static final ti5 N;
    public final int I;
    public final int J;
    public final int K;
    public final String L;
    public final u05 M = new u05(new iy3(this, (byte) 18));

    static {
        new ti5("", 0, 0, 0);
        N = new ti5("", 0, 1, 0);
        new ti5("", 1, 0, 0);
    }

    public ti5(String str, int i, int i2, int i3) {
        this.I = i;
        this.J = i2;
        this.K = i3;
        this.L = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ti5 ti5Var = (ti5) obj;
        ti5Var.getClass();
        Object value = this.M.getValue();
        value.getClass();
        Object value2 = ti5Var.M.getValue();
        value2.getClass();
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ti5)) {
            return false;
        }
        ti5 ti5Var = (ti5) obj;
        return this.I == ti5Var.I && this.J == ti5Var.J && this.K == ti5Var.K;
    }

    public final int hashCode() {
        return ((((527 + this.I) * 31) + this.J) * 31) + this.K;
    }

    public final String toString() {
        String str = this.L;
        String concat = !jx4.L(str) ? "-".concat(str) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.I);
        sb.append('.');
        sb.append(this.J);
        sb.append('.');
        return nt3.n(sb, this.K, concat);
    }
}
