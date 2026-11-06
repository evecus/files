package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class d64 {
    public static final i51 a = new i51(new gw2((byte) 20), (byte) 0);
    public static final mf0 b = new mf0(new u73((byte) 18));
    public static final q64 c;
    public static final q64 d;

    static {
        long j = x70.g;
        c = new q64(true, Float.NaN, j, true);
        d = new q64(false, Float.NaN, j, true);
    }

    public static q64 a(float f, int i) {
        boolean z = (i & 1) != 0;
        float f2 = (i & 2) != 0 ? Float.NaN : f;
        long j = x70.g;
        return (r11.c(f2, Float.NaN) && zc5.a(j, j)) ? z ? c : d : new q64(z, f2, j, true);
    }
}
