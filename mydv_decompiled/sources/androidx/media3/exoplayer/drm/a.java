package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Consumer {
    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmSessionAcquired(3);
    }
}
