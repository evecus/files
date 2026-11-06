package defpackage;

import coil3.compose.ConstraintsSizeResolver;
import coil3.compose.internal.AbstractContentPainterNode;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b2 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ bn3 J;

    public /* synthetic */ b2(bn3 bn3Var, byte b) {
        this.I = b;
        this.J = bn3Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        wd5 measure_3p2s80s$lambda$0;
        wd5 measure_3p2s80s$lambda$02;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        bn3 bn3Var = this.J;
        switch (b) {
            case 0:
                measure_3p2s80s$lambda$0 = AbstractContentPainterNode.measure_3p2s80s$lambda$0(bn3Var, (an3) obj);
                break;
            case 1:
                measure_3p2s80s$lambda$02 = ConstraintsSizeResolver.measure_3p2s80s$lambda$0(bn3Var, (an3) obj);
                break;
            case 2:
                an3 an3Var = (an3) obj;
                an3Var.getClass();
                an3.g(an3Var, bn3Var, 0, 0);
                break;
            case 3:
                an3.i((an3) obj, bn3Var, 0, 0);
                break;
            case 4:
                an3 an3Var2 = (an3) obj;
                if (an3Var2.b() != da2.I && an3Var2.d() != 0) {
                    an3Var2.f(bn3Var);
                    bn3Var.d0(r22.c((an3Var2.d() - bn3Var.I) << 32, bn3Var.M), 0.0f, null);
                    break;
                } else {
                    an3Var2.f(bn3Var);
                    bn3Var.d0(r22.c(0L, bn3Var.M), 0.0f, null);
                    break;
                }
                break;
            case 5:
                an3 an3Var3 = (an3) obj;
                an3Var3.getClass();
                an3.g(an3Var3, bn3Var, 0, 0);
                break;
            case 6:
                an3.o((an3) obj, this.J, 0, 0, null, 12);
                break;
            case 7:
                an3 an3Var4 = (an3) obj;
                an3Var4.getClass();
                an3.g(an3Var4, bn3Var, 0, 0);
                break;
            case 8:
                an3 an3Var5 = (an3) obj;
                an3Var5.getClass();
                an3.g(an3Var5, bn3Var, 0, 0);
                break;
            case 9:
                an3.g((an3) obj, bn3Var, 0, 0);
                break;
            case 10:
                an3.g((an3) obj, bn3Var, 0, 0);
                break;
            case 11:
                an3.g((an3) obj, bn3Var, 0, 0);
                break;
            case 12:
                an3.i((an3) obj, bn3Var, 0, 0);
                break;
            default:
                an3.i((an3) obj, bn3Var, 0, 0);
                break;
        }
        return wd5Var;
    }
}
