package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class k65 extends k13 implements na2, w31, pi4 {
    public String I;
    public m65 J;
    public kj1 K;
    public int L;
    public boolean M;
    public int N;
    public int O;
    public g80 P;
    public HashMap Q;
    public bk3 R;
    public i65 S;
    public j65 T;

    /* JADX WARN: Type inference failed for: r0v2, types: [i65] */
    @Override // defpackage.pi4
    public final void applySemantics(cj4 cj4Var) {
        i65 i65Var = this.S;
        i65 i65Var2 = i65Var;
        if (i65Var == null) {
            final byte b = 0;
            ?? r0 = new tm1(this) { // from class: i65
                public final /* synthetic */ k65 J;

                {
                    this.J = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x0148  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x014f  */
                @Override // defpackage.tm1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r30) {
                    /*
                        Method dump skipped, instructions count: 350
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.i65.invoke(java.lang.Object):java.lang.Object");
                }
            };
            this.S = r0;
            i65Var2 = r0;
        }
        oj ojVar = new oj(this.I);
        d82[] d82VarArr = aj4.a;
        cj4Var.c(zi4.C, p70.j0(ojVar));
        j65 j65Var = this.T;
        if (j65Var != null) {
            boolean c = j65Var.c();
            bj4 bj4Var = zi4.E;
            d82[] d82VarArr2 = aj4.a;
            d82 d82Var = d82VarArr2[17];
            Boolean valueOf = Boolean.valueOf(c);
            bj4Var.getClass();
            cj4Var.c(bj4Var, valueOf);
            oj ojVar2 = new oj(j65Var.b());
            bj4 bj4Var2 = zi4.D;
            d82 d82Var2 = d82VarArr2[16];
            bj4Var2.getClass();
            cj4Var.c(bj4Var2, ojVar2);
        }
        final byte b2 = 1;
        cj4Var.c(ii4.l, new v4(null, new tm1(this) { // from class: i65
            public final /* synthetic */ k65 J;

            {
                this.J = this;
            }

            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                /*
                    Method dump skipped, instructions count: 350
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.i65.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        final byte b3 = 2;
        cj4Var.c(ii4.m, new v4(null, new tm1(this) { // from class: i65
            public final /* synthetic */ k65 J;

            {
                this.J = this;
            }

            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                /*
                    Method dump skipped, instructions count: 350
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.i65.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        cj4Var.c(ii4.n, new v4(null, new q94(this, (byte) 9)));
        aj4.a(cj4Var, i65Var2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r0 != null) goto L15;
     */
    @Override // defpackage.w31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(defpackage.zh0 r11) {
        /*
            r10 = this;
            boolean r0 = r10.isAttached()
            if (r0 != 0) goto L8
            goto La0
        L8:
            j65 r0 = r10.T
            if (r0 == 0) goto L1c
            boolean r1 = r0.c()
            if (r1 == 0) goto L13
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L1c
            bk3 r0 = r0.a()
            if (r0 != 0) goto L20
        L1c:
            bk3 r0 = r10.j0()
        L20:
            td r1 = r0.j
            if (r1 == 0) goto La7
            ya2 r11 = (defpackage.ya2) r11
            r10 r11 = r11.I
            pn r11 = r11.J
            o10 r2 = r11.q()
            boolean r11 = r0.k
            if (r11 == 0) goto L48
            long r3 = r0.l
            r0 = 32
            long r5 = r3 >> r0
            int r0 = (int) r5
            float r0 = (float) r0
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r3 = (int) r3
            float r3 = (float) r3
            r2.f()
            defpackage.pt1.j(r2, r0, r3)
        L48:
            m65 r0 = r10.J     // Catch: java.lang.Throwable -> L54
            yt4 r3 = r0.a     // Catch: java.lang.Throwable -> L54
            m35 r4 = r3.m     // Catch: java.lang.Throwable -> L54
            if (r4 != 0) goto L52
            m35 r4 = defpackage.m35.b     // Catch: java.lang.Throwable -> L54
        L52:
            r6 = r4
            goto L57
        L54:
            r0 = move-exception
            r10 = r0
            goto La1
        L57:
            an4 r4 = r3.n     // Catch: java.lang.Throwable -> L54
            if (r4 != 0) goto L5d
            an4 r4 = defpackage.an4.d     // Catch: java.lang.Throwable -> L54
        L5d:
            r5 = r4
            z31 r3 = r3.p     // Catch: java.lang.Throwable -> L54
            if (r3 != 0) goto L64
            me1 r3 = defpackage.me1.a     // Catch: java.lang.Throwable -> L54
        L64:
            r7 = r3
            wy r3 = r0.b()     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L77
            yt4 r10 = r0.a     // Catch: java.lang.Throwable -> L54
            g55 r10 = r10.a     // Catch: java.lang.Throwable -> L54
            float r4 = r10.getAlpha()     // Catch: java.lang.Throwable -> L54
            r1.f(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L54
            goto L9b
        L77:
            g80 r10 = r10.P     // Catch: java.lang.Throwable -> L54
            if (r10 == 0) goto L80
            long r3 = r10.a()     // Catch: java.lang.Throwable -> L54
            goto L82
        L80:
            long r3 = defpackage.x70.g     // Catch: java.lang.Throwable -> L54
        L82:
            r8 = 16
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 == 0) goto L89
            goto L98
        L89:
            long r3 = r0.c()     // Catch: java.lang.Throwable -> L54
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 == 0) goto L96
            long r3 = r0.c()     // Catch: java.lang.Throwable -> L54
            goto L98
        L96:
            long r3 = defpackage.x70.b     // Catch: java.lang.Throwable -> L54
        L98:
            r1.e(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L54
        L9b:
            if (r11 == 0) goto La0
            r2.n()
        La0:
            return
        La1:
            if (r11 == 0) goto La6
            r2.n()
        La6:
            throw r10
        La7:
            bk3 r11 = r10.R
            j65 r10 = r10.T
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache="
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = ", textSubstitution="
            r0.append(r11)
            r0.append(r10)
            java.lang.String r10 = ")"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            defpackage.t02.b(r10)
            defpackage.zy.n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k65.draw(zh0):void");
    }

    @Override // defpackage.k13
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean isImportantForBounds() {
        return true;
    }

    public final bk3 j0() {
        m65 m65Var = this.J;
        bk3 bk3Var = this.R;
        if (bk3Var == null) {
            bk3Var = new bk3(this.I, m65Var, this.K, this.L, this.M, this.N, this.O);
            this.R = bk3Var;
        }
        bk3Var.getClass();
        return bk3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r0 != null) goto L12;
     */
    @Override // defpackage.na2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int maxIntrinsicHeight(defpackage.b42 r3, defpackage.a42 r4, int r5) {
        /*
            r2 = this;
            r4 = r3
            ww2 r4 = (defpackage.ww2) r4
            j65 r0 = r2.T
            if (r0 == 0) goto L17
            boolean r1 = r0.c()
            if (r1 == 0) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L17
            bk3 r0 = r0.a()
            if (r0 != 0) goto L1b
        L17:
            bk3 r0 = r2.j0()
        L1b:
            r0.d(r4)
            da2 r2 = r3.getLayoutDirection()
            int r2 = r0.a(r5, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k65.maxIntrinsicHeight(b42, a42, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r4 != null) goto L12;
     */
    @Override // defpackage.na2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int maxIntrinsicWidth(defpackage.b42 r2, defpackage.a42 r3, int r4) {
        /*
            r1 = this;
            r3 = r2
            ww2 r3 = (defpackage.ww2) r3
            j65 r4 = r1.T
            if (r4 == 0) goto L17
            boolean r0 = r4.c()
            if (r0 == 0) goto Le
            goto Lf
        Le:
            r4 = 0
        Lf:
            if (r4 == 0) goto L17
            bk3 r4 = r4.a()
            if (r4 != 0) goto L1b
        L17:
            bk3 r4 = r1.j0()
        L1b:
            r4.d(r3)
            da2 r1 = r2.getLayoutDirection()
            ak3 r1 = r4.e(r1)
            float r1 = r1.c()
            int r1 = defpackage.qi4.b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k65.maxIntrinsicWidth(b42, a42, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r0 != null) goto L13;
     */
    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vw2 mo34measure3p2s80s(defpackage.ww2 r6, defpackage.pw2 r7, long r8) {
        /*
            r5 = this;
            java.lang.String r0 = "TextStringSimpleNode::measure"
            android.os.Trace.beginSection(r0)
            j65 r0 = r5.T     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L19
            boolean r1 = r0.c()     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto L10
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L19
            bk3 r0 = r0.a()     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto L1d
        L19:
            bk3 r0 = r5.j0()     // Catch: java.lang.Throwable -> L9f
        L1d:
            r0.d(r6)     // Catch: java.lang.Throwable -> L9f
            da2 r1 = r6.getLayoutDirection()     // Catch: java.lang.Throwable -> L9f
            boolean r8 = r0.b(r8, r1)     // Catch: java.lang.Throwable -> L9f
            ak3 r9 = r0.n     // Catch: java.lang.Throwable -> L9f
            if (r9 == 0) goto L2f
            r9.a()     // Catch: java.lang.Throwable -> L9f
        L2f:
            td r9 = r0.j     // Catch: java.lang.Throwable -> L9f
            r9.getClass()     // Catch: java.lang.Throwable -> L9f
            s55 r9 = r9.d     // Catch: java.lang.Throwable -> L9f
            long r0 = r0.l     // Catch: java.lang.Throwable -> L9f
            if (r8 == 0) goto L77
            r8 = 2
            na3 r2 = defpackage.ut0.S(r5, r8)     // Catch: java.lang.Throwable -> L9f
            r2.S0()     // Catch: java.lang.Throwable -> L9f
            java.util.HashMap r2 = r5.Q     // Catch: java.lang.Throwable -> L9f
            if (r2 != 0) goto L4d
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L9f
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L9f
            r5.Q = r2     // Catch: java.lang.Throwable -> L9f
        L4d:
            dv1 r8 = defpackage.z8.a     // Catch: java.lang.Throwable -> L9f
            r3 = 0
            float r3 = r9.d(r3)     // Catch: java.lang.Throwable -> L9f
            r4 = 0
            float r3 = r3 + r4
            int r3 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> L9f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L9f
            r2.put(r8, r3)     // Catch: java.lang.Throwable -> L9f
            dv1 r8 = defpackage.z8.b     // Catch: java.lang.Throwable -> L9f
            int r3 = r9.g     // Catch: java.lang.Throwable -> L9f
            int r3 = r3 + (-1)
            float r9 = r9.d(r3)     // Catch: java.lang.Throwable -> L9f
            float r9 = r9 + r4
            int r9 = java.lang.Math.round(r9)     // Catch: java.lang.Throwable -> L9f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L9f
            r2.put(r8, r9)     // Catch: java.lang.Throwable -> L9f
        L77:
            r8 = 32
            long r8 = r0 >> r8
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L9f
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r9 = (int) r0     // Catch: java.lang.Throwable -> L9f
            long r0 = defpackage.o7.v(r8, r8, r9, r9)     // Catch: java.lang.Throwable -> L9f
            bn3 r7 = r7.u(r0)     // Catch: java.lang.Throwable -> L9f
            java.util.HashMap r5 = r5.Q     // Catch: java.lang.Throwable -> L9f
            r5.getClass()     // Catch: java.lang.Throwable -> L9f
            sa r0 = new sa     // Catch: java.lang.Throwable -> L9f
            r1 = 8
            r0.<init>(r7, r1)     // Catch: java.lang.Throwable -> L9f
            vw2 r5 = r6.A(r8, r9, r5, r0)     // Catch: java.lang.Throwable -> L9f
            android.os.Trace.endSection()
            return r5
        L9f:
            r5 = move-exception
            android.os.Trace.endSection()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k65.mo34measure3p2s80s(ww2, pw2, long):vw2");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r0 != null) goto L12;
     */
    @Override // defpackage.na2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int minIntrinsicHeight(defpackage.b42 r3, defpackage.a42 r4, int r5) {
        /*
            r2 = this;
            r4 = r3
            ww2 r4 = (defpackage.ww2) r4
            j65 r0 = r2.T
            if (r0 == 0) goto L17
            boolean r1 = r0.c()
            if (r1 == 0) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L17
            bk3 r0 = r0.a()
            if (r0 != 0) goto L1b
        L17:
            bk3 r0 = r2.j0()
        L1b:
            r0.d(r4)
            da2 r2 = r3.getLayoutDirection()
            int r2 = r0.a(r5, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k65.minIntrinsicHeight(b42, a42, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r4 != null) goto L12;
     */
    @Override // defpackage.na2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int minIntrinsicWidth(defpackage.b42 r2, defpackage.a42 r3, int r4) {
        /*
            r1 = this;
            r3 = r2
            ww2 r3 = (defpackage.ww2) r3
            j65 r4 = r1.T
            if (r4 == 0) goto L17
            boolean r0 = r4.c()
            if (r0 == 0) goto Le
            goto Lf
        Le:
            r4 = 0
        Lf:
            if (r4 == 0) goto L17
            bk3 r4 = r4.a()
            if (r4 != 0) goto L1b
        L17:
            bk3 r4 = r1.j0()
        L1b:
            r4.d(r3)
            da2 r1 = r2.getLayoutDirection()
            ak3 r1 = r4.e(r1)
            float r1 = r1.b()
            int r1 = defpackage.qi4.b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k65.minIntrinsicWidth(b42, a42, int):int");
    }

    @Override // defpackage.w31
    public final void onMeasureResultChanged() {
    }
}
