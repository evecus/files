package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class j71 {
    public static final long[] e = new long[0];
    public final SerialDescriptor a;
    public final s62 b;
    public long c;
    public final long[] d;

    public j71(SerialDescriptor serialDescriptor, s62 s62Var) {
        serialDescriptor.getClass();
        this.a = serialDescriptor;
        this.b = s62Var;
        int f = serialDescriptor.f();
        if (f <= 64) {
            this.c = f != 64 ? (-1) << f : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        int i = (f - 1) >>> 6;
        long[] jArr = new long[i];
        if ((f & 63) != 0) {
            jArr[i - 1] = (-1) << f;
        }
        this.d = jArr;
    }

    public final void a(int i) {
        if (i < 64) {
            this.c = (1 << i) | this.c;
        } else {
            int i2 = (i >>> 6) - 1;
            long[] jArr = this.d;
            jArr[i2] = (1 << (i & 63)) | jArr[i2];
        }
    }

    public final int b() {
        s62 s62Var;
        int numberOfTrailingZeros;
        SerialDescriptor serialDescriptor = this.a;
        int f = serialDescriptor.f();
        do {
            long j = this.c;
            s62Var = this.b;
            if (j == -1) {
                if (f <= 64) {
                    return -1;
                }
                long[] jArr = this.d;
                int length = jArr.length;
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    int i3 = i2 * 64;
                    long j2 = jArr[i];
                    while (j2 != -1) {
                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j2);
                        j2 |= 1 << numberOfTrailingZeros2;
                        int i4 = numberOfTrailingZeros2 + i3;
                        if (((Boolean) s62Var.invoke(serialDescriptor, Integer.valueOf(i4))).booleanValue()) {
                            jArr[i] = j2;
                            return i4;
                        }
                    }
                    jArr[i] = j2;
                    i = i2;
                }
                return -1;
            }
            numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
            this.c |= 1 << numberOfTrailingZeros;
        } while (!((Boolean) s62Var.invoke(serialDescriptor, Integer.valueOf(numberOfTrailingZeros))).booleanValue());
        return numberOfTrailingZeros;
    }
}
