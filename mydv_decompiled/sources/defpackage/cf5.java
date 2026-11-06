package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class cf5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public cf5(String str, String str2, String str3, String str4, String str5) {
        str2.getClass();
        str3.getClass();
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
        if (!(obj instanceof cf5)) {
            return false;
        }
        cf5 cf5Var = (cf5) obj;
        return this.a.equals(cf5Var.a) && j42.c(this.b, cf5Var.b) && j42.c(this.c, cf5Var.c) && j42.c(this.d, cf5Var.d) && j42.c(this.e, cf5Var.e);
    }

    public final int hashCode() {
        int n = hf1.n(hf1.n(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (n + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder F = r7.F("UpdateInfo(versionName=", this.a, ", updateLog=", this.b, ", downloadUrl=");
        r7.N(F, this.c, ", sha256=", this.d, ", signerSha256=");
        return hf1.z(F, this.e, ")");
    }
}
