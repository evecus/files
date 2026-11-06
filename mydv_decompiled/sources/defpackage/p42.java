package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class p42 implements ww2, b42 {
    public final /* synthetic */ b42 I;
    public final da2 J;

    public p42(b42 b42Var, da2 da2Var) {
        this.I = b42Var;
        this.J = da2Var;
    }

    @Override // defpackage.ww2
    public final vw2 A(int i, int i2, Map map, tm1 tm1Var) {
        return W(i, i2, map, null, tm1Var);
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
        return this.I.H(f);
    }

    @Override // defpackage.iu0
    public final float L() {
        return this.I.L();
    }

    @Override // defpackage.b42
    public final boolean N() {
        return this.I.N();
    }

    @Override // defpackage.iu0
    public final float P(float f) {
        return this.I.P(f);
    }

    @Override // defpackage.ww2
    public final vw2 W(int i, int i2, Map map, tm1 tm1Var, tm1 tm1Var2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            q02.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new o42(i, i2, map, tm1Var);
    }

    @Override // defpackage.iu0
    public final int X(float f) {
        return this.I.X(f);
    }

    @Override // defpackage.iu0
    public final long c0(long j) {
        return this.I.c0(j);
    }

    @Override // defpackage.iu0
    public final float f0(long j) {
        return this.I.f0(j);
    }

    @Override // defpackage.iu0
    public final float getDensity() {
        return this.I.getDensity();
    }

    @Override // defpackage.b42
    public final da2 getLayoutDirection() {
        return this.J;
    }

    @Override // defpackage.iu0
    public final long k(long j) {
        return this.I.k(j);
    }

    @Override // defpackage.iu0
    public final float q(long j) {
        return this.I.q(j);
    }
}
