package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class z7 implements jp3 {
    public static final z7 c = new z7(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f}, 0);
    public final /* synthetic */ byte a;
    public final float[] b;

    public /* synthetic */ z7(float[] fArr, byte b) {
        this.a = b;
        this.b = fArr;
    }

    @Override // defpackage.jp3
    public long a(float f, float f2) {
        long b = nw2.b((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), this.b);
        return rf1.a(Float.intBitsToFloat((int) (b >> 32)), Float.intBitsToFloat((int) (b & 4294967295L)));
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "Bradford";
            default:
                return super.toString();
        }
    }
}
