package androidx.media3.exoplayer.analytics;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.BackgroundExecutor;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.UdpDataSource;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.PlaybackSessionManager;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.KeyRequestInfo;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.lr;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class MediaMetricsListener implements AnalyticsListener, PlaybackSessionManager.Listener {
    private String activeSessionId;
    private int audioUnderruns;
    private final Context context;
    private Format currentAudioFormat;
    private Format currentTextFormat;
    private Format currentVideoFormat;
    private int discontinuityReason;
    private int droppedFrames;
    private boolean hasFatalError;
    private int ioErrorType;
    private boolean isSeeking;
    private PlaybackMetrics.Builder metricsBuilder;
    private PendingFormatUpdate pendingAudioFormat;
    private PlaybackException pendingPlayerError;
    private PendingFormatUpdate pendingTextFormat;
    private PendingFormatUpdate pendingVideoFormat;
    private final PlaybackSession playbackSession;
    private int playedFrames;
    private boolean reportedEventsForCurrentSession;
    private final PlaybackSessionManager sessionManager;
    private final Executor backgroundExecutor = BackgroundExecutor.get();
    private final Timeline.Window window = new Timeline.Window();
    private final Timeline.Period period = new Timeline.Period();
    private final HashMap<String, Long> bandwidthBytes = new HashMap<>();
    private final HashMap<String, Long> bandwidthTimeMs = new HashMap<>();
    private final long startTimeMs = SystemClock.elapsedRealtime();
    private int currentPlaybackState = 0;
    private int currentNetworkType = 0;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class ErrorInfo {
        public final int errorCode;
        public final int subErrorCode;

        public ErrorInfo(int i, int i2) {
            this.errorCode = i;
            this.subErrorCode = i2;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class PendingFormatUpdate {
        public final Format format;
        public final int selectionReason;
        public final String sessionId;

        public PendingFormatUpdate(Format format, int i, String str) {
            this.format = format;
            this.selectionReason = i;
            this.sessionId = str;
        }
    }

    private MediaMetricsListener(Context context, PlaybackSession playbackSession) {
        this.context = context.getApplicationContext();
        this.playbackSession = playbackSession;
        DefaultPlaybackSessionManager defaultPlaybackSessionManager = new DefaultPlaybackSessionManager();
        this.sessionManager = defaultPlaybackSessionManager;
        defaultPlaybackSessionManager.setListener(this);
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private boolean canReportPendingFormatUpdate(PendingFormatUpdate pendingFormatUpdate) {
        return pendingFormatUpdate != null && pendingFormatUpdate.sessionId.equals(this.sessionManager.getActiveSessionId());
    }

    public static MediaMetricsListener create(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new MediaMetricsListener(context, mediaMetricsManager.createPlaybackSession());
    }

    private void finishCurrentSession() {
        PlaybackMetrics.Builder builder = this.metricsBuilder;
        if (builder != null && this.reportedEventsForCurrentSession) {
            builder.setAudioUnderrunCount(this.audioUnderruns);
            this.metricsBuilder.setVideoFramesDropped(this.droppedFrames);
            this.metricsBuilder.setVideoFramesPlayed(this.playedFrames);
            Long l = this.bandwidthTimeMs.get(this.activeSessionId);
            this.metricsBuilder.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = this.bandwidthBytes.get(this.activeSessionId);
            this.metricsBuilder.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.metricsBuilder.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.backgroundExecutor.execute(new lr(this, this.metricsBuilder.build(), (byte) 5));
        }
        this.metricsBuilder = null;
        this.activeSessionId = null;
        this.audioUnderruns = 0;
        this.droppedFrames = 0;
        this.playedFrames = 0;
        this.currentVideoFormat = null;
        this.currentAudioFormat = null;
        this.currentTextFormat = null;
        this.reportedEventsForCurrentSession = false;
    }

    private static int getDrmErrorCode(int i) {
        switch (Util.getErrorCodeForMediaDrmErrorCode(i)) {
            case PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED /* 6002 */:
                return 24;
            case PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR /* 6003 */:
                return 28;
            case PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED /* 6004 */:
                return 25;
            case PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION /* 6005 */:
                return 26;
            default:
                return 27;
        }
    }

    private static DrmInitData getDrmInitData(dy1 dy1Var) {
        DrmInitData drmInitData;
        ay1 listIterator = dy1Var.listIterator(0);
        while (listIterator.hasNext()) {
            Tracks.Group group = (Tracks.Group) listIterator.next();
            for (int i = 0; i < group.length; i++) {
                if (group.isTrackSelected(i) && (drmInitData = group.getTrackFormat(i).drmInitData) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
    }

    private static int getDrmType(DrmInitData drmInitData) {
        for (int i = 0; i < drmInitData.schemeDataCount; i++) {
            UUID uuid = drmInitData.get(i).uuid;
            if (uuid.equals(C.WIDEVINE_UUID)) {
                return 3;
            }
            if (uuid.equals(C.PLAYREADY_UUID)) {
                return 2;
            }
            if (uuid.equals(C.CLEARKEY_UUID)) {
                return 6;
            }
        }
        return 1;
    }

    private static ErrorInfo getErrorInfo(PlaybackException playbackException, Context context, boolean z) {
        int i;
        boolean z2;
        if (playbackException.errorCode == 1001) {
            return new ErrorInfo(20, 0);
        }
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            z2 = exoPlaybackException.type == 1;
            i = exoPlaybackException.rendererFormatSupport;
        } else {
            i = 0;
            z2 = false;
        }
        Throwable cause = playbackException.getCause();
        cause.getClass();
        if (!(cause instanceof IOException)) {
            if (z2 && (i == 0 || i == 1)) {
                return new ErrorInfo(35, 0);
            }
            if (z2 && i == 3) {
                return new ErrorInfo(15, 0);
            }
            if (z2 && i == 2) {
                return new ErrorInfo(23, 0);
            }
            if (cause instanceof MediaCodecRenderer.DecoderInitializationException) {
                return new ErrorInfo(13, Util.getErrorCodeFromPlatformDiagnosticsInfo(((MediaCodecRenderer.DecoderInitializationException) cause).diagnosticInfo));
            }
            if (cause instanceof MediaCodecDecoderException) {
                return new ErrorInfo(14, ((MediaCodecDecoderException) cause).errorCode);
            }
            if (cause instanceof OutOfMemoryError) {
                return new ErrorInfo(14, 0);
            }
            if (cause instanceof AudioSink.InitializationException) {
                return new ErrorInfo(17, ((AudioSink.InitializationException) cause).audioTrackState);
            }
            if (cause instanceof AudioSink.WriteException) {
                return new ErrorInfo(18, ((AudioSink.WriteException) cause).errorCode);
            }
            if (!(cause instanceof MediaCodec.CryptoException)) {
                return new ErrorInfo(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
            return new ErrorInfo(getDrmErrorCode(errorCode), errorCode);
        }
        if (cause instanceof HttpDataSource.InvalidResponseCodeException) {
            return new ErrorInfo(5, ((HttpDataSource.InvalidResponseCodeException) cause).responseCode);
        }
        if ((cause instanceof HttpDataSource.InvalidContentTypeException) || (cause instanceof ParserException)) {
            return new ErrorInfo(z ? 10 : 11, 0);
        }
        boolean z3 = cause instanceof HttpDataSource.HttpDataSourceException;
        if (z3 || (cause instanceof UdpDataSource.UdpDataSourceException)) {
            if (NetworkTypeObserver.getInstance(context).getNetworkType() == 1) {
                return new ErrorInfo(3, 0);
            }
            Throwable cause2 = cause.getCause();
            return cause2 instanceof UnknownHostException ? new ErrorInfo(6, 0) : cause2 instanceof SocketTimeoutException ? new ErrorInfo(7, 0) : (z3 && ((HttpDataSource.HttpDataSourceException) cause).type == 1) ? new ErrorInfo(4, 0) : new ErrorInfo(8, 0);
        }
        if (playbackException.errorCode == 1002) {
            return new ErrorInfo(21, 0);
        }
        if (cause instanceof DrmSession.DrmSessionException) {
            Throwable cause3 = cause.getCause();
            cause3.getClass();
            if (!(cause3 instanceof MediaDrm.MediaDrmStateException)) {
                return cause3 instanceof MediaDrmResetException ? new ErrorInfo(27, 0) : cause3 instanceof NotProvisionedException ? new ErrorInfo(24, 0) : cause3 instanceof DeniedByServerException ? new ErrorInfo(29, 0) : cause3 instanceof UnsupportedDrmException ? new ErrorInfo(23, 0) : cause3 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new ErrorInfo(28, 0) : new ErrorInfo(30, 0);
            }
            int errorCodeFromPlatformDiagnosticsInfo = Util.getErrorCodeFromPlatformDiagnosticsInfo(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
            return new ErrorInfo(getDrmErrorCode(errorCodeFromPlatformDiagnosticsInfo), errorCodeFromPlatformDiagnosticsInfo);
        }
        if (!(cause instanceof FileDataSource.FileDataSourceException) || !(cause.getCause() instanceof FileNotFoundException)) {
            return new ErrorInfo(9, 0);
        }
        Throwable cause4 = cause.getCause();
        cause4.getClass();
        Throwable cause5 = cause4.getCause();
        return ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new ErrorInfo(32, 0) : new ErrorInfo(31, 0);
    }

    private static Pair<String, String> getLanguageAndRegion(String str) {
        String[] split = Util.split(str, "-");
        return Pair.create(split[0], split.length >= 2 ? split[1] : null);
    }

    private static int getNetworkType(Context context) {
        switch (NetworkTypeObserver.getInstance(context).getNetworkType()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int getStreamType(MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        if (localConfiguration == null) {
            return 0;
        }
        int inferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType);
        if (inferContentTypeForUriAndMimeType == 0) {
            return 3;
        }
        if (inferContentTypeForUriAndMimeType != 1) {
            return inferContentTypeForUriAndMimeType != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int getTrackChangeReason(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 1 : 4;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$finishCurrentSession$4(PlaybackMetrics playbackMetrics) {
        this.playbackSession.reportPlaybackMetrics(playbackMetrics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$maybeReportNetworkChange$1(NetworkEvent networkEvent) {
        this.playbackSession.reportNetworkEvent(networkEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$maybeReportPlaybackError$0(PlaybackErrorEvent playbackErrorEvent) {
        this.playbackSession.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$maybeReportPlaybackStateChange$2(PlaybackStateEvent playbackStateEvent) {
        this.playbackSession.reportPlaybackStateEvent(playbackStateEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reportTrackChangeEvent$3(TrackChangeEvent trackChangeEvent) {
        this.playbackSession.reportTrackChangeEvent(trackChangeEvent);
    }

    private void maybeAddSessions(AnalyticsListener.Events events) {
        for (int i = 0; i < events.size(); i++) {
            int i2 = events.get(i);
            AnalyticsListener.EventTime eventTime = events.getEventTime(i2);
            if (i2 == 0) {
                this.sessionManager.updateSessionsWithTimelineChange(eventTime);
            } else {
                PlaybackSessionManager playbackSessionManager = this.sessionManager;
                if (i2 == 11) {
                    playbackSessionManager.updateSessionsWithDiscontinuity(eventTime, this.discontinuityReason);
                } else {
                    playbackSessionManager.updateSessions(eventTime);
                }
            }
        }
    }

    private void maybeReportNetworkChange(long j) {
        int networkType = getNetworkType(this.context);
        if (networkType != this.currentNetworkType) {
            this.currentNetworkType = networkType;
            this.backgroundExecutor.execute(new lr(this, new NetworkEvent.Builder().setNetworkType(networkType).setTimeSinceCreatedMillis(j - this.startTimeMs).build(), (byte) 8));
        }
    }

    private void maybeReportPlaybackError(long j) {
        PlaybackException playbackException = this.pendingPlayerError;
        if (playbackException == null) {
            return;
        }
        ErrorInfo errorInfo = getErrorInfo(playbackException, this.context, this.ioErrorType == 4);
        this.backgroundExecutor.execute(new lr(this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(j - this.startTimeMs).setErrorCode(errorInfo.errorCode).setSubErrorCode(errorInfo.subErrorCode).setException(playbackException).build(), (byte) 9));
        this.reportedEventsForCurrentSession = true;
        this.pendingPlayerError = null;
    }

    private void maybeReportPlaybackStateChange(Player player, AnalyticsListener.Events events, long j) {
        if (player.getPlaybackState() != 2) {
            this.isSeeking = false;
        }
        if (player.getPlayerError() == null) {
            this.hasFatalError = false;
        } else if (events.contains(10)) {
            this.hasFatalError = true;
        }
        int resolveNewPlaybackState = resolveNewPlaybackState(player);
        if (this.currentPlaybackState != resolveNewPlaybackState) {
            this.currentPlaybackState = resolveNewPlaybackState;
            this.reportedEventsForCurrentSession = true;
            this.backgroundExecutor.execute(new lr(this, new PlaybackStateEvent.Builder().setState(this.currentPlaybackState).setTimeSinceCreatedMillis(j - this.startTimeMs).build(), (byte) 6));
        }
    }

    private void maybeReportTrackChanges(Player player, AnalyticsListener.Events events, long j) {
        if (events.contains(2)) {
            Tracks currentTracks = player.getCurrentTracks();
            boolean isTypeSelected = currentTracks.isTypeSelected(2);
            boolean isTypeSelected2 = currentTracks.isTypeSelected(1);
            boolean isTypeSelected3 = currentTracks.isTypeSelected(3);
            if (isTypeSelected || isTypeSelected2 || isTypeSelected3) {
                if (!isTypeSelected) {
                    maybeUpdateVideoFormat(j, null, 0);
                }
                if (!isTypeSelected2) {
                    maybeUpdateAudioFormat(j, null, 0);
                }
                if (!isTypeSelected3) {
                    maybeUpdateTextFormat(j, null, 0);
                }
            }
        }
        if (canReportPendingFormatUpdate(this.pendingVideoFormat)) {
            PendingFormatUpdate pendingFormatUpdate = this.pendingVideoFormat;
            Format format = pendingFormatUpdate.format;
            if (format.height != -1) {
                maybeUpdateVideoFormat(j, format, pendingFormatUpdate.selectionReason);
                this.pendingVideoFormat = null;
            }
        }
        if (canReportPendingFormatUpdate(this.pendingAudioFormat)) {
            PendingFormatUpdate pendingFormatUpdate2 = this.pendingAudioFormat;
            maybeUpdateAudioFormat(j, pendingFormatUpdate2.format, pendingFormatUpdate2.selectionReason);
            this.pendingAudioFormat = null;
        }
        if (canReportPendingFormatUpdate(this.pendingTextFormat)) {
            PendingFormatUpdate pendingFormatUpdate3 = this.pendingTextFormat;
            maybeUpdateTextFormat(j, pendingFormatUpdate3.format, pendingFormatUpdate3.selectionReason);
            this.pendingTextFormat = null;
        }
    }

    private void maybeUpdateAudioFormat(long j, Format format, int i) {
        if (Objects.equals(this.currentAudioFormat, format)) {
            return;
        }
        if (this.currentAudioFormat == null && i == 0) {
            i = 1;
        }
        this.currentAudioFormat = format;
        reportTrackChangeEvent(0, j, format, i);
    }

    private void maybeUpdateMetricsBuilderValues(Player player, AnalyticsListener.Events events) {
        DrmInitData drmInitData;
        if (events.contains(0)) {
            AnalyticsListener.EventTime eventTime = events.getEventTime(0);
            if (this.metricsBuilder != null) {
                maybeUpdateTimelineMetadata(eventTime.timeline, eventTime.mediaPeriodId);
            }
        }
        if (events.contains(2) && this.metricsBuilder != null && (drmInitData = getDrmInitData(player.getCurrentTracks().getGroups())) != null) {
            ((PlaybackMetrics.Builder) Util.castNonNull(this.metricsBuilder)).setDrmType(getDrmType(drmInitData));
        }
        if (events.contains(AnalyticsListener.EVENT_AUDIO_UNDERRUN)) {
            this.audioUnderruns++;
        }
    }

    private void maybeUpdateTextFormat(long j, Format format, int i) {
        if (Objects.equals(this.currentTextFormat, format)) {
            return;
        }
        if (this.currentTextFormat == null && i == 0) {
            i = 1;
        }
        this.currentTextFormat = format;
        reportTrackChangeEvent(2, j, format, i);
    }

    @RequiresNonNull({"metricsBuilder"})
    private void maybeUpdateTimelineMetadata(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        int indexOfPeriod;
        PlaybackMetrics.Builder builder = this.metricsBuilder;
        if (mediaPeriodId == null || (indexOfPeriod = timeline.getIndexOfPeriod(mediaPeriodId.periodUid)) == -1) {
            return;
        }
        timeline.getPeriod(indexOfPeriod, this.period);
        timeline.getWindow(this.period.windowIndex, this.window);
        builder.setStreamType(getStreamType(this.window.mediaItem));
        Timeline.Window window = this.window;
        if (window.durationUs != C.TIME_UNSET && !window.isPlaceholder && !window.isDynamic && !window.isLive()) {
            builder.setMediaDurationMillis(this.window.getDurationMs());
        }
        builder.setPlaybackType(this.window.isLive() ? 2 : 1);
        this.reportedEventsForCurrentSession = true;
    }

    private void maybeUpdateVideoFormat(long j, Format format, int i) {
        if (Objects.equals(this.currentVideoFormat, format)) {
            return;
        }
        if (this.currentVideoFormat == null && i == 0) {
            i = 1;
        }
        this.currentVideoFormat = format;
        reportTrackChangeEvent(1, j, format, i);
    }

    private void reportTrackChangeEvent(int i, long j, Format format, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.startTimeMs);
        if (format != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(getTrackChangeReason(i2));
            String str = format.containerMimeType;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = format.sampleMimeType;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = format.codecs;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = format.bitrate;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = format.width;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = format.height;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = format.channelCount;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = format.sampleRate;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = format.language;
            if (str4 != null) {
                Pair<String, String> languageAndRegion = getLanguageAndRegion(str4);
                timeSinceCreatedMillis.setLanguage((String) languageAndRegion.first);
                Object obj = languageAndRegion.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = format.frameRate;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.reportedEventsForCurrentSession = true;
        this.backgroundExecutor.execute(new lr(this, timeSinceCreatedMillis.build(), (byte) 7));
    }

    private int resolveNewPlaybackState(Player player) {
        int playbackState = player.getPlaybackState();
        if (this.isSeeking) {
            return 5;
        }
        if (this.hasFatalError) {
            return 13;
        }
        if (playbackState == 4) {
            return 11;
        }
        if (playbackState == 2) {
            int i = this.currentPlaybackState;
            if (i == 0 || i == 2 || i == 12) {
                return 2;
            }
            if (player.getPlayWhenReady()) {
                return player.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (playbackState == 3) {
            if (player.getPlayWhenReady()) {
                return player.getPlaybackSuppressionReason() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (playbackState != 1 || this.currentPlaybackState == 0) {
            return this.currentPlaybackState;
        }
        return 12;
    }

    public LogSessionId getLogSessionId() {
        return this.playbackSession.getSessionId();
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId != null) {
            PlaybackSessionManager playbackSessionManager = this.sessionManager;
            Timeline timeline = eventTime.timeline;
            mediaPeriodId.getClass();
            String sessionForMediaPeriodId = playbackSessionManager.getSessionForMediaPeriodId(timeline, mediaPeriodId);
            Long l = this.bandwidthBytes.get(sessionForMediaPeriodId);
            Long l2 = this.bandwidthTimeMs.get(sessionForMediaPeriodId);
            this.bandwidthBytes.put(sessionForMediaPeriodId, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.bandwidthTimeMs.put(sessionForMediaPeriodId, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        if (eventTime.mediaPeriodId == null) {
            return;
        }
        Format format = mediaLoadData.trackFormat;
        format.getClass();
        int i = mediaLoadData.trackSelectionReason;
        PlaybackSessionManager playbackSessionManager = this.sessionManager;
        Timeline timeline = eventTime.timeline;
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        mediaPeriodId.getClass();
        PendingFormatUpdate pendingFormatUpdate = new PendingFormatUpdate(format, i, playbackSessionManager.getSessionForMediaPeriodId(timeline, mediaPeriodId));
        int i2 = mediaLoadData.trackType;
        if (i2 != 0) {
            if (i2 == 1) {
                this.pendingAudioFormat = pendingFormatUpdate;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.pendingTextFormat = pendingFormatUpdate;
                return;
            }
        }
        this.pendingVideoFormat = pendingFormatUpdate;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onEvents(Player player, AnalyticsListener.Events events) {
        if (events.size() == 0) {
            return;
        }
        maybeAddSessions(events);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        maybeUpdateMetricsBuilderValues(player, events);
        maybeReportPlaybackError(elapsedRealtime);
        maybeReportTrackChanges(player, events, elapsedRealtime);
        maybeReportNetworkChange(elapsedRealtime);
        maybeReportPlaybackStateChange(player, events, elapsedRealtime);
        if (events.contains(AnalyticsListener.EVENT_PLAYER_RELEASED)) {
            this.sessionManager.finishAllSessions(events.getEventTime(AnalyticsListener.EVENT_PLAYER_RELEASED));
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        this.ioErrorType = mediaLoadData.dataType;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        this.pendingPlayerError = playbackException;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        if (i == 1) {
            this.isSeeking = true;
        }
        this.discontinuityReason = i;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionActive(AnalyticsListener.EventTime eventTime, String str) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
            finishCurrentSession();
            this.activeSessionId = str;
            this.metricsBuilder = new PlaybackMetrics.Builder().setPlayerName(MediaLibraryInfo.TAG).setPlayerVersion(MediaLibraryInfo.VERSION);
            maybeUpdateTimelineMetadata(eventTime.timeline, eventTime.mediaPeriodId);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionFinished(AnalyticsListener.EventTime eventTime, String str, boolean z) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if ((mediaPeriodId == null || !mediaPeriodId.isAd()) && str.equals(this.activeSessionId)) {
            finishCurrentSession();
        }
        this.bandwidthTimeMs.remove(str);
        this.bandwidthBytes.remove(str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        this.droppedFrames += decoderCounters.droppedBufferCount;
        this.playedFrames += decoderCounters.renderedOutputBufferCount;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        PendingFormatUpdate pendingFormatUpdate = this.pendingVideoFormat;
        if (pendingFormatUpdate != null) {
            Format format = pendingFormatUpdate.format;
            if (format.height == -1) {
                this.pendingVideoFormat = new PendingFormatUpdate(format.buildUpon().setWidth(videoSize.width).setHeight(videoSize.height).build(), pendingFormatUpdate.selectionReason, pendingFormatUpdate.sessionId);
            }
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onCues(AnalyticsListener.EventTime eventTime, List list) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime, KeyRequestInfo keyRequestInfo) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onPlayerReleased(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onSeekStarted(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAudioCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAudioPositionAdvancing(AnalyticsListener.EventTime eventTime, long j) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAudioSessionIdChanged(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAudioSinkError(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAudioTrackInitialized(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAudioTrackReleased(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
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
    public final void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onDroppedSeeksWhileScrubbing(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
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
    public final void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onPlayerErrorChanged(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onPlaylistMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onSeekBackIncrementChanged(AnalyticsListener.EventTime eventTime, long j) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onSeekForwardIncrementChanged(AnalyticsListener.EventTime eventTime, long j) {
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionCreated(AnalyticsListener.EventTime eventTime, String str) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onTrackSelectionParametersChanged(AnalyticsListener.EventTime eventTime, TrackSelectionParameters trackSelectionParameters) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onTracksChanged(AnalyticsListener.EventTime eventTime, Tracks tracks) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onVideoCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f) {
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onAdPlaybackStarted(AnalyticsListener.EventTime eventTime, String str, String str2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onDeviceVolumeChanged(AnalyticsListener.EventTime eventTime, int i, boolean z) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i, long j) {
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
    public final void onMediaItemTransition(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object obj, long j) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onVideoFrameProcessingOffset(AnalyticsListener.EventTime eventTime, long j, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onRendererReadyChanged(AnalyticsListener.EventTime eventTime, int i, int i2, boolean z) {
    }
}
