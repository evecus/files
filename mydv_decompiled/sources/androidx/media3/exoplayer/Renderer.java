package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface Renderer extends PlayerMessage.Target {
    public static final long DEFAULT_DURATION_TO_PROGRESS_US = 10000;
    public static final long DEFAULT_IDLE_DURATION_TO_PROGRESS_US = 1000000;
    public static final int MSG_CUSTOM_BASE = 10000;
    public static final int MSG_SET_AUDIO_ATTRIBUTES = 3;
    public static final int MSG_SET_AUDIO_OUTPUT_PROVIDER = 20;
    public static final int MSG_SET_AUDIO_SESSION_ID = 10;
    public static final int MSG_SET_AUX_EFFECT_INFO = 6;
    public static final int MSG_SET_CAMERA_MOTION_LISTENER = 8;
    public static final int MSG_SET_CHANGE_FRAME_RATE_STRATEGY = 5;
    public static final int MSG_SET_CODEC_PARAMETERS = 21;
    public static final int MSG_SET_IMAGE_METADATA_LISTENER = 23;
    public static final int MSG_SET_IMAGE_OUTPUT = 15;
    public static final int MSG_SET_PREFERRED_AUDIO_DEVICE = 12;
    public static final int MSG_SET_PRIORITY = 16;
    public static final int MSG_SET_SCALING_MODE = 4;
    public static final int MSG_SET_SCRUBBING_MODE = 18;
    public static final int MSG_SET_SKIP_SILENCE_ENABLED = 9;
    public static final int MSG_SET_SUBSCRIBED_CODEC_PARAMETER_KEYS = 22;
    public static final int MSG_SET_VIDEO_EFFECTS = 13;
    public static final int MSG_SET_VIDEO_FRAME_METADATA_LISTENER = 7;
    public static final int MSG_SET_VIDEO_OUTPUT = 1;
    public static final int MSG_SET_VIDEO_OUTPUT_RESOLUTION = 14;
    public static final int MSG_SET_VIRTUAL_DEVICE_ID = 19;
    public static final int MSG_SET_VOLUME = 2;
    public static final int MSG_SET_WAKEUP_LISTENER = 11;
    public static final int MSG_TRANSFER_RESOURCES = 17;
    public static final int STATE_DISABLED = 0;
    public static final int STATE_ENABLED = 1;
    public static final int STATE_STARTED = 2;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface MessageType {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface State {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface WakeupListener {
        void onSleep();

        void onWakeup();
    }

    void disable();

    void enable(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j, boolean z, boolean z2, long j2, long j3, MediaSource.MediaPeriodId mediaPeriodId);

    void enableMayRenderStartOfStream();

    RendererCapabilities getCapabilities();

    long getDurationToProgressUs(long j, long j2);

    MediaClock getMediaClock();

    String getName();

    long getReadingPositionUs();

    int getState();

    SampleStream getStream();

    int getTrackType();

    boolean hasReadStreamToEnd();

    void init(int i, PlayerId playerId, Clock clock);

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void maybeThrowStreamError();

    void release();

    void render(long j, long j2);

    void replaceStream(Format[] formatArr, SampleStream sampleStream, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId);

    void reset();

    void resetPosition(long j, boolean z);

    void setCurrentStreamFinal();

    void setPlaybackSpeed(float f, float f2);

    void setTimeline(Timeline timeline);

    void start();

    void stop();

    boolean supportsResetPositionWithoutKeyFrameReset(long j);
}
