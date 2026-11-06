package defpackage;

import androidx.media3.common.util.Log;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xx1 {
    public int[] a;
    public int b;

    public xx1(byte b, int i) {
        switch (b) {
            case 1:
                this.a = new int[i];
                break;
            default:
                this.b = 0;
                this.a = new int[i];
                break;
        }
    }

    public void a(int i) {
        int i2 = this.b;
        int i3 = i2 + 1;
        int[] iArr = this.a;
        if (i3 > iArr.length) {
            int length = iArr.length;
            if (i3 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i4 = length + (length >> 1) + 1;
            if (i4 < i3) {
                i4 = Integer.highestOneBit(i2) << 1;
            }
            if (i4 < 0) {
                i4 = Log.LOG_LEVEL_OFF;
            }
            iArr = Arrays.copyOf(iArr, i4);
            this.a = iArr;
        }
        int i5 = this.b;
        iArr[i5] = i;
        this.b = i5 + 1;
    }

    public yx1 b() {
        int i = this.b;
        return i == 0 ? yx1.K : new yx1(this.a, i);
    }

    public void c(int i, int i2, int i3) {
        int i4 = this.b;
        int[] iArr = this.a;
        int i5 = i4 + 3;
        if (i5 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.a = iArr;
        }
        iArr[i4] = i + i3;
        iArr[i4 + 1] = i2 + i3;
        iArr[i4 + 2] = i3;
        this.b = i5;
    }

    public void d(int i, int i2, int i3, int i4) {
        int i5 = this.b;
        int[] iArr = this.a;
        int i6 = i5 + 4;
        if (i6 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.a = iArr;
        }
        iArr[i5] = i;
        iArr[i5 + 1] = i2;
        iArr[i5 + 2] = i3;
        iArr[i5 + 3] = i4;
        this.b = i6;
    }

    public void e(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.a;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    f(i3, i4);
                }
            }
            f(i3 + 3, i2);
            e(i, i3);
            e(i3 + 6, i2);
        }
    }

    public void f(int i, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }
}
