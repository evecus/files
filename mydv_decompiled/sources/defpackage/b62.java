package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class b62 extends y52 {
    public final e62 M;
    public final c62 N;
    public final d60 O;
    public final Object P;

    public b62(e62 e62Var, c62 c62Var, d60 d60Var, Object obj) {
        this.M = e62Var;
        this.N = c62Var;
        this.O = d60Var;
        this.P = obj;
    }

    @Override // defpackage.y52
    public final boolean k() {
        return false;
    }

    @Override // defpackage.y52
    public final void l(Throwable th) {
        d60 d60Var = this.O;
        d60 V = e62.V(d60Var);
        e62 e62Var = this.M;
        c62 c62Var = this.N;
        Object obj = this.P;
        if (V == null || !e62Var.e0(c62Var, V, obj)) {
            c62Var.I.c(new nk2(2), 2);
            d60 V2 = e62.V(d60Var);
            if (V2 == null || !e62Var.e0(c62Var, V2, obj)) {
                e62Var.m(e62Var.y(c62Var, obj));
            }
        }
    }
}
