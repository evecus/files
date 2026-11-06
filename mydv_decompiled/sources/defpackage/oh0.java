package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class oh0 {
    public final rc2 a;
    public final int b;
    public final r8 c;
    public final s8 d;

    public /* synthetic */ oh0(rc2 rc2Var, int i, r8 r8Var, s8 s8Var, int i2) {
        this(rc2Var, i, (i2 & 4) != 0 ? null : r8Var, (i2 & 8) != 0 ? null : s8Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh0)) {
            return false;
        }
        oh0 oh0Var = (oh0) obj;
        return this.a == oh0Var.a && this.b == oh0Var.b && j42.c(this.c, oh0Var.c) && j42.c(this.d, oh0Var.d);
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b) * 31;
        r8 r8Var = this.c;
        int i = (hashCode + (r8Var == null ? 0 : r8Var.a)) * 31;
        s8 s8Var = this.d;
        return i + (s8Var != null ? s8Var.a : 0);
    }

    public final String toString() {
        return "ContainerSelector(type=" + this.a + ", numChildren=" + this.b + ", horizontalAlignment=" + this.c + ", verticalAlignment=" + this.d + ')';
    }

    public oh0(rc2 rc2Var, int i, r8 r8Var, s8 s8Var) {
        this.a = rc2Var;
        this.b = i;
        this.c = r8Var;
        this.d = s8Var;
    }
}
