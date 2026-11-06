package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class k6 extends y5 {
    public long[] c;
    public int d;

    @Override // j$.util.stream.k5, j$.util.stream.l5
    public final void accept(long j) {
        long[] jArr = this.c;
        int i = this.d;
        this.d = i + 1;
        jArr[i] = j;
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final void c(long j) {
        if (j < 2147483639) {
            this.c = new long[(int) j];
        } else {
            j$.time.h.c("Stream size exceeds max array size");
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
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
