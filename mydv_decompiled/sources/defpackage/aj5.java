package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class aj5 implements dn4 {
    public static final aj5 b = new aj5(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ aj5(byte b2) {
        this.a = b2;
    }

    @Override // defpackage.dn4
    public final yg3 a(long j, da2 da2Var, iu0 iu0Var) {
        switch (this.a) {
            case 0:
                float X = iu0Var.X(30.0f);
                return new wg3(new m14(-X, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + X, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new wg3(sv2.g(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
