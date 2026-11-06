package coil3.fetch;

import coil3.Image;
import coil3.decode.DataSource;
import defpackage.j42;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ImageFetchResult implements FetchResult {
    private final DataSource dataSource;
    private final Image image;
    private final boolean isSampled;

    public ImageFetchResult(Image image, boolean z, DataSource dataSource) {
        this.image = image;
        this.isSampled = z;
        this.dataSource = dataSource;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageFetchResult)) {
            return false;
        }
        ImageFetchResult imageFetchResult = (ImageFetchResult) obj;
        return j42.c(this.image, imageFetchResult.image) && this.isSampled == imageFetchResult.isSampled && this.dataSource == imageFetchResult.dataSource;
    }

    public final DataSource getDataSource() {
        return this.dataSource;
    }

    public final Image getImage() {
        return this.image;
    }

    public int hashCode() {
        return this.dataSource.hashCode() + (((this.image.hashCode() * 31) + (this.isSampled ? 1231 : 1237)) * 31);
    }

    public final boolean isSampled() {
        return this.isSampled;
    }

    public String toString() {
        return "ImageFetchResult(image=" + this.image + ", isSampled=" + this.isSampled + ", dataSource=" + this.dataSource + ")";
    }
}
