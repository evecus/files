package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ee2 extends k13 implements na2 {
    public static final ce2 L = new ce2();
    public fe2 I;
    public cy J;
    public pg3 K;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0038, code lost:
    
        if (r4.K == defpackage.pg3.I) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        if (r4.K == defpackage.pg3.J) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j0(defpackage.ae2 r5, int r6) {
        /*
            r4 = this;
            r0 = 5
            boolean r0 = defpackage.c5.F(r6, r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L3b
            r0 = 6
            boolean r0 = defpackage.c5.F(r6, r0)
            if (r0 == 0) goto L11
            goto L3b
        L11:
            r0 = 3
            boolean r0 = defpackage.c5.F(r6, r0)
            if (r0 != 0) goto L34
            r0 = 4
            boolean r0 = defpackage.c5.F(r6, r0)
            if (r0 == 0) goto L20
            goto L34
        L20:
            boolean r0 = defpackage.c5.F(r6, r2)
            if (r0 != 0) goto L42
            r0 = 2
            boolean r0 = defpackage.c5.F(r6, r0)
            if (r0 == 0) goto L2e
            goto L42
        L2e:
            java.lang.String r4 = "Lazy list does not support beyond bounds layout for the specified direction"
            defpackage.zy.i(r4)
            return r1
        L34:
            pg3 r0 = r4.K
            pg3 r3 = defpackage.pg3.I
            if (r0 != r3) goto L42
            goto L59
        L3b:
            pg3 r0 = r4.K
            pg3 r3 = defpackage.pg3.J
            if (r0 != r3) goto L42
            goto L59
        L42:
            boolean r6 = r4.k0(r6)
            if (r6 == 0) goto L54
            int r5 = r5.b
            fe2 r4 = r4.I
            int r4 = r4.a()
            int r4 = r4 - r2
            if (r5 >= r4) goto L59
            goto L58
        L54:
            int r4 = r5.a
            if (r4 <= 0) goto L59
        L58:
            return r2
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee2.j0(ae2, int):boolean");
    }

    public final boolean k0(int i) {
        if (c5.F(i, 1)) {
            return false;
        }
        if (c5.F(i, 2)) {
            return true;
        }
        if (c5.F(i, 5)) {
            return false;
        }
        if (c5.F(i, 6)) {
            return true;
        }
        if (c5.F(i, 3)) {
            int ordinal = ut0.U(this).h0.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 1) {
                return true;
            }
            s83.v();
            return false;
        }
        if (!c5.F(i, 4)) {
            zy.i("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int ordinal2 = ut0.U(this).h0.ordinal();
        if (ordinal2 == 0) {
            return true;
        }
        if (ordinal2 == 1) {
            return false;
        }
        s83.v();
        return false;
    }

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.i(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.l(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        bn3 u = pw2Var.u(j);
        return ww2Var.A(u.I, u.J, p91.I, new sa(u, (byte) 3));
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.o(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.r(this, b42Var, a42Var, i);
    }
}
