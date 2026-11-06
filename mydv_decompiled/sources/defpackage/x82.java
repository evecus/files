package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class x82 {
    public static final x82 b = new x82(63, null);
    public final tm1 a;

    public x82(int i, tm1 tm1Var) {
        this.a = (i & 16) != 0 ? null : tm1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x82) && this.a == ((x82) obj).a;
    }

    public final int hashCode() {
        tm1 tm1Var = this.a;
        return (tm1Var != null ? tm1Var.hashCode() : 0) * 31;
    }
}
