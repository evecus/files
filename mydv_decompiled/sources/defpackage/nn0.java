package defpackage;

/* loaded from: classes2.dex */
public final class nn0 extends co0 {
    @Override // defpackage.co0, defpackage.uu2
    public final void O(e0[] e0VarArr) {
        for (e0 e0Var : e0VarArr) {
            try {
                e0Var.d().t().n(this, true);
            } catch (en0 e) {
                throw k21.Z(e.getMessage(), e);
            }
        }
    }

    @Override // defpackage.co0, defpackage.uu2
    public final void V(u0 u0Var) {
        try {
            u0Var.t().n(this, true);
        } catch (en0 e) {
            throw k21.Z(e.getMessage(), e);
        }
    }

    @Override // defpackage.co0, defpackage.uu2
    public final void W(u0[] u0VarArr) {
        for (u0 u0Var : u0VarArr) {
            try {
                u0Var.t().n(this, true);
            } catch (en0 e) {
                throw k21.Z(e.getMessage(), e);
            }
        }
    }

    @Override // defpackage.uu2
    public final nn0 w() {
        return this;
    }
}
