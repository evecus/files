package androidx.media3.extractor.metadata;

import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import defpackage.jl2;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ThumbnailMetadata implements Metadata.Entry {
    public final long presentationTimeUs;

    public ThumbnailMetadata(long j) {
        this.presentationTimeUs = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ThumbnailMetadata.class == obj.getClass() && this.presentationTimeUs == ((ThumbnailMetadata) obj).presentationTimeUs;
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
        return jl2.L(this.presentationTimeUs) + 527;
    }

    public String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.presentationTimeUs;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void populateMediaMetadata(MediaMetadata.Builder builder) {
    }
}
