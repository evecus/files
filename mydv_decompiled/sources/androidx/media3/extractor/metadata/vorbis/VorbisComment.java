package androidx.media3.extractor.metadata.vorbis;

import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import defpackage.hf1;
import defpackage.j42;
import defpackage.sp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class VorbisComment implements Metadata.Entry {
    public final String key;
    public final String value;

    public VorbisComment(String str, String str2) {
        this.key = j42.k0(str);
        this.value = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && VorbisComment.class == obj.getClass()) {
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (this.key.equals(vorbisComment.key) && this.value.equals(vorbisComment.value)) {
                return true;
            }
        }
        return false;
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
        return this.value.hashCode() + hf1.n(527, 31, this.key);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.key;
        str.getClass();
        switch (str) {
            case "TOTALTRACKS":
                Integer q0 = sp0.q0(this.value);
                if (q0 != null) {
                    builder.setTotalTrackCount(q0);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer q02 = sp0.q0(this.value);
                if (q02 != null) {
                    builder.setTotalDiscCount(q02);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer q03 = sp0.q0(this.value);
                if (q03 != null) {
                    builder.setTrackNumber(q03);
                    break;
                }
                break;
            case "ALBUM":
                builder.setAlbumTitle(this.value);
                break;
            case "GENRE":
                builder.setGenre(this.value);
                break;
            case "TITLE":
                builder.setTitle(this.value);
                break;
            case "DESCRIPTION":
                builder.setDescription(this.value);
                break;
            case "DISCSUBTITLE":
                builder.setDiscSubtitle(this.value);
                break;
            case "DISCNUMBER":
                Integer q04 = sp0.q0(this.value);
                if (q04 != null) {
                    builder.setDiscNumber(q04);
                    break;
                }
                break;
            case "ALBUMARTIST":
                builder.setAlbumArtist(this.value);
                break;
            case "ARTIST":
                builder.setArtist(this.value);
                break;
        }
    }

    public String toString() {
        return "VC: " + this.key + "=" + this.value;
    }
}
