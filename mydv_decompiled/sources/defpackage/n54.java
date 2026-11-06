package defpackage;

import androidx.media3.exoplayer.source.ProgressiveMediaSource;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class n54 implements iu0 {
    public int I;
    public float J = 1.0f;
    public float K = 1.0f;
    public float L = 1.0f;
    public float M;
    public float N;
    public float O;
    public long P;
    public long Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public long V;
    public dn4 W;
    public boolean X;
    public long Y;
    public w92 Z;
    public iu0 a0;
    public da2 b0;
    public c80 c0;
    public byte d0;
    public yg3 e0;

    public n54() {
        long j = nr1.a;
        this.P = j;
        this.Q = j;
        this.U = 8.0f;
        this.V = r95.b;
        this.W = mw2.j;
        this.Y = 9205357640488583168L;
        this.Z = w92.a;
        this.a0 = mu0.a();
        this.b0 = da2.I;
        this.d0 = (byte) 3;
    }

    @Override // defpackage.iu0
    public final long B(float f) {
        return hf1.g(H(f), this);
    }

    @Override // defpackage.iu0
    public final float F(int i) {
        return i / this.a0.getDensity();
    }

    @Override // defpackage.iu0
    public final float H(float f) {
        return f / this.a0.getDensity();
    }

    @Override // defpackage.iu0
    public final float L() {
        return this.a0.L();
    }

    @Override // defpackage.iu0
    public final float P(float f) {
        return this.a0.getDensity() * f;
    }

    @Override // defpackage.iu0
    public final /* synthetic */ int X(float f) {
        return r7.b(f, this);
    }

    public final void a() {
        l(1.0f);
        o(1.0f);
        b(1.0f);
        w(0.0f);
        y(0.0f);
        p(0.0f);
        long j = nr1.a;
        d(j);
        t(j);
        h(0.0f);
        i(0.0f);
        j(0.0f);
        if (this.U != 8.0f) {
            this.I |= 2048;
            this.U = 8.0f;
        }
        u(r95.b);
        s(mw2.j);
        f(false);
        g(null);
        if (this.d0 != 3) {
            this.I |= 524288;
            this.d0 = (byte) 3;
        }
        w92 w92Var = w92.a;
        if (!j42.c(this.Z, w92Var)) {
            this.I |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            this.Z = w92Var;
        }
        this.Y = 9205357640488583168L;
        this.e0 = null;
        this.I = 0;
    }

    public final void b(float f) {
        if (this.L == f) {
            return;
        }
        this.I |= 4;
        this.L = f;
    }

    @Override // defpackage.iu0
    public final /* synthetic */ long c0(long j) {
        return r7.e(j, this);
    }

    public final void d(long j) {
        long j2 = this.P;
        int i = x70.h;
        if (zc5.a(j2, j)) {
            return;
        }
        this.I |= 64;
        this.P = j;
    }

    public final void f(boolean z) {
        if (this.X != z) {
            this.I |= 16384;
            this.X = z;
        }
    }

    @Override // defpackage.iu0
    public final /* synthetic */ float f0(long j) {
        return r7.d(j, this);
    }

    public final void g(c80 c80Var) {
        if (j42.c(this.c0, c80Var)) {
            return;
        }
        this.I |= 262144;
        this.c0 = c80Var;
    }

    @Override // defpackage.iu0
    public final float getDensity() {
        return this.a0.getDensity();
    }

    public final void h(float f) {
        if (this.R == f) {
            return;
        }
        this.I |= 256;
        this.R = f;
    }

    public final void i(float f) {
        if (this.S == f) {
            return;
        }
        this.I |= 512;
        this.S = f;
    }

    public final void j(float f) {
        if (this.T == f) {
            return;
        }
        this.I |= 1024;
        this.T = f;
    }

    @Override // defpackage.iu0
    public final /* synthetic */ long k(long j) {
        return r7.c(j, this);
    }

    public final void l(float f) {
        if (this.J == f) {
            return;
        }
        this.I |= 1;
        this.J = f;
    }

    public final void o(float f) {
        if (this.K == f) {
            return;
        }
        this.I |= 2;
        this.K = f;
    }

    public final void p(float f) {
        if (this.O == f) {
            return;
        }
        this.I |= 32;
        this.O = f;
    }

    @Override // defpackage.iu0
    public final /* synthetic */ float q(long j) {
        return hf1.f(j, this);
    }

    public final void s(dn4 dn4Var) {
        if (j42.c(this.W, dn4Var)) {
            return;
        }
        this.I |= 8192;
        this.W = dn4Var;
    }

    public final void t(long j) {
        long j2 = this.Q;
        int i = x70.h;
        if (zc5.a(j2, j)) {
            return;
        }
        this.I |= 128;
        this.Q = j;
    }

    public final void u(long j) {
        if (r95.a(this.V, j)) {
            return;
        }
        this.I |= 4096;
        this.V = j;
    }

    public final void w(float f) {
        if (this.M == f) {
            return;
        }
        this.I |= 8;
        this.M = f;
    }

    public final void y(float f) {
        if (this.N == f) {
            return;
        }
        this.I |= 16;
        this.N = f;
    }
}
