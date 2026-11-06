package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class go2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public go2(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go2)) {
            return false;
        }
        go2 go2Var = (go2) obj;
        return this.a.equals(go2Var.a) && this.b.equals(go2Var.b) && this.c.equals(go2Var.c) && this.d.equals(go2Var.d) && this.e.equals(go2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + hf1.n(hf1.n(hf1.n(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder F = r7.F("LivePartition(id=", this.a, ", name=", this.b, ", partitionCode=");
        r7.N(F, this.c, ", partitionType=", this.d, ", icon=");
        return hf1.z(F, this.e, ")");
    }
}
