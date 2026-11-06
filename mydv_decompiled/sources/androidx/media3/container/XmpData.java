package androidx.media3.container;

import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class XmpData implements Metadata.Entry {
    public final byte[] data;

    public XmpData(byte[] bArr) {
        this.data = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || XmpData.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.data, ((XmpData) obj).data);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final Format getWrappedMetadataFormat() {
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    public String toString() {
        return "XMP: " + Util.toHexString(this.data);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void populateMediaMetadata(MediaMetadata.Builder builder) {
    }
}
