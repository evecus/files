package defpackage;

import android.graphics.Bitmap;
import com.github.mytv.dv.widget.NowPlayingWidget;
import com.github.mytv.dv.widget.WidgetPlayback;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class so2 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ so2(t43 t43Var, hu2 hu2Var, t43 t43Var2, t43 t43Var3) {
        this.I = (byte) 1;
        this.J = t43Var;
        this.K = hu2Var;
        this.L = t43Var2;
        this.M = t43Var3;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 provideGlance$lambda$2$0;
        byte b = this.I;
        byte b2 = 7;
        jp jpVar = de0.a;
        wd5 wd5Var = wd5.a;
        byte b3 = 1;
        Object obj3 = this.M;
        Object obj4 = this.J;
        Object obj5 = this.L;
        Object obj6 = this.K;
        switch (b) {
            case 0:
                hu2 hu2Var = (hu2) obj6;
                x70 x70Var = (x70) obj5;
                cw4 cw4Var = (cw4) obj4;
                t43 t43Var = (t43) obj3;
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    op2 op2Var = hu2Var.n;
                    boolean booleanValue = ((Boolean) cw4Var.getValue()).booleanValue();
                    boolean i = go1Var.i(hu2Var);
                    Object Q = go1Var.Q();
                    if (i || Q == jpVar) {
                        Q = new vo2(hu2Var, false ? (byte) 1 : (byte) 0);
                        go1Var.o0(Q);
                    }
                    hn1 hn1Var = (hn1) Q;
                    boolean i2 = go1Var.i(hu2Var);
                    Object Q2 = go1Var.Q();
                    if (i2 || Q2 == jpVar) {
                        Q2 = new ao(hu2Var, b2);
                        go1Var.o0(Q2);
                    }
                    rm1 rm1Var = (rm1) Q2;
                    ne1 ne1Var = nq4.c;
                    Object Q3 = go1Var.Q();
                    if (Q3 == jpVar) {
                        Q3 = new uf(t43Var, (byte) 26);
                        go1Var.o0(Q3);
                    }
                    eu5.i(op2Var, booleanValue, hn1Var, rm1Var, ne1Var, x70Var, (tm1) Q3, go1Var, 1597448);
                    break;
                }
            case 1:
                cw4 cw4Var2 = (cw4) obj4;
                hu2 hu2Var2 = (hu2) obj6;
                cw4 cw4Var3 = (cw4) obj5;
                cw4 cw4Var4 = (cw4) obj3;
                fe0 fe0Var2 = (fe0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    go1Var2.W();
                    break;
                } else {
                    ne1 ne1Var2 = nq4.c;
                    li3 T = i42.T(0.0f, 0.0f, 4.0f, 7);
                    kp kpVar = new kp(20.0f, true, new y9());
                    boolean g = go1Var2.g(cw4Var2) | go1Var2.i(hu2Var2) | go1Var2.g(cw4Var3) | go1Var2.g(cw4Var4);
                    Object Q4 = go1Var2.Q();
                    if (g || Q4 == jpVar) {
                        u20 u20Var = new u20((Object) cw4Var2, (Object) hu2Var2, (Object) cw4Var3, (Object) cw4Var4, (byte) 7);
                        go1Var2.o0(u20Var);
                        Q4 = u20Var;
                    }
                    e21.c(ne1Var2, null, T, kpVar, null, null, false, null, (tm1) Q4, go1Var2, 24966, 490);
                    break;
                }
            case 2:
                ((Integer) obj2).getClass();
                pe.b((vv) obj6, (rm1) obj5, (zq3) obj4, (tc0) obj3, (fe0) obj, mu0.X(28039));
                break;
            case 3:
                l13 l13Var = (l13) obj6;
                t43 t43Var2 = (t43) obj3;
                tc0 tc0Var = (tc0) obj5;
                bv bvVar = (bv) obj4;
                fe0 fe0Var3 = (fe0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                go1 go1Var3 = (go1) fe0Var3;
                if (!go1Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    go1Var3.W();
                    break;
                } else {
                    Object Q5 = go1Var3.Q();
                    if (Q5 == jpVar) {
                        Q5 = new uf(t43Var2, (byte) 3);
                        go1Var3.o0(Q5);
                    }
                    l13 X = qb.X(l13Var, (tm1) Q5);
                    uw2 c = px.c(q8.J, true);
                    long j = go1Var3.T;
                    int i3 = (int) (j ^ (j >>> 32));
                    am3 m = go1Var3.m();
                    l13 x0 = i42.x0(go1Var3, X);
                    xd0.c.getClass();
                    go1Var3.h0();
                    if (go1Var3.S) {
                        go1Var3.l(wa2.A0);
                    } else {
                        go1Var3.r0();
                    }
                    qi4.k(go1Var3, q8.c0, c);
                    qi4.k(go1Var3, q8.b0, m);
                    qi4.k(go1Var3, q8.d0, Integer.valueOf(i3));
                    qi4.j(go1Var3);
                    qi4.k(go1Var3, q8.a0, x0);
                    tc0Var.invoke(go1Var3, 0);
                    Object Q6 = go1Var3.Q();
                    if (Q6 == jpVar) {
                        Q6 = new sf(t43Var2, b3);
                        go1Var3.o0(Q6);
                    }
                    bvVar.b((rm1) Q6, go1Var3, 6);
                    go1Var3.q(true);
                    break;
                }
            case 4:
                k80 k80Var = (k80) obj6;
                hn4 hn4Var = (hn4) obj5;
                lc5 lc5Var = (lc5) obj4;
                hn1 hn1Var2 = (hn1) obj3;
                fe0 fe0Var4 = (fe0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                go1 go1Var4 = (go1) fe0Var4;
                if (!go1Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    go1Var4.W();
                    break;
                } else {
                    lw2.c(k80Var, hn4Var, lc5Var, hn1Var2, go1Var4, 0, 0);
                    break;
                }
            case 5:
                ab4 ab4Var = (ab4) obj5;
                hu2 hu2Var3 = (hu2) obj6;
                t43 t43Var3 = (t43) obj3;
                t43 t43Var4 = (t43) obj4;
                fe0 fe0Var5 = (fe0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                go1 go1Var5 = (go1) fe0Var5;
                if (!go1Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    go1Var5.W();
                    break;
                } else {
                    ku2 f = ou2.f(ab4Var);
                    boolean e = go1Var5.e(ab4Var.ordinal()) | go1Var5.i(hu2Var3);
                    Object Q7 = go1Var5.Q();
                    if (e || Q7 == jpVar) {
                        tt1 tt1Var = new tt1(ab4Var, hu2Var3, t43Var3, t43Var4, (byte) 2);
                        go1Var5.o0(tt1Var);
                        Q7 = tt1Var;
                    }
                    ou2.c(f, true, (tm1) Q7, go1Var5, 48);
                    break;
                }
            case 6:
                provideGlance$lambda$2$0 = NowPlayingWidget.provideGlance$lambda$2$0((fl4) obj6, (WidgetPlayback) obj5, (Bitmap) obj4, (Bitmap) obj3, (fe0) obj, ((Integer) obj2).intValue());
                break;
            case 7:
                ez3 ez3Var = (ez3) obj6;
                t43 t43Var5 = (t43) obj3;
                ki1 ki1Var = (ki1) obj5;
                t43 t43Var6 = (t43) obj4;
                fe0 fe0Var6 = (fe0) obj;
                int intValue6 = ((Integer) obj2).intValue();
                go1 go1Var6 = (go1) fe0Var6;
                if (!go1Var6.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    go1Var6.W();
                    break;
                } else {
                    eu5.g(p70.u0(-190432768, new in2(((fw2) go1Var6.k(lw2.b)).a, ez3Var, t43Var5, ki1Var, t43Var6), go1Var6), go1Var6, 6);
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                qe4.g((List) obj6, (tm1) obj5, (tm1) obj4, (rm1) obj3, (fe0) obj, mu0.X(1));
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ so2(byte b, t43 t43Var, Object obj, Object obj2, Object obj3) {
        this.I = b;
        this.K = obj;
        this.M = t43Var;
        this.L = obj2;
        this.J = obj3;
    }

    public /* synthetic */ so2(ab4 ab4Var, hu2 hu2Var, t43 t43Var, t43 t43Var2) {
        this.I = (byte) 5;
        this.L = ab4Var;
        this.K = hu2Var;
        this.M = t43Var;
        this.J = t43Var2;
    }

    public /* synthetic */ so2(Object obj, dn1 dn1Var, Object obj2, dn1 dn1Var2, int i, byte b) {
        this.I = b;
        this.K = obj;
        this.L = dn1Var;
        this.J = obj2;
        this.M = dn1Var2;
    }

    public /* synthetic */ so2(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.I = b;
        this.K = obj;
        this.L = obj2;
        this.J = obj3;
        this.M = obj4;
    }
}
