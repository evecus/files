package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wd0 {
    public final int a;
    public final Integer b;

    public wd0(int i, kb4 kb4Var, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd0)) {
            return false;
        }
        wd0 wd0Var = (wd0) obj;
        return this.a == wd0Var.a && j42.c(null, null) && j42.c(this.b, wd0Var.b);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + 0) * 31;
        Integer num = this.b;
        return i + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.b + ")";
    }
}
