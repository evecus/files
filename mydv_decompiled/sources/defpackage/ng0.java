package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ng0 implements oj4 {
    public final AtomicReference a;

    public ng0(oj4 oj4Var) {
        this.a = new AtomicReference(oj4Var);
    }

    @Override // defpackage.oj4
    public final Iterator iterator() {
        oj4 oj4Var = (oj4) this.a.getAndSet(null);
        if (oj4Var != null) {
            return oj4Var.iterator();
        }
        zy.i("This sequence can be consumed only once.");
        return null;
    }
}
