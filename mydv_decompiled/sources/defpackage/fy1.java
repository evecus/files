package defpackage;

import java.io.Serializable;
import okhttp3.internal.url._UrlKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fy1 implements Serializable {
    public static final fy1 K = new fy1(new long[0], 0);
    public final long[] I;
    public final int J;

    public fy1(long[] jArr, int i) {
        this.I = jArr;
        this.J = i;
    }

    public final long a(int i) {
        sp0.u(i, this.J);
        return this.I[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fy1) {
            fy1 fy1Var = (fy1) obj;
            int i = fy1Var.J;
            int i2 = this.J;
            if (i2 == i) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (a(i3) == fy1Var.a(i3)) {
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
            i = (i * 31) + jl2.L(this.I[i2]);
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
        long[] jArr = this.I;
        sb.append(jArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(jArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
