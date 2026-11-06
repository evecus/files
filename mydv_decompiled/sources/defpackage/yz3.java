package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class yz3 {
    public static final xz3 a;
    public static final xz3 b;
    public static final xz3 c;
    public static final xz3 d;
    public static final xz3 e;
    public static final xz3 f;
    public static final xz3 g;
    public static final xz3 h;
    public static final xz3 i;
    public static final xz3 j;

    static {
        ht5 ht5Var = sw1.b;
        n84 n84Var = n84.P;
        m16 m16Var = zz3.a;
        m16 m16Var2 = zz3.b;
        m16 m16Var3 = zz3.c;
        a = new xz3("sRGB", ht5Var, n84Var, m16Var, m16Var2, m16Var3, new zw1((byte) 24));
        k04 k04Var = k04.t0;
        b = zz3.a("Linear sRGB", ht5Var, k04Var, m16Var, m16Var2, m16Var3);
        ht5 ht5Var2 = zz3.d;
        c = zz3.a("ACES2065-1", ht5Var2, k04Var, zz3.e, zz3.f, zz3.g);
        t tVar = t.I;
        m16 m16Var4 = zz3.h;
        m16 m16Var5 = zz3.i;
        m16 m16Var6 = zz3.j;
        zz3.a("ACEScc", ht5Var2, tVar, m16Var4, m16Var5, m16Var6);
        zz3.a("ACEScct", ht5Var2, u.I, m16Var4, m16Var5, m16Var6);
        d = zz3.a("ACEScg", ht5Var2, k04Var, m16Var4, m16Var5, m16Var6);
        uz3 uz3Var = new uz3(2.19921875d);
        Double valueOf = Double.valueOf(0.64d);
        Double valueOf2 = Double.valueOf(0.33d);
        m16 m16Var7 = new m16(valueOf, valueOf2);
        m16 m16Var8 = new m16(Double.valueOf(0.21d), Double.valueOf(0.71d));
        Double valueOf3 = Double.valueOf(0.15d);
        Double valueOf4 = Double.valueOf(0.06d);
        e = zz3.a("Adobe RGB", ht5Var, uz3Var, m16Var7, m16Var8, new m16(valueOf3, valueOf4));
        f = new xz3("BT.2020", ht5Var, et.I, new m16(Double.valueOf(0.708d), Double.valueOf(0.292d)), new m16(Double.valueOf(0.17d), Double.valueOf(0.797d)), new m16(Double.valueOf(0.131d), Double.valueOf(0.046d)), new zw1((byte) 25));
        g = zz3.a("BT.709", ht5Var, ft.I, new m16(valueOf, valueOf2), new m16(Double.valueOf(0.3d), Double.valueOf(0.6d)), new m16(valueOf3, valueOf4));
        ht5 ht5Var3 = new ht5("DCI P3", new m16(Double.valueOf(0.314d), Double.valueOf(0.351d)));
        uz3 uz3Var2 = new uz3(2.6d);
        Double valueOf5 = Double.valueOf(0.68d);
        Double valueOf6 = Double.valueOf(0.32d);
        m16 m16Var9 = new m16(valueOf5, valueOf6);
        Double valueOf7 = Double.valueOf(0.265d);
        Double valueOf8 = Double.valueOf(0.69d);
        h = zz3.a("DCI P3", ht5Var3, uz3Var2, m16Var9, new m16(valueOf7, valueOf8), new m16(valueOf3, valueOf4));
        i = zz3.a("Display P3", ht5Var, n84Var, new m16(valueOf5, valueOf6), new m16(valueOf7, valueOf8), new m16(valueOf3, valueOf4));
        j = zz3.a("ROMM RGB", sw1.a, k04.u0, new m16(Double.valueOf(0.7347d), Double.valueOf(0.2653d)), new m16(Double.valueOf(0.1596d), Double.valueOf(0.8404d)), new m16(Double.valueOf(0.0366d), Double.valueOf(1.0E-4d)));
    }
}
