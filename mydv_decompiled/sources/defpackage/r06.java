package defpackage;

/* loaded from: classes2.dex */
public final class r06 extends n0 {
    public final int I;
    public final int J;
    public final byte[] K;
    public final byte[] L;
    public final byte[] M;
    public final byte[] N;
    public final int O;
    public final byte[] P;
    public final int Q;

    public r06(x0 x0Var) {
        int i;
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
        this.J = l0.v(x.y(0)).A();
        this.K = g4.s(r0.v(x.y(1)).I);
        this.L = g4.s(r0.v(x.y(2)).I);
        this.M = g4.s(r0.v(x.y(3)).I);
        this.N = g4.s(r0.v(x.y(4)).I);
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
            i = ((l0) v2).A();
        } else {
            if (x.size() != 5) {
                s83.t("keySeq should be 5 or 6 in length");
                throw null;
            }
            i = -1;
        }
        this.O = i;
        if (x0Var.size() != 3) {
            this.Q = 0;
            this.P = null;
            return;
        }
        ct y2 = ct.y(x0Var.y(2));
        int i2 = y2.K;
        if (i2 != 0 && i2 != 1) {
            s83.t("unknown bdsState choice in XMSSPrivateKey");
            throw null;
        }
        this.Q = i2;
        wx5.f(y2);
        y yVar2 = r0.J;
        u0 v3 = y2.v(true, yVar2);
        yVar2.c(v3);
        this.P = g4.s(((r0) v3).I);
    }

    public static r06 m(u0 u0Var) {
        if (u0Var != null) {
            return new r06(x0.x(u0Var));
        }
        return null;
    }

    @Override // defpackage.e0
    public final u0 d() {
        f0 f0Var = new f0(3);
        int i = this.O;
        f0Var.a(i >= 0 ? l0.N : l0.M);
        f0 f0Var2 = new f0();
        f0Var2.a(l0.D(this.J));
        f0Var2.a(new mn0(this.K));
        f0Var2.a(new mn0(this.L));
        f0Var2.a(new mn0(this.M));
        f0Var2.a(new mn0(this.N));
        if (i >= 0) {
            f0Var2.a(new ct(2, 128, 0, l0.D(i), (byte) 1));
        }
        pn0 pn0Var = new pn0(f0Var2, (byte) 0);
        pn0Var.L = -1;
        f0Var.a(pn0Var);
        byte[] bArr = this.P;
        if (bArr != null) {
            f0Var.a(new ct(true, this.Q, (e0) new mn0(bArr), (byte) 1));
        }
        pn0 pn0Var2 = new pn0(f0Var, (byte) 0);
        pn0Var2.L = -1;
        return pn0Var2;
    }
}
