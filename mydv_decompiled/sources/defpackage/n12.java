package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class n12 {
    public final int a;
    public final int b;
    public final Map c;

    public /* synthetic */ n12(int i, int i2, Map map, int i3) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? p91.I : map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n12)) {
            return false;
        }
        n12 n12Var = (n12) obj;
        return this.a == n12Var.a && this.b == n12Var.b && j42.c(this.c, n12Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "InsertedViewInfo(mainViewId=" + this.a + ", complexViewId=" + this.b + ", children=" + this.c + ')';
    }

    public n12(int i, int i2, Map map) {
        this.a = i;
        this.b = i2;
        this.c = map;
    }
}
