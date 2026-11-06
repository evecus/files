package coil3.decode;

import coil3.Image;
import defpackage.j42;
import defpackage.pt1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DecodeResult {
    private final Image image;
    private final boolean isSampled;

    public DecodeResult(Image image, boolean z) {
        this.image = image;
        this.isSampled = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecodeResult)) {
            return false;
        }
        DecodeResult decodeResult = (DecodeResult) obj;
        return j42.c(this.image, decodeResult.image) && this.isSampled == decodeResult.isSampled;
    }

    public final Image getImage() {
        return this.image;
    }

    public int hashCode() {
        return pt1.o(this.isSampled) + (this.image.hashCode() * 31);
    }

    public final boolean isSampled() {
        return this.isSampled;
    }

    public String toString() {
        return "DecodeResult(image=" + this.image + ", isSampled=" + this.isSampled + ")";
    }
}
