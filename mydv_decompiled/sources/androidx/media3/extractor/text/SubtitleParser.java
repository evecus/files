package androidx.media3.extractor.text;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Consumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface SubtitleParser {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes.dex */
    public interface Factory {
        public static final Factory UNSUPPORTED = new Factory() { // from class: androidx.media3.extractor.text.SubtitleParser.Factory.1
            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public SubtitleParser create(Format format) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public int getCueReplacementBehavior(Format format) {
                return 1;
            }

            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public boolean supportsFormat(Format format) {
                return false;
            }
        };

        SubtitleParser create(Format format);

        int getCueReplacementBehavior(Format format);

        boolean supportsFormat(Format format);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class OutputOptions {
        private static final OutputOptions ALL = new OutputOptions(C.TIME_UNSET, false);
        public final boolean outputAllCues;
        public final long startTimeUs;

        private OutputOptions(long j, boolean z) {
            this.startTimeUs = j;
            this.outputAllCues = z;
        }

        public static OutputOptions allCues() {
            return ALL;
        }

        public static OutputOptions cuesAfterThenRemainingCuesBefore(long j) {
            return new OutputOptions(j, true);
        }

        public static OutputOptions onlyCuesAfter(long j) {
            return new OutputOptions(j, false);
        }
    }

    int getCueReplacementBehavior();

    void parse(byte[] bArr, int i, int i2, OutputOptions outputOptions, Consumer<CuesWithTiming> consumer);

    void parse(byte[] bArr, OutputOptions outputOptions, Consumer<CuesWithTiming> consumer);

    Subtitle parseToLegacySubtitle(byte[] bArr, int i, int i2);

    void reset();
}
