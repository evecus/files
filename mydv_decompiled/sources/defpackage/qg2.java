package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qg2 {
    public final zg2 a;
    public final m22 b;
    public final lg2 c;
    public final pd2 d;
    public final long e;
    public final boolean f;
    public final pe2 g;
    public final int h;
    public final long i;
    public final int j;
    public final int k;
    public final int l;
    public final dl0 m;
    public final boolean n;
    public final List o;
    public final pg2 p;
    public final yv q;
    public final int r;

    public qg2(zg2 zg2Var, p33 p33Var, lg2 lg2Var, pd2 pd2Var, long j, boolean z, pe2 pe2Var, int i, long j2, int i2, int i3, int i4, dl0 dl0Var, boolean z2, List list, ir1 ir1Var) {
        this.a = zg2Var;
        this.b = p33Var;
        this.c = lg2Var;
        this.d = pd2Var;
        this.e = j;
        this.f = z;
        this.g = pe2Var;
        this.h = i;
        this.i = j2;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = dl0Var;
        this.n = z2;
        this.o = list;
        this.p = new pg2(this, z, lg2Var, pe2Var, pd2Var);
        this.q = zg2Var.e;
        this.r = pd2Var.b.length;
    }

    public final long a(lg2 lg2Var, int i, int i2) {
        boolean C = lg2Var.b.e.C(i);
        int i3 = C ? this.r : 1;
        if (C) {
            i2 = 0;
        }
        return (i2 << 32) | ((i3 + i2) & 4294967295L);
    }
}
