package androidx.media3.container;

import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Mp4AlternateGroupData implements Metadata.Entry {
    public final int alternateGroup;

    public Mp4AlternateGroupData(int i) {
        this.alternateGroup = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Mp4AlternateGroupData) && this.alternateGroup == ((Mp4AlternateGroupData) obj).alternateGroup;
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
        return this.alternateGroup;
    }

    public String toString() {
        return "Mp4AlternateGroup: " + this.alternateGroup;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void populateMediaMetadata(MediaMetadata.Builder builder) {
    }
}
