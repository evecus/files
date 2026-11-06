package coil3.compose;

import coil3.request.ImageRequest;
import defpackage.j42;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface AsyncImageModelEqualityDelegate {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final AsyncImageModelEqualityDelegate Default = new AsyncImageModelEqualityDelegate() { // from class: coil3.compose.AsyncImageModelEqualityDelegate$Companion$Default$1
        @Override // coil3.compose.AsyncImageModelEqualityDelegate
        public boolean equals(Object obj, Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj instanceof ImageRequest) || !(obj2 instanceof ImageRequest)) {
                return j42.c(obj, obj2);
            }
            ImageRequest imageRequest = (ImageRequest) obj;
            ImageRequest imageRequest2 = (ImageRequest) obj2;
            return j42.c(imageRequest.getContext(), imageRequest2.getContext()) && j42.c(imageRequest.getData(), imageRequest2.getData()) && j42.c(imageRequest.getMemoryCacheKey(), imageRequest2.getMemoryCacheKey()) && j42.c(imageRequest.getMemoryCacheKeyExtras(), imageRequest2.getMemoryCacheKeyExtras()) && j42.c(imageRequest.getDiskCacheKey(), imageRequest2.getDiskCacheKey()) && j42.c(imageRequest.getSizeResolver(), imageRequest2.getSizeResolver()) && imageRequest.getScale() == imageRequest2.getScale() && imageRequest.getPrecision() == imageRequest2.getPrecision();
        }

        @Override // coil3.compose.AsyncImageModelEqualityDelegate
        public int hashCode(Object obj) {
            if (!(obj instanceof ImageRequest)) {
                if (obj != null) {
                    return obj.hashCode();
                }
                return 0;
            }
            ImageRequest imageRequest = (ImageRequest) obj;
            int hashCode = (imageRequest.getData().hashCode() + (imageRequest.getContext().hashCode() * 31)) * 31;
            String memoryCacheKey = imageRequest.getMemoryCacheKey();
            int hashCode2 = (imageRequest.getMemoryCacheKeyExtras().hashCode() + ((hashCode + (memoryCacheKey != null ? memoryCacheKey.hashCode() : 0)) * 31)) * 31;
            String diskCacheKey = imageRequest.getDiskCacheKey();
            return imageRequest.getPrecision().hashCode() + ((imageRequest.getScale().hashCode() + ((imageRequest.getSizeResolver().hashCode() + ((hashCode2 + (diskCacheKey != null ? diskCacheKey.hashCode() : 0)) * 31)) * 31)) * 31);
        }

        public String toString() {
            return "AsyncImageModelEqualityDelegate.Default";
        }
    };
    public static final AsyncImageModelEqualityDelegate AllProperties = new AsyncImageModelEqualityDelegate() { // from class: coil3.compose.AsyncImageModelEqualityDelegate$Companion$AllProperties$1
        @Override // coil3.compose.AsyncImageModelEqualityDelegate
        public boolean equals(Object obj, Object obj2) {
            return j42.c(obj, obj2);
        }

        @Override // coil3.compose.AsyncImageModelEqualityDelegate
        public int hashCode(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "AsyncImageModelEqualityDelegate.AllProperties";
        }
    };

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    boolean equals(Object obj, Object obj2);

    int hashCode(Object obj);
}
