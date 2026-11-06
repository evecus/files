package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class z15 {
    public static final m31 a = new m31(3, null, 2);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0047 -> B:10:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.q05 r5, boolean r6, defpackage.lp3 r7, defpackage.fu r8) {
        /*
            boolean r0 = r8 instanceof defpackage.q15
            if (r0 == 0) goto L13
            r0 = r8
            q15 r0 = (defpackage.q15) r0
            int r1 = r0.M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.M = r1
            goto L18
        L13:
            q15 r0 = new q15
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.L
            int r1 = r0.M
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.K
            lp3 r6 = r0.J
            q05 r7 = r0.I
            defpackage.mu0.V(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            r5 = 0
            return r5
        L36:
            defpackage.mu0.V(r8)
        L39:
            r0.I = r5
            r0.J = r7
            r0.K = r6
            r0.M = r2
            java.lang.Object r8 = r5.b(r7, r0)
            el0 r1 = defpackage.el0.I
            if (r8 != r1) goto L4a
            return r1
        L4a:
            kp3 r8 = (defpackage.kp3) r8
            boolean r1 = e(r8, r6)
            if (r1 == 0) goto L39
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z15.a(q05, boolean, lp3, fu):java.lang.Object");
    }

    public static /* synthetic */ Object b(q05 q05Var, fu fuVar, int i) {
        return a(q05Var, (i & 1) != 0, lp3.J, fuVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a A[LOOP:0: B:11:0x0048->B:12:0x004a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003b -> B:10:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.q05 r7, defpackage.gj0 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.r15
            if (r0 == 0) goto L13
            r0 = r8
            r15 r0 = (defpackage.r15) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            r15 r0 = new r15
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.J
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            q05 r7 = r0.I
            defpackage.mu0.V(r8)
            goto L3e
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.mu0.V(r8)
        L31:
            r0.I = r7
            r0.K = r2
            java.lang.Object r8 = defpackage.pt1.g(r7, r0)
            el0 r1 = defpackage.el0.I
            if (r8 != r1) goto L3e
            return r1
        L3e:
            kp3 r8 = (defpackage.kp3) r8
            java.util.List r1 = r8.a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L48:
            if (r5 >= r3) goto L56
            java.lang.Object r6 = r1.get(r5)
            rp3 r6 = (defpackage.rp3) r6
            r6.a()
            int r5 = r5 + 1
            goto L48
        L56:
            java.util.List r8 = r8.a
            int r1 = r8.size()
        L5c:
            if (r4 >= r1) goto L6c
            java.lang.Object r3 = r8.get(r4)
            rp3 r3 = (defpackage.rp3) r3
            boolean r3 = r3.d
            if (r3 == 0) goto L69
            goto L31
        L69:
            int r4 = r4 + 1
            goto L5c
        L6c:
            wd5 r7 = defpackage.wd5.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z15.c(q05, gj0):java.lang.Object");
    }

    public static Object d(xp3 xp3Var, r60 r60Var, tm1 tm1Var, nr4 nr4Var, tm1 tm1Var2, fj0 fj0Var, int i) {
        r60 r60Var2 = (i & 1) != 0 ? null : r60Var;
        tm1 tm1Var3 = (i & 2) != 0 ? null : tm1Var;
        k05 k05Var = nr4Var;
        if ((i & 4) != 0) {
            k05Var = a;
        }
        Object o0 = i42.o0(new tg0(xp3Var, r60Var2, tm1Var3, k05Var, tm1Var2, null, (byte) 3), fj0Var);
        return o0 == el0.I ? o0 : wd5.a;
    }

    public static boolean e(kp3 kp3Var, boolean z) {
        List list = kp3Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            rp3 rp3Var = (rp3) list.get(i);
            if (!(z ? dq2.l(rp3Var) : dq2.m(rp3Var))) {
                return false;
            }
        }
        return true;
    }

    public static rv4 f(dl0 dl0Var, v52 v52Var, hn1 hn1Var) {
        return p70.g0(dl0Var, null, gl0.L, new eg1(v52Var, hn1Var, null, (byte) 6), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c0  */
    /* JADX WARN: Type inference failed for: r0v23, types: [v52] */
    /* JADX WARN: Type inference failed for: r15v21, types: [java.lang.Object, tm1] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.q05 r22, defpackage.dl0 r23, defpackage.ts3 r24, defpackage.tm1 r25, defpackage.tm1 r26, defpackage.in1 r27, defpackage.tm1 r28, defpackage.fu r29) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z15.g(q05, dl0, ts3, tm1, tm1, in1, tm1, fu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.q05 r7, defpackage.lp3 r8, defpackage.gj0 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.x15
            if (r0 == 0) goto L13
            r0 = r9
            x15 r0 = (defpackage.x15) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            x15 r0 = new x15
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.J
            int r1 = r0.K
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            r24 r7 = r0.I
            defpackage.mu0.V(r9)     // Catch: defpackage.mp3 -> L59
            goto L56
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            return r2
        L2e:
            defpackage.mu0.V(r9)
            r24 r9 = new r24
            r9.<init>()
            qr2 r1 = defpackage.qr2.a
            r9.I = r1
            gr5 r1 = r7.f()     // Catch: defpackage.mp3 -> L59
            long r4 = r1.b()     // Catch: defpackage.mp3 -> L59
            uk1 r1 = new uk1     // Catch: defpackage.mp3 -> L59
            r6 = 2
            r1.<init>(r8, r9, r2, r6)     // Catch: defpackage.mp3 -> L59
            r0.I = r9     // Catch: defpackage.mp3 -> L59
            r0.K = r3     // Catch: defpackage.mp3 -> L59
            java.lang.Object r7 = r7.g(r4, r1, r0)     // Catch: defpackage.mp3 -> L59
            el0 r8 = defpackage.el0.I
            if (r7 != r8) goto L55
            return r8
        L55:
            r7 = r9
        L56:
            java.lang.Object r7 = r7.I
            return r7
        L59:
            sr2 r7 = defpackage.sr2.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z15.h(q05, lp3, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c7, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        if (r0 == r7) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.q05 r17, defpackage.lp3 r18, defpackage.fu r19) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z15.i(q05, lp3, fu):java.lang.Object");
    }
}
