package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class df implements in1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;

    public /* synthetic */ df(rm1 rm1Var, boolean z) {
        this.K = rm1Var;
        this.J = z;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.I;
        Object obj4 = this.K;
        switch (b) {
            case 0:
                final rm1 rm1Var = (rm1) obj4;
                l13 l13Var = (l13) obj;
                ((Integer) obj3).getClass();
                go1 go1Var = (go1) ((fe0) obj2);
                go1Var.d0(-196777734);
                final long j = ((f65) go1Var.k(g65.a)).a;
                boolean f = go1Var.f(j) | go1Var.g(rm1Var);
                final boolean z = this.J;
                boolean h = f | go1Var.h(z);
                Object Q = go1Var.Q();
                if (h || Q == de0.a) {
                    Q = new tm1() { // from class: ef
                        @Override // defpackage.tm1
                        public final Object invoke(Object obj5) {
                            m00 m00Var = (m00) obj5;
                            return m00Var.a(new we(rm1Var, z, c5.s(m00Var, Float.intBitsToFloat((int) (m00Var.I.c() >> 32)) / 2.0f), new hw(j, 5), (byte) 0));
                        }
                    };
                    go1Var.o0(Q);
                }
                l13 u = j42.u(l13Var, (tm1) Q);
                go1Var.q(false);
                return u;
            default:
                qr4 qr4Var = (qr4) obj;
                int intValue = ((Integer) obj3).intValue();
                fr4.a.c(qr4Var, null, this.J, (yq4) obj4, null, null, 0.0f, 0.0f, (fe0) obj2, (intValue & 14) | 100663296);
                return wd5.a;
        }
    }

    public /* synthetic */ df(yq4 yq4Var, boolean z) {
        this.J = z;
        this.K = yq4Var;
    }
}
