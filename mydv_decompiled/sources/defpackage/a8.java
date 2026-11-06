package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class a8 implements rn1, Serializable {
    public final Object I;
    public final Class J;
    public final String K;
    public final String L;
    public final boolean M = false;
    public final byte N;
    public final int O;

    /* JADX WARN: Multi-variable type inference failed */
    public a8(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.I = obj;
        this.J = cls;
        this.K = str;
        this.L = str2;
        this.N = i;
        this.O = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8)) {
            return false;
        }
        a8 a8Var = (a8) obj;
        return this.M == a8Var.M && this.N == a8Var.N && this.O == a8Var.O && this.I.equals(a8Var.I) && this.J.equals(a8Var.J) && this.K.equals(a8Var.K) && this.L.equals(a8Var.L);
    }

    @Override // defpackage.rn1
    public final int getArity() {
        return this.N;
    }

    public final int hashCode() {
        return ((((hf1.n(hf1.n((this.J.hashCode() + (this.I.hashCode() * 31)) * 31, 31, this.K), 31, this.L) + (this.M ? 1231 : 1237)) * 31) + this.N) * 31) + this.O;
    }

    public final String toString() {
        s24.a.getClass();
        return t24.a(this);
    }
}
