package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class vr4 {
    public static final tr4 a(tr4 tr4Var) {
        if (!(tr4Var instanceof tr4)) {
            tr4Var = null;
        }
        if (tr4Var != null) {
            return tr4Var;
        }
        ke0.b("Inconsistent composition");
        zy.n();
        return null;
    }

    public static final int b(ArrayList arrayList, int i, int i2) {
        int c = c(arrayList, i, i2);
        return c >= 0 ? c : -(c + 1);
    }

    public static final int c(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((bo1) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int m = j42.m(i5, i);
            if (m < 0) {
                i3 = i4 + 1;
            } else {
                if (m <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int d(int i, int[] iArr) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void e() {
        throw new ConcurrentModificationException();
    }

    public static final void f(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }
}
