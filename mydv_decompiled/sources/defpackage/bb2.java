package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class bb2 implements wy4, ww2 {
    public final /* synthetic */ eb2 I;
    public final /* synthetic */ kb2 J;

    public bb2(kb2 kb2Var) {
        this.J = kb2Var;
        this.I = kb2Var.P;
    }

    @Override // defpackage.ww2
    public final vw2 A(int i, int i2, Map map, tm1 tm1Var) {
        return this.I.W(i, i2, map, null, tm1Var);
    }

    @Override // defpackage.iu0
    public final long B(float f) {
        return this.I.B(f);
    }

    @Override // defpackage.iu0
    public final float F(int i) {
        return this.I.F(i);
    }

    @Override // defpackage.iu0
    public final float H(float f) {
        return f / this.I.getDensity();
    }

    @Override // defpackage.iu0
    public final float L() {
        return this.I.K;
    }

    @Override // defpackage.b42
    public final boolean N() {
        return this.I.N();
    }

    @Override // defpackage.iu0
    public final float P(float f) {
        return this.I.getDensity() * f;
    }

    @Override // defpackage.ww2
    public final vw2 W(int i, int i2, Map map, tm1 tm1Var, tm1 tm1Var2) {
        return this.I.W(i, i2, map, tm1Var, tm1Var2);
    }

    @Override // defpackage.iu0
    public final int X(float f) {
        eb2 eb2Var = this.I;
        eb2Var.getClass();
        return r7.b(f, eb2Var);
    }

    @Override // defpackage.iu0
    public final long c0(long j) {
        eb2 eb2Var = this.I;
        eb2Var.getClass();
        return r7.e(j, eb2Var);
    }

    @Override // defpackage.iu0
    public final float f0(long j) {
        eb2 eb2Var = this.I;
        eb2Var.getClass();
        return r7.d(j, eb2Var);
    }

    @Override // defpackage.iu0
    public final float getDensity() {
        return this.I.J;
    }

    @Override // defpackage.b42
    public final da2 getLayoutDirection() {
        return this.I.I;
    }

    @Override // defpackage.iu0
    public final long k(long j) {
        eb2 eb2Var = this.I;
        eb2Var.getClass();
        return r7.c(j, eb2Var);
    }

    @Override // defpackage.iu0
    public final float q(long j) {
        eb2 eb2Var = this.I;
        eb2Var.getClass();
        return hf1.f(j, eb2Var);
    }

    @Override // defpackage.wy4
    public final List v(Object obj, hn1 hn1Var) {
        kb2 kb2Var = this.J;
        wa2 wa2Var = kb2Var.I;
        n43 n43Var = kb2Var.O;
        wa2 wa2Var2 = (wa2) n43Var.g(obj);
        if (wa2Var2 != null && ((a53) wa2Var.p()).I.j(wa2Var2) < kb2Var.L) {
            return wa2Var2.n();
        }
        n43 n43Var2 = kb2Var.T;
        n43 n43Var3 = kb2Var.R;
        b53 b53Var = kb2Var.U;
        if (b53Var.K < kb2Var.M) {
            q02.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        wa2 wa2Var3 = (wa2) n43Var.g(obj);
        int i = b53Var.K;
        int i2 = kb2Var.M;
        if (i == i2) {
            b53Var.c(obj);
        } else {
            Object[] objArr = b53Var.I;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        kb2Var.M++;
        boolean b = n43Var3.b(obj);
        if (b || wa2Var3 != null) {
            if (!b && wa2Var3 != null) {
                kb2Var.k(((a53) wa2Var.p()).I.j(wa2Var3), ((a53) wa2Var.p()).I.K);
                kb2Var.W++;
                n43Var.k(obj);
                n43Var3.m(obj, wa2Var3);
                n43Var2.m(obj, kb2Var.e(obj));
                if (wa2Var.K()) {
                    kb2Var.h();
                }
            }
            wa2 wa2Var4 = (wa2) n43Var3.g(obj);
            cb2 cb2Var = wa2Var4 != null ? (cb2) kb2Var.N.g(wa2Var4) : null;
            if (cb2Var != null && cb2Var.d) {
                kb2Var.n(wa2Var4, obj, false, hn1Var);
            }
            if ((cb2Var != null ? cb2Var.f : null) != null) {
                kb2Var.a(cb2Var, true);
            }
        } else {
            kb2Var.l(obj, hn1Var, false);
            n43Var2.m(obj, kb2Var.e(obj));
        }
        wa2 wa2Var5 = (wa2) n43Var3.g(obj);
        if (wa2Var5 == null) {
            return o91.I;
        }
        List j0 = wa2Var5.o0.p.j0();
        a53 a53Var = (a53) j0;
        int i3 = a53Var.I.K;
        for (int i4 = 0; i4 < i3; i4++) {
            ((tw2) a53Var.get(i4)).N.b = true;
        }
        return j0;
    }
}
