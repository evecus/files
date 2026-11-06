package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pm3 extends r4 implements ty1, Collection, w72 {
    public static final pm3 L;
    public final Object I;
    public final Object J;
    public final bm3 K;

    static {
        q8 q8Var = q8.n0;
        L = new pm3(q8Var, q8Var, bm3.K);
    }

    public pm3(Object obj, Object obj2, bm3 bm3Var) {
        this.I = obj;
        this.J = obj2;
        this.K = bm3Var;
    }

    @Override // defpackage.w1
    public final int c() {
        return this.K.J;
    }

    @Override // defpackage.w1, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.K.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new h43(this.I, this.K);
    }
}
