package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bd5 extends ft3 {
    public long[] a;
    public int b;

    public bd5(long[] jArr) {
        this.a = jArr;
        this.b = jArr.length;
        b(10);
    }

    @Override // defpackage.ft3
    public final Object a() {
        return new ad5(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.ft3
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // defpackage.ft3
    public final int d() {
        return this.b;
    }

    public final void e(long j) {
        b(d() + 1);
        long[] jArr = this.a;
        int i = this.b;
        this.b = i + 1;
        jArr[i] = j;
    }
}
