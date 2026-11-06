package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class of1 extends ft3 {
    public float[] a;
    public int b;

    public of1(float[] fArr) {
        this.a = fArr;
        this.b = fArr.length;
        b(10);
    }

    @Override // defpackage.ft3
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.ft3
    public final void b(int i) {
        float[] fArr = this.a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(fArr, i);
        }
    }

    @Override // defpackage.ft3
    public final int d() {
        return this.b;
    }

    public final void e(float f) {
        b(d() + 1);
        float[] fArr = this.a;
        int i = this.b;
        this.b = i + 1;
        fArr[i] = f;
    }
}
