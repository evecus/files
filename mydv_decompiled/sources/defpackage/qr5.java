package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class qr5 {
    public final rr5 a = new rr5();

    public final void l(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        rr5 rr5Var = this.a;
        if (rr5Var.d) {
            rr5.a(autoCloseable);
            return;
        }
        synchronized (rr5Var.a) {
            autoCloseable2 = (AutoCloseable) rr5Var.b.put(str, autoCloseable);
        }
        rr5.a(autoCloseable2);
    }

    public final void m() {
        rr5 rr5Var = this.a;
        if (!rr5Var.d) {
            rr5Var.d = true;
            synchronized (rr5Var.a) {
                try {
                    Iterator it = rr5Var.b.values().iterator();
                    while (it.hasNext()) {
                        rr5.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = rr5Var.c.iterator();
                    while (it2.hasNext()) {
                        rr5.a((AutoCloseable) it2.next());
                    }
                    rr5Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        o();
    }

    public final AutoCloseable n(String str) {
        AutoCloseable autoCloseable;
        rr5 rr5Var = this.a;
        synchronized (rr5Var.a) {
            autoCloseable = (AutoCloseable) rr5Var.b.get(str);
        }
        return autoCloseable;
    }

    public void o() {
    }
}
