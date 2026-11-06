package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class jz1 implements Iterable, w72 {
    public final rm1 I;

    public jz1(rm1 rm1Var) {
        this.I = rm1Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new v2((Iterator) this.I.invoke());
    }
}
