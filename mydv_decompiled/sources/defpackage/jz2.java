package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jz2 {
    public final SparseArray a;
    public ec5 b;

    public jz2(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(ec5 ec5Var, int i, int i2) {
        int a = ec5Var.a(i);
        SparseArray sparseArray = this.a;
        jz2 jz2Var = (jz2) sparseArray.get(a);
        if (jz2Var == null) {
            jz2Var = new jz2(1);
            sparseArray.put(ec5Var.a(i), jz2Var);
        }
        if (i2 > i) {
            jz2Var.a(ec5Var, i + 1, i2);
        } else {
            jz2Var.b = ec5Var;
        }
    }
}
