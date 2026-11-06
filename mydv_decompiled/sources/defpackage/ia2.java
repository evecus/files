package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ia2 {
    public final int a;

    public ia2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ia2) && this.a == ((ia2) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return hf1.y(new StringBuilder("LayoutInfo(layoutId="), this.a, ')');
    }
}
