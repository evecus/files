package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class cv2 implements Map.Entry, w72 {
    public final Object I;
    public final Object J;

    public cv2(Object obj, Object obj2) {
        this.I = obj;
        this.J = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && j42.c(entry.getKey(), this.I) && j42.c(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.I;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.J;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.I;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return this.I + "=" + getValue();
    }
}
