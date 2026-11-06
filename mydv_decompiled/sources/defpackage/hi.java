package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hi implements Drawable.Callback {
    public final /* synthetic */ byte I;
    public Object J;

    public /* synthetic */ hi(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.I) {
            case 0:
                ((ki) this.J).invalidateSelf();
                break;
            case 1:
                break;
            default:
                drawable.getClass();
                f41 f41Var = (f41) this.J;
                jk3 jk3Var = f41Var.J;
                jk3Var.setValue(Integer.valueOf(((Number) jk3Var.getValue()).intValue() + 1));
                f41Var.K.setValue(new fq4(g41.a(f41Var.I)));
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.I) {
            case 0:
                ((ki) this.J).scheduleSelf(runnable, j);
                break;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.J;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    break;
                }
                break;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) g41.a.getValue()).postAtTime(runnable, j);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.I) {
            case 0:
                ((ki) this.J).unscheduleSelf(runnable);
                break;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.J;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) g41.a.getValue()).removeCallbacks(runnable);
                break;
        }
    }

    private final void a(Drawable drawable) {
    }
}
