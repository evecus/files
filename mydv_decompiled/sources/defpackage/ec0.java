package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.media3.exoplayer.Renderer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ec0 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long I = SystemClock.uptimeMillis() + Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
    public Runnable J;
    public boolean K;
    public final /* synthetic */ nk L;

    public ec0(nk nkVar) {
        this.L = nkVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.J = runnable;
        View decorView = this.L.getWindow().getDecorView();
        decorView.getClass();
        if (!this.K) {
            decorView.postOnAnimation(new h(this, (byte) 6));
        } else if (j42.c(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        Runnable runnable = this.J;
        nk nkVar = this.L;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.I) {
                this.K = false;
                nkVar.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.J = null;
        if (((qm1) nkVar.O.getValue()).b()) {
            this.K = false;
            nkVar.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.L.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
