package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wp2 {
    public final long a;
    public final String b;
    public final int c;
    public final String d;

    public wp2(long j, String str, int i, String str2) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = str2;
    }

    public final long a() {
        return this.a;
    }

    public final String b() {
        return this.d;
    }

    public final int c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp2)) {
            return false;
        }
        wp2 wp2Var = (wp2) obj;
        return this.a == wp2Var.a && this.b.equals(wp2Var.b) && this.c == wp2Var.c && this.d.equals(wp2Var.d);
    }

    public final int hashCode() {
        long j = this.a;
        return this.d.hashCode() + ((hf1.n(((int) (j ^ (j >>> 32))) * 31, 31, this.b) + this.c) * 31);
    }

    public final String toString() {
        return "User(id=" + this.a + ", nickName=" + this.b + ", level=" + this.c + ", idStr=" + this.d + ")";
    }
}
