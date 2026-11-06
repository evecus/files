package androidx.media3.extractor.metadata;

import androidx.media3.common.C;
import androidx.media3.common.Label;
import androidx.media3.common.Metadata;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface Chapter extends Metadata.Entry {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class Builder {
        private boolean isHidden;
        private Label title;
        private long startTimeMs = C.TIME_UNSET;
        private long endTimeMs = C.TIME_UNSET;

        public Chapter build() {
            return new ChapterImpl(this.startTimeMs, this.endTimeMs, this.isHidden, this.title);
        }

        public Builder setEndTimeMs(long j) {
            this.endTimeMs = j;
            return this;
        }

        public Builder setHidden(boolean z) {
            this.isHidden = z;
            return this;
        }

        public Builder setStartTimeMs(long j) {
            this.startTimeMs = j;
            return this;
        }

        public Builder setTitle(Label label) {
            this.title = label;
            return this;
        }
    }

    long getEndTimeMs();

    long getStartTimeMs();

    Label getTitle();

    boolean isHidden();
}
