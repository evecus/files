package androidx.media3.exoplayer.util;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.Util;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.ja;
import defpackage.x24;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class SpatializerWrapper {
    private final Handler handler;
    private final Spatializer$OnSpatializerStateChangedListener listener;
    private final boolean spatializationSupported;
    private final Spatializer spatializer;

    public SpatializerWrapper(Context context, final Runnable runnable, Boolean bool) {
        AudioManager audioManager = context == null ? null : AudioManagerCompat.getAudioManager(context);
        if (audioManager == null || (bool != null && bool.booleanValue())) {
            this.spatializer = null;
            this.spatializationSupported = false;
            this.handler = null;
            this.listener = null;
            return;
        }
        Spatializer spatializer = audioManager.getSpatializer();
        this.spatializer = spatializer;
        this.spatializationSupported = spatializer.getImmersiveAudioLevel() != 0;
        if (runnable == null) {
            this.handler = null;
            this.listener = null;
            return;
        }
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        Handler handler = new Handler(myLooper);
        this.handler = handler;
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = new Spatializer$OnSpatializerStateChangedListener() { // from class: androidx.media3.exoplayer.util.SpatializerWrapper.1
            public void onSpatializerAvailableChanged(Spatializer spatializer2, boolean z) {
                runnable.run();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer2, boolean z) {
                runnable.run();
            }
        };
        this.listener = spatializer$OnSpatializerStateChangedListener;
        spatializer.addOnSpatializerStateChangedListener(new ja(handler, (byte) 2), spatializer$OnSpatializerStateChangedListener);
    }

    public boolean canBeSpatialized(AudioAttributes audioAttributes, Format format) {
        int i;
        int i2;
        if (!isSupportedAvailableAndEnabled()) {
            return false;
        }
        if (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_E_AC3_JOC)) {
            i2 = format.channelCount;
            if (i2 == 16) {
                i = 12;
            }
            i = i2;
        } else if (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_IAMF)) {
            i2 = format.channelCount;
            if (i2 == -1) {
                i = 6;
            }
            i = i2;
        } else {
            boolean equals = Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_AC4);
            i = format.channelCount;
            if (equals) {
                i = (i == 18 || i == 21) ? 24 : i;
                i2 = i;
            } else {
                i2 = i;
            }
        }
        int i3 = format.channelMask;
        if (i3 == -1 || i2 != i) {
            i3 = Util.getAudioTrackChannelConfig(i);
        }
        if (i3 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(i3);
        int i4 = format.sampleRate;
        if (i4 != -1) {
            channelMask.setSampleRate(i4);
        }
        Spatializer spatializer = this.spatializer;
        spatializer.getClass();
        return spatializer.canBeSpatialized(audioAttributes.getPlatformAudioAttributes(), channelMask.build());
    }

    public List<Integer> getSpatializedChannelMasks() {
        if (!isSupportedAvailableAndEnabled()) {
            ay1 ay1Var = dy1.J;
            return x24.M;
        }
        if (Build.VERSION.SDK_INT < 36) {
            return dy1.t(252);
        }
        Spatializer spatializer = this.spatializer;
        spatializer.getClass();
        return spatializer.getSpatializedChannelMasks();
    }

    public boolean isAvailable() {
        Spatializer spatializer = this.spatializer;
        return spatializer != null && spatializer.isAvailable();
    }

    public boolean isEnabled() {
        Spatializer spatializer = this.spatializer;
        return spatializer != null && spatializer.isEnabled();
    }

    public boolean isSpatializationSupported() {
        return this.spatializationSupported;
    }

    public boolean isSupportedAvailableAndEnabled() {
        return this.spatializer != null && this.spatializationSupported && isAvailable() && isEnabled();
    }

    public void release() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        Spatializer spatializer = this.spatializer;
        if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.listener) == null || this.handler == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        this.handler.removeCallbacksAndMessages(null);
    }
}
