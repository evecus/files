package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.image.ImageMetadataListener;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import defpackage.sp0;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
class RendererHolder {
    static final int RENDERER_PREWARMING_STATE_NOT_PREWARMING_USING_PRIMARY = 0;
    static final int RENDERER_PREWARMING_STATE_NOT_PREWARMING_USING_SECONDARY = 1;
    static final int RENDERER_PREWARMING_STATE_PREWARMING_PRIMARY = 2;
    static final int RENDERER_PREWARMING_STATE_PREWARMING_SECONDARY = 3;
    static final int RENDERER_PREWARMING_STATE_TRANSITIONING_TO_PRIMARY = 5;
    static final int RENDERER_PREWARMING_STATE_TRANSITIONING_TO_SECONDARY = 4;
    static final int REPLACE_STREAMS_DISABLE_RENDERERS_COMPLETED = 1;
    static final int REPLACE_STREAMS_DISABLE_RENDERERS_DISABLE_OFFLOAD_SCHEDULING = 2;
    private static final String TAG = "RendererHolder";
    private final int index;
    private final Renderer primaryRenderer;
    private final Renderer secondaryRenderer;
    private int prewarmingState = 0;
    private boolean primaryRequiresReset = false;
    private boolean secondaryRequiresReset = false;

    public RendererHolder(Renderer renderer, Renderer renderer2, int i) {
        this.primaryRenderer = renderer;
        this.index = i;
        this.secondaryRenderer = renderer2;
    }

    private void disableRenderer(Renderer renderer, DefaultMediaClock defaultMediaClock) {
        sp0.z(this.primaryRenderer == renderer || this.secondaryRenderer == renderer);
        if (isRendererEnabled(renderer)) {
            defaultMediaClock.onRendererDisabled(renderer);
            ensureStopped(renderer);
            renderer.disable();
        }
    }

    private void ensureStopped(Renderer renderer) {
        if (renderer.getState() == 2) {
            renderer.stop();
        }
    }

