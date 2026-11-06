package defpackage;

import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.work.OverwritingInputMerger;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ky5 {
    public final String a;
    public sx5 b;
    public final String c;
    public final String d;
    public dp0 e;
    public final dp0 f;
    public long g;
    public long h;
    public long i;
    public ch0 j;
    public final int k;
    public ut l;
    public long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public final ug3 r;
    public final int s;
    public final int t;
    public long u;
    public int v;
    public final int w;
    public String x;
    public final Boolean y;
    public static final String z = fr2.h("WorkSpec");
    public static final s83 A = new s83(28);

    public /* synthetic */ ky5(String str, sx5 sx5Var, String str2, String str3, dp0 dp0Var, dp0 dp0Var2, long j, long j2, long j3, ch0 ch0Var, int i, ut utVar, long j4, long j5, long j6, long j7, boolean z2, ug3 ug3Var, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        this(str, (i5 & 2) != 0 ? sx5.I : sx5Var, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? dp0.b : dp0Var, (i5 & 32) != 0 ? dp0.b : dp0Var2, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? ch0.j : ch0Var, (i5 & 1024) != 0 ? 0 : i, (i5 & 2048) != 0 ? ut.I : utVar, (i5 & 4096) != 0 ? 30000L : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z2, (131072 & i5) != 0 ? ug3.I : ug3Var, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? Boolean.FALSE : bool);
    }

    public static ky5 b(ky5 ky5Var, String str, sx5 sx5Var, String str2, dp0 dp0Var, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        String str3 = (i5 & 1) != 0 ? ky5Var.a : str;
        sx5 sx5Var2 = (i5 & 2) != 0 ? ky5Var.b : sx5Var;
        String str4 = (i5 & 4) != 0 ? ky5Var.c : str2;
        String str5 = ky5Var.d;
        dp0 dp0Var2 = (i5 & 16) != 0 ? ky5Var.e : dp0Var;
        dp0 dp0Var3 = ky5Var.f;
        long j3 = ky5Var.g;
        long j4 = ky5Var.h;
        long j5 = ky5Var.i;
        ch0 ch0Var = ky5Var.j;
        int i6 = (i5 & 1024) != 0 ? ky5Var.k : i;
        ut utVar = ky5Var.l;
        long j6 = ky5Var.m;
        long j7 = (i5 & 8192) != 0 ? ky5Var.n : j;
        long j8 = ky5Var.o;
        long j9 = ky5Var.p;
        boolean z2 = ky5Var.q;
        ug3 ug3Var = ky5Var.r;
        int i7 = (i5 & 262144) != 0 ? ky5Var.s : i2;
        int i8 = (i5 & 524288) != 0 ? ky5Var.t : i3;
        long j10 = (i5 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? ky5Var.u : j2;
        int i9 = (i5 & 2097152) != 0 ? ky5Var.v : i4;
        int i10 = ky5Var.w;
        String str6 = ky5Var.x;
        Boolean bool = ky5Var.y;
        str3.getClass();
        sx5Var2.getClass();
        str4.getClass();
        str5.getClass();
        dp0Var2.getClass();
        dp0Var3.getClass();
        ch0Var.getClass();
        utVar.getClass();
        ug3Var.getClass();
        return new ky5(str3, sx5Var2, str4, str5, dp0Var2, dp0Var3, j3, j4, j5, ch0Var, i6, utVar, j6, j7, j8, j9, z2, ug3Var, i7, i8, j10, i9, i10, str6, bool);
    }

    public final long a() {
        return kb4.j(this.b == sx5.I && this.k > 0, this.k, this.l, this.m, this.n, this.s, c(), this.g, this.i, this.h, this.u);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky5)) {
            return false;
        }
        ky5 ky5Var = (ky5) obj;
        return j42.c(this.a, ky5Var.a) && this.b == ky5Var.b && j42.c(this.c, ky5Var.c) && j42.c(this.d, ky5Var.d) && j42.c(this.e, ky5Var.e) && j42.c(this.f, ky5Var.f) && this.g == ky5Var.g && this.h == ky5Var.h && this.i == ky5Var.i && j42.c(this.j, ky5Var.j) && this.k == ky5Var.k && this.l == ky5Var.l && this.m == ky5Var.m && this.n == ky5Var.n && this.o == ky5Var.o && this.p == ky5Var.p && this.q == ky5Var.q && this.r == ky5Var.r && this.s == ky5Var.s && this.t == ky5Var.t && this.u == ky5Var.u && this.v == ky5Var.v && this.w == ky5Var.w && j42.c(this.x, ky5Var.x) && j42.c(this.y, ky5Var.y);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + hf1.n(hf1.n((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31;
        long j = this.g;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.h;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.i;
        int hashCode2 = (this.l.hashCode() + ((((this.j.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.k) * 31)) * 31;
        long j4 = this.m;
        int i3 = (hashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.n;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.o;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.p;
        int hashCode3 = (((((this.r.hashCode() + ((((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.q ? 1231 : 1237)) * 31)) * 31) + this.s) * 31) + this.t) * 31;
        long j8 = this.u;
        int i6 = (((((hashCode3 + ((int) ((j8 >>> 32) ^ j8))) * 31) + this.v) * 31) + this.w) * 31;
        String str = this.x;
        int hashCode4 = (i6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.y;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "{WorkSpec: " + this.a + '}';
    }

    public ky5(String str, sx5 sx5Var, String str2, String str3, dp0 dp0Var, dp0 dp0Var2, long j, long j2, long j3, ch0 ch0Var, int i, ut utVar, long j4, long j5, long j6, long j7, boolean z2, ug3 ug3Var, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        str.getClass();
        sx5Var.getClass();
        str2.getClass();
        str3.getClass();
        dp0Var.getClass();
        dp0Var2.getClass();
        ch0Var.getClass();
        utVar.getClass();
        ug3Var.getClass();
        this.a = str;
        this.b = sx5Var;
        this.c = str2;
        this.d = str3;
        this.e = dp0Var;
        this.f = dp0Var2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = ch0Var;
        this.k = i;
        this.l = utVar;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z2;
        this.r = ug3Var;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str4;
        this.y = bool;
    }
}
