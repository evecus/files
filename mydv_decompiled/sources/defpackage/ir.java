package defpackage;

import android.media.AudioManager;
import androidx.media3.common.audio.AudioFocusManager;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ir implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ AudioFocusManager a;

    public /* synthetic */ ir(AudioFocusManager audioFocusManager) {
        this.a = audioFocusManager;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.a.handlePlatformAudioFocusChange(i);
    }
}
