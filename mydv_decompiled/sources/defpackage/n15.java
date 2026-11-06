package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class n15 {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public n15(String str, boolean z, List list, List list2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n15) {
            n15 n15Var = (n15) obj;
            String str = n15Var.a;
            if (this.b == n15Var.b && this.c.equals(n15Var.c) && j42.c(this.d, n15Var.d)) {
                String str2 = this.a;
                return qx4.y(str2, "index_", false) ? qx4.y(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + ((((qx4.y(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   unique = '");
        sb.append(this.b);
        sb.append("',\n            |   columns = {");
        kx4.o(o70.Z0(this.c, ",", null, null, 0, null, 62), "    ");
        kx4.o("},", "    ");
        wd5 wd5Var = wd5.a;
        sb.append(wd5Var);
        sb.append("\n            |   orders = {");
        kx4.o(o70.Z0(this.d, ",", null, null, 0, null, 62), "    ");
        kx4.o(" }", "    ");
        sb.append(wd5Var);
        sb.append("\n            |}\n        ");
        return kx4.o(kx4.q(sb.toString()), "    ");
    }
}
