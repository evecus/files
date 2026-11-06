package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class d83 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public String h;

    public d83(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
        this.f = i2;
        this.g = i3;
    }

    public final int a() {
        return this.c;
    }

    public final String b() {
        return this.h;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.a;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d83)) {
            return false;
        }
        d83 d83Var = (d83) obj;
        return this.a == d83Var.a && this.b == d83Var.b && this.c == d83Var.c && j42.c(this.h, d83Var.h) && this.d == d83Var.d && this.e == d83Var.e && this.f == d83Var.f && this.g == d83Var.g;
    }

    public final boolean f() {
        return this.b;
    }

    public final int hashCode() {
        int i = (((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 31;
        return ((((((((((((i + (this.h != null ? r1.hashCode() : 0)) * 29791) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        String str = this.h;
        StringBuilder sb = new StringBuilder(d83.class.getSimpleName());
        sb.append("(");
        if (this.a) {
            sb.append("launchSingleTop ");
        }
        if (this.b) {
            sb.append("restoreState ");
        }
        if ((str != null || this.c != -1) && str != null) {
            sb.append("popUpTo(");
            sb.append(str);
            if (this.d) {
                sb.append(" inclusive");
            }
            if (this.e) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        int i = this.g;
        int i2 = this.f;
        if (i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        return sb.toString();
    }
}
