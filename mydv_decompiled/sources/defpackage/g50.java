package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class g50 extends ft3 {
    public char[] a;
    public int b;

    public g50(char[] cArr) {
        this.a = cArr;
        this.b = cArr.length;
        b(10);
    }

    @Override // defpackage.ft3
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.ft3
    public final void b(int i) {
        char[] cArr = this.a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(cArr, i);
        }
    }

    @Override // defpackage.ft3
    public final int d() {
        return this.b;
    }

    public final void e(char c) {
        b(d() + 1);
        char[] cArr = this.a;
        int i = this.b;
        this.b = i + 1;
        cArr[i] = c;
    }
}
