package defpackage;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class hy3 {
    public static final Set a = dq.p1(new uy3[]{uy3.I, uy3.J, uy3.K, uy3.L});
    public static final float b = 480.0f;

    public static final void a(String str, rm1 rm1Var, l13 l13Var, boolean z, ki1 ki1Var, fe0 fe0Var, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        ki1 ki1Var2;
        int i5;
        go1 go1Var;
        boolean z3;
        ki1 ki1Var3;
        boolean z4;
        long c;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-1009585127);
        if ((i & 6) == 0) {
            i3 = i | (go1Var2.g(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= go1Var2.i(rm1Var) ? 32 : 16;
        }
        int i6 = i3 | (go1Var2.g(l13Var) ? 256 : 128);
        int i7 = i2 & 8;
        if (i7 != 0) {
            i4 = i6 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i4 = i6 | (go1Var2.h(z2) ? 2048 : 1024);
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i5 = i4 | 24576;
            ki1Var2 = ki1Var;
        } else {
            ki1Var2 = ki1Var;
            i5 = i4 | (go1Var2.g(ki1Var2) ? 16384 : 8192);
        }
        if (go1Var2.T(i5 & 1, (i5 & 9363) != 9362)) {
            if (i7 != 0) {
                z2 = true;
            }
            if (i8 != 0) {
                ki1Var2 = null;
            }
            k80 k80Var = ((fw2) go1Var2.k(lw2.b)).a;
            Object Q = go1Var2.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = r7.v(go1Var2);
            }
            t33 t33Var = (t33) Q;
            Object Q2 = go1Var2.Q();
            if (Q2 == jpVar) {
                Q2 = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q2);
            }
            t43 t43Var = (t43) Q2;
            t43 w = ut0.w(t33Var, go1Var2);
            if (z2) {
                z4 = z2;
                c = k80Var.q;
            } else {
                z4 = z2;
                c = x70.c(k80Var.s, 0.4f);
            }
            long j = c;
            ki1 ki1Var4 = ki1Var2;
            boolean z5 = z4;
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.J, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "code-key-bg", go1Var2, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), j, k80Var.v, "code-key-fg", go1Var2, 3072);
            i13 i13Var = i13.a;
            l13 H = p70.H(o7.m(nq4.g(l13Var.then(ki1Var4 != null ? j42.x(i13Var, ki1Var4) : i13Var), 52.0f), jo.b), t0);
            Object Q3 = go1Var2.Q();
            if (Q3 == jpVar) {
                Q3 = new xx2(t43Var, (byte) 21);
                go1Var2.o0(Q3);
            }
            l13 B = mw2.B(r13.d(i42.A0(H, (tm1) Q3), null, null, null, null, z5 ? rm1Var : null, null, null, null, null, null, null, t33Var, 130815), z5, null, 2);
            uw2 c2 = px.c(q8.N, false);
            long j2 = go1Var2.T;
            int i9 = (int) (j2 ^ (j2 >>> 32));
            am3 m = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, B);
            xd0.c.getClass();
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(wa2.A0);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, q8.c0, c2);
            qi4.k(go1Var2, q8.b0, m);
            qi4.k(go1Var2, q8.d0, Integer.valueOf(i9));
            qi4.j(go1Var2);
            qi4.k(go1Var2, q8.a0, x0);
            r55.b(str, p70.G(i13Var, s0, j, false, null, 12), j, oh4.j(18), qk1.P, 0L, null, 0L, 0, false, 0, 0, null, go1Var2, (i5 & 14) | 1597440, 0, 262056);
            go1Var = go1Var2;
            go1Var.q(true);
            z3 = z5;
            ki1Var3 = ki1Var4;
        } else {
            go1Var = go1Var2;
            go1Var.W();
            z3 = z2;
            ki1Var3 = ki1Var2;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new no0(str, rm1Var, l13Var, z3, ki1Var3, i, i2);
        }
    }

    public static final void b(final ez3 ez3Var, fe0 fe0Var, final int i) {
        int i2;
        final ez3 ez3Var2;
        hn1 hn1Var;
        x04 x04Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1003333016);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(ez3Var) : go1Var.i(ez3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        final byte b3 = 1;
        final byte b4 = 0;
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            p04 p04Var = ez3Var.b;
            t43 f = wi4.f(p04Var, p04Var.getValue(), go1Var, 0, 0);
            Object Q = go1Var.Q();
            Object obj = de0.a;
            if (Q == obj) {
                Q = ad4.w(Boolean.FALSE);
                go1Var.o0(Q);
            }
            t43 t43Var = (t43) Q;
            Boolean valueOf = Boolean.valueOf(((vy3) f.getValue()).f);
            boolean g = go1Var.g(f);
            Object Q2 = go1Var.Q();
            fj0 fj0Var = null;
            if (g || Q2 == obj) {
                Q2 = new xo2(f, t43Var, fj0Var, b2);
                go1Var.o0(Q2);
            }
            mw2.h(go1Var, (hn1) Q2, valueOf);
            if (!((vy3) f.getValue()).f || ((Boolean) t43Var.getValue()).booleanValue()) {
                x04Var = go1Var.u();
                if (x04Var != null) {
                    hn1Var = new hn1() { // from class: dy3
                        @Override // defpackage.hn1
                        public final Object invoke(Object obj2, Object obj3) {
                            byte b5 = b4;
                            wd5 wd5Var = wd5.a;
                            int i3 = i;
                            ez3 ez3Var3 = ez3Var;
                            fe0 fe0Var2 = (fe0) obj2;
                            ((Integer) obj3).intValue();
                            switch (b5) {
                                case 0:
                                    hy3.b(ez3Var3, fe0Var2, mu0.X(i3 | 1));
                                    break;
                                default:
                                    hy3.b(ez3Var3, fe0Var2, mu0.X(i3 | 1));
                                    break;
                            }
                            return wd5Var;
                        }
                    };
                    x04Var.d = hn1Var;
                }
                return;
            }
            Object Q3 = go1Var.Q();
            if (Q3 == obj) {
                Q3 = ad4.w("");
                go1Var.o0(Q3);
            }
            t43 t43Var2 = (t43) Q3;
            Object Q4 = go1Var.Q();
            if (Q4 == obj) {
                Q4 = pt1.r(go1Var);
            }
            ki1 ki1Var = (ki1) Q4;
            Object Q5 = go1Var.Q();
            if (Q5 == obj) {
                Q5 = new k(ki1Var, (fj0) null, (byte) 14);
                go1Var.o0(Q5);
            }
            mw2.h(go1Var, (hn1) Q5, wd5.a);
            Object Q6 = go1Var.Q();
            if (Q6 == obj) {
                Q6 = new wd3((byte) 12);
                go1Var.o0(Q6);
            }
            ez3Var2 = ez3Var;
            d4.b((rm1) Q6, new tw0(false, false, false), p70.u0(147342817, new so2((byte) 7, t43Var2, (Object) ez3Var2, (Object) ki1Var, (Object) t43Var), go1Var), go1Var, 438);
        } else {
            ez3Var2 = ez3Var;
            go1Var.W();
        }
        x04Var = go1Var.u();
        if (x04Var != null) {
            hn1Var = new hn1() { // from class: dy3
                @Override // defpackage.hn1
                public final Object invoke(Object obj2, Object obj3) {
                    byte b5 = b3;
                    wd5 wd5Var = wd5.a;
                    int i3 = i;
                    ez3 ez3Var3 = ez3Var2;
                    fe0 fe0Var2 = (fe0) obj2;
                    ((Integer) obj3).intValue();
                    switch (b5) {
                        case 0:
                            hy3.b(ez3Var3, fe0Var2, mu0.X(i3 | 1));
                            break;
                        default:
                            hy3.b(ez3Var3, fe0Var2, mu0.X(i3 | 1));
                            break;
                    }
                    return wd5Var;
                }
            };
            x04Var.d = hn1Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(int r27, int r28, defpackage.fe0 r29, defpackage.rm1 r30, defpackage.l13 r31, java.lang.String r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy3.c(int, int, fe0, rm1, l13, java.lang.String, boolean):void");
    }

    public static final void d(final cy3 cy3Var, final float f, l13 l13Var, final tc0 tc0Var, fe0 fe0Var, final int i) {
        int i2;
        final l13 l13Var2;
        cy3Var.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1454612110);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(cy3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.d(f) ? 32 : 16;
        }
        int i3 = i2 | RendererCapabilities.DECODER_SUPPORT_MASK;
        if ((i & 3072) == 0) {
            i3 |= go1Var.i(tc0Var) ? 2048 : 1024;
        }
        if (go1Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            l13Var2 = i13.a;
            l13 C0 = i42.C0(mw2.p(o7.m(nq4.k(l13Var2, f), l74.a(16.0f)), cy3Var.b, mw2.j), 12.0f);
            int i4 = (i3 & 7168) | 48;
            uw2 c = px.c(q8.N, false);
            long j = go1Var.T;
            int i5 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, C0);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i5));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            tc0Var.invoke(ux.a, go1Var, Integer.valueOf(((i4 >> 6) & 112) | 6));
            go1Var.q(true);
        } else {
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: ey3
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hy3.d(cy3.this, f, l13Var2, tc0Var, (fe0) obj, mu0.X(i | 1));
                    return wd5.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0363, code lost:
    
        if (r2 == r11) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03f6, code lost:
    
        if (r1 == r11) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final defpackage.ez3 r42, defpackage.l13 r43, defpackage.fe0 r44, int r45) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy3.e(ez3, l13, fe0, int):void");
    }

    public static final float[] f(float f, float f2) {
        float f3 = f2 - f;
        return new float[]{0.2126f * f3, 0.7152f * f3, f3 * 0.0722f, 0.0f, f * 255.0f};
    }

    public static final Bitmap g(String str, cy3 cy3Var, fe0 fe0Var, int i, int i2) {
        t43 t43Var;
        str.getClass();
        cy3Var.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.d0(1654823731);
        int i3 = (i2 & 2) != 0 ? 512 : 256;
        if (jx4.L(str)) {
            go1Var.q(false);
            return null;
        }
        int i4 = (i & 14) ^ 6;
        boolean z = true;
        int i5 = (i & 112) ^ 48;
        boolean z2 = ((i4 > 4 && go1Var.g(str)) || (i & 6) == 4) | ((i5 > 32 && go1Var.e(i3)) || (i & 48) == 32);
        int i6 = (i & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK;
        boolean z3 = z2 | ((i6 > 256 && go1Var.g(cy3Var)) || (i & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (z3 || Q == jpVar) {
            Q = ad4.w(null);
            go1Var.o0(Q);
        }
        t43 t43Var2 = (t43) Q;
        Integer valueOf = Integer.valueOf(i3);
        boolean g = go1Var.g(t43Var2) | ((i4 > 4 && go1Var.g(str)) || (i & 6) == 4) | ((i5 > 32 && go1Var.e(i3)) || (i & 48) == 32);
        if ((i6 <= 256 || !go1Var.g(cy3Var)) && (i & RendererCapabilities.DECODER_SUPPORT_MASK) != 256) {
            z = false;
        }
        boolean z4 = g | z;
        Object Q2 = go1Var.Q();
        if (z4 || Q2 == jpVar) {
            int i7 = i3;
            t43Var = t43Var2;
            eq1 eq1Var = new eq1((Object) t43Var, (Object) str, i7, (Object) cy3Var, (fj0) null, (byte) 4);
            go1Var.o0(eq1Var);
            Q2 = eq1Var;
        } else {
            t43Var = t43Var2;
        }
        mw2.j(str, valueOf, cy3Var, (hn1) Q2, go1Var);
        Bitmap bitmap = (Bitmap) t43Var.getValue();
        go1Var.q(false);
        return bitmap;
    }

    public static final cy3 h(fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        long j = ((fw2) go1Var.k(lw2.b)).a.K;
        boolean f = go1Var.f(j);
        Object Q = go1Var.Q();
        if (f || Q == de0.a) {
            int i0 = qb.i0(j);
            a10 y = j42.y(i0);
            double d = y.a;
            double d2 = y.b;
            p70.l0(i0);
            int Q2 = o7.Q(d, d2, 10.0d);
            j42.y(Q2);
            p70.l0(Q2);
            long i = qb.i(Q2);
            int Q3 = o7.Q(d, d2, 90.0d);
            j42.y(Q3);
            p70.l0(Q3);
            cy3 cy3Var = new cy3(i, qb.i(Q3));
            go1Var.o0(cy3Var);
            Q = cy3Var;
        }
        return (cy3) Q;
    }
}
