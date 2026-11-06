package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class n31 {
    public static final m31 a;
    public static final m31 b;

    static {
        int i = 3;
        fj0 fj0Var = null;
        a = new m31(i, fj0Var, (byte) 0);
        b = new m31(i, fj0Var, (byte) 1);
    }

    public static final boolean a(pg3 pg3Var, float f) {
        return pg3Var == pg3.J ? f <= 30.0f : f > 30.0f && f <= 90.0f;
    }

    public static final long b(long j) {
        return eg5.e(Float.isNaN(ji5.d(j)) ? 0.0f : ji5.d(j), Float.isNaN(ji5.e(j)) ? 0.0f : ji5.e(j));
    }

    public static final void c(g31 g31Var, a31 a31Var) {
        c21.K(g31Var, new v1((Object) a31Var, (byte) 19));
    }
}
