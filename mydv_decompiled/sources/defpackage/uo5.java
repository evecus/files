package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class uo5 {
    public final ArrayList a;
    public final boolean b;
    public final String c;

    public uo5(String str, ArrayList arrayList, boolean z) {
        str.getClass();
        this.a = arrayList;
        this.b = z;
        this.c = str;
    }

    public final boolean a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final List c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo5)) {
            return false;
        }
        uo5 uo5Var = (uo5) obj;
        return this.a.equals(uo5Var.a) && this.b == uo5Var.b && j42.c(this.c, uo5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchResult(videos=");
        sb.append(this.a);
        sb.append(", hasMore=");
        sb.append(this.b);
        sb.append(", searchId=");
        return hf1.z(sb, this.c, ")");
    }
}
