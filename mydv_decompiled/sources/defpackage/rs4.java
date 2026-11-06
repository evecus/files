package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class rs4 {
    public int a;
    public long[] b;
    public int[] c;
    public int[] d;
    public int e;

    public final int a(long j) {
        int i = this.a + 1;
        long[] jArr = this.b;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            dq.P0(0, 0, jArr.length, jArr, jArr2);
            dq.S0(0, 0, 14, this.c, iArr);
            this.b = jArr2;
            this.c = iArr;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        int[] iArr2 = this.d;
        int length2 = iArr2.length;
        if (this.e >= length2) {
            int i4 = length2 * 2;
            iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            dq.S0(0, 0, 14, this.d, iArr2);
            this.d = iArr2;
        }
        int[] iArr3 = iArr2;
        int i7 = this.e;
        this.e = iArr2[i7];
        long[] jArr3 = this.b;
        jArr3[i3] = j;
        this.c[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (j42.n(jArr3[i8], j) <= 0) {
                break;
            }
            b(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public final void b(int i, int i2) {
        long[] jArr = this.b;
        int[] iArr = this.c;
        int[] iArr2 = this.d;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }
}
