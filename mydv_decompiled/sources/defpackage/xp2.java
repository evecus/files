package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xp2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public xp2(String str, String str2, String str3, String str4) {
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp2)) {
            return false;
        }
        xp2 xp2Var = (xp2) obj;
        return this.a.equals(xp2Var.a) && this.b.equals(xp2Var.b) && j42.c(this.c, xp2Var.c) && j42.c(this.d, xp2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + hf1.n(hf1.n(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder F = r7.F("WebSocketRequestContext(primaryUrl=", this.a, ", backupUrl=", this.b, ", cookieHeader=");
        F.append(this.c);
        F.append(", userAgent=");
        F.append(this.d);
        F.append(")");
        return F.toString();
    }
}
