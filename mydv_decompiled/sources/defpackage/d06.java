package defpackage;

/* loaded from: classes2.dex */
public final class d06 extends n0 {
    public final mn0 I;
    public final v51 J;
    public g61 K;

    public d06(g61 g61Var) {
        this.K = g61Var.l();
        this.I = new mn0(g61Var.e());
    }

    @Override // defpackage.e0
    public final u0 d() {
        return this.I;
    }

    public final synchronized g61 m() {
        g61 g61Var;
        g61Var = this.K;
        if (g61Var == null) {
            g61Var = this.J.e(this.I.I).l();
            this.K = g61Var;
        }
        return g61Var;
    }

    public d06(v51 v51Var, byte[] bArr) {
        this.J = v51Var;
        this.I = new mn0(g4.s(bArr));
    }
}
