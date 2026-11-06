package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class p43 extends f54 implements hn1 {
    public h43 J;
    public q43 K;
    public long[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public /* synthetic */ Object S;
    public final /* synthetic */ q43 T;
    public final /* synthetic */ h43 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p43(q43 q43Var, h43 h43Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.T = q43Var;
        this.U = h43Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        p43 p43Var = new p43(this.T, this.U, fj0Var);
        p43Var.S = obj;
        return p43Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((p43) create((pj4) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:14:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:6:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006d -> B:5:0x0094). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            boolean r1 = r0.R
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 != r4) goto L25
            int r1 = r0.P
            int r5 = r0.O
            long r6 = r0.Q
            int r8 = r0.N
            int r9 = r0.M
            long[] r10 = r0.L
            q43 r11 = r0.K
            h43 r12 = r0.J
            java.lang.Object r13 = r0.S
            pj4 r13 = (defpackage.pj4) r13
            defpackage.mu0.V(r21)
            goto L94
        L25:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r0)
            r0 = 0
            return r0
        L2c:
            defpackage.mu0.V(r21)
            java.lang.Object r1 = r0.S
            pj4 r1 = (defpackage.pj4) r1
            q43 r5 = r0.T
            o43 r6 = r5.J
            long[] r6 = r6.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            h43 r8 = r0.U
            r9 = r2
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9f
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L64:
            if (r1 >= r5) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L94
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.J = r2
            o43 r3 = r11.J
            java.lang.Object[] r3 = r3.b
            r2 = r3[r2]
            r0.S = r13
            r0.J = r12
            r0.K = r11
            r0.L = r10
            r0.M = r9
            r0.N = r8
            r0.Q = r6
            r0.O = r5
            r0.P = r1
            r0.R = r4
            r13.d(r0, r2)
            el0 r0 = defpackage.el0.I
            return r0
        L94:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L64
        L97:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        L9f:
            if (r9 == r7) goto La4
            int r9 = r9 + 1
            goto L41
        La4:
            wd5 r0 = defpackage.wd5.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p43.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
