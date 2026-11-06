package defpackage;

import androidx.media3.extractor.ts.PsExtractor;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ct extends u0 implements uy1 {
    public final int I;
    public final int J;
    public final int K;
    public final e0 L;
    public final /* synthetic */ byte M;

    public ct(int i, int i2, int i3, e0 e0Var) {
        if (e0Var == null) {
            zy.m("'obj' cannot be null");
            throw null;
        }
        if (i2 == 0 || (i2 & PsExtractor.AUDIO_STREAM) != i2) {
            s83.t(hf1.u(i2, "invalid tag class: "));
            throw null;
        }
        this.I = e0Var instanceof d0 ? 1 : i;
        this.J = i2;
        this.K = i3;
        this.L = e0Var;
    }

    public static ct w(e0 e0Var, int i) {
        if (e0Var == null) {
            zy.m("'element' cannot be null");
            return null;
        }
        ct ctVar = e0Var instanceof ct ? (ct) e0Var : null;
        if (ctVar != null && ctVar.J == 128 && ctVar.K == i) {
            return ctVar;
        }
        return null;
    }

    public static ct y(Object obj) {
        if (obj == null || (obj instanceof ct)) {
            return (ct) obj;
        }
        if (obj instanceof e0) {
            u0 d = ((e0) obj).d();
            if (d instanceof ct) {
                return (ct) d;
            }
        } else if (obj instanceof byte[]) {
            try {
                u0 s = u0.s((byte[]) obj);
                if (s instanceof ct) {
                    return (ct) s;
                }
                throw new IllegalArgumentException("unexpected object: ".concat(il2.E(s)));
            } catch (IOException e) {
                throw k21.V("failed to construct tagged object from byte[]", e);
            }
        }
        s83.t("unknown object in getInstance: ".concat(obj.getClass().getName()));
        return null;
    }

    @Override // defpackage.u0, defpackage.n0
    public final int hashCode() {
        return this.L.d().hashCode() ^ (((this.J * 7919) ^ this.K) ^ (z() ? 15 : PsExtractor.VIDEO_STREAM_MASK));
    }

    @Override // defpackage.u0
    public final boolean m(u0 u0Var) {
        if (!(u0Var instanceof ct)) {
            return false;
        }
        ct ctVar = (ct) u0Var;
        if (this.K != ctVar.K || this.J != ctVar.J) {
            return false;
        }
        if (this.I != ctVar.I && z() != ctVar.z()) {
            return false;
        }
        u0 d = this.L.d();
        u0 d2 = ctVar.L.d();
        if (d == d2) {
            return true;
        }
        if (z()) {
            return d.m(d2);
        }
        try {
            return Arrays.equals(l(), ctVar.l());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        byte b = this.M;
        int i = this.K;
        int i2 = this.J;
        e0 e0Var = this.L;
        switch (b) {
            case 0:
                u0 d = e0Var.d();
                boolean z2 = z();
                if (z) {
                    if (z2 || d.o()) {
                        i2 |= 32;
                    }
                    uu2Var.T(i2, i);
                }
                if (!z2) {
                    d.n(uu2Var, false);
                    break;
                } else {
                    uu2Var.K(128);
                    d.n(uu2Var, true);
                    uu2Var.K(0);
                    uu2Var.K(0);
                    break;
                }
                break;
            case 1:
                u0 t = e0Var.d().t();
                boolean z3 = z();
                if (z) {
                    if (z3 || t.o()) {
                        i2 |= 32;
                    }
                    uu2Var.T(i2, i);
                }
                if (z3) {
                    uu2Var.N(t.q(true));
                }
                t.n(uu2Var.w(), z3);
                break;
            default:
                u0 u = e0Var.d().u();
                boolean z4 = z();
                if (z) {
                    if (z4 || u.o()) {
                        i2 |= 32;
                    }
                    uu2Var.T(i2, i);
                }
                if (z4) {
                    uu2Var.N(u.q(true));
                }
                u.n(uu2Var.x(), z4);
                break;
        }
    }

    @Override // defpackage.u0
    public final boolean o() {
        byte b = this.M;
        e0 e0Var = this.L;
        switch (b) {
            case 0:
                if (!z() && !e0Var.d().o()) {
                    break;
                }
                break;
            case 1:
                if (!z() && !e0Var.d().t().o()) {
                    break;
                }
                break;
            default:
                if (!z() && !e0Var.d().u().o()) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // defpackage.u0
    public final int q(boolean z) {
        byte b = this.M;
        int i = this.K;
        e0 e0Var = this.L;
        switch (b) {
            case 0:
                u0 d = e0Var.d();
                boolean z2 = z();
                int q = d.q(z2);
                if (z2) {
                    q += 3;
                }
                return q + (z ? uu2.A(i) : 0);
            case 1:
                u0 t = e0Var.d().t();
                boolean z3 = z();
                int q2 = t.q(z3);
                if (z3) {
                    q2 += uu2.y(q2);
                }
                return q2 + (z ? uu2.A(i) : 0);
            default:
                u0 u = e0Var.d().u();
                boolean z4 = z();
                int q3 = u.q(z4);
                if (z4) {
                    q3 += uu2.y(q3);
                }
                return q3 + (z ? uu2.A(i) : 0);
        }
    }

    @Override // defpackage.u0
    public u0 t() {
        switch (this.M) {
            case 1:
                return this;
            default:
                return new ct(this.I, this.J, this.K, this.L, (byte) 1);
        }
    }

    public final String toString() {
        return wx5.i(this.J, this.K) + this.L;
    }

    @Override // defpackage.u0
    public u0 u() {
        switch (this.M) {
            case 1:
            case 2:
                return this;
            default:
                return new ct(this.I, this.J, this.K, this.L, (byte) 2);
        }
    }

    public final u0 v(boolean z, d1 d1Var) {
        String str;
        x0 x0Var;
        e0 e0Var = this.L;
        if (!z) {
            int i = this.I;
            if (1 != i) {
                u0 d = e0Var.d();
                if (i != 3) {
                    if (i == 4) {
                        return d instanceof x0 ? d1Var.h((x0) d) : d1Var.i((mn0) d);
                    }
                    if (((Class) d1Var.b).isInstance(d)) {
                        return d;
                    }
                    zy.i("unexpected explicit encoding");
                    return null;
                }
                switch (this.M) {
                    case 0:
                        x0Var = new zs(d);
                        break;
                    case 1:
                        pn0 pn0Var = new pn0(d, (byte) 0);
                        pn0Var.L = -1;
                        x0Var = pn0Var;
                        break;
                    default:
                        x0Var = new pn0(d, (byte) 1);
                        break;
                }
                return d1Var.h(x0Var);
            }
            str = "object explicit - implicit expected.";
        } else {
            if (z()) {
                u0 d2 = e0Var.d();
                if (((Class) d1Var.b).isInstance(d2)) {
                    return d2;
                }
                zy.i("unexpected explicit encoding");
                return null;
            }
            str = "object implicit - explicit expected.";
        }
        zy.i(str);
        return null;
    }

    public final n0 x() {
        if (z()) {
            e0 e0Var = this.L;
            return e0Var instanceof n0 ? (n0) e0Var : e0Var.d();
        }
        zy.i("object implicit - explicit expected.");
        return null;
    }

    public final boolean z() {
        int i = this.I;
        return i == 1 || i == 3;
    }

    @Override // defpackage.uy1
    public final u0 j() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ct(int i, int i2, int i3, e0 e0Var, byte b) {
        this(i, i2, i3, e0Var);
        this.M = b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ct(boolean z, int i, e0 e0Var, byte b) {
        this(z ? 1 : 2, 128, i, e0Var);
        this.M = b;
    }
}
