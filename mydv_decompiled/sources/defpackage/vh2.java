package defpackage;

import androidx.media3.extractor.ts.PsExtractor;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vh2 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ long J;
    public final /* synthetic */ long K;
    public final /* synthetic */ Object L;

    public /* synthetic */ vh2(Object obj, long j, long j2, byte b) {
        this.I = b;
        this.L = obj;
        this.J = j;
        this.K = j2;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        char c;
        long j;
        long j2;
        d04 d04Var;
        d04 d04Var2;
        byte b = this.I;
        Object obj2 = this.L;
        switch (b) {
            case 0:
                m00 m00Var = (m00) obj;
                m00Var.getClass();
                boolean z = ((bw0) obj2).f;
                byte b2 = 0;
                long j3 = this.J;
                if (z) {
                    x70 x70Var = new x70(j3);
                    j2 = x70.f;
                    List k0 = p70.k0(x70Var, new x70(j2));
                    float intBitsToFloat = Float.intBitsToFloat((int) (m00Var.I.c() >> 32)) / 2.0f;
                    c = ' ';
                    j = 4294967295L;
                    d04Var = new d04(k0, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (m00Var.I.c() & 4294967295L)) * 0.2f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), Float.intBitsToFloat((int) (m00Var.I.c() >> 32)) * 0.8f);
                } else {
                    c = ' ';
                    j = 4294967295L;
                    x70 x70Var2 = new x70(j3);
                    j2 = x70.f;
                    List k02 = p70.k0(x70Var2, new x70(j2));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (m00Var.I.c() >> 32)) * 0.21f;
                    d04Var = new d04(k02, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (m00Var.I.c() & 4294967295L)) * 0.44f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32), Float.intBitsToFloat((int) (m00Var.I.c() & 4294967295L)) * 0.62f);
                }
                if (z) {
                    d04Var2 = null;
                } else {
                    List k03 = p70.k0(new x70(this.K), new x70(j2));
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (m00Var.I.c() >> c)) * 0.96f;
                    d04Var2 = new d04(k03, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (m00Var.I.c() & j)) * 1.04f) & j) | (Float.floatToRawIntBits(intBitsToFloat3) << c), Float.intBitsToFloat((int) (m00Var.I.c() & j)) * 0.6f);
                }
                return m00Var.a(new l00(new be(d04Var, d04Var2, (byte) 20), b2));
            default:
                sb4 sb4Var = (sb4) obj2;
                y31 y31Var = (y31) obj;
                y31Var.getClass();
                float h = sb4Var.b.h();
                float h2 = sb4Var.f.h();
                if (h > 0.0f && h2 > 0.0f) {
                    float intBitsToFloat4 = Float.intBitsToFloat((int) (y31Var.c() >> 32)) / 2.0f;
                    long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat4) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
                    r7.o(y31Var, this.J, 0L, 0L, floatToRawIntBits, 0.0f, 246);
                    float intBitsToFloat5 = (Float.intBitsToFloat((int) (y31Var.c() & 4294967295L)) * h) / (h + h2);
                    float intBitsToFloat6 = Float.intBitsToFloat((int) (y31Var.c() >> 32)) * 4.0f;
                    if (intBitsToFloat5 < intBitsToFloat6) {
                        intBitsToFloat5 = intBitsToFloat6;
                    }
                    r7.o(y31Var, this.K, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((sb4Var.a.h() / h2) * (Float.intBitsToFloat((int) (y31Var.c() & 4294967295L)) - intBitsToFloat5)) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (y31Var.c() >> 32))) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat5)), floatToRawIntBits, 0.0f, PsExtractor.VIDEO_STREAM_MASK);
                }
                return wd5.a;
        }
    }
}
