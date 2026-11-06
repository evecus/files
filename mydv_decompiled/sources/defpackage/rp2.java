package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rp2 {
    public final wp2 a;
    public final String b;
    public final long c;
    public final int d;

    public rp2(wp2 wp2Var, String str, long j, int i) {
        this.a = wp2Var;
        this.b = str;
        this.c = j;
        this.d = i;
    }

    public final int a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final wp2 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp2)) {
            return false;
        }
        rp2 rp2Var = (rp2) obj;
        return this.a.equals(rp2Var.a) && this.b.equals(rp2Var.b) && this.c == rp2Var.c && this.d == rp2Var.d;
    }

    public final int hashCode() {
        int n = hf1.n(this.a.hashCode() * 31, 31, this.b);
        long j = this.c;
        return ((n + ((int) (j ^ (j >>> 32)))) * 31) + this.d;
    }

    public final String toString() {
        return "ChatMessage(user=" + this.a + ", content=" + this.b + ", eventTime=" + this.c + ", chatBy=" + this.d + ")";
    }
}
