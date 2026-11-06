package defpackage;

import android.util.Log;
import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class no5 implements ag1 {
    public final /* synthetic */ ExoPlayer I;
    public final /* synthetic */ ExoPlayer J;
    public final /* synthetic */ t43 K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ t43 M;

    public no5(ExoPlayer exoPlayer, ExoPlayer exoPlayer2, t43 t43Var, t43 t43Var2, t43 t43Var3) {
        this.I = exoPlayer;
        this.J = exoPlayer2;
        this.K = t43Var;
        this.L = t43Var2;
        this.M = t43Var3;
    }

    @Override // defpackage.ag1
    public final Object emit(Object obj, fj0 fj0Var) {
        gb5 gb5Var = (gb5) obj;
        boolean booleanValue = ((Boolean) gb5Var.I).booleanValue();
        boolean booleanValue2 = ((Boolean) gb5Var.J).booleanValue();
        boolean booleanValue3 = ((Boolean) gb5Var.K).booleanValue();
        boolean z = this.I != null;
        boolean z2 = ro5.a;
        Log.d("VideoPlayer", "isPlaying changed to: " + booleanValue + ", surfaceBound=" + booleanValue2 + ", shared=" + z + ", url=" + jx4.f0(60, (String) this.L.getValue()));
        wd5 wd5Var = wd5.a;
        ExoPlayer exoPlayer = this.J;
        if (!booleanValue) {
            exoPlayer.setPlayWhenReady(false);
            exoPlayer.pause();
            return wd5Var;
        }
        if (!booleanValue2) {
            return wd5Var;
        }
        if (booleanValue3) {
            exoPlayer.seekToDefaultPosition();
        }
        Object value = this.M.getValue();
        if (!booleanValue3 && value != null) {
            t43 t43Var = this.K;
            if (!j42.c(t43Var.getValue(), value)) {
                t43Var.setValue(value);
                exoPlayer.seekTo(exoPlayer.getCurrentPosition());
            }
        }
        exoPlayer.setPlayWhenReady(true);
        exoPlayer.play();
        return wd5Var;
    }
}
