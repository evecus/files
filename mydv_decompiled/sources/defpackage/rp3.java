package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rp3 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final List m;
    public final long n;
    public boolean o;
    public boolean p;
    public rp3 q;

    public rp3(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = f2;
        this.l = j7;
        this.n = 0L;
        this.o = z3;
        this.p = z3;
    }

    public static rp3 b(rp3 rp3Var, long j, long j2, ArrayList arrayList) {
        rp3 rp3Var2 = rp3Var;
        rp3 rp3Var3 = new rp3(rp3Var2.a, rp3Var2.b, j, rp3Var2.d, rp3Var2.e, rp3Var2.f, j2, rp3Var2.h, rp3Var2.i, arrayList, rp3Var2.j, rp3Var2.k, rp3Var2.l, rp3Var2.n);
        rp3 rp3Var4 = rp3Var2.q;
        if (rp3Var4 == null) {
            rp3Var4 = rp3Var2;
        }
        rp3Var3.q = rp3Var4;
        rp3 rp3Var5 = rp3Var2.q;
        if (rp3Var5 != null) {
            rp3Var2 = rp3Var5;
        }
        rp3Var3.q = rp3Var2;
        return rp3Var3;
    }

    public final void a() {
        rp3 rp3Var = this.q;
        if (rp3Var == null) {
            this.o = true;
            this.p = true;
        } else if (rp3Var != null) {
            rp3Var.a();
        }
    }

    public final List c() {
        List list = this.m;
        return list == null ? o91.I : list;
    }

    public final long d() {
        return this.a;
    }

    public final long e() {
        return this.c;
    }

    public final boolean f() {
        return this.d;
    }

    public final float g() {
        return this.e;
    }

    public final long h() {
        return this.g;
    }

    public final boolean i() {
        return this.h;
    }

    public final int j() {
        return this.i;
    }

    public final long k() {
        return this.b;
    }

    public final boolean l() {
        rp3 rp3Var = this.q;
        return rp3Var != null ? rp3Var.l() : this.o || this.p;
    }

    public final String toString() {
        return "PointerInputChange(id=" + rt0.M(this.a) + ", uptimeMillis=" + this.b + ", position=" + pd3.h(this.c) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + pd3.h(this.g) + ", previousPressed=" + this.h + ", isConsumed=" + l() + ", type=" + cq3.c(this.i) + ", historical=" + c() + ", scrollDelta=" + pd3.h(this.j) + ", scaleFactor=" + this.k + ", panOffset=" + pd3.h(this.l) + ")";
    }

    public rp3(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.m = list;
        this.n = j8;
    }

    public /* synthetic */ rp3(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6, float f2, long j7, long j8, int i2) {
        this(j, j2, j3, z, f, j4, j5, z2, i, list, j6, f2, j7, j8);
    }

    public rp3(long j, long j2, long j3, float f, long j4, long j5, boolean z, boolean z2, int i) {
        this(j, j2, j3, false, f, j4, j5, z, z2, i, 0L, 1.0f, 0L);
    }
}
