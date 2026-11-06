package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ed3 {
    public static final Object[] a = new Object[0];
    public static final e43 b = new e43(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            dq2.J0("Index " + i + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void b(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            dq2.H0("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
            throw null;
        }
        if (i < 0) {
            dq2.J0("fromIndex (" + i + ") is less than 0.");
            throw null;
        }
        if (i2 <= size) {
            return;
        }
        dq2.J0("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
