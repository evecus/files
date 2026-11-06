package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yq4 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public yq4(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
    }

    public final long a(boolean z, boolean z2) {
        return z ? z2 ? this.b : this.d : z2 ? this.g : this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof yq4)) {
            return false;
        }
        yq4 yq4Var = (yq4) obj;
        long j = yq4Var.a;
        int i = x70.h;
        return zc5.a(this.a, j) && zc5.a(this.b, yq4Var.b) && zc5.a(this.c, yq4Var.c) && zc5.a(this.d, yq4Var.d) && zc5.a(this.e, yq4Var.e) && zc5.a(this.f, yq4Var.f) && zc5.a(this.g, yq4Var.g) && zc5.a(this.h, yq4Var.h) && zc5.a(this.i, yq4Var.i) && zc5.a(this.j, yq4Var.j);
    }

    public final int hashCode() {
        int i = x70.h;
        return i82.Q(this.j) + pt1.l(pt1.l(pt1.l(pt1.l(pt1.l(pt1.l(pt1.l(pt1.l(i82.Q(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }
}
