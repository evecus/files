package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ru4 {
    public final su4 a;
    public final ou4 b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public ru4(su4 su4Var, ou4 ou4Var, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a = su4Var;
        this.b = ou4Var;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = f7;
    }

    public final float a() {
        r11 r11Var = new r11((this.c - this.e) / 2.0f);
        r11 r11Var2 = new r11(0.0f);
        if (r11Var.compareTo(r11Var2) < 0) {
            r11Var = r11Var2;
        }
        return r11Var.I;
    }

    public final boolean b() {
        return this.a == su4.J;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru4)) {
            return false;
        }
        ru4 ru4Var = (ru4) obj;
        return this.a == ru4Var.a && this.b == ru4Var.b && r11.c(this.c, ru4Var.c) && r11.c(this.d, ru4Var.d) && r11.c(this.e, ru4Var.e) && r11.c(this.f, ru4Var.f) && Float.compare(this.g, ru4Var.g) == 0 && r11.c(this.h, ru4Var.h) && r11.c(this.i, ru4Var.i);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.i) + jp0.o(this.h, jp0.o(this.g, jp0.o(this.f, jp0.o(this.e, jp0.o(this.d, jp0.o(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String d = r11.d(this.c);
        String d2 = r11.d(this.d);
        String d3 = r11.d(this.e);
        String d4 = r11.d(this.f);
        String d5 = r11.d(this.h);
        String d6 = r11.d(this.i);
        StringBuilder sb = new StringBuilder("StageGeometry(mode=");
        sb.append(this.a);
        sb.append(", chrome=");
        sb.append(this.b);
        sb.append(", stageWidth=");
        r7.N(sb, d, ", stageHeight=", d2, ", videoWidth=");
        r7.N(sb, d3, ", videoHeight=", d4, ", videoAspect=");
        sb.append(this.g);
        sb.append(", startColumnWidth=");
        sb.append(d5);
        sb.append(", endColumnWidth=");
        return hf1.z(sb, d6, ")");
    }
}
