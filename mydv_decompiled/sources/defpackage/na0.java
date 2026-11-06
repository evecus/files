package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class na0 implements tk0, Serializable {
    public final tk0 I;
    public final rk0 J;

    public na0(rk0 rk0Var, tk0 tk0Var) {
        tk0Var.getClass();
        this.I = tk0Var;
        this.J = rk0Var;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof na0) {
            na0 na0Var = (na0) obj;
            int i = 2;
            na0 na0Var2 = na0Var;
            int i2 = 2;
            while (true) {
                tk0 tk0Var = na0Var2.I;
                na0Var2 = tk0Var instanceof na0 ? (na0) tk0Var : null;
                if (na0Var2 == null) {
                    break;
                }
                i2++;
            }
            na0 na0Var3 = this;
            while (true) {
                tk0 tk0Var2 = na0Var3.I;
                na0Var3 = tk0Var2 instanceof na0 ? (na0) tk0Var2 : null;
                if (na0Var3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    rk0 rk0Var = this.J;
                    if (!j42.c(na0Var.get(rk0Var.getKey()), rk0Var)) {
                        z = false;
                        break;
                    }
                    tk0 tk0Var3 = this.I;
                    if (!(tk0Var3 instanceof na0)) {
                        tk0Var3.getClass();
                        rk0 rk0Var2 = (rk0) tk0Var3;
                        z = j42.c(na0Var.get(rk0Var2.getKey()), rk0Var2);
                        break;
                    }
                    this = (na0) tk0Var3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.tk0
    public final Object fold(Object obj, hn1 hn1Var) {
        hn1Var.getClass();
        return hn1Var.invoke(this.I.fold(obj, hn1Var), this.J);
    }

    @Override // defpackage.tk0
    public final rk0 get(sk0 sk0Var) {
        sk0Var.getClass();
        while (true) {
            rk0 rk0Var = this.J.get(sk0Var);
            if (rk0Var != null) {
                return rk0Var;
            }
            tk0 tk0Var = this.I;
            if (!(tk0Var instanceof na0)) {
                return tk0Var.get(sk0Var);
            }
            this = (na0) tk0Var;
        }
    }

    public final int hashCode() {
        return this.J.hashCode() + this.I.hashCode();
    }

    @Override // defpackage.tk0
    public final tk0 minusKey(sk0 sk0Var) {
        sk0Var.getClass();
        rk0 rk0Var = this.J;
        rk0 rk0Var2 = rk0Var.get(sk0Var);
        tk0 tk0Var = this.I;
        if (rk0Var2 != null) {
            return tk0Var;
        }
        tk0 minusKey = tk0Var.minusKey(sk0Var);
        return minusKey == tk0Var ? this : minusKey == l91.I ? rk0Var : new na0(rk0Var, minusKey);
    }

    @Override // defpackage.tk0
    public final tk0 plus(tk0 tk0Var) {
        tk0Var.getClass();
        return tk0Var == l91.I ? this : (tk0) tk0Var.fold(this, new sg((byte) 17));
    }

    public final String toString() {
        return "[" + ((String) fold("", new bd0((byte) 15))) + ']';
    }
}
