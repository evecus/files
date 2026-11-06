package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class j53 extends k05 implements hn1 {
    public m53 I;
    public Object J;
    public Object K;
    public k53 L;
    public byte M;
    public /* synthetic */ Object N;
    public final /* synthetic */ d53 O;
    public final /* synthetic */ k53 P;
    public final /* synthetic */ hn1 Q;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j53(d53 d53Var, k53 k53Var, hn1 hn1Var, Object obj, fj0 fj0Var) {
        super(2, fj0Var);
        this.O = d53Var;
        this.P = k53Var;
        this.Q = hn1Var;
        this.R = obj;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        j53 j53Var = new j53(this.O, this.P, this.Q, this.R, fj0Var);
        j53Var.N = obj;
        return j53Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((j53) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.fu
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.M
            r1 = 2
            r2 = 1
            r3 = 0
            el0 r4 = defpackage.el0.I
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r8.J
            k53 r0 = (defpackage.k53) r0
            m53 r1 = r8.I
            java.lang.Object r8 = r8.N
            g53 r8 = (defpackage.g53) r8
            defpackage.mu0.V(r9)     // Catch: java.lang.Throwable -> L1c
            goto L90
        L1c:
            r9 = move-exception
            goto Lab
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r8)
            return r3
        L25:
            k53 r0 = r8.L
            java.lang.Object r2 = r8.K
            java.lang.Object r5 = r8.J
            hn1 r5 = (defpackage.hn1) r5
            m53 r6 = r8.I
            java.lang.Object r7 = r8.N
            g53 r7 = (defpackage.g53) r7
            defpackage.mu0.V(r9)
            r9 = r6
            r6 = r5
            r5 = r9
            r9 = r0
            r0 = r7
            goto L78
        L3c:
            defpackage.mu0.V(r9)
            java.lang.Object r9 = r8.N
            dl0 r9 = (defpackage.dl0) r9
            g53 r0 = new g53
            tk0 r9 = r9.getCoroutineContext()
            q8 r5 = defpackage.q8.r0
            rk0 r9 = r9.get(r5)
            r9.getClass()
            v52 r9 = (defpackage.v52) r9
            d53 r5 = r8.O
            r0.<init>(r5, r9)
            k53 r9 = r8.P
            r9.a(r0)
            o53 r5 = r9.b
            r8.N = r0
            r8.I = r5
            hn1 r6 = r8.Q
            r8.J = r6
            java.lang.Object r7 = r8.R
            r8.K = r7
            r8.L = r9
            r8.M = r2
            java.lang.Object r2 = r5.e(r8)
            if (r2 != r4) goto L77
            goto L8a
        L77:
            r2 = r7
        L78:
            r8.N = r0     // Catch: java.lang.Throwable -> La5
            r8.I = r5     // Catch: java.lang.Throwable -> La5
            r8.J = r9     // Catch: java.lang.Throwable -> La5
            r8.K = r3     // Catch: java.lang.Throwable -> La5
            r8.L = r3     // Catch: java.lang.Throwable -> La5
            r8.M = r1     // Catch: java.lang.Throwable -> La5
            java.lang.Object r8 = r6.invoke(r2, r8)     // Catch: java.lang.Throwable -> La5
            if (r8 != r4) goto L8b
        L8a:
            return r4
        L8b:
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        L90:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La3
        L92:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto L99
            goto L9f
        L99:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 == r8) goto L92
        L9f:
            r1.g(r3)
            return r9
        La3:
            r8 = move-exception
            goto Lbb
        La5:
            r8 = move-exception
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        Lab:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La3
        Lad:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 != 0) goto Lba
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 != r8) goto Lba
            goto Lad
        Lba:
            throw r9     // Catch: java.lang.Throwable -> La3
        Lbb:
            r1.g(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j53.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
