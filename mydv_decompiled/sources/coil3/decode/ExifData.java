package coil3.decode;

import defpackage.er0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ExifData {
    public static final Companion Companion = new Companion(null);
    public static final ExifData NONE = new ExifData(false, 0);
    private final boolean isFlipped;
    private final int rotationDegrees;

    public ExifData(boolean z, int i) {
        this.isFlipped = z;
        this.rotationDegrees = i;
    }

    public final int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public final boolean isFlipped() {
        return this.isFlipped;
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
