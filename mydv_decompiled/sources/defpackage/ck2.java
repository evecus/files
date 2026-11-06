package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ck2 extends ek2 {
    public final String a;
    public final z55 b;

    public ck2(String str, z55 z55Var) {
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
        if (!(obj instanceof ck2)) {
            return false;
        }
        ck2 ck2Var = (ck2) obj;
        return this.a.equals(ck2Var.a) && j42.c(this.b, ck2Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        z55 z55Var = this.b;
        return (hashCode + (z55Var != null ? z55Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return r7.C("LinkAnnotation.Clickable(tag=", this.a, ")");
    }
}
