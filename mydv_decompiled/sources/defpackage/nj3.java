package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class nj3 {
    public static final mj3 a;
    public static final zi3 b;

    static {
        mj3 mj3Var = new mj3((byte) 0);
        a = mj3Var;
        b = new zi3(0, 0, 0, pg3.J, 0, 0, 0, q8.A0, new lj3(), i42.H(l91.I), mj3Var, eh0.b(0, 0, 0, 0, 15));
    }

    public static final long a(zi3 zi3Var, int i) {
        long j = (((i * (zi3Var.b + r0)) + (-zi3Var.f)) + zi3Var.d) - zi3Var.c;
        int g = (int) (zi3Var.e == pg3.J ? zi3Var.g() >> 32 : zi3Var.g() & 4294967295L);
        zi3Var.n.getClass();
        long r = j - (g - ut0.r(0, 0, g));
        if (r < 0) {
            return 0L;
        }
        return r;
    }

    public static final is0 b(final int i, final rm1 rm1Var, fe0 fe0Var, int i2) {
        Object[] objArr = new Object[0];
        da daVar = is0.I;
        boolean z = true;
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && ((go1) fe0Var).e(i)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && ((go1) fe0Var).d(0.0f)) || (i2 & 48) == 32);
        if ((((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256 || !((go1) fe0Var).g(rm1Var)) && (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 256) {
            z = false;
        }
        boolean z3 = z2 | z;
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        if (z3 || Q == de0.a) {
            Q = new rm1() { // from class: kj3
                @Override // defpackage.rm1
                public final Object invoke() {
                    return new is0(i, 0.0f, rm1Var);
                }
            };
            go1Var.o0(Q);
        }
        is0 is0Var = (is0) ut0.O(objArr, daVar, (rm1) Q, go1Var, 0);
        is0Var.H.setValue(rm1Var);
        return is0Var;
    }
}
