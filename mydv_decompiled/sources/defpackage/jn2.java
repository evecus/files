package defpackage;

import com.github.mytv.dv.model.LiveRoom;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jn2 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ tm1 K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;

    public /* synthetic */ jn2(boolean z, String str, tm1 tm1Var, boolean z2, boolean z3, rm1 rm1Var, rm1 rm1Var2, int i) {
        this.J = z;
        this.N = str;
        this.K = tm1Var;
        this.L = z2;
        this.M = z3;
        this.O = rm1Var;
        this.P = rm1Var2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.P;
        Object obj4 = this.O;
        Object obj5 = this.N;
        switch (b) {
            case 0:
                LiveRoom liveRoom = (LiveRoom) obj5;
                t43 t43Var = (t43) obj4;
                t43 t43Var2 = (t43) obj3;
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    boolean z = this.J;
                    boolean z2 = this.L;
                    boolean z3 = this.M;
                    boolean z4 = (!z || z2 || z3) ? false : true;
                    ta1 e = ma1.e(qb.k0(300, 6, null), 2);
                    qb5 k0 = qb.k0(300, 6, null);
                    Object Q = go1Var.Q();
                    jp jpVar = de0.a;
                    if (Q == jpVar) {
                        Q = new c22((byte) 26);
                        go1Var.o0(Q);
                    }
                    ta1 a = e.a(ma1.i(k0, (tm1) Q));
                    bc1 f = ma1.f(qb.k0(200, 6, null), 2);
                    qb5 k02 = qb.k0(200, 6, null);
                    Object Q2 = go1Var.Q();
                    if (Q2 == jpVar) {
                        Q2 = new c22((byte) 27);
                        go1Var.o0(Q2);
                    }
                    bc1 a2 = f.a(ma1.j(k02, (tm1) Q2));
                    vv vvVar = q8.P;
                    ux uxVar = ux.a;
                    i13 i13Var = i13.a;
                    l13 align = uxVar.align(i13Var, vvVar);
                    i51 i51Var = r13.a;
                    p70.e(z4, i42.G0(align, 0.0f, 0.0f, 0.0f, ((r11) go1Var.k(i51Var)).I, 7), a, a2, null, qg5.m, go1Var, 196608, 16);
                    boolean z5 = (!z || z2 || z3) ? false : true;
                    ta1 e2 = ma1.e(qb.k0(300, 6, null), 2);
                    qb5 k03 = qb.k0(300, 6, null);
                    Object Q3 = go1Var.Q();
                    if (Q3 == jpVar) {
                        Q3 = new c22((byte) 28);
                        go1Var.o0(Q3);
                    }
                    ta1 a3 = e2.a(ma1.i(k03, (tm1) Q3));
                    bc1 f2 = ma1.f(qb.k0(200, 6, null), 2);
                    qb5 k04 = qb.k0(200, 6, null);
                    Object Q4 = go1Var.Q();
                    if (Q4 == jpVar) {
                        Q4 = new c22((byte) 29);
                        go1Var.o0(Q4);
                    }
                    p70.e(z5, i42.G0(uxVar.align(i13Var, vvVar), 0.0f, 0.0f, 0.0f, ((r11) go1Var.k(i51Var)).I, 7), a3, f2.a(ma1.j(k04, (tm1) Q4)), null, p70.u0(1970036338, new ku3(liveRoom, this.K, t43Var, t43Var2, (byte) 6), go1Var), go1Var, 196608, 16);
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                he4.f(this.J, (String) obj5, this.K, this.L, this.M, (rm1) obj4, (rm1) obj3, (fe0) obj, mu0.X(385));
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ jn2(boolean z, boolean z2, boolean z3, LiveRoom liveRoom, tm1 tm1Var, t43 t43Var, t43 t43Var2) {
        this.J = z;
        this.L = z2;
        this.M = z3;
        this.N = liveRoom;
        this.K = tm1Var;
        this.O = t43Var;
        this.P = t43Var2;
    }
}
