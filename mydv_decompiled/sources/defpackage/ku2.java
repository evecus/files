package defpackage;

import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ku2 {
    public static final ku2 L;
    public static final ku2 M;
    public static final ku2 N;
    public static final ku2 O;
    public static final ku2 P;
    public static final /* synthetic */ ku2[] Q;
    public static final /* synthetic */ za1 R;
    public final String I;
    public final hx1 J;
    public final hx1 K;

    static {
        ku2 ku2Var = new ku2("HOME", 0, "首页", sv2.z(), sp0.Q());
        L = ku2Var;
        ku2 ku2Var2 = new ku2("FEATURED", 1, "精选", sp0.T(), mu0.B());
        M = ku2Var2;
        hx1 D = ut0.D();
        hx1 hx1Var = rt0.a;
        if (hx1Var == null) {
            gx1 gx1Var = new gx1("Outlined.LiveTv", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = th5.a;
            rt4 rt4Var = new rt4(x70.b);
            ep epVar = new ep((byte) 13);
            epVar.z(9.0f, 10.0f);
            epVar.M(8.0f);
            epVar.y(7.0f, -4.0f);
            epVar.p();
            epVar.z(21.0f, 6.0f);
            epVar.v(-7.58f);
            epVar.y(3.29f, -3.29f);
            epVar.x(16.0f, 2.0f);
            epVar.y(-4.0f, 4.0f);
            epVar.v(-0.03f);
            epVar.y(-4.0f, -4.0f);
            epVar.y(-0.69f, 0.71f);
            epVar.x(10.56f, 6.0f);
            epVar.x(3.0f, 6.0f);
            epVar.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
            epVar.M(12.0f);
            epVar.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            epVar.v(18.0f);
            epVar.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            epVar.x(23.0f, 8.0f);
            epVar.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            epVar.p();
            epVar.z(21.0f, 20.0f);
            epVar.x(3.0f, 20.0f);
            epVar.x(3.0f, 8.0f);
            epVar.v(18.0f);
            epVar.M(12.0f);
            epVar.p();
            gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
            hx1Var = gx1Var.b();
            rt0.a = hx1Var;
        }
        ku2 ku2Var3 = new ku2("LIVE", 2, "直播", D, hx1Var);
        N = ku2Var3;
        ku2 ku2Var4 = new ku2("SEARCH", 3, "搜索", ad4.s(), mu0.D());
        O = ku2Var4;
        hx1 C = rt0.C();
        hx1 hx1Var2 = sv2.b;
        if (hx1Var2 == null) {
            gx1 gx1Var2 = new gx1("Outlined.Person", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = th5.a;
            rt4 rt4Var2 = new rt4(x70.b);
            ep epVar2 = new ep((byte) 13);
            ArrayList arrayList = (ArrayList) epVar2.J;
            epVar2.z(12.0f, 6.0f);
            epVar2.r(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
            epVar2.D(-0.9f, 2.0f, -2.0f, 2.0f);
            epVar2.D(-2.0f, -0.9f, -2.0f, -2.0f);
            epVar2.D(0.9f, -2.0f, 2.0f, -2.0f);
            arrayList.add(new dl3(0.0f, 10.0f));
            epVar2.r(2.7f, 0.0f, 5.8f, 1.29f, 6.0f, 2.0f);
            epVar2.x(6.0f, 18.0f);
            epVar2.r(0.23f, -0.72f, 3.31f, -2.0f, 6.0f, -2.0f);
            arrayList.add(new dl3(0.0f, -12.0f));
            epVar2.q(9.79f, 4.0f, 8.0f, 5.79f, 8.0f, 8.0f);
            epVar2.D(1.79f, 4.0f, 4.0f, 4.0f);
            epVar2.D(4.0f, -1.79f, 4.0f, -4.0f);
            epVar2.D(-1.79f, -4.0f, -4.0f, -4.0f);
            epVar2.p();
            epVar2.z(12.0f, 14.0f);
            epVar2.r(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
            epVar2.M(2.0f);
            epVar2.v(16.0f);
            epVar2.M(-2.0f);
            epVar2.r(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
            epVar2.p();
            gx1.a(gx1Var2, arrayList, rt4Var2);
            hx1Var2 = gx1Var2.b();
            sv2.b = hx1Var2;
        }
        ku2 ku2Var5 = new ku2("ME", 4, "我", C, hx1Var2);
        P = ku2Var5;
        ku2[] ku2VarArr = {ku2Var, ku2Var2, ku2Var3, ku2Var4, ku2Var5};
        Q = ku2VarArr;
        R = new za1(ku2VarArr);
    }

    public ku2(String str, int i, String str2, hx1 hx1Var, hx1 hx1Var2) {
        this.I = str2;
        this.J = hx1Var;
        this.K = hx1Var2;
    }

    public static ku2 valueOf(String str) {
        return (ku2) Enum.valueOf(ku2.class, str);
    }

    public static ku2[] values() {
        return (ku2[]) Q.clone();
    }
}
