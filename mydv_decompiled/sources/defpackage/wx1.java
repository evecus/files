package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wx1 extends q3 implements Serializable {
    public final Object I;
    public final Object J;

    public wx1(Object obj, Object obj2) {
        this.I = obj;
        this.J = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.I;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.J;
    }

    @Override // defpackage.q3, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
