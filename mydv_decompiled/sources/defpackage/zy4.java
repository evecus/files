package defpackage;

import java.util.Enumeration;

/* loaded from: classes2.dex */
public final class zy4 extends n0 {
    public p8 I;
    public a0 J;

    public zy4(p8 p8Var, n0 n0Var) {
        u0 t = n0Var.d().t();
        int q = t.q(true) + 1;
        byte[] bArr = new byte[q];
        z zVar = new z(bArr);
        t.p(zVar);
        if (zVar.J != q) {
            zy.i("encoded length did not match actual encoding");
            throw null;
        }
        this.J = new dn0(bArr);
        this.I = p8Var;
    }

    public static zy4 m(Object obj) {
        if (obj instanceof zy4) {
            return (zy4) obj;
        }
        if (obj != null) {
            x0 x = x0.x(obj);
            zy4 zy4Var = new zy4();
            if (x.size() == 2) {
                Enumeration z = x.z();
                zy4Var.I = p8.m(z.nextElement());
                zy4Var.J = a0.x(z.nextElement());
                return zy4Var;
            }
            hn3.g(x.size(), "Bad sequence size: ");
        }
        return null;
    }

    @Override // defpackage.e0
    public final u0 d() {
        return new pn0(this.I, this.J, (byte) 0);
    }
}
