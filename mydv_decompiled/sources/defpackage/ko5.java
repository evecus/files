package defpackage;

import android.net.Uri;
import android.util.Log;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ko5 implements Player.Listener {
    public final /* synthetic */ t43 I;
    public final /* synthetic */ t43 J;
    public final /* synthetic */ ExoPlayer K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ t43 P;
    public final /* synthetic */ t43 Q;
    public final /* synthetic */ t43 R;
    public final /* synthetic */ t43 S;
    public final /* synthetic */ t43 T;
    public final /* synthetic */ t43 U;
    public final /* synthetic */ String V;
    public final /* synthetic */ t43 W;
    public final /* synthetic */ t43 X;
    public final /* synthetic */ t43 Y;
    public final /* synthetic */ lp1 Z;
    public final /* synthetic */ fp3 a0;
    public final /* synthetic */ t43 b0;
    public final /* synthetic */ t43 c0;
    public final /* synthetic */ t43 d0;

    public ko5(t43 t43Var, t43 t43Var2, ExoPlayer exoPlayer, t43 t43Var3, t43 t43Var4, t43 t43Var5, t43 t43Var6, t43 t43Var7, t43 t43Var8, t43 t43Var9, t43 t43Var10, t43 t43Var11, t43 t43Var12, String str, t43 t43Var13, t43 t43Var14, t43 t43Var15, lp1 lp1Var, fp3 fp3Var, t43 t43Var16, t43 t43Var17, t43 t43Var18) {
        this.I = t43Var;
        this.J = t43Var2;
        this.K = exoPlayer;
        this.L = t43Var3;
        this.M = t43Var4;
        this.N = t43Var5;
        this.O = t43Var6;
        this.P = t43Var7;
        this.Q = t43Var8;
        this.R = t43Var9;
        this.S = t43Var10;
        this.T = t43Var11;
        this.U = t43Var12;
        this.V = str;
        this.W = t43Var13;
        this.X = t43Var14;
        this.Y = t43Var15;
        this.Z = lp1Var;
        this.a0 = fp3Var;
        this.b0 = t43Var16;
        this.c0 = t43Var17;
        this.d0 = t43Var18;
    }

    public static final void a(boolean z, PlaybackException playbackException, t43 t43Var, t43 t43Var2, String str) {
        if (z) {
            boolean z2 = ro5.a;
            rm1 rm1Var = (rm1) t43Var.getValue();
            if (rm1Var != null && ((Boolean) rm1Var.invoke()).booleanValue()) {
                Log.w("VideoPlayer", "视频解码失败，已切换到 H.264 档位重载");
                return;
            }
        }
        boolean z3 = ro5.a;
        tm1 tm1Var = (tm1) t43Var2.getValue();
        if (tm1Var != null) {
            if (str == null && (str = playbackException.getMessage()) == null) {
                str = "播放失败";
            }
            tm1Var.invoke(str);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsPlayingChanged(boolean z) {
        MediaItem.LocalConfiguration localConfiguration;
        Uri uri;
        MediaItem currentMediaItem = this.K.getCurrentMediaItem();
        this.L.setValue(Boolean.valueOf(z && j42.c((currentMediaItem == null || (localConfiguration = currentMediaItem.localConfiguration) == null || (uri = localConfiguration.uri) == null) ? null : uri.toString(), this.I.getValue()) && ((Boolean) this.M.getValue()).booleanValue()));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i) {
        Log.d("VideoPlayer", "playbackState=" + i + ", url=" + jx4.f0(80, (String) this.I.getValue()));
        if (i == 4) {
            ((rm1) this.J.getValue()).invoke();
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) {
        boolean z;
        playbackException.getClass();
        Log.e("VideoPlayer", "播放失败: code=" + playbackException.errorCode + ", msg=" + playbackException.getMessage(), playbackException);
        tm1 tm1Var = (tm1) this.P.getValue();
        t43 t43Var = this.N;
        if (tm1Var != null) {
            tm1Var.invoke(t43Var.getValue());
        }
        Throwable th = playbackException;
        while (true) {
            if (th == null) {
                z = false;
                break;
            } else {
                if (th instanceof MediaCodecVideoDecoderException) {
                    z = true;
                    break;
                }
                th = th.getCause();
            }
        }
        boolean booleanValue = ((Boolean) this.Q.getValue()).booleanValue();
        t43 t43Var2 = this.S;
        t43 t43Var3 = this.R;
        if (!booleanValue) {
            a(z, playbackException, t43Var3, t43Var2, null);
            return;
        }
        t43 t43Var4 = this.O;
        if (((Boolean) t43Var4.getValue()).booleanValue()) {
            a(z, playbackException, t43Var3, t43Var2, null);
            return;
        }
        t43Var4.setValue(Boolean.TRUE);
        try {
            this.K.prepare();
            tm1 tm1Var2 = (tm1) this.T.getValue();
            if (tm1Var2 != null) {
                tm1Var2.invoke(t43Var.getValue());
            }
        } catch (Exception e) {
            Log.e("VideoPlayer", "重试也失败", e);
            a(z, playbackException, t43Var3, t43Var2, e.getMessage());
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onRenderedFirstFrame() {
        MediaItem.LocalConfiguration localConfiguration;
        Uri uri;
        ExoPlayer exoPlayer = this.K;
        MediaItem currentMediaItem = exoPlayer.getCurrentMediaItem();
        String uri2 = (currentMediaItem == null || (localConfiguration = currentMediaItem.localConfiguration) == null || (uri = localConfiguration.uri) == null) ? null : uri.toString();
        t43 t43Var = this.I;
        if (j42.c(uri2, t43Var.getValue())) {
            Log.d("VideoPlayer", "First frame rendered for url=".concat(jx4.f0(60, (String) t43Var.getValue())));
            this.L.setValue(Boolean.FALSE);
            ro5.d(this.U, exoPlayer, this.V, "rendered");
            ro5.e(this.W, this.N, this.X, this.Y);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(VideoSize videoSize) {
        MediaItem.LocalConfiguration localConfiguration;
        Uri uri;
        videoSize.getClass();
        if (videoSize.width <= 0 || videoSize.height <= 0) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        this.M.setValue(bool);
        int i = videoSize.width;
        int i2 = videoSize.height;
        t43 t43Var = this.I;
        String f0 = jx4.f0(60, (String) t43Var.getValue());
        StringBuilder D = hf1.D("Video size changed to ", i, "x", i2, " for url=");
        D.append(f0);
        Log.d("VideoPlayer", D.toString());
        int i3 = videoSize.width;
        int i4 = videoSize.height;
        float f = videoSize.pixelWidthHeightRatio;
        fp3 fp3Var = this.a0;
        ro5.b(fp3Var, this.b0, i3, i4, f);
        ro5.c(fp3Var, this.c0, videoSize.width, videoSize.height, ((Boolean) zz4.a.getValue()).booleanValue());
        this.Z.d(videoSize.width, videoSize.height);
        hn1 hn1Var = (hn1) this.d0.getValue();
        if (hn1Var != null) {
            hn1Var.invoke(Integer.valueOf(videoSize.width), Integer.valueOf(videoSize.height));
        }
        ExoPlayer exoPlayer = this.K;
        MediaItem currentMediaItem = exoPlayer.getCurrentMediaItem();
        String uri2 = (currentMediaItem == null || (localConfiguration = currentMediaItem.localConfiguration) == null || (uri = localConfiguration.uri) == null) ? null : uri.toString();
        if (exoPlayer.isPlaying() && j42.c(uri2, t43Var.getValue())) {
            this.L.setValue(bool);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onCues(List list) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAudioAttributesChanged(AudioAttributes audioAttributes) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAudioSessionIdChanged(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAvailableCommandsChanged(Player.Commands commands) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onCues(CueGroup cueGroup) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onDeviceInfoChanged(DeviceInfo deviceInfo) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsLoadingChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onLoadingChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMaxSeekToPreviousPositionChanged(long j) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMetadata(Metadata metadata) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPositionDiscontinuity(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onRepeatModeChanged(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSeekBackIncrementChanged(long j) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSeekForwardIncrementChanged(long j) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSkipSilenceEnabledChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTracksChanged(Tracks tracks) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVolumeChanged(float f) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onDeviceVolumeChanged(int i, boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onEvents(Player player, Player.Events events) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMediaItemTransition(MediaItem mediaItem, int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayWhenReadyChanged(boolean z, int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerStateChanged(boolean z, int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSurfaceSizeChanged(int i, int i2) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTimelineChanged(Timeline timeline, int i) {
    }
}
