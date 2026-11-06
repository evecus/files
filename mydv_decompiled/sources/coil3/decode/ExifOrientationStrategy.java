package coil3.decode;

import defpackage.mz;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface ExifOrientationStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final ExifOrientationStrategy IGNORE;
    public static final ExifOrientationStrategy RESPECT_ALL;
    public static final ExifOrientationStrategy RESPECT_PERFORMANCE;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    static {
        final byte b = 0;
        IGNORE = new ExifOrientationStrategy() { // from class: yb1
            @Override // coil3.decode.ExifOrientationStrategy
            public final boolean supports(String str, mz mzVar) {
                switch (b) {
                    case 0:
                        int i = zb1.a;
                        break;
                    case 1:
                        int i2 = zb1.a;
                        if (str != null) {
                            if (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif")) {
                                break;
                            }
                        }
                        break;
                    default:
                        int i3 = zb1.a;
                        break;
                }
                return true;
            }
        };
        final byte b2 = 1;
        RESPECT_PERFORMANCE = new ExifOrientationStrategy() { // from class: yb1
            @Override // coil3.decode.ExifOrientationStrategy
            public final boolean supports(String str, mz mzVar) {
                switch (b2) {
                    case 0:
                        int i = zb1.a;
                        break;
                    case 1:
                        int i2 = zb1.a;
                        if (str != null) {
                            if (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif")) {
                                break;
                            }
                        }
                        break;
                    default:
                        int i3 = zb1.a;
                        break;
                }
                return true;
            }
        };
        final byte b3 = 2;
        RESPECT_ALL = new ExifOrientationStrategy() { // from class: yb1
            @Override // coil3.decode.ExifOrientationStrategy
            public final boolean supports(String str, mz mzVar) {
                switch (b3) {
                    case 0:
                        int i = zb1.a;
                        break;
                    case 1:
                        int i2 = zb1.a;
                        if (str != null) {
                            if (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif")) {
                                break;
                            }
                        }
                        break;
                    default:
                        int i3 = zb1.a;
                        break;
                }
                return true;
            }
        };
    }

    boolean supports(String str, mz mzVar);
}
