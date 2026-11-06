package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wa1 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ wa1(int i, String str, xa1 xa1Var) {
        this.I = (byte) 0;
        this.J = i;
        this.K = str;
        this.L = xa1Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        wd5 pushRequestLater$lambda$1;
        byte b = this.I;
        Integer num = null;
        int i = this.J;
        Object obj = this.L;
        Object obj2 = this.K;
        switch (b) {
            case 0:
                String str = (String) obj2;
                xa1 xa1Var = (xa1) obj;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i];
                for (int i2 = 0; i2 < i; i2++) {
                    serialDescriptorArr[i2] = li4.b(str + '.' + xa1Var.e[i2], sx4.g, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
            case 1:
                pushRequestLater$lambda$1 = Http2Connection.pushRequestLater$lambda$1((Http2Connection) obj2, i, (List) obj);
                return pushRequestLater$lambda$1;
            case 2:
                List list = (List) obj;
                Iterator it = ((zg2) obj2).g().m.iterator();
                if (it.hasNext()) {
                    Integer valueOf = Integer.valueOf(((ug2) it.next()).a);
                    while (true) {
                        num = valueOf;
                        while (it.hasNext()) {
                            valueOf = Integer.valueOf(((ug2) it.next()).a);
                            if (num.compareTo(valueOf) < 0) {
                                break;
                            }
                        }
                    }
                }
                int intValue = num != null ? num.intValue() : -1;
                int X = p70.X(list) - i;
                if (X < 0) {
                    X = 0;
                }
                return Boolean.valueOf(intValue >= X);
            default:
                Map map = (Map) obj;
                Iterator it2 = ((zg2) obj2).g().m.iterator();
                if (it2.hasNext()) {
                    Integer valueOf2 = Integer.valueOf(((ug2) it2.next()).a);
                    while (true) {
                        num = valueOf2;
                        while (it2.hasNext()) {
                            valueOf2 = Integer.valueOf(((ug2) it2.next()).a);
                            if (num.compareTo(valueOf2) < 0) {
                                break;
                            }
                        }
                    }
                }
                Integer num2 = (Integer) map.get(Integer.valueOf(num != null ? num.intValue() : -1));
                return Boolean.valueOf((num2 != null ? num2.intValue() : -1) >= i);
        }
    }

    public /* synthetic */ wa1(zg2 zg2Var, Object obj, int i, byte b) {
        this.I = b;
        this.K = zg2Var;
        this.L = obj;
        this.J = i;
    }

    public /* synthetic */ wa1(Http2Connection http2Connection, int i, List list) {
        this.I = (byte) 1;
        this.K = http2Connection;
        this.J = i;
        this.L = list;
    }
}
