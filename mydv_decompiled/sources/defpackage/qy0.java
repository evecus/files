package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qy0 extends ft3 {
    public double[] a;
    public int b;

    public qy0(double[] dArr) {
        this.a = dArr;
        this.b = dArr.length;
        b(10);
    }

    @Override // defpackage.ft3
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.ft3
    public final void b(int i) {
        double[] dArr = this.a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(dArr, i);
        }
    }

    @Override // defpackage.ft3
    public final int d() {
        return this.b;
    }

    public final void e(double d) {
        b(d() + 1);
        double[] dArr = this.a;
        int i = this.b;
        this.b = i + 1;
        dArr[i] = d;
    }
}
