package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qw extends ft3 {
    public boolean[] a;
    public int b;

    public qw(boolean[] zArr) {
        this.a = zArr;
        this.b = zArr.length;
        b(10);
    }

    @Override // defpackage.ft3
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.ft3
    public final void b(int i) {
        boolean[] zArr = this.a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // defpackage.ft3
    public final int d() {
        return this.b;
    }

    public final void e(boolean z) {
        b(d() + 1);
        boolean[] zArr = this.a;
        int i = this.b;
        this.b = i + 1;
        zArr[i] = z;
    }
}
