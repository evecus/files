package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class qi1 extends tn1 implements hn1 {
    public final /* synthetic */ byte I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi1(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.I = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        boolean b;
        boolean b2;
        byte b3 = this.I;
        wd5 wd5Var = wd5.a;
        we2 we2Var = null;
        Object[] objArr = 0;
        switch (b3) {
            case 0:
                oi1 oi1Var = (oi1) obj;
                oi1 oi1Var2 = (oi1) obj2;
                ri1 ri1Var = (ri1) this.receiver;
                if (ri1Var.isAttached() && (b = oi1Var2.b()) != oi1Var.b()) {
                    if (!b) {
                        we2 we2Var2 = ri1Var.L;
                        if (we2Var2 != null) {
                            we2Var2.b();
                        }
                        ri1Var.L = null;
                        break;
                    } else {
                        r24 r24Var = new r24();
                        mu0.P(ri1Var, new ka(r24Var, ri1Var, (byte) 16));
                        we2 we2Var3 = (we2) r24Var.I;
                        if (we2Var3 != null) {
                            we2Var3.a();
                            we2Var = we2Var3;
                        }
                        ri1Var.L = we2Var;
                        break;
                    }
                }
                break;
            default:
                oi1 oi1Var3 = (oi1) obj;
                oi1 oi1Var4 = (oi1) obj2;
                zi1 zi1Var = (zi1) this.receiver;
                if (zi1Var.isAttached() && (b2 = oi1Var4.b()) != oi1Var3.b()) {
                    tm1 tm1Var = zi1Var.L;
                    if (tm1Var != null) {
                        tm1Var.invoke(Boolean.valueOf(b2));
                    }
                    jp jpVar = aj1.I;
                    if (b2) {
                        p70.g0(zi1Var.getCoroutineScope(), null, gl0.L, new p(zi1Var, objArr == true ? 1 : 0, (byte) 1), 1);
                        r24 r24Var2 = new r24();
                        mu0.P(zi1Var, new k9(r24Var2, zi1Var, (byte) 6));
                        we2 we2Var4 = (we2) r24Var2.I;
                        if (we2Var4 != null) {
                            we2Var4.a();
                        } else {
                            we2Var4 = null;
                        }
                        zi1Var.N = we2Var4;
                        na3 na3Var = zi1Var.O;
                        if (na3Var != null && na3Var.h() && zi1Var.isAttached()) {
                            ad4.p(zi1Var, jpVar);
                        }
                    } else {
                        we2 we2Var5 = zi1Var.N;
                        if (we2Var5 != null) {
                            we2Var5.b();
                        }
                        zi1Var.N = null;
                        if (zi1Var.isAttached()) {
                            ad4.p(zi1Var, jpVar);
                        }
                    }
                    ut0.U(zi1Var).I();
                    t33 t33Var = zi1Var.K;
                    if (t33Var != null) {
                        th1 th1Var = zi1Var.M;
                        if (!b2) {
                            if (th1Var != null) {
                                zi1Var.m0(t33Var, new uh1(th1Var));
                                zi1Var.M = null;
                                break;
                            }
                        } else {
                            if (th1Var != null) {
                                zi1Var.m0(t33Var, new uh1(th1Var));
                                zi1Var.M = null;
                            }
                            th1 th1Var2 = new th1();
                            zi1Var.m0(t33Var, th1Var2);
                            zi1Var.M = th1Var2;
                            break;
                        }
                    }
                }
                break;
        }
        return wd5Var;
    }
}
