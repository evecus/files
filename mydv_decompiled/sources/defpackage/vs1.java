package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vs1 {
    public final fx a;
    public final ej1 b;
    public final ej1 c;

    public vs1(fx fxVar, ej1 ej1Var, ej1 ej1Var2) {
        this.a = fxVar;
        this.b = ej1Var;
        this.c = ej1Var2;
        if (fxVar.b() == 0 && fxVar.a() == 0) {
            s83.t("Bounds must be non zero");
            throw null;
        }
        if (fxVar.a == 0 || fxVar.b == 0) {
            return;
        }
        s83.t("Bounding rectangle must start at the top or left window edge for folding features");
        throw null;
    }

    public final ej1 a() {
        fx fxVar = this.a;
        return fxVar.b() > fxVar.a() ? ej1.N : ej1.M;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (vs1.class.equals(obj != null ? obj.getClass() : null)) {
            obj.getClass();
            vs1 vs1Var = (vs1) obj;
            return this.a.equals(vs1Var.a) && this.b == vs1Var.b && this.c == vs1Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return vs1.class.getSimpleName() + " { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
