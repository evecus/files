package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Consumer {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ b(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        byte b = this.I;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                ((DrmSessionEventListener.EventDispatcher) obj).drmKeysLoaded((KeyRequestInfo) obj2);
                break;
            default:
                DefaultDrmSession.lambda$onError$2((Exception) obj2, (DrmSessionEventListener.EventDispatcher) obj);
                break;
        }
    }
}
