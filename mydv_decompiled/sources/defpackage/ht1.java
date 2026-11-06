package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ht1 {
    public final ca2 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final e43 f = new e43();
    public final sa3 g = new sa3();
    public final w33 h = new w33(10);

    public ht1(ca2 ca2Var) {
        this.a = ca2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    public final void a(long j, List list, boolean z) {
        w33 w33Var;
        long[] jArr;
        long[] jArr2;
        int i;
        ga3 ga3Var;
        ga3 ga3Var2;
        int size = list.size();
        sa3 sa3Var = this.g;
        sa3 sa3Var2 = sa3Var;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            w33Var = this.h;
            if (i2 >= size) {
                break;
            }
            k13 k13Var = (k13) list.get(i2);
            if (k13Var.isAttached()) {
                k13Var.setDetachedListener$ui(new ka(this, k13Var, (byte) 19));
                if (z2) {
                    b53 b53Var = sa3Var2.a;
                    ?? r14 = b53Var.I;
                    int i3 = b53Var.K;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            ga3Var2 = 0;
                            break;
                        }
                        ga3Var2 = r14[i4];
                        if (((ga3) ga3Var2).c.equals(k13Var)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    ga3Var = ga3Var2;
                    if (ga3Var != null) {
                        ga3Var.i = true;
                        ga3Var.d.e(j);
                        if (z) {
                            Object d = w33Var.d(j);
                            if (d == null) {
                                d = new e43();
                                w33Var.g(j, d);
                            }
                            ((e43) d).a(ga3Var);
                        }
                        sa3Var2 = ga3Var;
                    } else {
                        z2 = false;
                    }
                }
                ga3Var = new ga3(k13Var);
                ga3Var.d.e(j);
                if (z) {
                    Object d2 = w33Var.d(j);
                    if (d2 == null) {
                        d2 = new e43();
                        w33Var.g(j, d2);
                    }
                    ((e43) d2).a(ga3Var);
                }
                sa3Var2.a.c(ga3Var);
                sa3Var2 = ga3Var;
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = w33Var.b;
            Object[] objArr = w33Var.c;
            long[] jArr4 = w33Var.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr4[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i8;
                                long j3 = jArr3[i9];
                                e43 e43Var = (e43) objArr[i9];
                                b53 b53Var2 = sa3Var.a;
                                i = i6;
                                Object[] objArr2 = b53Var2.I;
                                int i10 = b53Var2.K;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((ga3) objArr2[i11]).f(j3, e43Var);
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i6;
                            }
                            j2 >>= i;
                            i8++;
                            i6 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr3 = jArr;
                }
            }
        }
        w33Var.a();
    }

    public final boolean b(s32 s32Var, boolean z) {
        sa3 sa3Var = this.g;
        b53 b53Var = sa3Var.a;
        if (!sa3Var.a(s32Var.a, this.a, s32Var, z)) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = b53Var.I;
        int i = b53Var.K;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((ga3) objArr[i2]).e(s32Var, z) || z3;
        }
        Object[] objArr2 = b53Var.I;
        int i3 = b53Var.K;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((ga3) objArr2[i4]).d(s32Var) || z4;
        }
        sa3Var.b(s32Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            e43 e43Var = this.f;
            int i5 = e43Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((k13) e43Var.g(i6));
            }
            e43Var.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            sa3Var.a.h();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        sa3 sa3Var = this.g;
        b53 b53Var = sa3Var.a;
        Object[] objArr = b53Var.I;
        int i = b53Var.K;
        for (int i2 = 0; i2 < i; i2++) {
            ((ga3) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            sa3Var.a.h();
        }
    }

    public final void d(k13 k13Var) {
        if (this.b) {
            this.e = true;
            this.f.a(k13Var);
            return;
        }
        sa3 sa3Var = this.g;
        e43 e43Var = sa3Var.b;
        e43Var.d();
        e43Var.a(sa3Var);
        while (e43Var.j()) {
            sa3 sa3Var2 = (sa3) e43Var.l(e43Var.b - 1);
            int i = 0;
            while (true) {
                b53 b53Var = sa3Var2.a;
                if (i < b53Var.K) {
                    ga3 ga3Var = (ga3) b53Var.I[i];
                    if (ga3Var.c.equals(k13Var)) {
                        sa3Var2.a.k(ga3Var);
                        ga3Var.c();
                    } else {
                        e43Var.a(ga3Var);
                        i++;
                    }
                }
            }
        }
    }
}
