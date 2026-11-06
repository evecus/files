package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class id1 implements Map.Entry, w72 {
    public final ui2 I;
    public final wi2 J;
    public id1 K;
    public id1 L;
    public boolean M;

    public id1(ui2 ui2Var, wi2 wi2Var) {
        this.I = ui2Var;
        this.J = wi2Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof id1) {
            id1 id1Var = (id1) obj;
            return this.I.equals(id1Var.I) && this.J == id1Var.J;
        }
        return false;
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
        return this.J.hashCode() + (this.I.hashCode() * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.I + ", value=" + this.J + ")";
    }
}
