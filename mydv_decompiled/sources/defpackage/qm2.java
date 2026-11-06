package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qm2 implements jn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ List J;
    public final /* synthetic */ ki1 K;
    public final /* synthetic */ String L;
    public final /* synthetic */ ag2 M;
    public final /* synthetic */ op2 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ it4 P;

    public /* synthetic */ qm2(List list, ki1 ki1Var, String str, ag2 ag2Var, op2 op2Var, t43 t43Var, it4 it4Var, byte b) {
        this.I = b;
        this.J = list;
        this.K = ki1Var;
        this.L = str;
        this.M = ag2Var;
        this.N = op2Var;
        this.O = t43Var;
        this.P = it4Var;
    }

    @Override // defpackage.jn1
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        ag2 ag2Var = this.M;
        String str = this.L;
        ki1 ki1Var = this.K;
        List list = this.J;
        op2 op2Var = this.N;
        t43 t43Var = this.O;
        jp jpVar = de0.a;
        switch (b) {
            case 0:
                zd2 zd2Var = (zd2) obj;
                int intValue = ((Number) obj2).intValue();
                fe0 fe0Var = (fe0) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((go1) fe0Var).g(zd2Var) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((go1) fe0Var).e(intValue) ? 32 : 16;
                }
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(i & 1, (i & 147) != 146)) {
                    go1Var.W();
                    break;
                } else {
                    go2 go2Var = (go2) list.get(intValue);
                    go1Var.d0(-1006965844);
                    boolean z2 = intValue == ((Number) t43Var.getValue()).intValue();
                    ki1 ki1Var2 = intValue == ((Number) t43Var.getValue()).intValue() ? ki1Var : null;
                    boolean g = go1Var.g(ag2Var) | go1Var.g(str) | go1Var.i(op2Var) | ((((i & 112) ^ 48) > 32 && go1Var.e(intValue)) || (i & 48) == 32);
                    Object Q = go1Var.Q();
                    if (g || Q == jpVar) {
                        Q = new lm2(this.N, intValue, this.L, this.P, this.M, (byte) 0);
                        go1Var.o0(Q);
                    }
                    rm1 rm1Var = (rm1) Q;
                    boolean i3 = go1Var.i(op2Var);
                    Object Q2 = go1Var.Q();
                    if (i3 || Q2 == jpVar) {
                        z = false;
                        Q2 = new mm2(op2Var, (byte) 0);
                        go1Var.o0(Q2);
                    } else {
                        z = false;
                    }
                    eu5.j(go2Var, z2, true, ki1Var2, rm1Var, (rm1) Q2, go1Var, RendererCapabilities.DECODER_SUPPORT_MASK);
                    go1Var.q(z);
                    break;
                }
            default:
                zd2 zd2Var2 = (zd2) obj;
                int intValue3 = ((Number) obj2).intValue();
                fe0 fe0Var2 = (fe0) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((go1) fe0Var2).g(zd2Var2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((go1) fe0Var2).e(intValue3) ? 32 : 16;
                }
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(i2 & 1, (i2 & 147) != 146)) {
                    go1Var2.W();
                    break;
                } else {
                    go2 go2Var2 = (go2) list.get(intValue3);
                    go1Var2.d0(1427956602);
                    boolean z3 = intValue3 == ((Number) t43Var.getValue()).intValue();
                    ki1 ki1Var3 = intValue3 == ((Number) t43Var.getValue()).intValue() ? ki1Var : null;
                    boolean g2 = ((((i2 & 112) ^ 48) > 32 && go1Var2.e(intValue3)) || (i2 & 48) == 32) | go1Var2.g(ag2Var) | go1Var2.g(str) | go1Var2.i(op2Var);
                    Object Q3 = go1Var2.Q();
                    if (g2 || Q3 == jpVar) {
                        Q3 = new lm2(this.N, intValue3, this.L, this.P, this.M, (byte) 1);
                        go1Var2.o0(Q3);
                    }
                    rm1 rm1Var2 = (rm1) Q3;
                    boolean i4 = go1Var2.i(op2Var);
                    Object Q4 = go1Var2.Q();
                    if (i4 || Q4 == jpVar) {
                        Q4 = new mm2(op2Var, (byte) 1);
                        go1Var2.o0(Q4);
                    }
                    eu5.j(go2Var2, z3, false, ki1Var3, rm1Var2, (rm1) Q4, go1Var2, RendererCapabilities.DECODER_SUPPORT_MASK);
                    go1Var2.q(false);
                    break;
                }
        }
        return wd5Var;
    }
}
