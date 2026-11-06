package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class v03 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ List J;
    public final /* synthetic */ hu2 K;
    public final /* synthetic */ int L;
    public final /* synthetic */ tm1 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ t43 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v03(List list, hu2 hu2Var, int i, tm1 tm1Var, t43 t43Var, t43 t43Var2, t43 t43Var3, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = list;
        this.K = hu2Var;
        this.L = i;
        this.M = tm1Var;
        this.N = t43Var;
        this.O = t43Var2;
        this.P = t43Var3;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new v03(this.J, this.K, this.L, this.M, this.N, this.O, this.P, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((v03) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005e  */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r7.I
            r1 = 0
            t43 r2 = r7.O
            t43 r3 = r7.N
            int r4 = r7.L
            r5 = 1
            if (r0 == 0) goto L18
            if (r0 != r5) goto L12
            defpackage.mu0.V(r8)
            goto L53
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            return r1
        L18:
            defpackage.mu0.V(r8)
            k74 r8 = defpackage.w03.a
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r3.setValue(r8)
            r2.setValue(r1)
            java.util.List r8 = r7.J
            java.util.Iterator r8 = r8.iterator()
        L2b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r8.next()
            r6 = r0
            x03 r6 = (defpackage.x03) r6
            int r6 = r6.b
            if (r6 != r4) goto L2b
            r1 = r0
        L3d:
            x03 r1 = (defpackage.x03) r1
            if (r1 == 0) goto L44
            com.github.mytv.dv.model.Aweme r8 = r1.a
            goto L55
        L44:
            hu2 r8 = r7.K
            gx3 r8 = r8.p
            r7.I = r5
            java.lang.Object r8 = r8.u(r4, r7)
            el0 r0 = defpackage.el0.I
            if (r8 != r0) goto L53
            return r0
        L53:
            com.github.mytv.dv.model.Aweme r8 = (com.github.mytv.dv.model.Aweme) r8
        L55:
            k74 r0 = defpackage.w03.a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.setValue(r0)
            if (r8 == 0) goto L69
            t43 r1 = r7.P
            r1.setValue(r0)
            tm1 r7 = r7.M
            r7.invoke(r8)
            goto L7f
        L69:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "第 "
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r8 = " 集还没有加载出来"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r2.setValue(r7)
        L7f:
            wd5 r7 = defpackage.wd5.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v03.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
