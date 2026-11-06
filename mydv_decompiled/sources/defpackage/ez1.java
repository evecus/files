package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ez1 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ fz1 J;

    public /* synthetic */ ez1(fz1 fz1Var, byte b) {
        this.I = b;
        this.J = fz1Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        byte b2 = 1;
        fz1 fz1Var = this.J;
        switch (b) {
            case 0:
                fz1Var.o0(fz1Var.a0);
                return ((m00) obj).a(new ez1(fz1Var, b2));
            default:
                zh0 zh0Var = (zh0) obj;
                bh bhVar = fz1Var.T;
                float floatValue = bhVar != null ? ((Number) bhVar.d()).floatValue() : 0.0f;
                zj2 zj2Var = fz1Var.V;
                long H = ((ya2) zh0Var).I.J.H();
                float f = fz1Var.P;
                ya2 ya2Var = (ya2) zh0Var;
                r10 r10Var = ya2Var.I;
                float P = ya2Var.P(f);
                float[] fArr = fz1Var.b0;
                fArr[0] = ((Number) fz1Var.X.invoke()).floatValue();
                fArr[1] = ((Number) fz1Var.W.invoke()).floatValue();
                fArr[2] = ((Number) fz1Var.Z.invoke()).floatValue();
                fArr[3] = ((Number) fz1Var.Y.invoke()).floatValue();
                zj2Var.a(H, P, fArr, floatValue, floatValue > 0.0f ? fz1Var.R.h() : 0.0f, ya2Var.P(fz1Var.O), fz1Var.M, fz1Var.N);
                zj2 zj2Var2 = fz1Var.V;
                float f2 = ya2Var.getLayoutDirection() != da2.I ? 180.0f : 0.0f;
                long Y = r10Var.Y();
                pn pnVar = r10Var.J;
                long H2 = pnVar.H();
                pnVar.q().f();
                try {
                    ((ep) pnVar.b).F(Y, f2);
                    r7.k(zh0Var, zj2Var2.l, fz1Var.L, fz1Var.N, 52);
                    yd[] ydVarArr = zj2Var2.m;
                    if (ydVarArr != null) {
                        for (yd ydVar : ydVarArr) {
                            r7.k(zh0Var, ydVar, fz1Var.K, fz1Var.M, 52);
                        }
                    }
                    r7.H(pnVar, H2);
                    return wd5.a;
                } catch (Throwable th) {
                    r7.H(pnVar, H2);
                    throw th;
                }
        }
    }
}
