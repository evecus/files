package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class f00 implements Iterable, Serializable {
    public static final f00 K = new f00(r32.b);
    public static final n84 L;
    public int I = 0;
    public final byte[] J;

    static {
        L = u9.a() ? new n84((byte) 22) : new n84((byte) 20);
    }

    public f00(byte[] bArr) {
        bArr.getClass();
        this.J = bArr;
    }

    public static f00 c(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        int length = bArr.length;
        if (((i3 - i) | i | i3 | (length - i3)) < 0) {
            if (i < 0) {
                zy.o(r7.z("Beginning index: ", i, " < 0"));
            } else if (i3 < i) {
                zy.o(r7.x(i, i3, "Beginning index larger than ending index: ", ", "));
            } else {
                zy.o(r7.x(i3, length, "End index: ", " >= "));
            }
        }
        return new f00(L.i(bArr, i, i2));
    }

    public int d() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f00) || size() != ((f00) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof f00)) {
            return obj.equals(this);
        }
        f00 f00Var = (f00) obj;
        int i = this.I;
        int i2 = f00Var.I;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > f00Var.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > f00Var.size()) {
            StringBuilder C = hf1.C("Ran off end of other: 0, ", size, ", ");
            C.append(f00Var.size());
            throw new IllegalArgumentException(C.toString());
        }
        byte[] bArr = f00Var.J;
        int d = d() + size;
        int d2 = d();
        int d3 = f00Var.d();
        while (d2 < d) {
            if (this.J[d2] != bArr[d3]) {
                return false;
            }
            d2++;
            d3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.I;
        if (i != 0) {
            return i;
        }
        int size = size();
        int d = d();
        int i2 = size;
        for (int i3 = d; i3 < d + size; i3++) {
            i2 = (i2 * 31) + this.J[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.I = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c00(this);
    }

    public int size() {
        return this.J.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
