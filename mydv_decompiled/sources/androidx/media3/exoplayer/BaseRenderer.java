package androidx.media3.exoplayer;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Clock;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import defpackage.hf1;
import defpackage.sp0;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class BaseRenderer implements Renderer, RendererCapabilities {
    private Clock clock;
    private RendererConfiguration configuration;
    private int index;
    private long lastResetPositionUs;
    private MediaSource.MediaPeriodId mediaPeriodId;
    private PlayerId playerId;
    private RendererCapabilities.Listener rendererCapabilitiesListener;
    private int state;
    private SampleStream stream;
    private Format[] streamFormats;
    private boolean streamIsFinal;
    private long streamOffsetUs;
    private boolean throwRendererExceptionIsExecuting;
    private final int trackType;
    private final Object lock = new Object();
    private final FormatHolder formatHolder = new FormatHolder();
    private long readingPositionUs = Long.MIN_VALUE;
    private Timeline timeline = Timeline.EMPTY;
    private long streamEndPositionUs = C.TIME_UNSET;

    public BaseRenderer(int i) {
        this.trackType = i;
    }

    private void resetPosition(long j, boolean z, boolean z2) {
        this.streamIsFinal = false;
        this.lastResetPositionUs = j;
        this.readingPositionUs = j;
        if (!z2) {
            z2 = skipSource(j) != 0;
        }
        onPositionReset(j, z, z2);
    }

    private void updatePeriodInfo() {
        MediaSource.MediaPeriodId mediaPeriodId;
        if (this.timeline.isEmpty() || (mediaPeriodId = this.mediaPeriodId) == null) {
            this.streamEndPositionUs = C.TIME_UNSET;
            return;
        }
        int indexOfPeriod = this.timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
        if (indexOfPeriod == -1) {
            this.streamEndPositionUs = C.TIME_UNSET;
            return;
        }
        Timeline.Period period = this.timeline.getPeriod(indexOfPeriod, new Timeline.Period());
        this.streamEndPositionUs = period.durationUs;
        int i = mediaPeriodId.adGroupIndex;
        if (i != -1) {
            this.streamEndPositionUs = period.adPlaybackState.getAdGroup(i).durationsUs[mediaPeriodId.adIndexInAdGroup];
            return;
        }
        int i2 = mediaPeriodId.nextAdGroupIndex;
        if (i2 != -1) {
            long j = period.adPlaybackState.getAdGroup(i2).timeUs;
            if (j != Long.MIN_VALUE) {
                this.streamEndPositionUs = j;
            }
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final void clearListener() {
        synchronized (this.lock) {
            this.rendererCapabilitiesListener = null;
        }
    }

    public final ExoPlaybackException createRendererException(Throwable th, Format format, boolean z, int i) {
        int i2;
        if (format != null && !this.throwRendererExceptionIsExecuting) {
            this.throwRendererExceptionIsExecuting = true;
            try {
                i2 = supportsFormat(format) & 7;
            } catch (ExoPlaybackException unused) {
            } finally {
                this.throwRendererExceptionIsExecuting = false;
            }
            return ExoPlaybackException.createForRenderer(th, getName(), getIndex(), format, i2, this.mediaPeriodId, z, i);
        }
        i2 = 4;
        return ExoPlaybackException.createForRenderer(th, getName(), getIndex(), format, i2, this.mediaPeriodId, z, i);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void disable() {
        sp0.z(this.state == 1);
        this.formatHolder.clear();
        this.state = 0;
        this.stream = null;
        this.streamFormats = null;
        this.streamIsFinal = false;
        onDisabled();
        this.mediaPeriodId = null;
        this.streamEndPositionUs = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void enable(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j, boolean z, boolean z2, long j2, long j3, MediaSource.MediaPeriodId mediaPeriodId) {
        sp0.z(this.state == 0);
        this.configuration = rendererConfiguration;
        this.mediaPeriodId = mediaPeriodId;
        this.state = 1;
        onEnabled(z, z2);
        replaceStream(formatArr, sampleStream, j2, j3, mediaPeriodId);
        resetPosition(j2, z, true);
    }

    public final Clock getClock() {
        Clock clock = this.clock;
        clock.getClass();
        return clock;
    }

    public final RendererConfiguration getConfiguration() {
        RendererConfiguration rendererConfiguration = this.configuration;
        rendererConfiguration.getClass();
        return rendererConfiguration;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public /* synthetic */ long getDurationToProgressUs(long j, long j2) {
        return hf1.c(this);
    }

    public final FormatHolder getFormatHolder() {
        this.formatHolder.clear();
        return this.formatHolder;
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getLastResetPositionUs() {
        return this.lastResetPositionUs;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public MediaClock getMediaClock() {
        return null;
    }

    public final MediaSource.MediaPeriodId getMediaPeriodId() {
        return this.mediaPeriodId;
    }

    public final PlayerId getPlayerId() {
        PlayerId playerId = this.playerId;
        playerId.getClass();
        return playerId;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final long getReadingPositionUs() {
        return this.readingPositionUs;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final int getState() {
        return this.state;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final SampleStream getStream() {
        return this.stream;
    }

    public final long getStreamEndPositionUs() {
        return this.streamEndPositionUs;
    }

    public final Format[] getStreamFormats() {
        Format[] formatArr = this.streamFormats;
        formatArr.getClass();
        return formatArr;
    }

    public final long getStreamOffsetUs() {
        return this.streamOffsetUs;
    }

    public final Timeline getTimeline() {
        return this.timeline;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final int getTrackType() {
        return this.trackType;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean hasReadStreamToEnd() {
        return this.readingPositionUs == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void init(int i, PlayerId playerId, Clock clock) {
        this.index = i;
        this.playerId = playerId;
        this.clock = clock;
        onInit();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.streamIsFinal;
    }

    public final boolean isSourceReady() {
        if (hasReadStreamToEnd()) {
            return this.streamIsFinal;
        }
        SampleStream sampleStream = this.stream;
        sampleStream.getClass();
        return sampleStream.isReady();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void maybeThrowStreamError() {
        SampleStream sampleStream = this.stream;
        sampleStream.getClass();
        sampleStream.maybeThrowError();
    }

    public final void onRendererCapabilitiesChanged() {
        RendererCapabilities.Listener listener;
        synchronized (this.lock) {
            listener = this.rendererCapabilitiesListener;
        }
        if (listener != null) {
            listener.onRendererCapabilitiesChanged(this);
        }
    }

    public final int readSource(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
        boolean z = (i & 1) != 0;
        SampleStream sampleStream = this.stream;
        sampleStream.getClass();
        int readData = sampleStream.readData(formatHolder, decoderInputBuffer, i);
        if (readData == -4) {
            if (decoderInputBuffer.isEndOfStream()) {
                if (!z) {
                    this.readingPositionUs = Long.MIN_VALUE;
                }
                return this.streamIsFinal ? -4 : -3;
            }
            long j = decoderInputBuffer.timeUs + this.streamOffsetUs;
            decoderInputBuffer.timeUs = j;
            if (!z) {
                this.readingPositionUs = Math.max(this.readingPositionUs, j);
                return readData;
            }
        } else if (readData == -5) {
            Format format = formatHolder.format;
            format.getClass();
            if (format.subsampleOffsetUs != Long.MAX_VALUE) {
                formatHolder.format = format.buildUpon().setSubsampleOffsetUs(format.subsampleOffsetUs + this.streamOffsetUs).build();
            }
        }
        return readData;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void release() {
        sp0.z(this.state == 0);
        onRelease();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void replaceStream(Format[] formatArr, SampleStream sampleStream, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        sp0.z(!this.streamIsFinal);
        this.stream = sampleStream;
        this.mediaPeriodId = mediaPeriodId;
        updatePeriodInfo();
        if (this.readingPositionUs == Long.MIN_VALUE) {
            this.readingPositionUs = j;
        }
        this.streamFormats = formatArr;
        this.streamOffsetUs = j2;
        onStreamChanged(formatArr, j, j2, mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void reset() {
        sp0.z(this.state == 0);
        this.formatHolder.clear();
        onReset();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void setCurrentStreamFinal() {
        this.streamIsFinal = true;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final void setListener(RendererCapabilities.Listener listener) {
        synchronized (this.lock) {
            this.rendererCapabilitiesListener = listener;
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void setTimeline(Timeline timeline) {
        if (Objects.equals(this.timeline, timeline)) {
            return;
        }
        this.timeline = timeline;
        updatePeriodInfo();
        onTimelineChanged(this.timeline);
    }

    public int skipSource(long j) {
        SampleStream sampleStream = this.stream;
        sampleStream.getClass();
        return sampleStream.skipData(j - this.streamOffsetUs);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void start() {
        sp0.z(this.state == 1);
        this.state = 2;
        onStarted();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void stop() {
        sp0.z(this.state == 2);
        this.state = 1;
        onStopped();
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean supportsResetPositionWithoutKeyFrameReset(long j) {
        return false;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void resetPosition(long j, boolean z) {
        resetPosition(j, false, z);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void enableMayRenderStartOfStream() {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final RendererCapabilities getCapabilities() {
        return this;
    }

    public void onDisabled() {
    }

    public void onInit() {
    }

    public void onRelease() {
    }

    public void onReset() {
    }

    public void onStarted() {
    }

    public void onStopped() {
    }

    public void onTimelineChanged(Timeline timeline) {
    }

    public final ExoPlaybackException createRendererException(Throwable th, Format format, int i) {
        return createRendererException(th, format, false, i);
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, Object obj) {
    }

    public void onEnabled(boolean z, boolean z2) {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void setPlaybackSpeed(float f, float f2) {
    }

    public void onPositionReset(long j, boolean z, boolean z2) {
    }

    public void onStreamChanged(Format[] formatArr, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
    }
}
