package coil3.size;

import defpackage.fj0;
import defpackage.j42;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class RealSizeResolver implements SizeResolver {
    private final Size size;

    public RealSizeResolver(Size size) {
        this.size = size;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RealSizeResolver) && j42.c(this.size, ((RealSizeResolver) obj).size);
    }

    public int hashCode() {
        return this.size.hashCode();
    }

    @Override // coil3.size.SizeResolver
    public Object size(fj0 fj0Var) {
        return this.size;
    }

    public String toString() {
        return "RealSizeResolver(size=" + this.size + ")";
    }
}
