package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class m15 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public m15(String str, String str2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m15)) {
            return false;
        }
        m15 m15Var = (m15) obj;
        if (j42.c(this.a, m15Var.a) && j42.c(this.b, m15Var.b) && j42.c(this.c, m15Var.c) && this.d.equals(m15Var.d)) {
            return this.e.equals(m15Var.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + hf1.n(hf1.n(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.c);
        sb.append("',\n            |   columnNames = {");
        kx4.o(o70.Z0(o70.j1(this.d), ",", null, null, 0, null, 62), "    ");
        kx4.o("},", "    ");
        wd5 wd5Var = wd5.a;
        sb.append(wd5Var);
        sb.append("\n            |   referenceColumnNames = {");
        kx4.o(o70.Z0(o70.j1(this.e), ",", null, null, 0, null, 62), "    ");
        kx4.o(" }", "    ");
        sb.append(wd5Var);
        sb.append("\n            |}\n        ");
        return kx4.o(kx4.q(sb.toString()), "    ");
    }
}
