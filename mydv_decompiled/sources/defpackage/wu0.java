package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class wu0 extends lw4 implements cw4 {
    public final rm1 J;
    public final q8 K;
    public vu0 L = new vu0(ws4.h().g());

    public wu0(rm1 rm1Var, q8 q8Var) {
        this.J = rm1Var;
        this.K = q8Var;
    }

    @Override // defpackage.kw4
    public final mw4 c() {
        return this.L;
    }

    @Override // defpackage.kw4
    public final void e(mw4 mw4Var) {
        this.L = (vu0) mw4Var;
    }

    @Override // defpackage.cw4
    public final Object getValue() {
        tm1 e = ws4.h().e();
        if (e != null) {
            e.invoke(this);
        }
        ns4 h = ws4.h();
        return h((vu0) ws4.g(this.L, h), h, true, this.J).f;
    }

    public final vu0 h(vu0 vu0Var, ns4 ns4Var, boolean z, rm1 rm1Var) {
        b53 a;
        q8 q8Var;
        int i;
        vu0 vu0Var2 = vu0Var;
        if (vu0Var2.c(this, ns4Var)) {
            if (z) {
                a = dt4.a();
                Object[] objArr = a.I;
                int i2 = a.K;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((fo1) objArr[i3]).b();
                }
                try {
                    a43 a43Var = vu0Var2.e;
                    lt4 lt4Var = dt4.a;
                    w22 w22Var = (w22) lt4Var.a();
                    if (w22Var == null) {
                        w22Var = new w22();
                        lt4Var.b(w22Var);
                    }
                    int i4 = w22Var.a;
                    Object[] objArr2 = a43Var.b;
                    int[] iArr = a43Var.c;
                    long[] jArr = a43Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        kw4 kw4Var = (kw4) objArr2[i9];
                                        i = i6;
                                        w22Var.a = i4 + iArr[i9];
                                        tm1 e = ns4Var.e();
                                        if (e != null) {
                                            e.invoke(kw4Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    w22Var.a = i4;
                    Object[] objArr3 = a.I;
                    int i10 = a.K;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((fo1) objArr3[i11]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return vu0Var2;
        }
        a43 a43Var2 = new a43();
        lt4 lt4Var2 = dt4.a;
        w22 w22Var2 = (w22) lt4Var2.a();
        if (w22Var2 == null) {
            w22Var2 = new w22();
            lt4Var2.b(w22Var2);
        }
        int i12 = w22Var2.a;
        a = dt4.a();
        Object[] objArr4 = a.I;
        int i13 = a.K;
        for (int i14 = 0; i14 < i13; i14++) {
            ((fo1) objArr4[i14]).b();
        }
        try {
            w22Var2.a = i12 + 1;
            Object k = o63.k(new uu0(this, w22Var2, a43Var2, i12), rm1Var);
            w22Var2.a = i12;
            Object[] objArr5 = a.I;
            int i15 = a.K;
            for (int i16 = 0; i16 < i15; i16++) {
                ((fo1) objArr5[i16]).a();
            }
            Object obj = ws4.c;
            synchronized (obj) {
                try {
                    ns4 h = ws4.h();
                    Object obj2 = vu0Var2.f;
                    if (obj2 == vu0.h || (q8Var = this.K) == null || !q8Var.g(k, obj2)) {
                        vu0Var2 = (vu0) ws4.l(this.L, this, h);
                        vu0Var2.e = a43Var2;
                        vu0Var2.g = vu0Var2.d(this, h);
                        vu0Var2.f = k;
                    } else {
                        vu0Var2.e = a43Var2;
                        vu0Var2.g = vu0Var2.d(this, h);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            w22 w22Var3 = (w22) dt4.a.a();
            if (w22Var3 == null || w22Var3.a != 0) {
                return vu0Var2;
            }
            ws4.h().m();
            synchronized (obj) {
                ns4 h2 = ws4.h();
                vu0Var2.c = h2.g();
                vu0Var2.d = h2.h();
            }
            return vu0Var2;
        } finally {
            Object[] objArr6 = a.I;
            int i17 = a.K;
            for (int i18 = 0; i18 < i17; i18++) {
                ((fo1) objArr6[i18]).a();
            }
        }
    }

    public final vu0 i() {
        ns4 h = ws4.h();
        return h((vu0) ws4.g(this.L, h), h, false, this.J);
    }

    public final String toString() {
        vu0 vu0Var = (vu0) ws4.f(this.L);
        return "DerivedState(value=" + (vu0Var.c(this, ws4.h()) ? String.valueOf(vu0Var.f) : "<Not calculated>") + ")@" + hashCode();
    }
}
