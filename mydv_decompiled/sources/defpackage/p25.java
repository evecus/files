package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class p25 {
    public final oj a;
    public oj b;
    public boolean c = false;
    public y23 d = null;

    public p25(oj ojVar, oj ojVar2) {
        this.a = ojVar;
        this.b = ojVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p25)) {
            return false;
        }
        p25 p25Var = (p25) obj;
        return j42.c(this.a, p25Var.a) && j42.c(this.b, p25Var.b) && this.c == p25Var.c && j42.c(this.d, p25Var.d);
    }

    public final int hashCode() {
        int hashCode = (((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237)) * 31;
        y23 y23Var = this.d;
        return hashCode + (y23Var == null ? 0 : y23Var.hashCode());
    }

    public final String toString() {
        oj ojVar = this.b;
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) ojVar) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ")";
    }
}
