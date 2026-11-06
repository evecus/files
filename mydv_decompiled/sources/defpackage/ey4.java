package defpackage;

import androidx.media3.common.video.Frame;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ey4 {
    public wy A;
    public long B;
    public wy C;
    public boolean D;
    public dn4 E;
    public Object F;
    public Object G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public c80 S;
    public long T;
    public wy U;
    public i55 V;
    public long W;
    public long X;
    public long Y;
    public int Z;
    public long a;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float p;
    public float q;
    public float r;
    public float s;
    public wy y;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float t = Float.NaN;
    public float u = Float.NaN;
    public float v = Float.NaN;
    public float w = Float.NaN;
    public long x = x70.b;
    public long z = x70.f;

    public ey4() {
        long j = x70.g;
        this.B = j;
        this.E = mw2.j;
        this.H = 1.0f;
        this.I = 1.0f;
        this.J = 1.0f;
        long j2 = r95.b;
        this.P = Float.intBitsToFloat((int) (j2 >> 32));
        this.Q = Float.intBitsToFloat((int) (j2 & 4294967295L));
        this.T = j;
        long j3 = p65.c;
        this.W = j3;
        this.X = j3;
        this.Y = j3;
    }

    public final void A(int i) {
        this.a |= 4398046511104L;
        this.Z = ((i << 4) & 112) | (this.Z & (-113));
    }

    public final void a(wy wyVar) {
        this.a &= -17179869185L;
        int i = this.b;
        this.b = wyVar != null ? i | 2 : i & (-3);
        this.A = wyVar;
        int i2 = x70.h;
        this.z = x70.g;
    }

    public final void b(long j) {
        this.a |= 17179869184L;
        this.b &= -3;
        this.z = j;
        this.A = null;
    }

    public final void c(wy wyVar) {
        this.a &= -34359738369L;
        int i = this.b;
        this.b = wyVar != null ? i | 1 : i & (-2);
        this.y = wyVar;
        int i2 = x70.h;
        this.x = x70.g;
    }

    public final void d(long j) {
        this.a |= 34359738368L;
        this.b &= -2;
        this.x = j;
        this.y = null;
    }

    public final void e(wy wyVar) {
        this.a &= -137438953473L;
        int i = this.b;
        this.b = wyVar != null ? i | 128 : i & (-129);
        this.U = wyVar;
        int i2 = x70.h;
        this.T = x70.g;
    }

    public final void f(ey4 ey4Var) {
        ey4Var.a = this.a;
        ey4Var.b = this.b;
        ey4Var.p = this.p;
        ey4Var.q = this.q;
        ey4Var.r = this.r;
        ey4Var.s = this.s;
        ey4Var.t = this.t;
        ey4Var.u = this.u;
        ey4Var.v = this.v;
        ey4Var.w = this.w;
        ey4Var.c = this.c;
        ey4Var.d = this.d;
        ey4Var.e = this.e;
        ey4Var.f = this.f;
        ey4Var.g = this.g;
        ey4Var.h = this.h;
        ey4Var.i = this.i;
        ey4Var.j = this.j;
        ey4Var.k = this.k;
        ey4Var.E = this.E;
        ey4Var.H = this.H;
        ey4Var.I = this.I;
        ey4Var.J = this.J;
        ey4Var.K = this.K;
        ey4Var.L = this.L;
        ey4Var.M = this.M;
        ey4Var.N = this.N;
        ey4Var.O = this.O;
        ey4Var.P = this.P;
        ey4Var.Q = this.Q;
        ey4Var.R = this.R;
        ey4Var.S = this.S;
        ey4Var.x = this.x;
        ey4Var.y = this.y;
        ey4Var.z = this.z;
        ey4Var.A = this.A;
        ey4Var.B = this.B;
        ey4Var.C = this.C;
        ey4Var.F = this.F;
        ey4Var.G = this.G;
        ey4Var.D = this.D;
        ey4Var.l = this.l;
        ey4Var.m = this.m;
        ey4Var.n = this.n;
        ey4Var.o = this.o;
        ey4Var.T = this.T;
        ey4Var.U = this.U;
        ey4Var.V = this.V;
        ey4Var.W = this.W;
        ey4Var.X = this.X;
        ey4Var.Y = this.Y;
        ey4Var.Z = this.Z;
    }

    public final void g(ey4 ey4Var, long j, int i) {
        long j2 = j & this.a;
        if (j2 != 0) {
            if ((j2 & 8192) != 0) {
                float f = this.p;
                ey4Var.a = 8192 | ey4Var.a;
                ey4Var.p = f;
            }
            if ((j2 & Http2Stream.EMIT_BUFFER_SIZE) != 0) {
                float f2 = this.q;
                ey4Var.a = Http2Stream.EMIT_BUFFER_SIZE | ey4Var.a;
                ey4Var.q = f2;
            }
            if ((j2 & 32768) != 0) {
                float f3 = this.r;
                ey4Var.a = 32768 | ey4Var.a;
                ey4Var.r = f3;
            }
            if ((j2 & Frame.USAGE_VIDEO_ENCODE) != 0) {
                float f4 = this.s;
                ey4Var.a = Frame.USAGE_VIDEO_ENCODE | ey4Var.a;
                ey4Var.s = f4;
            }
            if ((j2 & _HeadersCommonKt.HEADER_LIMIT) != 0) {
                float f5 = this.t;
                ey4Var.a = _HeadersCommonKt.HEADER_LIMIT | ey4Var.a;
                ey4Var.t = f5;
            }
            if ((j2 & 1048576) != 0) {
                float f6 = this.u;
                ey4Var.a = 1048576 | ey4Var.a;
                ey4Var.u = f6;
            }
            if ((j2 & 131072) != 0) {
                float f7 = this.v;
                ey4Var.a = 131072 | ey4Var.a;
                ey4Var.v = f7;
            }
            if ((j2 & 524288) != 0) {
                float f8 = this.w;
                ey4Var.a = 524288 | ey4Var.a;
                ey4Var.w = f8;
            }
            if ((j2 & 1) != 0) {
                float f9 = this.c;
                ey4Var.a = 1 | ey4Var.a;
                ey4Var.c = f9;
            }
            if ((j2 & 2) != 0) {
                float f10 = this.d;
                ey4Var.a = 2 | ey4Var.a;
                ey4Var.d = f10;
            }
            if ((j2 & 4) != 0) {
                float f11 = this.e;
                ey4Var.a = 4 | ey4Var.a;
                ey4Var.e = f11;
            }
            if ((j2 & 8) != 0) {
                float f12 = this.f;
                ey4Var.a = 8 | ey4Var.a;
                ey4Var.f = f12;
            }
            if ((j2 & 16) != 0) {
                float f13 = this.g;
                ey4Var.a = 16 | ey4Var.a;
                ey4Var.g = f13;
            }
            if ((j2 & 32) != 0) {
                float f14 = this.h;
                ey4Var.a = 32 | ey4Var.a;
                ey4Var.h = f14;
            }
            if ((j2 & 64) != 0) {
                float f15 = this.i;
                ey4Var.a = 64 | ey4Var.a;
                ey4Var.i = f15;
            }
            if ((j2 & 128) != 0) {
                float f16 = this.j;
                ey4Var.a = 128 | ey4Var.a;
                ey4Var.j = f16;
            }
            if ((j2 & 256) != 0) {
                float f17 = this.k;
                ey4Var.a = 256 | ey4Var.a;
                ey4Var.k = f17;
            }
            if ((j2 & 2097152) != 0) {
                float f18 = this.H;
                ey4Var.a = 2097152 | ey4Var.a;
                ey4Var.H = f18;
            }
            if ((j2 & 4194304) != 0) {
                float f19 = this.I;
                ey4Var.a = 4194304 | ey4Var.a;
                ey4Var.I = f19;
            }
            if ((j2 & 8388608) != 0) {
                float f20 = this.J;
                ey4Var.a = 8388608 | ey4Var.a;
                ey4Var.J = f20;
            }
            if ((j2 & 16777216) != 0) {
                float f21 = this.K;
                ey4Var.a = 16777216 | ey4Var.a;
                ey4Var.K = f21;
            }
            if ((j2 & 33554432) != 0) {
                float f22 = this.L;
                ey4Var.a = 33554432 | ey4Var.a;
                ey4Var.L = f22;
            }
            if ((j2 & 67108864) != 0) {
                float f23 = this.M;
                ey4Var.a = 67108864 | ey4Var.a;
                ey4Var.M = f23;
            }
            if ((j2 & 134217728) != 0) {
                float f24 = this.N;
                ey4Var.a = 134217728 | ey4Var.a;
                ey4Var.N = f24;
            }
            if ((j2 & 268435456) != 0) {
                float f25 = this.O;
                ey4Var.a = 268435456 | ey4Var.a;
                ey4Var.O = f25;
            }
            if ((j2 & 536870912) != 0) {
                float f26 = this.P;
                ey4Var.a = 536870912 | ey4Var.a;
                ey4Var.P = f26;
            }
            if ((j2 & 1073741824) != 0) {
                float f27 = this.Q;
                ey4Var.a = 1073741824 | ey4Var.a;
                ey4Var.Q = f27;
            }
            if ((j2 & 4294967296L) != 0) {
                float f28 = this.R;
                ey4Var.a = 4294967296L | ey4Var.a;
                ey4Var.R = f28;
            }
            if ((j2 & 8589934592L) != 0) {
                ey4Var.a = 8589934592L | ey4Var.a;
            }
            if ((34359738368L & j2) != 0) {
                ey4Var.d(this.x);
            }
            if ((17179869184L & j2) != 0) {
                ey4Var.b(this.z);
            }
            if ((j2 & 68719476736L) != 0) {
                long j3 = this.B;
                ey4Var.a = 68719476736L | ey4Var.a;
                ey4Var.b &= -5;
                ey4Var.B = j3;
                ey4Var.C = null;
            }
            if ((j2 & 2147483648L) != 0) {
                boolean z = this.D;
                ey4Var.a = 2147483648L | ey4Var.a;
                ey4Var.D = z;
            }
            if ((j2 & 512) != 0) {
                float f29 = this.l;
                ey4Var.a = (512 | ey4Var.a) & (-2049);
                ey4Var.l = f29;
                ey4Var.n = Float.NaN;
            }
            if ((j2 & RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) != 0) {
                float f30 = this.m;
                ey4Var.a = (RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE | ey4Var.a) & (-4097);
                ey4Var.m = f30;
                ey4Var.o = Float.NaN;
            }
            if ((j2 & Frame.USAGE_COMPOSER_OVERLAY) != 0) {
                float f31 = this.n;
                ey4Var.a = Frame.USAGE_COMPOSER_OVERLAY | (ey4Var.a & (-513));
                ey4Var.n = f31;
                ey4Var.l = Float.NaN;
            }
            if ((j2 & 4096) != 0) {
                float f32 = this.o;
                ey4Var.a = 4096 | (ey4Var.a & (-1025));
                ey4Var.o = f32;
                ey4Var.m = Float.NaN;
            }
            if ((j2 & 137438953472L) != 0) {
                long j4 = this.T;
                ey4Var.a = 137438953472L | ey4Var.a;
                ey4Var.b &= -129;
                ey4Var.T = j4;
                ey4Var.U = null;
            }
            if ((j2 & 140737488355328L) != 0) {
                long j5 = this.X;
                ey4Var.a = 140737488355328L | ey4Var.a;
                ey4Var.X = j5;
            }
            if ((j2 & 281474976710656L) != 0) {
                long j6 = this.Y;
                ey4Var.a = 281474976710656L | ey4Var.a;
                ey4Var.Y = j6;
            }
            if ((j2 & 8796093022208L) != 0) {
                ey4Var.a = 8796093022208L | ey4Var.a;
            }
            if ((j2 & 562949953421312L) != 0) {
                ey4Var.a = 562949953421312L | ey4Var.a;
            }
            if ((131666517426176L & j2) != 0) {
                if ((274877906944L & j2) != 0) {
                    ey4Var.z(t());
                }
                if ((j2 & 70368744177664L) != 0) {
                    long j7 = this.W;
                    ey4Var.a = 70368744177664L | ey4Var.a;
                    ey4Var.W = j7;
                }
                if ((2199023255552L & j2) != 0) {
                    ey4Var.y(s());
                }
                if ((4398046511104L & j2) != 0) {
                    ey4Var.A(u());
                }
                if ((17592186044416L & j2) != 0) {
                    ey4Var.x(q());
                }
                if ((35184372088832L & j2) != 0) {
                    ey4Var.k(o());
                }
                if ((549755813888L & j2) != 0) {
                    ey4Var.l(p());
                }
                if ((j2 & 1099511627776L) != 0) {
                    ey4Var.j(n());
                }
            }
        }
        int i2 = this.b & i;
        if (i2 != 0) {
            if ((i2 & 8) != 0) {
                dn4 dn4Var = this.E;
                ey4Var.b |= 8;
                ey4Var.E = dn4Var;
            }
            if ((i2 & 16) != 0) {
                c80 c80Var = this.S;
                ey4Var.b |= 16;
                ey4Var.S = c80Var;
            }
            if ((i2 & 1) != 0) {
                ey4Var.c(this.y);
            }
            if ((i2 & 2) != 0) {
                ey4Var.a(this.A);
            }
            if ((i2 & 4) != 0) {
                ey4Var.m(this.C);
            }
            if ((i2 & 32) != 0) {
                Object obj = this.F;
                int i3 = ey4Var.b;
                ey4Var.b = obj != null ? i3 | 32 : i3 & (-33);
                ey4Var.F = obj;
            }
            if ((i2 & 64) != 0) {
                Object obj2 = this.G;
                int i4 = ey4Var.b;
                ey4Var.b = obj2 != null ? i4 | 64 : i4 & (-65);
                ey4Var.G = obj2;
            }
            if ((i2 & 128) != 0) {
                ey4Var.e(this.U);
            }
            if ((i2 & 256) != 0) {
                ey4Var.b |= 256;
            }
            if ((i2 & 512) != 0) {
                ey4Var.b |= 512;
            }
            if ((i2 & 1024) != 0) {
                i55 i55Var = this.V;
                i55Var.getClass();
                ey4Var.b |= 1024;
                ey4Var.V = i55Var;
            }
        }
    }

    public final int h(int i, ey4 ey4Var) {
        int i2 = this.b;
        int i3 = ey4Var.b;
        int i4 = i2 & i3 & i;
        int i5 = i & (i2 ^ i3);
        if (i4 == 0) {
            return i5;
        }
        if ((i4 & 1) != 0 && j42.c(this.y, ey4Var.y)) {
            i4 &= -2;
        }
        if ((i4 & 2) != 0 && j42.c(this.A, ey4Var.A)) {
            i4 &= -3;
        }
        if ((i4 & 4) != 0 && j42.c(this.C, ey4Var.C)) {
            i4 &= -5;
        }
        if ((i4 & 8) != 0 && j42.c(this.E, ey4Var.E)) {
            i4 &= -9;
        }
        if ((i4 & 16) != 0 && j42.c(this.S, ey4Var.S)) {
            i4 &= -17;
        }
        if ((i4 & 32) != 0 && j42.c(this.F, ey4Var.F)) {
            i4 &= -33;
        }
        if ((i4 & 64) != 0 && j42.c(this.G, ey4Var.G)) {
            i4 &= -65;
        }
        if ((i4 & 128) != 0 && j42.c(this.U, ey4Var.U)) {
            i4 &= -129;
        }
        if ((i4 & 256) != 0) {
            i4 &= -257;
        }
        if ((i4 & 512) != 0) {
            b65 b65Var = b65.c;
            if (b65Var.equals(b65Var)) {
                i4 &= -513;
            }
        }
        if ((i4 & 1024) != 0 && j42.c(this.V, ey4Var.V)) {
            i4 &= -1025;
        }
        return i4 | i5;
    }

    public final long i(ey4 ey4Var, long j) {
        long j2 = this.a;
        long j3 = ey4Var.a;
        long j4 = j2 & j3 & j;
        long j5 = j & (j2 ^ j3);
        if (j4 == 0) {
            return j5;
        }
        if ((1 & j4) != 0 && Float.floatToRawIntBits(this.c) == Float.floatToRawIntBits(ey4Var.c)) {
            j4 &= -2;
        }
        if ((2 & j4) != 0 && Float.floatToRawIntBits(this.d) == Float.floatToRawIntBits(ey4Var.d)) {
            j4 &= -3;
        }
        if ((4 & j4) != 0 && Float.floatToRawIntBits(this.e) == Float.floatToRawIntBits(ey4Var.e)) {
            j4 &= -5;
        }
        if ((8 & j4) != 0 && Float.floatToRawIntBits(this.f) == Float.floatToRawIntBits(ey4Var.f)) {
            j4 &= -9;
        }
        if ((16 & j4) != 0 && Float.floatToRawIntBits(this.g) == Float.floatToRawIntBits(ey4Var.g)) {
            j4 &= -17;
        }
        if ((32 & j4) != 0 && Float.floatToRawIntBits(this.h) == Float.floatToRawIntBits(ey4Var.h)) {
            j4 &= -33;
        }
        if ((64 & j4) != 0 && Float.floatToRawIntBits(this.i) == Float.floatToRawIntBits(ey4Var.i)) {
            j4 &= -65;
        }
        if ((128 & j4) != 0 && Float.floatToRawIntBits(this.j) == Float.floatToRawIntBits(ey4Var.j)) {
            j4 &= -129;
        }
        if ((256 & j4) != 0 && Float.floatToRawIntBits(this.k) == Float.floatToRawIntBits(ey4Var.k)) {
            j4 &= -257;
        }
        if ((512 & j4) != 0 && Float.floatToRawIntBits(this.l) == Float.floatToRawIntBits(ey4Var.l)) {
            j4 &= -513;
        }
        if ((RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE & j4) != 0 && Float.floatToRawIntBits(this.m) == Float.floatToRawIntBits(ey4Var.m)) {
            j4 &= -1025;
        }
        if ((Frame.USAGE_COMPOSER_OVERLAY & j4) != 0 && Float.floatToRawIntBits(this.n) == Float.floatToRawIntBits(ey4Var.n)) {
            j4 &= -2049;
        }
        if ((4096 & j4) != 0 && Float.floatToRawIntBits(this.o) == Float.floatToRawIntBits(ey4Var.o)) {
            j4 &= -4097;
        }
        if ((8192 & j4) != 0 && Float.floatToRawIntBits(this.p) == Float.floatToRawIntBits(ey4Var.p)) {
            j4 &= -8193;
        }
        if ((Http2Stream.EMIT_BUFFER_SIZE & j4) != 0 && Float.floatToRawIntBits(this.q) == Float.floatToRawIntBits(ey4Var.q)) {
            j4 &= -16385;
        }
        if ((32768 & j4) != 0 && Float.floatToRawIntBits(this.r) == Float.floatToRawIntBits(ey4Var.r)) {
            j4 &= -32769;
        }
        if ((Frame.USAGE_VIDEO_ENCODE & j4) != 0 && Float.floatToRawIntBits(this.s) == Float.floatToRawIntBits(ey4Var.s)) {
            j4 &= -65537;
        }
        if ((131072 & j4) != 0 && Float.floatToRawIntBits(this.v) == Float.floatToRawIntBits(ey4Var.v)) {
            j4 &= -131073;
        }
        if ((_HeadersCommonKt.HEADER_LIMIT & j4) != 0 && Float.floatToRawIntBits(this.t) == Float.floatToRawIntBits(ey4Var.t)) {
            j4 &= -262145;
        }
        if ((524288 & j4) != 0 && Float.floatToRawIntBits(this.w) == Float.floatToRawIntBits(ey4Var.w)) {
            j4 &= -524289;
        }
        if ((1048576 & j4) != 0 && Float.floatToRawIntBits(this.u) == Float.floatToRawIntBits(ey4Var.u)) {
            j4 &= -1048577;
        }
        if ((2097152 & j4) != 0 && Float.floatToRawIntBits(this.H) == Float.floatToRawIntBits(ey4Var.H)) {
            j4 &= -2097153;
        }
        if ((4194304 & j4) != 0 && Float.floatToRawIntBits(this.I) == Float.floatToRawIntBits(ey4Var.I)) {
            j4 &= -4194305;
        }
        if ((8388608 & j4) != 0 && Float.floatToRawIntBits(this.J) == Float.floatToRawIntBits(ey4Var.J)) {
            j4 &= -8388609;
        }
        if ((16777216 & j4) != 0 && Float.floatToRawIntBits(this.K) == Float.floatToRawIntBits(ey4Var.K)) {
            j4 &= -16777217;
        }
        if ((33554432 & j4) != 0 && Float.floatToRawIntBits(this.L) == Float.floatToRawIntBits(ey4Var.L)) {
            j4 &= -33554433;
        }
        if ((67108864 & j4) != 0 && Float.floatToRawIntBits(this.M) == Float.floatToRawIntBits(ey4Var.M)) {
            j4 &= -67108865;
        }
        if ((134217728 & j4) != 0 && Float.floatToRawIntBits(this.N) == Float.floatToRawIntBits(ey4Var.N)) {
            j4 &= -134217729;
        }
        if ((268435456 & j4) != 0 && Float.floatToRawIntBits(this.O) == Float.floatToRawIntBits(ey4Var.O)) {
            j4 &= -268435457;
        }
        if ((536870912 & j4) != 0 && Float.floatToRawIntBits(this.P) == Float.floatToRawIntBits(ey4Var.P)) {
            j4 &= -536870913;
        }
        if ((1073741824 & j4) != 0 && Float.floatToRawIntBits(this.Q) == Float.floatToRawIntBits(ey4Var.Q)) {
            j4 &= -1073741825;
        }
        if ((2147483648L & j4) != 0 && this.D == ey4Var.D) {
            j4 &= -2147483649L;
        }
        if ((4294967296L & j4) != 0 && Float.floatToRawIntBits(this.R) == Float.floatToRawIntBits(ey4Var.R)) {
            j4 &= -4294967297L;
        }
        if ((8589934592L & j4) != 0 && Float.floatToRawIntBits(1.0f) == Float.floatToRawIntBits(1.0f)) {
            j4 &= -8589934593L;
        }
        if ((17179869184L & j4) != 0) {
            long j6 = this.z;
            long j7 = ey4Var.z;
            int i = x70.h;
            if (zc5.a(j6, j7)) {
                j4 &= -17179869185L;
            }
        }
        if ((34359738368L & j4) != 0) {
            long j8 = this.x;
            long j9 = ey4Var.x;
            int i2 = x70.h;
            if (zc5.a(j8, j9)) {
                j4 &= -34359738369L;
            }
        }
        if ((68719476736L & j4) != 0) {
            long j10 = this.B;
            long j11 = ey4Var.B;
            int i3 = x70.h;
            if (zc5.a(j10, j11)) {
                j4 &= -68719476737L;
            }
        }
        if ((137438953472L & j4) != 0) {
            long j12 = this.T;
            long j13 = ey4Var.T;
            int i4 = x70.h;
            if (zc5.a(j12, j13)) {
                j4 &= -137438953473L;
            }
        }
        if ((274877906944L & j4) != 0 && t().equals(ey4Var.t())) {
            j4 &= -274877906945L;
        }
        if ((549755813888L & j4) != 0 && j42.c(p(), ey4Var.p())) {
            j4 &= -549755813889L;
        }
        if ((1099511627776L & j4) != 0 && n() == ey4Var.n()) {
            j4 &= -1099511627777L;
        }
        if ((2199023255552L & j4) != 0 && s() == ey4Var.s()) {
            j4 &= -2199023255553L;
        }
        if ((4398046511104L & j4) != 0 && u() == ey4Var.u()) {
            j4 &= -4398046511105L;
        }
        if ((8796093022208L & j4) != 0 && Float.compare(Float.NaN, Float.NaN) == 0) {
            j4 &= -8796093022209L;
        }
        if ((17592186044416L & j4) != 0 && q() == ey4Var.q()) {
            j4 &= -17592186044417L;
        }
        if ((35184372088832L & j4) != 0 && o() == ey4Var.o()) {
            j4 &= -35184372088833L;
        }
        if ((70368744177664L & j4) != 0 && p65.a(this.W, ey4Var.W)) {
            j4 &= -70368744177665L;
        }
        if ((140737488355328L & j4) != 0 && p65.a(this.X, ey4Var.X)) {
            j4 &= -140737488355329L;
        }
        if ((281474976710656L & j4) != 0 && p65.a(this.Y, ey4Var.Y)) {
            j4 &= -281474976710657L;
        }
        if ((562949953421312L & j4) != 0) {
            j4 &= -562949953421313L;
        }
        return j4 | j5;
    }

    public final void j(int i) {
        this.a |= 1099511627776L;
        this.Z = ((i | 2) & 3) | (this.Z & (-4));
    }

    public final void k(int i) {
        this.a |= 35184372088832L;
        this.Z = ((i << 10) & 15360) | (this.Z & (-15361));
    }

    public final void l(qk1 qk1Var) {
        this.a |= 549755813888L;
        this.Z = ((qk1Var.I << 17) & 134086656) | (this.Z & (-134086657));
    }

    public final void m(wy wyVar) {
        this.a &= -68719476737L;
        int i = this.b;
        this.b = wyVar != null ? i | 4 : i & (-5);
        this.C = wyVar;
        int i2 = x70.h;
        this.B = x70.g;
    }

    public final int n() {
        return ((this.a & 1099511627776L) == 0 || (this.Z & 1) != 1) ? 0 : 1;
    }

    public final int o() {
        if ((this.a & 35184372088832L) == 0) {
            return 0;
        }
        int i = ((this.Z & 15360) >> 10) & 15;
        if (i != 0 && i != 1 && i != 2 && i != 65535) {
            r02.a("The given value=" + i + " is not recognized by FontSynthesis.");
        }
        return i;
    }

    public final qk1 p() {
        if ((this.a & 549755813888L) != 0) {
            return new qk1((this.Z & 134086656) >> 17);
        }
        qk1 qk1Var = qk1.J;
        return qk1.M;
    }

    public final int q() {
        if ((this.a & 17592186044416L) == 0) {
            return 0;
        }
        int i = (this.Z & 768) >> 8;
        if (i >= 0 && i < 3) {
            return i;
        }
        r02.a("The given value=" + i + " is not recognized by Hyphens.");
        return i;
    }

    public final int r() {
        return fy4.e(this.b) | fy4.g(this.a);
    }

    public final int s() {
        if ((this.a & 2199023255552L) == 0) {
            return 0;
        }
        int i = (this.Z & 28) >> 2;
        if (i >= 0 && i < 7) {
            return i;
        }
        r02.a("The given value=" + i + " is not recognized by TextAlign.");
        return i;
    }

    public final m35 t() {
        int i;
        return ((this.a & 274877906944L) == 0 || (i = ((this.Z & 114688) >> 14) & 3) == 0) ? m35.b : i != 1 ? i != 2 ? new m35(i) : m35.d : m35.c;
    }

    public final int u() {
        if ((this.a & 4398046511104L) == 0) {
            return 0;
        }
        int i = (this.Z & 112) >> 4;
        if (i >= 0 && i < 6) {
            return i;
        }
        r02.a("The given value=" + i + " is not recognized by TextDirection.");
        return i;
    }

    public final boolean v(byte b) {
        return b < 50 && ((1 << b) & this.a) != 0;
    }

    public final boolean w(int i) {
        return i >= 50 && (this.b & (1 << (i - 50))) != 0;
    }

    public final void x(int i) {
        this.a |= 17592186044416L;
        this.Z = ((i << 8) & 768) | (this.Z & (-769));
    }

    public final void y(int i) {
        this.a |= 2199023255552L;
        this.Z = ((i << 2) & 28) | (this.Z & (-29));
    }

    public final void z(m35 m35Var) {
        this.a |= 274877906944L;
        this.Z = (((m35Var.a | 4) << 14) & 114688) | (this.Z & (-114689));
    }
}
