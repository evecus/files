package defpackage;

import com.github.mytv.dv.model.HotWord;
import com.github.mytv.dv.model.LiveRoom;
import com.github.mytv.dv.model.MixInfo;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yu1 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ yu1(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj = this.J;
        Object obj2 = this.K;
        switch (b) {
            case 0:
                ((tm1) obj).invoke(((b83) obj2).b);
                break;
            case 1:
                ((tm1) obj).invoke(((x03) obj2).a);
                break;
            case 2:
                ((tm1) obj).invoke((MixInfo) obj2);
                break;
            case 3:
                k10 k10Var = (k10) obj2;
                p24 p24Var = (p24) obj;
                int i = p24Var.I - 1;
                p24Var.I = i;
                if (i == 0 && (k10Var.s() instanceof za3)) {
                    k10Var.resumeWith(wd5Var);
                    break;
                }
                break;
            case 4:
                ((tm1) obj).invoke((LiveRoom) obj2);
                break;
            case 5:
                ((tm1) obj).invoke(((HotWord) obj2).getWord());
                break;
            default:
                i51 i51Var = qm4.a;
                ((t43) obj2).setValue((bl4) obj);
                break;
        }
        return wd5Var;
    }
}
