package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pl3 implements ut4 {
    public final mz I;
    public final cz J;
    public kh4 K;
    public int L;
    public boolean M;
    public long N;

    public pl3(mz mzVar) {
        this.I = mzVar;
        cz a = mzVar.a();
        this.J = a;
        kh4 kh4Var = a.I;
        this.K = kh4Var;
        this.L = kh4Var != null ? kh4Var.b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.M = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // defpackage.ut4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(defpackage.cz r9, long r10) {
        /*
            r8 = this;
            r9.getClass()
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L65
            boolean r3 = r8.M
            if (r3 != 0) goto L5f
            kh4 r3 = r8.K
            cz r4 = r8.J
            if (r3 == 0) goto L27
            kh4 r5 = r4.I
            if (r3 != r5) goto L21
            int r3 = r8.L
            r5.getClass()
            int r5 = r5.b
            if (r3 != r5) goto L21
            goto L27
        L21:
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            defpackage.zy.i(r8)
            return r0
        L27:
            if (r2 != 0) goto L2a
            return r0
        L2a:
            long r0 = r8.N
            r2 = 1
            long r0 = r0 + r2
            mz r2 = r8.I
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L3a
            r8 = -1
            return r8
        L3a:
            kh4 r0 = r8.K
            if (r0 != 0) goto L48
            kh4 r0 = r4.I
            if (r0 == 0) goto L48
            r8.K = r0
            int r0 = r0.b
            r8.L = r0
        L48:
            long r0 = r4.J
            long r2 = r8.N
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            cz r2 = r8.J
            long r4 = r8.N
            r3 = r9
            r2.t(r3, r4, r6)
            long r9 = r8.N
            long r9 = r9 + r6
            r8.N = r9
            return r6
        L5f:
            java.lang.String r8 = "closed"
            defpackage.zy.i(r8)
            return r0
        L65:
            java.lang.String r8 = "byteCount < 0: "
            java.lang.String r8 = defpackage.r7.A(r8, r10)
            defpackage.s83.h(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl3.read(cz, long):long");
    }

    @Override // defpackage.ut4
    public final u75 timeout() {
        return this.I.timeout();
    }
}