    private static Format[] getFormats(ExoTrackSelection exoTrackSelection) {
        int length = exoTrackSelection != null ? exoTrackSelection.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            exoTrackSelection.getClass();
            formatArr[i] = exoTrackSelection.getFormat(i);
        }
        return formatArr;
    }

    private Renderer getRendererReadingFromPeriod(MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodHolder != null && mediaPeriodHolder.sampleStreams[this.index] != null) {
            if (this.primaryRenderer.getStream() == mediaPeriodHolder.sampleStreams[this.index]) {
                return this.primaryRenderer;
            }
            Renderer renderer = this.secondaryRenderer;
            if (renderer != null && renderer.getStream() == mediaPeriodHolder.sampleStreams[this.index]) {
                return this.secondaryRenderer;
            }
        }
        return null;
    }

    private boolean hasFinishedReadingFromPeriodInternal(MediaPeriodHolder mediaPeriodHolder, Renderer renderer) {
        if (renderer == null) {
            return true;
        }
        SampleStream sampleStream = mediaPeriodHolder.sampleStreams[this.index];
        if (renderer.getStream() == null || (renderer.getStream() == sampleStream && (sampleStream == null || renderer.hasReadStreamToEnd() || hasReachedServerSideInsertedAdsTransition(renderer, mediaPeriodHolder)))) {
            return true;
        }
        for (MediaPeriodHolder next = mediaPeriodHolder.getNext(); next != null; next = next.getNext()) {
            if (Objects.equals(next.sampleStreams[this.index], renderer.getStream())) {
                return true;
            }
        }
        return false;
    }

    private boolean hasReachedServerSideInsertedAdsTransition(Renderer renderer, MediaPeriodHolder mediaPeriodHolder) {
        MediaPeriodHolder next = mediaPeriodHolder.getNext();
        if (mediaPeriodHolder.info.isFollowedByTransitionToSameStream && next != null && next.prepared) {
            return (renderer instanceof TextRenderer) || (renderer instanceof MetadataRenderer) || renderer.getReadingPositionUs() >= next.getStartPositionRendererTime();
        }
        return false;
    }

    private boolean isPrimaryRendererPrewarming() {
        int i = this.prewarmingState;
        return i == 2 || i == 5;
    }

    private boolean isSecondaryRendererPrewarming() {
        int i = this.prewarmingState;
        return i == 3 || i == 4;
    }

    private void maybeDisableOrResetPositionInternal(Renderer renderer, SampleStream sampleStream, DefaultMediaClock defaultMediaClock, long j, boolean z) {
        if (isRendererEnabled(renderer)) {
            if (sampleStream != renderer.getStream()) {
                disableRenderer(renderer, defaultMediaClock);
            } else if (z) {
                renderer.resetPosition(j, true);
            }
        }
    }

    private void maybeResetRenderer(boolean z) {
        if (z) {
            if (this.primaryRequiresReset) {
                this.primaryRenderer.reset();
                this.primaryRequiresReset = false;
                return;
            }
            return;
        }
        if (this.secondaryRequiresReset) {
            Renderer renderer = this.secondaryRenderer;
            renderer.getClass();
            renderer.reset();
            this.secondaryRequiresReset = false;
        }
    }

    private int replaceStreamsOrDisableRendererForTransitionInternal(Renderer renderer, MediaPeriodHolder mediaPeriodHolder, TrackSelectorResult trackSelectorResult, DefaultMediaClock defaultMediaClock) {
        if (renderer == null || !isRendererEnabled(renderer) || ((renderer == this.primaryRenderer && isPrimaryRendererPrewarming()) || (renderer == this.secondaryRenderer && isSecondaryRendererPrewarming()))) {
            return 1;
        }
        SampleStream stream = renderer.getStream();
        SampleStream[] sampleStreamArr = mediaPeriodHolder.sampleStreams;
        int i = this.index;
        boolean z = stream != sampleStreamArr[i];
        boolean isRendererEnabled = trackSelectorResult.isRendererEnabled(i);
        if (isRendererEnabled && !z) {
            return 1;
        }
        if (!renderer.isCurrentStreamFinal()) {
            Format[] formats = getFormats(trackSelectorResult.selections[this.index]);
            SampleStream sampleStream = mediaPeriodHolder.sampleStreams[this.index];
            sampleStream.getClass();
            renderer.replaceStream(formats, sampleStream, mediaPeriodHolder.getStartPositionRendererTime(), mediaPeriodHolder.getRendererOffset(), mediaPeriodHolder.info.id);
            return 3;
        }
        if (!renderer.isEnded()) {
            return 0;
        }
        disableRenderer(renderer, defaultMediaClock);
        if (!isRendererEnabled || isPrewarming()) {
            maybeResetRenderer(renderer == this.primaryRenderer);
        }
        return 1;
    }

    private void setCurrentStreamFinalInternal(Renderer renderer, long j) {
        renderer.setCurrentStreamFinal();
        if (renderer instanceof TextRenderer) {
            ((TextRenderer) renderer).setFinalStreamEndPositionUs(j);
        }
    }

    private void transferResources(boolean z) {
        if (z) {
            Renderer renderer = this.secondaryRenderer;
            renderer.getClass();
            renderer.handleMessage(17, this.primaryRenderer);
        } else {
            Renderer renderer2 = this.primaryRenderer;
            Renderer renderer3 = this.secondaryRenderer;
            renderer3.getClass();
            renderer2.handleMessage(17, renderer3);
        }
    }

    public boolean allowsPlayback(MediaPeriodHolder mediaPeriodHolder) {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        return rendererReadingFromPeriod == null || rendererReadingFromPeriod.hasReadStreamToEnd() || rendererReadingFromPeriod.isReady() || rendererReadingFromPeriod.isEnded();
    }

    public void disable(DefaultMediaClock defaultMediaClock) {
        disableRenderer(this.primaryRenderer, defaultMediaClock);
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            int i = this.prewarmingState;
            boolean z = i == 5 || i == 1 || i == 3;
            disableRenderer(renderer, defaultMediaClock);
            maybeResetRenderer(false);
            if (z) {
                transferResources(true);
            }
        }
        this.prewarmingState = 0;
    }

    public void disablePrewarming(DefaultMediaClock defaultMediaClock) {
        Renderer renderer;
        if (isPrewarming()) {
            int i = this.prewarmingState;
            int i2 = 1;
            boolean z = i == 5 || i == 2;
            if (i != 5 && i != 3) {
                i2 = 0;
            }
            try {
                if (z) {
                    renderer = this.primaryRenderer;
                } else {
                    renderer = this.secondaryRenderer;
                    renderer.getClass();
                }
                disableRenderer(renderer, defaultMediaClock);
            } catch (RuntimeException e) {
                Log.e(TAG, "Disable prewarming failed.", e);
            }
            try {
                maybeResetRenderer(z);
            } catch (RuntimeException e2) {
                Log.e(TAG, "Reset prewarming failed.", e2);
            }
            this.prewarmingState = i2;
        }
    }

    public void enable(RendererConfiguration rendererConfiguration, ExoTrackSelection exoTrackSelection, SampleStream sampleStream, long j, boolean z, boolean z2, long j2, long j3, MediaSource.MediaPeriodId mediaPeriodId, DefaultMediaClock defaultMediaClock) {
        Format[] formats = getFormats(exoTrackSelection);
        int i = this.prewarmingState;
        if (i == 0 || i == 2 || i == 5) {
            this.primaryRequiresReset = true;
            this.primaryRenderer.enable(rendererConfiguration, formats, sampleStream, j, z, z2, j2, j3, mediaPeriodId);
            defaultMediaClock.onRendererEnabled(this.primaryRenderer);
        } else {
            this.secondaryRequiresReset = true;
            Renderer renderer = this.secondaryRenderer;
            renderer.getClass();
            renderer.enable(rendererConfiguration, formats, sampleStream, j, z, z2, j2, j3, mediaPeriodId);
            defaultMediaClock.onRendererEnabled(this.secondaryRenderer);
        }
    }

    public void enableMayRenderStartOfStream() {
        if (isRendererEnabled(this.primaryRenderer)) {
            this.primaryRenderer.enableMayRenderStartOfStream();
            return;
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || !isRendererEnabled(renderer)) {
            return;
        }
        this.secondaryRenderer.enableMayRenderStartOfStream();
    }

    public int getEnabledRendererCount() {
        boolean isRendererEnabled = isRendererEnabled(this.primaryRenderer);
        Renderer renderer = this.secondaryRenderer;
        return (isRendererEnabled ? 1 : 0) + ((renderer == null || !isRendererEnabled(renderer)) ? 0 : 1);
    }

    public long getMinDurationToProgressUs(long j, long j2) {
        long durationToProgressUs = isRendererEnabled(this.primaryRenderer) ? this.primaryRenderer.getDurationToProgressUs(j, j2) : Long.MAX_VALUE;
        Renderer renderer = this.secondaryRenderer;
        return (renderer == null || !isRendererEnabled(renderer)) ? durationToProgressUs : Math.min(durationToProgressUs, this.secondaryRenderer.getDurationToProgressUs(j, j2));
    }

    public long getReadingPositionUs(MediaPeriodHolder mediaPeriodHolder) {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        Objects.requireNonNull(rendererReadingFromPeriod);
        return rendererReadingFromPeriod.getReadingPositionUs();
    }

    public int getTrackType() {
        return this.primaryRenderer.getTrackType();
    }

    public void handleMessage(int i, Object obj, MediaPeriodHolder mediaPeriodHolder) {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        rendererReadingFromPeriod.getClass();
        rendererReadingFromPeriod.handleMessage(i, obj);
    }

    public boolean hasFinishedReadingFromPeriod(MediaPeriodHolder mediaPeriodHolder) {
        return hasFinishedReadingFromPeriodInternal(mediaPeriodHolder, this.primaryRenderer) && hasFinishedReadingFromPeriodInternal(mediaPeriodHolder, this.secondaryRenderer);
    }

    public boolean hasReadPeriodToEnd(MediaPeriodHolder mediaPeriodHolder) {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        rendererReadingFromPeriod.getClass();
        return rendererReadingFromPeriod.hasReadStreamToEnd();
    }

    public boolean hasSecondary() {
        return this.secondaryRenderer != null;
    }

    public boolean isEnded() {
        boolean isEnded = isRendererEnabled(this.primaryRenderer) ? this.primaryRenderer.isEnded() : true;
        Renderer renderer = this.secondaryRenderer;
        return (renderer == null || !isRendererEnabled(renderer)) ? isEnded : this.secondaryRenderer.isEnded() & isEnded;
    }

    public boolean isPrewarming() {
        return isPrimaryRendererPrewarming() || isSecondaryRendererPrewarming();
    }

    public boolean isPrewarmingPeriod(MediaPeriodHolder mediaPeriodHolder) {
        return (isPrimaryRendererPrewarming() && getRendererReadingFromPeriod(mediaPeriodHolder) == this.primaryRenderer) || (isSecondaryRendererPrewarming() && getRendererReadingFromPeriod(mediaPeriodHolder) == this.secondaryRenderer);
    }

    public boolean isReadingFromPeriod(MediaPeriodHolder mediaPeriodHolder) {
        return getRendererReadingFromPeriod(mediaPeriodHolder) != null;
    }

    public boolean isRendererEnabled() {
        int i = this.prewarmingState;
        if (i == 0 || i == 2 || i == 5) {
            return isRendererEnabled(this.primaryRenderer);
        }
        Renderer renderer = this.secondaryRenderer;
        renderer.getClass();
        return isRendererEnabled(renderer);
    }

    public void maybeDisableOrResetPosition(SampleStream sampleStream, DefaultMediaClock defaultMediaClock, long j, boolean z) {
        maybeDisableOrResetPositionInternal(this.primaryRenderer, sampleStream, defaultMediaClock, j, z);
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            maybeDisableOrResetPositionInternal(renderer, sampleStream, defaultMediaClock, j, z);
        }
    }

    public void maybeHandlePrewarmingTransition() {
        int i = this.prewarmingState;
        if (i == 4 || i == 5) {
            transferResources(i == 5);
            this.prewarmingState = this.prewarmingState == 5 ? 0 : 1;
        } else if (i == 2) {
            this.prewarmingState = 0;
        } else if (i == 3) {
            this.prewarmingState = 1;
        }
    }

    public void maybeSetOldStreamToFinal(TrackSelectorResult trackSelectorResult, TrackSelectorResult trackSelectorResult2, long j) {
        Renderer renderer;
        int i;
        boolean isRendererEnabled = trackSelectorResult.isRendererEnabled(this.index);
        boolean isRendererEnabled2 = trackSelectorResult2.isRendererEnabled(this.index);
        if (this.secondaryRenderer == null || (i = this.prewarmingState) == 4 || i == 3 || (i == 0 && isRendererEnabled(this.primaryRenderer))) {
            renderer = this.primaryRenderer;
        } else {
            renderer = this.secondaryRenderer;
            renderer.getClass();
        }
        if (!isRendererEnabled || renderer.isCurrentStreamFinal()) {
            return;
        }
        boolean z = getTrackType() == -2;
        RendererConfiguration[] rendererConfigurationArr = trackSelectorResult.rendererConfigurations;
        int i2 = this.index;
        RendererConfiguration rendererConfiguration = rendererConfigurationArr[i2];
        RendererConfiguration rendererConfiguration2 = trackSelectorResult2.rendererConfigurations[i2];
        if (!isRendererEnabled2 || !Objects.equals(rendererConfiguration2, rendererConfiguration) || z || isPrewarming()) {
            setCurrentStreamFinalInternal(renderer, j);
        }
    }

    public void maybeThrowStreamError(MediaPeriodHolder mediaPeriodHolder) {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        rendererReadingFromPeriod.getClass();
        rendererReadingFromPeriod.maybeThrowStreamError();
    }

    public void release() {
        this.primaryRenderer.release();
        this.primaryRequiresReset = false;
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            renderer.release();
            this.secondaryRequiresReset = false;
        }
    }

    public void render(long j, long j2) {
        if (isRendererEnabled(this.primaryRenderer)) {
            this.primaryRenderer.render(j, j2);
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || !isRendererEnabled(renderer)) {
            return;
        }
        this.secondaryRenderer.render(j, j2);
    }

    public int replaceStreamsOrDisableRendererForTransition(MediaPeriodHolder mediaPeriodHolder, TrackSelectorResult trackSelectorResult, DefaultMediaClock defaultMediaClock) {
        int replaceStreamsOrDisableRendererForTransitionInternal = replaceStreamsOrDisableRendererForTransitionInternal(this.primaryRenderer, mediaPeriodHolder, trackSelectorResult, defaultMediaClock);
        return replaceStreamsOrDisableRendererForTransitionInternal == 1 ? replaceStreamsOrDisableRendererForTransitionInternal(this.secondaryRenderer, mediaPeriodHolder, trackSelectorResult, defaultMediaClock) : replaceStreamsOrDisableRendererForTransitionInternal;
    }

    public void reset() {
        if (!isRendererEnabled(this.primaryRenderer)) {
            maybeResetRenderer(true);
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || isRendererEnabled(renderer)) {
            return;
        }
        maybeResetRenderer(false);
    }

    public void resetPosition(MediaPeriodHolder mediaPeriodHolder, long j, boolean z) {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        if (rendererReadingFromPeriod != null) {
            rendererReadingFromPeriod.resetPosition(j, z);
        }
    }

    public void setAllNonPrewarmingRendererStreamsFinal(long j) {
        int i;
        int i2;
        if (isRendererEnabled(this.primaryRenderer) && (i2 = this.prewarmingState) != 5 && i2 != 2) {
            setCurrentStreamFinalInternal(this.primaryRenderer, j);
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || !isRendererEnabled(renderer) || (i = this.prewarmingState) == 4 || i == 3) {
            return;
        }
        setCurrentStreamFinalInternal(this.secondaryRenderer, j);
    }

    public void setAudioSessionId(int i) {
        if (getTrackType() == 1 || getTrackType() == 2) {
            this.primaryRenderer.handleMessage(10, Integer.valueOf(i));
            Renderer renderer = this.secondaryRenderer;
            if (renderer != null) {
                renderer.handleMessage(10, Integer.valueOf(i));
            }
        }
    }

    public void setCurrentStreamFinal(long j) {
        int i;
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || (i = this.prewarmingState) == 4 || i == 3 || i == 0) {
            renderer = this.primaryRenderer;
        } else {
            renderer.getClass();
        }
        setCurrentStreamFinalInternal(renderer, j);
    }

    public void setImageMetadataListener(ImageMetadataListener imageMetadataListener) {
        if (getTrackType() != 4) {
            return;
        }
        this.primaryRenderer.handleMessage(23, imageMetadataListener);
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            renderer.handleMessage(23, imageMetadataListener);
        }
    }

    public void setPlaybackSpeed(float f, float f2) {
        this.primaryRenderer.setPlaybackSpeed(f, f2);
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            renderer.setPlaybackSpeed(f, f2);
        }
    }

    public void setScrubbingMode(ScrubbingModeParameters scrubbingModeParameters) {
        this.primaryRenderer.handleMessage(18, scrubbingModeParameters);
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            renderer.handleMessage(18, scrubbingModeParameters);
        }
    }

    public void setTimeline(Timeline timeline) {
        this.primaryRenderer.setTimeline(timeline);
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            renderer.setTimeline(timeline);
        }
    }

    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        if (getTrackType() == 2 || getTrackType() == 4) {
            this.primaryRenderer.handleMessage(7, videoFrameMetadataListener);
            Renderer renderer = this.secondaryRenderer;
            if (renderer != null) {
                renderer.handleMessage(7, videoFrameMetadataListener);
            }
        }
    }

    public void setVideoOutput(Object obj) {
        if (getTrackType() != 2) {
            return;
        }
        int i = this.prewarmingState;
        if (i != 5 && i != 3 && i != 1) {
            this.primaryRenderer.handleMessage(1, obj);
            return;
        }
        Renderer renderer = this.secondaryRenderer;
        renderer.getClass();
        renderer.handleMessage(1, obj);
    }

    public void setVolume(float f) {
        if (getTrackType() != 1) {
            return;
        }
        this.primaryRenderer.handleMessage(2, Float.valueOf(f));
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            renderer.handleMessage(2, Float.valueOf(f));
        }
    }

    public void start() {
        if (this.primaryRenderer.getState() == 1 && this.prewarmingState != 5) {
            this.primaryRenderer.start();
            return;
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || renderer.getState() != 1 || this.prewarmingState == 4) {
            return;
        }
        this.secondaryRenderer.start();
    }

    public void startPrewarming() {
        sp0.z(!isPrewarming());
        if (isRendererEnabled(this.primaryRenderer)) {
            this.prewarmingState = 4;
            return;
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null && isRendererEnabled(renderer)) {
            this.prewarmingState = 5;
        } else if (this.prewarmingState == 0) {
            this.prewarmingState = 2;
        } else {
            this.prewarmingState = 3;
        }
    }

    public void stop() {
        if (isRendererEnabled(this.primaryRenderer)) {
            ensureStopped(this.primaryRenderer);
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || !isRendererEnabled(renderer)) {
            return;
        }
        ensureStopped(this.secondaryRenderer);
    }

    public boolean supportsResetPositionWithoutKeyFrameReset(MediaPeriodHolder mediaPeriodHolder, long j) {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        return rendererReadingFromPeriod != null && rendererReadingFromPeriod.supportsResetPositionWithoutKeyFrameReset(j);
    }

    public void setCurrentStreamFinal(MediaPeriodHolder mediaPeriodHolder, long j) {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        rendererReadingFromPeriod.getClass();
        setCurrentStreamFinalInternal(rendererReadingFromPeriod, j);
    }

    private static boolean isRendererEnabled(Renderer renderer) {
        return renderer.getState() != 0;
    }
}
