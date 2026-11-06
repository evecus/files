package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hk4 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final /* synthetic */ ik4 b;

    public hk4(ik4 ik4Var) {
        this.b = ik4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r5, java.lang.String r6, defpackage.gj0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ek4
            if (r0 == 0) goto L13
            r0 = r7
            ek4 r0 = (defpackage.ek4) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            ek4 r0 = new ek4
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.J
            int r1 = r0.L
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.lang.String r6 = r0.I
            defpackage.mu0.V(r7)
            goto L42
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.mu0.V(r7)
            ik4 r7 = r4.b
            l95 r7 = r7.c
            r0.I = r6
            r0.L = r2
            java.lang.Object r7 = r7.g(r5, r6, r0)
            el0 r5 = defpackage.el0.I
            if (r7 != r5) goto L42
            return r5
        L42:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
            java.util.LinkedHashMap r4 = r4.a
            java.lang.Object r4 = r4.get(r6)
            vo r4 = (defpackage.vo) r4
            r6 = 0
            if (r4 == 0) goto L5a
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.b
            boolean r4 = r4.get()
            goto L5b
        L5a:
            r4 = r6
        L5b:
            if (r4 == 0) goto L60
            if (r5 == 0) goto L60
            goto L61
        L60:
            r2 = r6
        L61:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk4.a(android.content.Context, java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (r13 == r9) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.vo r12, defpackage.gj0 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.fk4
            if (r0 == 0) goto L13
            r0 = r13
            fk4 r0 = (defpackage.fk4) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            fk4 r0 = new fk4
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.I
            int r1 = r0.K
            r2 = 0
            java.util.LinkedHashMap r11 = r11.a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L37
            if (r1 == r5) goto L32
            if (r1 != r4) goto L2c
            defpackage.mu0.V(r13)
            goto L76
        L2c:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r11)
            return r3
        L32:
            defpackage.mu0.V(r13)
            goto Lde
        L37:
            defpackage.mu0.V(r13)
            iz r13 = r12.d
            java.lang.String r1 = r12.a
            java.util.concurrent.atomic.AtomicBoolean r6 = r12.c
            java.util.concurrent.atomic.AtomicBoolean r7 = r12.b
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L47:
            java.lang.Object r9 = r13.f()
            java.lang.Object r10 = defpackage.a50.a(r9)
            if (r10 == 0) goto L54
            r8.add(r10)
        L54:
            boolean r9 = r9 instanceof defpackage.z40
            if (r9 == 0) goto L47
            boolean r13 = r7.get()
            el0 r9 = defpackage.el0.I
            if (r13 == 0) goto L93
            boolean r13 = r6.get()
            if (r13 != 0) goto L93
            boolean r13 = r8.isEmpty()
            if (r13 == 0) goto L6d
            goto L93
        L6d:
            r0.K = r4
            java.lang.Object r13 = defpackage.vo.d(r12, r8, r0)
            if (r13 != r9) goto L76
            goto Ldd
        L76:
            r12 = r13
            vo r12 = (defpackage.vo) r12
            java.lang.String r0 = r12.a
            java.lang.Object r11 = r11.put(r0, r12)
            vo r11 = (defpackage.vo) r11
            if (r11 == 0) goto L92
            iz r12 = r11.d
            r12.c(r3)
            java.util.concurrent.atomic.AtomicBoolean r12 = r11.b
            r12.set(r2)
            x52 r11 = r11.k
            r11.e(r3)
        L92:
            return r13
        L93:
            java.lang.String r12 = "Closing session "
            java.lang.String r13 = " wasOpen="
            java.lang.StringBuilder r12 = defpackage.r7.E(r12, r1, r13)
            boolean r13 = r7.get()
            r13 = r13 ^ r5
            r12.append(r13)
            java.lang.String r13 = " hasError="
            r12.append(r13)
            boolean r13 = r6.get()
            r12.append(r13)
            java.lang.String r13 = " events="
            r12.append(r13)
            r12.append(r8)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "GlanceSessionManager"
            android.util.Log.d(r13, r12)
            r0.K = r5
            java.lang.Object r11 = r11.remove(r1)
            vo r11 = (defpackage.vo) r11
            if (r11 == 0) goto Ld9
            iz r12 = r11.d
            r12.c(r3)
            java.util.concurrent.atomic.AtomicBoolean r12 = r11.b
            r12.set(r2)
            x52 r11 = r11.k
            r11.e(r3)
        Ld9:
            wd5 r11 = defpackage.wd5.a
            if (r11 != r9) goto Lde
        Ldd:
            return r9
        Lde:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk4.b(vo, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.Context r26, defpackage.vo r27, defpackage.gj0 r28) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk4.c(android.content.Context, vo, gj0):java.lang.Object");
    }
}
