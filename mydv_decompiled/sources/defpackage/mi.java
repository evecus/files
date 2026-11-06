package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class mi implements ag1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ mi(Object obj, Object obj2, Object obj3, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r10 == r9) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    @Override // defpackage.ag1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r11, defpackage.fj0 r12) {
        /*
            r10 = this;
            byte r0 = r10.I
            java.lang.Object r1 = r10.L
            wd5 r2 = defpackage.wd5.a
            java.lang.Object r3 = r10.J
            java.lang.Object r4 = r10.K
            switch(r0) {
                case 0: goto L81;
                default: goto Ld;
            }
        Ld:
            ag1 r4 = (defpackage.ag1) r4
            n24 r3 = (defpackage.n24) r3
            boolean r0 = r12 instanceof defpackage.og1
            if (r0 == 0) goto L24
            r0 = r12
            og1 r0 = (defpackage.og1) r0
            int r5 = r0.L
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L24
            int r5 = r5 - r6
            r0.L = r5
            goto L29
        L24:
            og1 r0 = new og1
            r0.<init>(r10, r12)
        L29:
            java.lang.Object r10 = r0.J
            int r12 = r0.L
            r5 = 0
            r6 = 3
            r7 = 2
            r8 = 1
            el0 r9 = defpackage.el0.I
            if (r12 == 0) goto L4c
            if (r12 == r8) goto L3b
            if (r12 == r7) goto L46
            if (r12 != r6) goto L3f
        L3b:
            defpackage.mu0.V(r10)
            goto L80
        L3f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r10)
            r2 = r5
            goto L80
        L46:
            java.lang.Object r11 = r0.I
            defpackage.mu0.V(r10)
            goto L6b
        L4c:
            defpackage.mu0.V(r10)
            boolean r10 = r3.I
            if (r10 == 0) goto L5e
            r0.I = r5
            r0.L = r8
            java.lang.Object r10 = r4.emit(r11, r0)
            if (r10 != r9) goto L80
            goto L7f
        L5e:
            hn1 r1 = (defpackage.hn1) r1
            r0.I = r11
            r0.L = r7
            java.lang.Object r10 = r1.invoke(r11, r0)
            if (r10 != r9) goto L6b
            goto L7f
        L6b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L80
            r3.I = r8
            r0.I = r5
            r0.L = r6
            java.lang.Object r10 = r4.emit(r11, r0)
            if (r10 != r9) goto L80
        L7f:
            r2 = r9
        L80:
            return r2
        L81:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r10 = r11.booleanValue()
            ea5 r4 = (defpackage.ea5) r4
            au3 r3 = (defpackage.au3) r3
            if (r10 == 0) goto Lac
            t43 r1 = (defpackage.t43) r1
            java.lang.Object r10 = r1.getValue()
            hn1 r10 = (defpackage.hn1) r10
            ss4 r11 = r4.a
            java.lang.Object r11 = r11.d()
            jk3 r12 = r4.d
            java.lang.Object r12 = r12.getValue()
            java.lang.Object r10 = r10.invoke(r11, r12)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            goto Lad
        Lac:
            r10 = 0
        Lad:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r3.setValue(r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mi.emit(java.lang.Object, fj0):java.lang.Object");
    }
}
