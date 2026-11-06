package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ld2 implements vw2 {
    public final nd2 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final vw2 e;
    public final float f;
    public final boolean g;
    public final dl0 h;
    public final iu0 i;
    public final int j;
    public final tm1 k;
    public final tm1 l;
    public final int m;
    public final List n;
    public final int o;
    public final int p;
    public final int q;
    public final pg3 r;
    public final int s;
    public final int t;

    public ld2(nd2 nd2Var, int i, boolean z, float f, vw2 vw2Var, float f2, boolean z2, dl0 dl0Var, iu0 iu0Var, int i2, tm1 tm1Var, tm1 tm1Var2, int i3, List list, int i4, int i5, int i6, pg3 pg3Var, int i7, int i8) {
        this.a = nd2Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = vw2Var;
        this.f = f2;
        this.g = z2;
        this.h = dl0Var;
        this.i = iu0Var;
        this.j = i2;
        this.k = tm1Var;
        this.l = tm1Var2;
        this.m = i3;
        this.n = list;
        this.o = i4;
        this.p = i5;
        this.q = i6;
        this.r = pg3Var;
        this.s = i7;
        this.t = i8;
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

    public final ld2 f(int i, boolean z) {
        nd2 nd2Var;
        int i2;
        if (this.g) {
            return null;
        }
        List list = this.n;
        if (list.isEmpty() || (nd2Var = this.a) == null) {
            return null;
        }
        int i3 = nd2Var.g;
        int i4 = this.b - i;
        if (i4 < 0 || i4 >= i3) {
            return null;
        }
        md2 md2Var = (md2) o70.T0(list);
        md2 md2Var2 = (md2) o70.a1(list);
        if (md2Var.u || md2Var2.u) {
            return null;
        }
        int i5 = this.p;
        int i6 = this.o;
        pg3 pg3Var = this.r;
        if (i < 0) {
            if (Math.min((md2Var.k() + c21.D(md2Var, pg3Var)) - i6, (md2Var2.k() + c21.D(md2Var2, pg3Var)) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - c21.D(md2Var, pg3Var), i5 - c21.D(md2Var2, pg3Var)) <= i) {
            return null;
        }
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            md2 md2Var3 = (md2) list.get(i7);
            md2Var3.getClass();
            if (md2Var3.u) {
                i2 = i4;
            } else {
                long j = md2Var3.r;
                i2 = i4;
                md2Var3.r = (((int) (j >> 32)) << 32) | ((((int) (j & 4294967295L)) + i) & 4294967295L);
                if (z) {
                    int size2 = md2Var3.e.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        md2Var3.h.a(i8, md2Var3.b);
                    }
                }
            }
            i7++;
            i4 = i2;
        }
        return new ld2(this.a, i4, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, list, this.o, this.p, this.q, pg3Var, this.s, this.t);
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
