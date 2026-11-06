package defpackage;

import java.util.List;
import okhttp3.Handshake;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class k30 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ List J;

    public /* synthetic */ k30(List list, byte b) {
        this.I = b;
        this.J = list;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        List list;
        byte b = this.I;
        List list2 = this.J;
        switch (b) {
            case 0:
                return Integer.valueOf(list2.size());
            case 1:
                return list2.iterator();
            case 2:
                Object obj = list2.get(2);
                obj.getClass();
                return (Integer) obj;
            case 3:
                list = Handshake.Companion.get$lambda$0(list2);
                return list;
            default:
                return Integer.valueOf(list2.size());
        }
    }
}
