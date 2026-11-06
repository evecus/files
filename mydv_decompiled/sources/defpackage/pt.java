package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class pt extends q13 {
    public final long a;
    public final wy b;
    public final dn4 c;

    public pt(long j, sj2 sj2Var, dn4 dn4Var, int i) {
        j = (i & 1) != 0 ? x70.g : j;
        sj2Var = (i & 2) != 0 ? null : sj2Var;
        this.a = j;
        this.b = sj2Var;
        this.c = dn4Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        tt ttVar = new tt();
        ttVar.I = this.a;
        ttVar.J = this.b;
        ttVar.K = 1.0f;
        ttVar.L = this.c;
        ttVar.M = 9205357640488583168L;
        return ttVar;
    }

    public final boolean equals(Object obj) {
        pt ptVar = obj instanceof pt ? (pt) obj : null;
        if (ptVar == null) {
            return false;
        }
        long j = ptVar.a;
        int i = x70.h;
        return zc5.a(this.a, j) && j42.c(this.b, ptVar.b) && j42.c(this.c, ptVar.c);
    }

    public final int hashCode() {
        int i = x70.h;
        int Q = i82.Q(this.a) * 31;
        wy wyVar = this.b;
        return this.c.hashCode() + jp0.o(1.0f, (Q + (wyVar != null ? wyVar.hashCode() : 0)) * 31, 31);
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        tt ttVar = (tt) k13Var;
        ttVar.I = this.a;
        ttVar.J = this.b;
        ttVar.K = 1.0f;
        dn4 dn4Var = ttVar.L;
        dn4 dn4Var2 = this.c;
        if (!j42.c(dn4Var, dn4Var2)) {
            ttVar.L = dn4Var2;
            ut0.U(ttVar).I();
        }
        mu0.I(ttVar);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
    }
}
