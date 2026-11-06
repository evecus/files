package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class im2 extends k05 implements hn1 {
    public String I;
    public t43 J;
    public byte K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ Context M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im2(boolean z, Context context, t43 t43Var, t43 t43Var2, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = z;
        this.M = context;
        this.N = t43Var;
        this.O = t43Var2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new im2(this.L, this.M, this.N, this.O, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((im2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        if (defpackage.rt0.n(600, r8) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.K
            r1 = 0
            r2 = 2
            r3 = 1
            wd5 r4 = defpackage.wd5.a
            el0 r5 = defpackage.el0.I
            if (r0 == 0) goto L21
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L15
            t43 r8 = r8.J
            defpackage.mu0.V(r9)
            goto L5a
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r8)
            return r1
        L1b:
            java.lang.String r0 = r8.I
            defpackage.mu0.V(r9)
            goto L42
        L21:
            defpackage.mu0.V(r9)
            t43 r9 = r8.N
            java.lang.Object r9 = r9.getValue()
            r0 = r9
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L30
            goto L5e
        L30:
            boolean r9 = r8.L
            if (r9 != 0) goto L35
            goto L5e
        L35:
            r8.I = r0
            r8.K = r3
            r6 = 600(0x258, double:2.964E-321)
            java.lang.Object r9 = defpackage.rt0.n(r6, r8)
            if (r9 != r5) goto L42
            goto L58
        L42:
            ri0 r9 = defpackage.ri0.a
            android.content.Context r3 = r8.M
            coil3.ImageLoader r6 = coil3.SingletonImageLoader.get(r3)
            r8.I = r1
            t43 r1 = r8.O
            r8.J = r1
            r8.K = r2
            java.lang.Object r9 = r9.b(r6, r3, r0, r8)
            if (r9 != r5) goto L59
        L58:
            return r5
        L59:
            r8 = r1
        L5a:
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto L5f
        L5e:
            return r4
        L5f:
            r8.setValue(r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
