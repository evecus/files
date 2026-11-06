package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ag5 extends k05 implements hn1 {
    public byte I;
    public final /* synthetic */ hu2 J;
    public final /* synthetic */ String K;
    public final /* synthetic */ int L;
    public final /* synthetic */ List M;
    public final /* synthetic */ is0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag5(hu2 hu2Var, String str, int i, List list, is0 is0Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = hu2Var;
        this.K = str;
        this.L = i;
        this.M = list;
        this.N = is0Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new ag5(this.J, this.K, this.L, this.M, this.N, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((ag5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r4 == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if (r5.N(r4.K, r4) == r3) goto L17;
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            byte r0 = r4.I
            r1 = 2
            r2 = 1
            el0 r3 = defpackage.el0.I
            if (r0 == 0) goto L1f
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.mu0.V(r5)
            goto L46
        L10:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L17:
            defpackage.mu0.V(r5)
            h54 r5 = (defpackage.h54) r5
            java.lang.Object r5 = r5.I
            goto L31
        L1f:
            defpackage.mu0.V(r5)
            hu2 r5 = r4.J
            kq5 r5 = r5.g
            r4.I = r2
            java.lang.String r0 = r4.K
            java.lang.Object r5 = r5.N(r0, r4)
            if (r5 != r3) goto L31
            goto L45
        L31:
            java.util.List r5 = r4.M
            int r5 = r5.size()
            int r0 = r4.L
            if (r0 >= r5) goto L46
            r4.I = r1
            is0 r5 = r4.N
            java.lang.Object r4 = defpackage.jj3.g(r5, r0, r4)
            if (r4 != r3) goto L46
        L45:
            return r3
        L46:
            wd5 r4 = defpackage.wd5.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ag5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
