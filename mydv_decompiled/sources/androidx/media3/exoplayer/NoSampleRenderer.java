package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import defpackage.hf1;
import defpackage.sp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class NoSampleRenderer implements Renderer, RendererCapabilities {
    private RendererConfiguration configuration;
    private int index;
    private int state;
    private SampleStream stream;
    private boolean streamIsFinal;

    @Override // androidx.media3.exoplayer.Renderer
    public final void disable() {
        sp0.z(this.state == 1);
        this.state = 0;
        this.stream = null;
        this.streamIsFinal = false;
        onDisabled();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void enable(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j, boolean z, boolean z2, long j2, long j3, MediaSource.MediaPeriodId mediaPeriodId) {
        sp0.z(this.state == 0);
        this.configuration = rendererConfiguration;
        this.state = 1;
        onEnabled(z);
        replaceStream(formatArr, sampleStream, j2, j3, mediaPeriodId);
        onPositionReset(j, z, true);
    }

    public final RendererConfiguration getConfiguration() {
        return this.configuration;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final /* synthetic */ long getDurationToProgressUs(long j, long j2) {
        return hf1.c(this);
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public MediaClock getMediaClock() {
        return null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public long getReadingPositionUs() {
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final int getState() {
        return this.state;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final SampleStream getStream() {
        return this.stream;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final int getTrackType() {
        return -2;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean hasReadStreamToEnd() {
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void init(int i, PlayerId playerId, Clock clock) {
        this.index = i;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.streamIsFinal;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void replaceStream(Format[] formatArr, SampleStream sampleStream, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        sp0.z(!this.streamIsFinal);
        this.stream = sampleStream;
        onRendererOffsetChanged(j2);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void reset() {
        sp0.z(this.state == 0);
        onReset();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void resetPosition(long j, boolean z) {
        this.streamIsFinal = false;
        onPositionReset(j, false, z);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void setCurrentStreamFinal() {
        this.streamIsFinal = true;
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
    public int supportsFormat(Format format) {
        return hf1.k(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean supportsResetPositionWithoutKeyFrameReset(long j) {
        return false;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final void clearListener() {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void enableMayRenderStartOfStream() {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final RendererCapabilities getCapabilities() {
        return this;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void maybeThrowStreamError() {
    }

    public void onDisabled() {
    }

    public void onReset() {
    }

    public void onStarted() {
    }

    public void onStopped() {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void release() {
    }

    public void onEnabled(boolean z) {
    }

    public void onRendererOffsetChanged(long j) {
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final void setListener(RendererCapabilities.Listener listener) {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void setTimeline(Timeline timeline) {
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, Object obj) {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void setPlaybackSpeed(float f, float f2) {
    }

    public void onPositionReset(long j, boolean z, boolean z2) {
    }
}
