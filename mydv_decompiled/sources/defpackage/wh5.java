package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class wh5 extends uh5 {
    public final String I;
    public final List J;
    public final int K;
    public final wy L;
    public final float M;
    public final wy N;
    public final float O;
    public final float P;
    public final int Q;
    public final int R;
    public final float S;
    public final float T;
    public final float U;
    public final float V;

    public wh5(String str, List list, int i, wy wyVar, float f, wy wyVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.I = str;
        this.J = list;
        this.K = i;
        this.L = wyVar;
        this.M = f;
        this.N = wyVar2;
        this.O = f2;
        this.P = f3;
        this.Q = i2;
        this.R = i3;
        this.S = f4;
        this.T = f5;
        this.U = f6;
        this.V = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wh5.class != obj.getClass()) {
            return false;
        }
        wh5 wh5Var = (wh5) obj;
        return this.I.equals(wh5Var.I) && j42.c(this.L, wh5Var.L) && this.M == wh5Var.M && j42.c(this.N, wh5Var.N) && this.O == wh5Var.O && this.P == wh5Var.P && this.Q == wh5Var.Q && this.R == wh5Var.R && this.S == wh5Var.S && this.T == wh5Var.T && this.U == wh5Var.U && this.V == wh5Var.V && this.K == wh5Var.K && j42.c(this.J, wh5Var.J);
    }

    public final int hashCode() {
        int hashCode = (this.J.hashCode() + (this.I.hashCode() * 31)) * 31;
        wy wyVar = this.L;
        int o = jp0.o(this.M, (hashCode + (wyVar != null ? wyVar.hashCode() : 0)) * 31, 31);
        wy wyVar2 = this.N;
        return jp0.o(this.V, jp0.o(this.U, jp0.o(this.T, jp0.o(this.S, (((jp0.o(this.P, jp0.o(this.O, (o + (wyVar2 != null ? wyVar2.hashCode() : 0)) * 31, 31), 31) + this.Q) * 31) + this.R) * 31, 31), 31), 31), 31) + this.K;
    }
}
