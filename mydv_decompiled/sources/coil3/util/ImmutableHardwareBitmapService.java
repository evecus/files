package coil3.util;

import coil3.size.Size;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class ImmutableHardwareBitmapService implements HardwareBitmapService {
    private final boolean allowHardware;

    public ImmutableHardwareBitmapService(boolean z) {
        this.allowHardware = z;
    }

    @Override // coil3.util.HardwareBitmapService
    public boolean allowHardwareMainThread(Size size) {
        return this.allowHardware;
    }

    @Override // coil3.util.HardwareBitmapService
    public boolean allowHardwareWorkerThread() {
        return this.allowHardware;
    }
}
