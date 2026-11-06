package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class za1 extends y2 implements ya1, RandomAccess, Serializable {
    public final Enum[] I;

    public za1(Enum[] enumArr) {
        enumArr.getClass();
        this.I = enumArr;
    }

    @Override // defpackage.w1
    public final int c() {
        return this.I.length;
    }

    @Override // defpackage.w1, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) dq.e1(r3.ordinal(), this.I)) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.I;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        zy.o(r7.x(i, length, "index: ", ", size: "));
        return null;
    }

    @Override // defpackage.y2, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) dq.e1(ordinal, this.I)) == r3) {
            return ordinal;
        }
        return -1;
    }

    @Override // defpackage.y2, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) dq.e1(ordinal, this.I)) == r3) {
            return ordinal;
        }
        return -1;
    }
}
