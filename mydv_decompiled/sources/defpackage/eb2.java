package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class eb2 implements wy4 {
    public da2 I = da2.J;
    public float J;
    public float K;
    public final /* synthetic */ kb2 L;

    public eb2(kb2 kb2Var) {
        this.L = kb2Var;
    }

    @Override // defpackage.ww2
    public final vw2 A(int i, int i2, Map map, tm1 tm1Var) {
        return W(i, i2, map, null, tm1Var);
    }

    @Override // defpackage.iu0
    public final long B(float f) {
        return hf1.g(H(f), this);
    }

    @Override // defpackage.iu0
    public final float F(int i) {
        return i / getDensity();
    }

    @Override // defpackage.iu0
    public final float H(float f) {
        return f / getDensity();
    }

    @Override // defpackage.iu0
    public final float L() {
        return this.K;
    }

    @Override // defpackage.b42
    public final boolean N() {
        sa2 sa2Var = this.L.I.o0.d;
        return sa2Var == sa2.L || sa2Var == sa2.J;
    }

    @Override // defpackage.iu0
    public final float P(float f) {
        return getDensity() * f;
    }

    @Override // defpackage.ww2
    public final vw2 W(int i, int i2, Map map, tm1 tm1Var, tm1 tm1Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            q02.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new db2(i, i2, map, tm1Var, this, this.L, tm1Var2);
    }

    @Override // defpackage.iu0
    public final /* synthetic */ int X(float f) {
        return r7.b(f, this);
    }

    @Override // defpackage.iu0
    public final /* synthetic */ long c0(long j) {
        return r7.e(j, this);
    }

    @Override // defpackage.iu0
    public final /* synthetic */ float f0(long j) {
        return r7.d(j, this);
    }

    @Override // defpackage.iu0
    public final float getDensity() {
        return this.J;
    }

    @Override // defpackage.b42
    public final da2 getLayoutDirection() {
        return this.I;
    }

    @Override // defpackage.iu0
    public final /* synthetic */ long k(long j) {
        return r7.c(j, this);
    }

    @Override // defpackage.iu0
    public final /* synthetic */ float q(long j) {
        return hf1.f(j, this);
    }

    @Override // defpackage.wy4
    public final List v(Object obj, hn1 hn1Var) {
        kb2 kb2Var = this.L;
        kb2Var.h();
        wa2 wa2Var = kb2Var.I;
        sa2 sa2Var = wa2Var.o0.d;
        sa2 sa2Var2 = sa2.K;
        sa2 sa2Var3 = sa2.I;
        if (sa2Var != sa2Var3 && sa2Var != sa2Var2 && sa2Var != sa2.J && sa2Var != sa2.L) {
            q02.b("subcompose can only be used inside the measure or layout blocks");
        }
        n43 n43Var = kb2Var.O;
        Object g = n43Var.g(obj);
        if (g == null) {
            g = (wa2) kb2Var.R.k(obj);
            if (g != null) {
                if (kb2Var.W <= 0) {
                    q02.b("Check failed.");
                }
                kb2Var.W--;
            } else {
                g = kb2Var.o(obj);
                if (g == null) {
                    int i = kb2Var.L;
                    wa2 wa2Var2 = new wa2(2);
                    wa2Var.Y = true;
                    wa2Var.C(wa2Var2, i);
                    wa2Var.Y = false;
                    g = wa2Var2;
                }
            }
            n43Var.m(obj, g);
        }
        wa2 wa2Var3 = (wa2) g;
        if (o70.V0(kb2Var.L, wa2Var.p()) != wa2Var3) {
            int j = ((a53) wa2Var.p()).I.j(wa2Var3);
            if (j < kb2Var.L) {
                q02.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = kb2Var.L;
            if (i2 != j) {
                kb2Var.k(j, i2);
            }
        }
        kb2Var.L++;
        kb2Var.n(wa2Var3, obj, false, hn1Var);
        return (sa2Var == sa2Var3 || sa2Var == sa2Var2) ? wa2Var3.n() : wa2Var3.m();
    }
}
