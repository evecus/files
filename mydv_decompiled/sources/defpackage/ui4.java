package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ui4 implements fr5 {
    public static hx1 a;
    public static hx1 b;
    public static long c;
    public static Method d;
    public static Method e;
    public static Method f;
    public static hx1 g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [k13] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [k13] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [b53] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [b53] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final si4 a(wa2 wa2Var, boolean z) {
        ja3 ja3Var = wa2Var.n0;
        pi4 pi4Var = null;
        if ((ja3Var.f.getAggregateChildKindSet$ui() & 8) != 0) {
            k13 k13Var = ja3Var.f;
            loop0: while (true) {
                if (k13Var != null) {
                    if ((k13Var.getKindSet$ui() & 8) != 0) {
                        wt0 wt0Var = k13Var;
                        ?? r3 = 0;
                        while (wt0Var != 0) {
                            if (wt0Var instanceof pi4) {
                                pi4Var = wt0Var;
                                break loop0;
                            }
                            if ((wt0Var.getKindSet$ui() & 8) != 0 && (wt0Var instanceof wt0)) {
                                k13 k13Var2 = wt0Var.J;
                                int i = 0;
                                wt0Var = wt0Var;
                                r3 = r3;
                                while (k13Var2 != null) {
                                    if ((k13Var2.getKindSet$ui() & 8) != 0) {
                                        i++;
                                        r3 = r3;
                                        if (i == 1) {
                                            wt0Var = k13Var2;
                                        } else {
                                            if (r3 == 0) {
                                                r3 = new b53(new k13[16]);
                                            }
                                            if (wt0Var != 0) {
                                                r3.c(wt0Var);
                                                wt0Var = 0;
                                            }
                                            r3.c(k13Var2);
                                        }
                                    }
                                    k13Var2 = k13Var2.getChild$ui();
                                    wt0Var = wt0Var;
                                    r3 = r3;
                                }
                                if (i == 1) {
                                }
                            }
                            wt0Var = ut0.M(r3);
                        }
                    }
                    if ((k13Var.getAggregateChildKindSet$ui() & 8) == 0) {
                        break;
                    }
                    k13Var = k13Var.getChild$ui();
                } else {
                    break;
                }
            }
        }
        pi4Var.getClass();
        k13 node = pi4Var.getNode();
        ki4 x = wa2Var.x();
        if (x == null) {
            x = new ki4();
        }
        return new si4(node, z, wa2Var, x);
    }

    public static fz4 b() {
        return new fz4(null);
    }

    public static final long c(int i, int i2) {
        if (i < 0 || i2 < 0) {
            r02.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + "]");
        }
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = d65.c;
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.rb4 r9, float r10, defpackage.cj r11, defpackage.up0 r12, defpackage.tm1 r13, defpackage.gj0 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.ks4
            if (r0 == 0) goto L13
            r0 = r14
            ks4 r0 = (defpackage.ks4) r0
            int r1 = r0.M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.M = r1
            goto L18
        L13:
            ks4 r0 = new ks4
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.L
            int r1 = r0.M
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            float r10 = r0.I
            o24 r9 = r0.K
            cj r11 = r0.J
            defpackage.mu0.V(r14)
            goto L69
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r9)
            r9 = 0
            return r9
        L32:
            defpackage.mu0.V(r14)
            o24 r5 = new o24
            r5.<init>()
            java.lang.Object r14 = r11.c()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            r1 = 0
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 != 0) goto L4b
            r14 = r2
            goto L4c
        L4b:
            r14 = 0
        L4c:
            r14 = r14 ^ r2
            js4 r3 = new js4
            r8 = 0
            r6 = r9
            r4 = r10
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r0.J = r11
            r0.K = r5
            r0.I = r4
            r0.M = r2
            java.lang.Object r9 = defpackage.ad4.c(r11, r12, r14, r3, r0)
            el0 r10 = defpackage.el0.I
            if (r9 != r10) goto L67
            return r10
        L67:
            r10 = r4
            r9 = r5
        L69:
            yi r12 = new yi
            float r9 = r9.I
            float r10 = r10 - r9
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r10)
            r12.<init>(r9, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui4.d(rb4, float, cj, up0, tm1, gj0):java.lang.Object");
    }

    public static final void e(aj ajVar, rb4 rb4Var, tm1 tm1Var, float f2) {
        float f3;
        try {
            f3 = rb4Var.a(f2);
        } catch (CancellationException unused) {
            ajVar.a();
            f3 = 0.0f;
        }
        tm1Var.invoke(Float.valueOf(f3));
        if (Math.abs(f2 - f3) > 0.5f) {
            ajVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.rb4 r16, float r17, float r18, defpackage.cj r19, defpackage.ku4 r20, defpackage.tm1 r21, defpackage.gj0 r22) {
        /*
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof defpackage.ls4
            if (r2 == 0) goto L18
            r2 = r1
            ls4 r2 = (defpackage.ls4) r2
            int r3 = r2.N
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.N = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            ls4 r2 = new ls4
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.M
            int r2 = r8.N
            r9 = 0
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L36
            float r0 = r8.J
            float r2 = r8.I
            o24 r3 = r8.L
            cj r4 = r8.K
            defpackage.mu0.V(r1)
            r1 = r0
            r0 = r2
            goto L8f
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r0)
            r0 = 0
            return r0
        L3d:
            defpackage.mu0.V(r1)
            o24 r12 = new o24
            r12.<init>()
            java.lang.Object r1 = r19.c()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r0)
            java.lang.Object r2 = r19.c()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L64
            r2 = r3
            goto L65
        L64:
            r2 = 0
        L65:
            r6 = r2 ^ 1
            js4 r10 = new js4
            r15 = 1
            r13 = r16
            r11 = r18
            r14 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            r2 = r19
            r8.K = r2
            r8.L = r12
            r8.I = r0
            r8.J = r1
            r8.N = r3
            r5 = r20
            r3 = r2
            r7 = r10
            java.lang.Object r2 = defpackage.ad4.d(r3, r4, r5, r6, r7, r8)
            el0 r3 = defpackage.el0.I
            if (r2 != r3) goto L8c
            return r3
        L8c:
            r4 = r19
            r3 = r12
        L8f:
            java.lang.Object r2 = r4.c()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r1 = h(r2, r1)
            yi r2 = new yi
            float r3 = r3.I
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            cj r0 = defpackage.o7.o(r4, r9, r1, r0)
            r2.<init>(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui4.f(rb4, float, float, cj, ku4, tm1, gj0):java.lang.Object");
    }

    public static final long g(int i, long j) {
        int i2 = d65.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : c(i4, i);
    }

    public static final float h(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        return (f3 <= 0.0f ? f2 >= f3 : f2 <= f3) ? f2 : f3;
    }

    public static final hx1 i() {
        hx1 hx1Var = b;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Speed", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        ArrayList arrayList = (ArrayList) epVar.J;
        epVar.z(20.38f, 8.57f);
        epVar.y(-1.23f, 1.85f);
        epVar.n(8.0f, 8.0f, -0.22f, 7.58f, true);
        epVar.x(5.07f, 18.0f);
        arrayList.add(new qk3(8.0f, 8.0f, 0.0f, false, true, 15.58f, 6.85f));
        epVar.y(1.85f, -1.23f);
        arrayList.add(new qk3(10.0f, 10.0f, 0.0f, false, false, 3.35f, 19.0f));
        epVar.n(2.0f, 2.0f, 1.72f, 1.0f, false);
        epVar.v(13.85f);
        epVar.n(2.0f, 2.0f, 1.74f, -1.0f, false);
        epVar.n(10.0f, 10.0f, -0.27f, -10.44f, false);
        epVar.p();
        epVar.z(10.59f, 15.41f);
        epVar.n(2.0f, 2.0f, 2.83f, 0.0f, false);
        epVar.y(5.66f, -8.49f);
        epVar.y(-8.49f, 5.66f);
        epVar.n(2.0f, 2.0f, 0.0f, 2.83f, false);
        epVar.p();
        gx1.a(gx1Var, arrayList, rt4Var);
        hx1 b2 = gx1Var.b();
        b = b2;
        return b2;
    }

    public static void j(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            zl1.k(cause);
            return;
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static final int l(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static boolean m() {
        if (Build.VERSION.SDK_INT >= 29) {
            return e95.c();
        }
        try {
            Method method = d;
            if (method == null) {
                c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                d = method;
            }
            return ((Boolean) method.invoke(null, Long.valueOf(c))).booleanValue();
        } catch (Exception e2) {
            j("isTagEnabled", e2);
            return false;
        }
    }

    public static final t43 n(fe0 fe0Var, hn1 hn1Var, Object obj) {
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (Q == jpVar) {
            Q = ad4.w(obj);
            go1Var.o0(Q);
        }
        t43 t43Var = (t43) Q;
        boolean i = go1Var.i(hn1Var);
        Object Q2 = go1Var.Q();
        if (i || Q2 == jpVar) {
            Q2 = new et4(hn1Var, t43Var, null, (byte) 0);
            go1Var.o0(Q2);
        }
        mw2.h(go1Var, (hn1) Q2, wd5.a);
        return t43Var;
    }

    public static String s(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public abstract void k(int i);

    public abstract void p(boolean z);

    public abstract void q();

    public abstract void r();

    public void o(boolean z) {
    }
}
