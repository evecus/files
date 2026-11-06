package androidx.media3.extractor;

import defpackage.jl2;
import defpackage.sp0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ChunkIndexMerger {
    private final Map<Long, ChunkIndex> chunkMap = new LinkedHashMap();

    public void add(ChunkIndex chunkIndex) {
        long[] jArr = chunkIndex.timesUs;
        if (jArr.length <= 0 || this.chunkMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        this.chunkMap.put(Long.valueOf(chunkIndex.timesUs[0]), chunkIndex);
    }

    public void clear() {
        this.chunkMap.clear();
    }

    public ChunkIndex merge() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (ChunkIndex chunkIndex : this.chunkMap.values()) {
            arrayList.add(chunkIndex.sizes);
            arrayList2.add(chunkIndex.offsets);
            arrayList3.add(chunkIndex.durationsUs);
            arrayList4.add(chunkIndex.timesUs);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j = 0;
        for (int[] iArr2 : iArr) {
            j += iArr2.length;
        }
        int i = (int) j;
        sp0.q(j == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j);
        int[] iArr3 = new int[i];
        int i2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i2, iArr4.length);
            i2 += iArr4.length;
        }
        return new ChunkIndex(iArr3, jl2.o((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), jl2.o((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), jl2.o((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public int size() {
        return this.chunkMap.size();
    }
}
