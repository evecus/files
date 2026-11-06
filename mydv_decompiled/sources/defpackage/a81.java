package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class a81 implements Runnable {
    public final ArrayList I;
    public final byte J;

    /* JADX WARN: Multi-variable type inference failed */
    public a81(List list, int i, Throwable th) {
        sv2.q(list, "initCallbacks cannot be null");
        this.I = new ArrayList(list);
        this.J = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i = 0;
        if (this.J != 1) {
            while (i < size) {
                ((z71) arrayList.get(i)).a();
                i++;
            }
        } else {
            while (i < size) {
                ((z71) arrayList.get(i)).b();
                i++;
            }
        }
    }
}
