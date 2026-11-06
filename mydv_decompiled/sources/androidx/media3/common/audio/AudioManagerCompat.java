package androidx.media3.common.audio;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.BackgroundExecutor;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import defpackage.lr;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AudioManagerCompat {
    public static final int AUDIOFOCUS_GAIN = 1;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    public static final int AUDIOFOCUS_NONE = 0;
    private static final String TAG = "AudioManagerCompat";
    private static Context applicationContext;
    private static AudioManager audioManager;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface AudioFocusGain {
    }

    private AudioManagerCompat() {
    }

    public static int abandonAudioFocusRequest(AudioManager audioManager2, AudioFocusRequestCompat audioFocusRequestCompat) {
        return Build.VERSION.SDK_INT >= 26 ? audioManager2.abandonAudioFocusRequest(audioFocusRequestCompat.getAudioFocusRequest()) : audioManager2.abandonAudioFocus(audioFocusRequestCompat.getOnAudioFocusChangeListener());
    }

    public static synchronized AudioManager getAudioManager(Context context) {
        synchronized (AudioManagerCompat.class) {
            try {
                Context applicationContext2 = context.getApplicationContext();
                if (applicationContext != applicationContext2) {
                    audioManager = null;
                }
                AudioManager audioManager2 = audioManager;
                if (audioManager2 != null) {
                    return audioManager2;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    ConditionVariable conditionVariable = new ConditionVariable();
                    BackgroundExecutor.get().execute(new lr(applicationContext2, conditionVariable, (byte) 0));
                    conditionVariable.blockUninterruptible();
                    AudioManager audioManager3 = audioManager;
                    audioManager3.getClass();
                    return audioManager3;
                }
                AudioManager audioManager4 = (AudioManager) applicationContext2.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                audioManager = audioManager4;
                audioManager4.getClass();
                return audioManager4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int getStreamMaxVolume(AudioManager audioManager2, int i) {
        return audioManager2.getStreamMaxVolume(i);
    }

    public static int getStreamMinVolume(AudioManager audioManager2, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return audioManager2.getStreamMinVolume(i);
        }
        return 0;
    }

    public static int getStreamVolume(AudioManager audioManager2, int i) {
        try {
            return audioManager2.getStreamVolume(i);
        } catch (RuntimeException e) {
            Log.w(TAG, "Could not retrieve stream volume for stream type " + i, e);
            return audioManager2.getStreamMaxVolume(i);
        }
    }

    public static boolean isStreamMute(AudioManager audioManager2, int i) {
        return audioManager2.isStreamMute(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getAudioManager$0(Context context, ConditionVariable conditionVariable) {
        audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        conditionVariable.open();
    }

    public static int requestAudioFocus(AudioManager audioManager2, AudioFocusRequestCompat audioFocusRequestCompat) {
        return Build.VERSION.SDK_INT >= 26 ? audioManager2.requestAudioFocus(audioFocusRequestCompat.getAudioFocusRequest()) : audioManager2.requestAudioFocus(audioFocusRequestCompat.getOnAudioFocusChangeListener(), audioFocusRequestCompat.getAudioAttributes().getVolumeControlStream(), audioFocusRequestCompat.getFocusGain());
    }
}
