package defpackage;

import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import java.io.BufferedReader;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class wi4 {
    public static hx1 a;
    public static int b;
    public static ExoPlayer c;
    public static Integer d;
    public static hx1 e;

    public static final long a(float f, float f2) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = r95.c;
        return floatToRawIntBits;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        defpackage.zy.i("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        defpackage.zy.i("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(defpackage.m14 r18, defpackage.m14 r19, defpackage.m14 r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = c(r3, r2, r0)
            float r5 = r2.b
            float r6 = r2.d
            float r7 = r2.a
            float r2 = r2.c
            float r8 = r0.d
            float r9 = r0.b
            float r10 = r0.c
            float r11 = r0.a
            r12 = 0
            if (r4 != 0) goto L9c
            boolean r0 = c(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9c
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L98
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L44:
            if (r3 != r13) goto L99
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L98
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L94
            float r1 = r1.b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            defpackage.zy.i(r4)
            return r12
        L94:
            defpackage.zy.i(r4)
            return r12
        L98:
            return r18
        L99:
            defpackage.zy.i(r4)
        L9c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi4.b(m14, m14, m14, int):boolean");
    }

    public static final boolean c(int i, m14 m14Var, m14 m14Var2) {
        if (i == 3 || i == 4) {
            return m14Var.d > m14Var2.b && m14Var.b < m14Var2.d;
        }
        if (i == 5 || i == 6) {
            return m14Var.c > m14Var2.a && m14Var.a < m14Var2.c;
        }
        zy.i("This function should only be used for 2-D focus search");
        return false;
    }

    public static final void e(ui1 ui1Var, b53 b53Var) {
        if (!ui1Var.getNode().isAttached()) {
            q02.b("visitChildren called on an unattached node");
        }
        b53 b53Var2 = new b53(new k13[16]);
        k13 child$ui = ui1Var.getNode().getChild$ui();
        if (child$ui == null) {
            ut0.h(b53Var2, ui1Var.getNode());
        } else {
            b53Var2.c(child$ui);
        }
        while (true) {
            int i = b53Var2.K;
            if (i == 0) {
                return;
            }
            k13 k13Var = (k13) b53Var2.l(i - 1);
            if ((k13Var.getAggregateChildKindSet$ui() & 1024) == 0) {
                ut0.h(b53Var2, k13Var);
            } else {
                while (true) {
                    if (k13Var == null) {
                        break;
                    }
                    if ((k13Var.getKindSet$ui() & 1024) != 0) {
                        b53 b53Var3 = null;
                        while (k13Var != null) {
                            if (k13Var instanceof ui1) {
                                ui1 ui1Var2 = (ui1) k13Var;
                                if (ui1Var2.isAttached() && !ut0.U(ui1Var2).y0) {
                                    if (ui1Var2.l0().a) {
                                        b53Var.c(ui1Var2);
                                    } else {
                                        e(ui1Var2, b53Var);
                                    }
                                }
                            } else if ((k13Var.getKindSet$ui() & 1024) != 0 && (k13Var instanceof wt0)) {
                                int i2 = 0;
                                for (k13 k13Var2 = ((wt0) k13Var).J; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
                                    if ((k13Var2.getKindSet$ui() & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            k13Var = k13Var2;
                                        } else {
                                            if (b53Var3 == null) {
                                                b53Var3 = new b53(new k13[16]);
                                            }
                                            if (k13Var != null) {
                                                b53Var3.c(k13Var);
                                                k13Var = null;
                                            }
                                            b53Var3.c(k13Var2);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            k13Var = ut0.M(b53Var3);
                        }
                    } else {
                        k13Var = k13Var.getChild$ui();
                    }
                }
            }
        }
    }

    public static final t43 f(zf1 zf1Var, Object obj, fe0 fe0Var, int i, int i2) {
        go1 go1Var = (go1) fe0Var;
        l91 l91Var = l91.I;
        boolean i3 = go1Var.i(l91Var) | go1Var.i(zf1Var);
        Object Q = go1Var.Q();
        fj0 fj0Var = null;
        jp jpVar = de0.a;
        if (i3 || Q == jpVar) {
            Q = new lu1(l91Var, zf1Var, null);
            go1Var.o0(Q);
        }
        hn1 hn1Var = (hn1) Q;
        Object Q2 = go1Var.Q();
        if (Q2 == jpVar) {
            Q2 = ad4.w(obj);
            go1Var.o0(Q2);
        }
        t43 t43Var = (t43) Q2;
        boolean i4 = go1Var.i(hn1Var);
        Object Q3 = go1Var.Q();
        if (i4 || Q3 == jpVar) {
            Q3 = new et4(hn1Var, t43Var, fj0Var, (byte) 1);
            go1Var.o0(Q3);
        }
        mw2.i(zf1Var, l91Var, (hn1) Q3, go1Var);
        return t43Var;
    }

    public static final t43 g(dw4 dw4Var, fe0 fe0Var) {
        return f(dw4Var, dw4Var.getValue(), fe0Var, 0, 0);
    }

    public static dw5 h(fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        View view = (View) go1Var.k(rb.f);
        dw5 m = m(view);
        boolean i = go1Var.i(m) | go1Var.i(view);
        Object Q = go1Var.Q();
        if (i || Q == de0.a) {
            Q = new m1(m, view, (byte) 26);
            go1Var.o0(Q);
        }
        mw2.e(m, (tm1) Q, go1Var);
        return m;
    }

    public static final boolean i(long j, long j2) {
        return j == j2;
    }

    public static final ui1 j(b53 b53Var, m14 m14Var, int i) {
        m14 h;
        ui1 ui1Var = null;
        if (i == 3) {
            h = m14Var.h((m14Var.c - m14Var.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            h = m14Var.h(-((m14Var.c - m14Var.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            h = m14Var.h(0.0f, (m14Var.d - m14Var.b) + 1.0f);
        } else {
            if (i != 6) {
                zy.i("This function should only be used for 2-D focus search");
                return null;
            }
            h = m14Var.h(0.0f, -((m14Var.d - m14Var.b) + 1.0f));
        }
        Object[] objArr = b53Var.I;
        int i2 = b53Var.K;
        for (int i3 = 0; i3 < i2; i3++) {
            ui1 ui1Var2 = (ui1) objArr[i3];
            if (mu0.L(ui1Var2)) {
                m14 r = mu0.r(ui1Var2);
                if (q(r, h, m14Var, i)) {
                    ui1Var = ui1Var2;
                    h = r;
                }
            }
        }
        return ui1Var;
    }

    public static final boolean k(ui1 ui1Var, int i, tm1 tm1Var) {
        m14 m14Var;
        b53 b53Var = new b53(new ui1[16]);
        e(ui1Var, b53Var);
        int i2 = b53Var.K;
        if (i2 <= 1) {
            ui1 ui1Var2 = (ui1) (i2 == 0 ? null : b53Var.I[0]);
            if (ui1Var2 != null) {
                return ((Boolean) tm1Var.invoke(ui1Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                m14 r = mu0.r(ui1Var);
                float f = r.a;
                float f2 = r.b;
                m14Var = new m14(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    zy.i("This function should only be used for 2-D focus search");
                    return false;
                }
                m14 r2 = mu0.r(ui1Var);
                float f3 = r2.c;
                float f4 = r2.d;
                m14Var = new m14(f3, f4, f3, f4);
            }
            ui1 j = j(b53Var, m14Var, i);
            if (j != null) {
                return ((Boolean) tm1Var.invoke(j)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean l(final int i, final ig igVar, final ui1 ui1Var, final m14 m14Var) {
        if (v(i, igVar, ui1Var, m14Var)) {
            return true;
        }
        final ui1 g = ((di1) ut0.V(ui1Var).getFocusOwner()).g();
        Boolean bool = (Boolean) d4.J(ui1Var, i, new tm1() { // from class: tb5
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                rv rvVar = (rv) obj;
                ui1 ui1Var2 = ui1Var;
                if (ui1.this != ((di1) ut0.V(ui1Var2).getFocusOwner()).g()) {
                    return Boolean.TRUE;
                }
                boolean v = wi4.v(i, igVar, ui1Var2, m14Var);
                Boolean valueOf = Boolean.valueOf(v);
                if (v || !rvVar.a()) {
                    return valueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static dw5 m(View view) {
        dw5 dw5Var;
        WeakHashMap weakHashMap = dw5.w;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new dw5(view);
                    weakHashMap.put(view, obj);
                }
                dw5Var = (dw5) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dw5Var;
    }

    public static final hx1 n() {
        hx1 hx1Var = a;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Outlined.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep r = r7.r(19.43f, 12.98f);
        r.r(0.04f, -0.32f, 0.07f, -0.64f, 0.07f, -0.98f);
        r.r(0.0f, -0.34f, -0.03f, -0.66f, -0.07f, -0.98f);
        r.y(2.11f, -1.65f);
        r.r(0.19f, -0.15f, 0.24f, -0.42f, 0.12f, -0.64f);
        r.y(-2.0f, -3.46f);
        r.r(-0.09f, -0.16f, -0.26f, -0.25f, -0.44f, -0.25f);
        r.r(-0.06f, 0.0f, -0.12f, 0.01f, -0.17f, 0.03f);
        r.y(-2.49f, 1.0f);
        r.r(-0.52f, -0.4f, -1.08f, -0.73f, -1.69f, -0.98f);
        r.y(-0.38f, -2.65f);
        r.q(14.46f, 2.18f, 14.25f, 2.0f, 14.0f, 2.0f);
        r.v(-4.0f);
        r.r(-0.25f, 0.0f, -0.46f, 0.18f, -0.49f, 0.42f);
        r.y(-0.38f, 2.65f);
        r.r(-0.61f, 0.25f, -1.17f, 0.59f, -1.69f, 0.98f);
        r.y(-2.49f, -1.0f);
        r.r(-0.06f, -0.02f, -0.12f, -0.03f, -0.18f, -0.03f);
        r.r(-0.17f, 0.0f, -0.34f, 0.09f, -0.43f, 0.25f);
        r.y(-2.0f, 3.46f);
        r.r(-0.13f, 0.22f, -0.07f, 0.49f, 0.12f, 0.64f);
        r.y(2.11f, 1.65f);
        r.r(-0.04f, 0.32f, -0.07f, 0.65f, -0.07f, 0.98f);
        r.r(0.0f, 0.33f, 0.03f, 0.66f, 0.07f, 0.98f);
        r.y(-2.11f, 1.65f);
        r.r(-0.19f, 0.15f, -0.24f, 0.42f, -0.12f, 0.64f);
        r.y(2.0f, 3.46f);
        r.r(0.09f, 0.16f, 0.26f, 0.25f, 0.44f, 0.25f);
        r.r(0.06f, 0.0f, 0.12f, -0.01f, 0.17f, -0.03f);
        r.y(2.49f, -1.0f);
        r.r(0.52f, 0.4f, 1.08f, 0.73f, 1.69f, 0.98f);
        r.y(0.38f, 2.65f);
        r.r(0.03f, 0.24f, 0.24f, 0.42f, 0.49f, 0.42f);
        r.v(4.0f);
        r.r(0.25f, 0.0f, 0.46f, -0.18f, 0.49f, -0.42f);
        r.y(0.38f, -2.65f);
        r.r(0.61f, -0.25f, 1.17f, -0.59f, 1.69f, -0.98f);
        r.y(2.49f, 1.0f);
        r.r(0.06f, 0.02f, 0.12f, 0.03f, 0.18f, 0.03f);
        r.r(0.17f, 0.0f, 0.34f, -0.09f, 0.43f, -0.25f);
        r.y(2.0f, -3.46f);
        r.r(0.12f, -0.22f, 0.07f, -0.49f, -0.12f, -0.64f);
        r.y(-2.11f, -1.65f);
        r.p();
        r.z(17.45f, 11.27f);
        r.r(0.04f, 0.31f, 0.05f, 0.52f, 0.05f, 0.73f);
        r.r(0.0f, 0.21f, -0.02f, 0.43f, -0.05f, 0.73f);
        r.y(-0.14f, 1.13f);
        r.y(0.89f, 0.7f);
        r.y(1.08f, 0.84f);
        r.y(-0.7f, 1.21f);
        r.y(-1.27f, -0.51f);
        r.y(-1.04f, -0.42f);
        r.y(-0.9f, 0.68f);
        r.r(-0.43f, 0.32f, -0.84f, 0.56f, -1.25f, 0.73f);
        r.y(-1.06f, 0.43f);
        r.y(-0.16f, 1.13f);
        r.y(-0.2f, 1.35f);
        r.v(-1.4f);
        r.y(-0.19f, -1.35f);
        r.y(-0.16f, -1.13f);
        r.y(-1.06f, -0.43f);
        r.r(-0.43f, -0.18f, -0.83f, -0.41f, -1.23f, -0.71f);
        r.y(-0.91f, -0.7f);
        r.y(-1.06f, 0.43f);
        r.y(-1.27f, 0.51f);
        r.y(-0.7f, -1.21f);
        r.y(1.08f, -0.84f);
        r.y(0.89f, -0.7f);
        r.y(-0.14f, -1.13f);
        r.r(-0.03f, -0.31f, -0.05f, -0.54f, -0.05f, -0.74f);
        r.D(0.02f, -0.43f, 0.05f, -0.73f);
        r.y(0.14f, -1.13f);
        r.y(-0.89f, -0.7f);
        r.y(-1.08f, -0.84f);
        r.y(0.7f, -1.21f);
        r.y(1.27f, 0.51f);
        r.y(1.04f, 0.42f);
        r.y(0.9f, -0.68f);
        r.r(0.43f, -0.32f, 0.84f, -0.56f, 1.25f, -0.73f);
        r.y(1.06f, -0.43f);
        r.y(0.16f, -1.13f);
        r.y(0.2f, -1.35f);
        r.v(1.39f);
        r.y(0.19f, 1.35f);
        r.y(0.16f, 1.13f);
        r.y(1.06f, 0.43f);
        r.r(0.43f, 0.18f, 0.83f, 0.41f, 1.23f, 0.71f);
        r.y(0.91f, 0.7f);
        r.y(1.06f, -0.43f);
        r.y(1.27f, -0.51f);
        r.y(0.7f, 1.21f);
        r.y(-1.07f, 0.85f);
        r.y(-0.89f, 0.7f);
        r.y(0.14f, 1.13f);
        r.p();
        r.z(12.0f, 8.0f);
        r.r(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        r.D(1.79f, 4.0f, 4.0f, 4.0f);
        r.D(4.0f, -1.79f, 4.0f, -4.0f);
        r.D(-1.79f, -4.0f, -4.0f, -4.0f);
        r.p();
        r.z(12.0f, 14.0f);
        r.r(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        r.D(0.9f, -2.0f, 2.0f, -2.0f);
        r.D(2.0f, 0.9f, 2.0f, 2.0f);
        r.D(-0.9f, 2.0f, -2.0f, 2.0f);
        r.p();
        gx1.a(gx1Var, (ArrayList) r.J, rt4Var);
        hx1 b2 = gx1Var.b();
        a = b2;
        return b2;
    }

    public static final hx1 o() {
        hx1 hx1Var = e;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Star", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep p = hf1.p(12.0f, 17.27f, 18.18f, 21.0f);
        p.y(-1.64f, -7.03f);
        p.x(22.0f, 9.24f);
        p.y(-7.19f, -0.61f);
        p.x(12.0f, 2.0f);
        p.x(9.19f, 8.63f);
        p.x(2.0f, 9.24f);
        p.y(5.46f, 4.73f);
        p.x(5.82f, 21.0f);
        p.p();
        gx1.a(gx1Var, (ArrayList) p.J, rt4Var);
        hx1 b2 = gx1Var.b();
        e = b2;
        return b2;
    }

    public static final boolean p(si4 si4Var) {
        ki4 k = si4Var.k();
        return k.I.c(zi4.B);
    }

    public static final boolean q(m14 m14Var, m14 m14Var2, m14 m14Var3, int i) {
        if (!r(i, m14Var, m14Var3)) {
            return false;
        }
        if (r(i, m14Var2, m14Var3) && !b(m14Var3, m14Var, m14Var2, i)) {
            return !b(m14Var3, m14Var2, m14Var, i) && s(i, m14Var3, m14Var) < s(i, m14Var3, m14Var2);
        }
        return true;
    }

    public static final boolean r(int i, m14 m14Var, m14 m14Var2) {
        if (i == 3) {
            float f = m14Var2.c;
            float f2 = m14Var2.a;
            float f3 = m14Var.c;
            return (f > f3 || f2 >= f3) && f2 > m14Var.a;
        }
        if (i == 4) {
            float f4 = m14Var2.a;
            float f5 = m14Var2.c;
            float f6 = m14Var.a;
            return (f4 < f6 || f5 <= f6) && f5 < m14Var.c;
        }
        if (i == 5) {
            float f7 = m14Var2.d;
            float f8 = m14Var2.b;
            float f9 = m14Var.d;
            return (f7 > f9 || f8 >= f9) && f8 > m14Var.b;
        }
        if (i != 6) {
            zy.i("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = m14Var2.b;
        float f11 = m14Var2.d;
        float f12 = m14Var.b;
        return (f10 < f12 || f11 <= f12) && f11 < m14Var.d;
    }

    public static final long s(int i, m14 m14Var, m14 m14Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = m14Var.a;
            f2 = m14Var2.c;
        } else if (i == 4) {
            f = m14Var2.a;
            f2 = m14Var.c;
        } else if (i == 5) {
            f = m14Var.b;
            f2 = m14Var2.d;
        } else {
            if (i != 6) {
                zy.i("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = m14Var2.b;
            f2 = m14Var.d;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = m14Var.b;
            f3 = ((m14Var.d - f7) / 2.0f) + f7;
            f4 = m14Var2.b;
            f5 = m14Var2.d;
        } else {
            if (i != 5 && i != 6) {
                zy.i("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = m14Var.a;
            f3 = ((m14Var.c - f8) / 2.0f) + f8;
            f4 = m14Var2.a;
            f5 = m14Var2.c;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    public static gz4 t(gz4 gz4Var) {
        return !(gz4Var instanceof iz4) ? gz4Var instanceof hz4 ? gz4Var : gz4Var instanceof Serializable ? new hz4(gz4Var) : new iz4(gz4Var) : gz4Var;
    }

    public static final String u(BufferedReader bufferedReader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = bufferedReader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = bufferedReader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return stringWriter2;
    }

    public static final boolean v(int i, ig igVar, ui1 ui1Var, m14 m14Var) {
        ui1 j;
        b53 b53Var = new b53(new ui1[16]);
        if (!ui1Var.getNode().isAttached()) {
            q02.b("visitChildren called on an unattached node");
        }
        b53 b53Var2 = new b53(new k13[16]);
        k13 child$ui = ui1Var.getNode().getChild$ui();
        if (child$ui == null) {
            ut0.h(b53Var2, ui1Var.getNode());
        } else {
            b53Var2.c(child$ui);
        }
        while (true) {
            int i2 = b53Var2.K;
            if (i2 == 0) {
                break;
            }
            k13 k13Var = (k13) b53Var2.l(i2 - 1);
            if ((k13Var.getAggregateChildKindSet$ui() & 1024) == 0) {
                ut0.h(b53Var2, k13Var);
            } else {
                while (true) {
                    if (k13Var == null) {
                        break;
                    }
                    if ((k13Var.getKindSet$ui() & 1024) != 0) {
                        b53 b53Var3 = null;
                        while (k13Var != null) {
                            if (k13Var instanceof ui1) {
                                ui1 ui1Var2 = (ui1) k13Var;
                                if (ui1Var2.isAttached()) {
                                    b53Var.c(ui1Var2);
                                }
                            } else if ((k13Var.getKindSet$ui() & 1024) != 0 && (k13Var instanceof wt0)) {
                                int i3 = 0;
                                for (k13 k13Var2 = ((wt0) k13Var).J; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
                                    if ((k13Var2.getKindSet$ui() & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            k13Var = k13Var2;
                                        } else {
                                            if (b53Var3 == null) {
                                                b53Var3 = new b53(new k13[16]);
                                            }
                                            if (k13Var != null) {
                                                b53Var3.c(k13Var);
                                                k13Var = null;
                                            }
                                            b53Var3.c(k13Var2);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            k13Var = ut0.M(b53Var3);
                        }
                    } else {
                        k13Var = k13Var.getChild$ui();
                    }
                }
            }
        }
        while (b53Var.K != 0 && (j = j(b53Var, m14Var, i)) != null) {
            if (j.l0().a) {
                return ((Boolean) igVar.invoke(j)).booleanValue();
            }
            if (l(i, igVar, j, m14Var)) {
                return true;
            }
            b53Var.k(j);
        }
        return false;
    }

    public static final w84 w(rm1 rm1Var) {
        return new w84(new l9(rm1Var, null), (byte) 0);
    }

    public static final Boolean x(int i, ig igVar, ui1 ui1Var, m14 m14Var) {
        int ordinal = ui1Var.o0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ui1 t = mu0.t(ui1Var);
                if (t == null) {
                    zy.i("ActiveParent must have a focusedChild");
                    return null;
                }
                int ordinal2 = t.o0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean x = x(i, igVar, t, m14Var);
                        if (!j42.c(x, Boolean.FALSE)) {
                            return x;
                        }
                        if (m14Var == null) {
                            if (t.o0() != oi1.J) {
                                zy.i("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            ui1 p = mu0.p(t);
                            if (p == null) {
                                zy.i("ActiveParent must have a focusedChild");
                                return null;
                            }
                            m14Var = mu0.r(p);
                        }
                        return Boolean.valueOf(l(i, igVar, ui1Var, m14Var));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            s83.v();
                            return null;
                        }
                        zy.i("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (m14Var == null) {
                    m14Var = mu0.r(t);
                }
                return Boolean.valueOf(l(i, igVar, ui1Var, m14Var));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return ui1Var.l0().a ? (Boolean) igVar.invoke(ui1Var) : m14Var == null ? Boolean.valueOf(k(ui1Var, i, igVar)) : Boolean.valueOf(v(i, igVar, ui1Var, m14Var));
                }
                s83.v();
                return null;
            }
        }
        return Boolean.valueOf(k(ui1Var, i, igVar));
    }

    public static eh5 y(int i, String str) {
        return new eh5(new w12(0, 0, 0, 0), str);
    }

    public static final qr5 z(k60 k60Var, wr5 wr5Var, k02 k02Var, vl0 vl0Var, fe0 fe0Var) {
        ur5 ur5Var = k02Var;
        if (k02Var == null) {
            ur5Var = wr5Var instanceof ws1 ? ((ws1) wr5Var).c() : gt0.b;
        }
        ur5Var.getClass();
        vl0Var.getClass();
        ts0 ts0Var = new ts0(wr5Var.f(), ur5Var, vl0Var);
        String b2 = k60Var.b();
        if (b2 != null) {
            return ts0Var.p(k60Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b2));
        }
        s83.t("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public void d() {
    }
}
