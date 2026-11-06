package defpackage;

/* loaded from: classes2.dex */
public final class ms5 implements dr3 {
    public final /* synthetic */ int I;

    public ms5(int i) {
        this.I = i;
    }

    @Override // defpackage.dr3
    public final er3 a(er3 er3Var) {
        ls5 ls5Var = er3Var instanceof ls5 ? (ls5) er3Var : null;
        int i = this.I;
        if (ls5Var != null && ls5Var.a == i) {
            return ls5Var;
        }
        ls5 ls5Var2 = new ls5();
        ls5Var2.a = i;
        return ls5Var2;
    }
}
