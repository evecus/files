package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bs4 implements Map.Entry, Comparable {
    public final Comparable I;
    public Object J;
    public final /* synthetic */ yr4 K;

    public bs4(yr4 yr4Var, Comparable comparable, Object obj) {
        this.K = yr4Var;
        this.I = comparable;
        this.J = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.I.compareTo(((bs4) obj).I);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.I;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.J;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.I;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.J;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.I;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.J;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.K.b();
        Object obj2 = this.J;
        this.J = obj;
        return obj2;
    }

    public final String toString() {
        return this.I + "=" + this.J;
    }
}
