package defpackage;

import androidx.media3.common.util.Log;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class tw2 extends bn3 implements pw2, d9, e23 {
    public final ab2 N;
    public boolean O;
    public boolean R;
    public boolean S;
    public boolean U;
    public tm1 W;
    public float X;
    public Object Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public boolean i0;
    public final sw2 k0;
    public final sw2 l0;
    public float m0;
    public boolean n0;
    public tm1 o0;
    public float q0;
    public final sw2 r0;
    public boolean s0;
    public int P = Log.LOG_LEVEL_OFF;
    public int Q = Log.LOG_LEVEL_OFF;
    public ua2 T = ua2.K;
    public long V = 0;
    public boolean Y = true;
    public final xa2 f0 = new xa2(this);
    public final b53 g0 = new b53(new tw2[16]);
    public boolean h0 = true;
    public long j0 = eh0.b(0, 0, 0, 0, 15);
    public long p0 = 0;

    /* JADX WARN: Type inference failed for: r2v3, types: [sw2] */
    /* JADX WARN: Type inference failed for: r2v4, types: [sw2] */
    /* JADX WARN: Type inference failed for: r7v4, types: [sw2] */
    public tw2(ab2 ab2Var) {
        this.N = ab2Var;
        final byte b = 1;
        final byte b2 = 0;
        this.k0 = new rm1(this) { // from class: sw2
            public final /* synthetic */ tw2 J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                boolean z;
                byte b3 = b2;
                e43 e43Var = null;
                wd5 wd5Var = wd5.a;
                tw2 tw2Var = this.J;
                switch (b3) {
                    case 0:
                        tw2Var.N.a().u(tw2Var.j0);
                        break;
                    case 1:
                        ab2 ab2Var2 = tw2Var.N;
                        ab2Var2.i = 0;
                        wa2 wa2Var = ab2Var2.a;
                        b53 A = wa2Var.A();
                        Object[] objArr = A.I;
                        int i = A.K;
                        for (int i2 = 0; i2 < i; i2++) {
                            tw2 tw2Var2 = ((wa2) objArr[i2]).o0.p;
                            tw2Var2.P = tw2Var2.Q;
                            tw2Var2.Q = Log.LOG_LEVEL_OFF;
                            tw2Var2.b0 = false;
                            if (tw2Var2.T == ua2.J) {
                                tw2Var2.T = ua2.K;
                            }
                        }
                        b53 A2 = wa2Var.A();
                        Object[] objArr2 = A2.I;
                        int i3 = A2.K;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((wa2) objArr2[i4]).o0.p.f0.d = false;
                        }
                        a53 a53Var = (a53) wa2Var.o();
                        int i5 = a53Var.I.K;
                        for (int i6 = 0; i6 < i5; i6++) {
                            wa2 wa2Var2 = (wa2) a53Var.get(i6);
                            if (wa2Var2.n0.d.W) {
                                if (e43Var == null) {
                                    e43Var = new e43();
                                }
                                e43Var.a(wa2Var2);
                            }
                            wa2Var2.n0.d.W = tw2Var.f().W;
                        }
                        tw2Var.f().r0().b();
                        a53 a53Var2 = (a53) wa2Var.o();
                        int i7 = a53Var2.I.K;
                        for (int i8 = 0; i8 < i7; i8++) {
                            wa2 wa2Var3 = (wa2) a53Var2.get(i8);
                            if (e43Var != null) {
                                z = true;
                                if (e43Var.e(wa2Var3)) {
                                    wa2Var3.n0.d.W = z;
                                }
                            }
                            z = false;
                            wa2Var3.n0.d.W = z;
                        }
                        b53 A3 = wa2Var.A();
                        Object[] objArr3 = A3.I;
                        int i9 = A3.K;
                        for (int i10 = 0; i10 < i9; i10++) {
                            wa2 wa2Var4 = (wa2) objArr3[i10];
                            ab2 ab2Var3 = wa2Var4.o0;
                            if (ab2Var3.p.P != wa2Var4.w()) {
                                wa2Var.R();
                                wa2Var.E();
                                if (wa2Var4.w() == Integer.MAX_VALUE) {
                                    if (ab2Var3.c || sv2.G(wa2Var4)) {
                                        ns2 ns2Var = ab2Var3.q;
                                        ns2Var.getClass();
                                        ns2Var.s0(false);
                                    }
                                    ab2Var3.p.l0();
                                }
                            }
                        }
                        b53 A4 = wa2Var.A();
                        Object[] objArr4 = A4.I;
                        int i11 = A4.K;
                        for (int i12 = 0; i12 < i11; i12++) {
                            xa2 xa2Var = ((wa2) objArr4[i12]).o0.p.f0;
                            xa2Var.e = xa2Var.d;
                        }
                        break;
                    default:
                        ab2 ab2Var4 = tw2Var.N;
                        na3 na3Var = ab2Var4.a().e0;
                        an3 placementScope = na3Var != null ? na3Var.X : za2.a(ab2Var4.a).getPlacementScope();
                        tm1 tm1Var = tw2Var.o0;
                        if (tm1Var == null) {
                            na3 a = ab2Var4.a();
                            long j = tw2Var.p0;
                            float f = tw2Var.q0;
                            placementScope.f(a);
                            a.d0(r22.c(j, a.M), f, null);
                            break;
                        } else {
                            na3 a2 = ab2Var4.a();
                            long j2 = tw2Var.p0;
                            float f2 = tw2Var.q0;
                            placementScope.f(a2);
                            a2.d0(r22.c(j2, a2.M), f2, tm1Var);
                            break;
                        }
                }
                return wd5Var;
            }
        };
        this.l0 = new rm1(this) { // from class: sw2
            public final /* synthetic */ tw2 J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                boolean z;
                byte b3 = b;
                e43 e43Var = null;
                wd5 wd5Var = wd5.a;
                tw2 tw2Var = this.J;
                switch (b3) {
                    case 0:
                        tw2Var.N.a().u(tw2Var.j0);
                        break;
                    case 1:
                        ab2 ab2Var2 = tw2Var.N;
                        ab2Var2.i = 0;
                        wa2 wa2Var = ab2Var2.a;
                        b53 A = wa2Var.A();
                        Object[] objArr = A.I;
                        int i = A.K;
                        for (int i2 = 0; i2 < i; i2++) {
                            tw2 tw2Var2 = ((wa2) objArr[i2]).o0.p;
                            tw2Var2.P = tw2Var2.Q;
                            tw2Var2.Q = Log.LOG_LEVEL_OFF;
                            tw2Var2.b0 = false;
                            if (tw2Var2.T == ua2.J) {
                                tw2Var2.T = ua2.K;
                            }
                        }
                        b53 A2 = wa2Var.A();
                        Object[] objArr2 = A2.I;
                        int i3 = A2.K;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((wa2) objArr2[i4]).o0.p.f0.d = false;
                        }
                        a53 a53Var = (a53) wa2Var.o();
                        int i5 = a53Var.I.K;
                        for (int i6 = 0; i6 < i5; i6++) {
                            wa2 wa2Var2 = (wa2) a53Var.get(i6);
                            if (wa2Var2.n0.d.W) {
                                if (e43Var == null) {
                                    e43Var = new e43();
                                }
                                e43Var.a(wa2Var2);
                            }
                            wa2Var2.n0.d.W = tw2Var.f().W;
                        }
                        tw2Var.f().r0().b();
                        a53 a53Var2 = (a53) wa2Var.o();
                        int i7 = a53Var2.I.K;
                        for (int i8 = 0; i8 < i7; i8++) {
                            wa2 wa2Var3 = (wa2) a53Var2.get(i8);
                            if (e43Var != null) {
                                z = true;
                                if (e43Var.e(wa2Var3)) {
                                    wa2Var3.n0.d.W = z;
                                }
                            }
                            z = false;
                            wa2Var3.n0.d.W = z;
                        }
                        b53 A3 = wa2Var.A();
                        Object[] objArr3 = A3.I;
                        int i9 = A3.K;
                        for (int i10 = 0; i10 < i9; i10++) {
                            wa2 wa2Var4 = (wa2) objArr3[i10];
                            ab2 ab2Var3 = wa2Var4.o0;
                            if (ab2Var3.p.P != wa2Var4.w()) {
                                wa2Var.R();
                                wa2Var.E();
                                if (wa2Var4.w() == Integer.MAX_VALUE) {
                                    if (ab2Var3.c || sv2.G(wa2Var4)) {
                                        ns2 ns2Var = ab2Var3.q;
                                        ns2Var.getClass();
                                        ns2Var.s0(false);
                                    }
                                    ab2Var3.p.l0();
                                }
                            }
                        }
                        b53 A4 = wa2Var.A();
                        Object[] objArr4 = A4.I;
                        int i11 = A4.K;
                        for (int i12 = 0; i12 < i11; i12++) {
                            xa2 xa2Var = ((wa2) objArr4[i12]).o0.p.f0;
                            xa2Var.e = xa2Var.d;
                        }
                        break;
                    default:
                        ab2 ab2Var4 = tw2Var.N;
                        na3 na3Var = ab2Var4.a().e0;
                        an3 placementScope = na3Var != null ? na3Var.X : za2.a(ab2Var4.a).getPlacementScope();
                        tm1 tm1Var = tw2Var.o0;
                        if (tm1Var == null) {
                            na3 a = ab2Var4.a();
                            long j = tw2Var.p0;
                            float f = tw2Var.q0;
                            placementScope.f(a);
                            a.d0(r22.c(j, a.M), f, null);
                            break;
                        } else {
                            na3 a2 = ab2Var4.a();
                            long j2 = tw2Var.p0;
                            float f2 = tw2Var.q0;
                            placementScope.f(a2);
                            a2.d0(r22.c(j2, a2.M), f2, tm1Var);
                            break;
                        }
                }
                return wd5Var;
            }
        };
        final byte b3 = 2;
        this.r0 = new rm1(this) { // from class: sw2
            public final /* synthetic */ tw2 J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                boolean z;
                byte b32 = b3;
                e43 e43Var = null;
                wd5 wd5Var = wd5.a;
                tw2 tw2Var = this.J;
                switch (b32) {
                    case 0:
                        tw2Var.N.a().u(tw2Var.j0);
                        break;
                    case 1:
                        ab2 ab2Var2 = tw2Var.N;
                        ab2Var2.i = 0;
                        wa2 wa2Var = ab2Var2.a;
                        b53 A = wa2Var.A();
                        Object[] objArr = A.I;
                        int i = A.K;
                        for (int i2 = 0; i2 < i; i2++) {
                            tw2 tw2Var2 = ((wa2) objArr[i2]).o0.p;
                            tw2Var2.P = tw2Var2.Q;
                            tw2Var2.Q = Log.LOG_LEVEL_OFF;
                            tw2Var2.b0 = false;
                            if (tw2Var2.T == ua2.J) {
                                tw2Var2.T = ua2.K;
                            }
                        }
                        b53 A2 = wa2Var.A();
                        Object[] objArr2 = A2.I;
                        int i3 = A2.K;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((wa2) objArr2[i4]).o0.p.f0.d = false;
                        }
                        a53 a53Var = (a53) wa2Var.o();
                        int i5 = a53Var.I.K;
                        for (int i6 = 0; i6 < i5; i6++) {
                            wa2 wa2Var2 = (wa2) a53Var.get(i6);
                            if (wa2Var2.n0.d.W) {
                                if (e43Var == null) {
                                    e43Var = new e43();
                                }
                                e43Var.a(wa2Var2);
                            }
                            wa2Var2.n0.d.W = tw2Var.f().W;
                        }
                        tw2Var.f().r0().b();
                        a53 a53Var2 = (a53) wa2Var.o();
                        int i7 = a53Var2.I.K;
                        for (int i8 = 0; i8 < i7; i8++) {
                            wa2 wa2Var3 = (wa2) a53Var2.get(i8);
                            if (e43Var != null) {
                                z = true;
                                if (e43Var.e(wa2Var3)) {
                                    wa2Var3.n0.d.W = z;
                                }
                            }
                            z = false;
                            wa2Var3.n0.d.W = z;
                        }
                        b53 A3 = wa2Var.A();
                        Object[] objArr3 = A3.I;
                        int i9 = A3.K;
                        for (int i10 = 0; i10 < i9; i10++) {
                            wa2 wa2Var4 = (wa2) objArr3[i10];
                            ab2 ab2Var3 = wa2Var4.o0;
                            if (ab2Var3.p.P != wa2Var4.w()) {
                                wa2Var.R();
                                wa2Var.E();
                                if (wa2Var4.w() == Integer.MAX_VALUE) {
                                    if (ab2Var3.c || sv2.G(wa2Var4)) {
                                        ns2 ns2Var = ab2Var3.q;
                                        ns2Var.getClass();
                                        ns2Var.s0(false);
                                    }
                                    ab2Var3.p.l0();
                                }
                            }
                        }
                        b53 A4 = wa2Var.A();
                        Object[] objArr4 = A4.I;
                        int i11 = A4.K;
                        for (int i12 = 0; i12 < i11; i12++) {
                            xa2 xa2Var = ((wa2) objArr4[i12]).o0.p.f0;
                            xa2Var.e = xa2Var.d;
                        }
                        break;
                    default:
                        ab2 ab2Var4 = tw2Var.N;
                        na3 na3Var = ab2Var4.a().e0;
                        an3 placementScope = na3Var != null ? na3Var.X : za2.a(ab2Var4.a).getPlacementScope();
                        tm1 tm1Var = tw2Var.o0;
                        if (tm1Var == null) {
                            na3 a = ab2Var4.a();
                            long j = tw2Var.p0;
                            float f = tw2Var.q0;
                            placementScope.f(a);
                            a.d0(r22.c(j, a.M), f, null);
                            break;
                        } else {
                            na3 a2 = ab2Var4.a();
                            long j2 = tw2Var.p0;
                            float f2 = tw2Var.q0;
                            placementScope.f(a2);
                            a2.d0(r22.c(j2, a2.M), f2, tm1Var);
                            break;
                        }
                }
                return wd5Var;
            }
        };
    }

    @Override // defpackage.e23
    public final void D(boolean z) {
        ab2 ab2Var = this.N;
        if (z != ab2Var.a().T) {
            ab2Var.a().T = z;
            this.s0 = true;
        }
    }

    @Override // defpackage.d9
    public final void E() {
        boolean z;
        this.i0 = true;
        xa2 xa2Var = this.f0;
        xa2Var.i();
        boolean z2 = this.d0;
        ab2 ab2Var = this.N;
        if (z2) {
            b53 A = ab2Var.a.A();
            Object[] objArr = A.I;
            int i = A.K;
            for (int i2 = 0; i2 < i; i2++) {
                wa2 wa2Var = (wa2) objArr[i2];
                boolean r = wa2Var.r();
                ab2 ab2Var2 = wa2Var.o0;
                if (r && wa2Var.s() == ua2.I) {
                    tw2 tw2Var = ab2Var2.p;
                    dh0 dh0Var = tw2Var.R ? new dh0(tw2Var.L) : null;
                    if (dh0Var != null) {
                        if (wa2Var.k0 == ua2.K) {
                            wa2Var.e();
                        }
                        z = ab2Var2.p.p0(dh0Var.a);
                    } else {
                        z = false;
                    }
                    if (z) {
                        wa2.Y(ab2Var.a, false, 7);
                    }
                }
            }
        }
        if (this.e0 || (!this.U && !f().W && this.d0)) {
            this.d0 = false;
            sa2 sa2Var = ab2Var.d;
            ab2Var.d = sa2.K;
            ab2Var.f(false);
            wa2 wa2Var2 = ab2Var.a;
            sh3 snapshotObserver = za2.a(wa2Var2).getSnapshotObserver();
            snapshotObserver.a.d(wa2Var2, snapshotObserver.e, this.l0);
            ab2Var.d = sa2Var;
            this.e0 = false;
        }
        if (xa2Var.d) {
            xa2Var.e = true;
        }
        if (xa2Var.b && xa2Var.f()) {
            xa2Var.h();
        }
        this.i0 = false;
    }

    @Override // defpackage.d9
    public final void O() {
        wa2.Y(this.N.a, false, 7);
    }

    @Override // defpackage.a42
    public final int Q(int i) {
        ab2 ab2Var = this.N;
        if (!sv2.G(ab2Var.a)) {
            m0();
            return ab2Var.a().Q(i);
        }
        ns2 ns2Var = ab2Var.q;
        ns2Var.getClass();
        return ns2Var.Q(i);
    }

    @Override // defpackage.bn3
    public final int R(v8 v8Var) {
        ab2 ab2Var = this.N;
        wa2 v = ab2Var.a.v();
        sa2 sa2Var = v != null ? v.o0.d : null;
        sa2 sa2Var2 = sa2.I;
        xa2 xa2Var = this.f0;
        if (sa2Var == sa2Var2) {
            xa2Var.c = true;
        } else {
            wa2 v2 = ab2Var.a.v();
            if ((v2 != null ? v2.o0.d : null) == sa2.K) {
                xa2Var.d = true;
            }
        }
        this.U = true;
        int R = ab2Var.a().R(v8Var);
        this.U = false;
        return R;
    }

    @Override // defpackage.bn3
    public final int U() {
        return this.N.a().U();
    }

    @Override // defpackage.bn3
    public final int V() {
        return this.N.a().V();
    }

    @Override // defpackage.d9
    public final c9 a() {
        return this.f0;
    }

    @Override // defpackage.a42
    public final int b(int i) {
        ab2 ab2Var = this.N;
        if (!sv2.G(ab2Var.a)) {
            m0();
            return ab2Var.a().b(i);
        }
        ns2 ns2Var = ab2Var.q;
        ns2Var.getClass();
        return ns2Var.b(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002d, B:12:0x0031, B:13:0x0034, B:15:0x0038, B:17:0x003e, B:19:0x0046, B:20:0x0051, B:22:0x005c, B:23:0x0060, B:24:0x0049, B:25:0x0072, B:27:0x0076, B:29:0x007c, B:30:0x0081, B:34:0x001d, B:36:0x0021, B:38:0x0025, B:40:0x0029), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002d, B:12:0x0031, B:13:0x0034, B:15:0x0038, B:17:0x003e, B:19:0x0046, B:20:0x0051, B:22:0x005c, B:23:0x0060, B:24:0x0049, B:25:0x0072, B:27:0x0076, B:29:0x007c, B:30:0x0081, B:34:0x001d, B:36:0x0021, B:38:0x0025, B:40:0x0029), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002d, B:12:0x0031, B:13:0x0034, B:15:0x0038, B:17:0x003e, B:19:0x0046, B:20:0x0051, B:22:0x005c, B:23:0x0060, B:24:0x0049, B:25:0x0072, B:27:0x0076, B:29:0x007c, B:30:0x0081, B:34:0x001d, B:36:0x0021, B:38:0x0025, B:40:0x0029), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002d, B:12:0x0031, B:13:0x0034, B:15:0x0038, B:17:0x003e, B:19:0x0046, B:20:0x0051, B:22:0x005c, B:23:0x0060, B:24:0x0049, B:25:0x0072, B:27:0x0076, B:29:0x007c, B:30:0x0081, B:34:0x001d, B:36:0x0021, B:38:0x0025, B:40:0x0029), top: B:2:0x0007 }] */
    @Override // defpackage.bn3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d0(long r8, float r10, defpackage.tm1 r11) {
        /*
            r7 = this;
            ab2 r0 = r7.N
            wa2 r1 = r0.a
            wa2 r2 = r0.a
            r3 = 1
            r7.b0 = r3     // Catch: java.lang.Throwable -> L1b
            long r4 = r7.V     // Catch: java.lang.Throwable -> L1b
            boolean r4 = defpackage.r22.a(r8, r4)     // Catch: java.lang.Throwable -> L1b
            r5 = 0
            if (r4 == 0) goto L1d
            tm1 r4 = r7.W     // Catch: java.lang.Throwable -> L1b
            if (r11 != r4) goto L1d
            boolean r4 = r7.s0     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L2d
            goto L1d
        L1b:
            r7 = move-exception
            goto L85
        L1d:
            boolean r4 = r0.k     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L29
            boolean r4 = r0.j     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L29
            boolean r4 = r7.s0     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L2d
        L29:
            r7.d0 = r3     // Catch: java.lang.Throwable -> L1b
            r7.s0 = r5     // Catch: java.lang.Throwable -> L1b
        L2d:
            ns2 r4 = r0.q     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L34
            r4.v0()     // Catch: java.lang.Throwable -> L1b
        L34:
            ns2 r4 = r0.q     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L72
            boolean r4 = r4.n0()     // Catch: java.lang.Throwable -> L1b
            if (r4 != r3) goto L72
            na3 r3 = r0.a()     // Catch: java.lang.Throwable -> L1b
            na3 r3 = r3.e0     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L49
            is2 r3 = r3.X     // Catch: java.lang.Throwable -> L1b
            goto L51
        L49:
            qh3 r3 = defpackage.za2.a(r2)     // Catch: java.lang.Throwable -> L1b
            an3 r3 = r3.getPlacementScope()     // Catch: java.lang.Throwable -> L1b
        L51:
            ns2 r4 = r0.q     // Catch: java.lang.Throwable -> L1b
            r4.getClass()     // Catch: java.lang.Throwable -> L1b
            wa2 r2 = r2.v()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L60
            ab2 r2 = r2.o0     // Catch: java.lang.Throwable -> L1b
            r2.h = r5     // Catch: java.lang.Throwable -> L1b
        L60:
            r4.G0()     // Catch: java.lang.Throwable -> L1b
            r2 = 32
            long r5 = r8 >> r2
            int r2 = (int) r5     // Catch: java.lang.Throwable -> L1b
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r8
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L1b
            defpackage.an3.g(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> L1b
        L72:
            ns2 r0 = r0.q     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L81
            boolean r0 = r0.o0()     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L81
            java.lang.String r0 = "Error: Placement happened before lookahead."
            defpackage.q02.b(r0)     // Catch: java.lang.Throwable -> L1b
        L81:
            r7.o0(r8, r10, r11)     // Catch: java.lang.Throwable -> L1b
            return
        L85:
            r1.b0(r7)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw2.d0(long, float, tm1):void");
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
        return ab2Var.p;
    }

    public final List j0() {
        ab2 ab2Var = this.N;
        ab2Var.a.i0();
        boolean z = this.h0;
        b53 b53Var = this.g0;
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
                b53Var.c(wa2Var2.o0.p);
            } else {
                tw2 tw2Var = wa2Var2.o0.p;
                Object[] objArr2 = b53Var.I;
                Object obj = objArr2[i2];
                objArr2[i2] = tw2Var;
            }
        }
        b53Var.m(((a53) wa2Var.o()).I.K, b53Var.K);
        this.h0 = false;
        return b53Var.g();
    }

    public final void k0() {
        boolean z = this.a0;
        this.a0 = true;
        ab2 ab2Var = this.N;
        wa2 wa2Var = ab2Var.a;
        ja3 ja3Var = wa2Var.n0;
        if (!z) {
            ja3Var.c.W0();
            za2.a(wa2Var).getRectManager().g(ab2Var.a);
            if (wa2Var.r()) {
                wa2.Y(wa2Var, true, 6);
            } else if (wa2Var.o0.e) {
                wa2.W(wa2Var, true, 6);
            }
        }
        na3 na3Var = ja3Var.c.d0;
        for (na3 na3Var2 = ja3Var.d; !j42.c(na3Var2, na3Var) && na3Var2 != null; na3Var2 = na3Var2.d0) {
            if (na3Var2.A0) {
                na3Var2.S0();
            }
        }
        b53 A = wa2Var.A();
        Object[] objArr = A.I;
        int i = A.K;
        for (int i2 = 0; i2 < i; i2++) {
            wa2 wa2Var2 = (wa2) objArr[i2];
            if (wa2Var2.w() != Integer.MAX_VALUE) {
                wa2Var2.o0.p.k0();
                wa2.Z(wa2Var2);
            }
        }
    }

    public final void l0() {
        if (this.a0) {
            this.a0 = false;
            ab2 ab2Var = this.N;
            wa2 wa2Var = ab2Var.a;
            wa2 wa2Var2 = ab2Var.a;
            za2.a(wa2Var).getRectManager().h(wa2Var2);
            ja3 ja3Var = wa2Var2.n0;
            na3 na3Var = ja3Var.c.d0;
            for (na3 na3Var2 = ja3Var.d; !j42.c(na3Var2, na3Var) && na3Var2 != null; na3Var2 = na3Var2.d0) {
                na3Var2.Y0();
                na3Var2.d1();
            }
            b53 A = wa2Var2.A();
            Object[] objArr = A.I;
            int i = A.K;
            for (int i2 = 0; i2 < i; i2++) {
                ((wa2) objArr[i2]).o0.p.l0();
            }
        }
    }

    public final void m0() {
        ab2 ab2Var = this.N;
        wa2.Y(ab2Var.a, false, 7);
        wa2 wa2Var = ab2Var.a;
        wa2 v = wa2Var.v();
        if (v == null || wa2Var.k0 != ua2.K) {
            return;
        }
        int ordinal = v.o0.d.ordinal();
        wa2Var.k0 = ordinal != 0 ? ordinal != 2 ? v.k0 : ua2.J : ua2.I;
    }

    public final void n0() {
        this.n0 = true;
        ab2 ab2Var = this.N;
        wa2 v = ab2Var.a.v();
        float f = f().o0;
        wa2 wa2Var = ab2Var.a;
        ja3 ja3Var = wa2Var.n0;
        na3 na3Var = ja3Var.d;
        x02 x02Var = ja3Var.c;
        while (na3Var != x02Var) {
            na3Var.getClass();
            pa2 pa2Var = (pa2) na3Var;
            f += pa2Var.o0;
            na3Var = pa2Var.d0;
        }
        if (f != this.m0) {
            this.m0 = f;
            if (v != null) {
                v.R();
            }
            if (v != null) {
                v.E();
            }
        }
        if (!f().W) {
            boolean z = this.a0;
            if (!z || this.f0.e()) {
                k0();
            }
            if (z) {
                wa2Var.n0.c.W0();
            } else {
                if (v != null) {
                    v.E();
                }
                if (this.O && v != null) {
                    v.X(false);
                }
            }
        }
        if (v != null) {
            ab2 ab2Var2 = v.o0;
            if (!this.O && ab2Var2.d == sa2.K) {
                if (this.Q != Integer.MAX_VALUE) {
                    q02.b("Place was called on a node which was placed already");
                }
                int i = ab2Var2.i;
                this.Q = i;
                ab2Var2.i = i + 1;
            }
        } else {
            this.Q = 0;
        }
        E();
    }

    public final void o0(long j, float f, tm1 tm1Var) {
        ab2 ab2Var = this.N;
        wa2 wa2Var = ab2Var.a;
        wa2 wa2Var2 = ab2Var.a;
        if (wa2Var.y0) {
            q02.a("place is called on a deactivated node");
        }
        ab2Var.d = sa2.K;
        this.V = j;
        this.X = f;
        this.W = tm1Var;
        this.n0 = false;
        qh3 a = za2.a(wa2Var2);
        if (this.d0 || !this.a0) {
            this.f0.g = false;
            ab2Var.e(false);
            this.o0 = tm1Var;
            this.p0 = j;
            this.q0 = f;
            sh3 snapshotObserver = a.getSnapshotObserver();
            snapshotObserver.a.d(wa2Var2, snapshotObserver.f, this.r0);
        } else {
            na3 a2 = ab2Var.a();
            a2.b1(r22.c(j, a2.M), f, tm1Var);
            n0();
        }
        ab2Var.d = sa2.M;
        if (ab2Var.a().W && (ab2Var.k || ab2Var.j)) {
            requestLayout();
        }
        this.S = true;
    }

    @Override // defpackage.a42
    public final int p(int i) {
        ab2 ab2Var = this.N;
        if (!sv2.G(ab2Var.a)) {
            m0();
            return ab2Var.a().p(i);
        }
        ns2 ns2Var = ab2Var.q;
        ns2Var.getClass();
        return ns2Var.p(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[Catch: all -> 0x0010, LOOP:0: B:22:0x0050->B:23:0x0052, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0043, B:23:0x0052, B:25:0x0061, B:28:0x0078, B:30:0x0095, B:31:0x009b, B:33:0x00a7, B:35:0x00b1, B:39:0x00bd, B:41:0x0073), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0043, B:23:0x0052, B:25:0x0061, B:28:0x0078, B:30:0x0095, B:31:0x009b, B:33:0x00a7, B:35:0x00b1, B:39:0x00bd, B:41:0x0073), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0043, B:23:0x0052, B:25:0x0061, B:28:0x0078, B:30:0x0095, B:31:0x009b, B:33:0x00a7, B:35:0x00b1, B:39:0x00bd, B:41:0x0073), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p0(long r11) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw2.p0(long):boolean");
    }

    public final void q0() {
        ab2 ab2Var = this.N;
        wa2 wa2Var = ab2Var.a;
        wa2 wa2Var2 = ab2Var.a;
        if (!wa2Var.L() || ab2Var.l <= 0) {
            return;
        }
        ab2 ab2Var2 = wa2Var2.o0;
        if ((ab2Var2.j || ab2Var2.k) && !ab2Var2.p.d0) {
            wa2Var2.X(false);
        }
        b53 A = wa2Var2.A();
        Object[] objArr = A.I;
        int i = A.K;
        for (int i2 = 0; i2 < i; i2++) {
            ((wa2) objArr[i2]).o0.p.q0();
        }
    }

    @Override // defpackage.d9
    public final void requestLayout() {
        this.N.a.X(false);
    }

    @Override // defpackage.d9
    public final int s() {
        return this.Q;
    }

    @Override // defpackage.a42
    public final int t(int i) {
        ab2 ab2Var = this.N;
        if (!sv2.G(ab2Var.a)) {
            m0();
            return ab2Var.a().t(i);
        }
        ns2 ns2Var = ab2Var.q;
        ns2Var.getClass();
        return ns2Var.t(i);
    }

    @Override // defpackage.pw2
    public final bn3 u(long j) {
        ua2 ua2Var;
        ab2 ab2Var = this.N;
        wa2 wa2Var = ab2Var.a;
        wa2 wa2Var2 = ab2Var.a;
        ua2 ua2Var2 = wa2Var.k0;
        ua2 ua2Var3 = ua2.K;
        if (ua2Var2 == ua2Var3) {
            wa2Var.e();
        }
        if (sv2.G(wa2Var2)) {
            ns2 ns2Var = ab2Var.q;
            ns2Var.getClass();
            ns2Var.F0();
            ns2Var.u(j);
        }
        wa2 v = wa2Var2.v();
        if (v != null) {
            ab2 ab2Var2 = v.o0;
            if (this.T != ua2Var3 && !wa2Var2.m0) {
                q02.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = ab2Var2.d.ordinal();
            if (ordinal == 0) {
                ua2Var = ua2.I;
            } else {
                if (ordinal != 2) {
                    zl1.n(ab2Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                ua2Var = ua2.J;
            }
            this.T = ua2Var;
        } else {
            this.T = ua2Var3;
        }
        p0(j);
        return this;
    }

    @Override // defpackage.d9
    public final void y(v1 v1Var) {
        b53 A = this.N.a.A();
        Object[] objArr = A.I;
        int i = A.K;
        for (int i2 = 0; i2 < i; i2++) {
            v1Var.invoke(((wa2) objArr[i2]).o0.p);
        }
    }

    @Override // defpackage.bn3, defpackage.a42
    public final Object z() {
        return this.Z;
    }
}
