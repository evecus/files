package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class uf2 implements vw2 {
    public final vf2 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final vw2 e;
    public final float f;
    public final boolean g;
    public final dl0 h;
    public final iu0 i;
    public final long j;
    public final int k;
    public final List l;
    public final int m;
    public final int n;
    public final int o;
    public final pg3 p;
    public final int q;
    public final int r;

    public uf2(vf2 vf2Var, int i, boolean z, float f, vw2 vw2Var, float f2, boolean z2, dl0 dl0Var, iu0 iu0Var, long j, int i2, List list, int i3, int i4, int i5, pg3 pg3Var, int i6, int i7) {
        this.a = vf2Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = vw2Var;
        this.f = f2;
        this.g = z2;
        this.h = dl0Var;
        this.i = iu0Var;
        this.j = j;
        this.k = i2;
        this.l = list;
        this.m = i3;
        this.n = i4;
        this.o = i5;
        this.p = pg3Var;
        this.q = i6;
        this.r = i7;
    }

    @Override // defpackage.vw2
    public final Map a() {
        return this.e.a();
    }

    @Override // defpackage.vw2
    public final void b() {
        this.e.b();
    }

    @Override // defpackage.vw2
    public final tm1 c() {
        return this.e.c();
    }

    @Override // defpackage.vw2
    public final hn1 d() {
        return this.e.d();
    }

    @Override // defpackage.vw2
    public final tm1 e() {
        return this.e.e();
    }

    public final uf2 f(int i, boolean z) {
        vf2 vf2Var;
        if (this.g) {
            return null;
        }
        List list = this.l;
        if (list.isEmpty() || (vf2Var = this.a) == null) {
            return null;
        }
        int k = vf2Var.k();
        int i2 = this.b - i;
        if (i2 < 0 || i2 >= k) {
            return null;
        }
        vf2 vf2Var2 = (vf2) o70.T0(list);
        vf2 vf2Var3 = (vf2) o70.a1(list);
        if (vf2Var2.s || vf2Var3.s) {
            return null;
        }
        int i3 = vf2Var2.l;
        int i4 = this.n;
        int i5 = this.m;
        if (i < 0) {
            if (Math.min((vf2Var2.k() + i3) - i5, (vf2Var3.k() + vf2Var3.l) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - i3, i4 - vf2Var3.l) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            vf2 vf2Var4 = (vf2) list.get(i6);
            boolean z2 = vf2Var4.c;
            int[] iArr = vf2Var4.u;
            if (!vf2Var4.s) {
                vf2Var4.l += i;
                int length = iArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    int i8 = i7 & 1;
                    if ((z2 && i8 != 0) || (!z2 && i8 == 0)) {
                        iArr[i7] = iArr[i7] + i;
                    }
                }
                if (z) {
                    int size2 = vf2Var4.b.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        vf2Var4.k.a(i9, vf2Var4.i);
                    }
                }
            }
        }
        return new uf2(this.a, i2, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, list, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    public final long g() {
        vw2 vw2Var = this.e;
        return (vw2Var.getWidth() << 32) | (vw2Var.getHeight() & 4294967295L);
    }

    @Override // defpackage.vw2
    public final int getHeight() {
        return this.e.getHeight();
    }

    @Override // defpackage.vw2
    public final int getWidth() {
        return this.e.getWidth();
    }
}
