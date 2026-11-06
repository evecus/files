package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tq1 {
    public static final tq1 a = new tq1();
    public static final o53 b = new o53();
    public static final LinkedHashMap c = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r5, defpackage.uq1 r6, java.lang.String r7, defpackage.gj0 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.pq1
            if (r0 == 0) goto L13
            r0 = r8
            pq1 r0 = (defpackage.pq1) r0
            int r1 = r0.O
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.O = r1
            goto L18
        L13:
            pq1 r0 = new pq1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.M
            int r8 = r0.O
            r1 = 1
            r2 = 0
            if (r8 == 0) goto L36
            if (r8 != r1) goto L30
            o53 r5 = r0.L
            java.lang.String r7 = r0.K
            uq1 r6 = r0.J
            android.content.Context r8 = r0.I
            defpackage.mu0.V(r4)
            r4 = r5
            r5 = r8
            goto L4e
        L30:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r2
        L36:
            defpackage.mu0.V(r4)
            r0.I = r5
            r0.J = r6
            r0.K = r7
            o53 r4 = defpackage.tq1.b
            r0.L = r4
            r0.O = r1
            java.lang.Object r8 = r4.e(r0)
            el0 r0 = defpackage.el0.I
            if (r8 != r0) goto L4e
            return r0
        L4e:
            java.util.LinkedHashMap r8 = defpackage.tq1.c     // Catch: java.lang.Throwable -> L60
            r8.remove(r7)     // Catch: java.lang.Throwable -> L60
            java.io.File r5 = r6.a(r5, r7)     // Catch: java.lang.Throwable -> L60
            r5.delete()     // Catch: java.lang.Throwable -> L60
            r4.g(r2)
            wd5 r4 = defpackage.wd5.a
            return r4
        L60:
            r5 = move-exception
            r4.g(r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq1.a(android.content.Context, uq1, java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0063, code lost:
    
        if (r5.e(r0) == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[Catch: all -> 0x008b, TRY_LEAVE, TryCatch #1 {all -> 0x008b, blocks: (B:26:0x0066, B:28:0x006e), top: B:25:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r6, defpackage.uq1 r7, java.lang.String r8, defpackage.gj0 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.qq1
            if (r0 == 0) goto L13
            r0 = r9
            qq1 r0 = (defpackage.qq1) r0
            int r1 = r0.O
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.O = r1
            goto L18
        L13:
            qq1 r0 = new qq1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r5 = r0.M
            int r9 = r0.O
            r1 = 2
            r2 = 1
            r3 = 0
            el0 r4 = defpackage.el0.I
            if (r9 == 0) goto L50
            if (r9 == r2) goto L3e
            if (r9 != r1) goto L38
            java.lang.String r6 = r0.K
            java.lang.Object r7 = r0.J
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r8 = r0.I
            m53 r8 = (defpackage.m53) r8
            defpackage.mu0.V(r5)     // Catch: java.lang.Throwable -> L35
            goto L84
        L35:
            r5 = move-exception
            goto L99
        L38:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            return r3
        L3e:
            o53 r6 = r0.L
            java.lang.String r8 = r0.K
            java.lang.Object r7 = r0.J
            uq1 r7 = (defpackage.uq1) r7
            java.lang.Object r9 = r0.I
            android.content.Context r9 = (android.content.Context) r9
            defpackage.mu0.V(r5)
            r5 = r6
            r6 = r9
            goto L66
        L50:
            defpackage.mu0.V(r5)
            r0.I = r6
            r0.J = r7
            r0.K = r8
            o53 r5 = defpackage.tq1.b
            r0.L = r5
            r0.O = r2
            java.lang.Object r9 = r5.e(r0)
            if (r9 != r4) goto L66
            goto L7e
        L66:
            java.util.LinkedHashMap r9 = defpackage.tq1.c     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r2 = r9.get(r8)     // Catch: java.lang.Throwable -> L8b
            if (r2 != 0) goto L8f
            r0.I = r5     // Catch: java.lang.Throwable -> L8b
            r0.J = r9     // Catch: java.lang.Throwable -> L8b
            r0.K = r8     // Catch: java.lang.Throwable -> L8b
            r0.L = r3     // Catch: java.lang.Throwable -> L8b
            r0.O = r1     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r6 = r7.b(r6, r8)     // Catch: java.lang.Throwable -> L8b
            if (r6 != r4) goto L7f
        L7e:
            return r4
        L7f:
            r7 = r8
            r8 = r5
            r5 = r6
            r6 = r7
            r7 = r9
        L84:
            r2 = r5
            mp0 r2 = (defpackage.mp0) r2     // Catch: java.lang.Throwable -> L35
            r7.put(r6, r2)     // Catch: java.lang.Throwable -> L35
            goto L90
        L8b:
            r6 = move-exception
            r8 = r5
            r5 = r6
            goto L99
        L8f:
            r8 = r5
        L90:
            r2.getClass()     // Catch: java.lang.Throwable -> L35
            mp0 r2 = (defpackage.mp0) r2     // Catch: java.lang.Throwable -> L35
            r8.g(r3)
            return r2
        L99:
            r8.g(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq1.b(android.content.Context, uq1, java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r9 == r4) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.Context r6, defpackage.uq1 r7, java.lang.String r8, defpackage.gj0 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.rq1
            if (r0 == 0) goto L13
            r0 = r9
            rq1 r0 = (defpackage.rq1) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            rq1 r0 = new rq1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.I
            int r1 = r0.K
            r2 = 2
            r3 = 1
            el0 r4 = defpackage.el0.I
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.mu0.V(r9)
            return r9
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            r5 = 0
            return r5
        L31:
            defpackage.mu0.V(r9)
            goto L41
        L35:
            defpackage.mu0.V(r9)
            r0.K = r3
            java.lang.Object r9 = r5.b(r6, r7, r8, r0)
            if (r9 != r4) goto L41
            goto L4f
        L41:
            mp0 r9 = (defpackage.mp0) r9
            zf1 r5 = r9.getData()
            r0.K = r2
            java.lang.Object r5 = defpackage.sp0.K(r5, r0)
            if (r5 != r4) goto L50
        L4f:
            return r4
        L50:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq1.c(android.content.Context, uq1, java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r11 == r5) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.Context r7, defpackage.uq1 r8, java.lang.String r9, defpackage.k r10, defpackage.gj0 r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof defpackage.sq1
            if (r0 == 0) goto L13
            r0 = r11
            sq1 r0 = (defpackage.sq1) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            sq1 r0 = new sq1
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.J
            int r1 = r0.L
            r2 = 0
            r3 = 2
            r4 = 1
            el0 r5 = defpackage.el0.I
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.mu0.V(r11)
            return r11
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            return r2
        L31:
            k r10 = r0.I
            defpackage.mu0.V(r11)
            goto L45
        L37:
            defpackage.mu0.V(r11)
            r0.I = r10
            r0.L = r4
            java.lang.Object r11 = r6.b(r7, r8, r9, r0)
            if (r11 != r5) goto L45
            goto L51
        L45:
            mp0 r11 = (defpackage.mp0) r11
            r0.I = r2
            r0.L = r3
            java.lang.Object r6 = r11.a(r10, r0)
            if (r6 != r5) goto L52
        L51:
            return r5
        L52:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq1.d(android.content.Context, uq1, java.lang.String, k, gj0):java.lang.Object");
    }
}
