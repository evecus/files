package androidx.media3.extractor.mp3;

import androidx.media3.common.C;
import androidx.media3.extractor.SeekMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
interface Seeker extends SeekMap {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class UnseekableSeeker extends SeekMap.Unseekable implements Seeker {
        public UnseekableSeeker() {
            super(C.TIME_UNSET);
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public int getAverageBitrate() {
            return C.RATE_UNSET_INT;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public long getDataEndPosition() {
            return -1L;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public long getDataStartPosition() {
            return 0L;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public long getTimeUs(long j) {
            return 0L;
        }
    }

    int getAverageBitrate();

    long getDataEndPosition();

    long getDataStartPosition();

    long getTimeUs(long j);
}
