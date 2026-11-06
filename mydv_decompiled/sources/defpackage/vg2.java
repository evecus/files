package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vg2 {
    public final s62 a;
    public int[] b;
    public final gk3 c;
    public int[] d;
    public final gk3 e;
    public boolean f;
    public Object g;
    public final re2 h;

    public vg2(int[] iArr, int[] iArr2, s62 s62Var) {
        Integer valueOf;
        this.a = s62Var;
        this.b = iArr;
        this.c = new gk3(a(iArr));
        this.d = iArr2;
        this.e = new gk3(b(iArr, iArr2));
        if (iArr.length == 0) {
            valueOf = null;
        } else {
            int i = iArr[0];
            int i2 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i3 = iArr[i2];
                    i = i > i3 ? i3 : i;
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            valueOf = Integer.valueOf(i);
        }
        this.h = new re2(valueOf != null ? valueOf.intValue() : 0, 90, 200);
    }

    public static int a(int[] iArr) {
        int length = iArr.length;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                if (i == Integer.MAX_VALUE) {
                    break;
                }
                return i;
            }
            int i3 = iArr[i2];
            if (i3 <= 0) {
                break;
            }
            if (i > i3) {
                i = i3;
            }
            i2++;
        }
        return 0;
    }

    public static int b(int[] iArr, int[] iArr2) {
        int a = a(iArr);
        int length = iArr2.length;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < length; i2++) {
            if (iArr[i2] == a) {
                i = Math.min(i, iArr2[i2]);
            }
        }
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }
}
