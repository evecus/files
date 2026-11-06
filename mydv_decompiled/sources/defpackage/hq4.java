package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hq4 {
    public final bh a;
    public long b;

    public hq4(bh bhVar, long j) {
        this.a = bhVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hq4) {
            hq4 hq4Var = (hq4) obj;
            if (this.a == hq4Var.a && z22.b(this.b, hq4Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return i82.Q(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + z22.c(this.b) + ")";
    }
}
