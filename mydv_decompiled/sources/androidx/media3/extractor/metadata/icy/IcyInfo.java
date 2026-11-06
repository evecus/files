package androidx.media3.extractor.metadata.icy;

import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import defpackage.nt3;
import defpackage.r7;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class IcyInfo implements Metadata.Entry {
    public final byte[] rawMetadata;
    public final String title;
    public final String url;

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.rawMetadata = bArr;
        this.title = str;
        this.url = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.rawMetadata, ((IcyInfo) obj).rawMetadata);
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
        return Arrays.hashCode(this.rawMetadata);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.title;
        if (str != null) {
            builder.setTitle(str);
        }
    }

    public String toString() {
        String str = this.title;
        String str2 = this.url;
        return nt3.n(r7.F("ICY: title=\"", str, "\", url=\"", str2, "\", rawMetadata.length=\""), this.rawMetadata.length, "\"");
    }
}
