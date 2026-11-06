package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class g22 extends ft3 {
    public int[] a;
    public int b;

    public g22(int[] iArr) {
        this.a = iArr;
        this.b = iArr.length;
        b(10);
    }

    @Override // defpackage.ft3
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.ft3
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // defpackage.ft3
    public final int d() {
        return this.b;
    }

    public final void e(int i) {
        b(d() + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }
}
