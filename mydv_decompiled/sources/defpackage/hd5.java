package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hd5 extends ft3 {
    public short[] a;
    public int b;

    public hd5(short[] sArr) {
        this.a = sArr;
        this.b = sArr.length;
        b(10);
    }

    @Override // defpackage.ft3
    public final Object a() {
        return new gd5(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.ft3
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // defpackage.ft3
    public final int d() {
        return this.b;
    }

    public final void e(short s) {
        b(d() + 1);
        short[] sArr = this.a;
        int i = this.b;
        this.b = i + 1;
        sArr[i] = s;
    }
}
