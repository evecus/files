package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fd3 {
    public final int a;
    public final Integer b;

    public fd3(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd3)) {
            return false;
        }
        fd3 fd3Var = (fd3) obj;
        return this.a == fd3Var.a && j42.c(this.b, fd3Var.b);
    }

    public final int hashCode() {
        int i = this.a * 31;
        Integer num = this.b;
        return i + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.a + ", dataOffset=" + this.b + ")";
    }
}
