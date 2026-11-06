package defpackage;

import com.github.mytv.dv.model.Aweme;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class l30 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ List J;

    public /* synthetic */ l30(List list, byte b) {
        this.I = b;
        this.J = list;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        List list = this.J;
        int intValue = ((Integer) obj).intValue();
        switch (b) {
            case 2:
                if (((db0) list.get(intValue)).c) {
                }
                break;
        }
        return ((Aweme) list.get(intValue)).getAwemeId();
    }
}
