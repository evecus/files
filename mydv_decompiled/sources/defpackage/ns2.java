package defpackage;

import androidx.media3.common.util.Log;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ns2 extends bn3 implements pw2, d9, e23 {
    public final ab2 N;
    public boolean O;
    public boolean S;
    public boolean T;
    public boolean U;
    public dh0 V;
    public tm1 X;
    public boolean c0;
    public final ls2 d0;
    public Object f0;
    public final ls2 h0;
    public final ls2 i0;
    public boolean j0;
    public int P = Log.LOG_LEVEL_OFF;
    public int Q = Log.LOG_LEVEL_OFF;
    public ua2 R = ua2.K;
    public long W = 0;
    public ms2 Y = ms2.K;
    public final ds2 Z = new ds2(this);
    public final b53 a0 = new b53(new ns2[16]);
    public boolean b0 = true;
    public boolean e0 = true;
    public long g0 = eh0.b(0, 0, 0, 0, 15);

    /* JADX WARN: Type inference failed for: r1v2, types: [ls2] */
    /* JADX WARN: Type inference failed for: r4v4, types: [ls2] */
    /* JADX WARN: Type inference failed for: r4v5, types: [ls2] */
    public ns2(ab2 ab2Var) {
        this.N = ab2Var;
        final byte b = 1;
        final byte b2 = 0;
        this.d0 = new rm1(this) { // from class: ls2
            public final /* synthetic */ ns2 J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                js2 I0;
                byte b3 = b2;
                wd5 wd5Var = wd5.a;
                e43 e43Var = null;
                r2 = null;
                r2 = null;
                an3 an3Var = null;
                ns2 ns2Var = this.J;
                switch (b3) {
                    case 0:
                        ab2 ab2Var2 = ns2Var.N;
                        ab2Var2.h = 0;
                        wa2 wa2Var = ab2Var2.a;
                        b53 A = wa2Var.A();
                        Object[] objArr = A.I;
                        int i = A.K;
                        for (int i2 = 0; i2 < i; i2++) {
                            ns2 ns2Var2 = ((wa2) objArr[i2]).o0.q;
                            ns2Var2.getClass();
                            ns2Var2.P = ns2Var2.Q;
                            ns2Var2.Q = Log.LOG_LEVEL_OFF;
                            if (ns2Var2.R == ua2.J) {
                                ns2Var2.R = ua2.K;
                            }
                        }
                        b53 A2 = wa2Var.A();
                        Object[] objArr2 = A2.I;
                        int i3 = A2.K;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ns2 ns2Var3 = ((wa2) objArr2[i4]).o0.q;
                            ns2Var3.getClass();
                            ns2Var3.Z.d = false;
                        }
                        w02 w02Var = ns2Var.f().K0;
                        if (w02Var == null) {
                            zy.i("Expected lookahead delegate");
                            break;
                        } else {
                            a53 a53Var = (a53) wa2Var.o();
                            int i5 = a53Var.I.K;
                            for (int i6 = 0; i6 < i5; i6++) {
                                wa2 wa2Var2 = (wa2) a53Var.get(i6);
                                js2 I02 = wa2Var2.n0.d.I0();
                                if (I02 != null) {
                                    if (I02.W) {
                                        if (e43Var == null) {
                                            e43Var = new e43();
                                        }
                                        e43Var.a(wa2Var2);
                                    }
                                    I02.W = w02Var.W;
                                }
                            }
                            w02Var.r0().b();
                            a53 a53Var2 = (a53) wa2Var.o();
                            int i7 = a53Var2.I.K;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= i7) {
                                    b53 A3 = wa2Var.A();
                                    Object[] objArr3 = A3.I;
                                    int i9 = A3.K;
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        ns2 ns2Var4 = ((wa2) objArr3[i10]).o0.q;
                                        ns2Var4.getClass();
                                        int i11 = ns2Var4.P;
                                        int i12 = ns2Var4.Q;
                                        if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                                            ns2Var4.s0(true);
                                        }
                                    }
                                    b53 A4 = wa2Var.A();
                                    Object[] objArr4 = A4.I;
                                    int i13 = A4.K;
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        ns2 ns2Var5 = ((wa2) objArr4[i14]).o0.q;
                                        ns2Var5.getClass();
                                        ds2 ds2Var = ns2Var5.Z;
                                        ds2Var.e = ds2Var.d;
                                    }
                                    break;
                                } else {
                                    wa2 wa2Var3 = (wa2) a53Var2.get(i8);
                                    boolean z = e43Var != null && e43Var.e(wa2Var3);
                                    js2 I03 = wa2Var3.n0.d.I0();
                                    if (I03 != null) {
                                        I03.W = z;
                                    }
                                    i8++;
                                }
                            }
                        }
                        break;
                    case 1:
                        js2 I04 = ns2Var.N.a().I0();
                        I04.getClass();
                        I04.u(ns2Var.g0);
                        break;
                    default:
                        ab2 ab2Var3 = ns2Var.N;
                        if (sv2.G(ab2Var3.a) || ab2Var3.c) {
                            na3 na3Var = ab2Var3.a().e0;
                            if (na3Var != null) {
                                an3Var = na3Var.X;
                            }
                        } else {
                            na3 na3Var2 = ab2Var3.a().e0;
                            if (na3Var2 != null && (I0 = na3Var2.I0()) != null) {
                                an3Var = I0.X;
                            }
                        }
                        if (an3Var == null) {
                            an3Var = za2.a(ab2Var3.a).getPlacementScope();
                        }
                        js2 I05 = ab2Var3.a().I0();
                        I05.getClass();
                        an3.h(an3Var, I05, ns2Var.W);
                        break;
                }
                return wd5Var;
            }
        };
        this.f0 = ab2Var.p.Z;
        this.h0 = new rm1(this) { // from class: ls2
            public final /* synthetic */ ns2 J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                js2 I0;
                byte b3 = b;
                wd5 wd5Var = wd5.a;
                e43 e43Var = null;
                an3Var = null;
                an3Var = null;
                an3 an3Var = null;
                ns2 ns2Var = this.J;
                switch (b3) {
                    case 0:
                        ab2 ab2Var2 = ns2Var.N;
                        ab2Var2.h = 0;
                        wa2 wa2Var = ab2Var2.a;
                        b53 A = wa2Var.A();
                        Object[] objArr = A.I;
                        int i = A.K;
                        for (int i2 = 0; i2 < i; i2++) {
                            ns2 ns2Var2 = ((wa2) objArr[i2]).o0.q;
                            ns2Var2.getClass();
                            ns2Var2.P = ns2Var2.Q;
                            ns2Var2.Q = Log.LOG_LEVEL_OFF;
                            if (ns2Var2.R == ua2.J) {
                                ns2Var2.R = ua2.K;
                            }
                        }
                        b53 A2 = wa2Var.A();
                        Object[] objArr2 = A2.I;
                        int i3 = A2.K;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ns2 ns2Var3 = ((wa2) objArr2[i4]).o0.q;
                            ns2Var3.getClass();
                            ns2Var3.Z.d = false;
                        }
                        w02 w02Var = ns2Var.f().K0;
                        if (w02Var == null) {
                            zy.i("Expected lookahead delegate");
                            break;
                        } else {
                            a53 a53Var = (a53) wa2Var.o();
                            int i5 = a53Var.I.K;
                            for (int i6 = 0; i6 < i5; i6++) {
                                wa2 wa2Var2 = (wa2) a53Var.get(i6);
                                js2 I02 = wa2Var2.n0.d.I0();
                                if (I02 != null) {
                                    if (I02.W) {
                                        if (e43Var == null) {
                                            e43Var = new e43();
                                        }
                                        e43Var.a(wa2Var2);
                                    }
                                    I02.W = w02Var.W;
                                }
                            }
                            w02Var.r0().b();
                            a53 a53Var2 = (a53) wa2Var.o();
                            int i7 = a53Var2.I.K;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= i7) {
                                    b53 A3 = wa2Var.A();
                                    Object[] objArr3 = A3.I;
                                    int i9 = A3.K;
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        ns2 ns2Var4 = ((wa2) objArr3[i10]).o0.q;
                                        ns2Var4.getClass();
                                        int i11 = ns2Var4.P;
                                        int i12 = ns2Var4.Q;
                                        if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                                            ns2Var4.s0(true);
                                        }
                                    }
                                    b53 A4 = wa2Var.A();
                                    Object[] objArr4 = A4.I;
                                    int i13 = A4.K;
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        ns2 ns2Var5 = ((wa2) objArr4[i14]).o0.q;
                                        ns2Var5.getClass();
                                        ds2 ds2Var = ns2Var5.Z;
                                        ds2Var.e = ds2Var.d;
                                    }
                                    break;
                                } else {
                                    wa2 wa2Var3 = (wa2) a53Var2.get(i8);
                                    boolean z = e43Var != null && e43Var.e(wa2Var3);
                                    js2 I03 = wa2Var3.n0.d.I0();
                                    if (I03 != null) {
                                        I03.W = z;
                                    }
                                    i8++;
                                }
                            }
                        }
                        break;
                    case 1:
                        js2 I04 = ns2Var.N.a().I0();
                        I04.getClass();
                        I04.u(ns2Var.g0);
                        break;
                    default:
                        ab2 ab2Var3 = ns2Var.N;
                        if (sv2.G(ab2Var3.a) || ab2Var3.c) {
                            na3 na3Var = ab2Var3.a().e0;
                            if (na3Var != null) {
                                an3Var = na3Var.X;
                            }
                        } else {
                            na3 na3Var2 = ab2Var3.a().e0;
                            if (na3Var2 != null && (I0 = na3Var2.I0()) != null) {
                                an3Var = I0.X;
                            }
                        }
                        if (an3Var == null) {
                            an3Var = za2.a(ab2Var3.a).getPlacementScope();
                        }
                        js2 I05 = ab2Var3.a().I0();
                        I05.getClass();
                        an3.h(an3Var, I05, ns2Var.W);
                        break;
                }
                return wd5Var;
            }
        };
        final byte b3 = 2;
        this.i0 = new rm1(this) { // from class: ls2
            public final /* synthetic */ ns2 J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                js2 I0;
                byte b32 = b3;
                wd5 wd5Var = wd5.a;
                e43 e43Var = null;
                an3Var = null;
                an3Var = null;
                an3 an3Var = null;
                ns2 ns2Var = this.J;
                switch (b32) {
                    case 0:
                        ab2 ab2Var2 = ns2Var.N;
                        ab2Var2.h = 0;
                        wa2 wa2Var = ab2Var2.a;
                        b53 A = wa2Var.A();
                        Object[] objArr = A.I;
                        int i = A.K;
                        for (int i2 = 0; i2 < i; i2++) {
                            ns2 ns2Var2 = ((wa2) objArr[i2]).o0.q;
                            ns2Var2.getClass();
                            ns2Var2.P = ns2Var2.Q;
                            ns2Var2.Q = Log.LOG_LEVEL_OFF;
                            if (ns2Var2.R == ua2.J) {
                                ns2Var2.R = ua2.K;
                            }
                        }
                        b53 A2 = wa2Var.A();
                        Object[] objArr2 = A2.I;
                        int i3 = A2.K;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ns2 ns2Var3 = ((wa2) objArr2[i4]).o0.q;
                            ns2Var3.getClass();
                            ns2Var3.Z.d = false;
                        }
                        w02 w02Var = ns2Var.f().K0;
                        if (w02Var == null) {
                            zy.i("Expected lookahead delegate");
                            break;
                        } else {
                            a53 a53Var = (a53) wa2Var.o();
                            int i5 = a53Var.I.K;
                            for (int i6 = 0; i6 < i5; i6++) {
                                wa2 wa2Var2 = (wa2) a53Var.get(i6);
                                js2 I02 = wa2Var2.n0.d.I0();
                                if (I02 != null) {
                                    if (I02.W) {
                                        if (e43Var == null) {
                                            e43Var = new e43();
                                        }
                                        e43Var.a(wa2Var2);
                                    }
                                    I02.W = w02Var.W;
                                }
                            }
                            w02Var.r0().b();
                            a53 a53Var2 = (a53) wa2Var.o();
                            int i7 = a53Var2.I.K;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= i7) {
                                    b53 A3 = wa2Var.A();
                                    Object[] objArr3 = A3.I;
                                    int i9 = A3.K;
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        ns2 ns2Var4 = ((wa2) objArr3[i10]).o0.q;
                                        ns2Var4.getClass();
                                        int i11 = ns2Var4.P;
                                        int i12 = ns2Var4.Q;
                                        if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                                            ns2Var4.s0(true);
                                        }
                                    }
                                    b53 A4 = wa2Var.A();
                                    Object[] objArr4 = A4.I;
                                    int i13 = A4.K;
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        ns2 ns2Var5 = ((wa2) objArr4[i14]).o0.q;
                                        ns2Var5.getClass();
                                        ds2 ds2Var = ns2Var5.Z;
                                        ds2Var.e = ds2Var.d;
                                    }
                                    break;
                                } else {
                                    wa2 wa2Var3 = (wa2) a53Var2.get(i8);
                                    boolean z = e43Var != null && e43Var.e(wa2Var3);
                                    js2 I03 = wa2Var3.n0.d.I0();
                                    if (I03 != null) {
                                        I03.W = z;
                                    }
                                    i8++;
                                }
                            }
                        }
                        break;
                    case 1:
                        js2 I04 = ns2Var.N.a().I0();
                        I04.getClass();
                        I04.u(ns2Var.g0);
                        break;
                    default:
                        ab2 ab2Var3 = ns2Var.N;
                        if (sv2.G(ab2Var3.a) || ab2Var3.c) {
                            na3 na3Var = ab2Var3.a().e0;
                            if (na3Var != null) {
                                an3Var = na3Var.X;
                            }
                        } else {
                            na3 na3Var2 = ab2Var3.a().e0;
                            if (na3Var2 != null && (I0 = na3Var2.I0()) != null) {
                                an3Var = I0.X;
                            }
                        }
                        if (an3Var == null) {
                            an3Var = za2.a(ab2Var3.a).getPlacementScope();
                        }
                        js2 I05 = ab2Var3.a().I0();
                        I05.getClass();
                        an3.h(an3Var, I05, ns2Var.W);
                        break;
                }
                return wd5Var;
            }
        };
    }

    public final void A0(long j) {
        ab2 ab2Var = this.N;
        ab2Var.d = sa2.J;
        ab2Var.e = false;
        this.g0 = j;
        wa2 wa2Var = ab2Var.a;
        sh3 snapshotObserver = za2.a(wa2Var).getSnapshotObserver();
        snapshotObserver.a.d(wa2Var, snapshotObserver.b, this.h0);
        ab2Var.f = true;
        ab2Var.g = true;
        boolean G = sv2.G(wa2Var);
        tw2 tw2Var = ab2Var.p;
        if (G) {
            tw2Var.d0 = true;
            tw2Var.e0 = true;
        } else {
            tw2Var.c0 = true;
        }
        ab2Var.d = sa2.M;
    }

    public final void B0(long j, tm1 tm1Var) {
        ab2 ab2Var = this.N;
        wa2 wa2Var = ab2Var.a;
        wa2 wa2Var2 = ab2Var.a;
        try {
            wa2 v = wa2Var.v();
            sa2 sa2Var = v != null ? v.o0.d : null;
            sa2 sa2Var2 = sa2.L;
            if (sa2Var == sa2Var2) {
                ab2Var.c = false;
            }
            if (wa2Var2.y0) {
                q02.a("place is called on a deactivated node");
            }
            ab2Var.d = sa2Var2;
            this.T = true;
            this.j0 = false;
            if (!r22.a(j, this.W)) {
                if (ab2Var.n || ab2Var.m) {
                    ab2Var.f = true;
                }
                u0();
            }
            qh3 a = za2.a(wa2Var2);
            this.W = j;
            if (ab2Var.f || !r0()) {
                ab2Var.g(false);
                this.Z.g = false;
                sh3 snapshotObserver = a.getSnapshotObserver();
                snapshotObserver.a.d(wa2Var2, snapshotObserver.g, this.i0);
            } else {
                js2 I0 = ab2Var.a().I0();
                I0.getClass();
                I0.A0(r22.c(j, I0.M));
                z0();
            }
            this.X = tm1Var;
            ab2Var.d = sa2.M;
        } catch (Throwable th) {
            wa2Var.b0(th);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0062, B:31:0x0074, B:33:0x0078, B:34:0x0080, B:37:0x0092, B:39:0x0096, B:40:0x0099, B:42:0x00b3, B:46:0x008d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[Catch: all -> 0x0010, LOOP:0: B:28:0x0060->B:29:0x0062, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0062, B:31:0x0074, B:33:0x0078, B:34:0x0080, B:37:0x0092, B:39:0x0096, B:40:0x0099, B:42:0x00b3, B:46:0x008d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0062, B:31:0x0074, B:33:0x0078, B:34:0x0080, B:37:0x0092, B:39:0x0096, B:40:0x0099, B:42:0x00b3, B:46:0x008d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0062, B:31:0x0074, B:33:0x0078, B:34:0x0080, B:37:0x0092, B:39:0x0096, B:40:0x0099, B:42:0x00b3, B:46:0x008d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0062, B:31:0x0074, B:33:0x0078, B:34:0x0080, B:37:0x0092, B:39:0x0096, B:40:0x0099, B:42:0x00b3, B:46:0x008d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C0(long r14) {
        /*
            r13 = this;
            ab2 r0 = r13.N
            wa2 r1 = r0.a
            wa2 r2 = r0.a
            boolean r3 = r1.y0     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L13
            java.lang.String r3 = "measure is called on a deactivated node"
            defpackage.q02.a(r3)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r13 = move-exception
            goto Lbd
        L13:
            wa2 r3 = r2.v()     // Catch: java.lang.Throwable -> L10
            boolean r4 = r2.m0     // Catch: java.lang.Throwable -> L10
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L26
            if (r3 == 0) goto L24
            boolean r3 = r3.m0     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L24
            goto L26
        L24:
            r3 = r6
            goto L27
        L26:
            r3 = r5
        L27:
            r2.m0 = r3     // Catch: java.lang.Throwable -> L10
            ab2 r3 = r2.o0     // Catch: java.lang.Throwable -> L10
            boolean r3 = r3.e     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L49
            dh0 r3 = r13.V     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L35
            r3 = r6
            goto L3b
        L35:
            long r3 = r3.a     // Catch: java.lang.Throwable -> L10
            boolean r3 = defpackage.dh0.b(r3, r14)     // Catch: java.lang.Throwable -> L10
        L3b:
            if (r3 != 0) goto L3e
            goto L49
        L3e:
            qh3 r13 = r2.V     // Catch: java.lang.Throwable -> L10
            if (r13 == 0) goto L45
            r13.forceMeasureTheSubtree(r2, r5)     // Catch: java.lang.Throwable -> L10
        L45:
            r2.a0()     // Catch: java.lang.Throwable -> L10
            return r6
        L49:
            dh0 r3 = new dh0     // Catch: java.lang.Throwable -> L10
            r3.<init>(r14)     // Catch: java.lang.Throwable -> L10
            r13.V = r3     // Catch: java.lang.Throwable -> L10
            r13.g0(r14)     // Catch: java.lang.Throwable -> L10
            ds2 r3 = r13.Z     // Catch: java.lang.Throwable -> L10
            r3.f = r6     // Catch: java.lang.Throwable -> L10
            b53 r2 = r2.A()     // Catch: java.lang.Throwable -> L10
            java.lang.Object[] r3 = r2.I     // Catch: java.lang.Throwable -> L10
            int r2 = r2.K     // Catch: java.lang.Throwable -> L10
            r4 = r6
        L60:
            if (r4 >= r2) goto L74
            r7 = r3[r4]     // Catch: java.lang.Throwable -> L10
            wa2 r7 = (defpackage.wa2) r7     // Catch: java.lang.Throwable -> L10
            ab2 r7 = r7.o0     // Catch: java.lang.Throwable -> L10
            ns2 r7 = r7.q     // Catch: java.lang.Throwable -> L10
            r7.getClass()     // Catch: java.lang.Throwable -> L10
            ds2 r7 = r7.Z     // Catch: java.lang.Throwable -> L10
            r7.c = r6     // Catch: java.lang.Throwable -> L10
            int r4 = r4 + 1
            goto L60
        L74:
            boolean r2 = r13.U     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L7b
            long r2 = r13.K     // Catch: java.lang.Throwable -> L10
            goto L80
        L7b:
            r2 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
        L80:
            r13.U = r5     // Catch: java.lang.Throwable -> L10
            na3 r4 = r0.a()     // Catch: java.lang.Throwable -> L10
            js2 r4 = r4.I0()     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto L8d
            goto L92
        L8d:
            java.lang.String r7 = "Lookahead result from lookaheadRemeasure cannot be null"
            defpackage.q02.b(r7)     // Catch: java.lang.Throwable -> L10
        L92:
            ns2 r0 = r0.q     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L99
            r0.A0(r14)     // Catch: java.lang.Throwable -> L10
        L99:
            int r14 = r4.I     // Catch: java.lang.Throwable -> L10
            int r15 = r4.J     // Catch: java.lang.Throwable -> L10
            long r7 = (long) r14     // Catch: java.lang.Throwable -> L10
            r14 = 32
            long r7 = r7 << r14
            long r9 = (long) r15     // Catch: java.lang.Throwable -> L10
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r11
            long r7 = r7 | r9
            r13.e0(r7)     // Catch: java.lang.Throwable -> L10
            long r13 = r2 >> r14
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L10
            int r14 = r4.I     // Catch: java.lang.Throwable -> L10
            if (r13 != r14) goto Lbc
            long r13 = r2 & r11
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L10
            int r14 = r4.J     // Catch: java.lang.Throwable -> L10
            if (r13 == r14) goto Lbb
            goto Lbc
        Lbb:
            return r6
        Lbc:
            return r5
        Lbd:
            r1.b0(r13)
            r13 = 0
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns2.C0(long):boolean");
    }

    @Override // defpackage.e23
    public final void D(boolean z) {
        js2 I0;
        ab2 ab2Var = this.N;
        js2 I02 = ab2Var.a().I0();
        if (Boolean.valueOf(z).equals(I02 != null ? Boolean.valueOf(I02.T) : null) || (I0 = ab2Var.a().I0()) == null) {
            return;
        }
        I0.T = z;
    }

    public final void D0() {
        wa2 v;
        try {
            this.O = true;
            if (!this.T) {
                q02.b("replace() called on item that was not placed");
            }
            this.j0 = false;
            boolean r0 = r0();
            B0(this.W, this.X);
            if (r0 && !this.j0 && (v = this.N.a.v()) != null) {
                v.V(false);
            }
            this.O = false;
        } catch (Throwable th) {
            this.O = false;
            throw th;
        }
    }

    @Override // defpackage.d9
    public final void E() {
        this.c0 = true;
        ds2 ds2Var = this.Z;
        ds2Var.i();
        ab2 ab2Var = this.N;
        boolean z = ab2Var.f;
        wa2 wa2Var = ab2Var.a;
        if (z) {
            b53 A = wa2Var.A();
            Object[] objArr = A.I;
            int i = A.K;
            for (int i2 = 0; i2 < i; i2++) {
                wa2 wa2Var2 = (wa2) objArr[i2];
                ab2 ab2Var2 = wa2Var2.o0;
                if (ab2Var2.e && wa2Var2.t() == ua2.I) {
                    ns2 ns2Var = ab2Var2.q;
                    ns2Var.getClass();
                    ns2 ns2Var2 = ab2Var2.q;
                    dh0 k0 = ns2Var2 != null ? ns2Var2.k0() : null;
                    k0.getClass();
                    if (ns2Var.C0(k0.a)) {
                        wa2.W(wa2Var, false, 7);
                    }
                }
            }
        }
        w02 w02Var = f().K0;
        w02Var.getClass();
        if (ab2Var.g || (!this.S && !w02Var.W && ab2Var.f)) {
            ab2Var.f = false;
            sa2 sa2Var = ab2Var.d;
            ab2Var.d = sa2.L;
            ab2Var.h(false);
            sh3 snapshotObserver = za2.a(wa2Var).getSnapshotObserver();
            snapshotObserver.a.d(wa2Var, snapshotObserver.h, this.d0);
            ab2Var.d = sa2Var;
            if (ab2Var.m && w02Var.W) {
                requestLayout();
            }
            ab2Var.g = false;
        }
        if (ds2Var.d) {
            ds2Var.e = true;
        }
        if (ds2Var.b && ds2Var.f()) {
            ds2Var.h();
        }
        this.c0 = false;
    }

    public final void E0() {
        this.b0 = true;
    }

    public final void F0() {
        this.R = ua2.K;
    }

    public final void G0() {
        this.Q = Log.LOG_LEVEL_OFF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r0.c0.z() == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H0() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f0
            ab2 r1 = r3.N
            r2 = 0
            if (r0 != 0) goto L1b
            na3 r0 = r1.a()
            js2 r0 = r0.I0()
            r0.getClass()
            na3 r0 = r0.c0
            java.lang.Object r0 = r0.z()
            if (r0 != 0) goto L1b
            goto L1f
        L1b:
            boolean r0 = r3.e0
            if (r0 != 0) goto L20
        L1f:
            return r2
        L20:
            r3.e0 = r2
            na3 r0 = r1.a()
            js2 r0 = r0.I0()
            r0.getClass()
            na3 r0 = r0.c0
            java.lang.Object r0 = r0.z()
            r3.f0 = r0
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns2.H0():boolean");
    }

    @Override // defpackage.d9
    public final void O() {
        wa2.W(this.N.a, false, 7);
    }

    @Override // defpackage.a42
    public final int Q(int i) {
        x0();
        js2 I0 = this.N.a().I0();
        I0.getClass();
        return I0.Q(i);
    }

    @Override // defpackage.bn3
    public final int R(v8 v8Var) {
        ab2 ab2Var = this.N;
        wa2 v = ab2Var.a.v();
        sa2 sa2Var = v != null ? v.o0.d : null;
        sa2 sa2Var2 = sa2.J;
        ds2 ds2Var = this.Z;
        if (sa2Var == sa2Var2) {
            ds2Var.c = true;
        } else {
            wa2 v2 = ab2Var.a.v();
            if ((v2 != null ? v2.o0.d : null) == sa2.L) {
                ds2Var.d = true;
            }
        }
        this.S = true;
        js2 I0 = ab2Var.a().I0();
        I0.getClass();
        int R = I0.R(v8Var);
        this.S = false;
        return R;
    }

    @Override // defpackage.bn3
    public final int U() {
        js2 I0 = this.N.a().I0();
        I0.getClass();
        return I0.U();
    }

    @Override // defpackage.bn3
    public final int V() {
        js2 I0 = this.N.a().I0();
        I0.getClass();
        return I0.V();
    }

    @Override // defpackage.d9
    public final c9 a() {
        return this.Z;
    }

    @Override // defpackage.a42
    public final int b(int i) {
        x0();
        js2 I0 = this.N.a().I0();
        I0.getClass();
        return I0.b(i);
    }

    @Override // defpackage.bn3
    public final void d0(long j, float f, tm1 tm1Var) {
        B0(j, tm1Var);
    }

    @Override // defpackage.d9
    public final x02 f() {
        return this.N.a.n0.c;
    }

    @Override // defpackage.d9
    public final d9 g() {
        ab2 ab2Var;
        wa2 v = this.N.a.v();
        if (v == null || (ab2Var = v.o0) == null) {
            return null;
        }
        return ab2Var.q;
    }

    public final List j0() {
        ab2 ab2Var = this.N;
        ab2Var.a.o();
        boolean z = this.b0;
        b53 b53Var = this.a0;
        if (!z) {
            return b53Var.g();
        }
        wa2 wa2Var = ab2Var.a;
        b53 A = wa2Var.A();
        Object[] objArr = A.I;
        int i = A.K;
        for (int i2 = 0; i2 < i; i2++) {
            wa2 wa2Var2 = (wa2) objArr[i2];
            if (b53Var.K <= i2) {
                ns2 ns2Var = wa2Var2.o0.q;
                ns2Var.getClass();
                b53Var.c(ns2Var);
            } else {
                ns2 ns2Var2 = wa2Var2.o0.q;
                ns2Var2.getClass();
                Object[] objArr2 = b53Var.I;
                Object obj = objArr2[i2];
                objArr2[i2] = ns2Var2;
            }
        }
        b53Var.m(((a53) wa2Var.o()).I.K, b53Var.K);
        this.b0 = false;
        return b53Var.g();
    }

    public final dh0 k0() {
        return this.V;
    }

    public final boolean l0() {
        return this.c0;
    }

    public final ua2 m0() {
        return this.R;
    }

    public final boolean n0() {
        ab2 ab2Var = this.N;
        return sv2.G(ab2Var.a) || ab2Var.c;
    }

    public final boolean o0() {
        return this.T;
    }

    @Override // defpackage.a42
    public final int p(int i) {
        x0();
        js2 I0 = this.N.a().I0();
        I0.getClass();
        return I0.p(i);
    }

    public final void p0(boolean z) {
        wa2 v;
        ab2 ab2Var = this.N;
        wa2 v2 = ab2Var.a.v();
        ua2 ua2Var = ab2Var.a.k0;
        if (v2 == null || ua2Var == ua2.K) {
            return;
        }
        while (v2.k0 == ua2Var && (v = v2.v()) != null) {
            v2 = v;
        }
        int ordinal = ua2Var.ordinal();
        if (ordinal == 0) {
            if (v2.P != null) {
                wa2.W(v2, z, 6);
                return;
            } else {
                wa2.Y(v2, z, 6);
                return;
            }
        }
        if (ordinal != 1) {
            zy.i("Intrinsics isn't used by the parent");
        } else if (v2.P != null) {
            v2.V(z);
        } else {
            v2.X(z);
        }
    }

    public final void q0() {
        this.e0 = true;
    }

    public final boolean r0() {
        return this.Y != ms2.K;
    }

    @Override // defpackage.d9
    public final void requestLayout() {
        this.N.a.V(false);
    }

    @Override // defpackage.d9
    public final int s() {
        return this.Q;
    }

    public final void s0(boolean z) {
        if (z && n0()) {
            return;
        }
        if (z || n0()) {
            this.Y = ms2.K;
            b53 A = this.N.a.A();
            Object[] objArr = A.I;
            int i = A.K;
            for (int i2 = 0; i2 < i; i2++) {
                ns2 ns2Var = ((wa2) objArr[i2]).o0.q;
                ns2Var.getClass();
                ns2Var.s0(true);
            }
        }
    }

    @Override // defpackage.a42
    public final int t(int i) {
        x0();
        js2 I0 = this.N.a().I0();
        I0.getClass();
        return I0.t(i);
    }

    public final void t0() {
        ms2 ms2Var = this.Y;
        ab2 ab2Var = this.N;
        boolean z = ab2Var.c;
        wa2 wa2Var = ab2Var.a;
        ms2 ms2Var2 = ms2.I;
        if (z) {
            this.Y = ms2.J;
        } else {
            this.Y = ms2Var2;
        }
        if (ms2Var != ms2Var2 && ab2Var.e) {
            wa2.W(wa2Var, true, 6);
        }
        b53 A = wa2Var.A();
        Object[] objArr = A.I;
        int i = A.K;
        for (int i2 = 0; i2 < i; i2++) {
            wa2 wa2Var2 = (wa2) objArr[i2];
            ns2 ns2Var = wa2Var2.o0.q;
            if (ns2Var == null) {
                s83.t("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (ns2Var.Q != Integer.MAX_VALUE) {
                ns2Var.t0();
                wa2.Z(wa2Var2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if ((r1 != null ? r1.o0.d : null) == defpackage.sa2.L) goto L14;
     */
    @Override // defpackage.pw2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bn3 u(long r7) {
        /*
            r6 = this;
            ab2 r0 = r6.N
            wa2 r1 = r0.a
            wa2 r2 = r0.a
            wa2 r1 = r1.v()
            r3 = 0
            if (r1 == 0) goto L12
            ab2 r1 = r1.o0
            sa2 r1 = r1.d
            goto L13
        L12:
            r1 = r3
        L13:
            sa2 r4 = defpackage.sa2.J
            if (r1 == r4) goto L27
            wa2 r1 = r2.v()
            if (r1 == 0) goto L22
            ab2 r1 = r1.o0
            sa2 r1 = r1.d
            goto L23
        L22:
            r1 = r3
        L23:
            sa2 r4 = defpackage.sa2.L
            if (r1 != r4) goto L2a
        L27:
            r1 = 0
            r0.b = r1
        L2a:
            wa2 r0 = r2.v()
            ua2 r1 = defpackage.ua2.K
            if (r0 == 0) goto L64
            ab2 r0 = r0.o0
            ua2 r4 = r6.R
            if (r4 == r1) goto L42
            boolean r4 = r2.m0
            if (r4 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r4 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            defpackage.q02.b(r4)
        L42:
            sa2 r4 = r0.d
            int r4 = r4.ordinal()
            if (r4 == 0) goto L5f
            r5 = 1
            if (r4 == r5) goto L5f
            r5 = 2
            if (r4 == r5) goto L5c
            r5 = 3
            if (r4 != r5) goto L54
            goto L5c
        L54:
            sa2 r6 = r0.d
            java.lang.String r7 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            defpackage.zl1.n(r6, r7)
            return r3
        L5c:
            ua2 r0 = defpackage.ua2.J
            goto L61
        L5f:
            ua2 r0 = defpackage.ua2.I
        L61:
            r6.R = r0
            goto L66
        L64:
            r6.R = r1
        L66:
            ua2 r0 = r2.k0
            if (r0 != r1) goto L6d
            r2.e()
        L6d:
            r6.C0(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns2.u(long):bn3");
    }

    public final void u0() {
        ab2 ab2Var = this.N;
        if (ab2Var.o > 0) {
            b53 A = ab2Var.a.A();
            Object[] objArr = A.I;
            int i = A.K;
            for (int i2 = 0; i2 < i; i2++) {
                wa2 wa2Var = (wa2) objArr[i2];
                ab2 ab2Var2 = wa2Var.o0;
                if ((ab2Var2.m || ab2Var2.n) && !ab2Var2.f) {
                    wa2Var.V(false);
                }
                ns2 ns2Var = ab2Var2.q;
                if (ns2Var != null) {
                    ns2Var.u0();
                }
            }
        }
    }

    public final void v0() {
        if (this.Y == ms2.K) {
            ab2 ab2Var = this.N;
            if (sv2.G(ab2Var.a)) {
                return;
            }
            ab2Var.c = true;
        }
    }

    public final void w0() {
        this.Y = ms2.I;
    }

    public final void x0() {
        ab2 ab2Var = this.N;
        wa2.W(ab2Var.a, false, 7);
        wa2 wa2Var = ab2Var.a;
        wa2 v = wa2Var.v();
        if (v == null || wa2Var.k0 != ua2.K) {
            return;
        }
        int ordinal = v.o0.d.ordinal();
        wa2Var.k0 = ordinal != 0 ? ordinal != 2 ? v.k0 : ua2.J : ua2.I;
    }

    @Override // defpackage.d9
    public final void y(v1 v1Var) {
        b53 A = this.N.a.A();
        Object[] objArr = A.I;
        int i = A.K;
        for (int i2 = 0; i2 < i; i2++) {
            ns2 ns2Var = ((wa2) objArr[i2]).o0.q;
            ns2Var.getClass();
            v1Var.invoke(ns2Var);
        }
    }

    public final void y0() {
        this.Q = Log.LOG_LEVEL_OFF;
        this.P = Log.LOG_LEVEL_OFF;
        this.Y = ms2.K;
    }

    @Override // defpackage.bn3, defpackage.a42
    public final Object z() {
        return this.f0;
    }

    public final void z0() {
        sa2 sa2Var;
        this.j0 = true;
        ab2 ab2Var = this.N;
        wa2 v = ab2Var.a.v();
        ms2 ms2Var = this.Y;
        if ((ms2Var != ms2.I && !ab2Var.c) || (ms2Var != ms2.J && ab2Var.c)) {
            t0();
            if (this.O && v != null) {
                v.V(false);
            }
        }
        if (v != null) {
            ab2 ab2Var2 = v.o0;
            if (!this.O && ((sa2Var = ab2Var2.d) == sa2.K || sa2Var == sa2.L)) {
                if (this.Q != Integer.MAX_VALUE) {
                    q02.b("Place was called on a node which was placed already");
                }
                int i = ab2Var2.h;
                this.Q = i;
                ab2Var2.h = i + 1;
            }
        } else {
            this.Q = 0;
        }
        E();
    }
}
