package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class im3 extends r4 implements ty1 {
    public final bm3 I;

    public im3(bm3 bm3Var) {
        this.I = bm3Var;
    }

    @Override // defpackage.w1
    public final int c() {
        return this.I.J;
    }

    @Override // defpackage.w1, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        bm3 bm3Var = this.I;
        Object obj2 = bm3Var.get(key);
        return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && bm3Var.containsKey(entry.getKey());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        sa5 sa5Var = this.I.I;
        ta5[] ta5VarArr = new ta5[8];
        for (int i = 0; i < 8; i++) {
            ta5VarArr[i] = new ua5();
        }
        return new jm3(sa5Var, ta5VarArr);
    }
}
