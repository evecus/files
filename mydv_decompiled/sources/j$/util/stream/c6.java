package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class c6 extends y5 {
    public s6 c;

    @Override // j$.util.stream.k5, j$.util.stream.l5
    public final void accept(long j) {
        this.c.accept(j);
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final void c(long j) {
        if (j < 2147483639) {
            this.c = j > 0 ? new s6((int) j) : new s6();
        } else {
            j$.time.h.c("Stream size exceeds max array size");
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final void end() {
        long[] jArr = (long[]) this.c.b();
        Arrays.sort(jArr);
        long length = jArr.length;
        l5 l5Var = this.a;
        l5Var.c(length);
        int i = 0;
        if (this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                if (l5Var.e()) {
                    break;
                }
                l5Var.accept(j);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                l5Var.accept(jArr[i]);
                i++;
            }
        }
        l5Var.end();
    }
}
