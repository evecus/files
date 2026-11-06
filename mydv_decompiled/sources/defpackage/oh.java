package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class oh extends r92 implements in1 {
    public final /* synthetic */ Object J;
    public final /* synthetic */ gt4 K;
    public final /* synthetic */ ai L;
    public final /* synthetic */ tc0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh(Object obj, gt4 gt4Var, ai aiVar, tc0 tc0Var) {
        super(3);
        this.J = obj;
        this.K = gt4Var;
        this.L = aiVar;
        this.M = tc0Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ui uiVar = (ui) obj;
        fe0 fe0Var = (fe0) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? ((go1) fe0Var).g(uiVar) : ((go1) fe0Var).i(uiVar) ? 4 : 2;
        }
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(intValue & 1, (intValue & 19) != 18)) {
            gt4 gt4Var = this.K;
            boolean g = go1Var.g(gt4Var);
            Object obj4 = this.J;
            boolean i = g | go1Var.i(obj4);
            ai aiVar = this.L;
            boolean i2 = i | go1Var.i(aiVar);
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (i2 || Q == jpVar) {
                Q = new nh(gt4Var, obj4, aiVar, (byte) 0);
                go1Var.o0(Q);
            }
            mw2.f(uiVar, obj4, (tm1) Q, go1Var);
            n43 n43Var = aiVar.d;
            uiVar.getClass();
            n43Var.m(obj4, ((vi) uiVar).b);
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = new th(uiVar);
                go1Var.o0(Q2);
            }
            this.M.c((th) Q2, obj4, go1Var, 0);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }
}
