package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class y55 {
    public final jk3 a = ad4.w(null);
    public oj b;
    public final gt4 c;

    public y55(oj ojVar) {
        m45 m45Var = new m45((byte) 4);
        ojVar.getClass();
        mj mjVar = new mj(ojVar);
        ArrayList arrayList = mjVar.K;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) m45Var.invoke(((lj) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                nj njVar = (nj) list.get(i2);
                Object obj = njVar.a;
                arrayList3.add(new lj(njVar.d, njVar.b, njVar.c, obj));
            }
            u70.I0(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = mjVar.f();
        this.c = new gt4();
    }

    public static nj c(nj njVar, u55 u55Var) {
        int c = u55Var.b.c(r3.f - 1, false);
        if (njVar.b < c) {
            return nj.d(njVar, null, Math.min(njVar.c, c), 11);
        }
        return null;
    }

    public final void a(fe0 fe0Var, int i) {
        int i2;
        char c;
        boolean z;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1154651354);
        char c2 = 2;
        int i3 = (go1Var.i(this) ? 4 : 2) | i;
        boolean z2 = false;
        if (go1Var.T(i3 & 1, (i3 & 3) != 2)) {
            fg fgVar = (fg) go1Var.k(hf0.s);
            oj ojVar = this.b;
            List a = ojVar.a(ojVar.J.length());
            int size = a.size();
            int i4 = 0;
            while (i4 < size) {
                nj njVar = (nj) a.get(i4);
                int i5 = njVar.b;
                Object obj = njVar.a;
                if (i5 != njVar.c) {
                    go1Var.d0(725478935);
                    Object Q = go1Var.Q();
                    Object obj2 = de0.a;
                    if (Q == obj2) {
                        Q = r7.v(go1Var);
                    }
                    t33 t33Var = (t33) Q;
                    c = c2;
                    l13 O = qb.O(i13.a, new ap3((Object) this, (Object) njVar, (byte) 12));
                    Object Q2 = go1Var.Q();
                    if (Q2 == obj2) {
                        Q2 = new m45((byte) 5);
                        go1Var.o0(Q2);
                    }
                    l13 U = qg5.U(oi4.a(O, z2, (tm1) Q2).then(new e65(new yp0(this, njVar, (byte) 13))), t33Var);
                    pp3.a.getClass();
                    l13 c0 = lq2.c0(U, i42.m);
                    boolean i6 = go1Var.i(this) | go1Var.g(njVar) | go1Var.i(fgVar);
                    Object Q3 = go1Var.Q();
                    if (i6 || Q3 == obj2) {
                        Q3 = new x45(this, njVar, fgVar);
                        go1Var.o0(Q3);
                    }
                    px.a(c0.then(new ja0((rm1) Q3, null, t33Var, null, false)), go1Var, 0);
                    ek2 ek2Var = (ek2) obj;
                    z55 a2 = ek2Var.a();
                    if (a2 == null || (a2.a == null && a2.b == null && a2.c == null && a2.d == null)) {
                        i2 = i3;
                        z = false;
                        go1Var.d0(728331710);
                        go1Var.q(false);
                    } else {
                        go1Var.d0(726303039);
                        Object Q4 = go1Var.Q();
                        if (Q4 == obj2) {
                            Q4 = new fk2(t33Var);
                            go1Var.o0(Q4);
                        }
                        fk2 fk2Var = (fk2) Q4;
                        Object Q5 = go1Var.Q();
                        fj0 fj0Var = null;
                        if (Q5 == obj2) {
                            Q5 = new h40((Object) fk2Var, fj0Var, (byte) 24);
                            go1Var.o0(Q5);
                        }
                        mw2.h(go1Var, (hn1) Q5, wd5.a);
                        gk3 gk3Var = fk2Var.b;
                        gk3 gk3Var2 = fk2Var.b;
                        Object valueOf = Boolean.valueOf((gk3Var.h() & 2) != 0);
                        Object valueOf2 = Boolean.valueOf((gk3Var2.h() & 1) != 0);
                        Object valueOf3 = Boolean.valueOf((gk3Var2.h() & 4) != 0);
                        z55 a3 = ek2Var.a();
                        Object obj3 = a3 != null ? a3.a : null;
                        i2 = i3;
                        z55 a4 = ek2Var.a();
                        Object obj4 = a4 != null ? a4.b : null;
                        z55 a5 = ek2Var.a();
                        Object obj5 = a5 != null ? a5.c : null;
                        z55 a6 = ek2Var.a();
                        Object obj6 = a6 != null ? a6.d : null;
                        Object obj7 = obj5;
                        Object[] objArr = new Object[7];
                        objArr[0] = valueOf;
                        objArr[1] = valueOf2;
                        objArr[c] = valueOf3;
                        objArr[3] = obj3;
                        objArr[4] = obj4;
                        objArr[5] = obj7;
                        objArr[6] = obj6;
                        boolean i7 = go1Var.i(this) | go1Var.g(njVar);
                        Object Q6 = go1Var.Q();
                        if (i7 || Q6 == obj2) {
                            Q6 = new ap3(this, njVar, fk2Var);
                            go1Var.o0(Q6);
                        }
                        b(objArr, (tm1) Q6, go1Var, (i2 << 6) & 896);
                        z = false;
                        go1Var.q(false);
                    }
                    go1Var.q(z);
                } else {
                    i2 = i3;
                    c = c2;
                    z = z2;
                    go1Var.d0(728345598);
                    go1Var.q(z);
                }
                i4++;
                z2 = z;
                i3 = i2;
                c2 = c;
            }
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new rd(this, i, (byte) 19);
        }
    }

    public final void b(Object[] objArr, tm1 tm1Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-2083052099);
        int i2 = (i & 48) == 0 ? (go1Var.i(tm1Var) ? 32 : 16) | i : i;
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.i(this) ? 256 : 128;
        }
        go1Var.a0(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (go1Var.e(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= go1Var.i(obj) ? 4 : 0;
        }
        go1Var.q(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        byte b = 1;
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            d63 d63Var = new d63((byte) 3);
            ArrayList arrayList = d63Var.J;
            arrayList.add(tm1Var);
            d63Var.a(objArr);
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean i4 = go1Var.i(this) | ((i3 & 112) == 32);
            Object Q = go1Var.Q();
            if (i4 || Q == de0.a) {
                Q = new hv(this, tm1Var, b);
                go1Var.o0(Q);
            }
            mw2.g(array, (tm1) Q, go1Var);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ve(this, objArr, tm1Var, i, (byte) 7);
        }
    }
}
