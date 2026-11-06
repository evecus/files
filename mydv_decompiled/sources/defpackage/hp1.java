package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hp1 {
    public final gp1 a;
    public final int[] b;

    public hp1(gp1 gp1Var, int[] iArr) {
        if (iArr.length == 0) {
            s83.d();
            throw null;
        }
        this.a = gp1Var;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.b = new int[]{0};
            return;
        }
        int i2 = length - i;
        int[] iArr2 = new int[i2];
        this.b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, i2);
    }

    public final hp1 a(hp1 hp1Var) {
        gp1 gp1Var = hp1Var.a;
        gp1 gp1Var2 = this.a;
        if (!gp1Var2.equals(gp1Var)) {
            s83.t("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (c()) {
            return hp1Var;
        }
        if (hp1Var.c()) {
            return this;
        }
        int[] iArr = hp1Var.b;
        int[] iArr2 = this.b;
        if (iArr2.length > iArr.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = iArr2[i - length] ^ iArr[i];
        }
        return new hp1(gp1Var2, iArr3);
    }

    public final int b() {
        return this.b.length - 1;
    }

    public final boolean c() {
        return this.b[0] == 0;
    }

    public final String toString() {
        if (c()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(b() * 8);
        for (int b = b(); b >= 0; b--) {
            int[] iArr = this.b;
            int i = iArr[(iArr.length - 1) - b];
            if (i != 0) {
                if (i < 0) {
                    if (b == b()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    i = -i;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (b == 0 || i != 1) {
                    gp1 gp1Var = this.a;
                    if (i == 0) {
                        gp1Var.getClass();
                        s83.d();
                        return null;
                    }
                    int i2 = gp1Var.b[i];
                    if (i2 == 0) {
                        sb.append('1');
                    } else if (i2 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i2);
                    }
                }
                if (b != 0) {
                    if (b == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(b);
                    }
                }
            }
        }
        return sb.toString();
    }
}
