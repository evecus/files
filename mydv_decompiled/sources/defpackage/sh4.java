package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sh4 {
    public final s44 a;
    public final int b;
    public final long c;

    public sh4(s44 s44Var, int i, long j) {
        this.a = s44Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh4)) {
            return false;
        }
        sh4 sh4Var = (sh4) obj;
        return this.a == sh4Var.a && this.b == sh4Var.b && this.c == sh4Var.c;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b) * 31;
        long j = this.c;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
        sb.append(this.a);
        sb.append(", offset=");
        sb.append(this.b);
        sb.append(", selectableId=");
        return r7.D(sb, this.c, ")");
    }
}
