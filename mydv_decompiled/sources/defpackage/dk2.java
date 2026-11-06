package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dk2 extends ek2 {
    public final String a;
    public final z55 b;

    public dk2(String str, z55 z55Var) {
        this.a = str;
        this.b = z55Var;
    }

    @Override // defpackage.ek2
    public final z55 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2)) {
            return false;
        }
        dk2 dk2Var = (dk2) obj;
        return j42.c(this.a, dk2Var.a) && j42.c(this.b, dk2Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        z55 z55Var = this.b;
        return (hashCode + (z55Var != null ? z55Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return r7.C("LinkAnnotation.Url(url=", this.a, ")");
    }

    public /* synthetic */ dk2(String str, z55 z55Var, int i) {
        this(str, z55Var);
    }
}
