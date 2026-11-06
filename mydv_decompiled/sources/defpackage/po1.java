package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class po1 extends n0 implements d0 {
    public final e0 I;
    public final int J;

    public po1(int i, n0 n0Var) {
        this.I = n0Var;
        this.J = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static po1 m(e0 e0Var) {
        ct w;
        if (e0Var == 0 || (e0Var instanceof po1)) {
            return (po1) e0Var;
        }
        if (!(e0Var instanceof ct)) {
            if (!(e0Var instanceof byte[])) {
                s83.t("unknown object in getInstance: ".concat(e0Var.getClass().getName()));
                return null;
            }
            try {
                return m(u0.s((byte[]) e0Var));
            } catch (IOException unused) {
                s83.t("unable to parse encoded general name");
                return null;
            }
        }
        ct ctVar = (ct) e0Var;
        int i = ctVar.K;
        int i2 = ctVar.J;
        if (i2 == 128) {
            y yVar = x0.J;
            int i3 = 0;
            switch (i) {
                case 0:
                case 3:
                    u0 v = ctVar.v(false, yVar);
                    yVar.c(v);
                    return new po1(i, (x0) v);
                case 1:
                case 2:
                case 6:
                    y yVar2 = jn0.J;
                    u0 v2 = ctVar.v(false, yVar2);
                    yVar2.c(v2);
                    return new po1(i, (jn0) v2);
                case 4:
                    ps psVar = sz5.N;
                    u0 v3 = ctVar.v(true, yVar);
                    yVar.c(v3);
                    return new po1(i, sz5.m((x0) v3));
                case 5:
                    u0 v4 = ctVar.v(false, yVar);
                    yVar.c(v4);
                    x0 x0Var = (x0) v4;
                    if (x0Var != null) {
                        x0 x = x0.x(x0Var);
                        int size = x.size();
                        if (size < 1 || size > 2) {
                            s83.t(hf1.u(size, "Bad sequence size: "));
                            return null;
                        }
                        if (size > 0 && (w = ct.w(x.y(0), 0)) != null) {
                            kx0.m(w);
                            i3 = 1;
                        }
                        int i4 = i3 + 1;
                        e0 y = x.y(i3);
                        if (y == null) {
                            zy.m("'obj' cannot be null");
                            return null;
                        }
                        ct y2 = ct.y(y);
                        int i5 = y2.J;
                        int i6 = y2.K;
                        if (i5 != 128 || i6 != 1) {
                            j0.k("Expected ", wx5.i(128, 1), " tag but found ", wx5.i(y2.J, i6));
                            return null;
                        }
                        kx0.m(y2);
                        if (i4 != size) {
                            s83.t("Unexpected elements in sequence");
                            return null;
                        }
                    }
                    return new po1(i, x0Var);
                case 7:
                    y yVar3 = r0.J;
                    u0 v5 = ctVar.v(false, yVar3);
                    yVar3.c(v5);
                    return new po1(i, (r0) v5);
                case 8:
                    y yVar4 = q0.K;
                    u0 v6 = ctVar.v(false, yVar4);
                    yVar4.c(v6);
                    return new po1(i, (q0) v6);
            }
        }
        s83.t("unknown tag: ".concat(wx5.i(i2, i)));
        return null;
    }

    @Override // defpackage.e0
    public final u0 d() {
        int i = this.J;
        return new ct(i == 4, i, this.I, (byte) 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        jn0 jn0Var;
        String sz5Var;
        StringBuilder sb = new StringBuilder();
        int i = this.J;
        sb.append(i);
        sb.append(": ");
        e0 e0Var = this.I;
        if (i != 1 && i != 2) {
            if (i == 4) {
                sz5Var = sz5.m(e0Var).toString();
            } else if (i != 6) {
                sz5Var = e0Var.toString();
            }
            sb.append(sz5Var);
            return sb.toString();
        }
        if (e0Var == 0 || (e0Var instanceof jn0)) {
            jn0Var = (jn0) e0Var;
        } else {
            u0 d = e0Var.d();
            if (d instanceof jn0) {
                jn0Var = (jn0) d;
            } else {
                if (!(e0Var instanceof byte[])) {
                    s83.t("illegal object in getInstance: ".concat(e0Var.getClass().getName()));
                    return null;
                }
                try {
                    u0 s = u0.s((byte[]) e0Var);
                    if (!jn0.class.isInstance(s)) {
                        throw new IllegalArgumentException("unexpected object: ".concat(il2.E(s)));
                    }
                    jn0Var = (jn0) s;
                } catch (Exception e) {
                    j0.h(e);
                    return null;
                }
            }
        }
        sb.append(ix4.a(jn0Var.I));
        return sb.toString();
    }
}
