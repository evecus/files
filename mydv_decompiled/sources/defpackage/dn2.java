package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dn2 {
    public final go2 a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final boolean f;

    public dn2(go2 go2Var, List list, boolean z, boolean z2, int i, boolean z3) {
        this.a = go2Var;
        this.b = list;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = z3;
    }

    public static dn2 a(dn2 dn2Var, ArrayList arrayList, boolean z, boolean z2, int i, boolean z3, int i2) {
        List list = arrayList;
        go2 go2Var = dn2Var.a;
        if ((i2 & 2) != 0) {
            list = dn2Var.b;
        }
        if ((i2 & 8) != 0) {
            z2 = dn2Var.d;
        }
        if ((i2 & 16) != 0) {
            i = dn2Var.e;
        }
        if ((i2 & 32) != 0) {
            z3 = dn2Var.f;
        }
        boolean z4 = z3;
        go2Var.getClass();
        list.getClass();
        return new dn2(go2Var, list, z, z2, i, z4);
    }

    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn2)) {
            return false;
        }
        dn2 dn2Var = (dn2) obj;
        return j42.c(this.a, dn2Var.a) && j42.c(this.b, dn2Var.b) && this.c == dn2Var.c && this.d == dn2Var.d && this.e == dn2Var.e && this.f == dn2Var.f;
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + this.e) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        return "LiveGroupData(partition=" + this.a + ", rooms=" + this.b + ", isLoading=" + this.c + ", hasMore=" + this.d + ", offset=" + this.e + ", appendFailed=" + this.f + ")";
    }

    public /* synthetic */ dn2(go2 go2Var) {
        this(go2Var, o91.I, false, true, 0, false);
    }
}
