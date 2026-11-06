package defpackage;

import android.os.Looper;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class u33 {
    public static final Object h = new Object();
    public final Object a;
    public final z84 b;
    public volatile Object c;
    public volatile Object d;
    public boolean e;
    public boolean f;
    public final bl g;

    public u33() {
        dg3 dg3Var = uu2.M;
        this.a = new Object();
        this.b = new z84();
        this.d = h;
        this.g = new bl(this, (byte) 5);
    }

    public final void a(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.d == h;
            this.d = obj;
        }
        if (z) {
            gp.u().v(this.g);
        }
    }

    public final void b(Object obj) {
        gp.u().getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            zy.i("Cannot invoke setValue on a background thread");
            return;
        }
        this.c = obj;
        if (this.e) {
            this.f = true;
            return;
        }
        this.e = true;
        do {
            this.f = false;
            this.b.c();
        } while (this.f);
        this.e = false;
    }
}
