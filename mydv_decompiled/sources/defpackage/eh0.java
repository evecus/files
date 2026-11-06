package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class eh0 {
    public static final long a(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            s02.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i, i2, i3, i4);
    }

    public static /* synthetic */ long b(int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return a(i, i2, i3, i4);
    }

    public static final int c(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final long d(long j, long j2) {
        int i = (int) (j2 >> 32);
        int j3 = dh0.j(j);
        int h = dh0.h(j);
        if (i < j3) {
            i = j3;
        }
        if (i <= h) {
            h = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int i3 = dh0.i(j);
        int g = dh0.g(j);
        if (i2 < i3) {
            i2 = i3;
        }
        if (i2 <= g) {
            g = i2;
        }
        return (h << 32) | (4294967295L & g);
    }

    public static final long e(long j, long j2) {
        int j3 = dh0.j(j);
        int h = dh0.h(j);
        int i = dh0.i(j);
        int g = dh0.g(j);
        int j4 = dh0.j(j2);
        if (j4 < j3) {
            j4 = j3;
        }
        if (j4 > h) {
            j4 = h;
        }
        int h2 = dh0.h(j2);
        if (h2 >= j3) {
            j3 = h2;
        }
        if (j3 <= h) {
            h = j3;
        }
        int i2 = dh0.i(j2);
        if (i2 < i) {
            i2 = i;
        }
        if (i2 > g) {
            i2 = g;
        }
        int g2 = dh0.g(j2);
        if (g2 >= i) {
            i = g2;
        }
        if (i <= g) {
            g = i;
        }
        return a(j4, h, i2, g);
    }

    public static final int f(int i, long j) {
        int i2 = dh0.i(j);
        int g = dh0.g(j);
        if (i < i2) {
            i = i2;
        }
        return i > g ? g : i;
    }

    public static final int g(int i, long j) {
        int j2 = dh0.j(j);
        int h = dh0.h(j);
        if (i < j2) {
            i = j2;
        }
        return i > h ? h : i;
    }

    public static final long h(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int c = c(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int c2 = c(i6);
        if (c + c2 > 31) {
            k(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = c2 - 13;
        return ((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (c2 + 2)) | ((i8 & (~(i8 >> 31))) << (c2 + 33));
    }

    public static final long i(int i, int i2, long j) {
        int j2 = dh0.j(j) + i;
        if (j2 < 0) {
            j2 = 0;
        }
        int h = dh0.h(j);
        if (h != Integer.MAX_VALUE && (h = h + i) < 0) {
            h = 0;
        }
        int i3 = dh0.i(j) + i2;
        if (i3 < 0) {
            i3 = 0;
        }
        int g = dh0.g(j);
        return a(j2, h, i3, (g == Integer.MAX_VALUE || (g = g + i2) >= 0) ? g : 0);
    }

    public static /* synthetic */ long j(long j, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return i(i, i2, j);
    }

    public static final void k(int i, int i2) {
        throw new IllegalArgumentException(hf1.v("Can't represent a width of ", i, " and height of ", i2, " in Constraints"));
    }

    public static final Void l(int i) {
        throw new IllegalArgumentException(r7.z("Can't represent a size of ", i, " in Constraints"));
    }
}
