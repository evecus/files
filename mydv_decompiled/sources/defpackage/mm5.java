package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mm5 extends k05 implements hn1 {
    public byte I;
    public /* synthetic */ Object J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ List L;
    public final /* synthetic */ ag2 M;
    public final /* synthetic */ int N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ ki1 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm5(boolean z, List list, ag2 ag2Var, int i, t43 t43Var, ki1 ki1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = z;
        this.L = list;
        this.M = ag2Var;
        this.N = i;
        this.O = t43Var;
        this.P = ki1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        mm5 mm5Var = new mm5(this.K, this.L, this.M, this.N, this.O, this.P, fj0Var);
        mm5Var.J = obj;
        return mm5Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((mm5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (defpackage.rt0.n(80, r6) == r5) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (defpackage.ag2.j(r6.M, r7, r6) == r5) goto L21;
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.J
            dl0 r0 = (defpackage.dl0) r0
            byte r1 = r6.I
            t43 r2 = r6.O
            r3 = 2
            r4 = 1
            el0 r5 = defpackage.el0.I
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L16
            defpackage.mu0.V(r7)
            goto L5b
        L16:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            r6 = 0
            return r6
        L1d:
            defpackage.mu0.V(r7)
            goto L4e
        L21:
            defpackage.mu0.V(r7)
            boolean r7 = r6.K
            if (r7 != 0) goto L67
            java.util.List r7 = r6.L
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L67
            ta1 r7 = defpackage.on5.a
            java.lang.Object r7 = r2.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L67
            int r7 = r6.N
            int r7 = r7 + r4
            r6.J = r0
            r6.I = r4
            ag2 r1 = r6.M
            java.lang.Object r7 = defpackage.ag2.j(r1, r7, r6)
            if (r7 != r5) goto L4e
            goto L5a
        L4e:
            r6.J = r0
            r6.I = r3
            r0 = 80
            java.lang.Object r7 = defpackage.rt0.n(r0, r6)
            if (r7 != r5) goto L5b
        L5a:
            return r5
        L5b:
            ki1 r6 = r6.P
            defpackage.ki1.a(r6)     // Catch: java.lang.Throwable -> L60
        L60:
            ta1 r6 = defpackage.on5.a
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r2.setValue(r6)
        L67:
            wd5 r6 = defpackage.wd5.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mm5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
