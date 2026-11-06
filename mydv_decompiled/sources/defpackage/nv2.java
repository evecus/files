package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nv2 implements pn1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qv2 b;

    public /* synthetic */ nv2(qv2 qv2Var, byte b) {
        this.a = b;
        this.b = qv2Var;
    }

    @Override // defpackage.pn1
    public final Object apply(Object obj) {
        byte b = this.a;
        qv2 qv2Var = this.b;
        switch (b) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getKey();
                return ((pn1) ((uu2) qv2Var).I).apply(entry.getValue());
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                return new ov2(entry2, qv2Var);
        }
    }
}
