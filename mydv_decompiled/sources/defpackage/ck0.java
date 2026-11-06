package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ck0 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ u45 J;

    public /* synthetic */ ck0(u45 u45Var, byte b) {
        this.I = b;
        this.J = u45Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        m14 m14Var;
        oh2 oh2Var;
        ca2 c;
        char c2;
        long j;
        float f;
        ca2 c3;
        ca2 c4;
        ca2 c5;
        ca2 c6;
        byte b = this.I;
        u45 u45Var = this.J;
        switch (b) {
            case 0:
                return new x7(u45Var, (byte) 5);
            case 1:
                u45Var.s();
                return wd5.a;
            default:
                ca2 ca2Var = (ca2) obj;
                oh2 oh2Var2 = u45Var.d;
                m14 m14Var2 = m14.e;
                if (oh2Var2 != null) {
                    if (oh2Var2.p) {
                        oh2Var2 = null;
                    }
                    if (oh2Var2 != null) {
                        td3 td3Var = u45Var.b;
                        long j2 = u45Var.l().b;
                        int i = d65.c;
                        int k = td3Var.k((int) (j2 >> 32));
                        int k2 = u45Var.b.k((int) (u45Var.l().b & 4294967295L));
                        oh2 oh2Var3 = u45Var.d;
                        long j3 = 0;
                        long M = (oh2Var3 == null || (c6 = oh2Var3.c()) == null) ? 0L : c6.M(u45Var.j(true));
                        oh2 oh2Var4 = u45Var.d;
                        if (oh2Var4 != null && (c5 = oh2Var4.c()) != null) {
                            j3 = c5.M(u45Var.j(false));
                        }
                        oh2 oh2Var5 = u45Var.d;
                        float f2 = 0.0f;
                        if (oh2Var5 == null || (c4 = oh2Var5.c()) == null) {
                            c2 = ' ';
                            j = j3;
                            f = 0.0f;
                        } else {
                            c2 = ' ';
                            j = j3;
                            f = Float.intBitsToFloat((int) (c4.M((Float.floatToRawIntBits(oh2Var2.d() != null ? r4.a.c(k).b : 0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)) & 4294967295L));
                        }
                        oh2 oh2Var6 = u45Var.d;
                        if (oh2Var6 != null && (c3 = oh2Var6.c()) != null) {
                            f2 = Float.intBitsToFloat((int) (c3.M((Float.floatToRawIntBits(0.0f) << c2) | (Float.floatToRawIntBits(oh2Var2.d() != null ? r7.a.c(k2).b : 0.0f) & 4294967295L)) & 4294967295L));
                        }
                        int i2 = (int) (M >> c2);
                        int i3 = (int) (j >> c2);
                        m14Var = new m14(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.min(f, f2), Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), (oh2Var2.a.g.getDensity() * 25.0f) + Math.max(Float.intBitsToFloat((int) (M & 4294967295L)), Float.intBitsToFloat((int) (j & 4294967295L))));
                        oh2Var = u45Var.d;
                        if (oh2Var != null || (c = oh2Var.c()) == null) {
                            return null;
                        }
                        return (c.h() && ca2Var.h()) ? sv2.g(ca2Var.mo37screenToLocalMKHz9U(mu0.q(c).mo36localToScreenMKHz9U(m14Var.d())), m14Var.c()) : m14Var2;
                    }
                }
                m14Var = m14Var2;
                oh2Var = u45Var.d;
                if (oh2Var != null) {
                }
                return null;
        }
    }
}
