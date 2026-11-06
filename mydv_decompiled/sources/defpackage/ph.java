package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ph extends r92 implements hn1 {
    public final /* synthetic */ Object J;
    public final /* synthetic */ ea5 K;
    public final /* synthetic */ ul3 L;
    public final /* synthetic */ tm1 M;
    public final /* synthetic */ ai N;
    public final /* synthetic */ gt4 O;
    public final /* synthetic */ tc0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(Object obj, ea5 ea5Var, ul3 ul3Var, tm1 tm1Var, ai aiVar, gt4 gt4Var, tc0 tc0Var) {
        super(2);
        this.J = obj;
        this.K = ea5Var;
        this.L = ul3Var;
        this.M = tm1Var;
        this.N = aiVar;
        this.O = gt4Var;
        this.P = tc0Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        fe0 fe0Var = (fe0) obj;
        int intValue = ((Number) obj2).intValue();
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(intValue & 1, (intValue & 3) != 2)) {
            ea5 ea5Var = this.K;
            jk3 jk3Var = ea5Var.e;
            jk3 jk3Var2 = ea5Var.d;
            Object value = jk3Var.getValue();
            Object obj3 = this.J;
            boolean h = go1Var.h(j42.c(obj3, value));
            Object Q = go1Var.Q();
            tm1 tm1Var = this.M;
            ul3 ul3Var = this.L;
            jp jpVar = de0.a;
            ai aiVar = this.N;
            if (h || Q == jpVar) {
                Q = (!j42.c(obj3, jk3Var.getValue()) || ul3Var == null) ? (j42.c(obj3, ea5Var.g().b()) || j42.c(obj3, ea5Var.g().d())) ? (si0) tm1Var.invoke(aiVar) : (si0) tm1Var.invoke(new ul3(aiVar, ea5Var.g().b(), obj3)) : (si0) tm1Var.invoke(ul3Var);
                go1Var.o0(Q);
            }
            si0 si0Var = (si0) Q;
            boolean h2 = go1Var.h(j42.c(ea5Var.g().d(), obj3)) | go1Var.h(j42.c(obj3, jk3Var.getValue()));
            Object Q2 = go1Var.Q();
            if (h2 || Q2 == jpVar) {
                Q2 = (j42.c(ea5Var.g().d(), obj3) || (j42.c(obj3, jk3Var.getValue()) && ul3Var != null)) ? bc1.b : (j42.c(obj3, ea5Var.g().b()) || j42.c(obj3, ea5Var.g().d())) ? ((si0) tm1Var.invoke(aiVar)).b : ((si0) tm1Var.invoke(new ul3(aiVar, obj3, ea5Var.g().b()))).b;
                go1Var.o0(Q2);
            }
            bc1 bc1Var = (bc1) Q2;
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new vh(j42.c(obj3, jk3Var2.getValue()));
                go1Var.o0(Q3);
            }
            vh vhVar = (vh) Q3;
            ta1 ta1Var = si0Var.a;
            c16 c16Var = new c16(obj3, si0Var.c.h());
            vhVar.a.setValue(Boolean.valueOf(j42.c(obj3, jk3Var2.getValue())));
            vhVar.b.setValue(Boolean.valueOf((!j42.c(obj3, jk3Var.getValue()) || j42.c(obj3, jk3Var2.getValue()) || j42.c(obj3, ea5Var.a.d())) ? false : true));
            l13 e = hf1.e(c16Var, vhVar);
            boolean i = go1Var.i(obj3);
            Object Q4 = go1Var.Q();
            if (i || Q4 == jpVar) {
                Q4 = new kh(obj3, (byte) 0);
                go1Var.o0(Q4);
            }
            tm1 tm1Var2 = (tm1) Q4;
            boolean g = go1Var.g(bc1Var);
            Object Q5 = go1Var.Q();
            if (g || Q5 == jpVar) {
                Q5 = new lh(bc1Var);
                go1Var.o0(Q5);
            }
            p70.b(this.K, tm1Var2, e, ta1Var, bc1Var, (hn1) Q5, p70.u0(1831990167, new oh(obj3, this.O, aiVar, this.P), go1Var), go1Var, 100663296);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }
}
