package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mm3 extends w1 {
    public final bm3 I;

    public mm3(bm3 bm3Var) {
        this.I = bm3Var;
    }

    @Override // defpackage.w1
    public final int c() {
        return this.I.J;
    }

    @Override // defpackage.w1, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.I.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        sa5 sa5Var = this.I.I;
        ta5[] ta5VarArr = new ta5[8];
        for (int i = 0; i < 8; i++) {
            ta5VarArr[i] = new va5((byte) 1);
        }
        return new lm3(sa5Var, ta5VarArr);
    }
}
