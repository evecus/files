package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class en3 {
    public final long a;
    public final long b;

    public en3(long j, long j2) {
        this.a = j;
        this.b = j2;
        q65[] q65VarArr = p65.b;
        if ((j & 1095216660480L) == 0) {
            r02.a("width cannot be TextUnit.Unspecified");
        }
        if ((j2 & 1095216660480L) == 0) {
            r02.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en3)) {
            return false;
        }
        en3 en3Var = (en3) obj;
        return p65.a(this.a, en3Var.a) && p65.a(this.b, en3Var.b);
    }

    public final int hashCode() {
        q65[] q65VarArr = p65.b;
        return ((i82.Q(this.b) + (i82.Q(this.a) * 31)) * 31) + 4;
    }

    public final String toString() {
        return hf1.x("Placeholder(width=", p65.d(this.a), ", height=", p65.d(this.b), ", placeholderVerticalAlign=Center)");
    }
}
