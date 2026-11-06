package defpackage;

import com.github.mytv.dv.widget.WidgetPalette;
import com.github.mytv.dv.widget.WidgetUiKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uk5 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ float J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ uk5(float f, Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = f;
        this.K = obj;
        this.L = obj2;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd5 WidgetProgress$lambda$0;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj4 = this.L;
        Object obj5 = this.K;
        switch (b) {
            case 0:
                tm1 tm1Var = (tm1) obj5;
                ki1 ki1Var = (ki1) obj4;
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var = (go1) fe0Var;
                if (go1Var.T(intValue & 1, (intValue & 17) != 16)) {
                    float f = this.J * 100.0f;
                    String t = pt1.t(ut0.r((int) f, 1, 100), "%");
                    z60 z60Var = new z60(1.0f, 100.0f);
                    boolean g = go1Var.g(tm1Var);
                    Object Q = go1Var.Q();
                    if (g || Q == de0.a) {
                        Q = new l00(tm1Var, (byte) 19);
                        go1Var.o0(Q);
                    }
                    lq2.h("不透明度", t, f, z60Var, 98, (tm1) Q, 1.0f, 5.0f, j42.x(i13.a, ki1Var), go1Var, 14180358, 0);
                } else {
                    go1Var.W();
                }
                return wd5Var;
            case 1:
                rm1 rm1Var = (rm1) obj5;
                String str = (String) obj4;
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var2 = (go1) fe0Var2;
                if (go1Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    lq2.d(j42.B(), "评论", rm1Var, null, false, false, null, str, null, this.J, 0L, null, 0, 0, go1Var2, 48, 0, 15736);
                } else {
                    go1Var2.W();
                }
                return wd5Var;
            case 2:
                so3 so3Var = (so3) obj5;
                rm1 rm1Var2 = (rm1) obj4;
                fe0 fe0Var3 = (fe0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var3 = (go1) fe0Var3;
                if (go1Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    lq2.d(lq2.L(), "播放完后", rm1Var2, null, false, false, null, so3Var.I, null, this.J, 0L, null, 0, 0, go1Var3, 48, 0, 15736);
                } else {
                    go1Var3.W();
                }
                return wd5Var;
            default:
                WidgetProgress$lambda$0 = WidgetUiKt.WidgetProgress$lambda$0(this.J, (WidgetPalette) obj5, (String) obj4, (v74) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return WidgetProgress$lambda$0;
        }
    }

    public /* synthetic */ uk5(Object obj, Object obj2, float f, byte b) {
        this.I = b;
        this.K = obj;
        this.L = obj2;
        this.J = f;
    }
}
