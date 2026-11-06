package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class p54 extends og3 implements Serializable {
    public final og3 I;

    public p54(og3 og3Var) {
        this.I = og3Var;
    }

    @Override // defpackage.og3
    public final og3 a() {
        return this.I;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.I.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p54) {
            return this.I.equals(((p54) obj).I);
        }
        return false;
    }

    public final int hashCode() {
        return -this.I.hashCode();
    }

    public final String toString() {
        return this.I + ".reverse()";
    }
}
