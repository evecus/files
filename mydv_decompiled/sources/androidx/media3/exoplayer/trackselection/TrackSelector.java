package androidx.media3.exoplayer.trackselection;

import android.content.Context;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import defpackage.sp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class TrackSelector {
    private BandwidthMeter bandwidthMeter;
    private InvalidationListener listener;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public interface Factory {
        TrackSelector createTrackSelector(Context context);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface InvalidationListener {
        void onRendererCapabilitiesChanged(Renderer renderer);

        void onTrackSelectionsInvalidated(TrackSelectionParameters trackSelectionParameters);
    }

    public final BandwidthMeter getBandwidthMeter() {
        BandwidthMeter bandwidthMeter = this.bandwidthMeter;
        bandwidthMeter.getClass();
        return bandwidthMeter;
    }

    public TrackSelectionParameters getParameters() {
        return TrackSelectionParameters.DEFAULT;
    }

    public RendererCapabilities.Listener getRendererCapabilitiesListener() {
        return null;
    }

    public void init(InvalidationListener invalidationListener, BandwidthMeter bandwidthMeter) {
        sp0.z(this.listener == null);
        this.listener = invalidationListener;
        this.bandwidthMeter = bandwidthMeter;
    }

    public final void invalidate(TrackSelectionParameters trackSelectionParameters) {
        InvalidationListener invalidationListener = this.listener;
        if (invalidationListener != null) {
            invalidationListener.onTrackSelectionsInvalidated(trackSelectionParameters);
        }
    }

    public final void invalidateForRendererCapabilitiesChange(Renderer renderer) {
        InvalidationListener invalidationListener = this.listener;
        if (invalidationListener != null) {
            invalidationListener.onRendererCapabilitiesChanged(renderer);
        }
    }

    public boolean isSetParametersSupported() {
        return false;
    }

    public abstract void onSelectionActivated(Object obj);

    public void release() {
        this.listener = null;
        this.bandwidthMeter = null;
    }

    public abstract TrackSelectorResult selectTracks(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline);

    public void onParametersActivated(TrackSelectionParameters trackSelectionParameters) {
    }

    public void setAudioAttributes(AudioAttributes audioAttributes) {
    }

    public void setParameters(TrackSelectionParameters trackSelectionParameters) {
    }
}
