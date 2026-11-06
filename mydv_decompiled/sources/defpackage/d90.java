package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class d90 implements tm1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ d90(h90 h90Var) {
        this.I = (byte) 23;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        double d;
        double d2;
        double d3;
        double d4;
        byte b = this.I;
        double d5 = 90.0d;
        fh5 fh5Var = fh5.I;
        p90 p90Var = aw2.a;
        k51 k51Var = (k51) obj;
        switch (b) {
            case 0:
                k51Var.getClass();
                return new lj0(3.0d, 4.5d, 7.0d, 11.0d);
            case 1:
                k51Var.getClass();
                return k51Var.h;
            case 2:
                k51Var.getClass();
                if (k51Var.c) {
                    double d6 = k51Var.d;
                    d = 24.0d;
                    if (d6 > -1.0d) {
                        if (d6 < 0.0d) {
                            d2 = (d6 - (-1.0d)) / 1.0d;
                            d3 = (1.0d - d2) * 24.0d;
                        } else if (d6 < 0.5d) {
                            double d7 = (d6 - 0.0d) / 0.5d;
                            d3 = (1.0d - d7) * 24.0d;
                            d4 = d7 * 29.0d;
                            d = d4 + d3;
                        } else {
                            d = 34.0d;
                            if (d6 < 1.0d) {
                                d2 = (d6 - 0.5d) / 0.5d;
                                d3 = (1.0d - d2) * 29.0d;
                            }
                        }
                        d4 = d2 * d;
                        d = d4 + d3;
                    }
                } else {
                    d = 98.0d;
                }
                return Double.valueOf(d);
            case 3:
                k51Var.getClass();
                return k51Var.g;
            case 4:
                k51Var.getClass();
                return Double.valueOf(k51Var.b == fh5Var ? 100.0d : 10.0d);
            case 5:
                k51Var.getClass();
                return p90Var.B();
            case 6:
                k51Var.getClass();
                return k51Var.f;
            case 7:
                k51Var.getClass();
                return p90Var.A();
            case 8:
                k51Var.getClass();
                return new lj0(4.5d, 7.0d, 11.0d, 21.0d);
            case 9:
                k51Var.getClass();
                return k51Var.g;
            case 10:
                k51Var.getClass();
                fh5 fh5Var2 = k51Var.b;
                boolean z = k51Var.c;
                if (fh5Var2 != fh5Var) {
                    d5 = z ? 20.0d : 100.0d;
                } else if (z) {
                    d5 = 10.0d;
                }
                return Double.valueOf(d5);
            case 11:
                k51Var.getClass();
                return p90Var.y();
            case 12:
                k51Var.getClass();
                return new lj0(4.5d, 7.0d, 11.0d, 21.0d);
            case 13:
                k51Var.getClass();
                return k51Var.i;
            case 14:
                k51Var.getClass();
                return Double.valueOf(k51Var.c ? 80.0d : 30.0d);
            case 15:
                k51Var.getClass();
                return new lj0(3.0d, 4.5d, 7.0d, 11.0d);
            case 16:
                k51Var.getClass();
                return k51Var.e;
            case 17:
                k51Var.getClass();
                return Double.valueOf(k51Var.c ? 80.0d : 40.0d);
            case 18:
                k51Var.getClass();
                return Double.valueOf(k51Var.b == fh5Var ? 100.0d : 10.0d);
            case 19:
                k51Var.getClass();
                return p90Var.r();
            case 20:
                k51Var.getClass();
                return p90Var.q();
            case 21:
                k51Var.getClass();
                return new lj0(4.5d, 7.0d, 11.0d, 21.0d);
            case 22:
                k51Var.getClass();
                return k51Var.g;
            case 23:
                k51Var.getClass();
                boolean z2 = k51Var.c;
                if (k51Var.b == fh5Var) {
                    d5 = z2 ? 60.0d : 49.0d;
                } else if (h90.n(k51Var)) {
                    d5 = rt0.s(k51Var.g.a(k51Var.a.d)).d;
                } else if (z2) {
                    d5 = 30.0d;
                }
                return Double.valueOf(d5);
            case 24:
                k51Var.getClass();
                return new lj0(1.0d, 1.0d, 3.0d, 4.5d);
            case 25:
                k51Var.getClass();
                return new lj0(3.0d, 4.5d, 7.0d, 7.0d);
            case 26:
                k51Var.getClass();
                return k51Var.i;
            case 27:
                k51Var.getClass();
                return Double.valueOf(k51Var.c ? 30.0d : 80.0d);
            case 28:
                k51Var.getClass();
                return Double.valueOf(0.0d);
            default:
                k51Var.getClass();
                return new lj0(1.0d, 1.0d, 3.0d, 4.5d);
        }
    }

    public /* synthetic */ d90(byte b) {
        this.I = b;
    }
}
