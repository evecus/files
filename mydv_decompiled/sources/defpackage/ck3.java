package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ck3 implements kj {
    public final int a;
    public final int b;
    public final long c;
    public final i55 d;
    public final vn3 e;
    public final pj2 f;
    public final int g;
    public final int h;
    public final b65 i;

    public ck3(int i, int i2, long j, i55 i55Var, vn3 vn3Var, pj2 pj2Var, int i3, int i4, b65 b65Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = i55Var;
        this.e = vn3Var;
        this.f = pj2Var;
        this.g = i3;
        this.h = i4;
        this.i = b65Var;
        q65[] q65VarArr = p65.b;
        if (p65.a(j, p65.c)) {
            return;
        }
        if (p65.c(j) >= 0.0f) {
            return;
        }
        r02.c("lineHeight can't be negative (" + p65.c(j) + ")");
    }

    public final ck3 a(ck3 ck3Var) {
        return ck3Var == null ? this : dk3.a(this, ck3Var.a, ck3Var.b, ck3Var.c, ck3Var.d, ck3Var.e, ck3Var.f, ck3Var.g, ck3Var.h, ck3Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck3)) {
            return false;
        }
        ck3 ck3Var = (ck3) obj;
        return this.a == ck3Var.a && this.b == ck3Var.b && p65.a(this.c, ck3Var.c) && j42.c(this.d, ck3Var.d) && j42.c(this.e, ck3Var.e) && j42.c(this.f, ck3Var.f) && this.g == ck3Var.g && this.h == ck3Var.h && j42.c(this.i, ck3Var.i);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        q65[] q65VarArr = p65.b;
        int Q = (i82.Q(this.c) + i) * 31;
        i55 i55Var = this.d;
        int hashCode = (Q + (i55Var != null ? i55Var.hashCode() : 0)) * 31;
        vn3 vn3Var = this.e;
        int hashCode2 = (hashCode + (vn3Var != null ? vn3Var.hashCode() : 0)) * 31;
        pj2 pj2Var = this.f;
        int hashCode3 = (((((hashCode2 + (pj2Var != null ? pj2Var.hashCode() : 0)) * 31) + this.g) * 31) + this.h) * 31;
        b65 b65Var = this.i;
        return hashCode3 + (b65Var != null ? b65Var.hashCode() : 0);
    }

    public final String toString() {
        String a = k25.a(this.a);
        String a2 = q35.a(this.b);
        String d = p65.d(this.c);
        String a3 = kj2.a(this.g);
        String a4 = cw1.a(this.h);
        StringBuilder F = r7.F("ParagraphStyle(textAlign=", a, ", textDirection=", a2, ", lineHeight=");
        F.append(d);
        F.append(", textIndent=");
        F.append(this.d);
        F.append(", platformStyle=");
        F.append(this.e);
        F.append(", lineHeightStyle=");
        F.append(this.f);
        F.append(", lineBreak=");
        r7.N(F, a3, ", hyphens=", a4, ", textMotion=");
        F.append(this.i);
        F.append(")");
        return F.toString();
    }
}
