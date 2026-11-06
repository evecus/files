package defpackage;

import android.content.Context;
import coil3.ImageLoader;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class n9 extends k05 implements hn1 {
    public ImageLoader I;
    public byte J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ String L;
    public final /* synthetic */ Context M;
    public final /* synthetic */ r80 N;
    public final /* synthetic */ ma4 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(boolean z, String str, Context context, r80 r80Var, ma4 ma4Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = z;
        this.L = str;
        this.M = context;
        this.N = r80Var;
        this.O = ma4Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new n9(this.K, this.L, this.M, this.N, this.O, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((n9) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r1 == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0052, code lost:
    
        if (r11.a(r1, r7, r8, r18) == r10) goto L35;
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            byte r1 = r0.J
            r2 = 3
            r3 = 2
            r4 = 1
            wd5 r5 = defpackage.wd5.a
            r6 = 0
            android.content.Context r7 = r0.M
            java.lang.String r8 = r0.L
            r80 r9 = r0.N
            el0 r10 = defpackage.el0.I
            if (r1 == 0) goto L30
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1e
            defpackage.mu0.V(r19)
            return r5
        L1e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r0)
            return r6
        L24:
            defpackage.mu0.V(r19)
            r1 = r19
            goto L68
        L2a:
            coil3.ImageLoader r1 = r0.I
            defpackage.mu0.V(r19)
            goto L55
        L30:
            defpackage.mu0.V(r19)
            boolean r1 = r0.K
            if (r1 == 0) goto L97
            if (r8 == 0) goto L97
            int r1 = r8.length()
            if (r1 != 0) goto L40
            goto L97
        L40:
            coil3.ImageLoader r1 = coil3.SingletonImageLoader.get(r7)
            boolean r11 = r9.d
            if (r11 == 0) goto L55
            qu4 r11 = defpackage.qu4.a
            r0.I = r1
            r0.J = r4
            java.lang.Object r4 = r11.a(r1, r7, r8, r0)
            if (r4 != r10) goto L55
            goto L96
        L55:
            t80 r4 = r9.a
            t80 r11 = defpackage.t80.K
            if (r4 != r11) goto L97
            ri0 r4 = defpackage.ri0.a
            r0.I = r6
            r0.J = r3
            java.lang.Object r1 = r4.b(r1, r7, r8, r0)
            if (r1 != r10) goto L68
            goto L96
        L68:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L97
            int r1 = r1.intValue()
            if (r1 == 0) goto L97
            long r12 = defpackage.qb.i(r1)
            ma4 r1 = r0.O
            s90 r3 = r9.b
            vj3 r14 = defpackage.xh0.c(r1, r3)
            z70 r1 = r9.c
            double r3 = r1.K
            os0 r1 = defpackage.sx0.a
            m9 r11 = new m9
            r17 = 0
            r15 = r3
            r11.<init>(r12, r14, r15, r17)
            r0.I = r6
            r0.J = r2
            java.lang.Object r0 = defpackage.p70.D0(r1, r11, r0)
            if (r0 != r10) goto L97
        L96:
            return r10
        L97:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
