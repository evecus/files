package defpackage;

import android.util.Log;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class oo5 implements zx0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ fp3 b;
    public final /* synthetic */ ExoPlayer c;
    public final /* synthetic */ t43 d;

    public oo5(boolean z, fp3 fp3Var, ExoPlayer exoPlayer, t43 t43Var) {
        this.a = z;
        this.b = fp3Var;
        this.c = exoPlayer;
        this.d = t43Var;
    }

    @Override // defpackage.zx0
    public final void dispose() {
        boolean z = this.a;
        if (!z) {
            wi4.b--;
        }
        fp3 fp3Var = this.b;
        PlayerView playerView = fp3Var.a;
        if (playerView != null) {
            playerView.setPlayer(null);
        }
        fp3Var.a = null;
        ExoPlayer exoPlayer = this.c;
        if (z) {
            exoPlayer.setPlayWhenReady(false);
            exoPlayer.pause();
            Log.d("VideoPlayer", "释放独立播放器");
            exoPlayer.release();
            return;
        }
        if (!((Boolean) this.d.getValue()).booleanValue() || wi4.b > 0) {
            return;
        }
        exoPlayer.setPlayWhenReady(false);
        exoPlayer.pause();
    }
}
