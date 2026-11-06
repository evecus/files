package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pv2 extends t95 {
    public final /* synthetic */ byte J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pv2(Iterator it, byte b) {
        super(it);
        this.J = b;
    }

    @Override // defpackage.t95
    public final Object a(Object obj) {
        switch (this.J) {
            case 0:
                return ((Map.Entry) obj).getKey();
            default:
                return ((Map.Entry) obj).getValue();
        }
    }
}
