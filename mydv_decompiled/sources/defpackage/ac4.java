package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ac4 implements a93 {
    public boolean I;
    public Object J;

    /* JADX WARN: Multi-variable type inference failed */
    public ac4(sa5 sa5Var, int i) {
        this.J = sa5Var;
        this.I = i;
    }

    @Override // defpackage.a93
    public /* synthetic */ long C(int i, long j) {
        return 0L;
    }

    @Override // defpackage.a93
    public long V(int i, long j, long j2) {
        if (!this.I) {
            return 0L;
        }
        oc4 oc4Var = (oc4) this.J;
        if (oc4Var.a.a()) {
            return 0L;
        }
        return oc4Var.i(oc4Var.e(oc4Var.a.e(oc4Var.e(oc4Var.h(j2)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.a93
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g0(long r4, long r6, defpackage.fj0 r8) {
        /*
            r3 = this;
            boolean r4 = r8 instanceof defpackage.zb4
            if (r4 == 0) goto L13
            r4 = r8
            zb4 r4 = (defpackage.zb4) r4
            int r5 = r4.L
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.L = r5
            goto L1a
        L13:
            zb4 r4 = new zb4
            gj0 r8 = (defpackage.gj0) r8
            r4.<init>(r3, r8)
        L1a:
            java.lang.Object r5 = r4.J
            int r8 = r4.L
            r0 = 1
            if (r8 == 0) goto L30
            if (r8 != r0) goto L29
            long r6 = r4.I
            defpackage.mu0.V(r5)
            goto L4f
        L29:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r3)
            r3 = 0
            return r3
        L30:
            defpackage.mu0.V(r5)
            boolean r5 = r3.I
            r1 = 0
            if (r5 == 0) goto L59
            java.lang.Object r3 = r3.J
            oc4 r3 = (defpackage.oc4) r3
            boolean r5 = r3.i
            if (r5 == 0) goto L42
            goto L55
        L42:
            r4.I = r6
            r4.L = r0
            java.lang.Object r5 = r3.a(r6, r4)
            el0 r3 = defpackage.el0.I
            if (r5 != r3) goto L4f
            return r3
        L4f:
            ji5 r5 = (defpackage.ji5) r5
            long r1 = r5.j()
        L55:
            long r1 = defpackage.ji5.f(r6, r1)
        L59:
            ji5 r3 = defpackage.ji5.a(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ac4.g0(long, long, fj0):java.lang.Object");
    }

    @Override // defpackage.a93
    public /* synthetic */ Object w(long j, fj0 fj0Var) {
        return i82.v();
    }
}
