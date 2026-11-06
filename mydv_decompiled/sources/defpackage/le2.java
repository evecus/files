package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class le2 {
    public final g94 a;
    public final gu1 b;
    public final n43 c;

    public le2(g94 g94Var, gu1 gu1Var) {
        this.a = g94Var;
        this.b = gu1Var;
        long[] jArr = ia4.a;
        this.c = new n43();
    }

    public final hn1 a(int i, Object obj, Object obj2) {
        n43 n43Var = this.c;
        ke2 ke2Var = (ke2) n43Var.g(obj);
        byte b = 6;
        if (ke2Var != null && ke2Var.c == i && j42.c(ke2Var.b, obj2)) {
            tc0 tc0Var = ke2Var.d;
            if (tc0Var != null) {
                return tc0Var;
            }
            tc0 tc0Var2 = new tc0(818252804, new uh0(ke2Var.e, ke2Var, b), true);
            ke2Var.d = tc0Var2;
            return tc0Var2;
        }
        ke2 ke2Var2 = new ke2(this, i, obj, obj2);
        n43Var.m(obj, ke2Var2);
        tc0 tc0Var3 = ke2Var2.d;
        if (tc0Var3 != null) {
            return tc0Var3;
        }
        tc0 tc0Var4 = new tc0(818252804, new uh0(this, ke2Var2, b), true);
        ke2Var2.d = tc0Var4;
        return tc0Var4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        ke2 ke2Var = (ke2) this.c.g(obj);
        if (ke2Var != null) {
            return ke2Var.b;
        }
        me2 me2Var = (me2) this.b.invoke();
        int e = me2Var.e(obj);
        if (e != -1) {
            return me2Var.d(e);
        }
        return null;
    }
}
