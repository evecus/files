package defpackage;

/* loaded from: classes2.dex */
public final class rz3 extends n0 {
    public z0 I;

    @Override // defpackage.e0
    public final u0 d() {
        return this.I;
    }

    public final dr m() {
        e0[] e0VarArr = this.I.I;
        if (e0VarArr.length == 0) {
            return null;
        }
        return dr.m(e0VarArr[0]);
    }

    public final dr[] n() {
        z0 z0Var = this.I;
        int length = z0Var.I.length;
        dr[] drVarArr = new dr[length];
        for (int i = 0; i != length; i++) {
            drVarArr[i] = dr.m(z0Var.I[i]);
        }
        return drVarArr;
    }
}
