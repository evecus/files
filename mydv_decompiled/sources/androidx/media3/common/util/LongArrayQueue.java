package androidx.media3.common.util;

import defpackage.s83;
import defpackage.sp0;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class LongArrayQueue {
    public static final int DEFAULT_INITIAL_CAPACITY = 16;
    private long[] data;
    private int headIndex;
    private int size;
    private int tailIndex;
    private int wrapAroundMask;

    public LongArrayQueue(int i) {
        sp0.o(i >= 0 && i <= 1073741824);
        i = i == 0 ? 1 : i;
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.headIndex = 0;
        this.tailIndex = -1;
        this.size = 0;
        long[] jArr = new long[i];
        this.data = jArr;
        this.wrapAroundMask = jArr.length - 1;
    }

    private void doubleArraySize() {
        long[] jArr = this.data;
        int length = jArr.length << 1;
        if (length < 0) {
            s83.r();
            return;
        }
        long[] jArr2 = new long[length];
        int length2 = jArr.length;
        int i = this.headIndex;
        int i2 = length2 - i;
        System.arraycopy(jArr, i, jArr2, 0, i2);
        System.arraycopy(this.data, 0, jArr2, i2, i);
        this.headIndex = 0;
        this.tailIndex = this.size - 1;
        this.data = jArr2;
        this.wrapAroundMask = jArr2.length - 1;
    }

    public void add(long j) {
        if (this.size == this.data.length) {
            doubleArraySize();
        }
        int i = (this.tailIndex + 1) & this.wrapAroundMask;
        this.tailIndex = i;
        this.data[i] = j;
        this.size++;
    }

    public int capacity() {
        return this.data.length;
    }

    public void clear() {
        this.headIndex = 0;
        this.tailIndex = -1;
        this.size = 0;
    }

    public long element() {
        if (this.size != 0) {
            return this.data[this.headIndex];
        }
        zy.k();
        return 0L;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public long remove() {
        int i = this.size;
        if (i == 0) {
            zy.k();
            return 0L;
        }
        long[] jArr = this.data;
        int i2 = this.headIndex;
        long j = jArr[i2];
        this.headIndex = this.wrapAroundMask & (i2 + 1);
        this.size = i - 1;
        return j;
    }

    public int size() {
        return this.size;
    }

    public LongArrayQueue() {
        this(16);
    }
}
