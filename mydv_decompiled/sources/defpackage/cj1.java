package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cj1 {
    public final br3 a;
    public final u11 b;
    public final boolean c;
    public final float d;
    public final float e;

    public cj1(br3 br3Var, u11 u11Var, boolean z, float f, float f2) {
        br3Var.getClass();
        this.a = br3Var;
        this.b = u11Var;
        this.c = z;
        this.d = f;
        this.e = f2;
    }

    public final float a() {
        return this.a == br3.J ? this.b.b : this.e;
    }

    public final float b() {
        return this.a == br3.K ? this.b.a : this.d;
    }

    public final boolean c() {
        return this.a != br3.I;
    }

    public final u11 d() {
        return this.b;
    }

    public final float e() {
        int ordinal = this.a.ordinal();
        if (ordinal == 0) {
            return 0.0f;
        }
        u11 u11Var = this.b;
        if (ordinal == 1) {
            r11 r11Var = new r11(u11Var.d - u11Var.b);
            r11 r11Var2 = new r11(0.0f);
            if (r11Var.compareTo(r11Var2) < 0) {
                r11Var = r11Var2;
            }
            return r11Var.I;
        }
        if (ordinal != 2) {
            s83.v();
            return 0.0f;
        }
        r11 r11Var3 = new r11(u11Var.c - u11Var.a);
        r11 r11Var4 = new r11(0.0f);
        if (r11Var3.compareTo(r11Var4) < 0) {
            r11Var3 = r11Var4;
        }
        return r11Var3.I;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj1)) {
            return false;
        }
        cj1 cj1Var = (cj1) obj;
        return this.a == cj1Var.a && j42.c(this.b, cj1Var.b) && this.c == cj1Var.c && r11.c(this.d, cj1Var.d) && r11.c(this.e, cj1Var.e);
    }

    public final float f() {
        br3 br3Var = this.a;
        br3 br3Var2 = br3.J;
        float f = this.e;
        if (br3Var != br3Var2) {
            return f;
        }
        r11 r11Var = new r11(f - this.b.d);
        r11 r11Var2 = new r11(0.0f);
        if (r11Var.compareTo(r11Var2) < 0) {
            r11Var = r11Var2;
        }
        return r11Var.I;
    }

    public final float g() {
        br3 br3Var = this.a;
        br3 br3Var2 = br3.K;
        float f = this.d;
        if (br3Var != br3Var2) {
            return f;
        }
        r11 r11Var = new r11(f - this.b.c);
        r11 r11Var2 = new r11(0.0f);
        if (r11Var.compareTo(r11Var2) < 0) {
            r11Var = r11Var2;
        }
        return r11Var.I;
    }

    public final br3 h() {
        return this.a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.e) + jp0.o(this.d, (((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237)) * 31, 31);
    }

    public final String toString() {
        String d = r11.d(this.d);
        String d2 = r11.d(this.e);
        StringBuilder sb = new StringBuilder("FoldPosture(split=");
        sb.append(this.a);
        sb.append(", hinge=");
        sb.append(this.b);
        sb.append(", occluding=");
        sb.append(this.c);
        sb.append(", windowWidth=");
        sb.append(d);
        sb.append(", windowHeight=");
        return hf1.z(sb, d2, ")");
    }

    public cj1() {
        this(br3.I, new u11(0.0f, 0.0f, 0.0f, 0.0f), false, 0.0f, 0.0f);
    }
}
