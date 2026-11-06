package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class vu0 extends mw4 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public a43 e;
    public Object f;
    public int g;

    public vu0(long j) {
        super(j);
        a43 a43Var = dd3.a;
        a43Var.getClass();
        this.e = a43Var;
        this.f = h;
    }

    @Override // defpackage.mw4
    public final void a(mw4 mw4Var) {
        mw4Var.getClass();
        vu0 vu0Var = (vu0) mw4Var;
        this.e = vu0Var.e;
        this.f = vu0Var.f;
        this.g = vu0Var.g;
    }

    public final boolean c(wu0 wu0Var, ns4 ns4Var) {
        boolean z;
        boolean z2;
        Object obj = ws4.c;
        synchronized (obj) {
            z = true;
            if (this.c == ns4Var.g()) {
                if (this.d == ns4Var.h()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.f == h || (z2 && this.g != d(wu0Var, ns4Var))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.c = ns4Var.g();
            this.d = ns4Var.h();
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [vu0] */
    /* JADX WARN: Type inference failed for: r13v5, types: [mw4] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, mw4] */
    public final int d(wu0 wu0Var, ns4 ns4Var) {
        a43 a43Var;
        int i;
        long[] jArr;
        int i2;
        Object[] objArr;
        long[] jArr2;
        int i3;
        Object[] objArr2;
        long j;
        long j2;
        int i4;
        ?? g;
        synchronized (ws4.c) {
            a43Var = this.e;
        }
        int i5 = 7;
        if (a43Var.e == 0) {
            return 7;
        }
        b53 a = dt4.a();
        Object[] objArr3 = a.I;
        int i6 = a.K;
        boolean z = false;
        for (int i7 = 0; i7 < i6; i7++) {
            ((fo1) objArr3[i7]).b();
        }
        try {
            Object[] objArr4 = a43Var.b;
            int[] iArr = a43Var.c;
            long[] jArr3 = a43Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i = 7;
                int i8 = 0;
                while (true) {
                    long j3 = jArr3[i8];
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << i5) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        i2 = i5;
                        int i11 = z ? 1 : 0;
                        while (i11 < i10) {
                            if ((j3 & 255) < 128) {
                                int i12 = (i8 << 3) + i11;
                                j2 = j4;
                                kw4 kw4Var = (kw4) objArr4[i12];
                                int i13 = i9;
                                if (iArr[i12] != 1) {
                                    jArr2 = jArr3;
                                    i3 = i11;
                                    objArr2 = objArr4;
                                    j = j3;
                                } else {
                                    if (kw4Var instanceof wu0) {
                                        wu0 wu0Var2 = (wu0) kw4Var;
                                        g = wu0Var2.h((vu0) ws4.g(wu0Var2.L, ns4Var), ns4Var, z, wu0Var2.J);
                                        a43 a43Var2 = g.e;
                                        Object[] objArr5 = a43Var2.b;
                                        long[] jArr4 = a43Var2.a;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        if (length2 >= 0) {
                                            int i14 = 0;
                                            while (true) {
                                                long j5 = jArr4[i14];
                                                j = j3;
                                                int i15 = i;
                                                if ((((~j5) << i2) & j5 & j2) != j2) {
                                                    int i16 = 8 - ((~(i14 - length2)) >>> 31);
                                                    for (int i17 = 0; i17 < i16; i17++) {
                                                        if ((j5 & 255) < 128) {
                                                            i15 = (i15 * 31) + System.identityHashCode((kw4) objArr5[(i14 << 3) + i17]);
                                                        }
                                                        j5 >>= i13;
                                                    }
                                                    if (i16 != i13) {
                                                        i = i15;
                                                        break;
                                                    }
                                                }
                                                i = i15;
                                                if (i14 == length2) {
                                                    break;
                                                }
                                                i14++;
                                                j3 = j;
                                                i13 = 8;
                                            }
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        j = j3;
                                        g = ws4.g(kw4Var.c(), ns4Var);
                                    }
                                    int identityHashCode = ((i * 31) + System.identityHashCode(g)) * 31;
                                    long j6 = g.a;
                                    i = identityHashCode + ((int) (j6 ^ (j6 >>> 32)));
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                i3 = i11;
                                objArr2 = objArr4;
                                j = j3;
                                j2 = j4;
                                i4 = i9;
                            }
                            j3 = j >> i4;
                            i9 = i4;
                            j4 = j2;
                            objArr4 = objArr2;
                            z = false;
                            i11 = i3 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr4;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i2 = i5;
                        objArr = objArr4;
                    }
                    if (i8 == length) {
                        i5 = i;
                        break;
                    }
                    i8++;
                    i5 = i2;
                    jArr3 = jArr;
                    objArr4 = objArr;
                    z = false;
                }
            }
            i = i5;
            Object[] objArr6 = a.I;
            int i18 = a.K;
            for (int i19 = 0; i19 < i18; i19++) {
                ((fo1) objArr6[i19]).a();
            }
            return i;
        } catch (Throwable th) {
            Object[] objArr7 = a.I;
            int i20 = a.K;
            for (int i21 = 0; i21 < i20; i21++) {
                ((fo1) objArr7[i21]).a();
            }
            throw th;
        }
    }
}
