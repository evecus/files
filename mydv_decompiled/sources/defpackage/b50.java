package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class b50 {
    public final String a;
    public final String b;
    public final List c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public b50(String str, String str2, List list, boolean z, String str3, boolean z2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
        this.e = str3;
        this.f = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List] */
    public static b50 a(b50 b50Var, ArrayList arrayList, boolean z, String str, int i) {
        String str2 = b50Var.a;
        String str3 = b50Var.b;
        ArrayList arrayList2 = arrayList;
        if ((i & 4) != 0) {
            arrayList2 = b50Var.c;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i & 8) != 0) {
            z = b50Var.d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str = b50Var.e;
        }
        String str4 = str;
        boolean z3 = (i & 32) != 0 ? b50Var.f : true;
        b50Var.getClass();
        str2.getClass();
        str3.getClass();
        arrayList3.getClass();
        return new b50(str2, str3, arrayList3, z2, str4, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b50)) {
            return false;
        }
        b50 b50Var = (b50) obj;
        return j42.c(this.a, b50Var.a) && j42.c(this.b, b50Var.b) && j42.c(this.c, b50Var.c) && this.d == b50Var.d && j42.c(this.e, b50Var.e) && this.f == b50Var.f;
    }

    public final int hashCode() {
        int o = (pt1.o(this.d) + ((this.c.hashCode() + hf1.n(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        String str = this.e;
        return pt1.o(this.f) + ((o + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder F = r7.F("ChannelSection(title=", this.a, ", tagId=", this.b, ", videos=");
        F.append(this.c);
        F.append(", isLoading=");
        F.append(this.d);
        F.append(", error=");
        F.append(this.e);
        F.append(", loaded=");
        F.append(this.f);
        F.append(")");
        return F.toString();
    }
}
