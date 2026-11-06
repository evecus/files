package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class md2 implements qe2 {
    public final int a;
    public final Object b;
    public final int c;
    public final da2 d;
    public final List e;
    public final long f;
    public final Object g;
    public final ie2 h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public int p = Integer.MIN_VALUE;
    public final long q;
    public long r;
    public int s;
    public int t;
    public boolean u;

    public md2(int i, Object obj, int i2, int i3, da2 da2Var, int i4, int i5, List list, long j, Object obj2, ie2 ie2Var, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = i2;
        this.d = da2Var;
        this.e = list;
        this.f = j;
        this.g = obj2;
        this.h = ie2Var;
        this.i = i6;
        this.j = i7;
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = Math.max(i8, ((bn3) list.get(i9)).J);
        }
        this.k = i8;
        this.o = i3;
        this.m = i8;
        int i10 = this.c;
        this.l = i10;
        this.n = 0;
        this.q = (i10 << 32) | (i8 & 4294967295L);
        this.r = 0L;
        this.s = -1;
        this.t = -1;
    }

    @Override // defpackage.qe2
    public final int a() {
        return this.n;
    }

    @Override // defpackage.qe2
    public final int b() {
        return this.j;
    }

    @Override // defpackage.qe2
    public final int c() {
        return this.m;
    }

    @Override // defpackage.qe2
    public final List d() {
        return this.e;
    }

    @Override // defpackage.qe2
    public final int e() {
        return this.o;
    }

    @Override // defpackage.qe2
    public final void f(int i, int i2, int i3) {
        m(i, 0, i2, i3, -1, -1);
    }

    @Override // defpackage.qe2
    public final long g(int i) {
        return this.r;
    }

    @Override // defpackage.qe2
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.qe2
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.qe2
    public final int h() {
        return this.i;
    }

    @Override // defpackage.qe2
    public final int i() {
        return this.l;
    }

    @Override // defpackage.qe2
    public final void j() {
        this.u = true;
    }

    public final int k() {
        return this.m + this.o;
    }

    public final void l(an3 an3Var) {
        if (this.p == Integer.MIN_VALUE) {
            t02.a("position() should be called first");
        }
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bn3 bn3Var = (bn3) list.get(i);
            int i2 = bn3Var.J;
            long j = this.r;
            this.h.a(i, this.b);
            an3.p(an3Var, bn3Var, r22.c(j, this.f));
        }
    }

    public final void m(int i, int i2, int i3, int i4, int i5, int i6) {
        this.p = i4;
        if (this.d == da2.J) {
            i2 = (i3 - i2) - this.c;
        }
        this.r = (i2 << 32) | (i & 4294967295L);
        this.s = i5;
        this.t = i6;
    }
}
