package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vf2 implements qe2 {
    public final int a;
    public final List b;
    public final boolean c;
    public final tv d;
    public final uv e;
    public final da2 f;
    public final int g;
    public final long h;
    public final Object i;
    public final Object j;
    public final ie2 k;
    public int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public boolean s;
    public int t = Integer.MIN_VALUE;
    public final int[] u;

    public vf2(int i, List list, boolean z, tv tvVar, uv uvVar, da2 da2Var, int i2, int i3, int i4, long j, Object obj, Object obj2, ie2 ie2Var, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = tvVar;
        this.e = uvVar;
        this.f = da2Var;
        this.g = i4;
        this.h = j;
        this.i = obj;
        this.j = obj2;
        this.k = ie2Var;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            bn3 bn3Var = (bn3) list.get(i7);
            boolean z2 = this.c;
            i5 += z2 ? bn3Var.J : bn3Var.I;
            i6 = Math.max(i6, !z2 ? bn3Var.J : bn3Var.I);
        }
        this.m = i5;
        this.r = i6;
        this.u = new int[this.b.size() * 2];
        if (this.c) {
            this.q = this.g;
            this.o = i5;
            this.n = i6;
            this.p = 0;
            return;
        }
        this.q = 0;
        this.o = i6;
        this.n = i5;
        this.p = this.g;
    }

    @Override // defpackage.qe2
    public final int a() {
        return this.p;
    }

    @Override // defpackage.qe2
    public final int b() {
        return 1;
    }

    @Override // defpackage.qe2
    public final int c() {
        return this.o;
    }

    @Override // defpackage.qe2
    public final List d() {
        return this.b;
    }

    @Override // defpackage.qe2
    public final int e() {
        return this.q;
    }

    @Override // defpackage.qe2
    public final void f(int i, int i2, int i3) {
        m(i, i2, i3);
    }

    @Override // defpackage.qe2
    public final long g(int i) {
        if (i == 0 && this.b.size() == 0) {
            int i2 = this.l;
            return this.c ? i2 & 4294967295L : i2 << 32;
        }
        int i3 = i * 2;
        int[] iArr = this.u;
        return (iArr[i3 + 1] & 4294967295L) | (iArr[i3] << 32);
    }

    @Override // defpackage.qe2
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.qe2
    public final Object getKey() {
        return this.i;
    }

    @Override // defpackage.qe2
    public final int h() {
        return 0;
    }

    @Override // defpackage.qe2
    public final int i() {
        return this.n;
    }

    @Override // defpackage.qe2
    public final void j() {
        this.s = true;
    }

    public final int k() {
        int i;
        int i2;
        if (this.c) {
            i = this.o;
            i2 = this.q;
        } else {
            i = this.n;
            i2 = this.p;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public final void l(an3 an3Var) {
        if (this.t == Integer.MIN_VALUE) {
            t02.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bn3 bn3Var = (bn3) list.get(i);
            boolean z = this.c;
            if (z) {
                int i2 = bn3Var.J;
            } else {
                int i3 = bn3Var.I;
            }
            long g = g(i);
            this.k.a(i, this.i);
            long c = r22.c(g, this.h);
            if (z) {
                an3.p(an3Var, bn3Var, c);
            } else {
                an3.l(an3Var, bn3Var, c);
            }
        }
    }

    public final void m(int i, int i2, int i3) {
        int i4;
        this.l = i;
        boolean z = this.c;
        this.t = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            bn3 bn3Var = (bn3) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.u;
            if (z) {
                tv tvVar = this.d;
                if (tvVar == null) {
                    throw hf1.q("null horizontalAlignment when isVertical == true");
                }
                iArr[i6] = tvVar.a(bn3Var.I, i2, this.f);
                iArr[i6 + 1] = i;
                i4 = bn3Var.J;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                uv uvVar = this.e;
                if (uvVar == null) {
                    throw hf1.q("null verticalAlignment when isVertical == false");
                }
                iArr[i7] = uvVar.a(bn3Var.J, i3);
                i4 = bn3Var.I;
            }
            i += i4;
        }
    }
}
