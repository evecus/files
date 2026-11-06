package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sh5 extends uh5 implements Iterable, w72 {
    public final String I;
    public final float J;
    public final float K;
    public final float L;
    public final float M;
    public final float N;
    public final float O;
    public final float P;
    public final List Q;
    public final ArrayList R;

    public sh5(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.I = str;
        this.J = f;
        this.K = f2;
        this.L = f3;
        this.M = f4;
        this.N = f5;
        this.O = f6;
        this.P = f7;
        this.Q = list;
        this.R = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof sh5)) {
            return false;
        }
        sh5 sh5Var = (sh5) obj;
        return j42.c(this.I, sh5Var.I) && this.J == sh5Var.J && this.K == sh5Var.K && this.L == sh5Var.L && this.M == sh5Var.M && this.N == sh5Var.N && this.O == sh5Var.O && this.P == sh5Var.P && j42.c(this.Q, sh5Var.Q) && this.R.equals(sh5Var.R);
    }

    public final int hashCode() {
        return this.R.hashCode() + ((this.Q.hashCode() + jp0.o(this.P, jp0.o(this.O, jp0.o(this.N, jp0.o(this.M, jp0.o(this.L, jp0.o(this.K, jp0.o(this.J, this.I.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new q70(this);
    }
}
