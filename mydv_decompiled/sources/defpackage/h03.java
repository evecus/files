package defpackage;

import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.MixInfo;
import com.github.mytv.dv.model.MixPlaylistPagination;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h03 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ hu2 J;
    public final /* synthetic */ t43 K;

    public /* synthetic */ h03(hu2 hu2Var, t43 t43Var, byte b) {
        this.I = b;
        this.J = hu2Var;
        this.K = t43Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.K;
        switch (b) {
            case 0:
                Aweme aweme = (Aweme) obj;
                aweme.getClass();
                List list = (List) t43Var.getValue();
                hu2 hu2Var = this.J;
                gx3 gx3Var = hu2Var.p;
                fw4 fw4Var = gx3Var.J0;
                MixInfo mixInfo = (MixInfo) gx3Var.H0.getValue();
                MixPlaylistPagination mixPlaylistPagination = null;
                if (mixInfo != null && mixInfo.getMixId().length() != 0 && !((List) fw4Var.getValue()).isEmpty()) {
                    String mixId = mixInfo.getMixId();
                    Map singletonMap = Collections.singletonMap(0, fw4Var.getValue());
                    singletonMap.getClass();
                    mixPlaylistPagination = new MixPlaylistPagination(mixId, singletonMap, (int) gx3Var.P0, gx3Var.Q0);
                }
                hu2.B(hu2Var, list, aweme, null, mixPlaylistPagination, 4);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                this.J.E("", "", "", str);
                t43Var.setValue(Boolean.FALSE);
                break;
        }
        return wd5Var;
    }
}
