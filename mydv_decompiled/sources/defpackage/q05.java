package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class q05 implements iu0, fj0 {
    public final /* synthetic */ r05 I;
    public final k10 J;
    public k10 K;
    public lp3 L = lp3.J;
    public final /* synthetic */ r05 M;

    public q05(r05 r05Var, k10 k10Var) {
        this.M = r05Var;
        this.I = r05Var;
        this.J = k10Var;
    }

    @Override // defpackage.iu0
    public final long B(float f) {
        return this.I.B(f);
    }

    @Override // defpackage.iu0
    public final float F(int i) {
        return this.I.F(i);
    }

    @Override // defpackage.iu0
    public final float H(float f) {
        return f / this.I.getDensity();
    }

    @Override // defpackage.iu0
    public final float L() {
        return this.I.L();
    }

    @Override // defpackage.iu0
    public final float P(float f) {
        return this.I.getDensity() * f;
    }

    @Override // defpackage.iu0
    public final int X(float f) {
        return r7.b(f, this.I);
    }

    public final Object b(lp3 lp3Var, fu fuVar) {
        k10 k10Var = new k10(1, mu0.G(fuVar));
        k10Var.t();
        this.L = lp3Var;
        this.K = k10Var;
        return k10Var.r();
    }

    @Override // defpackage.iu0
    public final long c0(long j) {
        return r7.e(j, this.I);
    }

    public final long d() {
        r05 r05Var = this.M;
        long e = r7.e(ut0.U(r05Var).i0.d(), r05Var);
        long j = r05Var.S;
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (e >> 32)) - ((int) (j >> 32))) / 2.0f;
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (e & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public final gr5 f() {
        return ut0.U(this.M).i0;
    }

    @Override // defpackage.iu0
    public final float f0(long j) {
        return r7.d(j, this.I);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r8, defpackage.hn1 r10, defpackage.gj0 r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.n05
            if (r0 == 0) goto L13
            r0 = r11
            n05 r0 = (defpackage.n05) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            n05 r0 = new n05
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.J
            int r1 = r0.L
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            rv4 r7 = r0.I
            defpackage.mu0.V(r11)     // Catch: java.lang.Throwable -> L28
            goto L68
        L28:
            r8 = move-exception
            goto L72
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            return r2
        L30:
            defpackage.mu0.V(r11)
            r4 = 0
            int r11 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r11 > 0) goto L4a
            k10 r11 = r7.K
            if (r11 == 0) goto L4a
            mp3 r1 = new mp3
            r1.<init>(r8)
            g54 r4 = new g54
            r4.<init>(r1)
            r11.resumeWith(r4)
        L4a:
            r05 r11 = r7.M
            dl0 r11 = r11.getCoroutineScope()
            o05 r1 = new o05
            r1.<init>(r8, r7, r2)
            r8 = 3
            rv4 r8 = defpackage.p70.g0(r11, r2, r2, r1, r8)
            r0.I = r8     // Catch: java.lang.Throwable -> L6e
            r0.L = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r11 = r10.invoke(r7, r0)     // Catch: java.lang.Throwable -> L6e
            el0 r7 = defpackage.el0.I
            if (r11 != r7) goto L67
            return r7
        L67:
            r7 = r8
        L68:
            h10 r8 = defpackage.h10.J
            r7.e(r8)
            return r11
        L6e:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L72:
            h10 r9 = defpackage.h10.J
            r7.e(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q05.g(long, hn1, gj0):java.lang.Object");
    }

    @Override // defpackage.fj0
    public final tk0 getContext() {
        return l91.I;
    }

    @Override // defpackage.iu0
    public final float getDensity() {
        return this.I.getDensity();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(long r5, defpackage.hn1 r7, defpackage.gj0 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.p05
            if (r0 == 0) goto L13
            r0 = r8
            p05 r0 = (defpackage.p05) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            p05 r0 = new p05
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.I
            int r1 = r0.K
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.mu0.V(r8)     // Catch: defpackage.mp3 -> L3b
            return r8
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r2
        L2c:
            defpackage.mu0.V(r8)
            r0.K = r3     // Catch: defpackage.mp3 -> L3b
            java.lang.Object r4 = r4.g(r5, r7, r0)     // Catch: defpackage.mp3 -> L3b
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L3a
            return r5
        L3a:
            return r4
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q05.h(long, hn1, gj0):java.lang.Object");
    }

    @Override // defpackage.iu0
    public final long k(long j) {
        return r7.c(j, this.I);
    }

    @Override // defpackage.iu0
    public final float q(long j) {
        return hf1.f(j, this.I);
    }

    @Override // defpackage.fj0
    public final void resumeWith(Object obj) {
        r05 r05Var = this.M;
        synchronized (r05Var.P) {
            r05Var.O.k(this);
        }
        this.J.resumeWith(obj);
    }
}
