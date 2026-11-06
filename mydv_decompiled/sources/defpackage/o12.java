package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class o12 {
    public static final o12 e = new o12(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public o12(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static o12 a(o12 o12Var, o12 o12Var2) {
        return b(Math.max(o12Var.a, o12Var2.a), Math.max(o12Var.b, o12Var2.b), Math.max(o12Var.c, o12Var2.c), Math.max(o12Var.d, o12Var2.d));
    }

    public static o12 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new o12(i, i2, i3, i4);
    }

    public static o12 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return z9.f(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o12.class != obj.getClass()) {
            return false;
        }
        o12 o12Var = (o12) obj;
        return this.d == o12Var.d && this.a == o12Var.a && this.c == o12Var.c && this.b == o12Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return hf1.y(sb, this.d, '}');
    }
}
