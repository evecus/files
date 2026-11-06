package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class z54 {
    public final long a = x70.g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z54)) {
            return false;
        }
        long j = ((z54) obj).a;
        int i = x70.h;
        return zc5.a(this.a, j);
    }

    public final int hashCode() {
        int i = x70.h;
        return i82.Q(this.a) * 961;
    }

    public final String toString() {
        return r7.C("RippleConfiguration(color=", x70.i(this.a), ", focus=null, rippleAlpha=null)");
    }
}
