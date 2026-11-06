package androidx.media3.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.PowerManager;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
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
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ts.TsExtractor;
import defpackage.sp0;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WearUnsuitableOutputPlaybackSuppressionResolverListener implements Player.Listener {
    public static final long DEFAULT_PLAYBACK_SUPPRESSION_AUTO_RESUME_TIMEOUT_MS = 300000;
    private static final String EXTRA_BLUETOOTH_SETTINGS_CLOSE_ON_CONNECT = "EXTRA_CLOSE_ON_CONNECT";
    private static final String EXTRA_BLUETOOTH_SETTINGS_CONNECTION_ONLY = "EXTRA_CONNECTION_ONLY";
    private static final String EXTRA_BLUETOOTH_SETTINGS_FILTER_TYPE = "android.bluetooth.devicepicker.extra.FILTER_TYPE";
    private static final String EXTRA_OUTPUT_SWITCHER_PACKAGE_NAME = "com.android.settings.panel.extra.PACKAGE_NAME";
    private static final int FILTER_TYPE_AUDIO = 1;
    private static final String OUTPUT_SWITCHER_INTENT_ACTION_NAME = "com.android.settings.panel.action.MEDIA_OUTPUT";
    private static final String WAKE_LOCK_TAG = "WearUnsuitableOutputPlaybackSuppressionResolverListener:WakeLock";
    private final Context applicationContext;
    private final long autoResumeTimeoutAfterUnsuitableOutputSuppressionMs;
    private final Clock clock;
    private long unsuitableOutputPlaybackSuppressionStartRealtimeMs;
    private final PowerManager.WakeLock wakeLock;

    public WearUnsuitableOutputPlaybackSuppressionResolverListener(Context context, long j, Clock clock) {
        PowerManager.WakeLock wakeLock;
        sp0.o(j >= 0);
        Context applicationContext = context.getApplicationContext();
        this.applicationContext = applicationContext;
        this.autoResumeTimeoutAfterUnsuitableOutputSuppressionMs = j;
        this.clock = clock;
        this.unsuitableOutputPlaybackSuppressionStartRealtimeMs = C.TIME_UNSET;
        PowerManager powerManager = (PowerManager) applicationContext.getSystemService("power");
        if (powerManager != null) {
            wakeLock = powerManager.newWakeLock(1, WAKE_LOCK_TAG);
            wakeLock.setReferenceCounted(false);
        } else {
            wakeLock = null;
        }
        this.wakeLock = wakeLock;
    }

    private static ComponentName getSystemOrSystemUpdatedAppComponent(Context context, Intent intent) {
        ApplicationInfo applicationInfo;
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & TsExtractor.TS_STREAM_TYPE_AC3) != 0) {
                return new ComponentName(activityInfo.packageName, activityInfo.name);
            }
        }
        return null;
    }

    private static void launchSystemMediaOutputSwitcherUi(Context context) {
        Intent putExtra = new Intent(OUTPUT_SWITCHER_INTENT_ACTION_NAME).addFlags(268435456).putExtra(EXTRA_OUTPUT_SWITCHER_PACKAGE_NAME, context.getPackageName());
        ComponentName systemOrSystemUpdatedAppComponent = getSystemOrSystemUpdatedAppComponent(context, putExtra);
        if (systemOrSystemUpdatedAppComponent != null) {
            putExtra.setComponent(systemOrSystemUpdatedAppComponent);
            context.startActivity(putExtra);
            return;
        }
        Intent putExtra2 = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra(EXTRA_BLUETOOTH_SETTINGS_CLOSE_ON_CONNECT, true).putExtra(EXTRA_BLUETOOTH_SETTINGS_CONNECTION_ONLY, true).putExtra(EXTRA_BLUETOOTH_SETTINGS_FILTER_TYPE, 1);
        ComponentName systemOrSystemUpdatedAppComponent2 = getSystemOrSystemUpdatedAppComponent(context, putExtra2);
        if (systemOrSystemUpdatedAppComponent2 != null) {
            putExtra2.setComponent(systemOrSystemUpdatedAppComponent2);
            context.startActivity(putExtra2);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public void onEvents(Player player, Player.Events events) {
        if (Util.isWear(this.applicationContext)) {
            if ((events.contains(6) || events.contains(5)) && player.getPlayWhenReady() && player.getPlaybackSuppressionReason() == 3) {
                player.pause();
                this.unsuitableOutputPlaybackSuppressionStartRealtimeMs = this.clock.elapsedRealtime();
                PowerManager.WakeLock wakeLock = this.wakeLock;
                if (wakeLock != null && !wakeLock.isHeld()) {
                    this.wakeLock.acquire(this.autoResumeTimeoutAfterUnsuitableOutputSuppressionMs);
                }
                if (events.contains(5)) {
                    launchSystemMediaOutputSwitcherUi(this.applicationContext);
                    return;
                }
                return;
            }
            if (!events.contains(6) || player.getPlaybackSuppressionReason() != 0 || this.unsuitableOutputPlaybackSuppressionStartRealtimeMs == C.TIME_UNSET || this.clock.elapsedRealtime() - this.unsuitableOutputPlaybackSuppressionStartRealtimeMs >= this.autoResumeTimeoutAfterUnsuitableOutputSuppressionMs) {
                return;
            }
            this.unsuitableOutputPlaybackSuppressionStartRealtimeMs = C.TIME_UNSET;
            player.play();
            PowerManager.WakeLock wakeLock2 = this.wakeLock;
            if (wakeLock2 != null) {
                wakeLock2.release();
            }
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onCues(List list) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onRenderedFirstFrame() {
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
    public final void onIsPlayingChanged(boolean z) {
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
    public final void onPlaybackStateChanged(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) {
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
    public final void onVideoSizeChanged(VideoSize videoSize) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVolumeChanged(float f) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onDeviceVolumeChanged(int i, boolean z) {
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

    public WearUnsuitableOutputPlaybackSuppressionResolverListener(Context context, long j) {
        this(context, j, Clock.DEFAULT);
    }

    public WearUnsuitableOutputPlaybackSuppressionResolverListener(Context context) {
        this(context, DEFAULT_PLAYBACK_SUPPRESSION_AUTO_RESUME_TIMEOUT_MS);
    }
}
