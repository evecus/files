package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* loaded from: classes2.dex */
public final class c04 extends n0 {
    public BigInteger I;
    public BigInteger J;

    public static c04 m(Object obj) {
        if (obj instanceof c04) {
            return (c04) obj;
        }
        if (obj != null) {
            x0 x = x0.x(obj);
            c04 c04Var = new c04();
            if (x.size() == 2) {
                Enumeration z = x.z();
                c04Var.I = l0.v(z.nextElement()).w();
                c04Var.J = l0.v(z.nextElement()).w();
                return c04Var;
            }
            hn3.g(x.size(), "Bad sequence size: ");
        }
        return null;
    }

    @Override // defpackage.e0
    public final u0 d() {
        pn0 pn0Var = new pn0((e0) new l0(this.I), (e0) new l0(this.J), false);
        pn0Var.L = -1;
        return pn0Var;
    }
}
