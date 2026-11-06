package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class xd1 extends k05 implements hn1 {
    public boolean I;
    public int J;
    public int K;
    public byte L;
    public final /* synthetic */ yd1 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd1(yd1 yd1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.M = yd1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.yd1 r7, boolean r8, defpackage.gj0 r9) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd1.f(yd1, boolean, gj0):java.lang.Object");
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new xd1(this.M, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((xd1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0085, code lost:
    
        if (r11 == r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0087, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0050, code lost:
    
        if (r11 == r7) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0085 -> B:6:0x001c). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            yd1 r0 = r10.M
            fw4 r1 = r0.i
            fw4 r2 = r0.k
            byte r3 = r10.L
            r4 = 2
            r5 = 0
            r6 = 1
            el0 r7 = defpackage.el0.I
            if (r3 == 0) goto L2b
            if (r3 == r6) goto L25
            if (r3 != r4) goto L1f
            int r3 = r10.K
            int r6 = r10.J
            boolean r8 = r10.I
            defpackage.mu0.V(r11)
        L1c:
            r9 = r3
            goto L88
        L1f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r10)
            return r5
        L25:
            boolean r3 = r10.I
            defpackage.mu0.V(r11)
            goto L53
        L2b:
            defpackage.mu0.V(r11)
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r1.i(r5, r11)
            r2.h(r5)
            wm4 r11 = r0.c
            p04 r11 = r11.g0
            w43 r11 = r11.I
            fw4 r11 = (defpackage.fw4) r11
            java.lang.Object r11 = r11.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r3 = r11.booleanValue()
            r10.I = r3
            r10.L = r6
            java.lang.Object r11 = f(r0, r3, r10)
            if (r11 != r7) goto L53
            goto L87
        L53:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L90
            java.lang.Object r8 = r2.getValue()
            if (r8 != 0) goto L90
            boolean r8 = r0.d
            r9 = 0
            if (r8 == 0) goto L68
            r6 = 3
            goto L6c
        L68:
            if (r3 == 0) goto L6b
            goto L6c
        L6b:
            r6 = r9
        L6c:
            r8 = r3
        L6d:
            if (r11 != 0) goto L8f
            if (r9 >= r6) goto L8f
            java.lang.Object r3 = r2.getValue()
            if (r3 != 0) goto L8f
            int r3 = r9 + 1
            r10.I = r8
            r10.J = r6
            r10.K = r3
            r10.L = r4
            java.lang.Object r11 = f(r0, r8, r10)
            if (r11 != r7) goto L1c
        L87:
            return r7
        L88:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            goto L6d
        L8f:
            r3 = r8
        L90:
            if (r11 != 0) goto Lb0
            fw4 r10 = r0.e
            java.lang.Object r10 = r10.getValue()
            java.util.List r10 = (java.util.List) r10
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto Lb0
            java.lang.Object r10 = r2.getValue()
            if (r10 != 0) goto Lb0
            if (r3 == 0) goto Lab
            java.lang.String r10 = "未获取到符合条件的视频，请稍后重试或关闭竖屏过滤"
            goto Lad
        Lab:
            java.lang.String r10 = "未获取到视频，请检查认证配置"
        Lad:
            r2.i(r5, r10)
        Lb0:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r1.i(r5, r10)
            wd5 r10 = defpackage.wd5.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
