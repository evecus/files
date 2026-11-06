package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class a6 extends w5 {
    public o6 c;

    @Override // j$.util.stream.i5, j$.util.stream.l5
    public final void accept(double d) {
        this.c.accept(d);
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final void c(long j) {
        if (j < 2147483639) {
            this.c = j > 0 ? new o6((int) j) : new o6();
        } else {
            j$.time.h.c("Stream size exceeds max array size");
        }
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final void end() {
        double[] dArr = (double[]) this.c.b();
        Arrays.sort(dArr);
        long length = dArr.length;
        l5 l5Var = this.a;
        l5Var.c(length);
        int i = 0;
        if (this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                double d = dArr[i];
                if (l5Var.e()) {
                    break;
                }
                l5Var.accept(d);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                l5Var.accept(dArr[i]);
                i++;
            }
        }
        l5Var.end();
    }
}
