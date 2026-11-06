package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class f04 {
    public static final b4 I;

    static {
        Integer num = r52.a;
        I = (num == null || num.intValue() >= 34) ? new lo3() : new gd1();
    }

    public int a(int i) {
        return I.a(i);
    }

    public int b() {
        return I.b();
    }

    public int c(int i) {
        int b;
        int i2;
        if (i <= 0) {
            s83.h("Random range is empty: [" + ((Object) 0) + ", " + Integer.valueOf(i) + ").");
            return 0;
        }
        if (i > 0 || i == Integer.MIN_VALUE) {
            if (((-i) & i) == i) {
                return a(31 - Integer.numberOfLeadingZeros(i));
            }
            do {
                b = b() >>> 1;
                i2 = b % i;
            } while ((i - 1) + (b - i2) < 0);
            return i2;
        }
        while (true) {
            int b2 = b();
            if (b2 >= 0 && b2 < i) {
                return b2;
            }
        }
    }

    public long d() {
        return (b() << 32) + b();
    }

    public long e() {
        return f();
    }

    public long f() {
        long d;
        long j;
        do {
            d = d() >>> 1;
            j = d % 1000;
        } while ((d - j) + 999 < 0);
        return j;
    }
}
