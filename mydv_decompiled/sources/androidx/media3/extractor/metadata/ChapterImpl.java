package androidx.media3.extractor.metadata;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.MediaMetadata;
import defpackage.jl2;
import defpackage.sp0;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class ChapterImpl implements Chapter {
    private final long endTimeMs;
    private final boolean isHidden;
    private final long startTimeMs;
    private final Label title;

    public ChapterImpl(long j, long j2, boolean z, Label label) {
        sp0.o(j == C.TIME_UNSET || j2 == C.TIME_UNSET || j <= j2);
        this.startTimeMs = j;
        this.endTimeMs = j2;
        this.isHidden = z;
        this.title = label;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterImpl.class == obj.getClass()) {
            ChapterImpl chapterImpl = (ChapterImpl) obj;
            if (this.startTimeMs == chapterImpl.startTimeMs && this.endTimeMs == chapterImpl.endTimeMs && this.isHidden == chapterImpl.isHidden && Objects.equals(this.title, chapterImpl.title)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.metadata.Chapter
    public long getEndTimeMs() {
        return this.endTimeMs;
    }

    @Override // androidx.media3.extractor.metadata.Chapter
    public long getStartTimeMs() {
        return this.startTimeMs;
    }

    @Override // androidx.media3.extractor.metadata.Chapter
    public Label getTitle() {
        return this.title;
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
        int L = (((jl2.L(this.endTimeMs) + ((jl2.L(this.startTimeMs) + 527) * 31)) * 31) + (this.isHidden ? 1 : 0)) * 31;
        Label label = this.title;
        return L + (label != null ? label.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.Chapter
    public boolean isHidden() {
        return this.isHidden;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Chapter: startTimeMs=");
        long j = this.startTimeMs;
        sb.append(j == C.TIME_UNSET ? "UNSET" : Long.valueOf(j));
        String str2 = "";
        if (this.endTimeMs == C.TIME_UNSET) {
            str = "";
        } else {
            str = ", endTimeMs=" + this.endTimeMs;
        }
        sb.append(str);
        sb.append(this.isHidden ? ", hidden" : "");
        if (this.title != null) {
            str2 = ", title=" + this.title;
        }
        sb.append(str2);
        return sb.toString();
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void populateMediaMetadata(MediaMetadata.Builder builder) {
    }
}
