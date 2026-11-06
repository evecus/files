package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ld4 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ float J;
    public final /* synthetic */ float K;
    public final /* synthetic */ Object L;

    public /* synthetic */ ld4(float f, tm1 tm1Var, float f2) {
        this.I = (byte) 2;
        this.J = f;
        this.L = tm1Var;
        this.K = f2;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.I;
        p91 p91Var = p91.I;
        float f = this.K;
        Object obj4 = this.L;
        float f2 = this.J;
        switch (b) {
            case 0:
                ww2 ww2Var = (ww2) obj;
                pw2 pw2Var = (pw2) obj2;
                dh0 dh0Var = (dh0) obj3;
                ww2Var.getClass();
                pw2Var.getClass();
                int f3 = eh0.f(ww2Var.X(vt0.G(f2, f, ((Number) ((cw4) obj4).getValue()).floatValue())), dh0Var.a);
                bn3 u = pw2Var.u(dh0.a(dh0Var.a, 0, 0, f3, f3, 3));
                return ww2Var.A(u.I, f3, p91Var, new b2(u, (byte) 7));
            case 1:
                ww2 ww2Var2 = (ww2) obj;
                pw2 pw2Var2 = (pw2) obj2;
                dh0 dh0Var2 = (dh0) obj3;
                ww2Var2.getClass();
                pw2Var2.getClass();
                int X = ww2Var2.X(vt0.G(f2, f, ((Number) ((cw4) obj4).getValue()).floatValue()));
                int g = eh0.g(X, dh0Var2.a);
                int f4 = eh0.f(X, dh0Var2.a);
                if (!((f4 >= 0) & (g >= 0))) {
                    s02.a("width and height must be >= 0");
                }
                return ww2Var2.A(g, f4, p91Var, new b2(pw2Var2.u(eh0.h(g, g, f4, f4)), (byte) 8));
            default:
                tm1 tm1Var = (tm1) obj4;
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var = (go1) fe0Var;
                if (go1Var.T(intValue & 1, (intValue & 17) != 16)) {
                    l13 G0 = i42.G0(i13.a, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                    ba0 a = z90.a(i42.d, q8.V, go1Var, 0);
                    long j = go1Var.T;
                    int i = (int) (j ^ (j >>> 32));
                    am3 m = go1Var.m();
                    l13 x0 = i42.x0(go1Var, G0);
                    xd0.c.getClass();
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(wa2.A0);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, q8.c0, a);
                    qi4.k(go1Var, q8.b0, m);
                    qi4.k(go1Var, q8.d0, Integer.valueOf(i));
                    qi4.j(go1Var);
                    qi4.k(go1Var, q8.a0, x0);
                    lq2.e(12.0f, "倍速", 54, go1Var, 0);
                    List list = on5.c;
                    Float valueOf = Float.valueOf(f2);
                    Object Q = go1Var.Q();
                    if (Q == de0.a) {
                        Q = new fl5((byte) 0);
                        go1Var.o0(Q);
                    }
                    lq2.g(list, valueOf, (hn1) Q, tm1Var, null, null, this.K, false, null, go1Var, RendererCapabilities.DECODER_SUPPORT_MASK, 432);
                    go1Var.q(true);
                } else {
                    go1Var.W();
                }
                return wd5.a;
        }
    }

    public /* synthetic */ ld4(float f, float f2, cw4 cw4Var, byte b) {
        this.I = b;
        this.J = f;
        this.K = f2;
        this.L = cw4Var;
    }
}
