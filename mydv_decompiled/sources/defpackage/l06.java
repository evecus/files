package defpackage;

/* loaded from: classes2.dex */
public final class l06 extends n0 {
    public final int I;
    public final long J;
    public final long K;
    public final byte[] L;
    public final byte[] M;
    public final byte[] N;
    public final byte[] O;
    public final byte[] P;
    public final int Q;

    public l06(x0 x0Var) {
        long j;
        l0 v = l0.v(x0Var.y(0));
        if (!v.y(0) && !v.y(1)) {
            s83.t("unknown version of sequence");
            throw null;
        }
        this.I = v.A();
        if (x0Var.size() != 2 && x0Var.size() != 3) {
            s83.t("key sequence wrong size");
            throw null;
        }
        x0 x = x0.x(x0Var.y(1));
        this.J = l0.v(x.y(0)).C();
        this.L = g4.s(r0.v(x.y(1)).I);
        this.M = g4.s(r0.v(x.y(2)).I);
        this.N = g4.s(r0.v(x.y(3)).I);
        this.O = g4.s(r0.v(x.y(4)).I);
        if (x.size() == 6) {
            ct y = ct.y(x.y(5));
            if (y.K != 0) {
                s83.t("unknown tag in XMSSPrivateKey");
                throw null;
            }
            y yVar = l0.K;
            wx5.f(y);
            u0 v2 = y.v(false, yVar);
            yVar.c(v2);
            j = ((l0) v2).C();
        } else {
            if (x.size() != 5) {
                s83.t("keySeq should be 5 or 6 in length");
                throw null;
            }
            j = -1;
        }
        this.K = j;
        if (x0Var.size() != 3) {
            this.Q = 0;
            this.P = null;
            return;
        }
        ct y2 = ct.y(x0Var.y(2));
        int i = y2.K;
        if (i != 0 && i != 1) {
            s83.t("unknown bdsState choice in XMSSMTPrivateKey");
            throw null;
        }
        this.Q = i;
        wx5.f(y2);
        y yVar2 = r0.J;
        u0 v3 = y2.v(true, yVar2);
        yVar2.c(v3);
        this.P = g4.s(((r0) v3).I);
    }

    public static l06 m(u0 u0Var) {
        if (u0Var != null) {
            return new l06(x0.x(u0Var));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    @Override // defpackage.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.u0 d() {
        /*
            r18 = this;
            r0 = r18
            f0 r1 = new f0
            r1.<init>()
            long r2 = r0.K
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L15
            l0 r7 = defpackage.l0.N
        L11:
            r1.a(r7)
            goto L18
        L15:
            l0 r7 = defpackage.l0.M
            goto L11
        L18:
            f0 r7 = new f0
            r7.<init>()
            long r8 = r0.J
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            r10 = 17
            if (r4 < 0) goto L2f
            l0[] r4 = defpackage.l0.L
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 >= 0) goto L2f
            int r5 = (int) r8
            r4 = r4[r5]
            goto L34
        L2f:
            l0 r4 = new l0
            r4.<init>(r8)
        L34:
            r7.a(r4)
            mn0 r4 = new mn0
            byte[] r5 = r0.L
            r4.<init>(r5)
            r7.a(r4)
            mn0 r4 = new mn0
            byte[] r5 = r0.M
            r4.<init>(r5)
            r7.a(r4)
            mn0 r4 = new mn0
            byte[] r5 = r0.N
            r4.<init>(r5)
            r7.a(r4)
            mn0 r4 = new mn0
            byte[] r5 = r0.O
            r4.<init>(r5)
            r7.a(r4)
            if (r6 < 0) goto L84
            ct r12 = new ct
            if (r6 < 0) goto L71
            l0[] r4 = defpackage.l0.L
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 >= 0) goto L71
            int r2 = (int) r2
            r2 = r4[r2]
            r16 = r2
            goto L78
        L71:
            l0 r4 = new l0
            r4.<init>(r2)
            r16 = r4
        L78:
            r13 = 2
            r17 = 1
            r14 = 128(0x80, float:1.8E-43)
            r15 = 0
            r12.<init>(r13, r14, r15, r16, r17)
            r7.a(r12)
        L84:
            pn0 r2 = new pn0
            r3 = 0
            r2.<init>(r7, r3)
            r4 = -1
            r2.L = r4
            r1.a(r2)
            byte[] r2 = r0.P
            if (r2 == 0) goto La4
            ct r5 = new ct
            mn0 r6 = new mn0
            r6.<init>(r2)
            r2 = 1
            int r0 = r0.Q
            r5.<init>(r2, r0, r6, r2)
            r1.a(r5)
        La4:
            pn0 r0 = new pn0
            r0.<init>(r1, r3)
            r0.L = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l06.d():u0");
    }
}
