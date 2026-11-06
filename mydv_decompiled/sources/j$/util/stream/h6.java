package j$.util.stream;

import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class h6 extends z5 {
    public ArrayList d;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        this.d.add(obj);
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final void c(long j) {
        if (j < 2147483639) {
            this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
        } else {
            j$.time.h.c("Stream size exceeds max array size");
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final void end() {
        List.EL.sort(this.d, this.b);
        long size = this.d.size();
        l5 l5Var = this.a;
        l5Var.c(size);
        boolean z = this.c;
        ArrayList arrayList = this.d;
        if (z) {
            int size2 = arrayList.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayList.get(i);
                i++;
                if (l5Var.e()) {
                    break;
                } else {
                    l5Var.n((l5) obj);
                }
            }
        } else {
            Objects.requireNonNull(l5Var);
            j$.time.a.P(arrayList, new j$.util.p((byte) 7, l5Var));
        }
        l5Var.end();
        this.d = null;
    }
}
