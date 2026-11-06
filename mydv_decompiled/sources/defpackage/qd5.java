package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class qd5 extends ya4 {
    public final ThreadLocal N;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qd5(defpackage.fj0 r3, defpackage.tk0 r4) {
        /*
            r2 = this;
            n10 r0 = defpackage.n10.K
            rk0 r1 = r4.get(r0)
            if (r1 != 0) goto Ld
            tk0 r0 = r4.plus(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.N = r0
            tk0 r3 = r3.getContext()
            q8 r0 = defpackage.q8.i0
            rk0 r3 = r3.get(r0)
            boolean r3 = r3 instanceof defpackage.vk0
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = defpackage.j42.l0(r4, r3)
            defpackage.j42.Y(r4, r3)
            r2.l0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qd5.<init>(fj0, tk0):void");
    }

    @Override // defpackage.ya4
    public final void i0() {
        k0();
    }

    public final boolean j0() {
        boolean z = this.threadLocalIsSet && this.N.get() == null;
        this.N.remove();
        return !z;
    }

    public final void k0() {
        if (this.threadLocalIsSet) {
            uj3 uj3Var = (uj3) this.N.get();
            if (uj3Var != null) {
                j42.Y((tk0) uj3Var.I, uj3Var.J);
            }
            this.N.remove();
        }
    }

    public final void l0(tk0 tk0Var, Object obj) {
        this.threadLocalIsSet = true;
        this.N.set(new uj3(tk0Var, obj));
    }

    @Override // defpackage.ya4, defpackage.e62
    public final void o(Object obj) {
        k0();
        Object M = mw2.M(obj);
        fj0 fj0Var = this.M;
        tk0 context = fj0Var.getContext();
        Object l0 = j42.l0(context, null);
        qd5 l02 = l0 != j42.s ? qb.l0(fj0Var, context, l0) : null;
        try {
            fj0Var.resumeWith(M);
            if (l02 == null || l02.j0()) {
                j42.Y(context, l0);
            }
        } catch (Throwable th) {
            if (l02 == null || l02.j0()) {
                j42.Y(context, l0);
            }
            throw th;
        }
    }
}
