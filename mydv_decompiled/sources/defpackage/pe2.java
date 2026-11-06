package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pe2 implements ww2 {
    public final le2 I;
    public final wy4 J;
    public final me2 K;
    public final q33 L;

    public pe2(le2 le2Var, wy4 wy4Var) {
        this.I = le2Var;
        this.J = wy4Var;
        this.K = (me2) le2Var.b.invoke();
        q22.a();
        this.L = new q33();
    }

    @Override // defpackage.ww2
    public final vw2 A(int i, int i2, Map map, tm1 tm1Var) {
        return this.J.A(i, i2, map, tm1Var);
    }

    @Override // defpackage.iu0
    public final long B(float f) {
        return this.J.B(f);
    }

    @Override // defpackage.iu0
    public final float F(int i) {
        return this.J.F(i);
    }

    @Override // defpackage.iu0
    public final float H(float f) {
        return this.J.H(f);
    }

    @Override // defpackage.iu0
    public final float L() {
        return this.J.L();
    }

    @Override // defpackage.b42
    public final boolean N() {
        return this.J.N();
    }

    @Override // defpackage.iu0
    public final float P(float f) {
        return this.J.P(f);
    }

    @Override // defpackage.ww2
    public final vw2 W(int i, int i2, Map map, tm1 tm1Var, tm1 tm1Var2) {
        return this.J.W(i, i2, map, tm1Var, tm1Var2);
    }

    @Override // defpackage.iu0
    public final int X(float f) {
        return this.J.X(f);
    }

    public final List a(int i) {
        q33 q33Var = this.L;
        List list = (List) q33Var.b(i);
        if (list != null) {
            return list;
        }
        me2 me2Var = this.K;
        Object c = me2Var.c(i);
        List v = this.J.v(c, this.I.a(i, c, me2Var.d(i)));
        q33Var.i(i, v);
        return v;
    }

    @Override // defpackage.iu0
    public final long c0(long j) {
        return this.J.c0(j);
    }

    @Override // defpackage.iu0
    public final float f0(long j) {
        return this.J.f0(j);
    }

    @Override // defpackage.iu0
    public final float getDensity() {
        return this.J.getDensity();
    }

    @Override // defpackage.b42
    public final da2 getLayoutDirection() {
        return this.J.getLayoutDirection();
    }

    @Override // defpackage.iu0
    public final long k(long j) {
        return this.J.k(j);
    }

    @Override // defpackage.iu0
    public final float q(long j) {
        return this.J.q(j);
    }
}
