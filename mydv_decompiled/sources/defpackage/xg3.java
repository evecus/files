package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class xg3 extends yg3 {
    public final h74 a;
    public final yd b;

    public xg3(h74 h74Var) {
        yd ydVar;
        this.a = h74Var;
        if (sv2.H(h74Var)) {
            ydVar = null;
        } else {
            ydVar = ae.a();
            hf1.j(ydVar, h74Var);
        }
        this.b = ydVar;
    }

    @Override // defpackage.yg3
    public final m14 a() {
        h74 h74Var = this.a;
        return new m14(h74Var.a, h74Var.b, h74Var.c, h74Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xg3) {
            return this.a.equals(((xg3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
