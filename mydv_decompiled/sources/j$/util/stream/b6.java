package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class b6 extends x5 {
    public q6 c;

    @Override // j$.util.stream.j5, j$.util.stream.l5
    public final void accept(int i) {
        this.c.accept(i);
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public final void c(long j) {
        if (j < 2147483639) {
            this.c = j > 0 ? new q6((int) j) : new q6();
        } else {
            j$.time.h.c("Stream size exceeds max array size");
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public final void end() {
        int[] iArr = (int[]) this.c.b();
        Arrays.sort(iArr);
        long length = iArr.length;
        l5 l5Var = this.a;
        l5Var.c(length);
        int i = 0;
        if (this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                int i2 = iArr[i];
                if (l5Var.e()) {
                    break;
                }
                l5Var.accept(i2);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                l5Var.accept(iArr[i]);
                i++;
            }
        }
        l5Var.end();
    }
}
