package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.BackgroundExecutor;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioOutput;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput;
import androidx.media3.exoplayer.audio.AudioTrackPositionTracker;
import defpackage.h;
import defpackage.hf1;
import defpackage.j0;
import defpackage.ja;
import defpackage.of;
import defpackage.pt1;
import defpackage.y9;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AudioTrackAudioOutput implements AudioOutput {
    private static final int AUDIO_TRACK_VOLUME_RAMP_TIME_MS = 20;
    private static final int ERROR_NATIVE_DEAD_OBJECT = -32;
    private static final String TAG = "AudioTrackAudioOutput";
    private static int pendingReleaseCount;
    private static ScheduledExecutorService releaseExecutor;
    private static final Object releaseExecutorLock = new Object();
    private final AudioTrack audioTrack;
    private final AudioTrackPositionTracker audioTrackPositionTracker;
    private ByteBuffer avSyncHeader;
    private int bytesUntilNextAvSync;
    private final CapabilityChangeListener capabilityChangeListener;
    private final AudioOutputProvider.OutputConfig config;
    private int framesPerEncodedSample;
    private boolean hasBeenStopped;
    private boolean hasData;
    private final boolean isOutputPcm;
    private long lastTunnelingAvSyncPresentationTimeUs;
    private int lastUnderrunCount;
    private final ListenerSet<AudioOutput.Listener> listeners;
    private final float maxPlaybackSpeed;
    private final StreamEventCallbackV29 offloadStreamEventCallbackV29;
    private OnRoutingChangedListenerApi24 onRoutingChangedListener;
    private final int pcmFrameSize;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface CapabilityChangeListener {
        void onRecoverableWriteError();

        void onRoutedDeviceChanged(AudioDeviceInfo audioDeviceInfo);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class OnRoutingChangedListenerApi24 {
        private final AudioTrack audioTrack;
        private final CapabilityChangeListener capabilityChangeListener;
        private AudioRouting.OnRoutingChangedListener listener;
        private final Handler playbackThreadHandler;

        private OnRoutingChangedListenerApi24(AudioTrack audioTrack, CapabilityChangeListener capabilityChangeListener) {
            this.audioTrack = audioTrack;
            this.capabilityChangeListener = capabilityChangeListener;
            Handler createHandlerForCurrentLooper = Util.createHandlerForCurrentLooper();
            this.playbackThreadHandler = createHandlerForCurrentLooper;
            AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: androidx.media3.exoplayer.audio.b
                @Override // android.media.AudioRouting.OnRoutingChangedListener
                public final void onRoutingChanged(AudioRouting audioRouting) {
                    AudioTrackAudioOutput.OnRoutingChangedListenerApi24.this.onRoutingChanged(audioRouting);
                }
            };
            this.listener = onRoutingChangedListener;
            audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, createHandlerForCurrentLooper);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onRoutingChanged$0(AudioDeviceInfo audioDeviceInfo) {
            if (this.listener == null) {
                return;
            }
            this.capabilityChangeListener.onRoutedDeviceChanged(audioDeviceInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onRoutingChanged$1(AudioRouting audioRouting) {
            final AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null) {
                this.playbackThreadHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioTrackAudioOutput.OnRoutingChangedListenerApi24.this.lambda$onRoutingChanged$0(routedDevice);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onRoutingChanged(final AudioRouting audioRouting) {
            if (this.listener == null) {
                return;
            }
            BackgroundExecutor.get().execute(new Runnable() { // from class: androidx.media3.exoplayer.audio.d
                @Override // java.lang.Runnable
                public final void run() {
                    AudioTrackAudioOutput.OnRoutingChangedListenerApi24.this.lambda$onRoutingChanged$1(audioRouting);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void release() {
            AudioTrack audioTrack = this.audioTrack;
            AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.listener;
            onRoutingChangedListener.getClass();
            audioTrack.removeOnRoutingChangedListener(onRoutingChangedListener);
            this.listener = null;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class PositionTrackerListener implements AudioTrackPositionTracker.Listener {
        private PositionTrackerListener() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onInvalidLatency(long j) {
            Log.w(AudioTrackAudioOutput.TAG, "Ignoring impossibly large audio latency: " + j);
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onPositionAdvancing(final long j) {
            if (AudioTrackAudioOutput.this.listeners.isRunningOnCorrectThread()) {
                AudioTrackAudioOutput.this.listeners.sendEvent(new ListenerSet.Event() { // from class: androidx.media3.exoplayer.audio.e
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        ((AudioOutput.Listener) obj).onPositionAdvancing(j);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onPositionFramesMismatch(long j, long j2, long j3, long j4) {
            StringBuilder A = hf1.A(j, "Spurious audio timestamp (frame position mismatch): ", ", ");
            A.append(j2);
            A.append(", ");
            A.append(j3);
            A.append(", ");
            A.append(j4);
            A.append(", ");
            A.append(AudioTrackAudioOutput.this.getWrittenFrames());
            String sb = A.toString();
            if (!MediaLibraryInfo.enableWorkarounds()) {
                throw new InvalidAudioTrackTimestampException(sb);
            }
            Log.w(AudioTrackAudioOutput.TAG, sb);
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onSystemTimeUsMismatch(long j, long j2, long j3, long j4) {
            StringBuilder A = hf1.A(j, "Spurious audio timestamp (system clock mismatch): ", ", ");
            A.append(j2);
            A.append(", ");
            A.append(j3);
            A.append(", ");
            A.append(j4);
            A.append(", ");
            A.append(AudioTrackAudioOutput.this.getWrittenFrames());
            String sb = A.toString();
            if (!MediaLibraryInfo.enableWorkarounds()) {
                throw new InvalidAudioTrackTimestampException(sb);
            }
            Log.w(AudioTrackAudioOutput.TAG, sb);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class StreamEventCallbackV29 {
        private final AudioTrack$StreamEventCallback callback;
        private final Handler handler;

        private StreamEventCallbackV29() {
            Handler createHandlerForCurrentLooper = Util.createHandlerForCurrentLooper();
            this.handler = createHandlerForCurrentLooper;
            AudioTrack$StreamEventCallback audioTrack$StreamEventCallback = new AudioTrack$StreamEventCallback() { // from class: androidx.media3.exoplayer.audio.AudioTrackAudioOutput.StreamEventCallbackV29.1
                public void onDataRequest(AudioTrack audioTrack, int i) {
                    AudioTrackAudioOutput.this.listeners.sendEvent(new j0((byte) 12));
                }

                public void onPresentationEnded(AudioTrack audioTrack) {
                    AudioTrackAudioOutput.this.listeners.sendEvent(new j0((byte) 13));
                }

                public void onTearDown(AudioTrack audioTrack) {
                    AudioTrackAudioOutput.this.listeners.sendEvent(new j0((byte) 12));
                }
            };
            this.callback = audioTrack$StreamEventCallback;
            AudioTrack audioTrack = AudioTrackAudioOutput.this.audioTrack;
            Objects.requireNonNull(createHandlerForCurrentLooper);
            audioTrack.registerStreamEventCallback(new ja(createHandlerForCurrentLooper, (byte) 2), audioTrack$StreamEventCallback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void unregister() {
            AudioTrackAudioOutput.this.audioTrack.unregisterStreamEventCallback(this.callback);
            this.handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioTrackAudioOutput(AudioTrack audioTrack, AudioOutputProvider.OutputConfig outputConfig, CapabilityChangeListener capabilityChangeListener, float f, Clock clock) {
        int i;
        this.audioTrack = audioTrack;
        this.config = outputConfig;
        this.maxPlaybackSpeed = f;
        this.capabilityChangeListener = capabilityChangeListener;
        this.listeners = new ListenerSet<>(Thread.currentThread());
        boolean isEncodingLinearPcm = Util.isEncodingLinearPcm(outputConfig.encoding);
        this.isOutputPcm = isEncodingLinearPcm;
        if (isEncodingLinearPcm) {
            i = Util.getPcmFrameSize(outputConfig.encoding, Integer.bitCount(outputConfig.channelMask));
            this.pcmFrameSize = i;
        } else {
            i = -1;
            this.pcmFrameSize = -1;
        }
        int i2 = i;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.audioTrackPositionTracker = new AudioTrackPositionTracker(new PositionTrackerListener(), clock, audioTrack, outputConfig.encoding, i2, outputConfig.bufferSize);
        if (Build.VERSION.SDK_INT >= 24 && capabilityChangeListener != null) {
            this.onRoutingChangedListener = new OnRoutingChangedListenerApi24(audioTrack, capabilityChangeListener);
        }
        this.offloadStreamEventCallbackV29 = isOffloadedPlayback() ? new StreamEventCallbackV29() : null;
    }

    private int getAudioOutputUnderrunCount(long j) {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.audioTrack.getUnderrunCount();
        }
        boolean z = this.hasData;
        boolean z2 = j > Util.durationUsToSampleCount(getPositionUs(), getSampleRate());
        this.hasData = z2;
        return (!z || z2 || this.audioTrack.getPlayState() == 1) ? this.lastUnderrunCount : this.lastUnderrunCount + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getWrittenFrames() {
        return this.isOutputPcm ? Util.ceilDivide(this.writtenPcmBytes, this.pcmFrameSize) : this.writtenEncodedFrames;
    }

    private boolean hasPendingAudioTrackUnderruns(long j) {
        int audioOutputUnderrunCount = getAudioOutputUnderrunCount(j);
        boolean z = audioOutputUnderrunCount > this.lastUnderrunCount;
        this.lastUnderrunCount = audioOutputUnderrunCount;
        return z;
    }

    public static boolean hasPendingReleases() {
        boolean z;
        synchronized (releaseExecutorLock) {
            z = pendingReleaseCount > 0;
        }
        return z;
    }

    private static boolean isAudioTrackDeadObject(int i) {
        return (Build.VERSION.SDK_INT >= 24 && i == -6) || i == ERROR_NATIVE_DEAD_OBJECT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$releaseAudioTrackAsync$0(ListenerSet listenerSet) {
        if (listenerSet.isRunningOnCorrectThread()) {
            listenerSet.sendEvent(new j0((byte) 11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$releaseAudioTrackAsync$1(AudioTrack audioTrack, Handler handler, ListenerSet listenerSet) {
        byte b = 5;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new h(listenerSet, b));
            }
            synchronized (releaseExecutorLock) {
                try {
                    int i = pendingReleaseCount - 1;
                    pendingReleaseCount = i;
                    if (i == 0) {
                        ScheduledExecutorService scheduledExecutorService = releaseExecutor;
                        scheduledExecutorService.getClass();
                        scheduledExecutorService.shutdown();
                        releaseExecutor = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new h(listenerSet, b));
            }
            synchronized (releaseExecutorLock) {
                try {
                    int i2 = pendingReleaseCount - 1;
                    pendingReleaseCount = i2;
                    if (i2 == 0) {
                        ScheduledExecutorService scheduledExecutorService2 = releaseExecutor;
                        scheduledExecutorService2.getClass();
                        scheduledExecutorService2.shutdown();
                        releaseExecutor = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    private void maybeReportUnderrun() {
        if (this.listeners.isRunningOnCorrectThread() && hasPendingAudioTrackUnderruns(getWrittenFrames())) {
            this.listeners.sendEvent(new y9());
        }
    }

    private static void releaseAudioTrackAsync(AudioTrack audioTrack, ListenerSet<AudioOutput.Listener> listenerSet) {
        Handler createHandlerForCurrentLooper = Util.createHandlerForCurrentLooper();
        synchronized (releaseExecutorLock) {
            try {
                ScheduledExecutorService scheduledExecutorService = releaseExecutor;
                if (scheduledExecutorService == null) {
                    scheduledExecutorService = Util.newSingleThreadScheduledExecutor("ExoPlayer:AudioTrackReleaseThread");
                    releaseExecutor = scheduledExecutorService;
                }
                pendingReleaseCount++;
                scheduledExecutorService.schedule(new of(audioTrack, createHandlerForCurrentLooper, listenerSet, (byte) 1), 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int writeWithAvSync(AudioTrack audioTrack, ByteBuffer byteBuffer, long j) {
        int remaining = byteBuffer.remaining();
        if (Build.VERSION.SDK_INT >= 26) {
            return audioTrack.write(byteBuffer, remaining, 1, j * 1000);
        }
        if (this.avSyncHeader == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.avSyncHeader = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.avSyncHeader.putInt(1431633921);
        }
        if (this.bytesUntilNextAvSync == 0) {
            this.avSyncHeader.putInt(4, remaining);
            this.avSyncHeader.putLong(8, j * 1000);
            this.avSyncHeader.position(0);
            this.bytesUntilNextAvSync = remaining;
        }
        int remaining2 = this.avSyncHeader.remaining();
        if (remaining2 > 0) {
            int write = audioTrack.write(this.avSyncHeader, remaining2, 1);
            if (write < 0) {
                this.bytesUntilNextAvSync = 0;
                return write;
            }
            if (write < remaining2) {
                return 0;
            }
        }
        int write2 = audioTrack.write(byteBuffer, remaining, 1);
        if (write2 < 0) {
            this.bytesUntilNextAvSync = 0;
            return write2;
        }
        this.bytesUntilNextAvSync -= write2;
        return write2;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void addListener(AudioOutput.Listener listener) {
        this.listeners.add(listener);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void attachAuxEffect(int i) {
        this.audioTrack.attachAuxEffect(i);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public final /* synthetic */ boolean canReuseAudioOutput(AudioOutputProvider.OutputConfig outputConfig, AudioOutputProvider.FormatConfig formatConfig, AudioOutputProvider.OutputConfig outputConfig2) {
        return pt1.c(outputConfig, outputConfig2);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void flush() {
        this.avSyncHeader = null;
        this.bytesUntilNextAvSync = 0;
        this.writtenPcmBytes = 0L;
        this.writtenEncodedFrames = 0L;
        this.hasBeenStopped = false;
        this.framesPerEncodedSample = 0;
        this.audioTrack.flush();
        this.audioTrackPositionTracker.reset();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public int getAudioSessionId() {
        return this.audioTrack.getAudioSessionId();
    }

    public AudioTrack getAudioTrack() {
        return this.audioTrack;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public long getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public PlaybackParameters getPlaybackParameters() {
        PlaybackParams playbackParams = this.audioTrack.getPlaybackParams();
        return new PlaybackParameters(playbackParams.getSpeed(), playbackParams.getPitch());
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public long getPositionUs() {
        return this.audioTrackPositionTracker.getCurrentPositionUs(getWrittenFrames());
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public int getSampleRate() {
        return this.audioTrack.getSampleRate();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public boolean isOffloadedPlayback() {
        return Build.VERSION.SDK_INT >= 29 && this.audioTrack.isOffloadedPlayback();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public boolean isStalled() {
        return this.audioTrackPositionTracker.isStalled(getWrittenFrames());
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void pause() {
        this.audioTrackPositionTracker.pause();
        if (!this.hasBeenStopped || isOffloadedPlayback()) {
            this.audioTrack.pause();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void play() {
        this.audioTrackPositionTracker.start();
        if (!this.hasBeenStopped || isOffloadedPlayback()) {
            this.audioTrack.play();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void release() {
        OnRoutingChangedListenerApi24 onRoutingChangedListenerApi24;
        if (this.audioTrackPositionTracker.isPlaying()) {
            this.audioTrack.pause();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && isOffloadedPlayback()) {
            StreamEventCallbackV29 streamEventCallbackV29 = this.offloadStreamEventCallbackV29;
            streamEventCallbackV29.getClass();
            streamEventCallbackV29.unregister();
        }
        if (i >= 24 && (onRoutingChangedListenerApi24 = this.onRoutingChangedListener) != null) {
            onRoutingChangedListenerApi24.release();
            this.onRoutingChangedListener = null;
        }
        releaseAudioTrackAsync(this.audioTrack, this.listeners);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void removeListener(AudioOutput.Listener listener) {
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setAuxEffectSendLevel(float f) {
        this.audioTrack.setAuxEffectSendLevel(f);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setOffloadDelayPadding(int i, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.audioTrack.setOffloadDelayPadding(i, i2);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setOffloadEndOfStream() {
        if (Build.VERSION.SDK_INT >= 29 && this.audioTrack.getPlayState() == 3) {
            this.audioTrack.setOffloadEndOfStream();
            this.audioTrackPositionTracker.expectRawPlaybackHeadReset();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        try {
            this.audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(Util.constrainValue(playbackParameters.speed, 0.1f, this.maxPlaybackSpeed)).setPitch(Util.constrainValue(playbackParameters.pitch, 0.1f, 8.0f)).setAudioFallbackMode(2));
        } catch (IllegalArgumentException e) {
            Log.w(TAG, "Failed to set playback params", e);
        }
        this.audioTrackPositionTracker.setAudioTrackPlaybackSpeed(this.audioTrack.getPlaybackParams().getSpeed());
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setPlayerId(PlayerId playerId) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId logSessionId2 = playerId.getLogSessionId();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId2.equals(logSessionId)) {
            return;
        }
        this.audioTrack.setLogSessionId(logSessionId2);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.audioTrack.setPreferredDevice(audioDeviceInfo);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setVolume(float f) {
        this.audioTrack.setVolume(f);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void stop() {
        if (this.hasBeenStopped) {
            return;
        }
        this.hasBeenStopped = true;
        this.audioTrackPositionTracker.handleEndOfStream(getWrittenFrames());
        this.audioTrack.stop();
        this.bytesUntilNextAvSync = 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public boolean write(ByteBuffer byteBuffer, int i, long j) {
        int write;
        CapabilityChangeListener capabilityChangeListener;
        if (!this.isOutputPcm && this.framesPerEncodedSample == 0) {
            this.framesPerEncodedSample = DefaultAudioSink.getFramesPerEncodedSample(this.config.encoding, byteBuffer);
        }
        maybeReportUnderrun();
        int remaining = byteBuffer.remaining();
        if (this.config.isTunneling) {
            if (j == Long.MIN_VALUE) {
                j = this.lastTunnelingAvSyncPresentationTimeUs;
            } else {
                this.lastTunnelingAvSyncPresentationTimeUs = j;
            }
            write = writeWithAvSync(this.audioTrack, byteBuffer, j);
        } else {
            write = this.audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            boolean isAudioTrackDeadObject = isAudioTrackDeadObject(write);
            if (isAudioTrackDeadObject && (capabilityChangeListener = this.capabilityChangeListener) != null) {
                capabilityChangeListener.onRecoverableWriteError();
            }
            throw new AudioOutput.WriteException(write, isAudioTrackDeadObject);
        }
        boolean z = write == remaining;
        if (this.isOutputPcm) {
            this.writtenPcmBytes += write;
            return z;
        }
        if (z) {
            this.writtenEncodedFrames = (this.framesPerEncodedSample * i) + this.writtenEncodedFrames;
        }
        return z;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    @Deprecated
    public AudioTrackAudioOutput(AudioTrack audioTrack, AudioOutputProvider.OutputConfig outputConfig, CapabilityChangeListener capabilityChangeListener, Clock clock) {
        this(audioTrack, outputConfig, capabilityChangeListener, 8.0f, clock);
    }
}
