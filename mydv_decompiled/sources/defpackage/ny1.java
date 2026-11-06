package defpackage;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ny1 extends ee5 {
    public int I;
    public Object J;
    public final /* synthetic */ Iterator K;

    public ny1(ee5 ee5Var) {
        this.K = ee5Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.I > 0 || this.K.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.I;
        if (i <= 0) {
            zc3 zc3Var = (zc3) this.K.next();
            this.J = zc3Var.a;
            i = zc3Var.a();
            this.I = i;
        }
        this.I = i - 1;
        Object obj = this.J;
        Objects.requireNonNull(obj);
        return obj;
    }
}
