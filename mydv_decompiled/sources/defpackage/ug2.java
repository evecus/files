package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ug2 implements qe2 {
    public final int a;
    public final Object b;
    public final List c;
    public final boolean d;
    public final int e;
    public final int f;
    public final Object g;
    public final ie2 h;
    public boolean i = true;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public int o;
    public boolean p;
    public final long q;
    public long r;

    public ug2(int i, Object obj, List list, boolean z, int i2, int i3, int i4, int i5, int i6, Object obj2, ie2 ie2Var, long j) {
        int i7;
        int i8;
        int i9;
        this.a = i;
        this.b = obj;
        this.c = list;
        this.d = z;
        this.e = i3;
        this.f = i4;
        this.g = obj2;
        this.h = ie2Var;
        int i10 = 1;
        if (list.isEmpty()) {
            i7 = 0;
        } else {
            bn3 bn3Var = (bn3) list.get(0);
            i7 = z ? bn3Var.J : bn3Var.I;
            int size = list.size() - 1;
            if (1 <= size) {
                int i11 = 1;
                while (true) {
                    bn3 bn3Var2 = (bn3) list.get(i11);
                    int i12 = this.d ? bn3Var2.J : bn3Var2.I;
                    i7 = i12 > i7 ? i12 : i7;
                    if (i11 == size) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        this.j = i7;
        List list2 = this.c;
        if (list2.isEmpty()) {
            i8 = 0;
        } else {
            bn3 bn3Var3 = (bn3) list2.get(0);
            i8 = this.d ? bn3Var3.I : bn3Var3.J;
            int size2 = list2.size() - 1;
            if (1 <= size2) {
                while (true) {
                    bn3 bn3Var4 = (bn3) list2.get(i10);
                    int i13 = this.d ? bn3Var4.I : bn3Var4.J;
                    i8 = i13 > i8 ? i13 : i8;
                    if (i10 == size2) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        this.o = Integer.MIN_VALUE;
        boolean z2 = this.d;
        if (z2) {
            this.n = i2;
            i9 = this.j;
            this.l = i9;
            this.k = i8;
            this.m = 0;
        } else {
            this.n = 0;
            this.l = i8;
            i9 = this.j;
            this.k = i9;
            this.m = i2;
        }
        this.q = z2 ? (i9 & 4294967295L) | (i8 << 32) : (i9 << 32) | (4294967295L & i8);
        this.r = 0L;
    }

    @Override // defpackage.qe2
    public final int a() {
        return this.m;
    }

    @Override // defpackage.qe2
    public final int b() {
        return this.f;
    }

    @Override // defpackage.qe2
    public final int c() {
        return this.l;
    }

    @Override // defpackage.qe2
    public final List d() {
        return this.c;
    }

    @Override // defpackage.qe2
    public final int e() {
        return this.n;
    }

    @Override // defpackage.qe2
    public final void f(int i, int i2, int i3) {
        if (this.d) {
            i2 = i3;
        }
        m(i, 0, i2);
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
        return this.e;
    }

    @Override // defpackage.qe2
    public final int i() {
        return this.k;
    }

    @Override // defpackage.qe2
    public final void j() {
        this.p = true;
    }

    public final int k() {
        long j = this.r;
        return (int) (!this.d ? j >> 32 : j & 4294967295L);
    }

    public final int l() {
        int i;
        int i2;
        if (this.d) {
            i = this.l;
            i2 = this.n;
        } else {
            i = this.k;
            i2 = this.m;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public final void m(int i, int i2, int i3) {
        long j;
        this.o = i3;
        if (this.d) {
            j = (i2 << 32) | (4294967295L & i);
        } else {
            j = (i2 & 4294967295L) | (i << 32);
        }
        this.r = j;
    }
}
