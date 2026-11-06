package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class vl0 {
    public final LinkedHashMap a = new LinkedHashMap();

    public Object a(o63 o63Var) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vl0) {
            return this.a.equals(((vl0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ")";
    }
}
