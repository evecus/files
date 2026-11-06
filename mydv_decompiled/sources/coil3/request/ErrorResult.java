package coil3.request;

import coil3.Image;
import defpackage.j42;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ErrorResult implements ImageResult {
    private final Image image;
    private final ImageRequest request;
    private final Throwable throwable;

    public ErrorResult(Image image, ImageRequest imageRequest, Throwable th) {
        this.image = image;
        this.request = imageRequest;
        this.throwable = th;
    }

    public static /* synthetic */ ErrorResult copy$default(ErrorResult errorResult, Image image, ImageRequest imageRequest, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            image = errorResult.getImage();
        }
        if ((i & 2) != 0) {
            imageRequest = errorResult.getRequest();
        }
        if ((i & 4) != 0) {
            th = errorResult.throwable;
        }
        return errorResult.copy(image, imageRequest, th);
    }

    public final ErrorResult copy(Image image, ImageRequest imageRequest, Throwable th) {
        return new ErrorResult(image, imageRequest, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorResult)) {
            return false;
        }
        ErrorResult errorResult = (ErrorResult) obj;
        return j42.c(this.image, errorResult.image) && j42.c(this.request, errorResult.request) && j42.c(this.throwable, errorResult.throwable);
    }

    @Override // coil3.request.ImageResult
    public Image getImage() {
        return this.image;
    }

    @Override // coil3.request.ImageResult
    public ImageRequest getRequest() {
        return this.request;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        Image image = this.image;
        int hashCode = image == null ? 0 : image.hashCode();
        return this.throwable.hashCode() + ((this.request.hashCode() + (hashCode * 31)) * 31);
    }

    public String toString() {
        return "ErrorResult(image=" + this.image + ", request=" + this.request + ", throwable=" + this.throwable + ")";
    }
}
