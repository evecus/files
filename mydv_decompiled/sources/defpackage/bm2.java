package defpackage;

import androidx.media3.extractor.ts.PsExtractor;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bm2 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ cw4 J;
    public final /* synthetic */ long K;

    public /* synthetic */ bm2(long j, e02 e02Var) {
        this.I = (byte) 0;
        this.K = j;
        this.J = e02Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        cw4 cw4Var = this.J;
        switch (b) {
            case 0:
                y31 y31Var = (y31) obj;
                y31Var.getClass();
                r7.g(y31Var, this.K, 0.0f, 0L, cw4Var != null ? ((Number) cw4Var.getValue()).floatValue() : 1.0f, 118);
                break;
            case 1:
                y31 y31Var2 = (y31) obj;
                y31Var2.getClass();
                float floatValue = ((Number) cw4Var.getValue()).floatValue();
                if (floatValue > 0.0f) {
                    float P = y31Var2.P(12.0f);
                    float f = -P;
                    float f2 = P * 2.0f;
                    long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (y31Var2.c() >> 32)) + f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (y31Var2.c() & 4294967295L)) + f2) & 4294967295L);
                    float P2 = y31Var2.P(20.0f);
                    r7.o(y31Var2, this.K, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), floatToRawIntBits, (Float.floatToRawIntBits(P2) << 32) | (Float.floatToRawIntBits(P2) & 4294967295L), floatValue, 208);
                    break;
                }
                break;
            default:
                y31 y31Var3 = (y31) obj;
                y31Var3.getClass();
                float b2 = fq4.b(y31Var3.c()) / 24.0f;
                Float f3 = cw4Var != null ? (Float) cw4Var.getValue() : null;
                Iterator it = on5.d.iterator();
                while (it.hasNext()) {
                    float sin = f3 == null ? ((cb1) it.next()).b : (((((float) Math.sin(((f3.floatValue() * r10.d) + r10.c) * 6.2831855f)) * 0.5f) + 0.5f) * 16.0f) + 4.0f;
                    r7.o(y31Var3, this.K, (Float.floatToRawIntBits(r10.a * b2) << 32) | (Float.floatToRawIntBits((12.0f - (sin / 2.0f)) * b2) & 4294967295L), (Float.floatToRawIntBits(b2 * 2.0f) << 32) | (Float.floatToRawIntBits(sin * b2) & 4294967295L), (Float.floatToRawIntBits(b2) << 32) | (Float.floatToRawIntBits(b2) & 4294967295L), 0.0f, PsExtractor.VIDEO_STREAM_MASK);
                }
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ bm2(cw4 cw4Var, long j, byte b) {
        this.I = b;
        this.J = cw4Var;
        this.K = j;
    }
}
