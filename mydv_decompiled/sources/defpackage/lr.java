package defpackage;

import android.content.Context;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import androidx.media3.common.VideoSize;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.common.util.WakeLockManager;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.analytics.MediaMetricsListener;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class lr implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ lr(NetworkTypeObserver networkTypeObserver, Context context) {
        this.I = (byte) 11;
        this.K = networkTypeObserver;
        this.J = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        Object obj = this.K;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                AudioManagerCompat.lambda$getAudioManager$0((Context) obj2, (ConditionVariable) obj);
                break;
            case 1:
                ((AudioRendererEventListener.EventDispatcher) obj2).lambda$enabled$0((DecoderCounters) obj);
                break;
            case 2:
                ((AudioRendererEventListener.EventDispatcher) obj2).lambda$audioTrackInitialized$10((AudioSink.AudioTrackConfig) obj);
                break;
            case 3:
                ((BackgroundThreadStateHandler) obj2).lambda$setStateInBackground$2(obj);
                break;
            case 4:
                nk nkVar = (nk) obj2;
                nkVar.I.a(new xb0((je3) obj, nkVar));
                break;
            case 5:
                ((MediaMetricsListener) obj2).lambda$finishCurrentSession$4((PlaybackMetrics) obj);
                break;
            case 6:
                ((MediaMetricsListener) obj2).lambda$maybeReportPlaybackStateChange$2((PlaybackStateEvent) obj);
                break;
            case 7:
                ((MediaMetricsListener) obj2).lambda$reportTrackChangeEvent$3((TrackChangeEvent) obj);
                break;
            case 8:
                ((MediaMetricsListener) obj2).lambda$maybeReportNetworkChange$1((NetworkEvent) obj);
                break;
            case 9:
                ((MediaMetricsListener) obj2).lambda$maybeReportPlaybackError$0((PlaybackErrorEvent) obj);
                break;
            case 10:
                ((Consumer) obj2).accept((MediaSourceEventListener) obj);
                break;
            case 11:
                ((NetworkTypeObserver) obj).lambda$new$0((Context) obj2);
                break;
            case 12:
                ((VideoRendererEventListener.EventDispatcher) obj2).lambda$videoSizeChanged$5((VideoSize) obj);
                break;
            case 13:
                ((VideoRendererEventListener.EventDispatcher) obj2).lambda$enabled$0((DecoderCounters) obj);
                break;
            case 14:
                ((WakeLockManager) obj2).lambda$postUpdateWakeLock$1((AtomicBoolean) obj);
                break;
            default:
                jz5 jz5Var = (jz5) obj2;
                li2 li2Var = (li2) obj;
                if (!jz5Var.K) {
                    jz5Var.L = li2Var;
                    li2Var.a(jz5Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ lr(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }
}
