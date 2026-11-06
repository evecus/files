package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class b35 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ b35(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj4 = this.J;
        switch (b) {
            case 0:
                long j = ((x70) obj).a;
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Number) obj3).intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 17) != 16)) {
                    go1Var.W();
                    break;
                } else {
                    rn3.b.c((Drawable) obj4, go1Var, 48);
                    break;
                }
            case 1:
                long j2 = ((x70) obj).a;
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Number) obj3).intValue();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    go1Var2.W();
                    break;
                } else {
                    rn3.b.c((Drawable) obj4, go1Var2, 48);
                    break;
                }
            default:
                long j3 = ((x70) obj).a;
                fe0 fe0Var3 = (fe0) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((go1) fe0Var3).f(j3) ? 4 : 2;
                }
                go1 go1Var3 = (go1) fe0Var3;
                if (!go1Var3.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    go1Var3.W();
                    break;
                } else {
                    at0.b(((c35) obj4).c, j3, go1Var3, (intValue3 << 3) & 112);
                    break;
                }
        }
        return wd5Var;
    }
}
