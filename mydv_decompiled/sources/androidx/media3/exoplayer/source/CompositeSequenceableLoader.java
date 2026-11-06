package androidx.media3.exoplayer.source;

import androidx.media3.common.C;
import androidx.media3.exoplayer.LoadingInfo;
import defpackage.dy1;
import defpackage.sp0;
import defpackage.zx1;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class CompositeSequenceableLoader implements SequenceableLoader {
    private long lastAudioVideoBufferedPositionUs;
    private final dy1 loadersWithTrackTypes;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class SequenceableLoaderWithTrackTypes implements SequenceableLoader {
        private final SequenceableLoader loader;
        private final dy1 trackTypes;

        public SequenceableLoaderWithTrackTypes(SequenceableLoader sequenceableLoader, List<Integer> list) {
            this.loader = sequenceableLoader;
            this.trackTypes = dy1.p(list);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public boolean continueLoading(LoadingInfo loadingInfo) {
            return this.loader.continueLoading(loadingInfo);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return this.loader.getBufferedPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return this.loader.getNextLoadPositionUs();
        }

        public dy1 getTrackTypes() {
            return this.trackTypes;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public boolean isLoading() {
            return this.loader.isLoading();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public void reevaluateBuffer(long j) {
            this.loader.reevaluateBuffer(j);
        }
    }

    public CompositeSequenceableLoader(List<? extends SequenceableLoader> list, List<List<Integer>> list2) {
        zx1 n = dy1.n();
        sp0.o(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            n.c(new SequenceableLoaderWithTrackTypes(list.get(i), list2.get(i)));
        }
        this.loadersWithTrackTypes = n.f();
        this.lastAudioVideoBufferedPositionUs = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        boolean z;
        boolean z2 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z2;
            }
            z = false;
            for (int i = 0; i < this.loadersWithTrackTypes.size(); i++) {
                long nextLoadPositionUs2 = ((SequenceableLoaderWithTrackTypes) this.loadersWithTrackTypes.get(i)).getNextLoadPositionUs();
                boolean z3 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= loadingInfo.playbackPositionUs;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z3) {
                    z |= ((SequenceableLoaderWithTrackTypes) this.loadersWithTrackTypes.get(i)).continueLoading(loadingInfo);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        for (int i = 0; i < this.loadersWithTrackTypes.size(); i++) {
            SequenceableLoaderWithTrackTypes sequenceableLoaderWithTrackTypes = (SequenceableLoaderWithTrackTypes) this.loadersWithTrackTypes.get(i);
            long bufferedPositionUs = sequenceableLoaderWithTrackTypes.getBufferedPositionUs();
            if ((sequenceableLoaderWithTrackTypes.getTrackTypes().contains(1) || sequenceableLoaderWithTrackTypes.getTrackTypes().contains(2) || sequenceableLoaderWithTrackTypes.getTrackTypes().contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                j = Math.min(j, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                j2 = Math.min(j2, bufferedPositionUs);
            }
        }
        if (j != Long.MAX_VALUE) {
            this.lastAudioVideoBufferedPositionUs = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.lastAudioVideoBufferedPositionUs;
        return j3 != C.TIME_UNSET ? j3 : j2;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long j = Long.MAX_VALUE;
        for (int i = 0; i < this.loadersWithTrackTypes.size(); i++) {
            long nextLoadPositionUs = ((SequenceableLoaderWithTrackTypes) this.loadersWithTrackTypes.get(i)).getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                j = Math.min(j, nextLoadPositionUs);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        for (int i = 0; i < this.loadersWithTrackTypes.size(); i++) {
            if (((SequenceableLoaderWithTrackTypes) this.loadersWithTrackTypes.get(i)).isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        for (int i = 0; i < this.loadersWithTrackTypes.size(); i++) {
            ((SequenceableLoaderWithTrackTypes) this.loadersWithTrackTypes.get(i)).reevaluateBuffer(j);
        }
    }

    @Deprecated
    public CompositeSequenceableLoader(SequenceableLoader[] sequenceableLoaderArr) {
        this(dy1.q(sequenceableLoaderArr), Collections.nCopies(sequenceableLoaderArr.length, dy1.t(-1)));
    }
}
