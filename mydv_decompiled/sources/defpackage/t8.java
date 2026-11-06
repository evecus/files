package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class t8 {
    public static final t8 c = new t8(0, 0);
    public static final t8 d = new t8(1, 1);
    public final int a;
    public final int b;

    public t8(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        t8 t8Var = (t8) obj;
        return this.a == t8Var.a && this.b == t8Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) r8.b(this.a)) + ", vertical=" + ((Object) s8.b(this.b)) + ')';
    }
}
