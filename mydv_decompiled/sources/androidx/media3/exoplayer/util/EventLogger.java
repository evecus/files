package androidx.media3.exoplayer.util;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Format;
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
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.KeyRequestInfo;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import defpackage.dy1;
import defpackage.g62;
import defpackage.hf1;
import defpackage.r7;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class EventLogger implements AnalyticsListener {
    private static final g62 COMMA_JOINER = new g62(", ");
    private static final String DEFAULT_TAG = "EventLogger";
    private static final int MAX_TIMELINE_ITEM_LINES = 3;
    private static final NumberFormat TIME_FORMAT;
    private final Timeline.Period period;
    private final long startTimeMs;
    private final String tag;
    private final Timeline.Window window;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        TIME_FORMAT = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public EventLogger(String str) {
        this.tag = str;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.startTimeMs = SystemClock.elapsedRealtime();
    }

    private static String channelConfigAsString(int i) {
        switch (i) {
            case 4:
                return "mono";
            case 12:
                return "stereo";
            case 204:
                return "quad";
            case 252:
                return "5.1";
            case 6396:
                return "7.1";
            case 737532:
                return "5.1.4";
            case 743676:
                return "7.1.4";
            case 3145980:
                return "5.1.2";
            case 3152124:
                return "7.1.2";
            case 202070268:
                return "9.1.4";
            case 205215996:
                return "9.1.6";
            default:
                return "0x" + Integer.toHexString(i);
        }
    }

    private static String getAudioTrackConfigString(AudioSink.AudioTrackConfig audioTrackConfig) {
        ArrayList arrayList = new ArrayList();
        if (audioTrackConfig.encoding != -1) {
            arrayList.add("enc=" + Util.getEncodingString(audioTrackConfig.encoding));
        }
        arrayList.add("channelConf=" + channelConfigAsString(audioTrackConfig.channelConfig));
        arrayList.add("sampleRate=" + audioTrackConfig.sampleRate);
        arrayList.add("bufferSize=" + audioTrackConfig.bufferSize);
        if (audioTrackConfig.tunneling) {
            arrayList.add("tunneling");
        }
        if (audioTrackConfig.offload) {
            arrayList.add("offload");
        }
        return COMMA_JOINER.c(arrayList);
    }

    private static String getDiscontinuityReasonString(int i) {
        switch (i) {
            case 0:
                return "AUTO_TRANSITION";
            case 1:
                return "SEEK";
            case 2:
                return "SEEK_ADJUSTMENT";
            case 3:
                return HlsMediaPlaylist.Interstitial.NAVIGATION_RESTRICTION_SKIP;
            case 4:
                return "REMOVE";
            case 5:
                return "INTERNAL";
            case 6:
                return "SILENCE_SKIP";
            default:
                return "?";
        }
    }

    private String getEventString(AnalyticsListener.EventTime eventTime, String str, String str2, Throwable th) {
        String str3 = str + " [" + getEventTimeString(eventTime);
        if (th instanceof PlaybackException) {
            str3 = str3 + ", errorCode=" + ((PlaybackException) th).getErrorCodeName();
        }
        if (str2 != null) {
            str3 = r7.C(str3, ", ", str2);
        }
        String throwableString = Log.getThrowableString(th);
        if (!TextUtils.isEmpty(throwableString)) {
            str3 = str3 + "\n  " + throwableString.replace("\n", "\n  ") + '\n';
        }
        return str3.concat("]");
    }

    private String getEventTimeString(AnalyticsListener.EventTime eventTime) {
        String str = "window=" + eventTime.windowIndex;
        if (eventTime.mediaPeriodId != null) {
            str = str + ", period=" + eventTime.timeline.getIndexOfPeriod(eventTime.mediaPeriodId.periodUid);
            if (eventTime.mediaPeriodId.isAd()) {
                StringBuilder sb = new StringBuilder(str + ", adGroup=" + eventTime.mediaPeriodId.adGroupIndex);
                sb.append(", ad=");
                sb.append(eventTime.mediaPeriodId.adIndexInAdGroup);
                str = sb.toString();
            }
        }
        return "eventTime=" + getTimeString(eventTime.realtimeMs - this.startTimeMs) + ", mediaPos=" + getTimeString(eventTime.eventPlaybackPositionMs) + ", " + str;
    }

    private static String getMediaItemTransitionReasonString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT";
    }

    private static String getPlayWhenReadyChangeReasonString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST";
    }

    private static String getPlaybackSuppressionReasonString(int i) {
        return i != 0 ? i != 1 ? i != 3 ? i != 4 ? "?" : "SCRUBBING" : "UNSUITABLE_AUDIO_OUTPUT" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE";
    }

    private static String getRepeatModeString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "?" : "ALL" : "ONE" : "OFF";
    }

    private static String getStateString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
    }

    private static String getTimeString(long j) {
        return j == C.TIME_UNSET ? "?" : TIME_FORMAT.format(j / 1000.0f);
    }

    private static String getTimelineChangeReasonString(int i) {
        return i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED";
    }

    private static String getTrackStatusString(boolean z) {
        return z ? "[X]" : "[ ]";
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str) {
        logd(getEventString(eventTime, str, null, null));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, Throwable th) {
        loge(getEventString(eventTime, str, null, th));
    }

    private void printInternalError(AnalyticsListener.EventTime eventTime, String str, Exception exc) {
        loge(eventTime, "internalError", str, exc);
    }

    private void printMetadata(Metadata metadata, String str) {
        for (int i = 0; i < metadata.length(); i++) {
            logd(str + metadata.get(i));
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
        logd(eventTime, "audioAttributes", audioAttributes.contentType + "," + audioAttributes.flags + "," + audioAttributes.usage + "," + audioAttributes.allowedCapturePolicy);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
        logd(eventTime, "audioDecoderInitialized", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        logd(eventTime, "audioDecoderReleased", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "audioDisabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "audioEnabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        logd(eventTime, "audioInputFormat", Format.toLogString(format));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioPositionAdvancing(AnalyticsListener.EventTime eventTime, long j) {
        logd(eventTime, "audioPositionAdvancing", "since " + getTimeString((SystemClock.elapsedRealtime() + (j - System.currentTimeMillis())) - this.startTimeMs));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioSessionIdChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "audioSessionId", Integer.toString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioTrackInitialized(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
        logd(eventTime, "audioTrackInit", getAudioTrackConfigString(audioTrackConfig));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioTrackReleased(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
        logd(eventTime, "audioTrackReleased", getAudioTrackConfigString(audioTrackConfig));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        loge(eventTime, "audioTrackUnderrun", i + ", " + j + ", " + j2, null);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        logd(eventTime, "downstreamFormat", Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime, KeyRequestInfo keyRequestInfo) {
        logd(eventTime, "drmKeysLoaded");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRemoved");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRestored");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "drmSessionAcquired", hf1.u(i, "state="));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        printInternalError(eventTime, "drmSessionManagerError", exc);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmSessionReleased");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDroppedSeeksWhileScrubbing(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "droppedSeeksWhileScrubbing", Integer.toString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i, long j) {
        logd(eventTime, "droppedFrames", Integer.toString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "loading", Boolean.toString(z));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "isPlaying", Boolean.toString(z));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        printInternalError(eventTime, "loadError", iOException);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onMediaItemTransition(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i) {
        logd("mediaItem [" + getEventTimeString(eventTime) + ", reason=" + getMediaItemTransitionReasonString(i) + "]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        logd("metadata [" + getEventTimeString(eventTime));
        printMetadata(metadata, "  ");
        logd("]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        logd(eventTime, "playWhenReady", z + ", " + getPlayWhenReadyChangeReasonString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        logd(eventTime, "playbackParameters", playbackParameters.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "state", getStateString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "playbackSuppressionReason", getPlaybackSuppressionReasonString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        loge(eventTime, "playerFailed", playbackException);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        logd(eventTime, "positionDiscontinuity", "reason=" + getDiscontinuityReasonString(i) + ", PositionInfo:old [" + positionInfo + "], PositionInfo:new [" + positionInfo2 + "]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object obj, long j) {
        logd(eventTime, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onRendererReadyChanged(AnalyticsListener.EventTime eventTime, int i, int i2, boolean z) {
        StringBuilder C = hf1.C("rendererIndex=", i, ", ");
        C.append(Util.getTrackTypeString(i2));
        C.append(", ");
        C.append(z);
        logd(eventTime, "rendererReady", C.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "repeatMode", getRepeatModeString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2) {
        logd(eventTime, "surfaceSize", r7.x(i, i2, "w=", ", h="));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i) {
        int periodCount = eventTime.timeline.getPeriodCount();
        int windowCount = eventTime.timeline.getWindowCount();
        logd("timeline [" + getEventTimeString(eventTime) + ", periodCount=" + periodCount + ", windowCount=" + windowCount + ", reason=" + getTimelineChangeReasonString(i));
        for (int i2 = 0; i2 < Math.min(periodCount, 3); i2++) {
            eventTime.timeline.getPeriod(i2, this.period);
            logd("  period [" + getTimeString(this.period.getDurationMs()) + "]");
        }
        if (periodCount > 3) {
            logd("  ...");
        }
        for (int i3 = 0; i3 < Math.min(windowCount, 3); i3++) {
            eventTime.timeline.getWindow(i3, this.window);
            logd("  window [" + getTimeString(this.window.getDurationMs()) + ", seekable=" + this.window.isSeekable + ", dynamic=" + this.window.isDynamic + "]");
        }
        if (windowCount > 3) {
            logd("  ...");
        }
        logd("]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onTracksChanged(AnalyticsListener.EventTime eventTime, Tracks tracks) {
        Metadata metadata;
        logd("tracks [" + getEventTimeString(eventTime));
        dy1 groups = tracks.getGroups();
        for (int i = 0; i < groups.size(); i++) {
            Tracks.Group group = (Tracks.Group) groups.get(i);
            logd("  group [ id=" + group.getMediaTrackGroup().id);
            for (int i2 = 0; i2 < group.length; i2++) {
                logd("    " + getTrackStatusString(group.isTrackSelected(i2)) + " Track:" + i2 + ", " + Format.toLogString(group.getTrackFormat(i2)) + ", supported=" + Util.getFormatSupportString(group.getTrackSupport(i2)));
            }
            logd("  ]");
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < groups.size(); i3++) {
            Tracks.Group group2 = (Tracks.Group) groups.get(i3);
            for (int i4 = 0; !z && i4 < group2.length; i4++) {
                if (group2.isTrackSelected(i4) && (metadata = group2.getTrackFormat(i4).metadata) != null && metadata.length() > 0) {
                    logd("  Metadata [");
                    printMetadata(metadata, "    ");
                    logd("  ]");
                    z = true;
                }
            }
        }
        logd("]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        logd(eventTime, "upstreamDiscarded", Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
        logd(eventTime, "videoDecoderInitialized", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        logd(eventTime, "videoDecoderReleased", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "videoDisabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "videoEnabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        logd(eventTime, "videoInputFormat", Format.toLogString(format));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        StringBuilder sb = new StringBuilder("w=" + videoSize.width + ", h=" + videoSize.height);
        if (videoSize.pixelWidthHeightRatio != 1.0f) {
            sb.append(", par=");
            sb.append(videoSize.pixelWidthHeightRatio);
        }
        logd(eventTime, "videoSize", sb.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f) {
        logd(eventTime, "volume", Float.toString(f));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onCues(AnalyticsListener.EventTime eventTime, List list) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
    }

    public void logd(String str) {
        Log.d(this.tag, str);
    }

    public void loge(String str) {
        Log.e(this.tag, str);
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str, String str2) {
        logd(getEventString(eventTime, str, str2, null));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, String str2, Throwable th) {
        loge(getEventString(eventTime, str, str2, th));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
    }

    public EventLogger() {
        this(DEFAULT_TAG);
    }

    @Deprecated
    public EventLogger(MappingTrackSelector mappingTrackSelector) {
        this(DEFAULT_TAG);
    }

    @Deprecated
    public EventLogger(MappingTrackSelector mappingTrackSelector, String str) {
        this(str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onPlayerReleased(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onSeekStarted(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAudioCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAudioSinkError(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAvailableCommandsChanged(AnalyticsListener.EventTime eventTime, Player.Commands commands) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onCues(AnalyticsListener.EventTime eventTime, CueGroup cueGroup) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onDeviceInfoChanged(AnalyticsListener.EventTime eventTime, DeviceInfo deviceInfo) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onEvents(Player player, AnalyticsListener.Events events) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onMaxSeekToPreviousPositionChanged(AnalyticsListener.EventTime eventTime, long j) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onMediaMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onPlayerErrorChanged(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onPlaylistMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onSeekBackIncrementChanged(AnalyticsListener.EventTime eventTime, long j) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onSeekForwardIncrementChanged(AnalyticsListener.EventTime eventTime, long j) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onTrackSelectionParametersChanged(AnalyticsListener.EventTime eventTime, TrackSelectionParameters trackSelectionParameters) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onVideoCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onDeviceVolumeChanged(AnalyticsListener.EventTime eventTime, int i, boolean z) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onLoadCanceled(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onLoadCompleted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onVideoFrameProcessingOffset(AnalyticsListener.EventTime eventTime, long j, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
    }
}
