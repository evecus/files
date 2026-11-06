package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import okhttp3.internal.url._UrlKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yx1 implements Serializable {
    public static final yx1 K = new yx1(new int[0], 0);
    public final int[] I;
    public final int J;

    public yx1(int[] iArr, int i) {
        this.I = iArr;
        this.J = i;
    }

    public static yx1 a(int[] iArr) {
        if (iArr.length == 0) {
            return K;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        return new yx1(copyOf, copyOf.length);
    }

    public static yx1 c(int... iArr) {
        sp0.p(iArr.length <= 2147483646, "the total number of elements must fit in an int");
        int length = iArr.length + 1;
        int[] iArr2 = new int[length];
        iArr2[0] = 0;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new yx1(iArr2, length);
    }

    public final int b(int i) {
        sp0.u(i, this.J);
        return this.I[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yx1) {
            yx1 yx1Var = (yx1) obj;
            int i = yx1Var.J;
            int i2 = this.J;
            if (i2 == i) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (b(i3) == yx1Var.b(i3)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.J; i2++) {
            i = (i * 31) + this.I[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.J;
        if (i == 0) {
            return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.I;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
