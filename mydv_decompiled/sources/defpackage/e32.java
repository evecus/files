package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class e32 {
    public String a;
    public String b;
    public String c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e32)) {
            return false;
        }
        e32 e32Var = (e32) obj;
        return this.a.equals(e32Var.a) && this.b.equals(e32Var.b) && this.c.equals(e32Var.c) && this.d.equals(e32Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + hf1.n(hf1.n(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        StringBuilder F = r7.F("ParseState(ticket=", str, ", tsSign=", str2, ", privateKey=");
        F.append(str3);
        F.append(", serverCert=");
        F.append(str4);
        F.append(")");
        return F.toString();
    }
}
