package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class mq4 extends q13 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;
    public final yy0 f;

    public mq4(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
    }

    @Override // defpackage.q13
    public final k13 create() {
        sq4 sq4Var = new sq4();
        sq4Var.I = this.a;
        sq4Var.J = this.b;
        sq4Var.K = this.c;
        sq4Var.L = this.d;
        sq4Var.M = this.e;
        return sq4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq4)) {
            return false;
        }
        mq4 mq4Var = (mq4) obj;
        return r11.c(this.a, mq4Var.a) && r11.c(this.b, mq4Var.b) && r11.c(this.c, mq4Var.c) && r11.c(this.d, mq4Var.d) && this.e == mq4Var.e;
    }

    public final int hashCode() {
        return pt1.o(this.e) + jp0.o(this.d, jp0.o(this.c, jp0.o(this.b, Float.floatToIntBits(this.a) * 31, 31), 31), 31);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        this.f.getClass();
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        sq4 sq4Var = (sq4) k13Var;
        sq4Var.I = this.a;
        sq4Var.J = this.b;
        sq4Var.K = this.c;
        sq4Var.L = this.d;
        sq4Var.M = this.e;
    }

    public mq4(float f, float f2, float f3, float f4, boolean z) {
        yy0 yy0Var = mw2.g;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
        this.f = yy0Var;
    }
}
