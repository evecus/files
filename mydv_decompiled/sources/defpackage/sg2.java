package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sg2 implements vw2 {
    public final int[] a;
    public final int[] b;
    public final float c;
    public final vw2 d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final pd2 i;
    public final uu2 j;
    public final iu0 k;
    public final int l;
    public final List m;
    public final long n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final dl0 t;
    public final pg3 u;

    public sg2(int[] iArr, int[] iArr2, float f, vw2 vw2Var, float f2, boolean z, boolean z2, boolean z3, pd2 pd2Var, uu2 uu2Var, iu0 iu0Var, int i, List list, long j, int i2, int i3, int i4, int i5, int i6, dl0 dl0Var) {
        this.a = iArr;
        this.b = iArr2;
        this.c = f;
        this.d = vw2Var;
        this.e = f2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = pd2Var;
        this.j = uu2Var;
        this.k = iu0Var;
        this.l = i;
        this.m = list;
        this.n = j;
        this.o = i2;
        this.p = i3;
        this.q = i4;
        this.r = i5;
        this.s = i6;
        this.t = dl0Var;
        this.u = z2 ? pg3.I : pg3.J;
    }

    @Override // defpackage.vw2
    public final Map a() {
        return this.d.a();
    }

    @Override // defpackage.vw2
    public final void b() {
        this.d.b();
    }

    @Override // defpackage.vw2
    public final tm1 c() {
        return this.d.c();
    }

    @Override // defpackage.vw2
    public final hn1 d() {
        return this.d.d();
    }

    @Override // defpackage.vw2
    public final tm1 e() {
        return this.d.e();
    }

    public final sg2 f(int i, boolean z) {
        if (this.h) {
            return null;
        }
        List list = this.m;
        if (list.isEmpty()) {
            return null;
        }
        int[] iArr = this.a;
        if (iArr.length == 0) {
            return null;
        }
        int[] iArr2 = this.b;
        if (iArr2.length == 0) {
            return null;
        }
        int i2 = this.r;
        int i3 = this.p;
        int i4 = i3 - i2;
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                int size2 = list.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    ug2 ug2Var = (ug2) list.get(i6);
                    boolean z2 = ug2Var.d;
                    if (!ug2Var.p) {
                        long j = ug2Var.r;
                        ug2Var.r = ((z2 ? (int) (j >> 32) : ((int) (j >> 32)) + i) << 32) | ((z2 ? ((int) (j & 4294967295L)) + i : (int) (j & 4294967295L)) & 4294967295L);
                        if (z) {
                            int size3 = ug2Var.c.size();
                            for (int i7 = 0; i7 < size3; i7++) {
                                ug2Var.h.a(i7, ug2Var.b);
                            }
                        }
                    }
                }
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                for (int i8 = 0; i8 < length; i8++) {
                    iArr3[i8] = iArr2[i8] - i;
                }
                return new sg2(iArr, iArr3, i, this.d, this.e, this.f || i > 0, this.g, this.h, this.i, this.j, this.k, this.l, list, this.n, this.o, this.p, this.q, this.r, this.s, this.t);
            }
            ug2 ug2Var2 = (ug2) list.get(i5);
            if (ug2Var2.p) {
                return null;
            }
            if ((ug2Var2.k() <= 0) != (ug2Var2.k() + i <= 0)) {
                return null;
            }
            int k = ug2Var2.k();
            int i9 = this.o;
            if (k <= i9) {
                if (i < 0) {
                    if ((ug2Var2.l() + ug2Var2.k()) - i9 <= (-i)) {
                        return null;
                    }
                } else if (i9 - ug2Var2.k() <= i) {
                    return null;
                }
            }
            if (ug2Var2.l() + ug2Var2.k() >= i4) {
                if (i < 0) {
                    if ((ug2Var2.l() + ug2Var2.k()) - i3 <= (-i)) {
                        return null;
                    }
                } else if (i3 - ug2Var2.k() <= i) {
                    return null;
                }
            }
            i5++;
        }
    }

    @Override // defpackage.vw2
    public final int getHeight() {
        return this.d.getHeight();
    }

    @Override // defpackage.vw2
    public final int getWidth() {
        return this.d.getWidth();
    }
}
