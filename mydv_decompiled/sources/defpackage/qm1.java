package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qm1 {
    public final Executor a;
    public final Object b;
    public boolean c;
    public final ArrayList d;

    public qm1(Executor executor, ce ceVar) {
        executor.getClass();
        this.a = executor;
        this.b = new Object();
        this.d = new ArrayList();
    }

    public final void a() {
        synchronized (this.b) {
            try {
                this.c = true;
                ArrayList arrayList = this.d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((rm1) obj).invoke();
                }
                this.d.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.b) {
            z = this.c;
        }
        return z;
    }
}
