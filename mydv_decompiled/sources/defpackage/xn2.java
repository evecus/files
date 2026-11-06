package defpackage;

import com.github.mytv.dv.model.LiveDanmakuSettings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xn2 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ op2 J;
    public final /* synthetic */ cw4 K;

    public /* synthetic */ xn2(op2 op2Var, cw4 cw4Var, byte b) {
        this.I = b;
        this.J = op2Var;
        this.K = cw4Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        jp jpVar = de0.a;
        cw4 cw4Var = this.K;
        op2 op2Var = this.J;
        switch (b) {
            case 0:
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 17) != 16)) {
                    go1Var.W();
                    break;
                } else {
                    boolean enabled = ((LiveDanmakuSettings) cw4Var.getValue()).getEnabled();
                    boolean i = go1Var.i(op2Var);
                    Object Q = go1Var.Q();
                    if (i || Q == jpVar) {
                        Q = new co2(op2Var, (byte) 6);
                        go1Var.o0(Q);
                    }
                    lq2.n("弹幕", enabled, (tm1) Q, null, kb4.B(), null, ((LiveDanmakuSettings) cw4Var.getValue()).getEnabled() ? ((LiveDanmakuSettings) cw4Var.getValue()).getStyle() == an2.L ? "列表样式" : "滚动样式" : null, false, 0L, 0.0f, null, 0, 0, go1Var, 6, 0, 8104);
                    break;
                }
            case 1:
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    go1Var2.W();
                    break;
                } else {
                    boolean filterPackageComment = ((LiveDanmakuSettings) cw4Var.getValue()).getFilterPackageComment();
                    boolean i2 = go1Var2.i(op2Var);
                    Object Q2 = go1Var2.Q();
                    if (i2 || Q2 == jpVar) {
                        Q2 = new co2(op2Var, (byte) 4);
                        go1Var2.o0(Q2);
                    }
                    tm1 tm1Var = (tm1) Q2;
                    hx1 hx1Var = e21.c;
                    if (hx1Var == null) {
                        gx1 gx1Var = new gx1("Filled.FilterList", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = th5.a;
                        rt4 rt4Var = new rt4(x70.b);
                        ep epVar = new ep((byte) 13);
                        epVar.z(10.0f, 18.0f);
                        epVar.v(4.0f);
                        epVar.M(-2.0f);
                        epVar.v(-4.0f);
                        epVar.M(2.0f);
                        epVar.p();
                        epVar.z(3.0f, 6.0f);
                        epVar.M(2.0f);
                        epVar.v(18.0f);
                        epVar.x(21.0f, 6.0f);
                        epVar.x(3.0f, 6.0f);
                        epVar.p();
                        epVar.z(6.0f, 13.0f);
                        epVar.v(12.0f);
                        epVar.M(-2.0f);
                        epVar.x(6.0f, 11.0f);
                        epVar.M(2.0f);
                        epVar.p();
                        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
                        hx1Var = gx1Var.b();
                        e21.c = hx1Var;
                    }
                    lq2.n("过滤福袋评论", filterPackageComment, tm1Var, null, hx1Var, null, null, false, 0L, 0.0f, null, 0, 0, go1Var2, 6, 0, 8168);
                    break;
                }
            case 2:
                fe0 fe0Var3 = (fe0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var3 = (go1) fe0Var3;
                if (!go1Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    go1Var3.W();
                    break;
                } else {
                    String t = pt1.t(ut0.r(((LiveDanmakuSettings) cw4Var.getValue()).getDisplayAreaPercent(), 1, 100), "%");
                    float displayAreaPercent = ((LiveDanmakuSettings) cw4Var.getValue()).getDisplayAreaPercent();
                    z60 z60Var = new z60(1.0f, 100.0f);
                    boolean i4 = go1Var3.i(op2Var);
                    Object Q3 = go1Var3.Q();
                    if (i4 || Q3 == jpVar) {
                        Q3 = new co2(op2Var, (byte) 8);
                        go1Var3.o0(Q3);
                    }
                    lq2.h("显示区域", t, displayAreaPercent, z60Var, 98, (tm1) Q3, 1.0f, 5.0f, null, go1Var3, 14180358, 256);
                    break;
                }
            case 3:
                fe0 fe0Var4 = (fe0) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var4 = (go1) fe0Var4;
                if (!go1Var4.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    go1Var4.W();
                    break;
                } else {
                    String format = String.format(Locale.getDefault(), "%.1fx", Arrays.copyOf(new Object[]{Float.valueOf(((LiveDanmakuSettings) cw4Var.getValue()).getVerticalSpacingScale())}, 1));
                    float verticalSpacingScale = ((LiveDanmakuSettings) cw4Var.getValue()).getVerticalSpacingScale();
                    z60 z60Var2 = new z60(0.5f, 2.0f);
                    boolean i5 = go1Var4.i(op2Var);
                    Object Q4 = go1Var4.Q();
                    if (i5 || Q4 == jpVar) {
                        Q4 = new co2(op2Var, (byte) 3);
                        go1Var4.o0(Q4);
                    }
                    lq2.h("垂直间距", format, verticalSpacingScale, z60Var2, 14, (tm1) Q4, 0.1f, 0.2f, null, go1Var4, 14180358, 256);
                    break;
                }
            default:
                fe0 fe0Var5 = (fe0) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var5 = (go1) fe0Var5;
                if (!go1Var5.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    go1Var5.W();
                    break;
                } else {
                    String format2 = String.format(Locale.getDefault(), "%.1fx", Arrays.copyOf(new Object[]{Float.valueOf(((LiveDanmakuSettings) cw4Var.getValue()).getHorizontalSpacingScale())}, 1));
                    float horizontalSpacingScale = ((LiveDanmakuSettings) cw4Var.getValue()).getHorizontalSpacingScale();
                    z60 z60Var3 = new z60(0.5f, 2.0f);
                    boolean i6 = go1Var5.i(op2Var);
                    Object Q5 = go1Var5.Q();
                    if (i6 || Q5 == jpVar) {
                        Q5 = new co2(op2Var, (byte) 7);
                        go1Var5.o0(Q5);
                    }
                    lq2.h("水平间距", format2, horizontalSpacingScale, z60Var3, 14, (tm1) Q5, 0.1f, 0.2f, null, go1Var5, 14180358, 256);
                    break;
                }
        }
        return wd5Var;
    }
}
