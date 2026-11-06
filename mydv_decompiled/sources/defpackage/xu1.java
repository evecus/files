package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xu1 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ ab4 K;
    public final /* synthetic */ ki1 L;
    public final /* synthetic */ int M;
    public final /* synthetic */ List N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu1(boolean z, ab4 ab4Var, ki1 ki1Var, int i, List list, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = z;
        this.K = ab4Var;
        this.L = ki1Var;
        this.M = i;
        this.N = list;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new xu1(this.J, this.K, this.L, this.M, this.N, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((xu1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(1:(1:4)(2:24|25))(4:26|(2:28|(1:30))|19|20)|5|(2:11|(1:13)(2:14|(1:16)))|17|18|19|20) */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r2.I
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto Lb
            defpackage.mu0.V(r3)
            goto L26
        Lb:
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r2)
            r2 = 0
            return r2
        L12:
            defpackage.mu0.V(r3)
            boolean r3 = r2.J
            if (r3 == 0) goto L52
            r2.I = r1
            r0 = 100
            java.lang.Object r3 = defpackage.rt0.n(r0, r2)
            el0 r0 = defpackage.el0.I
            if (r3 != r0) goto L26
            return r0
        L26:
            ab4 r3 = defpackage.ab4.P
            ki1 r0 = r2.L
            ab4 r1 = r2.K
            if (r1 == r3) goto L4f
            ab4 r3 = defpackage.ab4.R
            if (r1 == r3) goto L4f
            ab4 r3 = defpackage.ab4.S
            if (r1 != r3) goto L37
            goto L4f
        L37:
            int r3 = r2.M
            java.util.List r2 = r2.N
            if (r3 < 0) goto L45
            java.lang.Object r2 = r2.get(r3)
            r0 = r2
            ki1 r0 = (defpackage.ki1) r0
            goto L4f
        L45:
            java.lang.Object r2 = defpackage.o70.U0(r2)
            ki1 r2 = (defpackage.ki1) r2
            if (r2 != 0) goto L4e
            goto L4f
        L4e:
            r0 = r2
        L4f:
            defpackage.ki1.a(r0)     // Catch: java.lang.Exception -> L52
        L52:
            wd5 r2 = defpackage.wd5.a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xu1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
