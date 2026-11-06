package defpackage;

import com.github.mytv.dv.model.Aweme;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cv3 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ hu2 J;
    public final /* synthetic */ List K;

    public /* synthetic */ cv3(List list, hu2 hu2Var) {
        this.I = (byte) 2;
        this.K = list;
        this.J = hu2Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                Aweme aweme = (Aweme) obj;
                aweme.getClass();
                hu2.B(this.J, this.K, aweme, null, null, 28);
                break;
            case 1:
                Aweme aweme2 = (Aweme) obj;
                aweme2.getClass();
                hu2.B(this.J, this.K, aweme2, null, null, 28);
                break;
            default:
                Aweme aweme3 = (Aweme) obj;
                aweme3.getClass();
                List list = this.K;
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                    } else if (!j42.c(((Aweme) it.next()).getAwemeId(), aweme3.getAwemeId())) {
                        i++;
                    }
                }
                this.J.A(aweme3, list, i >= 0 ? i : 0);
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ cv3(hu2 hu2Var, List list, byte b) {
        this.I = b;
        this.J = hu2Var;
        this.K = list;
    }
}
