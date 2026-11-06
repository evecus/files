package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes2.dex */
public final class xc1 extends n0 {
    public Hashtable I;
    public Vector J;

    public static xc1 m(e0 e0Var) {
        hc1 hc1Var;
        c0 c0Var;
        e0 y;
        if (e0Var instanceof xc1) {
            return (xc1) e0Var;
        }
        if (e0Var == null) {
            return null;
        }
        x0 x = x0.x(e0Var);
        xc1 xc1Var = new xc1();
        Hashtable hashtable = new Hashtable();
        xc1Var.I = hashtable;
        xc1Var.J = new Vector();
        Enumeration z = x.z();
        while (z.hasMoreElements()) {
            Object nextElement = z.nextElement();
            q0 q0Var = hc1.L;
            if (nextElement instanceof hc1) {
                hc1Var = (hc1) nextElement;
            } else if (nextElement != null) {
                x0 x2 = x0.x(nextElement);
                hc1 hc1Var2 = new hc1();
                if (x2.size() == 2) {
                    hc1Var2.I = q0.z(x2.y(0));
                    hc1Var2.J = false;
                    y = x2.y(1);
                } else {
                    if (x2.size() != 3) {
                        hn3.g(x2.size(), "Bad sequence size: ");
                        return null;
                    }
                    hc1Var2.I = q0.z(x2.y(0));
                    Object y2 = x2.y(1);
                    if (y2 == null || (y2 instanceof c0)) {
                        c0Var = (c0) y2;
                    } else {
                        if (!(y2 instanceof byte[])) {
                            s83.t("illegal object in getInstance: ".concat(y2.getClass().getName()));
                            return null;
                        }
                        try {
                            u0 s = u0.s((byte[]) y2);
                            if (!c0.class.isInstance(s)) {
                                throw new IllegalArgumentException("unexpected object: ".concat(il2.E(s)));
                            }
                            c0Var = (c0) s;
                        } catch (IOException e) {
                            throw k21.V("failed to construct boolean from byte[]", e);
                        }
                    }
                    hc1Var2.J = c0Var.v();
                    y = x2.y(2);
                }
                hc1Var2.K = r0.v(y);
                hc1Var = hc1Var2;
            } else {
                hc1Var = null;
            }
            q0 q0Var2 = hc1Var.I;
            if (hashtable.containsKey(q0Var2) && !ox3.c("org.bouncycastle.x509.ignore_repeated_extensions")) {
                j0.l(q0Var2, "repeated extension found: ");
                return null;
            }
            hashtable.put(q0Var2, hc1Var);
            xc1Var.J.addElement(q0Var2);
        }
        return xc1Var;
    }

    @Override // defpackage.e0
    public final u0 d() {
        Vector vector = this.J;
        f0 f0Var = new f0(vector.size());
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            f0Var.a((hc1) this.I.get((q0) elements.nextElement()));
        }
        pn0 pn0Var = new pn0(f0Var, (byte) 0);
        pn0Var.L = -1;
        return pn0Var;
    }
}
