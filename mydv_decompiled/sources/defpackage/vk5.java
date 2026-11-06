package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vk5 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ float J;
    public final /* synthetic */ Object K;

    public /* synthetic */ vk5(hv4 hv4Var, float f) {
        this.I = (byte) 3;
        this.K = hv4Var;
        this.J = f;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.I;
        float f = this.J;
        wd5 wd5Var = wd5.a;
        jp jpVar = de0.a;
        byte b2 = 16;
        Object obj4 = this.K;
        byte b3 = 1;
        switch (b) {
            case 0:
                tm1 tm1Var = (tm1) obj4;
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var = (go1) fe0Var;
                if (go1Var.T(intValue & 1, (intValue & 17) != 16)) {
                    Locale locale = Locale.getDefault();
                    float f2 = this.J;
                    String format = String.format(locale, "%.1fx", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
                    z60 z60Var = new z60(0.5f, 2.0f);
                    boolean g = go1Var.g(tm1Var);
                    Object Q = go1Var.Q();
                    if (g || Q == jpVar) {
                        Q = new l00(tm1Var, b2);
                        go1Var.o0(Q);
                    }
                    lq2.h("垂直间距", format, f2, z60Var, 14, (tm1) Q, 0.1f, 0.2f, null, go1Var, 14180358, 256);
                } else {
                    go1Var.W();
                }
                return wd5Var;
            case 1:
                tm1 tm1Var2 = (tm1) obj4;
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var2 = (go1) fe0Var2;
                if (go1Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Locale locale2 = Locale.getDefault();
                    float f3 = this.J;
                    String format2 = String.format(locale2, "%.1fx", Arrays.copyOf(new Object[]{Float.valueOf(f3)}, 1));
                    z60 z60Var2 = new z60(0.5f, 2.0f);
                    boolean g2 = go1Var2.g(tm1Var2);
                    Object Q2 = go1Var2.Q();
                    if (g2 || Q2 == jpVar) {
                        Q2 = new l00(tm1Var2, (byte) 18);
                        go1Var2.o0(Q2);
                    }
                    lq2.h("水平间距", format2, f3, z60Var2, 14, (tm1) Q2, 0.1f, 0.2f, null, go1Var2, 14180358, 256);
                } else {
                    go1Var2.W();
                }
                return wd5Var;
            case 2:
                tm1 tm1Var3 = (tm1) obj4;
                fe0 fe0Var3 = (fe0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var3 = (go1) fe0Var3;
                if (go1Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    ba0 a = z90.a(i42.d, q8.V, go1Var3, 0);
                    long j = go1Var3.T;
                    int i = (int) (j ^ (j >>> 32));
                    am3 m = go1Var3.m();
                    l13 x0 = i42.x0(go1Var3, i13.a);
                    xd0.c.getClass();
                    go1Var3.h0();
                    if (go1Var3.S) {
                        go1Var3.l(wa2.A0);
                    } else {
                        go1Var3.r0();
                    }
                    qi4.k(go1Var3, q8.c0, a);
                    qi4.k(go1Var3, q8.b0, m);
                    qi4.k(go1Var3, q8.d0, Integer.valueOf(i));
                    qi4.j(go1Var3);
                    qi4.k(go1Var3, q8.a0, x0);
                    lq2.e(12.0f, "倍速", 54, go1Var3, 0);
                    List list = on5.c;
                    Float valueOf = Float.valueOf(f);
                    Object Q3 = go1Var3.Q();
                    if (Q3 == jpVar) {
                        Q3 = new fl5(b3);
                        go1Var3.o0(Q3);
                    }
                    lq2.g(list, valueOf, (hn1) Q3, tm1Var3, null, null, 0.0f, false, null, go1Var3, RendererCapabilities.DECODER_SUPPORT_MASK, 496);
                    go1Var3.q(true);
                } else {
                    go1Var3.W();
                }
                return wd5Var;
            default:
                hv4 hv4Var = (hv4) obj4;
                ww2 ww2Var = (ww2) obj;
                pw2 pw2Var = (pw2) obj2;
                dh0 dh0Var = (dh0) obj3;
                ww2Var.getClass();
                pw2Var.getClass();
                int h = dh0.h(dh0Var.a);
                long j2 = dh0Var.a;
                int g3 = dh0.g(j2);
                boolean d = dh0.d(j2);
                p91 p91Var = p91.I;
                if (!d || !dh0.c(j2)) {
                    bn3 u = pw2Var.u(j2);
                    return ww2Var.A(u.I, u.J, p91Var, new b2(u, (byte) 5));
                }
                int X = ww2Var.X(((r11) hv4Var.e.getValue()).I);
                int X2 = ww2Var.X(16.0f) + p9.h(h, g3, hv4Var.b.h(), 0, X).d;
                int max = (g3 - Math.max(X, ww2Var.X(f))) - X2;
                return max < ww2Var.X(24.0f) ? ww2Var.A(h, g3, p91Var, new c22((byte) 22)) : ww2Var.A(h, g3, p91Var, new u5(pw2Var.u(eh0.b(0, h, 0, max, 5)), X2, (byte) 2));
        }
    }

    public /* synthetic */ vk5(float f, tm1 tm1Var, byte b) {
        this.I = b;
        this.J = f;
        this.K = tm1Var;
    }
}
