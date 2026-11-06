package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ws4 {
    public static final ba4 a = new ba4(23);
    public static final lt4 b = new lt4();
    public static final Object c = new Object();
    public static us4 d;
    public static long e;
    public static final rs4 f;
    public static final tl g;
    public static List h;
    public static List i;
    public static final zq1 j;
    public static final xq k;

    static {
        us4 us4Var = us4.M;
        d = us4Var;
        e = 2L;
        rs4 rs4Var = new rs4();
        rs4Var.b = new long[16];
        rs4Var.c = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        rs4Var.d = iArr;
        f = rs4Var;
        tl tlVar = new tl();
        tlVar.b = new int[16];
        tlVar.c = new bt5[16];
        g = tlVar;
        o91 o91Var = o91.I;
        h = o91Var;
        i = o91Var;
        long j2 = e;
        e = 1 + j2;
        zq1 zq1Var = new zq1(j2, us4Var, null, new yy0((byte) 14));
        d = d.h(zq1Var.b);
        j = zq1Var;
        k = new xq(0);
    }

    public static final us4 a(us4 us4Var, long j2, long j3) {
        while (j42.n(j2, j3) < 0) {
            us4Var = us4Var.h(j2);
            j2++;
        }
        return us4Var;
    }

    public static final Object b(tm1 tm1Var) {
        o43 o43Var;
        Object v;
        zq1 zq1Var = j;
        synchronized (c) {
            try {
                o43Var = zq1Var.h;
                if (o43Var != null) {
                    k.addAndGet(1);
                }
                v = v(zq1Var, tm1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (o43Var != null) {
            try {
                List list = h;
                la4 la4Var = new la4(o43Var);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((hn1) list.get(i2)).invoke(la4Var, zq1Var);
                }
            } finally {
                k.addAndGet(-1);
            }
        }
        synchronized (c) {
            d();
            if (o43Var != null) {
                Object[] objArr = o43Var.b;
                long[] jArr = o43Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    q((kw4) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        return v;
    }

    public static final void c() {
        b(a);
    }

    public static final void d() {
        tl tlVar = g;
        int i2 = tlVar.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            bt5 bt5Var = ((bt5[]) tlVar.c)[i3];
            Object obj = bt5Var != null ? bt5Var.get() : null;
            if (obj != null && p((kw4) obj)) {
                if (i4 != i3) {
                    ((bt5[]) tlVar.c)[i4] = bt5Var;
                    int[] iArr = (int[]) tlVar.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((bt5[]) tlVar.c)[i5] = null;
            ((int[]) tlVar.b)[i5] = 0;
        }
        if (i4 != i2) {
            tlVar.a = i4;
        }
    }

    public static final ns4 e(ns4 ns4Var, tm1 tm1Var, boolean z) {
        boolean z2 = ns4Var instanceof s43;
        if (z2 || ns4Var == null) {
            return new ia5(z2 ? (s43) ns4Var : null, tm1Var, null, false, z);
        }
        return new ja5(ns4Var, tm1Var, false, z);
    }

    public static final mw4 f(mw4 mw4Var) {
        mw4 s;
        ns4 h2 = h();
        mw4 s2 = s(mw4Var, h2.g(), h2.d());
        if (s2 != null) {
            return s2;
        }
        synchronized (c) {
            ns4 h3 = h();
            s = s(mw4Var, h3.g(), h3.d());
        }
        if (s != null) {
            return s;
        }
        r();
        throw null;
    }

    public static final mw4 g(mw4 mw4Var, ns4 ns4Var) {
        mw4 s;
        mw4 s2 = s(mw4Var, ns4Var.g(), ns4Var.d());
        if (s2 != null) {
            return s2;
        }
        synchronized (c) {
            s = s(mw4Var, ns4Var.g(), ns4Var.d());
        }
        if (s != null) {
            return s;
        }
        r();
        throw null;
    }

    public static final ns4 h() {
        ns4 ns4Var = (ns4) b.a();
        return ns4Var == null ? j : ns4Var;
    }

    public static final tm1 i(tm1 tm1Var, tm1 tm1Var2, boolean z) {
        if (!z) {
            tm1Var2 = null;
        }
        return (tm1Var == null || tm1Var2 == null || tm1Var == tm1Var2) ? tm1Var == null ? tm1Var2 : tm1Var : new vs4(tm1Var, tm1Var2, (byte) 0);
    }

    public static final tm1 j(tm1 tm1Var, tm1 tm1Var2) {
        return (tm1Var == null || tm1Var2 == null || tm1Var == tm1Var2) ? tm1Var == null ? tm1Var2 : tm1Var : new vs4(tm1Var, tm1Var2, (byte) 1);
    }

    public static final mw4 k(mw4 mw4Var, kw4 kw4Var) {
        mw4 c2 = kw4Var.c();
        long j2 = e;
        rs4 rs4Var = f;
        if (rs4Var.a > 0) {
            j2 = rs4Var.b[0];
        }
        long j3 = j2 - 1;
        mw4 mw4Var2 = null;
        mw4 mw4Var3 = null;
        while (true) {
            if (c2 == null) {
                break;
            }
            long j4 = c2.a;
            if (j4 == 0) {
                break;
            }
            if (j4 != 0 && j42.n(j4, j3) <= 0 && !us4.M.e(j4)) {
                if (mw4Var3 == null) {
                    mw4Var3 = c2;
                } else if (j42.n(c2.a, mw4Var3.a) >= 0) {
                    mw4Var2 = mw4Var3;
                }
            }
            c2 = c2.b;
        }
        mw4Var2 = c2;
        if (mw4Var2 != null) {
            mw4Var2.a = Long.MAX_VALUE;
            return mw4Var2;
        }
        mw4 b2 = mw4Var.b(Long.MAX_VALUE);
        b2.b = kw4Var.c();
        kw4Var.e(b2);
        return b2;
    }

    public static final mw4 l(mw4 mw4Var, wu0 wu0Var, ns4 ns4Var) {
        mw4 k2;
        synchronized (c) {
            k2 = k(mw4Var, wu0Var);
            k2.a(mw4Var);
            k2.a = ns4Var.g();
        }
        return k2;
    }

    public static final void m(ns4 ns4Var, kw4 kw4Var) {
        ns4Var.t(ns4Var.h() + 1);
        tm1 i2 = ns4Var.i();
        if (i2 != null) {
            i2.invoke(kw4Var);
        }
    }

    public static final HashMap n(long j2, s43 s43Var, us4 us4Var) {
        long[] jArr;
        us4 us4Var2;
        long[] jArr2;
        us4 us4Var3;
        int i2;
        int i3;
        mw4 s;
        o43 x = s43Var.x();
        if (x != null) {
            long g2 = s43Var.g();
            us4 f2 = s43Var.d().h(g2).f(s43Var.j);
            Object[] objArr = x.b;
            long[] jArr3 = x.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                kw4 kw4Var = (kw4) objArr[(i4 << 3) + i7];
                                mw4 c2 = kw4Var.c();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                mw4 s2 = s(c2, j2, us4Var);
                                if (s2 == null || (s = s(c2, g2, f2)) == null || s2.equals(s)) {
                                    us4Var3 = f2;
                                } else {
                                    us4Var3 = f2;
                                    mw4 s3 = s(c2, g2, s43Var.d());
                                    if (s3 == null) {
                                        r();
                                        throw null;
                                    }
                                    mw4 d2 = kw4Var.d(s, s2, s3);
                                    if (d2 == null) {
                                        return null;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(s2, d2);
                                    hashMap = hashMap;
                                }
                            } else {
                                jArr2 = jArr3;
                                us4Var3 = f2;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            f2 = us4Var3;
                        }
                        jArr = jArr3;
                        us4Var2 = f2;
                        if (i6 != i5) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        us4Var2 = f2;
                    }
                    if (i4 == length) {
                        return hashMap;
                    }
                    i4++;
                    jArr3 = jArr;
                    f2 = us4Var2;
                }
            }
        }
        return null;
    }

    public static final mw4 o(mw4 mw4Var, lw4 lw4Var, ns4 ns4Var, mw4 mw4Var2) {
        mw4 k2;
        if (ns4Var.f()) {
            ns4Var.n(lw4Var);
        }
        long g2 = ns4Var.g();
        if (mw4Var2.a == g2) {
            return mw4Var2;
        }
        synchronized (c) {
            k2 = k(mw4Var, lw4Var);
        }
        k2.a = g2;
        ns4Var.n(lw4Var);
        return k2;
    }

    public static final boolean p(kw4 kw4Var) {
        mw4 mw4Var;
        long j2 = e;
        rs4 rs4Var = f;
        if (rs4Var.a > 0) {
            j2 = rs4Var.b[0];
        }
        mw4 mw4Var2 = null;
        mw4 mw4Var3 = null;
        int i2 = 0;
        for (mw4 c2 = kw4Var.c(); c2 != null; c2 = c2.b) {
            long j3 = c2.a;
            if (j3 != 0) {
                if (j42.n(j3, j2) >= 0) {
                    i2++;
                } else if (mw4Var2 == null) {
                    i2++;
                    mw4Var2 = c2;
                } else {
                    if (j42.n(c2.a, mw4Var2.a) < 0) {
                        mw4Var = mw4Var2;
                        mw4Var2 = c2;
                    } else {
                        mw4Var = c2;
                    }
                    if (mw4Var3 == null) {
                        mw4Var3 = kw4Var.c();
                        mw4 mw4Var4 = mw4Var3;
                        while (true) {
                            if (mw4Var3 == null) {
                                mw4Var3 = mw4Var4;
                                break;
                            }
                            if (j42.n(mw4Var3.a, j2) >= 0) {
                                break;
                            }
                            if (j42.n(mw4Var4.a, mw4Var3.a) < 0) {
                                mw4Var4 = mw4Var3;
                            }
                            mw4Var3 = mw4Var3.b;
                        }
                    }
                    mw4Var2.a = 0L;
                    mw4Var2.a(mw4Var3);
                    mw4Var2 = mw4Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void q(kw4 kw4Var) {
        if (p(kw4Var)) {
            tl tlVar = g;
            int i2 = tlVar.a;
            int identityHashCode = System.identityHashCode(kw4Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = tlVar.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) tlVar.b)[i6];
                    if (i7 < identityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > identityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        bt5 bt5Var = ((bt5[]) tlVar.c)[i6];
                        if (kw4Var != (bt5Var != null ? bt5Var.get() : null)) {
                            for (int i8 = i6 - 1; -1 < i8 && ((int[]) tlVar.b)[i8] == identityHashCode; i8--) {
                                bt5 bt5Var2 = ((bt5[]) tlVar.c)[i8];
                                if ((bt5Var2 != null ? bt5Var2.get() : null) == kw4Var) {
                                    i3 = i8;
                                    break;
                                }
                            }
                            i6++;
                            int i9 = tlVar.a;
                            while (true) {
                                if (i6 >= i9) {
                                    i3 = -(tlVar.a + 1);
                                    break;
                                } else {
                                    if (((int[]) tlVar.b)[i6] != identityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    bt5 bt5Var3 = ((bt5[]) tlVar.c)[i6];
                                    if ((bt5Var3 != null ? bt5Var3.get() : null) == kw4Var) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                        }
                        i3 = i6;
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            bt5[] bt5VarArr = (bt5[]) tlVar.c;
            int length = bt5VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                bt5[] bt5VarArr2 = new bt5[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(bt5VarArr, i10, bt5VarArr2, i12, i2 - i10);
                System.arraycopy((bt5[]) tlVar.c, 0, bt5VarArr2, 0, i10);
                dq.O0(i12, i10, i2, (int[]) tlVar.b, iArr);
                dq.S0(0, i10, 6, (int[]) tlVar.b, iArr);
                tlVar.c = bt5VarArr2;
                tlVar.b = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(bt5VarArr, i10, bt5VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) tlVar.b;
                dq.O0(i13, i10, i2, iArr2, iArr2);
            }
            ((bt5[]) tlVar.c)[i10] = new bt5(kw4Var);
            ((int[]) tlVar.b)[i10] = identityHashCode;
            tlVar.a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final mw4 s(mw4 mw4Var, long j2, us4 us4Var) {
        mw4 mw4Var2 = null;
        while (mw4Var != null) {
            long j3 = mw4Var.a;
            if (j3 != 0 && j42.n(j3, j2) <= 0 && !us4Var.e(j3) && (mw4Var2 == null || j42.n(mw4Var2.a, mw4Var.a) < 0)) {
                mw4Var2 = mw4Var;
            }
            mw4Var = mw4Var.b;
        }
        if (mw4Var2 != null) {
            return mw4Var2;
        }
        return null;
    }

    public static final mw4 t(mw4 mw4Var, kw4 kw4Var) {
        mw4 s;
        ns4 h2 = h();
        tm1 e2 = h2.e();
        if (e2 != null) {
            e2.invoke(kw4Var);
        }
        mw4 s2 = s(mw4Var, h2.g(), h2.d());
        if (s2 != null) {
            return s2;
        }
        synchronized (c) {
            ns4 h3 = h();
            mw4 c2 = kw4Var.c();
            c2.getClass();
            s = s(c2, h3.g(), h3.d());
            if (s == null) {
                r();
                throw null;
            }
        }
        return s;
    }

    public static final void u(int i2) {
        rs4 rs4Var = f;
        int i3 = rs4Var.d[i2];
        rs4Var.b(i3, rs4Var.a - 1);
        rs4Var.a--;
        long[] jArr = rs4Var.b;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (j42.n(jArr[i5], j2) <= 0) {
                break;
            }
            rs4Var.b(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = rs4Var.b;
        int i6 = rs4Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < rs4Var.a && j42.n(jArr2[i7], jArr2[i8]) < 0) {
                if (j42.n(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                rs4Var.b(i7, i3);
                i3 = i7;
            } else {
                if (j42.n(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                rs4Var.b(i8, i3);
                i3 = i8;
            }
        }
        rs4Var.d[i2] = rs4Var.e;
        rs4Var.e = i2;
    }

    public static final Object v(zq1 zq1Var, tm1 tm1Var) {
        long j2 = zq1Var.b;
        Object invoke = tm1Var.invoke(d.d(j2));
        long j3 = e;
        e = 1 + j3;
        us4 d2 = d.d(j2);
        d = d2;
        zq1Var.b = j3;
        zq1Var.a = d2;
        zq1Var.g = 0;
        zq1Var.h = null;
        zq1Var.o();
        d = d.h(j3);
        return invoke;
    }

    public static final void w(ns4 ns4Var) {
        Long valueOf;
        if (d.e(ns4Var.g())) {
            return;
        }
        long g2 = ns4Var.g();
        boolean z = ns4Var.c;
        s43 s43Var = ns4Var instanceof s43 ? (s43) ns4Var : null;
        String valueOf2 = s43Var != null ? Boolean.valueOf(s43Var.m) : "read-only";
        synchronized (c) {
            rs4 rs4Var = f;
            valueOf = Long.valueOf(rs4Var.a > 0 ? rs4Var.b[0] : -1L);
        }
        throw new IllegalStateException(("Snapshot is not open: snapshotId=" + g2 + ", disposed=" + z + ", applied=" + valueOf2 + ", lowestPin=" + valueOf).toString());
    }

    public static final mw4 x(mw4 mw4Var, kw4 kw4Var, ns4 ns4Var) {
        mw4 s;
        mw4 s2;
        if (ns4Var.f()) {
            ns4Var.n(kw4Var);
        }
        long g2 = ns4Var.g();
        mw4 s3 = s(mw4Var, g2, ns4Var.d());
        if (s3 == null) {
            synchronized (c) {
                ns4 h2 = h();
                mw4 c2 = kw4Var.c();
                c2.getClass();
                s2 = s(c2, h2.g(), h2.d());
                if (s2 == null) {
                    r();
                    throw null;
                }
            }
            s3 = s2;
        }
        if (s3.a == ns4Var.g()) {
            return s3;
        }
        synchronized (c) {
            s = s(kw4Var.c(), g2, ns4Var.d());
            if (s == null) {
                r();
                throw null;
            }
            if (s.a != g2) {
                mw4 k2 = k(s, kw4Var);
                k2.a(s);
                k2.a = ns4Var.g();
                s = k2;
            }
        }
        ns4Var.n(kw4Var);
        return s;
    }
}
