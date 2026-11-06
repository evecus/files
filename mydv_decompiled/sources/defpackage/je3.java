package defpackage;

import android.window.OnBackInvokedDispatcher;
import androidx.media3.common.PlaybackException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class je3 {
    public final Runnable a;
    public final u05 b = new u05(new eq(this, 25));

    public je3(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(vi2 vi2Var, ee3 ee3Var) {
        ee3Var.getClass();
        final li2 k = vi2Var.k();
        if (((xi2) k).i == ki2.I) {
            return;
        }
        de3 de3Var = new de3(ee3Var, new fe3(vi2Var, ee3Var));
        ee3Var.a.add(de3Var);
        de3Var.g(false);
        ts0.b(b().c, de3Var);
        final gs0 gs0Var = new gs0(de3Var, this, k);
        k.a(gs0Var);
        ee3Var.c.add(new AutoCloseable() { // from class: ge3
            @Override // java.lang.AutoCloseable
            public final void close() {
                li2.this.b(gs0Var);
            }
        });
    }

    public final he3 b() {
        return (he3) this.b.getValue();
    }

    public final void c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        b().c.e(new zd3(onBackInvokedDispatcher, 0), 1);
        b().c.e(new zd3(onBackInvokedDispatcher, PlaybackException.CUSTOM_ERROR_CODE_BASE), 0);
    }
}
