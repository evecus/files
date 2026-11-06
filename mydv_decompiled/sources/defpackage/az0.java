package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class az0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public az0(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az0)) {
            return false;
        }
        az0 az0Var = (az0) obj;
        return j42.c(this.a, az0Var.a) && j42.c(this.b, az0Var.b) && this.c.equals(az0Var.c) && j42.c(this.d, az0Var.d);
    }

    public final int hashCode() {
        return ((this.d.hashCode() + hf1.n(hf1.n(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31) - 1465067183;
    }

    public final String toString() {
        StringBuilder F = r7.F("DouyinDanmakuArgs(webRid=", this.a, ", roomId=", this.b, ", userId=");
        F.append(this.c);
        F.append(", cookie=");
        F.append(this.d);
        F.append(", userAgent=Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.5845.97 Safari/537.36 Core/1.116.567.400 QQBrowser/19.7.6764.400)");
        return F.toString();
    }
}
