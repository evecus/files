package defpackage;

import androidx.media3.common.util.Log;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class bk3 {
    public String a;
    public m65 b;
    public kj1 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public long h;
    public iu0 i;
    public td j;
    public boolean k;
    public long l;
    public mz2 m;
    public ak3 n;
    public da2 o;
    public long p;
    public int q;
    public int r;
    public long s;

    public bk3(String str, m65 m65Var, kj1 kj1Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = m65Var;
        this.c = kj1Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        int i4 = u02.b;
        this.h = u02.a;
        this.l = 0L;
        if (!(true & true)) {
            s02.a("width and height must be >= 0");
        }
        this.p = eh0.h(0, 0, 0, 0);
        this.q = -1;
        this.r = -1;
    }

    public static long f(bk3 bk3Var, long j, da2 da2Var) {
        m65 m65Var = bk3Var.b;
        mz2 mz2Var = bk3Var.m;
        iu0 iu0Var = bk3Var.i;
        iu0Var.getClass();
        mz2 E = lq2.E(mz2Var, da2Var, m65Var, iu0Var, bk3Var.c);
        bk3Var.m = E;
        return E.a(bk3Var.g, j);
    }

    public final int a(int i, da2 da2Var) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long a = eh0.a(0, i, 0, Log.LOG_LEVEL_OFF);
        if (this.g > 1) {
            a = f(this, a, da2Var);
        }
        ak3 e = e(da2Var);
        long q = rt0.q(a, this.e, this.d, e.c());
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int b = qi4.b(new td((xd) e, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, q).f);
        int i6 = dh0.i(a);
        if (b < i6) {
            b = i6;
        }
        this.q = i;
        this.r = b;
        return b;
    }

    public final boolean b(long j, da2 da2Var) {
        ak3 ak3Var;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        long f = this.g > 1 ? f(this, j, da2Var) : j;
        td tdVar = this.j;
        boolean z2 = false;
        if (tdVar != null && (ak3Var = this.n) != null && !ak3Var.a() && da2Var == this.o && (dh0.b(f, this.p) || (dh0.h(f) == dh0.h(this.p) && dh0.j(f) == dh0.j(this.p) && dh0.g(f) >= tdVar.f && !tdVar.d.d))) {
            if (!dh0.b(f, this.p)) {
                td tdVar2 = this.j;
                tdVar2.getClass();
                this.l = eh0.d(f, (qi4.b(Math.min(tdVar2.a.i.c(), tdVar2.c())) << 32) | (qi4.b(tdVar2.f) & 4294967295L));
                if (this.d == 3 || (((int) (r12 >> 32)) >= tdVar2.c() && ((int) (4294967295L & r12)) >= tdVar2.f)) {
                    z = false;
                }
                this.k = z;
                this.p = f;
            }
            return false;
        }
        ak3 e = e(da2Var);
        long q = rt0.q(f, this.e, this.d, e.c());
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        td tdVar3 = new td((xd) e, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, q);
        this.p = f;
        int b = qi4.b(tdVar3.c());
        float f2 = tdVar3.f;
        this.l = eh0.d(f, (qi4.b(f2) & 4294967295L) | (b << 32));
        if (this.d != 3 && (((int) (r3 >> 32)) < tdVar3.c() || ((int) (r3 & 4294967295L)) < f2)) {
            z2 = true;
        }
        this.k = z2;
        this.j = tdVar3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        if (!(true & true)) {
            s02.a("width and height must be >= 0");
        }
        this.p = eh0.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(iu0 iu0Var) {
        long j;
        iu0 iu0Var2 = this.i;
        if (iu0Var != null) {
            int i = u02.b;
            j = u02.a(iu0Var.getDensity(), iu0Var.L());
        } else {
            j = u02.a;
        }
        if (iu0Var2 == null) {
            this.i = iu0Var;
            this.h = j;
        } else if (iu0Var == null || this.h != j) {
            this.i = iu0Var;
            this.h = j;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final ak3 e(da2 da2Var) {
        ak3 ak3Var = this.n;
        if (ak3Var == null || da2Var != this.o || ak3Var.a()) {
            this.o = da2Var;
            String str = this.a;
            m65 z = ad4.z(this.b, da2Var);
            iu0 iu0Var = this.i;
            iu0Var.getClass();
            kj1 kj1Var = this.c;
            boolean z2 = this.e;
            o91 o91Var = o91.I;
            ak3Var = new xd(str, z, o91Var, o91Var, kj1Var, iu0Var, z2);
        }
        this.n = ak3Var;
        return ak3Var;
    }

    public final String toString() {
        return r7.D(r7.F("ParagraphLayoutCache(paragraph=", this.j != null ? "<paragraph>" : "null", ", lastDensity=", u02.b(this.h), ", history="), this.s, ", constraints=$)");
    }
}
