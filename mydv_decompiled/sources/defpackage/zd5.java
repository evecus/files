package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zd5 {
    public static final zd5 f = new zd5(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public zd5(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static zd5 c() {
        return new zd5(0, new int[8], new Object[8], true);
    }

    public final void a(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final int b() {
        int e;
        int g;
        int e2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    e2 = j70.e(i5) + 8;
                } else if (i6 == 2) {
                    e2 = j70.a(i5, (g00) this.c[i3]);
                } else if (i6 == 3) {
                    e = j70.e(i5) * 2;
                    g = ((zd5) this.c[i3]).b();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(x42.c());
                    }
                    ((Integer) this.c[i3]).getClass();
                    e2 = j70.e(i5) + 4;
                }
                i2 = e2 + i2;
            } else {
                long longValue = ((Long) this.c[i3]).longValue();
                e = j70.e(i5);
                g = j70.g(longValue);
            }
            i2 = g + e + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            e1.a();
            return;
        }
        a(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void e(uu2 uu2Var) {
        if (this.a == 0) {
            return;
        }
        uu2Var.getClass();
        j70 j70Var = (j70) uu2Var.I;
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                j70Var.x(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                j70Var.n(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                j70Var.k(i3, (g00) obj);
            } else if (i4 == 3) {
                j70Var.u(i3, 3);
                ((zd5) obj).e(uu2Var);
                j70Var.u(i3, 4);
            } else {
                if (i4 != 5) {
                    zl1.k(x42.c());
                    return;
                }
                j70Var.l(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zd5)) {
            return false;
        }
        zd5 zd5Var = (zd5) obj;
        int i = this.a;
        if (i == zd5Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = zd5Var.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = zd5Var.c;
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
