package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class k50 extends u50 {
    public final u50 I;
    public final u50 J;

    public k50(u50 u50Var, u50 u50Var2) {
        this.I = u50Var;
        u50Var2.getClass();
        this.J = u50Var2;
    }

    @Override // defpackage.mr3
    public final boolean apply(Object obj) {
        return b(((Character) obj).charValue());
    }

    @Override // defpackage.u50
    public final boolean b(char c) {
        return this.I.b(c) && this.J.b(c);
    }

    public final String toString() {
        return "CharMatcher.and(" + this.I + ", " + this.J + ")";
    }
}
