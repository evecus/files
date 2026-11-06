package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class we0 implements oj0, y04, qe0 {
    public final re0 I;
    public final k1 J;
    public final AtomicReference K = new AtomicReference(null);
    public final Object L = new Object();
    public final q43 M;
    public final tr4 N;
    public final n43 O;
    public final o43 P;
    public final o43 Q;
    public final n43 R;
    public final h20 S;
    public final h20 T;
    public final n43 U;
    public n43 V;
    public boolean W;
    public wn4 X;
    public ml3 Y;
    public we0 Z;
    public int a0;
    public final jf0 b0;
    public final j34 c0;
    public final go1 d0;
    public byte e0;
    public hn1 f0;

    public we0(re0 re0Var, k1 k1Var) {
        this.I = re0Var;
        this.J = k1Var;
        q43 q43Var = new q43(new o43());
        this.M = q43Var;
        tr4 tr4Var = new tr4();
        if (re0Var.getCollectingCallByInformation$runtime()) {
            tr4Var.S = new q33();
        }
        if (re0Var.getCollectingSourceInformation$runtime()) {
            tr4Var.d();
        }
        this.N = tr4Var;
        this.O = ut0.y();
        this.P = new o43();
        this.Q = new o43();
        this.R = ut0.y();
        h20 h20Var = new h20();
        this.S = h20Var;
        h20 h20Var2 = new h20();
        this.T = h20Var2;
        this.U = ut0.y();
        this.V = ut0.y();
        jf0 jf0Var = new jf0(re0Var);
        this.b0 = jf0Var;
        this.c0 = new j34();
        go1 go1Var = new go1(k1Var, re0Var, vr4.a(tr4Var), q43Var, h20Var, h20Var2, jf0Var, this);
        re0Var.registerComposer$runtime(go1Var);
        this.d0 = go1Var;
        this.f0 = qb.b;
    }

    public final void A(Object obj) {
        synchronized (this.L) {
            try {
                w(obj);
                Object g = this.R.g(obj);
                if (g != null) {
                    if (g instanceof o43) {
                        o43 o43Var = (o43) g;
                        Object[] objArr = o43Var.b;
                        long[] jArr = o43Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            w((wu0) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        w((wu0) g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(hn1 hn1Var) {
        boolean l = l();
        s();
        re0 re0Var = this.I;
        if (!l) {
            this.f0 = hn1Var;
            re0Var.composeInitial$runtime(this, hn1Var);
            return;
        }
        go1 go1Var = this.d0;
        go1Var.z = 0;
        go1Var.y = true;
        this.f0 = hn1Var;
        re0Var.composeInitial$runtime(this, hn1Var);
        if (go1Var.F || go1Var.z != 0) {
            jr3.a("Cannot disable reuse from root if it was caused by other groups");
        }
        go1Var.z = -1;
        go1Var.y = false;
    }

    @Override // defpackage.y04
    public final void a() {
        this.W = true;
        this.b0.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.y04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.we0.b(java.lang.Object):void");
    }

    @Override // defpackage.y04
    public final c52 c(x04 x04Var, Object obj) {
        we0 we0Var;
        int i = x04Var.b;
        if ((i & 2) != 0) {
            x04Var.b = i | 4;
        }
        bo1 bo1Var = x04Var.c;
        if (bo1Var == null || !bo1Var.a()) {
            return c52.I;
        }
        tr4 tr4Var = this.N;
        tr4Var.getClass();
        bo1 bo1Var2 = x04Var.c;
        if (bo1Var2 != null && tr4Var.l(ut0.i(bo1Var2))) {
            if (x04Var.d == null) {
                return c52.I;
            }
            c52 v = v(x04Var, bo1Var, obj);
            if (v != c52.I) {
                this.b0.a();
            }
            return v;
        }
        synchronized (this.L) {
            we0Var = this.Z;
        }
        if (we0Var != null) {
            go1 go1Var = we0Var.d0;
            if (go1Var.F && go1Var.j0(x04Var, obj)) {
                return c52.L;
            }
        }
        return c52.I;
    }

    public final void d() {
        this.K.set(null);
        this.S.g.f0();
        this.T.g.f0();
        q43 q43Var = this.M;
        if (q43Var.I.b()) {
            return;
        }
        j34 j34Var = this.c0;
        try {
            j34Var.g(q43Var, this.d0.D());
            j34Var.b();
        } finally {
            j34Var.a();
        }
    }

    @Override // defpackage.qe0
    public final void dispose() {
        synchronized (this.L) {
            try {
                if (this.d0.F) {
                    jr3.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.e0 != 3) {
                    this.e0 = (byte) 3;
                    this.f0 = qb.c;
                    h20 h20Var = this.d0.L;
                    if (h20Var != null) {
                        h(h20Var);
                    }
                    boolean z = this.N.J == 0;
                    if (!z || !this.M.I.b()) {
                        j34 j34Var = this.c0;
                        try {
                            j34Var.g(this.M, this.d0.D());
                            if (!z) {
                                tr4 tr4Var = this.N;
                                j34 j34Var2 = this.c0;
                                wr4 j = tr4Var.j();
                                try {
                                    j.m(j.t, new y1(j34Var2, (byte) 5));
                                    j.I();
                                    j.e(true);
                                    this.J.j();
                                    this.J.i();
                                    j34Var.c();
                                } catch (Throwable th) {
                                    j.e(false);
                                    throw th;
                                }
                            }
                            j34Var.b();
                            j34Var.a();
                        } catch (Throwable th2) {
                            j34Var.a();
                            throw th2;
                        }
                    }
                    this.U.a();
                    go1 go1Var = this.d0;
                    go1Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        go1Var.b.unregisterComposer$runtime(go1Var);
                        go1Var.E.clear();
                        go1Var.s.clear();
                        go1Var.e.g.f0();
                        go1Var.v = null;
                        go1Var.a.j();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.I.unregisterComposition$runtime(this);
    }

    public final void e(Object obj, boolean z) {
        Object g = this.O.g(obj);
        if (g == null) {
            return;
        }
        boolean z2 = g instanceof o43;
        c52 c52Var = c52.I;
        o43 o43Var = this.P;
        o43 o43Var2 = this.Q;
        n43 n43Var = this.U;
        if (!z2) {
            x04 x04Var = (x04) g;
            if (ut0.Q(n43Var, obj, x04Var) || x04Var.b(obj) == c52Var) {
                return;
            }
            if (x04Var.g == null || z) {
                o43Var.d(x04Var);
                return;
            } else {
                o43Var2.d(x04Var);
                return;
            }
        }
        o43 o43Var3 = (o43) g;
        Object[] objArr = o43Var3.b;
        long[] jArr = o43Var3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        x04 x04Var2 = (x04) objArr[(i << 3) + i3];
                        if (!ut0.Q(n43Var, obj, x04Var2) && x04Var2.b(obj) != c52Var) {
                            if (x04Var2.g == null || z) {
                                o43Var.d(x04Var2);
                            } else {
                                o43Var2.d(x04Var2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void f(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        int i;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean a;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean z2;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i2;
        int i3;
        long[] jArr9;
        boolean z3 = set instanceof la4;
        n43 n43Var = this.R;
        Object obj = null;
        int i4 = 8;
        if (z3) {
            ja4 ja4Var = ((la4) set).I;
            Object[] objArr = ja4Var.b;
            long[] jArr10 = ja4Var.a;
            int length = jArr10.length - 2;
            if (length >= 0) {
                int i5 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr10[i5];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i5 << 3) + i7];
                                c2 = c3;
                                if (obj2 instanceof x04) {
                                    ((x04) obj2).b(obj);
                                } else {
                                    e(obj2, z);
                                    Object g = n43Var.g(obj2);
                                    if (g != null) {
                                        if (g instanceof o43) {
                                            o43 o43Var = (o43) g;
                                            Object[] objArr2 = o43Var.b;
                                            long[] jArr11 = o43Var.a;
                                            int length2 = jArr11.length - 2;
                                            if (length2 >= 0) {
                                                int i8 = i4;
                                                i2 = length;
                                                int i9 = 0;
                                                while (true) {
                                                    long j10 = jArr11[i9];
                                                    j8 = j9;
                                                    long[] jArr12 = jArr11;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                        int i11 = 0;
                                                        while (i11 < i10) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr9 = jArr10;
                                                                e((wu0) objArr2[(i9 << 3) + i11], z);
                                                            } else {
                                                                jArr9 = jArr10;
                                                            }
                                                            j10 >>= i8;
                                                            i11++;
                                                            jArr10 = jArr9;
                                                        }
                                                        jArr8 = jArr10;
                                                        if (i10 != i8) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr10;
                                                    }
                                                    if (i9 == length2) {
                                                        break;
                                                    }
                                                    i9++;
                                                    jArr11 = jArr12;
                                                    j9 = j8;
                                                    jArr10 = jArr8;
                                                    i8 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr10;
                                            j8 = j9;
                                            i2 = length;
                                            e((wu0) g, z);
                                        }
                                        i3 = 8;
                                    }
                                }
                                jArr8 = jArr10;
                                j8 = j9;
                                i2 = length;
                                i3 = 8;
                            } else {
                                jArr8 = jArr10;
                                c2 = c3;
                                j8 = j9;
                                i2 = length;
                                i3 = i4;
                            }
                            j9 = j8 >> i3;
                            i7++;
                            length = i2;
                            i4 = i3;
                            c3 = c2;
                            jArr10 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr10;
                        c = c3;
                        int i12 = length;
                        if (i6 != i4) {
                            break;
                        } else {
                            length = i12;
                        }
                    } else {
                        jArr7 = jArr10;
                        c = 7;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr10 = jArr7;
                    obj = null;
                    i4 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof x04) {
                    ((x04) obj3).b(null);
                } else {
                    e(obj3, z);
                    Object g2 = n43Var.g(obj3);
                    if (g2 != null) {
                        if (g2 instanceof o43) {
                            o43 o43Var2 = (o43) g2;
                            Object[] objArr3 = o43Var2.b;
                            long[] jArr13 = o43Var2.a;
                            int length3 = jArr13.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j11 = jArr13[i];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                e((wu0) objArr3[(i << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length3 ? i + 1 : 0;
                                }
                            }
                        } else {
                            e((wu0) g2, z);
                        }
                    }
                }
            }
        }
        n43 n43Var2 = this.O;
        o43 o43Var3 = this.P;
        if (z) {
            o43 o43Var4 = this.Q;
            if (o43Var4.c()) {
                long[] jArr14 = n43Var2.a;
                int length4 = jArr14.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr14[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = n43Var2.b[i18];
                                    Object obj5 = n43Var2.c[i18];
                                    if (obj5 instanceof o43) {
                                        o43 o43Var5 = (o43) obj5;
                                        Object[] objArr4 = o43Var5.b;
                                        long[] jArr15 = o43Var5.a;
                                        int length5 = jArr15.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr15[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr16 = jArr15;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr14;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            x04 x04Var = (x04) objArr5[i22];
                                                            if (o43Var4.a(x04Var) || o43Var3.a(x04Var)) {
                                                                o43Var5.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr14;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr14 = jArr6;
                                                    }
                                                    jArr5 = jArr14;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr14;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr15 = jArr16;
                                                jArr14 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr14;
                                            j6 = j12;
                                        }
                                        z2 = o43Var5.b();
                                    } else {
                                        jArr5 = jArr14;
                                        j6 = j12;
                                        obj5.getClass();
                                        x04 x04Var2 = (x04) obj5;
                                        z2 = o43Var4.a(x04Var2) || o43Var3.a(x04Var2);
                                    }
                                    if (z2) {
                                        n43Var2.l(i18);
                                    }
                                } else {
                                    jArr5 = jArr14;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr14 = jArr5;
                            }
                            jArr4 = jArr14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr14;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr14 = jArr4;
                    }
                }
                o43Var4.e();
                k();
                return;
            }
        }
        if (o43Var3.c()) {
            long[] jArr17 = n43Var2.a;
            int length6 = jArr17.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr17[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = n43Var2.b[i26];
                                Object obj7 = n43Var2.c[i26];
                                if (obj7 instanceof o43) {
                                    o43 o43Var6 = (o43) obj7;
                                    Object[] objArr6 = o43Var6.b;
                                    long[] jArr18 = o43Var6.a;
                                    int length7 = jArr18.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr18[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr19 = jArr18;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr17;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (o43Var3.a((x04) objArr7[i30])) {
                                                            o43Var6.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr17;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr17 = jArr3;
                                                }
                                                jArr2 = jArr17;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr17;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr18 = jArr19;
                                            jArr17 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr17;
                                        j4 = j14;
                                    }
                                    a = o43Var6.b();
                                } else {
                                    jArr2 = jArr17;
                                    j4 = j14;
                                    obj7.getClass();
                                    a = o43Var3.a((x04) obj7);
                                }
                                if (a) {
                                    n43Var2.l(i26);
                                }
                            } else {
                                jArr2 = jArr17;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr17 = jArr2;
                        }
                        jArr = jArr17;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr17;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr17 = jArr;
                }
            }
            k();
            o43Var3.e();
        }
    }

    public final void g() {
        synchronized (this.L) {
            try {
                h(this.S);
                q();
            } catch (Throwable th) {
                try {
                    if (!this.M.I.b()) {
                        j34 j34Var = this.c0;
                        try {
                            j34Var.g(this.M, this.d0.D());
                            j34Var.b();
                            j34Var.a();
                        } catch (Throwable th2) {
                            j34Var.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    d();
                    throw th3;
                }
            }
        }
    }

    public final void h(h20 h20Var) {
        j34 j34Var;
        long[] jArr;
        int i;
        long[] jArr2;
        j34 j34Var2;
        long j;
        char c;
        long j2;
        int i2;
        boolean z;
        long j3;
        h20 h20Var2 = this.T;
        go1 go1Var = this.d0;
        ue0 D = go1Var.D();
        j34 j34Var3 = this.c0;
        j34Var3.g(this.M, D);
        try {
            if (h20Var.g.h0()) {
                try {
                    if (h20Var2.g.h0() && this.Y == null) {
                        j34Var3.b();
                    }
                    return;
                } finally {
                }
            }
            ml3 ml3Var = this.Y;
            ap apVar = ml3Var != null ? ml3Var.l : this.J;
            try {
                Trace.beginSection(apVar.equals(ml3Var != null ? ml3Var.l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    ml3 ml3Var2 = this.Y;
                    j34 j34Var4 = ml3Var2 != null ? ml3Var2.k : j34Var3;
                    tr4 tr4Var = this.N;
                    ue0 D2 = go1Var.D();
                    wr4 j4 = vr4.a(tr4Var).j();
                    int i3 = 0;
                    try {
                        h20Var.s0(apVar, j4, j34Var4, D2);
                        j4.e(true);
                        apVar.i();
                        Trace.endSection();
                        j34Var3.c();
                        j34Var3.d();
                        if (this.W) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.W = false;
                                n43 n43Var = this.O;
                                long[] jArr3 = n43Var.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j5 = jArr3[i4];
                                        char c2 = 7;
                                        long j6 = -9187201950435737472L;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j5 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j6;
                                                    Object obj = n43Var.b[i8];
                                                    Object obj2 = n43Var.c[i8];
                                                    if (obj2 instanceof o43) {
                                                        o43 o43Var = (o43) obj2;
                                                        Object[] objArr = o43Var.b;
                                                        long[] jArr4 = o43Var.a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        j34Var2 = j34Var3;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j7 = jArr4[i10];
                                                                    j = j5;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j7 & 255) < 128) {
                                                                                j3 = j7;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((x04) objArr[i13]).a()) {
                                                                                    o43Var.m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j7;
                                                                            }
                                                                            j7 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i10 == length2) {
                                                                        break;
                                                                    }
                                                                    i10++;
                                                                    jArr4 = jArr5;
                                                                    j5 = j;
                                                                    i9 = 8;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j5;
                                                        }
                                                        z = o43Var.b();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        j34Var2 = j34Var3;
                                                        j = j5;
                                                        obj2.getClass();
                                                        z = !((x04) obj2).a();
                                                    }
                                                    if (z) {
                                                        n43Var.l(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    j34Var2 = j34Var3;
                                                    j = j5;
                                                    c = c2;
                                                    j2 = j6;
                                                    i2 = i5;
                                                }
                                                j5 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j6 = j2;
                                                j34Var3 = j34Var2;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            j34Var = j34Var3;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            j34Var = j34Var3;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        j34Var3 = j34Var;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    j34Var = j34Var3;
                                }
                                k();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            j34Var = j34Var3;
                        }
                        try {
                            if (h20Var2.g.h0() && this.Y == null) {
                                j34Var.b();
                            }
                        } finally {
                            j34Var.a();
                        }
                    } catch (Throwable th3) {
                        try {
                            j4.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                try {
                    if (h20Var2.g.h0() && this.Y == null) {
                        j34Var3.b();
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final void i() {
        synchronized (this.L) {
            try {
                h20 h20Var = this.T;
                h20Var.getClass();
                if (!h20Var.g.h0()) {
                    h(this.T);
                }
            } catch (Throwable th) {
                try {
                    if (!this.M.I.b()) {
                        j34 j34Var = this.c0;
                        try {
                            j34Var.g(this.M, this.d0.D());
                            j34Var.b();
                            j34Var.a();
                        } catch (Throwable th2) {
                            j34Var.a();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void j() {
        j34 j34Var;
        synchronized (this.L) {
            try {
                this.d0.v = null;
                if (!this.M.I.b()) {
                    j34Var = this.c0;
                    try {
                        j34Var.g(this.M, this.d0.D());
                        j34Var.b();
                        j34Var.a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.M.I.b()) {
                        j34Var = this.c0;
                        try {
                            j34Var.g(this.M, this.d0.D());
                            j34Var.b();
                            j34Var.a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    d();
                    throw th2;
                }
            }
        }
    }

    public final void k() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean z;
        int i4;
        int i5;
        n43 n43Var = this.R;
        long[] jArr3 = n43Var.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = n43Var.b[i10];
                            Object obj2 = n43Var.c[i10];
                            c2 = c3;
                            boolean z2 = obj2 instanceof o43;
                            j5 = j8;
                            n43 n43Var2 = this.O;
                            if (z2) {
                                o43 o43Var = (o43) obj2;
                                Object[] objArr = o43Var.b;
                                long[] jArr4 = o43Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!n43Var2.c((wu0) objArr[i15])) {
                                                        o43Var.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                z = o43Var.b();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                z = !n43Var2.c((wu0) obj2);
                            }
                            if (z) {
                                n43Var.l(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        o43 o43Var2 = this.Q;
        if (!o43Var2.c()) {
            return;
        }
        Object[] objArr2 = o43Var2.b;
        long[] jArr5 = o43Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((x04) objArr2[i20]).g == null) {
                            o43Var2.m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final boolean l() {
        boolean z;
        synchronized (this.L) {
            z = true;
            if (this.e0 != 1) {
                z = false;
            }
            if (z) {
                this.e0 = (byte) 0;
            }
        }
        return z;
    }

    public final void m(hn1 hn1Var) {
        try {
            synchronized (this.L) {
                p();
                n43 n43Var = this.V;
                this.V = ut0.y();
                try {
                    go1 go1Var = this.d0;
                    wn4 wn4Var = this.X;
                    if (!go1Var.e.g.h0()) {
                        ke0.a("Expected applyChanges() to have been called");
                    }
                    go1Var.P = wn4Var;
                    try {
                        go1Var.o(n43Var, hn1Var);
                    } finally {
                        go1Var.P = null;
                    }
                } catch (Throwable th) {
                    this.V = n43Var;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.M.I.b()) {
                    j34 j34Var = this.c0;
                    try {
                        j34Var.g(this.M, this.d0.D());
                        j34Var.b();
                        j34Var.a();
                    } catch (Throwable th3) {
                        j34Var.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                d();
                throw th4;
            }
        }
    }

    public final ml3 n(boolean z, hn1 hn1Var) {
        if (this.Y != null) {
            jr3.b("A pausable composition is in progress");
        }
        ml3 ml3Var = new ml3(this, this.I, this.d0, this.M, hn1Var, z, this.J, this.L);
        this.Y = ml3Var;
        return ml3Var;
    }

    public final void o() {
        j34 j34Var;
        synchronized (this.L) {
            try {
                if (this.Y != null) {
                    jr3.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.N.J == 0;
                try {
                    try {
                        if (z) {
                            if (!this.M.I.b()) {
                            }
                            this.O.a();
                            this.R.a();
                            this.V.a();
                            this.S.g.f0();
                            this.T.g.f0();
                            go1 go1Var = this.d0;
                            go1Var.E.clear();
                            go1Var.s.clear();
                            go1Var.e.g.f0();
                            go1Var.v = null;
                            this.e0 = (byte) 1;
                        }
                        j34Var.g(this.M, this.d0.D());
                        if (!z) {
                            tr4 tr4Var = this.N;
                            j34 j34Var2 = this.c0;
                            wr4 j = tr4Var.j();
                            try {
                                j.m(j.t, new uh0(j34Var2, j, (byte) 2));
                                j.e(true);
                                this.J.i();
                                j34Var.c();
                            } catch (Throwable th) {
                                j.e(false);
                                throw th;
                            }
                        }
                        j34Var.b();
                        j34Var.a();
                        this.O.a();
                        this.R.a();
                        this.V.a();
                        this.S.g.f0();
                        this.T.g.f0();
                        go1 go1Var2 = this.d0;
                        go1Var2.E.clear();
                        go1Var2.s.clear();
                        go1Var2.e.g.f0();
                        go1Var2.v = null;
                        this.e0 = (byte) 1;
                    } catch (Throwable th2) {
                        j34Var.a();
                        throw th2;
                    }
                    j34Var = this.c0;
                } finally {
                    Trace.endSection();
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void p() {
        Object obj = p70.m;
        AtomicReference atomicReference = this.K;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                ke0.b("pending composition has not been applied");
                zy.n();
                return;
            }
            if (andSet instanceof Set) {
                f((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ke0.b("corrupt pendingModifications drain: " + atomicReference);
                zy.n();
                return;
            }
            for (Set set : (Set[]) andSet) {
                f(set, true);
            }
        }
    }

    public final void q() {
        AtomicReference atomicReference = this.K;
        Object andSet = atomicReference.getAndSet(null);
        if (j42.c(andSet, p70.m)) {
            return;
        }
        if (andSet instanceof Set) {
            f((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                f(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.Y == null) {
                ke0.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            ke0.b("corrupt pendingModifications drain: " + atomicReference);
            zy.n();
        }
    }

    public final void r() {
        t91 t91Var = t91.I;
        AtomicReference atomicReference = this.K;
        Object andSet = atomicReference.getAndSet(t91Var);
        if (j42.c(andSet, p70.m) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            f((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            ke0.b("corrupt pendingModifications drain: " + atomicReference);
            zy.n();
            return;
        }
        for (Set set : (Set[]) andSet) {
            f(set, false);
        }
    }

    public final void s() {
        byte b = this.e0;
        if (b != 0) {
            jr3.b(b != 1 ? b != 2 ? b != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.Y == null) {
            return;
        }
        jr3.b("A pausable composition is in progress");
    }

    public final void t(ArrayList arrayList) {
        q43 q43Var = this.M;
        go1 go1Var = this.d0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((r23) ((uj3) arrayList.get(i)).I).b().equals(this)) {
                ke0.a("Check failed");
                break;
            }
        }
        try {
            go1Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    go1Var.G(arrayList);
                    go1Var.j();
                } catch (Throwable th) {
                    go1Var.a();
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            try {
                if (!q43Var.I.b()) {
                    j34 j34Var = this.c0;
                    try {
                        j34Var.g(q43Var, go1Var.D());
                        j34Var.b();
                        j34Var.a();
                    } catch (Throwable th3) {
                        j34Var.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                d();
                throw th4;
            }
        }
    }

    public final void u() {
        y04 y04Var;
        for (Object obj : this.N.K) {
            x04 x04Var = obj instanceof x04 ? (x04) obj : null;
            if (x04Var != null && (y04Var = x04Var.a) != null) {
                y04Var.c(x04Var, null);
            }
        }
    }

    public final c52 v(x04 x04Var, bo1 bo1Var, Object obj) {
        we0 we0Var;
        synchronized (this.L) {
            try {
                we0 we0Var2 = this.Z;
                if (we0Var2 != null) {
                    tr4 tr4Var = this.N;
                    int i = this.a0;
                    if (tr4Var.O) {
                        ke0.a("Writer is active");
                    }
                    if (i < 0 || i >= tr4Var.J) {
                        ke0.a("Invalid group index");
                    }
                    bo1 i2 = ut0.i(bo1Var);
                    if (tr4Var.l(i2)) {
                        int i3 = tr4Var.I[(i * 5) + 3] + i;
                        int i4 = i2.a;
                        we0Var = (i <= i4 && i4 < i3) ? we0Var2 : null;
                    }
                    we0Var2 = null;
                }
                if (we0Var == null) {
                    go1 go1Var = this.d0;
                    if (go1Var.F && go1Var.j0(x04Var, obj)) {
                        return c52.L;
                    }
                    if (obj == null) {
                        this.V.m(x04Var, q8.z0);
                    } else {
                        boolean z = obj instanceof wu0;
                        n43 n43Var = this.V;
                        if (z) {
                            Object g = n43Var.g(x04Var);
                            if (g != null) {
                                if (g instanceof o43) {
                                    o43 o43Var = (o43) g;
                                    Object[] objArr = o43Var.b;
                                    long[] jArr = o43Var.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i5 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i5];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i6 = 8 - ((~(i5 - length)) >>> 31);
                                                for (int i7 = 0; i7 < i6; i7++) {
                                                    if ((255 & j) < 128 && objArr[(i5 << 3) + i7] == q8.z0) {
                                                        break loop0;
                                                    }
                                                    j >>= 8;
                                                }
                                                if (i6 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i5 == length) {
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                } else if (g == q8.z0) {
                                }
                            }
                            ut0.g(this.V, x04Var, obj);
                        } else {
                            n43Var.m(x04Var, q8.z0);
                        }
                    }
                }
                if (we0Var != null) {
                    return we0Var.v(x04Var, bo1Var, obj);
                }
                this.I.invalidate$runtime(this);
                return this.d0.F ? c52.K : c52.J;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(Object obj) {
        Object g = this.O.g(obj);
        if (g == null) {
            return;
        }
        boolean z = g instanceof o43;
        c52 c52Var = c52.L;
        n43 n43Var = this.U;
        if (!z) {
            x04 x04Var = (x04) g;
            if (x04Var.b(obj) != c52Var || (obj instanceof wu0)) {
                return;
            }
            ut0.g(n43Var, obj, x04Var);
            return;
        }
        o43 o43Var = (o43) g;
        Object[] objArr = o43Var.b;
        long[] jArr = o43Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        x04 x04Var2 = (x04) objArr[(i << 3) + i3];
                        if (x04Var2.b(obj) == c52Var && !(obj instanceof wu0)) {
                            ut0.g(n43Var, obj, x04Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x(java.util.Set r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.la4
            n43 r3 = r0.R
            n43 r0 = r0.O
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L5e
            la4 r1 = (defpackage.la4) r1
            ja4 r1 = r1.I
            java.lang.Object[] r2 = r1.b
            long[] r1 = r1.a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L7b
            r7 = r4
        L1c:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L36:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            boolean r14 = r0.c(r13)
            if (r14 != 0) goto L52
            boolean r13 = r3.c(r13)
            if (r13 == 0) goto L53
        L52:
            return r5
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L36
        L57:
            if (r10 != r11) goto L7b
        L59:
            if (r7 == r6) goto L7b
            int r7 = r7 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r6 = r0.c(r2)
            if (r6 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r5
        L7b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.we0.x(java.util.Set):boolean");
    }

    public final boolean y() {
        synchronized (this.L) {
            ml3 ml3Var = this.Y;
            boolean z = false;
            if (ml3Var != null && (ml3Var.h.get() != ol3.M || ml3Var.i != li4.e())) {
                i82.X(ml3Var.h);
                ((p33) ml3Var.l.b).c(9);
                return false;
            }
            p();
            try {
                n43 n43Var = this.V;
                this.V = ut0.y();
                try {
                    go1 go1Var = this.d0;
                    wn4 wn4Var = this.X;
                    lg3 lg3Var = go1Var.e.g;
                    if (!lg3Var.h0()) {
                        ke0.a("Expected applyChanges() to have been called");
                    }
                    if (n43Var.e > 0 || !go1Var.s.isEmpty()) {
                        go1Var.P = wn4Var;
                        try {
                            go1Var.o(n43Var, null);
                            go1Var.P = null;
                            z = !lg3Var.h0();
                        } catch (Throwable th) {
                            go1Var.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        q();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.V = n43Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.M.I.b()) {
                        j34 j34Var = this.c0;
                        try {
                            j34Var.g(this.M, this.d0.D());
                            j34Var.b();
                            j34Var.a();
                        } catch (Throwable th4) {
                            j34Var.a();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    d();
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object[]] */
    public final void z(la4 la4Var) {
        la4 la4Var2;
        while (true) {
            Object obj = this.K.get();
            if (obj == null || obj.equals(p70.m)) {
                la4Var2 = la4Var;
            } else if (obj instanceof Set) {
                la4Var2 = new Set[]{obj, la4Var};
            } else {
                if (!(obj instanceof Object[])) {
                    s83.x(this.K, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = la4Var;
                la4Var2 = copyOf;
            }
            AtomicReference atomicReference = this.K;
            while (!atomicReference.compareAndSet(obj, la4Var2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.L) {
                    q();
                }
                return;
            }
            return;
        }
    }
}
