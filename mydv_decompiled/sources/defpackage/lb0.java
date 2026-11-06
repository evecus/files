package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class lb0 extends og3 implements Serializable {
    public final qe I;

    public lb0(qe qeVar) {
        this.I = qeVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.I.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof lb0) && this.I == ((lb0) obj).I;
    }

    public final int hashCode() {
        return this.I.hashCode();
    }

    public final String toString() {
        return this.I.toString();
    }
}
