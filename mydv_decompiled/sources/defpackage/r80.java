package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class r80 {
    public final t80 a;
    public final s90 b;
    public final z70 c;
    public final boolean d;
    public final v90 e;

    public r80(t80 t80Var, s90 s90Var, z70 z70Var, boolean z, v90 v90Var) {
        t80Var.getClass();
        s90Var.getClass();
        z70Var.getClass();
        v90Var.getClass();
        this.a = t80Var;
        this.b = s90Var;
        this.c = z70Var;
        this.d = z;
        this.e = v90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r80)) {
            return false;
        }
        r80 r80Var = (r80) obj;
        return this.a == r80Var.a && this.b == r80Var.b && this.c == r80Var.c && this.d == r80Var.d && this.e == r80Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((pt1.o(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ColorSettings(source=" + this.a + ", style=" + this.b + ", contrast=" + this.c + ", ambientBackdrop=" + this.d + ", transition=" + this.e + ")";
    }
}
