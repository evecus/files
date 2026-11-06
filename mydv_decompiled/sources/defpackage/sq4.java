package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sq4 extends k13 implements na2 {
    public float I;
    public float J;
    public float K;
    public float L;
    public boolean M;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j0(defpackage.ww2 r7) {
        /*
            r6 = this;
            float r0 = r6.K
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.K
            int r0 = r7.X(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.L
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.L
            int r3 = r7.X(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.I
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.I
            int r4 = r7.X(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.J
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r6 = r6.J
            int r6 = r7.X(r6)
            if (r6 >= 0) goto L53
            r6 = r2
        L53:
            if (r6 <= r3) goto L56
            r6 = r3
        L56:
            if (r6 == r1) goto L59
            r2 = r6
        L59:
            long r6 = defpackage.eh0.a(r4, r0, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sq4.j0(ww2):long");
    }

    @Override // defpackage.na2
    public final int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        long j0 = j0((ww2) b42Var);
        if (dh0.e(j0)) {
            return dh0.g(j0);
        }
        if (!this.M) {
            i = eh0.g(i, j0);
        }
        return eh0.f(a42Var.b(i), j0);
    }

    @Override // defpackage.na2
    public final int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        long j0 = j0((ww2) b42Var);
        if (dh0.f(j0)) {
            return dh0.h(j0);
        }
        if (!this.M) {
            i = eh0.f(i, j0);
        }
        return eh0.g(a42Var.t(i), j0);
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        int j2;
        int h;
        int i;
        int g;
        long a;
        long j0 = j0(ww2Var);
        if (this.M) {
            a = eh0.e(j, j0);
        } else {
            if (Float.isNaN(this.I)) {
                j2 = dh0.j(j);
                int h2 = dh0.h(j0);
                if (j2 > h2) {
                    j2 = h2;
                }
            } else {
                j2 = dh0.j(j0);
            }
            if (Float.isNaN(this.K)) {
                h = dh0.h(j);
                int j3 = dh0.j(j0);
                if (h < j3) {
                    h = j3;
                }
            } else {
                h = dh0.h(j0);
            }
            if (Float.isNaN(this.J)) {
                i = dh0.i(j);
                int g2 = dh0.g(j0);
                if (i > g2) {
                    i = g2;
                }
            } else {
                i = dh0.i(j0);
            }
            if (Float.isNaN(this.L)) {
                g = dh0.g(j);
                int i2 = dh0.i(j0);
                if (g < i2) {
                    g = i2;
                }
            } else {
                g = dh0.g(j0);
            }
            a = eh0.a(j2, h, i, g);
        }
        bn3 u = pw2Var.u(a);
        return ww2Var.A(u.I, u.J, p91.I, new sa(u, (byte) 6));
    }

    @Override // defpackage.na2
    public final int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        long j0 = j0((ww2) b42Var);
        if (dh0.e(j0)) {
            return dh0.g(j0);
        }
        if (!this.M) {
            i = eh0.g(i, j0);
        }
        return eh0.f(a42Var.Q(i), j0);
    }

    @Override // defpackage.na2
    public final int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        long j0 = j0((ww2) b42Var);
        if (dh0.f(j0)) {
            return dh0.h(j0);
        }
        if (!this.M) {
            i = eh0.f(i, j0);
        }
        return eh0.g(a42Var.p(i), j0);
    }
}
