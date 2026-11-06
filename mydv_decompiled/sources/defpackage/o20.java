package defpackage;

import com.github.mytv.dv.model.Aweme;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class o20 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ hu2 J;
    public final /* synthetic */ b50 K;

    public /* synthetic */ o20(b50 b50Var, hu2 hu2Var) {
        this.I = (byte) 0;
        this.K = b50Var;
        this.J = hu2Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        hu2 hu2Var = this.J;
        wd5 wd5Var = wd5.a;
        b50 b50Var = this.K;
        switch (b) {
            case 0:
                kg2 kg2Var = (kg2) obj;
                kg2Var.getClass();
                List list = b50Var.c;
                kg2Var.a0(list.size(), new ee(new t5((byte) 19), list, (byte) 4), new v30(list, (byte) 2), null, new tc0(-334987442, new w30(list, (Object) hu2Var, (Object) b50Var, (byte) 1), true));
                break;
            case 1:
                Aweme aweme = (Aweme) obj;
                aweme.getClass();
                hu2.B(this.J, b50Var.c, aweme, b50Var.b, null, 24);
                break;
            default:
                hu2Var.m.s(((Integer) obj).intValue(), b50Var.b);
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ o20(hu2 hu2Var, b50 b50Var, byte b) {
        this.I = b;
        this.J = hu2Var;
        this.K = b50Var;
    }
}
