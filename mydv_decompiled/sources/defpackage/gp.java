package defpackage;

import android.os.Looper;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gp extends li4 {
    public static volatile gp c;
    public static final fp d = new fp((byte) 0);
    public final ys0 b = new ys0();

    public static gp u() {
        if (c != null) {
            return c;
        }
        synchronized (gp.class) {
            try {
                if (c == null) {
                    c = new gp();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public final void v(Runnable runnable) {
        ys0 ys0Var = this.b;
        if (ys0Var.d == null) {
            synchronized (ys0Var.b) {
                try {
                    if (ys0Var.d == null) {
                        ys0Var.d = ys0.u(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        ys0Var.d.post(runnable);
    }
}
