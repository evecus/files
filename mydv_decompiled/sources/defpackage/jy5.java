package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jy5 {
    public final String a;
    public final sx5 b;
    public final dp0 c;
    public final long d;
    public final long e;
    public final long f;
    public final ch0 g;
    public final int h;
    public final ut i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final List q;

    public jy5(String str, sx5 sx5Var, dp0 dp0Var, long j, long j2, long j3, ch0 ch0Var, int i, ut utVar, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2) {
        str.getClass();
        dp0Var.getClass();
        this.a = str;
        this.b = sx5Var;
        this.c = dp0Var;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = ch0Var;
        this.h = i;
        this.i = utVar;
        this.j = j4;
        this.k = j5;
        this.l = i2;
        this.m = i3;
        this.n = j6;
        this.o = i4;
        this.p = list;
        this.q = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy5)) {
            return false;
        }
        jy5 jy5Var = (jy5) obj;
        return j42.c(this.a, jy5Var.a) && this.b == jy5Var.b && j42.c(this.c, jy5Var.c) && this.d == jy5Var.d && this.e == jy5Var.e && this.f == jy5Var.f && this.g.equals(jy5Var.g) && this.h == jy5Var.h && this.i == jy5Var.i && this.j == jy5Var.j && this.k == jy5Var.k && this.l == jy5Var.l && this.m == jy5Var.m && this.n == jy5Var.n && this.o == jy5Var.o && this.p.equals(jy5Var.p) && this.q.equals(jy5Var.q);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        long j = this.d;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f;
        int hashCode2 = (this.i.hashCode() + ((((this.g.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.h) * 31)) * 31;
        long j4 = this.j;
        int i3 = (hashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.k;
        int i4 = (((((i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.l) * 31) + this.m) * 31;
        long j6 = this.n;
        return this.q.hashCode() + ((this.p.hashCode() + ((((i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.o) * 31)) * 31);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", initialDelay=" + this.d + ", intervalDuration=" + this.e + ", flexDuration=" + this.f + ", constraints=" + this.g + ", runAttemptCount=" + this.h + ", backoffPolicy=" + this.i + ", backoffDelayDuration=" + this.j + ", lastEnqueueTime=" + this.k + ", periodCount=" + this.l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.n + ", stopReason=" + this.o + ", tags=" + this.p + ", progress=" + this.q + ')';
    }
}
