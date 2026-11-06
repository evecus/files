package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.Enumeration;

/* loaded from: classes2.dex */
public final class qt3 extends n0 {
    public l0 I;
    public p8 J;
    public r0 K;
    public z0 L;
    public a0 M;

    public qt3(p8 p8Var, n0 n0Var) {
        u0 d = n0Var.d();
        d.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d.p(byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.I = new l0(zv.a);
        this.J = p8Var;
        this.K = new mn0(byteArray);
        this.L = null;
        this.M = null;
    }

    public static qt3 m(Object obj) {
        if (obj instanceof qt3) {
            return (qt3) obj;
        }
        if (obj != null) {
            x0 x = x0.x(obj);
            qt3 qt3Var = new qt3();
            Enumeration z = x.z();
            l0 v = l0.v(z.nextElement());
            qt3Var.I = v;
            int A = v.A();
            if (A >= 0 && A <= 1) {
                qt3Var.J = p8.m(z.nextElement());
                qt3Var.K = r0.v(z.nextElement());
                int i = -1;
                while (z.hasMoreElements()) {
                    ct ctVar = (ct) z.nextElement();
                    int i2 = ctVar.K;
                    if (i2 <= i) {
                        s83.t("invalid optional field in private key info");
                        return null;
                    }
                    if (i2 == 0) {
                        wx5.f(ctVar);
                        y yVar = z0.K;
                        u0 v2 = ctVar.v(false, yVar);
                        yVar.c(v2);
                        qt3Var.L = (z0) v2;
                    } else {
                        if (i2 != 1) {
                            s83.t("unknown optional field in private key info");
                            return null;
                        }
                        if (A < 1) {
                            s83.t("'publicKey' requires version v2(1) or later");
                            return null;
                        }
                        wx5.f(ctVar);
                        y yVar2 = a0.J;
                        u0 v3 = ctVar.v(false, yVar2);
                        yVar2.c(v3);
                        qt3Var.M = (a0) v3;
                    }
                    i = i2;
                }
                return qt3Var;
            }
            s83.t("invalid version for private key info");
        }
        return null;
    }

    @Override // defpackage.e0
    public final u0 d() {
        f0 f0Var = new f0(5);
        f0Var.a(this.I);
        f0Var.a(this.J);
        f0Var.a(this.K);
        z0 z0Var = this.L;
        int i = 2;
        int i2 = 128;
        if (z0Var != null) {
            f0Var.a(new ct(i, i2, 0, z0Var, (byte) 1));
        }
        a0 a0Var = this.M;
        if (a0Var != null) {
            f0Var.a(new ct(i, i2, 1, a0Var, (byte) 1));
        }
        pn0 pn0Var = new pn0(f0Var, (byte) 0);
        pn0Var.L = -1;
        return pn0Var;
    }

    public final r0 n() {
        return new mn0(this.K.I);
    }

    public final u0 o() {
        return u0.s(this.K.I);
    }
}
