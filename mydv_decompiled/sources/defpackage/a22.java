package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class a22 implements Comparable, Serializable {
    public static final a22 K = new a22(-31557014167219200L, 0);
    public static final a22 L = new a22(31556889864403199L, 999999999);
    public final long I;
    public final int J;

    public a22(long j, int i) {
        this.I = j;
        this.J = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            s83.t("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a22 a22Var = (a22) obj;
        a22Var.getClass();
        int n = j42.n(this.I, a22Var.I);
        return n != 0 ? n : j42.m(this.J, a22Var.J);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a22)) {
            return false;
        }
        a22 a22Var = (a22) obj;
        return this.I == a22Var.I && this.J == a22Var.J;
    }

    public final int hashCode() {
        return (this.J * 51) + i82.Q(this.I);
    }

    public final String toString() {
        return eu5.p(this);
    }
}
