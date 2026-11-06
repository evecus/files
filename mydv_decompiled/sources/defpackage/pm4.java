package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pm4 implements hy {
    public final /* synthetic */ fk3 I;
    public final /* synthetic */ fk3 J;

    public pm4(fk3 fk3Var, fk3 fk3Var2) {
        this.I = fk3Var;
        this.J = fk3Var2;
    }

    @Override // defpackage.hy
    public final Object M(jy jyVar, ni niVar) {
        return wd5.a;
    }

    @Override // defpackage.hy
    public final m14 j(m14 m14Var) {
        float h = this.I.h();
        float h2 = this.J.h();
        return (h <= 0.0f || h2 <= 0.0f) ? m14Var : new m14(0.0f, 0.0f, h, h2);
    }
}
