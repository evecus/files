package androidx.media3.exoplayer.upstream.contentsteering;

import android.net.Uri;
import androidx.media3.exoplayer.source.MediaSourceEventListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface ContentSteeringTracker {
    boolean excludeCurrentPathway(long j);

    boolean isActive();

    void start(Uri uri, String str, MediaSourceEventListener.EventDispatcher eventDispatcher);

    void stop();
}
