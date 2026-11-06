package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yv0 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ zv0 J;

    public /* synthetic */ yv0(zv0 zv0Var, byte b) {
        this.I = b;
        this.J = zv0Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        float f;
        byte b = this.I;
        byte b2 = 1;
        zv0 zv0Var = this.J;
        switch (b) {
            case 0:
                m00 m00Var = (m00) obj;
                float floatValue = ((Number) zv0Var.W.invoke()).floatValue();
                if (floatValue < 0.0f) {
                    floatValue = 0.0f;
                }
                if (floatValue > 1.0f) {
                    floatValue = 1.0f;
                }
                float floatValue2 = ((Number) zv0Var.X.invoke(Float.valueOf(floatValue))).floatValue();
                f = floatValue2 >= 0.0f ? floatValue2 : 0.0f;
                zv0Var.o0(f <= 1.0f ? f : 1.0f);
                return m00Var.a(new yv0(zv0Var, b2));
            default:
                zh0 zh0Var = (zh0) obj;
                bh bhVar = zv0Var.T;
                float floatValue3 = bhVar != null ? ((Number) bhVar.d()).floatValue() : 0.0f;
                zj2 zj2Var = zv0Var.V;
                long H = ((ya2) zh0Var).I.J.H();
                float f2 = zv0Var.P;
                ya2 ya2Var = (ya2) zh0Var;
                r10 r10Var = ya2Var.I;
                zj2Var.a(H, ya2Var.P(f2), zv0Var.q0(), floatValue3, floatValue3 > 0.0f ? zv0Var.R.h() : 0.0f, ya2Var.P(zv0Var.O), zv0Var.M, zv0Var.N);
                zj2 zj2Var2 = zv0Var.V;
                f = ya2Var.getLayoutDirection() != da2.I ? 180.0f : 0.0f;
                long Y = r10Var.Y();
                pn pnVar = r10Var.J;
                long H2 = pnVar.H();
                pnVar.q().f();
                try {
                    ((ep) pnVar.b).F(Y, f);
                    r7.k(zh0Var, zj2Var2.l, zv0Var.L, zv0Var.N, 52);
                    yd[] ydVarArr = zj2Var2.m;
                    if (ydVarArr != null) {
                        for (yd ydVar : ydVarArr) {
                            r7.k(zh0Var, ydVar, zv0Var.K, zv0Var.M, 52);
                        }
                    }
                    qg5.P(zh0Var, zv0Var.q0()[1], ya2Var.c(), zv0Var.Y, zj2Var2.n, zv0Var.N, zv0Var.K);
                    r7.H(pnVar, H2);
                    return wd5.a;
                } catch (Throwable th) {
                    r7.H(pnVar, H2);
                    throw th;
                }
        }
    }
}
