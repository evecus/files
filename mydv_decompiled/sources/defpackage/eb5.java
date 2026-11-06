package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class eb5 extends k05 implements hn1 {
    public hd3[] I;
    public fb5 J;
    public p95 K;
    public int L;
    public int M;
    public int N;
    public byte O;
    public final /* synthetic */ hd3[] P;
    public final /* synthetic */ fb5 Q;
    public final /* synthetic */ p95 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb5(hd3[] hd3VarArr, fb5 fb5Var, p95 p95Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.P = hd3VarArr;
        this.Q = fb5Var;
        this.R = p95Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new eb5(this.P, this.Q, this.R, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((eb5) create((lq3) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r7.d(r6, r12, r11) == r10) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0072 -> B:10:0x0073). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            byte r0 = r11.O
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L21
            if (r0 == r3) goto Lb
            if (r0 != r2) goto L1b
        Lb:
            int r0 = r11.N
            int r4 = r11.M
            int r5 = r11.L
            p95 r6 = r11.K
            fb5 r7 = r11.J
            hd3[] r8 = r11.I
            defpackage.mu0.V(r12)
            goto L57
        L1b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r11)
            return r1
        L21:
            defpackage.mu0.V(r12)
            hd3[] r12 = r11.P
            int r0 = r12.length
            r4 = 0
            fb5 r5 = r11.Q
            p95 r6 = r11.R
            r8 = r12
            r12 = r4
            r7 = r5
        L2f:
            if (r4 >= r0) goto L75
            r5 = r8[r4]
            int r9 = r12 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L72
            el0 r10 = defpackage.el0.I
            if (r5 == r3) goto L5d
            if (r5 != r2) goto L59
            r11.I = r8
            r11.J = r7
            r11.K = r6
            r11.L = r9
            r11.M = r4
            r11.N = r0
            r11.O = r2
            java.lang.Object r12 = r7.e(r6, r12, r11)
            if (r12 != r10) goto L56
            goto L71
        L56:
            r5 = r9
        L57:
            r12 = r5
            goto L73
        L59:
            defpackage.s83.v()
            return r1
        L5d:
            r11.I = r8
            r11.J = r7
            r11.K = r6
            r11.L = r9
            r11.M = r4
            r11.N = r0
            r11.O = r3
            java.lang.Object r12 = r7.d(r6, r12, r11)
            if (r12 != r10) goto L56
        L71:
            return r10
        L72:
            r12 = r9
        L73:
            int r4 = r4 + r3
            goto L2f
        L75:
            wd5 r11 = defpackage.wd5.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
