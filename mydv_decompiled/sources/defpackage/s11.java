package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class s11 implements pk0 {
    public final float a;

    public s11(float f) {
        this.a = f;
    }

    @Override // defpackage.pk0
    public final float a(long j, iu0 iu0Var) {
        return iu0Var.P(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s11) && r11.c(this.a, ((s11) obj).a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
