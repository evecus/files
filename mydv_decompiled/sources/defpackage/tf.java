package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tf implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ tf(t43 t43Var, f45 f45Var, ji3 ji3Var, tc0 tc0Var) {
        this.I = (byte) 15;
        this.L = t43Var;
        this.J = ji3Var;
        this.K = tc0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        int i;
        byte b = this.I;
        df0 df0Var = wa2.A0;
        byte b2 = 1;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.K;
        Object obj4 = this.J;
        Object obj5 = this.L;
        switch (b) {
            case 0:
                l13 l13Var = (l13) obj4;
                t43 t43Var = (t43) obj5;
                tc0 tc0Var = (tc0) obj3;
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    Object Q = go1Var.Q();
                    if (Q == de0.a) {
                        Q = new uf(t43Var, null == true ? 1 : 0);
                        go1Var.o0(Q);
                    }
                    l13 X = qb.X(l13Var, (tm1) Q);
                    uw2 c = px.c(q8.J, true);
                    long j = go1Var.T;
                    int i2 = (int) (j ^ (j >>> 32));
                    am3 m = go1Var.m();
                    l13 x0 = i42.x0(go1Var, X);
                    xd0.c.getClass();
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(df0Var);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, q8.c0, c);
                    qi4.k(go1Var, q8.b0, m);
                    qi4.k(go1Var, q8.d0, Integer.valueOf(i2));
                    qi4.j(go1Var);
                    qi4.k(go1Var, q8.a0, x0);
                    tc0Var.invoke(go1Var, 0);
                    go1Var.q(true);
                    break;
                }
            case 1:
                ((Integer) obj2).getClass();
                c5.e((l13) obj4, (u45) obj5, (tc0) obj3, (fe0) obj, mu0.X(385));
                break;
            case 2:
                ((Integer) obj2).getClass();
                a5.e((String) obj5, (rm1) obj3, (l13) obj4, (fe0) obj, mu0.X(1));
                break;
            case 3:
                li3 li3Var = (li3) obj4;
                kv4 kv4Var = (kv4) obj5;
                ip ipVar = (ip) obj3;
                iu0 iu0Var = (iu0) obj;
                dh0 dh0Var = (dh0) obj2;
                if (dh0.h(dh0Var.a) == Integer.MAX_VALUE) {
                    t02.a("LazyVerticalStaggeredGrid's width should be bound by parent.");
                }
                da2 da2Var = da2.I;
                int h = dh0.h(dh0Var.a) - iu0Var.X(i42.c0(li3Var, da2Var) + i42.d0(li3Var, da2Var));
                int X2 = iu0Var.X(ipVar.b());
                int i3 = kv4Var.a;
                int i4 = h - ((i3 - 1) * X2);
                int i5 = i4 / i3;
                int i6 = i4 % i3;
                int[] iArr = new int[i3];
                int i7 = 0;
                while (i7 < i3) {
                    if (i5 < 0) {
                        i = 0;
                    } else {
                        i = (i7 < i6 ? 1 : 0) + i5;
                    }
                    iArr[i7] = i;
                    i7++;
                }
                int[] iArr2 = new int[i3];
                ipVar.d(iu0Var, h, iArr, da2Var, iArr2);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ci2.b((rm1) obj5, (rm1) obj3, (l13) obj4, (fe0) obj, mu0.X(49));
                break;
            case 5:
                ((Integer) obj2).getClass();
                sv2.c((ji2) obj4, (vi2) obj5, (rm1) obj3, (fe0) obj, mu0.X(7));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ou2.e((ku2) obj5, (tm1) obj3, (l13) obj4, (fe0) obj, mu0.X(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                jl2.a((hx1) obj5, (rm1) obj3, (l13) obj4, (fe0) obj, mu0.X(433));
                break;
            case 8:
                ((Integer) obj2).getClass();
                j16.d(mu0.X(433), (fe0) obj, (rm1) obj5, (tm1) obj3, (String) obj4);
                break;
            case 9:
                ((Integer) obj2).getClass();
                j16.i((hu2) obj5, (rm1) obj3, (l13) obj4, (fe0) obj, mu0.X(9));
                break;
            case 10:
                ((Integer) obj2).getClass();
                j16.e((String) obj4, (rm1) obj5, (ki1) obj3, (fe0) obj, mu0.X(1));
                break;
            case 11:
                cy3 cy3Var = (cy3) obj4;
                t43 t43Var2 = (t43) obj5;
                c80 c80Var = (c80) obj3;
                fe0 fe0Var2 = (fe0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    go1Var2.W();
                    break;
                } else {
                    hy3.d(cy3Var, 200.0f, null, p70.u0(2049628450, new a91(t43Var2, c80Var, b2), go1Var2), go1Var2, 3120);
                    break;
                }
            case 12:
                o24 o24Var = (o24) obj4;
                oc4 oc4Var = (oc4) obj5;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long i8 = oc4Var.i(oc4Var.e(floatValue - o24Var.I));
                oc4 oc4Var2 = ((mc4) obj3).a;
                o24Var.I += oc4Var.e(oc4Var.h(oc4Var2.d(oc4Var2.k, i8, 1)));
                break;
            case 13:
                ((Integer) obj2).getClass();
                qm4.f((ArrayList) obj4, (rm1) obj5, (tm1) obj3, (fe0) obj, mu0.X(49));
                break;
            case 14:
                ((Integer) obj2).getClass();
                fv4.l((String) obj5, (String) obj3, (l13) obj4, (fe0) obj, mu0.X(49));
                break;
            default:
                t43 t43Var3 = (t43) obj5;
                ji3 ji3Var = (ji3) obj4;
                tc0 tc0Var2 = (tc0) obj3;
                fe0 fe0Var3 = (fe0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                go1 go1Var3 = (go1) fe0Var3;
                if (!go1Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    go1Var3.W();
                    break;
                } else {
                    l13 v = j42.v(qg5.a0(i13.a, "Container"), new be(new z35(t43Var3, t43.class, "value", "getValue()Ljava/lang/Object;", 0), ji3Var, (byte) 29));
                    uw2 c2 = px.c(q8.J, true);
                    long j2 = go1Var3.T;
                    int i9 = (int) (j2 ^ (j2 >>> 32));
                    am3 m2 = go1Var3.m();
                    l13 x02 = i42.x0(go1Var3, v);
                    xd0.c.getClass();
                    go1Var3.h0();
                    if (go1Var3.S) {
                        go1Var3.l(df0Var);
                    } else {
                        go1Var3.r0();
                    }
                    qi4.k(go1Var3, q8.c0, c2);
                    qi4.k(go1Var3, q8.b0, m2);
                    qi4.k(go1Var3, q8.d0, Integer.valueOf(i9));
                    qi4.j(go1Var3);
                    qi4.k(go1Var3, q8.a0, x02);
                    tc0Var2.invoke(go1Var3, 0);
                    go1Var3.q(true);
                    break;
                }
        }
        return wd5Var;
    }

    public /* synthetic */ tf(Object obj, Object obj2, l13 l13Var, int i, byte b) {
        this.I = b;
        this.L = obj;
        this.K = obj2;
        this.J = l13Var;
    }

    public /* synthetic */ tf(Object obj, Object obj2, Object obj3, byte b) {
        this.I = b;
        this.J = obj;
        this.L = obj2;
        this.K = obj3;
    }

    public /* synthetic */ tf(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.I = b;
        this.J = obj;
        this.L = obj2;
        this.K = obj3;
    }
}
