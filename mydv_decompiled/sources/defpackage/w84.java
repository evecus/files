package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class w84 implements zf1 {
    public final /* synthetic */ byte I;
    public final Object J;

    public /* synthetic */ w84(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    @Override // defpackage.zf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(defpackage.ag1 r12, defpackage.fj0 r13) {
        /*
            r11 = this;
            byte r0 = r11.I
            wd5 r1 = defpackage.wd5.a
            java.lang.Object r2 = r11.J
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            el0 r5 = defpackage.el0.I
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1
            switch(r0) {
                case 0: goto L4d;
                default: goto L11;
            }
        L11:
            boolean r0 = r13 instanceof defpackage.um4
            if (r0 == 0) goto L22
            r0 = r13
            um4 r0 = (defpackage.um4) r0
            int r8 = r0.J
            r9 = r8 & r6
            if (r9 == 0) goto L22
            int r8 = r8 - r6
            r0.J = r8
            goto L27
        L22:
            um4 r0 = new um4
            r0.<init>(r11, r13)
        L27:
            java.lang.Object r11 = r0.I
            int r13 = r0.J
            if (r13 == 0) goto L38
            if (r13 != r7) goto L33
            defpackage.mu0.V(r11)
            goto L4c
        L33:
            defpackage.zy.i(r4)
            r1 = r3
            goto L4c
        L38:
            defpackage.mu0.V(r11)
            zf1 r2 = (defpackage.zf1) r2
            vt2 r11 = new vt2
            r13 = 2
            r11.<init>(r12, r13)
            r0.J = r7
            java.lang.Object r11 = r2.collect(r11, r0)
            if (r11 != r5) goto L4c
            r1 = r5
        L4c:
            return r1
        L4d:
            boolean r0 = r13 instanceof defpackage.e2
            if (r0 == 0) goto L5e
            r0 = r13
            e2 r0 = (defpackage.e2) r0
            int r8 = r0.L
            r9 = r8 & r6
            if (r9 == 0) goto L5e
            int r8 = r8 - r6
            r0.L = r8
            goto L63
        L5e:
            e2 r0 = new e2
            r0.<init>(r11, r13)
        L63:
            java.lang.Object r11 = r0.J
            int r13 = r0.L
            if (r13 == 0) goto L78
            if (r13 != r7) goto L73
            s84 r12 = r0.I
            defpackage.mu0.V(r11)     // Catch: java.lang.Throwable -> L71
            goto L97
        L71:
            r11 = move-exception
            goto La1
        L73:
            defpackage.zy.i(r4)
            r1 = r3
            goto L9a
        L78:
            defpackage.mu0.V(r11)
            s84 r11 = new s84
            tk0 r13 = r0.getContext()
            r11.<init>(r12, r13)
            r0.I = r11     // Catch: java.lang.Throwable -> L9f
            r0.L = r7     // Catch: java.lang.Throwable -> L9f
            hn1 r2 = (defpackage.hn1) r2     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r12 = r2.invoke(r11, r0)     // Catch: java.lang.Throwable -> L9f
            if (r12 != r5) goto L91
            goto L92
        L91:
            r12 = r1
        L92:
            if (r12 != r5) goto L96
            r1 = r5
            goto L9a
        L96:
            r12 = r11
        L97:
            r12.releaseIntercepted()
        L9a:
            return r1
        L9b:
            r10 = r12
            r12 = r11
            r11 = r10
            goto La1
        L9f:
            r12 = move-exception
            goto L9b
        La1:
            r12.releaseIntercepted()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w84.collect(ag1, fj0):java.lang.Object");
    }
}
