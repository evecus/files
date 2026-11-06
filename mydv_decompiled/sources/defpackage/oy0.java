package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class oy0 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ float J;
    public final /* synthetic */ long K;

    public /* synthetic */ oy0(float f, long j, byte b) {
        this.I = b;
        this.J = f;
        this.K = j;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        float f = this.J;
        switch (b) {
            case 0:
                y31 y31Var = (y31) obj;
                float P = y31Var.P(f);
                float P2 = y31Var.P(f) / 2.0f;
                float intBitsToFloat = Float.intBitsToFloat((int) (y31Var.c() >> 32));
                float P3 = y31Var.P(f) / 2.0f;
                y31Var.x(this.K, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(P2) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(P3)), P);
                break;
            default:
                y31 y31Var2 = (y31) obj;
                float P4 = y31Var2.P(f);
                long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(y31Var2.P(f) / 2.0f) << 32);
                float P5 = y31Var2.P(f) / 2.0f;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (y31Var2.c() & 4294967295L));
                y31Var2.x(this.K, floatToRawIntBits, (Float.floatToRawIntBits(P5) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2)), P4);
                break;
        }
        return wd5Var;
    }
}
