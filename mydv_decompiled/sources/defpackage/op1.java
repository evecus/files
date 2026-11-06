package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class op1 extends k05 implements hn1 {
    public boolean I;
    public byte J;
    public /* synthetic */ Object K;
    public final /* synthetic */ Context L;
    public final /* synthetic */ lo M;
    public final /* synthetic */ rp1 N;
    public final /* synthetic */ Bundle O;
    public final /* synthetic */ jn1 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op1(Context context, lo loVar, rp1 rp1Var, Bundle bundle, jn1 jn1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = context;
        this.M = loVar;
        this.N = rp1Var;
        this.O = bundle;
        this.P = jn1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        op1 op1Var = new op1(this.L, this.M, this.N, this.O, this.P, fj0Var);
        op1Var.K = obj;
        return op1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((op1) create((hk4) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e A[RETURN] */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            byte r0 = r10.J
            r1 = 0
            android.content.Context r2 = r10.L
            r3 = 3
            r4 = 2
            r5 = 1
            lo r6 = r10.M
            el0 r7 = defpackage.el0.I
            if (r0 == 0) goto L30
            if (r0 == r5) goto L28
            if (r0 == r4) goto L1e
            if (r0 != r3) goto L18
            defpackage.mu0.V(r11)
            return r11
        L18:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r10)
            return r1
        L1e:
            boolean r0 = r10.I
            java.lang.Object r2 = r10.K
            hk4 r2 = (defpackage.hk4) r2
            defpackage.mu0.V(r11)
            goto L6a
        L28:
            java.lang.Object r0 = r10.K
            hk4 r0 = (defpackage.hk4) r0
            defpackage.mu0.V(r11)
            goto L4b
        L30:
            defpackage.mu0.V(r11)
            java.lang.Object r11 = r10.K
            hk4 r11 = (defpackage.hk4) r11
            int r0 = r6.a
            java.lang.String r0 = defpackage.d4.s(r0)
            r10.K = r11
            r10.J = r5
            java.lang.Object r0 = r11.a(r2, r0, r10)
            if (r0 != r7) goto L48
            goto L8d
        L48:
            r9 = r0
            r0 = r11
            r11 = r9
        L4b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L6c
            rp1 r5 = r10.N
            android.os.Bundle r8 = r10.O
            vo r5 = r5.createAppWidgetSession(r2, r6, r8)
            r10.K = r0
            r10.I = r11
            r10.J = r4
            java.lang.Object r2 = r0.c(r2, r5, r10)
            if (r2 != r7) goto L68
            goto L8d
        L68:
            r2 = r0
            r0 = r11
        L6a:
            r11 = r0
            r0 = r2
        L6c:
            int r2 = r6.a
            java.lang.String r2 = defpackage.d4.s(r2)
            java.util.LinkedHashMap r4 = r0.a
            java.lang.Object r2 = r4.get(r2)
            vo r2 = (defpackage.vo) r2
            r2.getClass()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10.K = r1
            r10.J = r3
            jn1 r1 = r10.P
            java.lang.Object r10 = r1.c(r0, r2, r11, r10)
            if (r10 != r7) goto L8e
        L8d:
            return r7
        L8e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.op1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
