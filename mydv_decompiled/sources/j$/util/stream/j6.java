package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class j6 extends x5 {
    public int[] c;
    public int d;

    @Override // j$.util.stream.j5, j$.util.stream.l5
    public final void accept(int i) {
        int[] iArr = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        iArr[i2] = i;
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public final void c(long j) {
        if (j < 2147483639) {
            this.c = new int[(int) j];
        } else {
            j$.time.h.c("Stream size exceeds max array size");
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public final void end() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        l5 l5Var = this.a;
        l5Var.c(j);
        if (this.b) {
            while (i < this.d && !l5Var.e()) {
                l5Var.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d) {
                l5Var.accept(this.c[i]);
                i++;
            }
        }
        l5Var.end();
        this.c = null;
    }
}
