package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class p33 extends m22 {
    public p33(int i) {
        this.a = i == 0 ? y22.a : new int[i];
    }

    public final void c(int i) {
        d(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void d(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            this.a = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    public final void e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            dq2.J0("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            dq.O0(i, i + 1, i2, iArr, iArr);
        }
        this.b--;
    }

    public final void f(int i, int i2) {
        if (i < 0 || i >= this.b) {
            dq2.J0("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public /* synthetic */ p33() {
        this(16);
    }
}
