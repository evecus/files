package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Label;
import androidx.media3.extractor.metadata.Chapter;
import defpackage.sp0;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ChapterFrame extends Id3Frame implements Chapter {
    public static final String ID = "CHAP";
    public final String chapterId;
    public final long endOffset;
    public final int endTimeMs;
    public final long startOffset;
    public final int startTimeMs;
    private final Id3Frame[] subFrames;
    private final Label title;

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super(ID);
        sp0.o(i <= i2);
        this.chapterId = str;
        this.startTimeMs = i;
        this.endTimeMs = i2;
        String findTitle = findTitle(id3FrameArr);
        this.title = findTitle != null ? new Label(null, findTitle) : null;
        this.startOffset = j;
        this.endOffset = j2;
        this.subFrames = id3FrameArr;
    }

    private static String findTitle(Id3Frame[] id3FrameArr) {
        for (Id3Frame id3Frame : id3FrameArr) {
            if (id3Frame instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) id3Frame;
                if (textInformationFrame.id.equals("TIT2") && !textInformationFrame.values.isEmpty()) {
                    return (String) textInformationFrame.values.get(0);
                }
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterFrame.class == obj.getClass()) {
            ChapterFrame chapterFrame = (ChapterFrame) obj;
            if (this.startTimeMs == chapterFrame.startTimeMs && this.endTimeMs == chapterFrame.endTimeMs && this.startOffset == chapterFrame.startOffset && this.endOffset == chapterFrame.endOffset && Objects.equals(this.chapterId, chapterFrame.chapterId) && Arrays.equals(this.subFrames, chapterFrame.subFrames)) {
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

    public Id3Frame getSubFrame(int i) {
        return this.subFrames[i];
    }

    public int getSubFrameCount() {
        return this.subFrames.length;
    }

    @Override // androidx.media3.extractor.metadata.Chapter
    public Label getTitle() {
        return this.title;
    }

    public int hashCode() {
        int i = (((((((527 + this.startTimeMs) * 31) + this.endTimeMs) * 31) + ((int) this.startOffset)) * 31) + ((int) this.endOffset)) * 31;
        String str = this.chapterId;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.Chapter
    public boolean isHidden() {
        return false;
    }
}
