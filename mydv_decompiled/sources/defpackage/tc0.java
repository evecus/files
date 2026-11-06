package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class tc0 implements hn1, in1, jn1, kn1, ln1, mn1, nn1, on1, sm1, um1, wm1, xm1, ym1, zm1, an1, bn1, cn1, en1, fn1 {
    public final int I;
    public final boolean J;
    public Object K;
    public x04 L;
    public ArrayList M;

    public tc0(int i, Object obj, boolean z) {
        this.I = i;
        this.J = z;
        this.K = obj;
    }

    public final Object a(av avVar, Object obj, Object obj2, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(this.I);
        i(go1Var);
        int C = go1Var.g(this) ? p70.C(2, 3) : p70.C(1, 3);
        Object obj3 = this.K;
        p70.A(5, obj3);
        Object e = ((kn1) obj3).e(avVar, obj, obj2, go1Var, Integer.valueOf(C | i));
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new oc0(this, avVar, obj, obj2, i, (byte) 0);
        }
        return e;
    }

    public final Object b(fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(this.I);
        i(go1Var);
        int C = i | (go1Var.g(this) ? p70.C(2, 0) : p70.C(1, 0));
        Object obj = this.K;
        p70.A(2, obj);
        Object invoke = ((hn1) obj).invoke(go1Var, Integer.valueOf(C));
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new sc0(2, this, tc0.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }
        return invoke;
    }

    @Override // defpackage.jn1
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        return h(obj, obj2, (fe0) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.nn1
    public final /* bridge */ /* synthetic */ Object d(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, go1 go1Var, Integer num) {
        return g(obj, bool, obj2, obj3, obj4, go1Var, num.intValue());
    }

    @Override // defpackage.kn1
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return a((av) obj, obj2, obj3, (fe0) obj4, ((Number) obj5).intValue());
    }

    public final Object f(Object obj, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(this.I);
        i(go1Var);
        int C = go1Var.g(this) ? p70.C(2, 1) : p70.C(1, 1);
        Object obj2 = this.K;
        p70.A(3, obj2);
        Object invoke = ((in1) obj2).invoke(obj, go1Var, Integer.valueOf(C | i));
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new qc0((byte) 0, i, (Object) this, obj);
        }
        return invoke;
    }

    public final Object g(final Object obj, final Boolean bool, final Object obj2, final Object obj3, final Object obj4, fe0 fe0Var, final int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(this.I);
        i(go1Var);
        int C = go1Var.g(this) ? p70.C(2, 6) : p70.C(1, 6);
        Object obj5 = this.K;
        p70.A(8, obj5);
        Object d = ((nn1) obj5).d(obj, bool, obj2, obj3, obj4, go1Var, Integer.valueOf(i | C));
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: rc0
                @Override // defpackage.hn1
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    tc0.this.g(obj, bool, obj2, obj3, obj4, (fe0) obj6, mu0.X(i) | 1);
                    return wd5.a;
                }
            };
        }
        return d;
    }

    public final Object h(Object obj, Object obj2, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(this.I);
        i(go1Var);
        int C = go1Var.g(this) ? p70.C(2, 2) : p70.C(1, 2);
        Object obj3 = this.K;
        p70.A(4, obj3);
        Object c = ((jn1) obj3).c(obj, obj2, go1Var, Integer.valueOf(C | i));
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new pc0((Object) this, obj, obj2, i, (byte) 0);
        }
        return c;
    }

    public final void i(fe0 fe0Var) {
        x04 B;
        if (!this.J || (B = ((go1) fe0Var).B()) == null) {
            return;
        }
        B.b |= 1;
        if (p70.x0(this.L, B)) {
            this.L = B;
            return;
        }
        ArrayList arrayList = this.M;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.M = arrayList2;
            arrayList2.add(B);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (p70.x0((x04) arrayList.get(i), B)) {
                arrayList.set(i, B);
                return;
            }
        }
        arrayList.add(B);
    }

    @Override // defpackage.hn1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b((fe0) obj, ((Number) obj2).intValue());
    }

    @Override // defpackage.in1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return f(obj, (fe0) obj2, ((Number) obj3).intValue());
    }
}
