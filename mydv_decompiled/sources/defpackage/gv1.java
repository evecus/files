package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gv1 {
    public final hn1 a;
    public final /* synthetic */ byte b;

    public gv1(hn1 hn1Var, byte b) {
        this.b = b;
        this.a = hn1Var;
    }

    public final float a(float f, ca2 ca2Var, ca2 ca2Var2) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat((int) (ca2Var2.G(ca2Var, (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(((int) (ca2Var.o() >> 32)) / 2.0f) << 32)) & 4294967295L));
            default:
                float o = ((int) (ca2Var.o() & 4294967295L)) / 2.0f;
                return Float.intBitsToFloat((int) (ca2Var2.G(ca2Var, (Float.floatToRawIntBits(o) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)) >> 32));
        }
    }
}
