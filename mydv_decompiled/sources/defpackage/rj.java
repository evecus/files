package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class rj {
    public static final uj3 a;

    static {
        o91 o91Var = o91.I;
        a = new uj3(o91Var, o91Var);
    }

    public static final void a(oj ojVar, List list, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1794596951);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(ojVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        char c = ' ';
        if ((i & 48) == 0) {
            i2 |= go1Var.i(list) ? 32 : 16;
        }
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            int i3 = 0;
            while (i3 < size) {
                nj njVar = (nj) list.get(i3);
                in1 in1Var = (in1) njVar.a;
                int i4 = njVar.b;
                int i5 = njVar.c;
                Object Q = go1Var.Q();
                if (Q == de0.a) {
                    Q = kc.d;
                    go1Var.o0(Q);
                }
                uw2 uw2Var = (uw2) Q;
                long j = go1Var.T;
                int i6 = (int) (j ^ (j >>> c));
                am3 m = go1Var.m();
                l13 x0 = i42.x0(go1Var, i13.a);
                xd0.c.getClass();
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(wa2.A0);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, q8.c0, uw2Var);
                qi4.k(go1Var, q8.b0, m);
                qi4.k(go1Var, q8.d0, Integer.valueOf(i6));
                qi4.j(go1Var);
                qi4.k(go1Var, q8.a0, x0);
                in1Var.invoke(ojVar.subSequence(i4, i5).J, go1Var, 0);
                go1Var.q(true);
                i3++;
                c = ' ';
            }
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new qj((byte) 0, i, ojVar, list);
        }
    }

    public static final boolean b(oj ojVar) {
        int length = ojVar.J.length();
        List list = ojVar.I;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                nj njVar = (nj) list.get(i);
                if ((njVar.f() instanceof dx4) && j42.c("androidx.compose.foundation.text.inlineContent", njVar.h()) && pj.c(0, length, njVar.g(), njVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [o91] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public static final uj3 c(oj ojVar, Map map) {
        ?? r2;
        if (map == null || map.isEmpty()) {
            return a;
        }
        int length = ojVar.J.length();
        List list = ojVar.I;
        if (list != null) {
            r2 = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                nj njVar = (nj) list.get(i);
                Object obj = njVar.a;
                int i2 = njVar.c;
                int i3 = njVar.b;
                String str = njVar.d;
                if ((obj instanceof dx4) && "androidx.compose.foundation.text.inlineContent".equals(str) && pj.c(0, length, i3, i2)) {
                    Object obj2 = njVar.a;
                    obj2.getClass();
                    r2.add(new nj(str, i3, i2, ((dx4) obj2).a));
                }
            }
        } else {
            r2 = o91.I;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = r2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            nj njVar2 = (nj) r2.get(i4);
            Object obj3 = njVar2.a;
            int i5 = njVar2.c;
            int i6 = njVar2.b;
            v02 v02Var = (v02) map.get(obj3);
            if (v02Var != null) {
                arrayList.add(new nj(i6, i5, v02Var.a));
                arrayList2.add(new nj(i6, i5, v02Var.b));
            }
        }
        return new uj3(arrayList, arrayList2);
    }
}
