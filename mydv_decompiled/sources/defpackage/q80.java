package defpackage;

import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.flac.FlacConstants;
import androidx.media3.extractor.ts.TsExtractor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class q80 {
    public static final i51 a = new i51(new df0((byte) 13), (byte) 1);

    public static final long a(k80 k80Var, long j) {
        long j2 = k80Var.a;
        long j3 = k80Var.U;
        long j4 = k80Var.Q;
        long j5 = k80Var.M;
        long j6 = k80Var.q;
        int i = x70.h;
        if (zc5.a(j, j2)) {
            return k80Var.b;
        }
        if (zc5.a(j, k80Var.f)) {
            return k80Var.g;
        }
        if (zc5.a(j, k80Var.j)) {
            return k80Var.k;
        }
        if (zc5.a(j, k80Var.n)) {
            return k80Var.o;
        }
        if (zc5.a(j, k80Var.w)) {
            return k80Var.x;
        }
        if (zc5.a(j, k80Var.c)) {
            return k80Var.d;
        }
        if (zc5.a(j, k80Var.h)) {
            return k80Var.i;
        }
        if (zc5.a(j, k80Var.l)) {
            return k80Var.m;
        }
        if (zc5.a(j, k80Var.y)) {
            return k80Var.z;
        }
        if (zc5.a(j, k80Var.u)) {
            return k80Var.v;
        }
        if (!zc5.a(j, k80Var.p)) {
            if (zc5.a(j, k80Var.r)) {
                return k80Var.s;
            }
            if (!zc5.a(j, k80Var.D) && !zc5.a(j, k80Var.F) && !zc5.a(j, k80Var.G) && !zc5.a(j, k80Var.H) && !zc5.a(j, k80Var.I) && !zc5.a(j, k80Var.J) && !zc5.a(j, k80Var.E)) {
                return (zc5.a(j, k80Var.K) || zc5.a(j, k80Var.L)) ? j5 : (zc5.a(j, k80Var.O) || zc5.a(j, k80Var.P)) ? j4 : (zc5.a(j, k80Var.S) || zc5.a(j, k80Var.T)) ? j3 : x70.g;
            }
        }
        return j6;
    }

    public static final long b(long j, fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        go1Var.d0(89373914);
        long a2 = a(((fw2) go1Var.k(lw2.b)).a, j);
        if (a2 == 16) {
            a2 = ((x70) go1Var.k(yh0.a())).a;
        }
        go1Var.q(false);
        return a2;
    }

    public static k80 c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, int i) {
        return new k80(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, a80.a(), a80.c(), a80.b(), a80.d(), j23, j24, (i & 268435456) != 0 ? a80.e() : j25, j26, j32, j27, j28, j29, j30, j31, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44);
    }

    public static final long d(k80 k80Var, l80 l80Var) {
        switch (l80Var.ordinal()) {
            case 0:
                return k80Var.n;
            case 1:
                return k80Var.w;
            case 2:
                return k80Var.y;
            case 3:
                return k80Var.v;
            case 4:
                return k80Var.e;
            case 5:
                return k80Var.u;
            case 6:
                return k80Var.o;
            case 7:
                return k80Var.x;
            case 8:
                return k80Var.z;
            case 9:
                return k80Var.b;
            case 10:
                return k80Var.d;
            case 11:
                return k80Var.M;
            case 12:
                return k80Var.N;
            case 13:
                return k80Var.g;
            case 14:
                return k80Var.i;
            case 15:
                return k80Var.Q;
            case 16:
                return k80Var.R;
            case 17:
                return k80Var.q;
            case 18:
                return k80Var.s;
            case 19:
                return k80Var.k;
            case 20:
                return k80Var.m;
            case 21:
                return k80Var.U;
            case 22:
                return k80Var.V;
            case 23:
                return k80Var.A;
            case 24:
                return k80Var.B;
            case 25:
                return k80Var.a;
            case 26:
                return k80Var.c;
            case 27:
                return k80Var.K;
            case 28:
                return k80Var.L;
            case 29:
                return k80Var.C;
            case 30:
                return k80Var.f;
            case 31:
                return k80Var.h;
            case 32:
                return k80Var.O;
            case 33:
                return k80Var.P;
            case 34:
                return k80Var.p;
            case 35:
                return k80Var.D;
            case TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                return k80Var.F;
            case 37:
                return k80Var.G;
            case FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                return k80Var.H;
            case NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                return k80Var.I;
            case NalUnitUtil.H265_NAL_UNIT_TYPE_SUFFIX_SEI /* 40 */:
                return k80Var.J;
            case 41:
                return k80Var.E;
            case AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                return k80Var.t;
            case 43:
                return k80Var.r;
            case 44:
                return k80Var.j;
            case TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                return k80Var.l;
            case 46:
                return k80Var.S;
            case 47:
                return k80Var.T;
            default:
                s83.v();
                return 0L;
        }
    }

    public static final long e(l80 l80Var, fe0 fe0Var) {
        return d(((fw2) ((go1) fe0Var).k(lw2.b)).a, l80Var);
    }

    public static k80 f(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, int i, int i2) {
        long z = (i & 1) != 0 ? e80.z() : j;
        return new k80(z, (i & 2) != 0 ? e80.j() : j2, (i & 4) != 0 ? e80.A() : j3, (i & 8) != 0 ? e80.k() : j4, (i & 16) != 0 ? e80.e() : j5, (i & 32) != 0 ? e80.E() : j6, (i & 64) != 0 ? e80.n() : j7, (i & 128) != 0 ? e80.F() : j8, (i & 256) != 0 ? e80.o() : j9, (i & 512) != 0 ? e80.R() : j10, (i & 1024) != 0 ? e80.t() : j11, (i & 2048) != 0 ? e80.S() : j12, (i & 4096) != 0 ? e80.u() : j13, (i & 8192) != 0 ? e80.a() : j14, (i & 16384) != 0 ? e80.g() : j15, (i & 32768) != 0 ? e80.I() : j16, (65536 & i) != 0 ? e80.r() : j17, (131072 & i) != 0 ? e80.Q() : j18, (262144 & i) != 0 ? e80.s() : j19, (524288 & i) != 0 ? z : j20, (1048576 & i) != 0 ? e80.f() : j21, (2097152 & i) != 0 ? e80.d() : j22, e80.b(), e80.h(), e80.c(), (33554432 & i) != 0 ? e80.i() : j23, (67108864 & i) != 0 ? e80.x() : j24, (134217728 & i) != 0 ? e80.y() : j25, (268435456 & i) != 0 ? e80.D() : j26, (536870912 & i) != 0 ? e80.J() : j27, (i2 & 8) != 0 ? e80.P() : j33, (1073741824 & i) != 0 ? e80.K() : j28, (i & Integer.MIN_VALUE) != 0 ? e80.L() : j29, (i2 & 1) != 0 ? e80.M() : j30, (i2 & 2) != 0 ? e80.N() : j31, (i2 & 4) != 0 ? e80.O() : j32, (i2 & 16) != 0 ? e80.B() : j34, (i2 & 32) != 0 ? e80.C() : j35, (i2 & 64) != 0 ? e80.l() : j36, (i2 & 128) != 0 ? e80.m() : j37, (i2 & 256) != 0 ? e80.G() : j38, (i2 & 512) != 0 ? e80.H() : j39, (i2 & 1024) != 0 ? e80.p() : j40, (i2 & 2048) != 0 ? e80.q() : j41, (i2 & 4096) != 0 ? e80.T() : j42, (i2 & 8192) != 0 ? e80.U() : j43, (i2 & 16384) != 0 ? e80.v() : j44, (i2 & 32768) != 0 ? e80.w() : j45);
    }
}
