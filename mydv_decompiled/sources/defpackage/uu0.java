package defpackage;

import androidx.media3.common.util.Log;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class uu0 implements tm1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ int J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ uu0(wu0 wu0Var, w22 w22Var, a43 a43Var, int i) {
        this.K = wu0Var;
        this.L = w22Var;
        this.M = a43Var;
        this.J = i;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.M;
        int i = this.J;
        Object obj3 = this.L;
        Object obj4 = this.K;
        switch (b) {
            case 0:
                w22 w22Var = (w22) obj3;
                a43 a43Var = (a43) obj2;
                if (obj == ((wu0) obj4)) {
                    zy.i("A derived state calculation cannot read itself");
                    return null;
                }
                if (!(obj instanceof kw4)) {
                    return wd5Var;
                }
                int i2 = w22Var.a - i;
                int d = a43Var.d(obj);
                a43Var.g(obj, Math.min(i2, d >= 0 ? a43Var.c[d] : Log.LOG_LEVEL_OFF));
                return wd5Var;
            default:
                bn3[] bn3VarArr = (bn3[]) obj4;
                u74 u74Var = (u74) obj3;
                int[] iArr = (int[]) obj2;
                an3 an3Var = (an3) obj;
                int length = bn3VarArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    bn3 bn3Var = bn3VarArr[i3];
                    int i5 = i4 + 1;
                    bn3Var.getClass();
                    Object z = bn3Var.z();
                    q74 q74Var = z instanceof q74 ? (q74) z : null;
                    wl0 wl0Var = q74Var != null ? q74Var.c : null;
                    an3.g(an3Var, bn3Var, iArr[i4], wl0Var != null ? wl0Var.a(i, bn3Var.J, da2.I) : u74Var.b.a(bn3Var.J, i));
                    i3++;
                    i4 = i5;
                }
                return wd5Var;
        }
    }

    public /* synthetic */ uu0(bn3[] bn3VarArr, u74 u74Var, int i, int[] iArr) {
        this.K = bn3VarArr;
        this.L = u74Var;
        this.J = i;
        this.M = iArr;
    }
}
