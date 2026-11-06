package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class u35 {
    public static final String a = qx4.w(10, "H");

    public static long a(m65 m65Var, iu0 iu0Var, kj1 kj1Var) {
        td b = b(m65Var, iu0Var, kj1Var, 1, false);
        return (qi4.b(b.a.b()) << 32) | (qi4.b(b.f) & 4294967295L);
    }

    public static final td b(m65 m65Var, iu0 iu0Var, kj1 kj1Var, int i, boolean z) {
        String Z0 = o70.Z0(ut0.c0(0, i), "\n", null, null, 0, new ol4((byte) 22), 30);
        o91 o91Var = o91.I;
        return new td(new xd(Z0, m65Var, o91Var, o91Var, kj1Var, iu0Var, z), i, 1, eh0.b(0, 0, 0, 0, 15));
    }
}
