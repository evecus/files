package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class h90 {
    public static boolean n(k51 k51Var) {
        fh5 fh5Var = k51Var.b;
        return fh5Var == fh5.N || fh5Var == fh5.O;
    }

    public b51 A() {
        a51 a51Var = new a51();
        a51Var.a = "tertiary_fixed";
        a51Var.b = new c90((byte) 3);
        a51Var.c = new c90((byte) 4);
        a51Var.d = true;
        a51Var.f = new n1(1, this, h90.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 18);
        a51Var.h = new c90((byte) 5);
        a51Var.i = new b90(this, (byte) 1);
        return a51Var.a();
    }

    public b51 B() {
        a51 a51Var = new a51();
        a51Var.a = "tertiary_fixed_dim";
        a51Var.b = new q4((byte) 19);
        a51Var.c = new q4((byte) 20);
        a51Var.d = true;
        a51Var.f = new n1(1, this, h90.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 19);
        a51Var.h = new q4((byte) 21);
        a51Var.i = new b90(this, (byte) 0);
        return a51Var.a();
    }

    public b51 a() {
        a51 a51Var = new a51();
        a51Var.a = "background";
        a51Var.b = new e90((byte) 8);
        a51Var.c = new e90((byte) 19);
        a51Var.d = true;
        return a51Var.a();
    }

    public b51 b() {
        a51 a51Var = new a51();
        a51Var.a = "error";
        a51Var.b = new e90((byte) 4);
        a51Var.c = new e90((byte) 5);
        a51Var.d = true;
        a51Var.f = new n1(1, this, h90.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 2);
        a51Var.h = new e90((byte) 6);
        a51Var.i = new b90(this, (byte) 7);
        return a51Var.a();
    }

    public b51 c() {
        a51 a51Var = new a51();
        a51Var.a = "error_container";
        a51Var.b = new e90((byte) 21);
        a51Var.c = new e90((byte) 22);
        a51Var.d = true;
        a51Var.f = new n1(1, this, h90.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 3);
        a51Var.h = new e90((byte) 23);
        a51Var.i = new b90(this, (byte) 9);
        return a51Var.a();
    }

    public k85 d(fh5 fh5Var, zs1 zs1Var, boolean z, j51 j51Var, double d) {
        zs1Var.getClass();
        switch (fh5Var.ordinal()) {
            default:
                s83.v();
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
        }
    }

    public zs1 e(b51 b51Var, k51 k51Var) {
        return ((k85) b51Var.b.invoke(k51Var)).a(k(b51Var, k51Var));
    }

    public k85 f(fh5 fh5Var, zs1 zs1Var, boolean z, j51 j51Var, double d) {
        zs1Var.getClass();
        double d2 = zs1Var.b;
        switch (fh5Var.ordinal()) {
            case 0:
                return i85.a(d2, 0.0d);
            case 1:
                return i85.a(d2, 2.0d);
            case 2:
                return i85.a(d2, 6.0d);
            case 3:
                return i85.a(d2, 10.0d);
            case 4:
                double d3 = (d2 + 15.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return i85.a(d3, 8.0d);
            case 5:
            case 6:
                return i85.a(d2, zs1Var.c / 8.0d);
            case 7:
                return i85.a(d2, 0.0d);
            case 8:
                return i85.a(d2, 10.0d);
            default:
                s83.v();
                return null;
        }
    }

    public k85 g(fh5 fh5Var, zs1 zs1Var, boolean z, j51 j51Var, double d) {
        zs1Var.getClass();
        double d2 = zs1Var.c;
        double d3 = zs1Var.b;
        switch (fh5Var.ordinal()) {
            case 0:
                return i85.a(d3, 0.0d);
            case 1:
                return i85.a(d3, 2.0d);
            case 2:
                return i85.a(d3, 8.0d);
            case 3:
                return i85.a(d3, 12.0d);
            case 4:
                double d4 = (d3 + 15.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return i85.a(d4, 12.0d);
            case 5:
                return i85.a(d3, (d2 / 8.0d) + 4.0d);
            case 6:
                return i85.a(d3, (d2 / 8.0d) + 4.0d);
            case 7:
                return i85.a(d3, 0.0d);
            case 8:
                return i85.a(d3, 16.0d);
            default:
                s83.v();
                return null;
        }
    }

    public k85 h(fh5 fh5Var, zs1 zs1Var, boolean z, j51 j51Var, double d) {
        zs1Var.getClass();
        double d2 = zs1Var.b;
        switch (fh5Var.ordinal()) {
            case 0:
                return i85.a(d2, 0.0d);
            case 1:
                return i85.a(d2, 12.0d);
            case 2:
                return i85.a(d2, 36.0d);
            case 3:
                return i85.a(d2, 200.0d);
            case 4:
                double d3 = (d2 + 240.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return i85.a(d3, 40.0d);
            case 5:
            case 6:
                return i85.a(d2, zs1Var.c);
            case 7:
                return i85.a(d2, 48.0d);
            case 8:
                double d4 = (d2 - 50.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return i85.a(d4, 48.0d);
            default:
                s83.v();
                return null;
        }
    }

    public k85 i(fh5 fh5Var, zs1 zs1Var, boolean z, j51 j51Var, double d) {
        zs1Var.getClass();
        double d2 = zs1Var.b;
        switch (fh5Var.ordinal()) {
            case 0:
                return i85.a(d2, 0.0d);
            case 1:
                return i85.a(d2, 8.0d);
            case 2:
                return i85.a(d2, 16.0d);
            case 3:
                return i85.a(ut0.F(zs1Var, new double[]{0.0d, 41.0d, 61.0d, 101.0d, 131.0d, 181.0d, 251.0d, 301.0d, 360.0d}, new double[]{18.0d, 15.0d, 10.0d, 12.0d, 15.0d, 18.0d, 15.0d, 12.0d, 12.0d}), 24.0d);
            case 4:
                return i85.a(ut0.F(zs1Var, new double[]{0.0d, 21.0d, 51.0d, 121.0d, 151.0d, 191.0d, 271.0d, 321.0d, 360.0d}, new double[]{45.0d, 95.0d, 45.0d, 20.0d, 45.0d, 90.0d, 45.0d, 45.0d, 45.0d}), 24.0d);
            case 5:
            case 6:
                double d3 = zs1Var.c;
                return i85.a(d2, Math.max(d3 - 32.0d, d3 * 0.5d));
            case 7:
                return i85.a(d2, 16.0d);
            case 8:
                double d4 = (d2 - 50.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return i85.a(d4, 36.0d);
            default:
                s83.v();
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.k85 j(defpackage.fh5 r26, defpackage.zs1 r27, boolean r28, defpackage.j51 r29, double r30) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h90.j(fh5, zs1, boolean, j51, double):k85");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0187 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double k(defpackage.b51 r34, defpackage.k51 r35) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h90.k(b51, k51):double");
    }

    public final b51 l(k51 k51Var) {
        k51Var.getClass();
        return k51Var.c ? w() : x();
    }

    public b51 m() {
        a51 a51Var = new a51();
        a51Var.a = "inverse_surface";
        a51Var.b = new g90((byte) 9);
        a51Var.c = new g90((byte) 19);
        a51Var.d = true;
        return a51Var.a();
    }

    public b51 o() {
        a51 a51Var = new a51();
        a51Var.a = "primary";
        a51Var.b = new c90((byte) 7);
        a51Var.c = new c90((byte) 8);
        a51Var.d = true;
        a51Var.f = new n1(1, this, h90.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 8);
        a51Var.h = new c90((byte) 9);
        a51Var.i = new b90(this, (byte) 2);
        return a51Var.a();
    }

    public b51 p() {
        a51 a51Var = new a51();
        a51Var.a = "primary_container";
        a51Var.b = new q4((byte) 26);
        a51Var.c = new c90(this);
        a51Var.d = true;
        a51Var.f = new n1(1, this, h90.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 9);
        a51Var.h = new c90((byte) 16);
        a51Var.i = new b90(this, (byte) 4);
        return a51Var.a();
    }

    public b51 q() {
        a51 a51Var = new a51();
        a51Var.a = "primary_fixed";
        a51Var.b = new c90((byte) 14);
        a51Var.c = new c90((byte) 15);
        a51Var.d = true;
        a51Var.f = new n1(1, this, h90.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 10);
        a51Var.h = new c90((byte) 17);
        a51Var.i = new b90(this, (byte) 3);
        return a51Var.a();
    }

    public b51 r() {
        a51 a51Var = new a51();
        a51Var.a = "primary_fixed_dim";
        a51Var.b = new f90((byte) 23);
        a51Var.c = new f90((byte) 24);
        a51Var.d = true;
        a51Var.f = new n1(1, this, h90.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 11);
        a51Var.h = new f90((byte) 25);
        a51Var.i = new b90(this, (byte) 11);
        return a51Var.a();
    }

    public b51 s() {
        a51 a51Var = new a51();
        a51Var.a = "secondary";
        byte b = 6;
        a51Var.b = new d90(b);
        a51Var.c = new d90((byte) 17);
        a51Var.d = true;
        a51Var.f = new n1(1, this, h90.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 12);
        a51Var.h = new d90((byte) 25);
        a51Var.i = new b90(this, b);
        return a51Var.a();
    }

    public b51 t() {
        a51 a51Var = new a51();
        a51Var.a = "secondary_container";
        a51Var.b = new g90((byte) 15);
        a51Var.c = new g90(this);
        a51Var.d = true;
        a51Var.f = new n1(1, this, h90.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 13);
        a51Var.h = new g90((byte) 17);
        a51Var.i = new b90(this, (byte) 13);
        return a51Var.a();
    }

    public b51 u() {
        a51 a51Var = new a51();
        a51Var.a = "secondary_fixed";
        byte b = 10;
        a51Var.b = new f90(b);
        a51Var.c = new f90((byte) 11);
        a51Var.d = true;
        a51Var.f = new n1(1, this, h90.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 14);
        a51Var.h = new f90((byte) 12);
        a51Var.i = new b90(this, b);
        return a51Var.a();
    }

    public b51 v() {
        a51 a51Var = new a51();
        a51Var.a = "secondary_fixed_dim";
        a51Var.b = new f90((byte) 26);
        a51Var.c = new f90((byte) 27);
        a51Var.d = true;
        a51Var.f = new n1(1, this, h90.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 15);
        a51Var.h = new f90((byte) 28);
        a51Var.i = new b90(this, (byte) 12);
        return a51Var.a();
    }

    public b51 w() {
        a51 a51Var = new a51();
        a51Var.a = "surface_bright";
        a51Var.b = new d90((byte) 1);
        a51Var.c = new d90((byte) 2);
        a51Var.d = true;
        return a51Var.a();
    }

    public b51 x() {
        a51 a51Var = new a51();
        a51Var.a = "surface_dim";
        a51Var.b = new e90((byte) 2);
        a51Var.c = new e90((byte) 3);
        a51Var.d = true;
        return a51Var.a();
    }

    public b51 y() {
        a51 a51Var = new a51();
        a51Var.a = "tertiary";
        a51Var.b = new e90((byte) 17);
        a51Var.c = new e90((byte) 18);
        a51Var.d = true;
        a51Var.f = new n1(1, this, h90.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 16);
        a51Var.h = new e90((byte) 20);
        a51Var.i = new b90(this, (byte) 8);
        return a51Var.a();
    }

    public b51 z() {
        a51 a51Var = new a51();
        a51Var.a = "tertiary_container";
        a51Var.b = new d90((byte) 22);
        a51Var.c = new d90(this);
        a51Var.d = true;
        a51Var.f = new n1(1, this, h90.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 17);
        a51Var.h = new d90((byte) 24);
        a51Var.i = new b90(this, (byte) 5);
        return a51Var.a();
    }
}
