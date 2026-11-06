package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class j83 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public j83(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j83.class == obj.getClass()) {
            j83 j83Var = (j83) obj;
            return this.c == j83Var.c && this.d == j83Var.d && this.b == j83Var.b && this.a == j83Var.a && this.e == j83Var.e;
        }
        return false;
    }

    public final int hashCode() {
        int o = (jp0.o(this.b, jp0.o(this.d, Float.floatToIntBits(this.c) * 31, 31), 31) + this.a) * 31;
        long j = this.e;
        return o + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
