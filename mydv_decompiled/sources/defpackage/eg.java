package defpackage;

import android.view.Choreographer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class eg implements s13 {
    public final /* synthetic */ byte I;
    public final Object J;
    public final Object K;

    public eg(s13 s13Var) {
        this.I = (byte) 1;
        this.J = s13Var;
        this.K = new u92();
    }

    private final Object a(tm1 tm1Var, fj0 fj0Var) {
        bg bgVar = (bg) this.K;
        byte b = 1;
        k10 k10Var = new k10(1, mu0.G(fj0Var));
        k10Var.t();
        dg dgVar = new dg(k10Var, this, tm1Var);
        if (j42.c(bgVar.I, (Choreographer) this.J)) {
            synchronized (bgVar.K) {
                bgVar.M.add(dgVar);
                if (!bgVar.P) {
                    bgVar.P = true;
                    bgVar.I.postFrameCallback(bgVar.Q);
                }
            }
            k10Var.v(new cg(bgVar, dgVar, (byte) 0));
        } else {
            ((Choreographer) this.J).postFrameCallback(dgVar);
            k10Var.v(new ee(this, dgVar, b));
        }
        return k10Var.r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    @Override // defpackage.s13
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(defpackage.tm1 r8, defpackage.fj0 r9) {
        /*
            r7 = this;
            byte r0 = r7.I
            switch(r0) {
                case 0: goto L91;
                default: goto L5;
            }
        L5:
            boolean r0 = r9 instanceof defpackage.ll3
            if (r0 == 0) goto L18
            r0 = r9
            ll3 r0 = (defpackage.ll3) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.L = r1
            goto L1d
        L18:
            ll3 r0 = new ll3
            r0.<init>(r7, r9)
        L1d:
            java.lang.Object r9 = r0.J
            el0 r1 = defpackage.el0.I
            int r2 = r0.L
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r4) goto L30
            defpackage.mu0.V(r9)
            goto L8d
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            r9 = r3
            goto L8d
        L37:
            tm1 r8 = r0.I
            defpackage.mu0.V(r9)
            goto L7e
        L3d:
            defpackage.mu0.V(r9)
            java.lang.Object r9 = r7.K
            u92 r9 = (defpackage.u92) r9
            r0.I = r8
            r0.L = r5
            boolean r2 = r9.a()
            if (r2 == 0) goto L51
            wd5 r9 = defpackage.wd5.a
            goto L7b
        L51:
            k10 r2 = new k10
            fj0 r6 = defpackage.mu0.G(r0)
            r2.<init>(r5, r6)
            r2.t()
            java.lang.Object r5 = r9.b
            monitor-enter(r5)
            java.lang.Object r6 = r9.c     // Catch: java.lang.Throwable -> L8e
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L8e
            r6.add(r2)     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r5)
            ee r5 = new ee
            r6 = 9
            r5.<init>(r9, r2, r6)
            r2.v(r5)
            java.lang.Object r9 = r2.r()
            if (r9 != r1) goto L79
            goto L7b
        L79:
            wd5 r9 = defpackage.wd5.a
        L7b:
            if (r9 != r1) goto L7e
            goto L8c
        L7e:
            java.lang.Object r7 = r7.J
            s13 r7 = (defpackage.s13) r7
            r0.I = r3
            r0.L = r4
            java.lang.Object r9 = r7.E(r8, r0)
            if (r9 != r1) goto L8d
        L8c:
            r9 = r1
        L8d:
            return r9
        L8e:
            r7 = move-exception
            monitor-exit(r5)
            throw r7
        L91:
            java.lang.Object r7 = r7.a(r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg.E(tm1, fj0):java.lang.Object");
    }

    @Override // defpackage.tk0
    public final Object fold(Object obj, hn1 hn1Var) {
        switch (this.I) {
        }
        return p70.Q(this, obj, hn1Var);
    }

    @Override // defpackage.tk0
    public final rk0 get(sk0 sk0Var) {
        switch (this.I) {
        }
        return p70.R(this, sk0Var);
    }

    @Override // defpackage.rk0
    public final sk0 getKey() {
        switch (this.I) {
        }
        return q8.s0;
    }

    @Override // defpackage.tk0
    public final tk0 minusKey(sk0 sk0Var) {
        switch (this.I) {
        }
        return p70.m0(this, sk0Var);
    }

    @Override // defpackage.tk0
    public final tk0 plus(tk0 tk0Var) {
        switch (this.I) {
        }
        return p70.p0(this, tk0Var);
    }

    public eg(Choreographer choreographer, bg bgVar) {
        this.I = (byte) 0;
        this.J = choreographer;
        this.K = bgVar;
    }
}
