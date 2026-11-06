package coil3.util;

import androidx.media3.common.util.Log;
import coil3.size.Dimension;
import coil3.size.Size;
import defpackage.er0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class LimitedFileDescriptorHardwareBitmapService implements HardwareBitmapService {
    public static final Companion Companion = new Companion(null);
    private static final int MIN_SIZE_DIMENSION = 100;
    private final Logger logger;

    public LimitedFileDescriptorHardwareBitmapService(Logger logger) {
        this.logger = logger;
    }

    @Override // coil3.util.HardwareBitmapService
    public boolean allowHardwareMainThread(Size size) {
        Dimension width = size.getWidth();
        boolean z = width instanceof Dimension.Pixels;
        int i = Log.LOG_LEVEL_OFF;
        if ((z ? ((Dimension.Pixels) width).m116unboximpl() : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        Dimension height = size.getHeight();
        if (height instanceof Dimension.Pixels) {
            i = ((Dimension.Pixels) height).m116unboximpl();
        }
        return i > 100;
    }

    @Override // coil3.util.HardwareBitmapService
    public boolean allowHardwareWorkerThread() {
        return FileDescriptorCounter.INSTANCE.hasAvailableFileDescriptors(this.logger);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }
}
