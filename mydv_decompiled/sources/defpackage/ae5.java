package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ae5 {
    public static final ae5 f = new ae5(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public ae5(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static ae5 b() {
        return new ae5(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int m;
        int o;
        int i;
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.a; i4++) {
            int i5 = this.b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ((Long) this.c[i4]).getClass();
                    i = i70.i(i6);
                } else if (i7 == 2) {
                    i = i70.f(i6, (f00) this.c[i4]);
                } else if (i7 == 3) {
                    m = i70.m(i6) * 2;
                    o = ((ae5) this.c[i4]).a();
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(z42.b());
                    }
                    ((Integer) this.c[i4]).getClass();
                    i = i70.h(i6);
                }
                i3 = i + i3;
            } else {
                long longValue = ((Long) this.c[i4]).longValue();
                m = i70.m(i6);
                o = i70.o(longValue);
            }
            i3 = o + m + i3;
        }
        this.d = i3;
        return i3;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            e1.a();
            return;
        }
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
        int[] iArr2 = this.b;
        int i4 = this.a;
        iArr2[i4] = i;
        this.c[i4] = obj;
        this.a = i4 + 1;
    }

    public final void d(uu2 uu2Var) {
        if (this.a == 0) {
            return;
        }
        uu2Var.getClass();
        i70 i70Var = (i70) uu2Var.I;
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                i70Var.J(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                i70Var.y(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                uu2Var.M(i3, (f00) obj);
            } else if (i4 == 3) {
                i70Var.G(i3, 3);
                ((ae5) obj).d(uu2Var);
                i70Var.G(i3, 4);
            } else {
                if (i4 != 5) {
                    zl1.k(z42.b());
                    return;
                }
                i70Var.w(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ae5)) {
            return false;
        }
        ae5 ae5Var = (ae5) obj;
        int i = this.a;
        if (i == ae5Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = ae5Var.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = ae5Var.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
