package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class oz2 {
    public final h13 a;
    public final int b;
    public final int c;
    public final int d;
    public final oz2 e;
    public final int f;

    public oz2(qz2 qz2Var, h13 h13Var, int i, int i2, int i3, oz2 oz2Var, si5 si5Var) {
        this.a = h13Var;
        this.b = i;
        h13 h13Var2 = h13.BYTE;
        int i4 = (h13Var == h13Var2 || oz2Var == null) ? i2 : oz2Var.c;
        this.c = i4;
        this.d = i3;
        this.e = oz2Var;
        boolean z = false;
        int i5 = oz2Var != null ? oz2Var.f : 0;
        if ((h13Var == h13Var2 && oz2Var == null && i4 != 0) || (oz2Var != null && i4 != oz2Var.c)) {
            z = true;
        }
        i5 = (oz2Var == null || h13Var != oz2Var.a || z) ? i5 + h13Var.a(si5Var) + 4 : i5;
        int ordinal = h13Var.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                i5 += i3 != 1 ? 11 : 6;
            } else if (ordinal == 4) {
                i5 += ((String) qz2Var.c).substring(i, i3 + i).getBytes(((d61) qz2Var.d).a[i2].charset()).length * 8;
                if (z) {
                    i5 += 12;
                }
            } else if (ordinal == 6) {
                i5 += 13;
            }
        } else {
            i5 += i3 != 1 ? i3 == 2 ? 7 : 10 : 4;
        }
        this.f = i5;
    }
}
