package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class uh0 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ uh0(tc0 tc0Var, eg2 eg2Var) {
        this.I = (byte) 8;
        this.K = tc0Var;
        this.J = eg2Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.K;
        Object obj4 = this.J;
        switch (b) {
            case 0:
                k80 k80Var = (k80) obj4;
                tc0 tc0Var = (tc0) obj3;
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    lw2.a(k80Var, rn.a, jo.h, mc5.a, tc0Var, go1Var, 0);
                    break;
                }
            case 1:
                ((Integer) obj2).getClass();
                sv2.f((List) obj4, (Collection) obj3, (fe0) obj, mu0.X(1));
                break;
            case 2:
                j34 j34Var = (j34) obj4;
                wr4 wr4Var = (wr4) obj3;
                int intValue2 = ((Integer) obj).intValue();
                if (!(obj2 instanceof ld0)) {
                    if (!(obj2 instanceof m54)) {
                        if (!(obj2 instanceof lo1)) {
                            if (obj2 instanceof x04) {
                                p70.v0(wr4Var, intValue2, obj2);
                                ((x04) obj2).c();
                                break;
                            }
                        } else {
                            p70.v0(wr4Var, intValue2, obj2);
                            j34Var.e((lo1) obj2);
                            break;
                        }
                    }
                } else {
                    j34Var.f.c((ld0) obj2);
                    break;
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                mu0.b((String) obj4, (String) obj3, (fe0) obj, mu0.X(55));
                break;
            case 4:
                ((Integer) obj2).getClass();
                i42.F((String) obj4, (rm1) obj3, (fe0) obj, mu0.X(391));
                break;
            case 5:
                cb2 cb2Var = (cb2) obj4;
                hn1 hn1Var = (hn1) obj3;
                fe0 fe0Var2 = (fe0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    go1Var2.W();
                    break;
                } else {
                    Boolean bool = (Boolean) cb2Var.g.getValue();
                    boolean booleanValue = bool.booleanValue();
                    go1Var2.g0(bool);
                    boolean h = go1Var2.h(booleanValue);
                    if (booleanValue) {
                        hn1Var.invoke(go1Var2, 0);
                    } else {
                        if (go1Var2.l != 0) {
                            ke0.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!go1Var2.S) {
                            if (h) {
                                sr4 sr4Var = go1Var2.G;
                                int i = sr4Var.g;
                                int i2 = sr4Var.h;
                                ge0 ge0Var = go1Var2.M;
                                ge0Var.getClass();
                                ge0Var.d(false);
                                ge0Var.b.g.i0(gf3.c);
                                p70.w0(go1Var2.s, i, i2);
                                go1Var2.G.t();
                            } else {
                                go1Var2.V();
                            }
                        }
                    }
                    if (go1Var2.y && go1Var2.G.i == go1Var2.z) {
                        go1Var2.z = -1;
                        go1Var2.y = false;
                    }
                    go1Var2.q(false);
                    break;
                }
                break;
            case 6:
                le2 le2Var = (le2) obj4;
                ke2 ke2Var = (ke2) obj3;
                fe0 fe0Var3 = (fe0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                go1 go1Var3 = (go1) fe0Var3;
                if (!go1Var3.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    go1Var3.W();
                    break;
                } else {
                    me2 me2Var = (me2) le2Var.b.invoke();
                    int i3 = ke2Var.c;
                    Object obj5 = ke2Var.a;
                    if ((i3 >= me2Var.a() || !me2Var.c(i3).equals(obj5)) && (i3 = me2Var.e(obj5)) != -1) {
                        ke2Var.c = i3;
                    }
                    int i4 = i3;
                    if (i4 != -1) {
                        go1Var3.d0(-1664741271);
                        sp0.e(me2Var, le2Var.a, i4, ke2Var.a, go1Var3, 0);
                        go1Var3.q(false);
                    } else {
                        go1Var3.d0(-1664505826);
                        go1Var3.q(false);
                    }
                    boolean i5 = go1Var3.i(ke2Var);
                    Object Q = go1Var3.Q();
                    if (i5 || Q == de0.a) {
                        Q = new i9(ke2Var, (byte) 11);
                        go1Var3.o0(Q);
                    }
                    mw2.e(obj5, (tm1) Q, go1Var3);
                    break;
                }
            case 7:
                break;
            case 8:
                tc0 tc0Var2 = (tc0) obj3;
                eg2 eg2Var = (eg2) obj4;
                fe0 fe0Var4 = (fe0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                go1 go1Var4 = (go1) fe0Var4;
                if (!go1Var4.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    go1Var4.W();
                    break;
                } else {
                    tc0Var2.invoke(eg2Var, go1Var4, 0);
                    break;
                }
            case 9:
                ((Integer) obj2).getClass();
                rt0.f((g94) obj4, (tc0) obj3, (fe0) obj, mu0.X(1));
                break;
            case 10:
                na3 na3Var = (na3) obj4;
                ka3 ka3Var = (ka3) obj3;
                o10 o10Var = (o10) obj;
                jr1 jr1Var = (jr1) obj2;
                wa2 wa2Var = na3Var.c0;
                if (!wa2Var.L()) {
                    na3Var.A0 = true;
                    break;
                } else {
                    na3Var.x0 = o10Var;
                    na3Var.w0 = jr1Var;
                    za2.a(wa2Var).getSnapshotObserver().a.d(na3Var, na3.D0, ka3Var);
                    na3Var.A0 = false;
                    break;
                }
            case 11:
                ((Integer) obj2).getClass();
                r55.a((m65) obj4, (hn1) obj3, (fe0) obj, mu0.X(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                on5.j(mu0.X(1), (fe0) obj, (hx1) obj4, (String) obj3);
                break;
            default:
                String str = (String) obj4;
                hv4 hv4Var = (hv4) obj3;
                fe0 fe0Var5 = (fe0) obj;
                int intValue6 = ((Integer) obj2).intValue();
                go1 go1Var5 = (go1) fe0Var5;
                if (!go1Var5.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    go1Var5.W();
                    break;
                } else {
                    p9.a(str, hv4Var, null, false, go1Var5, 0, 12);
                    break;
                }
        }
        return wd5Var;
    }

    public /* synthetic */ uh0(byte b, int i, Object obj, Object obj2) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    public /* synthetic */ uh0(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }
}
