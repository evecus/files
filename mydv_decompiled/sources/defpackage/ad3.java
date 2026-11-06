package defpackage;

import androidx.media3.common.util.Log;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ad3 {
    public transient Object[] a;
    public transient int[] b;
    public transient int c;
    public transient int[] d;
    public transient long[] e;
    public transient float f;
    public transient int g;

    public final void a(int i) {
        if (i > this.e.length) {
            f(i);
        }
        if (i >= this.g) {
            g(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    public final int b(Object obj) {
        int c = c(obj);
        if (c == -1) {
            return 0;
        }
        return this.b[c];
    }

    public final int c(Object obj) {
        int Y = ut0.Y(obj);
        int i = this.d[(r1.length - 1) & Y];
        while (i != -1) {
            long j = this.e[i];
            if (((int) (j >>> 32)) == Y && jl2.z(obj, this.a[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public final void d(int i) {
        sp0.p(i >= 0, "Initial capacity must be non-negative");
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (1.0d * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
            highestOneBit = 1073741824;
        }
        int[] iArr = new int[highestOneBit];
        Arrays.fill(iArr, -1);
        this.d = iArr;
        this.f = 1.0f;
        this.a = new Object[i];
        this.b = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.e = jArr;
        this.g = Math.max(1, (int) (highestOneBit * 1.0f));
    }

    public final void e(int i, Object obj) {
        long j;
        if (i <= 0) {
            s83.t(hf1.u(i, "count must be positive but was: "));
            return;
        }
        long[] jArr = this.e;
        Object[] objArr = this.a;
        int[] iArr = this.b;
        int Y = ut0.Y(obj);
        int[] iArr2 = this.d;
        int length = (iArr2.length - 1) & Y;
        int i2 = this.c;
        int i3 = iArr2[length];
        if (i3 == -1) {
            iArr2[length] = i2;
            j = 4294967295L;
        } else {
            while (true) {
                long j2 = jArr[i3];
                j = 4294967295L;
                if (((int) (j2 >>> 32)) == Y && jl2.z(obj, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return;
                } else {
                    int i5 = (int) j2;
                    if (i5 == -1) {
                        jArr[i3] = ((-4294967296L) & j2) | (i2 & 4294967295L);
                        break;
                    }
                    i3 = i5;
                }
            }
        }
        int i6 = Log.LOG_LEVEL_OFF;
        if (i2 == Integer.MAX_VALUE) {
            zy.i("Cannot contain more than Integer.MAX_VALUE elements!");
            return;
        }
        int i7 = i2 + 1;
        int length2 = this.e.length;
        if (i7 > length2) {
            int max = Math.max(1, length2 >>> 1) + length2;
            if (max >= 0) {
                i6 = max;
            }
            if (i6 != length2) {
                f(i6);
            }
        }
        this.e[i2] = (Y << 32) | j;
        this.a[i2] = obj;
        this.b[i2] = i;
        this.c = i7;
        if (i2 >= this.g) {
            g(this.d.length * 2);
        }
    }

    public final void f(int i) {
        this.a = Arrays.copyOf(this.a, i);
        this.b = Arrays.copyOf(this.b, i);
        long[] jArr = this.e;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1L);
        }
        this.e = copyOf;
    }

    public final void g(int i) {
        if (this.d.length >= 1073741824) {
            this.g = Log.LOG_LEVEL_OFF;
            return;
        }
        int i2 = ((int) (i * this.f)) + 1;
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        long[] jArr = this.e;
        int i3 = i - 1;
        for (int i4 = 0; i4 < this.c; i4++) {
            int i5 = (int) (jArr[i4] >>> 32);
            int i6 = i5 & i3;
            int i7 = iArr[i6];
            iArr[i6] = i4;
            jArr[i4] = (i5 << 32) | (i7 & 4294967295L);
        }
        this.g = i2;
        this.d = iArr;
    }
}
