package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class iq extends k13 implements na2 {
    public float I;
    public boolean J;

    public final long j0(long j, boolean z) {
        int round;
        int g = dh0.g(j);
        if (g == Integer.MAX_VALUE || (round = Math.round(g * this.I)) <= 0) {
            return 0L;
        }
        if (!z || j42.G(round, g, j)) {
            return (round << 32) | (g & 4294967295L);
        }
        return 0L;
    }

    public final long k0(long j, boolean z) {
        int round;
        int h = dh0.h(j);
        if (h == Integer.MAX_VALUE || (round = Math.round(h / this.I)) <= 0) {
            return 0L;
        }
        if (!z || j42.G(h, round, j)) {
            return (h << 32) | (round & 4294967295L);
        }
        return 0L;
    }

    public final long l0(long j, boolean z) {
        int i = dh0.i(j);
        int round = Math.round(i * this.I);
        if (round <= 0) {
            return 0L;
        }
        if (!z || j42.G(round, i, j)) {
            return (round << 32) | (i & 4294967295L);
        }
        return 0L;
    }

    public final long m0(long j, boolean z) {
        int j2 = dh0.j(j);
        int round = Math.round(j2 / this.I);
        if (round <= 0) {
            return 0L;
        }
        if (!z || j42.G(j2, round, j)) {
            return (j2 << 32) | (round & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.na2
    public final int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.I) : a42Var.b(i);
    }

    @Override // defpackage.na2
    public final int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.I) : a42Var.t(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (defpackage.z22.b(r5, 0) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bf, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bc, code lost:
    
        if (defpackage.z22.b(r5, 0) == false) goto L53;
     */
    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vw2 mo34measure3p2s80s(defpackage.ww2 r8, defpackage.pw2 r9, long r10) {
        /*
            r7 = this;
            boolean r0 = r7.J
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L67
            long r5 = r7.k0(r10, r2)
            boolean r0 = defpackage.z22.b(r5, r3)
            if (r0 != 0) goto L14
            goto Lc0
        L14:
            long r5 = r7.j0(r10, r2)
            boolean r0 = defpackage.z22.b(r5, r3)
            if (r0 != 0) goto L20
            goto Lc0
        L20:
            long r5 = r7.m0(r10, r2)
            boolean r0 = defpackage.z22.b(r5, r3)
            if (r0 != 0) goto L2c
            goto Lc0
        L2c:
            long r5 = r7.l0(r10, r2)
            boolean r0 = defpackage.z22.b(r5, r3)
            if (r0 != 0) goto L38
            goto Lc0
        L38:
            long r5 = r7.k0(r10, r1)
            boolean r0 = defpackage.z22.b(r5, r3)
            if (r0 != 0) goto L44
            goto Lc0
        L44:
            long r5 = r7.j0(r10, r1)
            boolean r0 = defpackage.z22.b(r5, r3)
            if (r0 != 0) goto L50
            goto Lc0
        L50:
            long r5 = r7.m0(r10, r1)
            boolean r0 = defpackage.z22.b(r5, r3)
            if (r0 != 0) goto L5c
            goto Lc0
        L5c:
            long r5 = r7.l0(r10, r1)
            boolean r7 = defpackage.z22.b(r5, r3)
            if (r7 != 0) goto Lbf
            goto Lc0
        L67:
            long r5 = r7.j0(r10, r2)
            boolean r0 = defpackage.z22.b(r5, r3)
            if (r0 != 0) goto L72
            goto Lc0
        L72:
            long r5 = r7.k0(r10, r2)
            boolean r0 = defpackage.z22.b(r5, r3)
            if (r0 != 0) goto L7d
            goto Lc0
        L7d:
            long r5 = r7.l0(r10, r2)
            boolean r0 = defpackage.z22.b(r5, r3)
            if (r0 != 0) goto L88
            goto Lc0
        L88:
            long r5 = r7.m0(r10, r2)
            boolean r0 = defpackage.z22.b(r5, r3)
            if (r0 != 0) goto L93
            goto Lc0
        L93:
            long r5 = r7.j0(r10, r1)
            boolean r0 = defpackage.z22.b(r5, r3)
            if (r0 != 0) goto L9e
            goto Lc0
        L9e:
            long r5 = r7.k0(r10, r1)
            boolean r0 = defpackage.z22.b(r5, r3)
            if (r0 != 0) goto La9
            goto Lc0
        La9:
            long r5 = r7.l0(r10, r1)
            boolean r0 = defpackage.z22.b(r5, r3)
            if (r0 != 0) goto Lb4
            goto Lc0
        Lb4:
            long r5 = r7.m0(r10, r1)
            boolean r7 = defpackage.z22.b(r5, r3)
            if (r7 != 0) goto Lbf
            goto Lc0
        Lbf:
            r5 = r3
        Lc0:
            boolean r7 = defpackage.z22.b(r5, r3)
            if (r7 != 0) goto Le6
            r7 = 32
            long r10 = r5 >> r7
            int r7 = (int) r10
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r5
            int r10 = (int) r10
            if (r7 < 0) goto Ld6
            r11 = r2
            goto Ld7
        Ld6:
            r11 = r1
        Ld7:
            if (r10 < 0) goto Lda
            r1 = r2
        Lda:
            r11 = r11 & r1
            if (r11 != 0) goto Le2
            java.lang.String r11 = "width and height must be >= 0"
            defpackage.s02.a(r11)
        Le2:
            long r10 = defpackage.eh0.h(r7, r7, r10, r10)
        Le6:
            bn3 r7 = r9.u(r10)
            int r9 = r7.I
            int r10 = r7.J
            sa r11 = new sa
            r11.<init>(r7, r2)
            p91 r7 = defpackage.p91.I
            vw2 r7 = r8.A(r9, r10, r7, r11)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iq.mo34measure3p2s80s(ww2, pw2, long):vw2");
    }

    @Override // defpackage.na2
    public final int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.I) : a42Var.Q(i);
    }

    @Override // defpackage.na2
    public final int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.I) : a42Var.p(i);
    }
}
