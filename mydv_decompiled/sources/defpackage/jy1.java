package defpackage;

import j$.util.Objects;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jy1 extends ee5 {
    public final ee5 I;
    public Object J = null;
    public ee5 K = n52.L;

    public jy1(ey1 ey1Var) {
        this.I = ey1Var.M.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.K.hasNext() || this.I.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.K.hasNext()) {
            Map.Entry entry = (Map.Entry) this.I.next();
            this.J = entry.getKey();
            this.K = ((vx1) entry.getValue()).iterator();
        }
        Object obj = this.J;
        Objects.requireNonNull(obj);
        return new wx1(obj, this.K.next());
    }
}
