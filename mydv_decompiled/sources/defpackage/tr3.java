package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class tr3 extends mu0 {
    public final Object d;
    public final long e;

    public tr3(Object obj, long j) {
        this.d = obj;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr3)) {
            return false;
        }
        tr3 tr3Var = (tr3) obj;
        return this.d.equals(tr3Var.d) && this.e == tr3Var.e;
    }

    public final int hashCode() {
        return i82.Q(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.d + ", compositeKey=" + this.e + ')';
    }
}
