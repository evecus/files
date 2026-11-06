package defpackage;

import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import com.github.mytv.dv.MainActivity;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class kx2 {
    public static final ix2 Companion = new ix2();
    public static kx2 c;
    public final MainActivity a;
    public final MediaSession b;

    public kx2(MainActivity mainActivity) {
        this.a = mainActivity;
        MediaSession mediaSession = new MediaSession(mainActivity, "MediaKeySession");
        mediaSession.setPlaybackState(new PlaybackState.Builder().setState(3, -1L, 0.0f).setActions(560L).build());
        mediaSession.setCallback(new jx2(this));
        this.b = mediaSession;
        c = this;
    }

    public final void a() {
        if (c == this) {
            c = null;
        }
        MediaSession mediaSession = this.b;
        mediaSession.setActive(false);
        mediaSession.release();
    }

    public final void b(boolean z) {
        this.b.setActive(z);
    }
}
