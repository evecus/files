package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.media3.exoplayer.RendererCapabilities;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class at0 {
    public static final zq3 a = new zq3(30);

    public static final void a(av avVar, v25 v25Var, fe0 fe0Var, int i) {
        Context context;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1904307118);
        int i2 = (go1Var.g(avVar) ? 4 : 2) | i | (go1Var.i(v25Var) ? 32 : 16);
        byte b = 9;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                go1Var.d0(-1009482584);
                context = (Context) go1Var.k(rb.b);
                go1Var.q(false);
            } else {
                go1Var.d0(-1009433480);
                go1Var.q(false);
                context = null;
            }
            boolean i3 = go1Var.i(v25Var) | ((i2 & 14) == 4) | go1Var.i(context);
            Object Q = go1Var.Q();
            if (i3 || Q == de0.a) {
                Q = new m6(v25Var, context, avVar, b);
                go1Var.o0(Q);
            }
            cj0.b(null, null, (tm1) Q, go1Var, 0, 3);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new bj1((byte) 9, i, avVar, v25Var);
        }
    }

    public static final void b(final int i, final long j, fe0 fe0Var, final int i2) {
        final int i3;
        int i4;
        x04 u;
        hn1 hn1Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (go1Var.e(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= go1Var.f(j) ? 32 : 16;
        }
        if (go1Var.T(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) go1Var.k(rb.b);
            boolean g = ((i4 & 14) == 4) | go1Var.g(context);
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (g || Q == jpVar) {
                Q = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                go1Var.o0(Q);
            }
            int intValue = ((Number) Q).intValue();
            if (intValue == -1) {
                u = go1Var.u();
                if (u != null) {
                    final byte b = 1;
                    hn1Var = new hn1() { // from class: zs0
                        @Override // defpackage.hn1
                        public final Object invoke(Object obj, Object obj2) {
                            byte b2 = b;
                            wd5 wd5Var = wd5.a;
                            int i5 = i2;
                            long j2 = j;
                            int i6 = i3;
                            fe0 fe0Var2 = (fe0) obj;
                            ((Integer) obj2).getClass();
                            switch (b2) {
                                case 0:
                                    at0.b(i6, j2, fe0Var2, mu0.X(i5 | 1));
                                    break;
                                default:
                                    at0.b(i6, j2, fe0Var2, mu0.X(i5 | 1));
                                    break;
                            }
                            return wd5Var;
                        }
                    };
                    u.d = hn1Var;
                }
                return;
            }
            rj3 M = vt0.M(go1Var, intValue);
            boolean z = (i4 & 112) == 32;
            Object Q2 = go1Var.Q();
            if (z || Q2 == jpVar) {
                Q2 = j == 16 ? null : new hw(j, 5);
                go1Var.o0(Q2);
            }
            px.a(j42.T(nq4.k(i13.a, zi0.e), M, null, li0.b, 0.0f, (c80) Q2, 22), go1Var, 0);
        } else {
            go1Var.W();
        }
        u = go1Var.u();
        if (u != null) {
            final byte b2 = 0;
            hn1Var = new hn1() { // from class: zs0
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    byte b22 = b2;
                    wd5 wd5Var = wd5.a;
                    int i5 = i2;
                    long j2 = j;
                    int i6 = i;
                    fe0 fe0Var2 = (fe0) obj;
                    ((Integer) obj2).getClass();
                    switch (b22) {
                        case 0:
                            at0.b(i6, j2, fe0Var2, mu0.X(i5 | 1));
                            break;
                        default:
                            at0.b(i6, j2, fe0Var2, mu0.X(i5 | 1));
                            break;
                    }
                    return wd5Var;
                }
            };
            u.d = hn1Var;
        }
    }

    public static final void c(av avVar, w25 w25Var, rm1 rm1Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(avVar) : go1Var.i(avVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? go1Var.g(w25Var) : go1Var.i(w25Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.i(rm1Var) ? 256 : 128;
        }
        boolean z = false;
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && go1Var.g(w25Var));
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (z2 || Q == jpVar) {
                Q = new pu2(new uu2(new ka(w25Var, rm1Var, (byte) 13)));
                go1Var.o0(Q);
            }
            pu2 pu2Var = (pu2) Q;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && go1Var.i(avVar))) {
                z = true;
            }
            Object Q2 = go1Var.Q();
            if (z || Q2 == jpVar) {
                Q2 = new ce(avVar, (byte) 13);
                go1Var.o0(Q2);
            }
            pe.a(pu2Var, (rm1) Q2, a, p70.u0(1315155414, new bj1(w25Var, avVar, (byte) 8), go1Var), go1Var, 3456, 0);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ve(avVar, w25Var, rm1Var, i, (byte) 3);
        }
    }

    public static final void d(l13 l13Var, tc0 tc0Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1392105195);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (go1Var.g(l13Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.i(tc0Var) ? 32 : 16;
        }
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            d4.d(l13Var, g35.a, tc0Var, go1Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new rf(l13Var, tc0Var, i, b);
        }
    }
}
