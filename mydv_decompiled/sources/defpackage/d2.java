package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class d2 implements rk0 {
    private final sk0 key;

    public d2(sk0 sk0Var) {
        sk0Var.getClass();
        this.key = sk0Var;
    }

    @Override // defpackage.tk0
    public /* bridge */ <R> R fold(R r, hn1 hn1Var) {
        return (R) p70.Q(this, r, hn1Var);
    }

    @Override // defpackage.tk0
    public /* bridge */ <E extends rk0> E get(sk0 sk0Var) {
        return (E) p70.R(this, sk0Var);
    }

    @Override // defpackage.rk0
    public sk0 getKey() {
        return this.key;
    }

    @Override // defpackage.tk0
    public /* bridge */ tk0 minusKey(sk0 sk0Var) {
        return p70.m0(this, sk0Var);
    }

    @Override // defpackage.tk0
    public /* bridge */ tk0 plus(tk0 tk0Var) {
        return p70.p0(this, tk0Var);
    }
}
