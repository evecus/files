package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class z81 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ String J;
    public final /* synthetic */ l13 K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ m65 M;
    public final /* synthetic */ long N;
    public final /* synthetic */ int O;
    public final /* synthetic */ Map P;
    public final /* synthetic */ int Q;

    public /* synthetic */ z81(String str, l13 l13Var, Object obj, m65 m65Var, long j, int i, Map map, int i2, byte b) {
        this.I = b;
        this.J = str;
        this.K = l13Var;
        this.L = obj;
        this.M = m65Var;
        this.N = j;
        this.O = i;
        this.P = map;
        this.Q = i2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.Q;
        Object obj3 = this.L;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(i | 1);
                c91.b(this.J, this.K, (g80) obj3, this.M, this.N, this.O, this.P, (fe0) obj, X);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(i | 1);
                c91.b(this.J, this.K, (g80) obj3, this.M, this.N, this.O, this.P, (fe0) obj, X2);
                break;
            default:
                ((Integer) obj2).getClass();
                int X3 = mu0.X(i | 1);
                c91.a(this.J, this.K, (cw4) obj3, this.M, this.N, this.O, this.P, (fe0) obj, X3);
                break;
        }
        return wd5Var;
    }
}
