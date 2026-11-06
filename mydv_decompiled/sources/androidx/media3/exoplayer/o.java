package androidx.media3.exoplayer;

import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.ExoPlayerImplInternal;
import androidx.media3.exoplayer.SuitableOutputChecker;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements ListenerSet.IterationFinishedEvent, ExoPlayerImplInternal.PlaybackInfoUpdateListener, BackgroundThreadStateHandler.StateChangeListener, SuitableOutputChecker.Callback, ListenerSet.Event {
    public final /* synthetic */ ExoPlayerImpl I;

    public /* synthetic */ o(ExoPlayerImpl exoPlayerImpl) {
        this.I = exoPlayerImpl;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        this.I.lambda$updateAvailableCommands$31((Player.Listener) obj);
    }

    @Override // androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdateListener
    public void onPlaybackInfoUpdate(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        this.I.lambda$new$2(playbackInfoUpdate);
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker.Callback
    public void onSelectedOutputSuitabilityChanged(boolean z) {
        this.I.onSelectedOutputSuitabilityChanged(z);
    }

    @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
    public void onStateChanged(Object obj, Object obj2) {
        this.I.onAudioSessionIdChanged(((Integer) obj).intValue(), ((Integer) obj2).intValue());
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        this.I.lambda$new$0((Player.Listener) obj, flagSet);
    }
}
