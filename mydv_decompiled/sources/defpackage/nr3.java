package defpackage;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nr3 implements mr3, Serializable {
    public final List I;

    public nr3(List list) {
        this.I = list;
    }

    @Override // defpackage.mr3
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.I;
            if (i >= list.size()) {
                return true;
            }
            if (!((mr3) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nr3) {
            return this.I.equals(((nr3) obj).I);
        }
        return false;
    }

    public final int hashCode() {
        return this.I.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.I) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
