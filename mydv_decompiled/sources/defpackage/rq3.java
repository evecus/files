package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rq3 implements p95, h04 {
    public final eg0 a;
    public final boolean b;
    public final pp c = new pp();
    public final AtomicBoolean d = new AtomicBoolean(false);

    public rq3(eg0 eg0Var, boolean z) {
        this.a = eg0Var;
        this.b = z;
    }

    @Override // defpackage.p95
    public final Object a(o95 o95Var, hn1 hn1Var, k05 k05Var) {
        if (this.d.get()) {
            lq2.l0(21, "Connection is recycled");
            throw null;
        }
        yf0 yf0Var = (yf0) k05Var.getContext().get(yf0.J);
        if (yf0Var != null && yf0Var.I == this) {
            return g(o95Var, hn1Var, k05Var);
        }
        lq2.l0(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // defpackage.jq3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, defpackage.tm1 r7, defpackage.gj0 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.qq3
            if (r0 == 0) goto L13
            r0 = r8
            qq3 r0 = (defpackage.qq3) r0
            int r1 = r0.O
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.O = r1
            goto L18
        L13:
            qq3 r0 = new qq3
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.M
            int r1 = r0.O
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L36
            if (r1 != r2) goto L30
            eg0 r5 = r0.L
            tm1 r7 = r0.K
            java.lang.String r6 = r0.J
            rq3 r0 = r0.I
            defpackage.mu0.V(r8)
            r8 = r5
            r5 = r0
            goto L6c
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            return r3
        L36:
            defpackage.mu0.V(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r5.d
            boolean r8 = r8.get()
            r1 = 21
            if (r8 != 0) goto L95
            tk0 r8 = r0.getContext()
            n84 r4 = defpackage.yf0.J
            rk0 r8 = r8.get(r4)
            yf0 r8 = (defpackage.yf0) r8
            if (r8 == 0) goto L8f
            rq3 r8 = r8.I
            if (r8 != r5) goto L8f
            r0.I = r5
            r0.J = r6
            r0.K = r7
            eg0 r8 = r5.a
            r0.L = r8
            r0.O = r2
            m53 r1 = r8.J
            java.lang.Object r0 = r1.e(r0)
            el0 r1 = defpackage.el0.I
            if (r0 != r1) goto L6c
            return r1
        L6c:
            kq3 r0 = new kq3     // Catch: java.lang.Throwable -> L82
            eg0 r1 = r5.a     // Catch: java.lang.Throwable -> L82
            q84 r6 = r1.Y(r6)     // Catch: java.lang.Throwable -> L82
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L82
            java.lang.Object r5 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L84
            defpackage.mw2.v(r0, r3)     // Catch: java.lang.Throwable -> L82
            r8.g(r3)
            return r5
        L82:
            r5 = move-exception
            goto L8b
        L84:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L86
        L86:
            r6 = move-exception
            defpackage.mw2.v(r0, r5)     // Catch: java.lang.Throwable -> L82
            throw r6     // Catch: java.lang.Throwable -> L82
        L8b:
            r8.g(r3)
            throw r5
        L8f:
            java.lang.String r5 = "Attempted to use connection on a different coroutine"
            defpackage.lq2.l0(r1, r5)
            throw r3
        L95:
            java.lang.String r5 = "Connection is recycled"
            defpackage.lq2.l0(r1, r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq3.b(java.lang.String, tm1, gj0):java.lang.Object");
    }

    @Override // defpackage.h04
    public final o84 c() {
        return this.a;
    }

    @Override // defpackage.p95
    public final Object d(k05 k05Var) {
        if (this.d.get()) {
            lq2.l0(21, "Connection is recycled");
            throw null;
        }
        yf0 yf0Var = (yf0) k05Var.getContext().get(yf0.J);
        if (yf0Var != null && yf0Var.I == this) {
            return Boolean.valueOf(!this.c.isEmpty());
        }
        lq2.l0(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:11:0x004e, B:13:0x005a, B:18:0x0065, B:19:0x0093, B:23:0x006d, B:24:0x0072, B:25:0x0073, B:26:0x0079, B:27:0x007f), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:11:0x004e, B:13:0x005a, B:18:0x0065, B:19:0x0093, B:23:0x006d, B:24:0x0072, B:25:0x0073, B:26:0x0079, B:27:0x007f), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.o95 r7, defpackage.gj0 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "SAVEPOINT '"
            boolean r1 = r8 instanceof defpackage.nq3
            if (r1 == 0) goto L15
            r1 = r8
            nq3 r1 = (defpackage.nq3) r1
            int r2 = r1.N
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.N = r2
            goto L1a
        L15:
            nq3 r1 = new nq3
            r1.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r1.L
            int r2 = r1.N
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            eg0 r6 = r1.K
            o95 r7 = r1.J
            rq3 r1 = r1.I
            defpackage.mu0.V(r8)
            r8 = r6
            r6 = r1
            goto L4e
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            return r4
        L36:
            defpackage.mu0.V(r8)
            r1.I = r6
            r1.J = r7
            eg0 r8 = r6.a
            r1.K = r8
            r1.N = r3
            m53 r2 = r8.J
            java.lang.Object r1 = r2.e(r1)
            el0 r2 = defpackage.el0.I
            if (r1 != r2) goto L4e
            return r2
        L4e:
            pp r1 = r6.c     // Catch: java.lang.Throwable -> L6b
            eg0 r6 = r6.a     // Catch: java.lang.Throwable -> L6b
            int r2 = r1.K     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L7f
            int r7 = r7.ordinal()     // Catch: java.lang.Throwable -> L6b
            if (r7 == 0) goto L79
            if (r7 == r3) goto L73
            r0 = 2
            if (r7 != r0) goto L6d
            java.lang.String r7 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.lq2.D(r6, r7)     // Catch: java.lang.Throwable -> L6b
            goto L93
        L6b:
            r6 = move-exception
            goto La1
        L6d:
            d92 r6 = new d92     // Catch: java.lang.Throwable -> L6b
            r6.<init>()     // Catch: java.lang.Throwable -> L6b
            throw r6     // Catch: java.lang.Throwable -> L6b
        L73:
            java.lang.String r7 = "BEGIN IMMEDIATE TRANSACTION"
            defpackage.lq2.D(r6, r7)     // Catch: java.lang.Throwable -> L6b
            goto L93
        L79:
            java.lang.String r7 = "BEGIN DEFERRED TRANSACTION"
            defpackage.lq2.D(r6, r7)     // Catch: java.lang.Throwable -> L6b
            goto L93
        L7f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L6b
            r7.append(r2)     // Catch: java.lang.Throwable -> L6b
            r0 = 39
            r7.append(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L6b
            defpackage.lq2.D(r6, r7)     // Catch: java.lang.Throwable -> L6b
        L93:
            mq3 r6 = new mq3     // Catch: java.lang.Throwable -> L6b
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L6b
            r1.addLast(r6)     // Catch: java.lang.Throwable -> L6b
            wd5 r6 = defpackage.wd5.a     // Catch: java.lang.Throwable -> L6b
            r8.g(r4)
            return r6
        La1:
            r8.g(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq3.e(o95, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:11:0x0050, B:13:0x005a, B:15:0x0064, B:17:0x006d, B:18:0x00aa, B:22:0x0075, B:23:0x008a, B:25:0x0090, B:26:0x0096, B:27:0x00b0, B:28:0x00b7), top: B:10:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0 A[Catch: all -> 0x0073, TRY_ENTER, TryCatch #0 {all -> 0x0073, blocks: (B:11:0x0050, B:13:0x005a, B:15:0x0064, B:17:0x006d, B:18:0x00aa, B:22:0x0075, B:23:0x008a, B:25:0x0090, B:26:0x0096, B:27:0x00b0, B:28:0x00b7), top: B:10:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r7, defpackage.gj0 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r1 = "RELEASE SAVEPOINT '"
            boolean r2 = r8 instanceof defpackage.oq3
            if (r2 == 0) goto L17
            r2 = r8
            oq3 r2 = (defpackage.oq3) r2
            int r3 = r2.N
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.N = r3
            goto L1c
        L17:
            oq3 r2 = new oq3
            r2.<init>(r6, r8)
        L1c:
            java.lang.Object r8 = r2.L
            int r3 = r2.N
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L38
            if (r3 != r4) goto L32
            boolean r7 = r2.K
            eg0 r6 = r2.J
            rq3 r2 = r2.I
            defpackage.mu0.V(r8)
            r8 = r6
            r6 = r2
            goto L50
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            return r5
        L38:
            defpackage.mu0.V(r8)
            r2.I = r6
            eg0 r8 = r6.a
            r2.J = r8
            r2.K = r7
            r2.N = r4
            m53 r3 = r8.J
            java.lang.Object r2 = r3.e(r2)
            el0 r3 = defpackage.el0.I
            if (r2 != r3) goto L50
            return r3
        L50:
            pp r2 = r6.c     // Catch: java.lang.Throwable -> L73
            eg0 r6 = r6.a     // Catch: java.lang.Throwable -> L73
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L73
            if (r3 != 0) goto Lb0
            java.lang.Object r3 = defpackage.u70.L0(r2)     // Catch: java.lang.Throwable -> L73
            mq3 r3 = (defpackage.mq3) r3     // Catch: java.lang.Throwable -> L73
            r4 = 39
            if (r7 == 0) goto L8a
            r3.getClass()     // Catch: java.lang.Throwable -> L73
            boolean r7 = r2.isEmpty()     // Catch: java.lang.Throwable -> L73
            if (r7 == 0) goto L75
            java.lang.String r7 = "END TRANSACTION"
            defpackage.lq2.D(r6, r7)     // Catch: java.lang.Throwable -> L73
            goto Laa
        L73:
            r6 = move-exception
            goto Lb8
        L75:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L73
            int r0 = r3.a     // Catch: java.lang.Throwable -> L73
            r7.append(r0)     // Catch: java.lang.Throwable -> L73
            r7.append(r4)     // Catch: java.lang.Throwable -> L73
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L73
            defpackage.lq2.D(r6, r7)     // Catch: java.lang.Throwable -> L73
            goto Laa
        L8a:
            boolean r7 = r2.isEmpty()     // Catch: java.lang.Throwable -> L73
            if (r7 == 0) goto L96
            java.lang.String r7 = "ROLLBACK TRANSACTION"
            defpackage.lq2.D(r6, r7)     // Catch: java.lang.Throwable -> L73
            goto Laa
        L96:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L73
            int r0 = r3.a     // Catch: java.lang.Throwable -> L73
            r7.append(r0)     // Catch: java.lang.Throwable -> L73
            r7.append(r4)     // Catch: java.lang.Throwable -> L73
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L73
            defpackage.lq2.D(r6, r7)     // Catch: java.lang.Throwable -> L73
        Laa:
            wd5 r6 = defpackage.wd5.a     // Catch: java.lang.Throwable -> L73
            r8.g(r5)
            return r6
        Lb0:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L73
            java.lang.String r7 = "Not in a transaction"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L73
            throw r6     // Catch: java.lang.Throwable -> L73
        Lb8:
            r8.g(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq3.f(boolean, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        if (r13 != r8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        if (r11 == r8) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.o95 r11, defpackage.hn1 r12, defpackage.gj0 r13) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq3.g(o95, hn1, gj0):java.lang.Object");
    }
}
