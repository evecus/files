package defpackage;

import android.util.SparseArray;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class d24 {
    public SparseArray a;
    public int b;
    public Set c;

    public final c24 a(int i) {
        SparseArray sparseArray = this.a;
        c24 c24Var = (c24) sparseArray.get(i);
        if (c24Var != null) {
            return c24Var;
        }
        c24 c24Var2 = new c24();
        sparseArray.put(i, c24Var2);
        return c24Var2;
    }
}
