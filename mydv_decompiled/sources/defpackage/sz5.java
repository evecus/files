package defpackage;

import java.util.Hashtable;

/* loaded from: classes2.dex */
public final class sz5 extends n0 implements d0 {
    public static final ps N = ps.V;
    public boolean I;
    public int J;
    public eu5 K;
    public rz3[] L;
    public pn0 M;

    public static sz5 m(Object obj) {
        rz3 rz3Var;
        z0 z0Var;
        if (obj instanceof sz5) {
            return (sz5) obj;
        }
        if (obj == null) {
            return null;
        }
        x0 x = x0.x(obj);
        sz5 sz5Var = new sz5();
        int size = x.size();
        sz5Var.K = N;
        sz5Var.L = new rz3[size];
        boolean z = true;
        for (int i = 0; i < size; i++) {
            e0 y = x.y(i);
            if (y instanceof rz3) {
                rz3Var = (rz3) y;
            } else if (y != null) {
                if (y instanceof z0) {
                    z0Var = (z0) y;
                } else {
                    u0 d = y.d();
                    if (!(d instanceof z0)) {
                        s83.t("unknown object in getInstance: ".concat(y.getClass().getName()));
                        return null;
                    }
                    z0Var = (z0) d;
                }
                rz3Var = new rz3();
                rz3Var.I = z0Var;
            } else {
                rz3Var = null;
            }
            z &= rz3Var == y;
            sz5Var.L[i] = rz3Var;
        }
        sz5Var.M = z ? (pn0) x.t() : new pn0(sz5Var.L, (byte) 0);
        return sz5Var;
    }

    @Override // defpackage.e0
    public final u0 d() {
        return this.M;
    }

    @Override // defpackage.n0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sz5) && !(obj instanceof x0)) {
            return false;
        }
        if (this.M.r(((e0) obj).d())) {
            return true;
        }
        try {
            eu5 eu5Var = this.K;
            sz5 m = m(obj);
            eu5Var.getClass();
            return eu5.y(this, m);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.n0
    public final int hashCode() {
        if (this.I) {
            return this.J;
        }
        this.K.getClass();
        rz3[] rz3VarArr = (rz3[]) this.L.clone();
        int i = 0;
        for (int i2 = 0; i2 != rz3VarArr.length; i2++) {
            rz3 rz3Var = rz3VarArr[i2];
            if (rz3Var.I.I.length > 1) {
                dr[] n = rz3Var.n();
                for (int i3 = 0; i3 != n.length; i3++) {
                    i = (i ^ g4.N(n[i3].I.I)) ^ e21.l(n[i3].J).hashCode();
                }
            } else {
                dr m = rz3Var.m();
                if (m != null) {
                    i = (i ^ g4.N(m.I.I)) ^ e21.l(m.J).hashCode();
                }
            }
        }
        this.J = i;
        this.I = true;
        return i;
    }

    public final String toString() {
        ps psVar = (ps) this.K;
        psVar.getClass();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (rz3 rz3Var : (rz3[]) this.L.clone()) {
            if (z) {
                z = false;
            } else {
                sb.append(',');
            }
            Hashtable hashtable = psVar.S;
            if (rz3Var.I.I.length > 1) {
                dr[] n = rz3Var.n();
                boolean z2 = true;
                for (int i = 0; i != n.length; i++) {
                    if (z2) {
                        z2 = false;
                    } else {
                        sb.append('+');
                    }
                    e21.i(sb, n[i], hashtable);
                }
            } else {
                dr m = rz3Var.m();
                if (m != null) {
                    e21.i(sb, m, hashtable);
                }
            }
        }
        return sb.toString();
    }
}
