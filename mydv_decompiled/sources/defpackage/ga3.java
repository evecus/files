package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ga3 extends sa3 {
    public final k13 c;
    public na3 f;
    public kp3 g;
    public boolean h;
    public final yw0 d = new yw0((byte) 5);
    public final bs2 e = new bs2(2);
    public boolean i = true;
    public boolean j = true;

    public ga3(k13 k13Var) {
        this.c = k13Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [k13] */
    /* JADX WARN: Type inference failed for: r5v1, types: [k13] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20, types: [k13] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [b53] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [b53] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    @Override // defpackage.sa3
    public final boolean a(bs2 bs2Var, ca2 ca2Var, s32 s32Var, boolean z) {
        yw0 yw0Var;
        bs2 bs2Var2;
        rp3 rp3Var;
        boolean z2;
        boolean z3;
        kp3 kp3Var;
        int i;
        boolean z4;
        int i2;
        boolean z5;
        int i3;
        int i4;
        boolean a = super.a(bs2Var, ca2Var, s32Var, z);
        wt0 wt0Var = this.c;
        boolean z6 = true;
        if (wt0Var.isAttached()) {
            ?? r8 = 0;
            while (wt0Var != 0) {
                if (wt0Var instanceof vp3) {
                    this.f = jl2.H((vp3) wt0Var);
                } else if ((wt0Var.getKindSet$ui() & 16) != 0 && (wt0Var instanceof wt0)) {
                    k13 k13Var = wt0Var.J;
                    int i5 = 0;
                    wt0Var = wt0Var;
                    r8 = r8;
                    while (k13Var != null) {
                        if ((k13Var.getKindSet$ui() & 16) != 0) {
                            i5++;
                            r8 = r8;
                            if (i5 == 1) {
                                wt0Var = k13Var;
                            } else {
                                if (r8 == 0) {
                                    r8 = new b53(new k13[16]);
                                }
                                if (wt0Var != 0) {
                                    r8.c(wt0Var);
                                    wt0Var = 0;
                                }
                                r8.c(k13Var);
                            }
                        }
                        k13Var = k13Var.getChild$ui();
                        wt0Var = wt0Var;
                        r8 = r8;
                    }
                    if (i5 == 1) {
                    }
                }
                wt0Var = ut0.M(r8);
            }
            if (this.f != null) {
                int i6 = bs2Var.i();
                int i7 = 0;
                while (true) {
                    yw0Var = this.d;
                    bs2Var2 = this.e;
                    if (i7 >= i6) {
                        break;
                    }
                    long f = bs2Var.f(i7);
                    rp3 rp3Var2 = (rp3) bs2Var.j(i7);
                    if (yw0Var.g(f)) {
                        long h = rp3Var2.h();
                        z5 = z6;
                        long e = rp3Var2.e();
                        if ((((h & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((e & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            ArrayList arrayList = new ArrayList(rp3Var2.c().size());
                            List c = rp3Var2.c();
                            z4 = a;
                            int size = c.size();
                            i2 = i6;
                            int i8 = 0;
                            while (i8 < size) {
                                gt1 gt1Var = (gt1) c.get(i8);
                                int i9 = size;
                                int i10 = i8;
                                long c2 = gt1Var.c();
                                if ((((c2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long e2 = gt1Var.e();
                                    i4 = i7;
                                    na3 na3Var = this.f;
                                    na3Var.getClass();
                                    arrayList.add(new gt1(gt1Var.d(), e2, na3Var.I(ca2Var, c2), gt1Var.b(), gt1Var.a()));
                                } else {
                                    i4 = i7;
                                }
                                i8 = i10 + 1;
                                size = i9;
                                i7 = i4;
                            }
                            i3 = i7;
                            na3 na3Var2 = this.f;
                            na3Var2.getClass();
                            long I = na3Var2.I(ca2Var, h);
                            na3 na3Var3 = this.f;
                            na3Var3.getClass();
                            bs2Var2.g(f, rp3.b(rp3Var2, na3Var3.I(ca2Var, e), I, arrayList));
                        } else {
                            z4 = a;
                            i2 = i6;
                            i3 = i7;
                        }
                    } else {
                        z4 = a;
                        i2 = i6;
                        z5 = z6;
                        i3 = i7;
                    }
                    i7 = i3 + 1;
                    z6 = z5;
                    a = z4;
                    i6 = i2;
                }
                boolean z7 = a;
                boolean z8 = z6;
                if (bs2Var2.i() == 0) {
                    yw0Var.f();
                    this.a.h();
                    return z8;
                }
                int k = yw0Var.k();
                while (true) {
                    k--;
                    if (-1 >= k) {
                        break;
                    }
                    long j = yw0Var.j(k);
                    if (bs2Var.I) {
                        int i11 = bs2Var.L;
                        long[] jArr = bs2Var.J;
                        Object[] objArr = bs2Var.K;
                        int i12 = 0;
                        for (int i13 = 0; i13 < i11; i13++) {
                            Object obj = objArr[i13];
                            if (obj != eu5.o) {
                                if (i13 != i12) {
                                    jArr[i12] = jArr[i13];
                                    objArr[i12] = obj;
                                    objArr[i13] = null;
                                }
                                i12++;
                            }
                        }
                        bs2Var.I = false;
                        bs2Var.L = i12;
                    }
                    if (o7.h(bs2Var.J, bs2Var.L, j) < 0) {
                        yw0Var.p(k);
                    }
                }
                ArrayList arrayList2 = new ArrayList(bs2Var2.i());
                int i14 = bs2Var2.i();
                for (int i15 = 0; i15 < i14; i15++) {
                    arrayList2.add(bs2Var2.j(i15));
                }
                kp3 kp3Var2 = new kp3(arrayList2, s32Var);
                int size2 = arrayList2.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size2) {
                        rp3Var = null;
                        break;
                    }
                    ?? r5 = arrayList2.get(i16);
                    if (s32Var.a(((rp3) r5).d())) {
                        rp3Var = r5;
                        break;
                    }
                    i16++;
                }
                rp3 rp3Var3 = rp3Var;
                if (rp3Var3 != null) {
                    if (z) {
                        z2 = false;
                        if (!this.i && (rp3Var3.f() || rp3Var3.i())) {
                            this.f.getClass();
                            this.i = !dq2.e0(r3.K, rp3Var3);
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                    }
                    boolean z9 = this.i;
                    boolean z10 = this.h;
                    if (z9 == z10 || !((i = kp3Var2.f) == 3 || i == 4 || i == 5)) {
                        int i17 = kp3Var2.f;
                        if (i17 == 4 && z10 && !this.j) {
                            kp3Var2.f = 3;
                        } else if (i17 == 5 && z9 && rp3Var3.f()) {
                            kp3Var2.f = 3;
                        }
                    } else {
                        kp3Var2.f = z9 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z7 && kp3Var2.f == 3 && (kp3Var = this.g) != null) {
                    ?? r1 = kp3Var.a;
                    int size3 = r1.size();
                    ?? r4 = kp3Var2.a;
                    if (size3 == r4.size()) {
                        int size4 = r4.size();
                        for (?? r52 = z2; r52 < size4; r52++) {
                            if (pd3.c(((rp3) r1.get(r52)).e(), ((rp3) r4.get(r52)).e())) {
                            }
                        }
                        z3 = z2;
                        this.g = kp3Var2;
                        return z3;
                    }
                }
                z3 = z8;
                this.g = kp3Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // defpackage.sa3
    public final void b(s32 s32Var) {
        super.b(s32Var);
        kp3 kp3Var = this.g;
        if (kp3Var == null) {
            return;
        }
        this.h = this.i;
        List list = kp3Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            rp3 rp3Var = (rp3) list.get(i);
            boolean f = rp3Var.f();
            boolean a = s32Var.a(rp3Var.d());
            boolean z = this.i;
            if ((!f && !a) || (!f && !z)) {
                this.d.o(rp3Var.d());
            }
        }
        this.i = false;
        this.j = kp3Var.f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [b53] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [b53] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [k13] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [k13] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [k13] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        b53 b53Var = this.a;
        Object[] objArr = b53Var.I;
        int i = b53Var.K;
        for (int i2 = 0; i2 < i; i2++) {
            ((ga3) objArr[i2]).c();
        }
        wt0 wt0Var = this.c;
        ?? r1 = 0;
        while (wt0Var != 0) {
            if (wt0Var instanceof vp3) {
                ((vp3) wt0Var).y();
            } else if ((wt0Var.getKindSet$ui() & 16) != 0 && (wt0Var instanceof wt0)) {
                k13 k13Var = wt0Var.J;
                int i3 = 0;
                r1 = r1;
                wt0Var = wt0Var;
                while (k13Var != null) {
                    if ((k13Var.getKindSet$ui() & 16) != 0) {
                        i3++;
                        r1 = r1;
                        if (i3 == 1) {
                            wt0Var = k13Var;
                        } else {
                            if (r1 == 0) {
                                r1 = new b53(new k13[16]);
                            }
                            if (wt0Var != 0) {
                                r1.c(wt0Var);
                                wt0Var = 0;
                            }
                            r1.c(k13Var);
                        }
                    }
                    k13Var = k13Var.getChild$ui();
                    r1 = r1;
                    wt0Var = wt0Var;
                }
                if (i3 == 1) {
                }
            }
            wt0Var = ut0.M(r1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [k13] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [k13] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [b53] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [b53] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(s32 s32Var) {
        wa2 wa2Var;
        bs2 bs2Var = this.e;
        boolean z = false;
        z = false;
        z = false;
        if (bs2Var.i() != 0) {
            k13 k13Var = this.c;
            if (k13Var.isAttached()) {
                na3 coordinator$ui = k13Var.getCoordinator$ui();
                if ((coordinator$ui == null || (wa2Var = coordinator$ui.c0) == null) ? false : wa2Var.L()) {
                    kp3 kp3Var = this.g;
                    kp3Var.getClass();
                    na3 na3Var = this.f;
                    na3Var.getClass();
                    long j = na3Var.K;
                    wt0 wt0Var = k13Var;
                    ?? r8 = 0;
                    while (wt0Var != 0) {
                        if (wt0Var instanceof vp3) {
                            ((vp3) wt0Var).p(kp3Var, lp3.K, j);
                        } else if ((wt0Var.getKindSet$ui() & 16) != 0 && (wt0Var instanceof wt0)) {
                            k13 k13Var2 = wt0Var.J;
                            int i = 0;
                            wt0Var = wt0Var;
                            r8 = r8;
                            while (k13Var2 != null) {
                                if ((k13Var2.getKindSet$ui() & 16) != 0) {
                                    i++;
                                    r8 = r8;
                                    if (i == 1) {
                                        wt0Var = k13Var2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new b53(new k13[16]);
                                        }
                                        if (wt0Var != 0) {
                                            r8.c(wt0Var);
                                            wt0Var = 0;
                                        }
                                        r8.c(k13Var2);
                                    }
                                }
                                k13Var2 = k13Var2.getChild$ui();
                                wt0Var = wt0Var;
                                r8 = r8;
                            }
                            if (i == 1) {
                            }
                        }
                        wt0Var = ut0.M(r8);
                    }
                    if (k13Var.isAttached()) {
                        b53 b53Var = this.a;
                        Object[] objArr = b53Var.I;
                        int i2 = b53Var.K;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((ga3) objArr[i3]).d(s32Var);
                        }
                    }
                    z = true;
                }
            }
        }
        b(s32Var);
        bs2Var.b();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [k13] */
    /* JADX WARN: Type inference failed for: r0v3, types: [k13] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [k13] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [b53] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [b53] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [k13] */
    /* JADX WARN: Type inference failed for: r6v10, types: [k13] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [b53] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [b53] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(s32 s32Var, boolean z) {
        wa2 wa2Var;
        if (this.e.i() == 0) {
            return false;
        }
        wt0 wt0Var = this.c;
        if (wt0Var.isAttached()) {
            na3 coordinator$ui = wt0Var.getCoordinator$ui();
            if ((coordinator$ui == null || (wa2Var = coordinator$ui.c0) == null) ? false : wa2Var.L()) {
                kp3 kp3Var = this.g;
                kp3Var.getClass();
                na3 na3Var = this.f;
                na3Var.getClass();
                long j = na3Var.K;
                wt0 wt0Var2 = wt0Var;
                ?? r7 = 0;
                while (wt0Var2 != 0) {
                    if (wt0Var2 instanceof vp3) {
                        ((vp3) wt0Var2).p(kp3Var, lp3.I, j);
                    } else if ((wt0Var2.getKindSet$ui() & 16) != 0 && (wt0Var2 instanceof wt0)) {
                        k13 k13Var = wt0Var2.J;
                        int i = 0;
                        wt0Var2 = wt0Var2;
                        r7 = r7;
                        while (k13Var != null) {
                            if ((k13Var.getKindSet$ui() & 16) != 0) {
                                i++;
                                r7 = r7;
                                if (i == 1) {
                                    wt0Var2 = k13Var;
                                } else {
                                    if (r7 == 0) {
                                        r7 = new b53(new k13[16]);
                                    }
                                    if (wt0Var2 != 0) {
                                        r7.c(wt0Var2);
                                        wt0Var2 = 0;
                                    }
                                    r7.c(k13Var);
                                }
                            }
                            k13Var = k13Var.getChild$ui();
                            wt0Var2 = wt0Var2;
                            r7 = r7;
                        }
                        if (i == 1) {
                        }
                    }
                    wt0Var2 = ut0.M(r7);
                }
                if (wt0Var.isAttached()) {
                    b53 b53Var = this.a;
                    Object[] objArr = b53Var.I;
                    int i2 = b53Var.K;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ga3 ga3Var = (ga3) objArr[i3];
                        this.f.getClass();
                        ga3Var.e(s32Var, z);
                    }
                }
                if (wt0Var.isAttached()) {
                    ?? r13 = 0;
                    while (wt0Var != 0) {
                        if (wt0Var instanceof vp3) {
                            ((vp3) wt0Var).p(kp3Var, lp3.J, j);
                        } else if ((wt0Var.getKindSet$ui() & 16) != 0 && (wt0Var instanceof wt0)) {
                            k13 k13Var2 = wt0Var.J;
                            int i4 = 0;
                            wt0Var = wt0Var;
                            r13 = r13;
                            while (k13Var2 != null) {
                                if ((k13Var2.getKindSet$ui() & 16) != 0) {
                                    i4++;
                                    r13 = r13;
                                    if (i4 == 1) {
                                        wt0Var = k13Var2;
                                    } else {
                                        if (r13 == 0) {
                                            r13 = new b53(new k13[16]);
                                        }
                                        if (wt0Var != 0) {
                                            r13.c(wt0Var);
                                            wt0Var = 0;
                                        }
                                        r13.c(k13Var2);
                                    }
                                }
                                k13Var2 = k13Var2.getChild$ui();
                                wt0Var = wt0Var;
                                r13 = r13;
                            }
                            if (i4 == 1) {
                            }
                        }
                        wt0Var = ut0.M(r13);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, e43 e43Var) {
        yw0 yw0Var = this.d;
        if (yw0Var.g(j) && !e43Var.e(this)) {
            yw0Var.o(j);
            this.e.h(j);
        }
        b53 b53Var = this.a;
        Object[] objArr = b53Var.I;
        int i = b53Var.K;
        for (int i2 = 0; i2 < i; i2++) {
            ((ga3) objArr[i2]).f(j, e43Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ")";
    }
}
