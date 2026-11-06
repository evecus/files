package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gt {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public gt(j83 j83Var) {
        j83Var.getClass();
        float f = j83Var.c;
        float f2 = j83Var.d;
        float f3 = j83Var.b;
        int i = j83Var.a;
        long j = j83Var.e;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }
}
