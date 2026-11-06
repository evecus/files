package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class vg5 implements Comparable, Serializable {
    public static final vg5 K = new vg5(0, 0);
    public final long I;
    public final long J;

    public vg5(long j, long j2) {
        this.I = j;
        this.J = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compare;
        int compare2;
        vg5 vg5Var = (vg5) obj;
        vg5Var.getClass();
        long j = vg5Var.I;
        long j2 = this.I;
        if (j2 != j) {
            compare2 = Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
            return compare2;
        }
        compare = Long.compare(this.J ^ Long.MIN_VALUE, vg5Var.J ^ Long.MIN_VALUE);
        return compare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg5)) {
            return false;
        }
        vg5 vg5Var = (vg5) obj;
        return this.I == vg5Var.I && this.J == vg5Var.J;
    }

    public final int hashCode() {
        return i82.Q(this.I ^ this.J);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        kb4.u(this.I, bArr, 0, 0, 4);
        bArr[8] = 45;
        kb4.u(this.I, bArr, 9, 4, 6);
        bArr[13] = 45;
        kb4.u(this.I, bArr, 14, 6, 8);
        bArr[18] = 45;
        kb4.u(this.J, bArr, 19, 0, 2);
        bArr[23] = 45;
        kb4.u(this.J, bArr, 24, 2, 8);
        return new String(bArr, z50.a);
    }
}
