package defpackage;

import com.github.mytv.dv.model.Aweme;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class z30 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ z30(Object obj, Object obj2, Object obj3, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj = this.L;
        Object obj2 = this.J;
        Object obj3 = this.K;
        switch (b) {
            case 0:
                b50 b50Var = (b50) obj3;
                hu2.B((hu2) obj2, b50Var.c, (Aweme) obj, b50Var.b, null, 24);
                break;
            default:
                i51 i51Var = qm4.a;
                ((t43) obj3).setValue((bl4) obj2);
                ((t43) obj).setValue(Boolean.FALSE);
                break;
        }
        return wd5Var;
    }
}
