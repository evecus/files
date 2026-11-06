package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class d93 {
    public h93 a;
    public h93 b;
    public rm1 c = new eq(this, 21);
    public dl0 d;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, long r10, defpackage.gj0 r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.b93
            if (r0 == 0) goto L14
            r0 = r12
            b93 r0 = (defpackage.b93) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.K = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            b93 r0 = new b93
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.I
            int r1 = r12.K
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.mu0.V(r0)
            goto L70
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            return r2
        L31:
            defpackage.mu0.V(r0)
            goto L55
        L35:
            defpackage.mu0.V(r0)
            h93 r0 = r7.a
            if (r0 == 0) goto L41
            h93 r0 = r0.k0()
            goto L42
        L41:
            r0 = r2
        L42:
            r5 = 0
            el0 r1 = defpackage.el0.I
            if (r0 != 0) goto L5c
            h93 r7 = r7.b
            if (r7 == 0) goto L76
            r12.K = r4
            java.lang.Object r0 = r7.g0(r8, r10, r12)
            if (r0 != r1) goto L55
            goto L6f
        L55:
            ji5 r0 = (defpackage.ji5) r0
            long r5 = r0.j()
            goto L76
        L5c:
            h93 r7 = r7.a
            if (r7 == 0) goto L64
            h93 r2 = r7.k0()
        L64:
            r7 = r2
            if (r7 == 0) goto L76
            r12.K = r3
            java.lang.Object r0 = r7.g0(r8, r10, r12)
            if (r0 != r1) goto L70
        L6f:
            return r1
        L70:
            ji5 r0 = (defpackage.ji5) r0
            long r5 = r0.j()
        L76:
            ji5 r7 = defpackage.ji5.a(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d93.a(long, long, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r5, defpackage.gj0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.c93
            if (r0 == 0) goto L13
            r0 = r7
            c93 r0 = (defpackage.c93) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            c93 r0 = new c93
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.I
            int r1 = r0.K
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.mu0.V(r7)
            goto L44
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r2
        L2c:
            defpackage.mu0.V(r7)
            h93 r4 = r4.a
            if (r4 == 0) goto L37
            h93 r2 = r4.k0()
        L37:
            if (r2 == 0) goto L4b
            r0.K = r3
            java.lang.Object r7 = r2.w(r5, r0)
            el0 r4 = defpackage.el0.I
            if (r7 != r4) goto L44
            return r4
        L44:
            ji5 r7 = (defpackage.ji5) r7
            long r4 = r7.j()
            goto L4d
        L4b:
            r4 = 0
        L4d:
            ji5 r4 = defpackage.ji5.a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d93.b(long, gj0):java.lang.Object");
    }

    public final dl0 c() {
        dl0 dl0Var = (dl0) this.c.invoke();
        if (dl0Var != null) {
            return dl0Var;
        }
        zy.i("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
