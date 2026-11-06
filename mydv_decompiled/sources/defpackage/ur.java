package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ur {
    public final String a;
    public final String b;
    public final String c;

    public ur(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur)) {
            return false;
        }
        ur urVar = (ur) obj;
        return this.a.equals(urVar.a) && this.b.equals(urVar.b) && this.c.equals(urVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + hf1.n(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return hf1.z(r7.F("AuthSubmitPayload(cookie=", this.a, ", securityPayload=", this.b, ", privateKey="), this.c, ")");
    }
}
