package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class os2 {
    public static double a(double d, double d2) {
        if (Math.abs(d) <= Double.MAX_VALUE && Math.abs(d2) <= Double.MAX_VALUE) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d2 > 0.0d) {
                return ut0.p(1.0d - Math.exp((-d) / d2), 0.0d, 1.0d);
            }
        }
        return 1.0d;
    }

    public static float b(double d) {
        if (Math.abs(d) <= Double.MAX_VALUE) {
            return (float) Math.pow(10.0d, d / 20.0d);
        }
        return 1.0f;
    }

    public static qs2 c(fr frVar) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        int ordinal = frVar.ordinal();
        double d6 = 0.0d;
        if (ordinal != 0) {
            if (ordinal == 1) {
                d5 = -0.5d;
            } else if (ordinal == 2) {
                d5 = -1.5d;
            } else {
                if (ordinal != 3) {
                    s83.v();
                    return null;
                }
                d5 = -3.0d;
            }
            d = d5;
        } else {
            d = 0.0d;
        }
        int ordinal2 = frVar.ordinal();
        double d7 = 2.5d;
        double d8 = 2.0d;
        if (ordinal2 == 0) {
            d2 = 0.0d;
        } else if (ordinal2 == 1) {
            d2 = 1.0d;
        } else if (ordinal2 == 2) {
            d2 = 2.0d;
        } else {
            if (ordinal2 != 3) {
                s83.v();
                return null;
            }
            d2 = 2.5d;
        }
        int ordinal3 = frVar.ordinal();
        if (ordinal3 == 0) {
            d3 = 0.0d;
        } else if (ordinal3 == 1) {
            d3 = -8.0d;
        } else if (ordinal3 == 2) {
            d3 = -12.0d;
        } else {
            if (ordinal3 != 3) {
                s83.v();
                return null;
            }
            d3 = -16.0d;
        }
        int ordinal4 = frVar.ordinal();
        if (ordinal4 == 0) {
            d4 = -120.0d;
        } else if (ordinal4 == 1) {
            d4 = -55.0d;
        } else if (ordinal4 == 2) {
            d4 = -58.0d;
        } else {
            if (ordinal4 != 3) {
                s83.v();
                return null;
            }
            d4 = -60.0d;
        }
        int ordinal5 = frVar.ordinal();
        if (ordinal5 == 0) {
            d7 = 0.0d;
        } else if (ordinal5 != 1) {
            if (ordinal5 == 2) {
                d7 = 2.0d;
            } else {
                if (ordinal5 != 3) {
                    s83.v();
                    return null;
                }
                d7 = 1.5d;
            }
        }
        int ordinal6 = frVar.ordinal();
        double d9 = 6.0d;
        double d10 = 8.0d;
        if (ordinal6 != 0) {
            if (ordinal6 == 1) {
                d6 = 10.0d;
            } else if (ordinal6 == 2) {
                d6 = 8.0d;
            } else {
                if (ordinal6 != 3) {
                    s83.v();
                    return null;
                }
                d6 = 6.0d;
            }
        }
        int ordinal7 = frVar.ordinal();
        if (ordinal7 == 0) {
            d8 = 0.05d;
        } else if (ordinal7 == 1) {
            d8 = 3.0d;
        } else if (ordinal7 != 2) {
            if (ordinal7 != 3) {
                s83.v();
                return null;
            }
            d8 = 1.5d;
        }
        int ordinal8 = frVar.ordinal();
        if (ordinal8 != 0) {
            if (ordinal8 != 1) {
                if (ordinal8 != 2) {
                    if (ordinal8 != 3) {
                        s83.v();
                        return null;
                    }
                    d9 = 5.0d;
                }
            }
            return new qs2(d, d2, d3, d4, d7, d6, d8, d10, b(d), b(d2), b(d3));
        }
        d9 = 1.2d;
        d10 = d9;
        return new qs2(d, d2, d3, d4, d7, d6, d8, d10, b(d), b(d2), b(d3));
    }
}
