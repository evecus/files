package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class f34 extends hc4 {
    public final hc4 e;
    public final int f;

    public f34(hc4 hc4Var, int i) {
        this.e = hc4Var;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f34)) {
            return false;
        }
        f34 f34Var = (f34) obj;
        return f34Var.e.equals(this.e) && f34Var.f == this.f;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.f * 31);
    }
}
