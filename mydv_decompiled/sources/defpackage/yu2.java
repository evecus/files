package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yu2 extends xu2 implements Iterator, w72 {
    @Override // java.util.Iterator
    public final Object next() {
        a();
        int i = this.J;
        zu2 zu2Var = this.I;
        if (i >= zu2Var.N) {
            zy.k();
            return null;
        }
        this.J = i + 1;
        this.K = i;
        Object[] objArr = zu2Var.J;
        objArr.getClass();
        Object obj = objArr[this.K];
        b();
        return obj;
    }
}
