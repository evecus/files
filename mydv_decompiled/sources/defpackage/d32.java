package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class d32 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public d32(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean a() {
        return (jx4.L(this.b) || jx4.L(this.c) || jx4.L(this.d)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d32)) {
            return false;
        }
        d32 d32Var = (d32) obj;
        return j42.c(this.a, d32Var.a) && j42.c(this.b, d32Var.b) && j42.c(this.c, d32Var.c) && j42.c(this.d, d32Var.d) && this.e.equals(d32Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + hf1.n(hf1.n(hf1.n(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder F = r7.F("InteractionSecurityConfig(rawPayload=", this.a, ", ticket=", this.b, ", tsSign=");
        r7.N(F, this.c, ", privateKey=", this.d, ", serverCert=");
        return hf1.z(F, this.e, ")");
    }
}
