package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class kw extends k13 implements na2, pi4 {
    public tm1 I;

    public kw(tm1 tm1Var) {
        this.I = tm1Var;
    }

    @Override // defpackage.pi4
    public final void applySemantics(cj4 cj4Var) {
        dn4 dn4Var;
        boolean z;
        na3 S = ut0.S(this, 2);
        if (S.v0) {
            dn4Var = S.r0;
            z = S.u0;
        } else {
            n54 n54Var = qb.i;
            if (n54Var == null) {
                qb.i = new n54();
            } else {
                n54Var.a();
            }
            n54 n54Var2 = qb.i;
            n54Var2.getClass();
            n54Var2.a0 = S.c0.g0;
            n54Var2.Y = ut0.b0(S.K);
            ns4 i = o63.i();
            tm1 e = i != null ? i.e() : null;
            ns4 j = o63.j(i);
            try {
                this.I.invoke(n54Var2);
                o63.o(i, j, e);
                dn4Var = n54Var2.W;
                z = n54Var2.X;
            } catch (Throwable th) {
                o63.o(i, j, e);
                throw th;
            }
        }
        if (z) {
            aj4.d(cj4Var, dn4Var);
        }
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
        return false;
    }

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.i(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.l(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        bn3 u = pw2Var.u(j);
        return ww2Var.A(u.I, u.J, p91.I, new m1(u, this, (byte) 2));
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.o(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.r(this, b42Var, a42Var, i);
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.I + ")";
    }
}
