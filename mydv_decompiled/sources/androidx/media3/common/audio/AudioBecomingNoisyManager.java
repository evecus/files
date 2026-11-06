package androidx.media3.common.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import androidx.media3.common.audio.AudioBecomingNoisyManager;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AudioBecomingNoisyManager {
    private final HandlerWrapper backgroundHandler;
    private final Context context;
    private boolean isEnabled;
    private final AudioBecomingNoisyReceiver receiver;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class AudioBecomingNoisyReceiver extends BroadcastReceiver {
        private final HandlerWrapper eventHandler;
        private final Listener listener;

        private AudioBecomingNoisyReceiver(HandlerWrapper handlerWrapper, Listener listener) {
            this.eventHandler = handlerWrapper;
            this.listener = listener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void callListenerIfEnabled() {
            if (AudioBecomingNoisyManager.this.isEnabled) {
                this.listener.onAudioBecomingNoisy();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.eventHandler.post(new Runnable() { // from class: androidx.media3.common.audio.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioBecomingNoisyManager.AudioBecomingNoisyReceiver.this.callListenerIfEnabled();
                    }
                });
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Listener {
        void onAudioBecomingNoisy();
    }

    public AudioBecomingNoisyManager(Context context, Looper looper, Looper looper2, Listener listener, Clock clock) {
        this.context = context.getApplicationContext();
        this.backgroundHandler = clock.createHandler(looper, null);
        this.receiver = new AudioBecomingNoisyReceiver(clock.createHandler(looper2, null), listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setEnabled$0() {
        this.context.registerReceiver(this.receiver, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setEnabled$1() {
        this.context.unregisterReceiver(this.receiver);
    }

    public void setEnabled(boolean z) {
        if (z == this.isEnabled) {
            return;
        }
        HandlerWrapper handlerWrapper = this.backgroundHandler;
        if (z) {
            final byte b = 0;
            handlerWrapper.post(new Runnable(this) { // from class: gr
                public final /* synthetic */ AudioBecomingNoisyManager J;

                {
                    this.J = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    AudioBecomingNoisyManager audioBecomingNoisyManager = this.J;
                    switch (b2) {
                        case 0:
                            audioBecomingNoisyManager.lambda$setEnabled$0();
                            break;
                        default:
                            audioBecomingNoisyManager.lambda$setEnabled$1();
                            break;
                    }
                }
            });
            this.isEnabled = true;
        } else {
            final byte b2 = 1;
            handlerWrapper.post(new Runnable(this) { // from class: gr
                public final /* synthetic */ AudioBecomingNoisyManager J;

                {
                    this.J = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = b2;
                    AudioBecomingNoisyManager audioBecomingNoisyManager = this.J;
                    switch (b22) {
                        case 0:
                            audioBecomingNoisyManager.lambda$setEnabled$0();
                            break;
                        default:
                            audioBecomingNoisyManager.lambda$setEnabled$1();
                            break;
                    }
                }
            });
            this.isEnabled = false;
        }
    }
}
