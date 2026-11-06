package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ci5 {
    public final hj a;
    public final l61 b;

    public ci5(hj hjVar, l61 l61Var) {
        this.a = hjVar;
        this.b = l61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci5)) {
            return false;
        }
        ci5 ci5Var = (ci5) obj;
        return j42.c(this.a, ci5Var.a) && j42.c(this.b, ci5Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
