package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ov2 extends q3 {
    public final /* synthetic */ Map.Entry I;
    public final /* synthetic */ qv2 J;

    public ov2(Map.Entry entry, qv2 qv2Var) {
        this.I = entry;
        this.J = qv2Var;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.I.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.I;
        return this.J.c(entry.getKey(), entry.getValue());
    }
}
