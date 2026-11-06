package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class lf2 extends k13 implements pi4 {
    public rm1 I;
    public ff2 J;
    public pg3 K;
    public boolean L;
    public bb4 M;
    public final jf2 N = new jf2(this, 0);
    public jf2 O;

    public lf2(rm1 rm1Var, ff2 ff2Var, pg3 pg3Var, boolean z) {
        this.I = rm1Var;
        this.J = ff2Var;
        this.K = pg3Var;
        this.L = z;
        j0();
    }

    @Override // defpackage.pi4
    public final void applySemantics(cj4 cj4Var) {
        d82[] d82VarArr = aj4.a;
        bj4 bj4Var = zi4.n;
        d82[] d82VarArr2 = aj4.a;
        d82 d82Var = d82VarArr2[6];
        Boolean bool = Boolean.TRUE;
        bj4Var.getClass();
        cj4Var.c(bj4Var, bool);
        cj4Var.c(zi4.P, this.N);
        pg3 pg3Var = this.K;
        bb4 bb4Var = this.M;
        if (pg3Var == pg3.I) {
            if (bb4Var == null) {
                j42.g0("scrollAxisRange");
                throw null;
            }
            bj4 bj4Var2 = zi4.w;
            d82 d82Var2 = d82VarArr2[13];
            bj4Var2.getClass();
            cj4Var.c(bj4Var2, bb4Var);
        } else {
            if (bb4Var == null) {
                j42.g0("scrollAxisRange");
                throw null;
            }
            bj4 bj4Var3 = zi4.v;
            d82 d82Var3 = d82VarArr2[12];
            bj4Var3.getClass();
            cj4Var.c(bj4Var3, bb4Var);
        }
        jf2 jf2Var = this.O;
        if (jf2Var != null) {
            cj4Var.c(ii4.f, new v4(null, jf2Var));
        }
        cj4Var.c(ii4.C, new v4(null, new i9(new kf2(this, (byte) 2), (byte) 23)));
        l70 f = this.J.f();
        bj4 bj4Var4 = zi4.f;
        d82 d82Var4 = d82VarArr2[24];
        bj4Var4.getClass();
        cj4Var.c(bj4Var4, f);
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

    public final void j0() {
        this.M = new bb4(new kf2(this, (byte) 0), new kf2(this, (byte) 1));
        this.O = this.L ? new jf2(this, (byte) 1) : null;
    }
}
