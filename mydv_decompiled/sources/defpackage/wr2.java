package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class wr2 implements Iterable, w72 {
    public final long I;
    public final long J;
    public final long K;

    public wr2(long j, long j2, long j3) {
        if (j3 == 0) {
            s83.t("Step must be non-zero.");
            throw null;
        }
        if (j3 == Long.MIN_VALUE) {
            s83.t("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.I = j;
        if (j3 > 0) {
            if (j < j2) {
                long j4 = j2 % j3;
                long j5 = j % j3;
                long j6 = ((j4 < 0 ? j4 + j3 : j4) - (j5 < 0 ? j5 + j3 : j5)) % j3;
                j2 -= j6 < 0 ? j6 + j3 : j6;
            }
        } else {
            if (j3 >= 0) {
                s83.t("Step is zero.");
                throw null;
            }
            if (j > j2) {
                long j7 = -j3;
                long j8 = j % j7;
                long j9 = j2 % j7;
                long j10 = ((j8 < 0 ? j8 + j7 : j8) - (j9 < 0 ? j9 + j7 : j9)) % j7;
                j2 += j10 < 0 ? j10 + j7 : j10;
            }
        }
        this.J = j2;
        this.K = j3;
    }

    public final long c() {
        return this.I;
    }

    public final long d() {
        return this.J;
    }

    public final long e() {
        return this.K;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wr2)) {
            return false;
        }
        if (isEmpty() && ((wr2) obj).isEmpty()) {
            return true;
        }
        wr2 wr2Var = (wr2) obj;
        return this.I == wr2Var.I && this.J == wr2Var.J && this.K == wr2Var.K;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.I;
        long j2 = this.J;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.K;
        return i + ((int) ((j3 >>> 32) ^ j3));
    }

    public boolean isEmpty() {
        long j = this.K;
        long j2 = this.J;
        long j3 = this.I;
        return j > 0 ? j3 > j2 : j3 < j2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new xr2(this.I, this.J, this.K);
    }

    public String toString() {
        StringBuilder sb;
        long j = this.K;
        long j2 = this.J;
        long j3 = this.I;
        if (j > 0) {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append("..");
            sb.append(j2);
            sb.append(" step ");
            sb.append(j);
        } else {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append(" downTo ");
            sb.append(j2);
            sb.append(" step ");
            sb.append(-j);
        }
        return sb.toString();
    }
}
