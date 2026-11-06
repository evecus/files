package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class l6 extends z5 {
    public Object[] d;
    public int e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final void c(long j) {
        if (j < 2147483639) {
            this.d = new Object[(int) j];
        } else {
            j$.time.h.c("Stream size exceeds max array size");
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final void end() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        l5 l5Var = this.a;
        l5Var.c(j);
        if (this.c) {
            while (i < this.e && !l5Var.e()) {
                l5Var.accept((l5) this.d[i]);
                i++;
            }
        } else {
            while (i < this.e) {
                l5Var.accept((l5) this.d[i]);
                i++;
            }
        }
        l5Var.end();
        this.d = null;
    }
}
