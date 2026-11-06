package defpackage;

import android.net.Uri;
import android.util.Log;
import androidx.media3.common.MediaItem;
import androidx.media3.common.VideoSize;
import androidx.media3.datasource.okhttp.OkHttpDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class mo5 extends k05 implements hn1 {
    public final /* synthetic */ String I;
    public final /* synthetic */ ExoPlayer J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ long O;
    public final /* synthetic */ t43 P;
    public final /* synthetic */ t43 Q;
    public final /* synthetic */ boolean R;
    public final /* synthetic */ boolean S;
    public final /* synthetic */ OkHttpClient T;
    public final /* synthetic */ boolean U;
    public final /* synthetic */ t43 V;
    public final /* synthetic */ t43 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo5(String str, ExoPlayer exoPlayer, Object obj, t43 t43Var, t43 t43Var2, t43 t43Var3, long j, t43 t43Var4, t43 t43Var5, boolean z, boolean z2, OkHttpClient okHttpClient, boolean z3, t43 t43Var6, t43 t43Var7, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = str;
        this.J = exoPlayer;
        this.K = obj;
        this.L = t43Var;
        this.M = t43Var2;
        this.N = t43Var3;
        this.O = j;
        this.P = t43Var4;
        this.Q = t43Var5;
        this.R = z;
        this.S = z2;
        this.T = okHttpClient;
        this.U = z3;
        this.V = t43Var6;
        this.W = t43Var7;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new mo5(this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        mo5 mo5Var = (mo5) create((dl0) obj, (fj0) obj2);
        wd5 wd5Var = wd5.a;
        mo5Var.invokeSuspend(wd5Var);
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        wd5 wd5Var;
        OkHttpClient okHttpClient;
        MediaItem.LocalConfiguration localConfiguration;
        Uri uri;
        mu0.V(obj);
        String str = this.I;
        int length = str.length();
        wd5 wd5Var2 = wd5.a;
        if (length <= 0) {
            return wd5Var2;
        }
        ExoPlayer exoPlayer = this.J;
        MediaItem currentMediaItem = exoPlayer.getCurrentMediaItem();
        String uri2 = (currentMediaItem == null || (localConfiguration = currentMediaItem.localConfiguration) == null || (uri = localConfiguration.uri) == null) ? null : uri.toString();
        Object obj2 = this.K;
        uj3 uj3Var = new uj3(obj2, str);
        t43 t43Var = this.V;
        long j = this.O;
        t43 t43Var2 = this.N;
        t43 t43Var3 = this.M;
        t43 t43Var4 = this.L;
        if (obj2 != null && j42.c((uj3) t92.a.get(exoPlayer), uj3Var) && j42.c(uri2, str)) {
            wd5Var = wd5Var2;
            if (exoPlayer.getPlaybackState() != 1) {
                Log.d("VideoPlayer", "跳过重复派发: url=" + jx4.f0(60, str) + ", attempt=" + obj2);
                t43Var4.setValue(str);
                t43Var3.setValue(obj2);
                VideoSize videoSize = exoPlayer.getVideoSize();
                videoSize.getClass();
                t43Var2.setValue(Boolean.valueOf(videoSize.width > 0 && videoSize.height > 0));
                if (!exoPlayer.isPlaying() && j > 0) {
                    exoPlayer.seekTo(j);
                }
                if (((Boolean) this.P.getValue()).booleanValue()) {
                    return wd5Var;
                }
                if (exoPlayer.isPlaying() && ((Boolean) t43Var2.getValue()).booleanValue()) {
                    this.Q.setValue(Boolean.TRUE);
                    return wd5Var;
                }
                boolean z = ro5.a;
                tm1 tm1Var = (tm1) t43Var.getValue();
                if (tm1Var == null) {
                    return wd5Var;
                }
                tm1Var.invoke(obj2);
                return wd5Var;
            }
        } else {
            wd5Var = wd5Var2;
        }
        boolean z2 = this.R;
        if (obj2 != null && ((CharSequence) t43Var4.getValue()).length() == 0 && !z2 && j42.c(uri2, str) && exoPlayer.getPlaybackState() != 1) {
            Log.d("VideoPlayer", "复用预缓冲: url=".concat(jx4.f0(60, str)));
            t43Var4.setValue(str);
            t43Var3.setValue(obj2);
            t92.a.put(exoPlayer, uj3Var);
            VideoSize videoSize2 = exoPlayer.getVideoSize();
            videoSize2.getClass();
            t43Var2.setValue(Boolean.valueOf(videoSize2.width > 0 && videoSize2.height > 0));
            if (j > 0) {
                exoPlayer.seekTo(j);
            }
            boolean z3 = ro5.a;
            tm1 tm1Var2 = (tm1) t43Var.getValue();
            if (tm1Var2 == null) {
                return wd5Var;
            }
            tm1Var2.invoke(obj2);
            return wd5Var;
        }
        Log.d("VideoPlayer", "加载视频: " + jx4.f0(120, str) + ", attempt=" + obj2);
        if (obj2 != null) {
            exoPlayer.stop();
            exoPlayer.clearMediaItems();
        } else if (z2) {
            exoPlayer.stop();
        }
        t43Var4.setValue(str);
        t43Var3.setValue(obj2);
        t92.a.put(exoPlayer, uj3Var);
        boolean z4 = ro5.a;
        MediaItem fromUri = MediaItem.fromUri(str);
        fromUri.getClass();
        if (!this.S || (okHttpClient = this.T) == null) {
            exoPlayer.setMediaItem(fromUri);
        } else {
            sn5 sn5Var = sn5.a;
            MediaSource createMediaSource = new DefaultMediaSourceFactory(new OkHttpDataSource.Factory(okHttpClient)).createMediaSource(fromUri);
            createMediaSource.getClass();
            exoPlayer.setMediaSource(createMediaSource);
        }
        exoPlayer.prepare();
        tm1 tm1Var3 = (tm1) t43Var.getValue();
        if (tm1Var3 != null) {
            tm1Var3.invoke(obj2);
        }
        if (j > 0) {
            exoPlayer.seekTo(j);
        }
        if (!this.U || !((Boolean) this.W.getValue()).booleanValue()) {
            return wd5Var;
        }
        exoPlayer.setPlayWhenReady(true);
        exoPlayer.play();
        return wd5Var;
    }
}
