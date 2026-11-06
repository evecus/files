package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Handler;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.video.SurfaceHolderFrameWriter;
import androidx.media3.exoplayer.CodecParameters;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.OfflineLicenseHelper;
import androidx.media3.exoplayer.hls.HlsContentSteeringTracker;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.source.preload.PreloadMediaSource;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.ui.PlayerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h8 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ h8(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.I) {
            case 0:
                ((AdsMediaSource) this.J).lambda$onChildSourceInfoRefreshed$2((Timeline) this.K);
                return;
            case 1:
                ub.f((wb) this.J, (LongSparseArray) this.K);
                return;
            case 2:
                vk vkVar = (vk) this.J;
                try {
                    ((Runnable) this.K).run();
                    return;
                } finally {
                    vkVar.a();
                }
            case 3:
                ((AudioRendererEventListener.EventDispatcher) this.J).lambda$audioCodecParametersChanged$13((CodecParameters) this.K);
                return;
            case 4:
                ((AudioRendererEventListener.EventDispatcher) this.J).lambda$disabled$6((DecoderCounters) this.K);
                return;
            case 5:
                ((AudioRendererEventListener.EventDispatcher) this.J).lambda$audioTrackReleased$11((AudioSink.AudioTrackConfig) this.K);
                return;
            case 6:
                ((AudioRendererEventListener.EventDispatcher) this.J).lambda$decoderReleased$5((String) this.K);
                return;
            case 7:
                ((BackgroundThreadStateHandler) this.J).lambda$updateStateAsync$1((pn1) this.K);
                return;
            case 8:
                ((BackgroundThreadStateHandler) this.J).lambda$updateStateAsync$0(this.K);
                return;
            case 9:
                ux5 ux5Var = (ux5) this.J;
                String uuid = ((UUID) this.K).toString();
                uuid.getClass();
                d4.k(ux5Var, uuid);
                return;
            case 10:
                List<du> list = (List) this.J;
                pg0 pg0Var = (pg0) this.K;
                for (du duVar : list) {
                    Object obj = pg0Var.e;
                    eu euVar = duVar.a;
                    Object gh0Var = euVar.e(obj) ? new gh0(euVar.d()) : fh0.a;
                    bu3 bu3Var = duVar.b;
                    bu3Var.getClass();
                    bu3Var.d(gh0Var);
                }
                return;
            case 11:
                ((DownloadHelper) this.J).lambda$onMediaPreparationFailed$2((IOException) this.K);
                return;
            case 12:
                ((DownloadHelper) this.J).lambda$prepare$0((DownloadHelper.Callback) this.K);
                return;
            case 13:
                mp1 mp1Var = (mp1) this.J;
                Surface surface = (Surface) this.K;
                tm1 tm1Var = mp1Var.I;
                if (tm1Var != null) {
                    tm1Var.invoke(surface);
                    return;
                }
                return;
            case 14:
                ((k10) this.J).C((ns1) this.K);
                return;
            case 15:
                ((HlsContentSteeringTracker) this.J).lambda$excludeCurrentPathway$1((String) this.K);
                return;
            case 16:
                ((Handler) this.J).removeCallbacks((mt1) this.K);
                return;
            case 17:
                ((Handler) this.J).removeCallbacks((ru) this.K);
                return;
            case 18:
                ((View) this.J).dispatchKeyEvent((KeyEvent) this.K);
                return;
            case 19:
                ((kx2) this.J).a.dispatchKeyEvent((KeyEvent) this.K);
                return;
            case 20:
                ((OfflineLicenseHelper) this.J).lambda$releaseManagerOnHandlerThread$4((al4) this.K);
                return;
            case 21:
                ((PlayerView) this.J).lambda$onImageAvailable$1((Bitmap) this.K);
                return;
            case 22:
                ((PreloadMediaSource) this.J).lambda$onChildSourceInfoRefreshed$2((Timeline) this.K);
                return;
            case 23:
                yt3 yt3Var = (yt3) this.J;
                nx5 nx5Var = (nx5) this.K;
                synchronized (yt3Var.k) {
                    try {
                        ArrayList arrayList = yt3Var.j;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            ((nb1) obj2).b(nx5Var, false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 24:
                ((lm) this.J).c((Typeface) this.K);
                return;
            case 25:
                ((io4) this.J).c.accept((iw5) this.K);
                return;
            case 26:
                ((SimpleBasePlayer) this.J).lambda$updateStateForPendingOperation$65((fl2) this.K);
                return;
            case 27:
                ((SphericalGLSurfaceView) this.J).lambda$onSurfaceTextureAvailable$1((SurfaceTexture) this.K);
                return;
            case 28:
                ((SurfaceHolderFrameWriter) this.J).lambda$queueInputFrame$6((IOException) this.K);
                return;
            default:
                ((v05) ((mc3) this.J).b).h((wv4) this.K, 3);
                return;
        }
    }
}
