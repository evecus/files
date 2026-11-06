package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class g90 implements tm1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ g90(h90 h90Var) {
        this.I = (byte) 16;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        double t;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        byte b = this.I;
        fh5 fh5Var = fh5.I;
        double d6 = 30.0d;
        j51 j51Var = j51.K;
        p90 p90Var = aw2.a;
        switch (b) {
            case 0:
                k51 k51Var = (k51) obj;
                k51Var.getClass();
                return k51Var.f;
            case 1:
                k51 k51Var2 = (k51) obj;
                k51Var2.getClass();
                boolean z = k51Var2.c;
                if (k51Var2.b == fh5Var) {
                    if (!z) {
                        t = 10.0d;
                        return Double.valueOf(t);
                    }
                    t = 90.0d;
                    return Double.valueOf(t);
                }
                if (h90.n(k51Var2)) {
                    t = rt0.t(((Number) p90Var.t().c.invoke(k51Var2)).doubleValue(), 4.5d);
                } else {
                    if (!z) {
                        t = 30.0d;
                    }
                    t = 90.0d;
                }
                return Double.valueOf(t);
            case 2:
                ((k51) obj).getClass();
                return p90Var.t();
            case 3:
                ((k51) obj).getClass();
                return new lj0(3.0d, 4.5d, 7.0d, 11.0d);
            case 4:
                k51 k51Var3 = (k51) obj;
                k51Var3.getClass();
                return k51Var3.e;
            case 5:
                k51 k51Var4 = (k51) obj;
                k51Var4.getClass();
                return Double.valueOf(k51Var4.c ? 40.0d : 80.0d);
            case 6:
                ((k51) obj).getClass();
                return p90Var.m();
            case 7:
                ((k51) obj).getClass();
                return new lj0(3.0d, 4.5d, 7.0d, 7.0d);
            case 8:
                k51 k51Var5 = (k51) obj;
                k51Var5.getClass();
                return k51Var5.f;
            case 9:
                k51 k51Var6 = (k51) obj;
                k51Var6.getClass();
                return k51Var6.h;
            case 10:
                k51 k51Var7 = (k51) obj;
                k51Var7.getClass();
                fh5 fh5Var2 = k51Var7.b;
                boolean z2 = k51Var7.c;
                if (fh5Var2 == fh5Var) {
                    if (z2) {
                        d = 10.0d;
                    }
                    d = 100.0d;
                } else {
                    if (z2) {
                        d = 20.0d;
                    }
                    d = 100.0d;
                }
                return Double.valueOf(d);
            case 11:
                ((k51) obj).getClass();
                return p90Var.s();
            case 12:
                ((k51) obj).getClass();
                return new lj0(4.5d, 7.0d, 11.0d, 21.0d);
            case 13:
                k51 k51Var8 = (k51) obj;
                k51Var8.getClass();
                return k51Var8.h;
            case 14:
                k51 k51Var9 = (k51) obj;
                k51Var9.getClass();
                double d7 = k51Var9.d;
                if (k51Var9.c) {
                    r3 = 22.0d;
                    if (d7 > -1.0d) {
                        if (d7 < 0.0d) {
                            double d8 = (d7 - (-1.0d)) / 1.0d;
                            d4 = (1.0d - d8) * 22.0d;
                            d5 = d8 * 22.0d;
                        } else {
                            if (d7 >= 0.5d) {
                                if (d7 < 1.0d) {
                                    double d9 = (d7 - 0.5d) / 0.5d;
                                    d4 = (1.0d - d9) * 26.0d;
                                    d5 = d9 * 30.0d;
                                }
                                return Double.valueOf(d6);
                            }
                            double d10 = (d7 - 0.0d) / 0.5d;
                            d4 = (1.0d - d10) * 22.0d;
                            d5 = d10 * 26.0d;
                        }
                        d6 = d5 + d4;
                        return Double.valueOf(d6);
                    }
                } else if (d7 <= -1.0d) {
                    r3 = 90.0d;
                } else {
                    if (d7 < 0.0d) {
                        double d11 = (d7 - (-1.0d)) / 1.0d;
                        d2 = (1.0d - d11) * 90.0d;
                        d3 = d11 * 90.0d;
                    } else if (d7 < 0.5d) {
                        double d12 = (d7 - 0.0d) / 0.5d;
                        d2 = (1.0d - d12) * 90.0d;
                        d3 = d12 * 84.0d;
                    } else if (d7 < 1.0d) {
                        double d13 = (d7 - 0.5d) / 0.5d;
                        d2 = (1.0d - d13) * 84.0d;
                        d3 = d13 * 80.0d;
                    }
                    r3 = d3 + d2;
                }
                d6 = r3;
                return Double.valueOf(d6);
            case 15:
                k51 k51Var10 = (k51) obj;
                k51Var10.getClass();
                return k51Var10.f;
            case 16:
                k51 k51Var11 = (k51) obj;
                k51Var11.getClass();
                boolean z3 = k51Var11.c;
                double d14 = z3 ? 30.0d : 90.0d;
                if (k51Var11.b != fh5Var) {
                    if (h90.n(k51Var11)) {
                        k85 k85Var = k51Var11.f;
                        double d15 = k85Var.a;
                        double d16 = k85Var.b;
                        zs1 zs1Var = new zs1(o7.Q(d15, d16, d14));
                        double d17 = zs1Var.c;
                        if (d17 < d16) {
                            d6 = d14;
                            while (true) {
                                double d18 = zs1Var.c;
                                if (d18 < d16) {
                                    d6 += !z3 ? -1.0d : 1.0d;
                                    zs1 zs1Var2 = new zs1(o7.Q(d15, d16, d6));
                                    double d19 = zs1Var2.c;
                                    if (d17 <= d19) {
                                        double d20 = d19 - d16;
                                        if (Math.abs(d20) >= 0.4d) {
                                            if (Math.abs(d20) < Math.abs(d18 - d16)) {
                                                zs1Var = zs1Var2;
                                            }
                                            d17 = Math.max(d17, d19);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    d6 = d14;
                } else if (!z3) {
                    d6 = 85.0d;
                }
                return Double.valueOf(d6);
            case 17:
                ((k51) obj).getClass();
                return new lj0(1.0d, 1.0d, 3.0d, 4.5d);
            case 18:
                k51 k51Var12 = (k51) obj;
                k51Var12.getClass();
                return k51Var12.h;
            case 19:
                k51 k51Var13 = (k51) obj;
                k51Var13.getClass();
                return Double.valueOf(k51Var13.c ? 90.0d : 20.0d);
            case 20:
                k51 k51Var14 = (k51) obj;
                k51Var14.getClass();
                return k51Var14.k;
            case 21:
                k51 k51Var15 = (k51) obj;
                k51Var15.getClass();
                if (k51Var15.j != j51Var || k51Var15.d <= 0.0d) {
                    return null;
                }
                return jp.j(1.5d);
            case 22:
                k51 k51Var16 = (k51) obj;
                k51Var16.getClass();
                return k51Var16.g;
            case 23:
                k51 k51Var17 = (k51) obj;
                k51Var17.getClass();
                return k51Var17.j == j51Var ? p90Var.y() : p90Var.J();
            case 24:
                k51 k51Var18 = (k51) obj;
                k51Var18.getClass();
                return k51Var18.j == j51Var ? jp.j(6.0d) : jp.j(7.0d);
            case 25:
                k51 k51Var19 = (k51) obj;
                k51Var19.getClass();
                return k51Var19.e;
            case 26:
                ((k51) obj).getClass();
                return p90Var.p();
            case 27:
                k51 k51Var20 = (k51) obj;
                k51Var20.getClass();
                return k51Var20.j == j51Var ? jp.j(6.0d) : jp.j(7.0d);
            case 28:
                k51 k51Var21 = (k51) obj;
                k51Var21.getClass();
                return k51Var21.e;
            default:
                ((k51) obj).getClass();
                return p90Var.r();
        }
    }

    public /* synthetic */ g90(byte b) {
        this.I = b;
    }
}
