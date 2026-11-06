package defpackage;

import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bl4 {
    public static final bl4 K;
    public static final bl4 L;
    public static final bl4 M;
    public static final /* synthetic */ bl4[] N;
    public static final /* synthetic */ za1 O;
    public final String I;
    public final hx1 J;

    static {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        bl4 bl4Var = new bl4("VIDEO", 0, "视频", sp0.T());
        K = bl4Var;
        bl4 bl4Var2 = new bl4("LIVE", 1, "直播", ut0.D());
        bl4 bl4Var3 = new bl4("DANMAKU", 2, "弹幕", kb4.B());
        bl4 bl4Var4 = new bl4("THEME", 3, "主题与取色", dq2.R());
        hx1 hx1Var = k21.g;
        if (hx1Var != null) {
            c = 0;
            c2 = 1;
            c3 = 2;
            c4 = 3;
        } else {
            gx1 gx1Var = new gx1("Filled.Key", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = th5.a;
            c = 0;
            c2 = 1;
            rt4 rt4Var = new rt4(x70.b);
            ep epVar = new ep((byte) 13);
            epVar.z(21.0f, 10.0f);
            c3 = 2;
            epVar.v(-8.35f);
            epVar.q(11.83f, 7.67f, 9.61f, 6.0f, 7.0f, 6.0f);
            epVar.r(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
            epVar.D(2.69f, 6.0f, 6.0f, 6.0f);
            epVar.r(2.61f, 0.0f, 4.83f, -1.67f, 5.65f, -4.0f);
            epVar.u(13.0f);
            epVar.y(2.0f, 2.0f);
            epVar.y(2.0f, -2.0f);
            epVar.y(2.0f, 2.0f);
            c4 = 3;
            epVar.y(4.0f, -4.04f);
            epVar.x(21.0f, 10.0f);
            epVar.p();
            epVar.z(7.0f, 15.0f);
            epVar.r(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
            epVar.r(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f);
            epVar.D(3.0f, 1.35f, 3.0f, 3.0f);
            epVar.q(10.0f, 13.65f, 8.65f, 15.0f, 7.0f, 15.0f);
            epVar.p();
            gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
            hx1Var = gx1Var.b();
            k21.g = hx1Var;
        }
        bl4 bl4Var5 = new bl4("AUTH", 4, "登录与互动", hx1Var);
        L = bl4Var5;
        hx1 hx1Var2 = k21.f;
        if (hx1Var2 != null) {
            c5 = 4;
        } else {
            gx1 gx1Var2 = new gx1("Filled.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = th5.a;
            rt4 rt4Var2 = new rt4(x70.b);
            ep r = r7.r(12.0f, 2.0f);
            r.q(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
            c5 = 4;
            r.D(4.48f, 10.0f, 10.0f, 10.0f);
            r.D(10.0f, -4.48f, 10.0f, -10.0f);
            r.C(17.52f, 2.0f, 12.0f, 2.0f);
            r.p();
            r.z(13.0f, 17.0f);
            r.v(-2.0f);
            r.M(-6.0f);
            r.v(2.0f);
            r.M(6.0f);
            r.p();
            r.z(13.0f, 9.0f);
            r.v(-2.0f);
            r.x(11.0f, 7.0f);
            r.v(2.0f);
            r.M(2.0f);
            r.p();
            gx1.a(gx1Var2, (ArrayList) r.J, rt4Var2);
            hx1Var2 = gx1Var2.b();
            k21.f = hx1Var2;
        }
        bl4 bl4Var6 = new bl4("ABOUT", 5, "关于", hx1Var2);
        M = bl4Var6;
        bl4[] bl4VarArr = new bl4[6];
        bl4VarArr[c] = bl4Var;
        bl4VarArr[c2] = bl4Var2;
        bl4VarArr[c3] = bl4Var3;
        bl4VarArr[c4] = bl4Var4;
        bl4VarArr[c5] = bl4Var5;
        bl4VarArr[5] = bl4Var6;
        N = bl4VarArr;
        O = new za1(bl4VarArr);
    }

    public bl4(String str, int i, String str2, hx1 hx1Var) {
        this.I = str2;
        this.J = hx1Var;
    }

    public static bl4 valueOf(String str) {
        return (bl4) Enum.valueOf(bl4.class, str);
    }

    public static bl4[] values() {
        return (bl4[]) N.clone();
    }
}
