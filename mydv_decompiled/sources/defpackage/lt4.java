package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class lt4 {
    public final AtomicReference a = new AtomicReference(p70.E);
    public final Object b = new Object();
    public Object c;

    public final Object a() {
        long e = li4.e();
        if (e == d75.a) {
            return this.c;
        }
        z65 z65Var = (z65) this.a.get();
        int a = z65Var.a(e);
        if (a >= 0) {
            return z65Var.c[a];
        }
        return null;
    }

    public final void b(Object obj) {
        long e = li4.e();
        if (e == d75.a) {
            this.c = obj;
            return;
        }
        synchronized (this.b) {
            z65 z65Var = (z65) this.a.get();
            int a = z65Var.a(e);
            if (a < 0) {
                this.a.set(z65Var.b(e, obj));
            } else {
                z65Var.c[a] = obj;
            }
        }
    }
}
