package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class i55 {
    public static final i55 c = new i55(oh4.j(0), oh4.j(0));
    public final long a;
    public final long b;

    public i55(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i55)) {
            return false;
        }
        i55 i55Var = (i55) obj;
        return p65.a(this.a, i55Var.a) && p65.a(this.b, i55Var.b);
    }

    public final int hashCode() {
        q65[] q65VarArr = p65.b;
        return i82.Q(this.b) + (i82.Q(this.a) * 31);
    }

    public final String toString() {
        return hf1.x("TextIndent(firstLine=", p65.d(this.a), ", restLine=", p65.d(this.b), ")");
    }
}
