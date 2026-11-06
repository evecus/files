package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class s22 implements Iterable, w72 {
    public final int I;
    public final int J;
    public final int K;

    public s22(int i, int i2, int i3) {
        if (i3 == 0) {
            s83.t("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            s83.t("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.I = i;
        this.J = sp0.U(i, i2, i3);
        this.K = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s22)) {
            return false;
        }
        if (isEmpty() && ((s22) obj).isEmpty()) {
            return true;
        }
        s22 s22Var = (s22) obj;
        return this.I == s22Var.I && this.J == s22Var.J && this.K == s22Var.K;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.I * 31) + this.J) * 31) + this.K;
    }

    public boolean isEmpty() {
        int i = this.J;
        int i2 = this.K;
        int i3 = this.I;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new t22(this.I, this.J, this.K);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.J;
        int i2 = this.K;
        int i3 = this.I;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
