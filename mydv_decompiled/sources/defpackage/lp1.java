package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lp1 {
    public mp1 a;
    public Surface b;
    public ExoPlayer c;
    public tm1 d;

    public final boolean a(ExoPlayer exoPlayer) {
        tm1 tm1Var;
        exoPlayer.getClass();
        this.c = exoPlayer;
        Surface surface = this.b;
        boolean z = false;
        if (surface == null) {
            return false;
        }
        if (e21.d != exoPlayer || e21.e != surface) {
            e21.d = exoPlayer;
            e21.e = surface;
            exoPlayer.setVideoSurface(surface);
        }
        if (e21.d == exoPlayer && e21.e == surface) {
            z = true;
        }
        if (z && (tm1Var = this.d) != null) {
            tm1Var.invoke(Boolean.TRUE);
        }
        return z;
    }

    public final boolean b() {
        Surface surface;
        ExoPlayer exoPlayer = this.c;
        if (exoPlayer == null || (surface = this.b) == null) {
            return false;
        }
        if (e21.d == exoPlayer && e21.e == surface) {
            e21.d = null;
            e21.e = null;
            exoPlayer.setVideoSurface(null);
        }
        this.c = null;
        return true;
    }

    public final void c(tm1 tm1Var) {
        this.d = tm1Var;
    }

    public final void d(final int i, final int i2) {
        mp1 mp1Var;
        mp1 mp1Var2 = this.a;
        if (mp1Var2 != null) {
            xn5 xn5Var = mp1Var2.K;
            xn5Var.getClass();
            if (i <= 0 || i2 <= 0) {
                return;
            }
            if (xn5Var.W == i && xn5Var.X == i2) {
                return;
            }
            xn5Var.W = i;
            xn5Var.X = i2;
            final SurfaceTexture surfaceTexture = xn5Var.U;
            if (surfaceTexture == null || (mp1Var = xn5Var.I) == null) {
                return;
            }
            mp1Var.queueEvent(new Runnable() { // from class: wn5
                @Override // java.lang.Runnable
                public final void run() {
                    SurfaceTexture surfaceTexture2 = surfaceTexture;
                    int i3 = i;
                    int i4 = i2;
                    try {
                        surfaceTexture2.setDefaultBufferSize(i3, i4);
                    } catch (Exception e) {
                        Log.w("GlVideoSurfaceView", r7.x(i3, i4, "setDefaultBufferSize 失败: ", "x"), e);
                    }
                }
            });
        }
    }
}
