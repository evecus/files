package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lu4 {
    public final tw1 a;
    public final long b;
    public final long c;

    public lu4(tw1 tw1Var, long j, long j2) {
        tw1Var.getClass();
        this.a = tw1Var;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu4)) {
            return false;
        }
        lu4 lu4Var = (lu4) obj;
        return j42.c(this.a, lu4Var.a) && pd3.c(this.b, lu4Var.b) && fq4.a(this.c, lu4Var.c);
    }

    public final int hashCode() {
        return i82.Q(this.c) + ((i82.Q(this.b) + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String h = pd3.h(this.b);
        String d = fq4.d(this.c);
        StringBuilder sb = new StringBuilder("SpriteFrame(bitmap=");
        sb.append(this.a);
        sb.append(", srcOffset=");
        sb.append(h);
        sb.append(", srcSize=");
        return hf1.z(sb, d, ")");
    }
}
