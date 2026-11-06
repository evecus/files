package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ly0 extends t2 {
    public final Iterator K;
    public final HashSet L;

    public ly0(Iterator it, yv3 yv3Var) {
        it.getClass();
        this.K = it;
        this.L = new HashSet();
    }

    @Override // defpackage.t2
    public final void a() {
        Object next;
        do {
            Iterator it = this.K;
            if (!it.hasNext()) {
                this.I = (byte) 2;
                return;
            }
            next = it.next();
        } while (!this.L.add(next));
        this.J = next;
        this.I = (byte) 1;
    }
}
