package defpackage;

import com.github.mytv.dv.model.Author;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kl4 implements in1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ cw4 J;
    public final /* synthetic */ cw4 K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ cw4 N;
    public final /* synthetic */ cw4 O;
    public final /* synthetic */ cw4 P;

    public /* synthetic */ kl4(hu2 hu2Var, cw4 cw4Var, cw4 cw4Var2, cw4 cw4Var3, cw4 cw4Var4, cw4 cw4Var5, cw4 cw4Var6) {
        this.L = hu2Var;
        this.J = cw4Var;
        this.K = cw4Var2;
        this.M = cw4Var3;
        this.N = cw4Var4;
        this.O = cw4Var5;
        this.P = cw4Var6;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd5 wd5Var;
        String str;
        float f;
        byte b = this.I;
        wd5 wd5Var2 = wd5.a;
        jp jpVar = de0.a;
        cw4 cw4Var = this.K;
        cw4 cw4Var2 = this.J;
        cw4 cw4Var3 = this.P;
        cw4 cw4Var4 = this.O;
        cw4 cw4Var5 = this.N;
        Object obj4 = this.M;
        Object obj5 = this.L;
        switch (b) {
            case 0:
                hu2 hu2Var = (hu2) obj5;
                cw4 cw4Var6 = (cw4) obj4;
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ui) obj).getClass();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 17) != 16)) {
                    go1Var.W();
                    break;
                } else {
                    l13 G0 = i42.G0(i13.a, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    ba0 a = z90.a(i42.d, q8.V, go1Var, 0);
                    long j = go1Var.T;
                    int i = (int) (j ^ (j >>> 32));
                    am3 m = go1Var.m();
                    l13 x0 = i42.x0(go1Var, G0);
                    xd0.c.getClass();
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(wa2.A0);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, q8.c0, a);
                    qi4.k(go1Var, q8.b0, m);
                    qi4.k(go1Var, q8.d0, Integer.valueOf(i));
                    qi4.j(go1Var);
                    qi4.k(go1Var, q8.a0, x0);
                    hx1 hx1Var = jl2.b;
                    if (hx1Var != null) {
                        wd5Var = wd5Var2;
                    } else {
                        gx1 gx1Var = new gx1("Filled.Opacity", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = th5.a;
                        rt4 rt4Var = new rt4(x70.b);
                        wd5Var = wd5Var2;
                        ep p = hf1.p(17.66f, 8.0f, 12.0f, 2.35f);
                        p.x(6.34f, 8.0f);
                        p.q(4.78f, 9.56f, 4.0f, 11.64f, 4.0f, 13.64f);
                        p.D(0.78f, 4.11f, 2.34f, 5.67f);
                        p.D(3.61f, 2.35f, 5.66f, 2.35f);
                        p.D(4.1f, -0.79f, 5.66f, -2.35f);
                        p.C(20.0f, 15.64f, 20.0f, 13.64f);
                        p.C(19.22f, 9.56f, 17.66f, 8.0f);
                        p.p();
                        p.z(6.0f, 14.0f);
                        p.r(0.01f, -2.0f, 0.62f, -3.27f, 1.76f, -4.4f);
                        p.x(12.0f, 5.27f);
                        p.y(4.24f, 4.38f);
                        p.q(17.38f, 10.77f, 17.99f, 12.0f, 18.0f, 14.0f);
                        p.u(6.0f);
                        p.p();
                        gx1.a(gx1Var, (ArrayList) p.J, rt4Var);
                        hx1Var = gx1Var.b();
                        jl2.b = hx1Var;
                    }
                    hx1 hx1Var2 = hx1Var;
                    float floatValue = ((Number) cw4Var2.getValue()).floatValue() * 100.0f;
                    z60 z60Var = new z60(1.0f, 100.0f);
                    String z = r7.z("当前 ", ut0.r((int) (((Number) cw4Var2.getValue()).floatValue() * 100.0f), 1, 100), "%");
                    boolean i3 = go1Var.i(hu2Var);
                    Object Q = go1Var.Q();
                    if (i3 || Q == jpVar) {
                        Q = new ll4(hu2Var, (byte) 11);
                        go1Var.o0(Q);
                    }
                    qm4.p("不透明度", hx1Var2, floatValue, z60Var, 98, z, (tm1) Q, null, 1.0f, 5.0f, go1Var, 905994246);
                    hx1 hx1Var3 = a5.g;
                    if (hx1Var3 != null) {
                        str = "当前 ";
                        f = 3.0f;
                    } else {
                        gx1 gx1Var2 = new gx1("Filled.CropFree", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i4 = th5.a;
                        str = "当前 ";
                        rt4 rt4Var2 = new rt4(x70.b);
                        ep epVar = new ep((byte) 13);
                        epVar.z(3.0f, 5.0f);
                        epVar.M(4.0f);
                        epVar.v(2.0f);
                        epVar.x(5.0f, 5.0f);
                        epVar.v(4.0f);
                        epVar.x(9.0f, 3.0f);
                        epVar.x(5.0f, 3.0f);
                        epVar.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        epVar.p();
                        epVar.z(5.0f, 15.0f);
                        epVar.x(3.0f, 15.0f);
                        epVar.M(4.0f);
                        epVar.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        epVar.v(4.0f);
                        epVar.M(-2.0f);
                        epVar.x(5.0f, 19.0f);
                        epVar.M(-4.0f);
                        epVar.p();
                        epVar.z(19.0f, 19.0f);
                        epVar.v(-4.0f);
                        epVar.M(2.0f);
                        epVar.v(4.0f);
                        epVar.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        epVar.M(-4.0f);
                        epVar.v(-2.0f);
                        epVar.M(4.0f);
                        epVar.p();
                        f = 3.0f;
                        epVar.z(19.0f, 3.0f);
                        epVar.v(-4.0f);
                        epVar.M(2.0f);
                        epVar.v(4.0f);
                        epVar.M(4.0f);
                        epVar.v(2.0f);
                        epVar.x(21.0f, 5.0f);
                        epVar.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        epVar.p();
                        gx1.a(gx1Var2, (ArrayList) epVar.J, rt4Var2);
                        hx1Var3 = gx1Var2.b();
                        a5.g = hx1Var3;
                    }
                    float intValue2 = ((Number) cw4Var.getValue()).intValue();
                    z60 z60Var2 = new z60(1.0f, 100.0f);
                    String z2 = r7.z(str, ((Number) cw4Var.getValue()).intValue(), "%");
                    boolean i5 = go1Var.i(hu2Var);
                    Object Q2 = go1Var.Q();
                    if (i5 || Q2 == jpVar) {
                        Q2 = new ll4(hu2Var, (byte) 12);
                        go1Var.o0(Q2);
                    }
                    qm4.p("显示区域", hx1Var3, intValue2, z60Var2, 98, z2, (tm1) Q2, null, 1.0f, 5.0f, go1Var, 905994246);
                    hx1 hx1Var4 = c21.e;
                    if (hx1Var4 == null) {
                        gx1 gx1Var3 = new gx1("Filled.Height", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i6 = th5.a;
                        rt4 rt4Var3 = new rt4(x70.b);
                        ep epVar2 = new ep((byte) 13);
                        epVar2.z(13.0f, 6.99f);
                        epVar2.y(f, 0.0f);
                        epVar2.y(-4.0f, -3.99f);
                        epVar2.y(-4.0f, 3.99f);
                        epVar2.y(f, 0.0f);
                        epVar2.y(0.0f, 10.02f);
                        epVar2.y(-3.0f, 0.0f);
                        epVar2.y(4.0f, 3.99f);
                        epVar2.y(4.0f, -3.99f);
                        epVar2.y(-3.0f, 0.0f);
                        epVar2.p();
                        gx1.a(gx1Var3, (ArrayList) epVar2.J, rt4Var3);
                        hx1Var4 = gx1Var3.b();
                        c21.e = hx1Var4;
                    }
                    hx1 hx1Var5 = hx1Var4;
                    float floatValue2 = ((Number) cw4Var6.getValue()).floatValue();
                    z60 z60Var3 = new z60(0.5f, 2.0f);
                    String format = String.format("当前 %.1fx", Arrays.copyOf(new Object[]{Float.valueOf(((Number) cw4Var6.getValue()).floatValue())}, 1));
                    boolean i7 = go1Var.i(hu2Var);
                    Object Q3 = go1Var.Q();
                    if (i7 || Q3 == jpVar) {
                        Q3 = new ll4(hu2Var, (byte) 13);
                        go1Var.o0(Q3);
                    }
                    qm4.p("垂直间距", hx1Var5, floatValue2, z60Var3, 14, format, (tm1) Q3, null, 0.1f, 0.2f, go1Var, 905994246);
                    hx1 P = hc4.P();
                    float floatValue3 = ((Number) cw4Var5.getValue()).floatValue();
                    z60 z60Var4 = new z60(0.5f, 2.0f);
                    String format2 = String.format("当前 %.1fx", Arrays.copyOf(new Object[]{Float.valueOf(((Number) cw4Var5.getValue()).floatValue())}, 1));
                    boolean i8 = go1Var.i(hu2Var);
                    Object Q4 = go1Var.Q();
                    if (i8 || Q4 == jpVar) {
                        Q4 = new ll4(hu2Var, (byte) 14);
                        go1Var.o0(Q4);
                    }
                    qm4.p("水平间距", P, floatValue3, z60Var4, 14, format2, (tm1) Q4, null, 0.1f, 0.2f, go1Var, 905994246);
                    hx1 K = e41.K();
                    Enum[] enumArr = (Enum[]) so0.M.toArray(new so0[0]);
                    so0 so0Var = (so0) cw4Var4.getValue();
                    boolean i9 = go1Var.i(hu2Var);
                    Object Q5 = go1Var.Q();
                    if (i9 || Q5 == jpVar) {
                        Q5 = new ll4(hu2Var, (byte) 15);
                        go1Var.o0(Q5);
                    }
                    tm1 tm1Var = (tm1) Q5;
                    Object Q6 = go1Var.Q();
                    if (Q6 == jpVar) {
                        Q6 = new ol4((byte) 2);
                        go1Var.o0(Q6);
                    }
                    qm4.j("字体大小", K, enumArr, so0Var, tm1Var, (tm1) Q6, null, false, null, go1Var, 196614, 448);
                    hx1 i10 = ui4.i();
                    Enum[] enumArr2 = (Enum[]) vo0.M.toArray(new vo0[0]);
                    vo0 vo0Var = (vo0) cw4Var3.getValue();
                    boolean i11 = go1Var.i(hu2Var);
                    Object Q7 = go1Var.Q();
                    if (i11 || Q7 == jpVar) {
                        Q7 = new ll4(hu2Var, (byte) 16);
                        go1Var.o0(Q7);
                    }
                    tm1 tm1Var2 = (tm1) Q7;
                    Object Q8 = go1Var.Q();
                    if (Q8 == jpVar) {
                        Q8 = new ol4((byte) 3);
                        go1Var.o0(Q8);
                    }
                    qm4.j("移动速度", i10, enumArr2, vo0Var, tm1Var2, (tm1) Q8, null, false, null, go1Var, 196614, 448);
                    go1Var.q(true);
                    break;
                }
            default:
                Author author = (Author) obj5;
                String str2 = (String) obj4;
                t43 t43Var = (t43) cw4Var5;
                t43 t43Var2 = (t43) cw4Var4;
                t43 t43Var3 = (t43) cw4Var3;
                fe0 fe0Var2 = (fe0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    go1Var2.W();
                    break;
                } else {
                    String str3 = ((Author) t43Var3.getValue()) != null ? "已登录" : !jx4.L((String) cw4Var2.getValue()) ? "Cookie 已配置" : "未登录";
                    String str4 = str3 + " · " + ((List) cw4Var.getValue()).size() + " 个配置";
                    boolean g = go1Var2.g(t43Var) | go1Var2.g(t43Var2);
                    Object Q9 = go1Var2.Q();
                    if (g || Q9 == jpVar) {
                        Q9 = new d30(t43Var, t43Var2, (byte) 5);
                        go1Var2.o0(Q9);
                    }
                    qm4.h(author, str2, str4, (rm1) Q9, i42.G0(i13.a, 0.0f, 0.0f, 0.0f, 8.0f, 7), go1Var2, Author.$stable | 24576);
                    break;
                }
        }
        return wd5Var2;
    }

    public /* synthetic */ kl4(Author author, String str, t43 t43Var, t43 t43Var2, t43 t43Var3, cw4 cw4Var, cw4 cw4Var2) {
        this.L = author;
        this.M = str;
        this.N = t43Var;
        this.O = t43Var2;
        this.P = t43Var3;
        this.J = cw4Var;
        this.K = cw4Var2;
    }
}
