package androidx.media3.common.audio;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.audio.AudioFocusRequestCompat;
import androidx.media3.common.util.Util;
import defpackage.sp0;
import defpackage.zy;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class AudioFocusRequestCompat {
    private final boolean acceptsDelayedFocusGain;
    private final AudioAttributes audioAttributes;
    private final Handler focusChangeHandler;
    private final int focusGain;
    private final Object frameworkAudioFocusRequest;
    private final AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
    private final boolean pauseOnDuck;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class OnAudioFocusChangeListenerHandlerCompat implements AudioManager.OnAudioFocusChangeListener {
        private final Handler handler;
        private final AudioManager.OnAudioFocusChangeListener listener;

        public OnAudioFocusChangeListenerHandlerCompat(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.listener = onAudioFocusChangeListener;
            this.handler = Util.createHandler(handler.getLooper(), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAudioFocusChange$0(int i) {
            this.listener.onAudioFocusChange(i);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            Util.postOrRun(this.handler, new Runnable() { // from class: androidx.media3.common.audio.b
                @Override // java.lang.Runnable
                public final void run() {
                    AudioFocusRequestCompat.OnAudioFocusChangeListenerHandlerCompat.this.lambda$onAudioFocusChange$0(i);
                }
            });
        }
    }

    public AudioFocusRequestCompat(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributes audioAttributes, boolean z, boolean z2) {
        this.focusGain = i;
        this.focusChangeHandler = handler;
        this.audioAttributes = audioAttributes;
        this.pauseOnDuck = z;
        this.acceptsDelayedFocusGain = z2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.onAudioFocusChangeListener = new OnAudioFocusChangeListenerHandlerCompat(onAudioFocusChangeListener, handler);
        } else {
            this.onAudioFocusChangeListener = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.frameworkAudioFocusRequest = new AudioFocusRequest.Builder(i).setAudioAttributes(audioAttributes.getPlatformAudioAttributes()).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z2).build();
        } else {
            this.frameworkAudioFocusRequest = null;
        }
    }

    public boolean acceptsDelayedFocusGain() {
        return this.acceptsDelayedFocusGain;
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioFocusRequestCompat)) {
            return false;
        }
        AudioFocusRequestCompat audioFocusRequestCompat = (AudioFocusRequestCompat) obj;
        return this.focusGain == audioFocusRequestCompat.focusGain && this.pauseOnDuck == audioFocusRequestCompat.pauseOnDuck && Objects.equals(this.onAudioFocusChangeListener, audioFocusRequestCompat.onAudioFocusChangeListener) && Objects.equals(this.focusChangeHandler, audioFocusRequestCompat.focusChangeHandler) && Objects.equals(this.audioAttributes, audioFocusRequestCompat.audioAttributes);
    }

    public AudioAttributes getAudioAttributes() {
        return this.audioAttributes;
    }

    public AudioFocusRequest getAudioFocusRequest() {
        Object obj = this.frameworkAudioFocusRequest;
        obj.getClass();
        return (AudioFocusRequest) obj;
    }

    public Handler getFocusChangeHandler() {
        return this.focusChangeHandler;
    }

    public int getFocusGain() {
        return this.focusGain;
    }

    public AudioManager.OnAudioFocusChangeListener getOnAudioFocusChangeListener() {
        return this.onAudioFocusChangeListener;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.focusGain), this.onAudioFocusChangeListener, this.focusChangeHandler, this.audioAttributes, Boolean.valueOf(this.pauseOnDuck));
    }

    public boolean willPauseWhenDucked() {
        return this.pauseOnDuck;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private boolean acceptsDelayedFocusGain;
        private AudioAttributes audioAttributes;
        private Handler focusChangeHandler;
        private int focusGain;
        private AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
        private boolean pauseOnDuck;

        private Builder(AudioFocusRequestCompat audioFocusRequestCompat) {
            this.focusGain = audioFocusRequestCompat.getFocusGain();
            this.onAudioFocusChangeListener = audioFocusRequestCompat.getOnAudioFocusChangeListener();
            this.focusChangeHandler = audioFocusRequestCompat.getFocusChangeHandler();
            this.audioAttributes = audioFocusRequestCompat.getAudioAttributes();
            this.pauseOnDuck = audioFocusRequestCompat.willPauseWhenDucked();
        }

        private static boolean isValidFocusGain(int i) {
            return i == 1 || i == 2 || i == 3 || i == 4;
        }

        public AudioFocusRequestCompat build() {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.onAudioFocusChangeListener;
            if (onAudioFocusChangeListener == null) {
                zy.i("Can't build an AudioFocusRequestCompat instance without a listener");
                return null;
            }
            int i = this.focusGain;
            Handler handler = this.focusChangeHandler;
            handler.getClass();
            return new AudioFocusRequestCompat(i, onAudioFocusChangeListener, handler, this.audioAttributes, this.pauseOnDuck, this.acceptsDelayedFocusGain);
        }

        public Builder setAcceptsDelayedFocusGain(boolean z) {
            this.acceptsDelayedFocusGain = z;
            return this;
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes) {
            audioAttributes.getClass();
            this.audioAttributes = audioAttributes;
            return this;
        }

        public Builder setFocusGain(int i) {
            sp0.o(isValidFocusGain(i));
            this.focusGain = i;
            return this;
        }

        public Builder setOnAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return setOnAudioFocusChangeListener(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }

        public Builder setWillPauseWhenDucked(boolean z) {
            this.pauseOnDuck = z;
            return this;
        }

        public Builder setOnAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            onAudioFocusChangeListener.getClass();
            handler.getClass();
            this.onAudioFocusChangeListener = onAudioFocusChangeListener;
            this.focusChangeHandler = handler;
            return this;
        }

        public Builder(int i) {
            this.audioAttributes = AudioAttributes.DEFAULT;
            this.focusGain = i;
        }
    }
}
