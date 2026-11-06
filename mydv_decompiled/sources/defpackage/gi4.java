package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class gi4 {
    public static final ej a = new ej(Float.NaN, Float.NaN);
    public static final ub5 b = new ub5(new yv3((byte) 16), new yv3((byte) 17));
    public static final long c;
    public static final ku4 d;

    static {
        long floatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L);
        c = floatToRawIntBits;
        d = new ku4(new pd3(floatToRawIntBits));
    }
}
