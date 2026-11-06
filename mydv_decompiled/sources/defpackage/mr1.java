package defpackage;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class mr1 implements oh3 {
    public jr1 I;
    public final ir1 J;
    public final AndroidComposeView K;
    public hn1 L;
    public rm1 M;
    public boolean O;
    public float[] Q;
    public boolean R;
    public int V;
    public yg3 X;
    public boolean Y;
    public boolean Z;
    public boolean b0;
    public long N = 9223372034707292159L;
    public final float[] P = nw2.a();
    public iu0 S = mu0.a();
    public da2 T = da2.I;
    public final r10 U = new r10();
    public long W = r95.b;
    public boolean a0 = true;
    public final i9 c0 = new i9(this, 9);

    public mr1(jr1 jr1Var, ir1 ir1Var, AndroidComposeView androidComposeView, hn1 hn1Var, rm1 rm1Var) {
        this.I = jr1Var;
        this.J = ir1Var;
        this.K = androidComposeView;
        this.L = hn1Var;
        this.M = rm1Var;
    }

    public final float[] a() {
        float[] fArr = this.Q;
        if (fArr == null) {
            fArr = nw2.a();
            this.Q = fArr;
        }
        if (this.Z) {
            this.Z = false;
            float[] b = b();
            if (this.a0) {
                return b;
            }
            if (!sv2.F(b, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    public final float[] b() {
        boolean z = this.Y;
        float[] fArr = this.P;
        if (z) {
            jr1 jr1Var = this.I;
            long j = jr1Var.z;
            lr1 lr1Var = jr1Var.a;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = ad4.q(ut0.b0(this.N));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float A = lr1Var.A();
            float u = lr1Var.u();
            float C = lr1Var.C();
            float m = lr1Var.m();
            float o = lr1Var.o();
            float b = lr1Var.b();
            float J = lr1Var.J();
            double d = C * 0.017453292519943295d;
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f = -sin;
            float f2 = (u * cos) - (0.0f * sin);
            float f3 = (0.0f * cos) + (u * sin);
            double d2 = m * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d2);
            float cos2 = (float) Math.cos(d2);
            float f4 = -sin2;
            float f5 = sin * sin2;
            float f6 = sin * cos2;
            float f7 = cos * sin2;
            float f8 = cos * cos2;
            float f9 = (f3 * sin2) + (A * cos2);
            float f10 = (f3 * cos2) + ((-A) * sin2);
            double d3 = o * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d3);
            float cos3 = (float) Math.cos(d3);
            float f11 = -sin3;
            float f12 = (cos3 * f5) + (f11 * cos2);
            float f13 = ((f5 * sin3) + (cos2 * cos3)) * b;
            float f14 = sin3 * cos * b;
            float f15 = ((sin3 * f6) + (cos3 * f4)) * b;
            float f16 = f12 * J;
            float f17 = cos * cos3 * J;
            float f18 = ((cos3 * f6) + (f11 * f4)) * J;
            float f19 = f7 * 1.0f;
            float f20 = f * 1.0f;
            float f21 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f13;
                fArr[1] = f14;
                fArr[2] = f15;
                fArr[3] = 0.0f;
                fArr[4] = f16;
                fArr[5] = f17;
                fArr[6] = f18;
                fArr[7] = 0.0f;
                fArr[8] = f19;
                fArr[9] = f20;
                fArr[10] = f21;
                fArr[11] = 0.0f;
                float f22 = -intBitsToFloat;
                fArr[12] = ((f13 * f22) - (intBitsToFloat2 * f16)) + f9 + intBitsToFloat;
                fArr[13] = ((f14 * f22) - (intBitsToFloat2 * f17)) + f2 + intBitsToFloat2;
                fArr[14] = ((f22 * f15) - (intBitsToFloat2 * f18)) + f10;
                fArr[15] = 1.0f;
            }
            this.Y = false;
            this.a0 = sp0.X(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.R || this.O) {
            return;
        }
        AndroidComposeView androidComposeView = this.K;
        androidComposeView.invalidate();
        if (true != this.R) {
            this.R = true;
            androidComposeView.notifyLayerIsDirty$ui(this, true);
        }
    }

    public final void d(long j) {
        AndroidComposeView androidComposeView = this.K;
        if (androidComposeView.isArrEnabled$ui()) {
            androidComposeView.voteFrameRate(-4.0f);
        }
        jr1 jr1Var = this.I;
        if (!r22.a(jr1Var.t, j)) {
            jr1Var.t = j;
            jr1Var.a.l((int) (j >> 32), (int) (j & 4294967295L), jr1Var.u);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ed.f(androidComposeView);
        } else {
            androidComposeView.invalidate();
        }
    }

    public final void e(long j) {
        if (z22.b(j, this.N)) {
            return;
        }
        AndroidComposeView androidComposeView = this.K;
        if (androidComposeView.isArrEnabled$ui()) {
            androidComposeView.voteFrameRate(-4.0f);
        }
        this.N = j;
        c();
    }

    public final void f() {
        AndroidComposeView androidComposeView = this.K;
        androidComposeView.isArrEnabled$ui();
        if (this.R) {
            if (!r95.a(this.W, r95.b) && !z22.b(this.I.u, this.N)) {
                jr1 jr1Var = this.I;
                float intBitsToFloat = Float.intBitsToFloat((int) (this.W >> 32)) * ((int) (this.N >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (this.W & 4294967295L)) * ((int) (this.N & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                if (!pd3.c(jr1Var.z, floatToRawIntBits)) {
                    jr1Var.z = floatToRawIntBits;
                    jr1Var.a.p(floatToRawIntBits);
                }
            }
            this.I.e(this.S, this.T, this.N, this.c0);
            if (this.R) {
                this.R = false;
                androidComposeView.notifyLayerIsDirty$ui(this, false);
            }
        }
    }
}
