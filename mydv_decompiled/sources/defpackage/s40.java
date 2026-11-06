package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class s40 extends p40 {
    public final zf1 L;

    public s40(zf1 zf1Var, tk0 tk0Var, int i, ez ezVar) {
        super(tk0Var, i, ezVar);
        this.L = zf1Var;
    }

    @Override // defpackage.p40, defpackage.zf1
    public final Object collect(ag1 ag1Var, fj0 fj0Var) {
        Object P;
        int i = this.J;
        el0 el0Var = el0.I;
        if (i == -3) {
            tk0 context = fj0Var.getContext();
            Boolean bool = Boolean.FALSE;
            sg sgVar = new sg((byte) 18);
            tk0 tk0Var = this.I;
            tk0 plus = !((Boolean) tk0Var.fold(bool, sgVar)).booleanValue() ? context.plus(tk0Var) : qb.G(context, tk0Var, false);
            if (j42.c(plus, context)) {
                Object h = h(ag1Var, fj0Var);
                if (h == el0Var) {
                    return h;
                }
            } else {
                q8 q8Var = q8.i0;
                if (j42.c(plus.get(q8Var), context.get(q8Var))) {
                    P = d4.P(plus, d4.f(ag1Var, fj0Var.getContext()), j42.e0(plus), new r(this, null, (byte) 8), fj0Var);
                    if (P == el0Var) {
                        return P;
                    }
                }
            }
            return wd5.a;
        }
        Object collect = super.collect(ag1Var, fj0Var);
        if (collect == el0Var) {
            return collect;
        }
        return wd5.a;
    }

    @Override // defpackage.p40
    public final Object d(bu3 bu3Var, fj0 fj0Var) {
        Object h = h(new nj4(bu3Var), fj0Var);
        return h == el0.I ? h : wd5.a;
    }

    public Object h(ag1 ag1Var, fj0 fj0Var) {
        Object collect = this.L.collect(ag1Var, fj0Var);
        return collect == el0.I ? collect : wd5.a;
    }

    @Override // defpackage.p40
    public final String toString() {
        return this.L + " -> " + super.toString();
    }
}
