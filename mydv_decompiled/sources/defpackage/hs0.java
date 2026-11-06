package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class hs0 implements a93 {
    public final is0 I;

    public hs0(is0 is0Var, da2 da2Var) {
        this.I = is0Var;
    }

    @Override // defpackage.a93
    public final long C(int i, long j) {
        is0 is0Var = this.I;
        bj3 bj3Var = is0Var.d;
        if (i != 1 || Math.abs(bj3Var.c.h()) <= 1.0E-6d) {
            return 0L;
        }
        int i2 = (int) (j & 4294967295L);
        if (Math.abs(Float.intBitsToFloat(i2)) <= 0.0f) {
            return 0L;
        }
        zi3 k = is0Var.k();
        float h = bj3Var.c.h() * is0Var.m();
        float f = ((k.b + k.c) * (-Math.signum(bj3Var.c.h()))) + h;
        if (bj3Var.c.h() > 0.0f) {
            h = f;
            f = h;
        }
        float f2 = -is0Var.k.e(-ut0.q(Float.intBitsToFloat(i2), h, f));
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    @Override // defpackage.a93
    public final long V(int i, long j, long j2) {
        if (i != 2 || Float.intBitsToFloat((int) (4294967295L & j2)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // defpackage.a93
    public final Object g0(long j, long j2, fj0 fj0Var) {
        return ji5.a(ji5.b(j2, 0.0f, 0.0f, 2));
    }

    @Override // defpackage.a93
    public final /* synthetic */ Object w(long j, fj0 fj0Var) {
        return i82.v();
    }
}
