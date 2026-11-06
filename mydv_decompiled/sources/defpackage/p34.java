package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class p34 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;
    public final int h;
    public final boolean i;

    public p34(String str, String str2, String str3, boolean z, String str4, String str5, boolean z2, int i, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = str5;
        this.g = z2;
        this.h = i;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p34)) {
            return false;
        }
        p34 p34Var = (p34) obj;
        return this.a.equals(p34Var.a) && this.b.equals(p34Var.b) && this.c.equals(p34Var.c) && this.d == p34Var.d && this.e.equals(p34Var.e) && this.f.equals(p34Var.f) && this.g == p34Var.g && this.h == p34Var.h && this.i == p34Var.i;
    }

    public final int hashCode() {
        return pt1.o(this.i) + ((((pt1.o(this.g) + hf1.n(hf1.n((pt1.o(this.d) + hf1.n(hf1.n(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f)) * 31) + this.h) * 31);
    }

    public final String toString() {
        StringBuilder F = r7.F("AnnouncementConfig(id=", this.a, ", title=", this.b, ", content=");
        F.append(this.c);
        F.append(", isForced=");
        F.append(this.d);
        F.append(", confirmText=");
        r7.N(F, this.e, ", cancelText=", this.f, ", showCancel=");
        F.append(this.g);
        F.append(", version=");
        F.append(this.h);
        F.append(", showEveryTime=");
        F.append(this.i);
        F.append(")");
        return F.toString();
    }
}
