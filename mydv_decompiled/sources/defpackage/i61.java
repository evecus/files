package defpackage;

/* loaded from: classes2.dex */
public final class i61 extends n0 {
    public final x0 I;

    public i61(x0 x0Var) {
        this.I = x0Var;
    }

    public static i61 m(u0 u0Var) {
        if (u0Var != null) {
            return new i61(x0.x(u0Var));
        }
        return null;
    }

    @Override // defpackage.e0
    public final u0 d() {
        return this.I;
    }

    public final u0 n(int i, int i2) {
        y yVar;
        x0 x0Var = this.I;
        int size = x0Var.size();
        for (int i3 = 0; i3 < size; i3++) {
            ct w = ct.w(x0Var.y(i3), i);
            if (w != null) {
                if (i2 < 0) {
                    return w.x().d();
                }
                switch (i2) {
                    case 1:
                        yVar = c0.J;
                        break;
                    case 2:
                        yVar = l0.K;
                        break;
                    case 3:
                        yVar = a0.J;
                        break;
                    case 4:
                        yVar = r0.J;
                        break;
                    case 5:
                        yVar = m0.I;
                        break;
                    case 6:
                        yVar = q0.K;
                        break;
                    case 7:
                        yVar = o0.J;
                        break;
                    case 8:
                        yVar = fn0.O;
                        break;
                    case 9:
                    case 11:
                    case 14:
                    case 15:
                    case 29:
                    default:
                        yVar = null;
                        break;
                    case 10:
                        yVar = g0.J;
                        break;
                    case 12:
                        yVar = sn0.J;
                        break;
                    case 13:
                        yVar = v0.K;
                        break;
                    case 16:
                        yVar = x0.J;
                        break;
                    case 17:
                        yVar = z0.K;
                        break;
                    case 18:
                        yVar = ln0.J;
                        break;
                    case 19:
                        yVar = on0.J;
                        break;
                    case 20:
                        yVar = rn0.J;
                        break;
                    case 21:
                        yVar = un0.J;
                        break;
                    case 22:
                        yVar = jn0.J;
                        break;
                    case 23:
                        yVar = c1.J;
                        break;
                    case 24:
                        yVar = i0.J;
                        break;
                    case 25:
                        yVar = in0.J;
                        break;
                    case 26:
                        yVar = vn0.J;
                        break;
                    case 27:
                        yVar = gn0.J;
                        break;
                    case 28:
                        yVar = tn0.J;
                        break;
                    case 30:
                        yVar = cn0.J;
                        break;
                }
                if (yVar != null) {
                    return w.v(true, yVar);
                }
                s83.t(hf1.u(i2, "unsupported UNIVERSAL tag number: "));
                return null;
            }
        }
        return null;
    }
}
