package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lf0 extends og3 implements Serializable {
    public final Comparator[] I;

    public lf0(vz vzVar, vz vzVar2) {
        this.I = new Comparator[]{vzVar, vzVar2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.I;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lf0) {
            return Arrays.equals(this.I, ((lf0) obj).I);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.I);
    }

    public final String toString() {
        return hf1.z(new StringBuilder("Ordering.compound("), Arrays.toString(this.I), ")");
    }
}
