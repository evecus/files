package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class c53 {
    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            c(i, size);
        }
    }

    public static final void b(List list, int i, int i2) {
        if (i > i2) {
            f(i, i2);
        }
        if (i < 0) {
            d(i);
        }
        if (i2 > list.size()) {
            e(i2, list.size());
        }
    }

    private static final void c(int i, int i2) {
        throw new IndexOutOfBoundsException(hf1.v("Index ", i, " is out of bounds. The list has ", i2, " elements."));
    }

    private static final void d(int i) {
        throw new IndexOutOfBoundsException(r7.z("fromIndex (", i, ") is less than 0."));
    }

    private static final void e(int i, int i2) {
        throw new IndexOutOfBoundsException(hf1.v("toIndex (", i, ") is more than than the list size (", i2, ")"));
    }

    private static final void f(int i, int i2) {
        throw new IllegalArgumentException(hf1.v("Indices are out of order. fromIndex (", i, ") is greater than toIndex (", i2, ")."));
    }
}
