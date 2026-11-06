package defpackage;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class o15 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public o15(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o15)) {
            return false;
        }
        o15 o15Var = (o15) obj;
        if (!this.a.equals(o15Var.a) || !this.b.equals(o15Var.b) || !this.c.equals(o15Var.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = o15Var.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(hc4.A(o70.k1(this.b.values(), new xi1((byte) 17))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(hc4.A(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        sb.append(hc4.A(set != null ? o70.k1(set, new xi1((byte) 18)) : o91.I));
        sb.append("\n            |}\n        ");
        return kx4.q(sb.toString());
    }
}
