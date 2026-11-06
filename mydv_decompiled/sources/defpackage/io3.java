package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class io3 {
    public static final i51 a = new i51(new wd3((byte) 5), (byte) 1);

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.hh2 r4, defpackage.n6 r5, defpackage.gj0 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.go3
            if (r0 == 0) goto L13
            r0 = r6
            go3 r0 = (defpackage.go3) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            go3 r0 = new go3
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.J
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return
        L27:
            d92 r4 = defpackage.r7.s(r6)
            throw r4
        L2c:
            defpackage.mu0.V(r6)
            k13 r6 = r4.getNode()
            boolean r6 = r6.isAttached()
            if (r6 == 0) goto L5a
            qh3 r6 = defpackage.ut0.V(r4)
            wa2 r4 = defpackage.ut0.U(r4)
            af0 r4 = r4.j0
            zl3 r4 = (defpackage.zl3) r4
            r4.getClass()
            i51 r1 = defpackage.io3.a
            java.lang.Object r4 = defpackage.p70.r0(r4, r1)
            if (r4 != 0) goto L56
            r0.J = r2
            b(r6, r5, r0)
            return
        L56:
            defpackage.zl1.c()
            return
        L5a:
            java.lang.String r4 = "establishTextInputSession called from an unattached node"
            defpackage.s83.t(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io3.a(hh2, n6, gj0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.qh3 r4, defpackage.hn1 r5, defpackage.gj0 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ho3
            if (r0 == 0) goto L13
            r0 = r6
            ho3 r0 = (defpackage.ho3) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            ho3 r0 = new ho3
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.J
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 == r2) goto L2f
            r4 = 2
            if (r1 == r4) goto L2a
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return
        L2a:
            d92 r4 = defpackage.r7.s(r6)
            throw r4
        L2f:
            defpackage.mu0.V(r6)
            goto L41
        L33:
            defpackage.mu0.V(r6)
            r0.J = r2
            java.lang.Object r4 = r4.textInputSession(r5, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L41
            return
        L41:
            defpackage.zy.n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io3.b(qh3, hn1, gj0):void");
    }
}
