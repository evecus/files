package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.Log;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheSpan;
import androidx.media3.extractor.ChunkIndex;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class CachedRegionTracker implements Cache.Listener {
    public static final int CACHED_TO_END = -2;
    public static final int NOT_CACHED = -1;
    private static final String TAG = "CachedRegionTracker";
    private final Cache cache;
    private final String cacheKey;
    private final ChunkIndex chunkIndex;
    private final TreeSet<Region> regions = new TreeSet<>();
    private final Region lookupRegion = new Region(0, 0);

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class Region implements Comparable<Region> {
        public long endOffset;
        public int endOffsetIndex;
        public long startOffset;

        public Region(long j, long j2) {
            this.startOffset = j;
            this.endOffset = j2;
        }

        @Override // java.lang.Comparable
        public int compareTo(Region region) {
            return Long.compare(this.startOffset, region.startOffset);
        }
    }

    public CachedRegionTracker(Cache cache, String str, ChunkIndex chunkIndex) {
        this.cache = cache;
        this.cacheKey = str;
        this.chunkIndex = chunkIndex;
        synchronized (this) {
            try {
                Iterator<CacheSpan> descendingIterator = cache.addListener(str, this).descendingIterator();
                while (descendingIterator.hasNext()) {
                    mergeSpan(descendingIterator.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void mergeSpan(CacheSpan cacheSpan) {
        long j = cacheSpan.position;
        Region region = new Region(j, cacheSpan.length + j);
        Region floor = this.regions.floor(region);
        Region ceiling = this.regions.ceiling(region);
        boolean regionsConnect = regionsConnect(floor, region);
        if (regionsConnect(region, ceiling)) {
            ceiling.getClass();
            if (regionsConnect) {
                floor.getClass();
                floor.endOffset = ceiling.endOffset;
                floor.endOffsetIndex = ceiling.endOffsetIndex;
            } else {
                region.endOffset = ceiling.endOffset;
                region.endOffsetIndex = ceiling.endOffsetIndex;
                this.regions.add(region);
            }
            this.regions.remove(ceiling);
            return;
        }
        if (!regionsConnect) {
            int binarySearch = Arrays.binarySearch(this.chunkIndex.offsets, region.endOffset);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            region.endOffsetIndex = binarySearch;
            this.regions.add(region);
            return;
        }
        floor.getClass();
        floor.endOffset = region.endOffset;
        int i = floor.endOffsetIndex;
        while (true) {
            ChunkIndex chunkIndex = this.chunkIndex;
            if (i >= chunkIndex.length - 1) {
                break;
            }
            int i2 = i + 1;
            if (chunkIndex.offsets[i2] > floor.endOffset) {
                break;
            } else {
                i = i2;
            }
        }
        floor.endOffsetIndex = i;
    }

    private boolean regionsConnect(Region region, Region region2) {
        return (region == null || region2 == null || region.endOffset != region2.startOffset) ? false : true;
    }

    public synchronized int getRegionEndTimeMs(long j) {
        int i;
        Region region = this.lookupRegion;
        region.startOffset = j;
        Region floor = this.regions.floor(region);
        if (floor != null) {
            long j2 = floor.endOffset;
            if (j <= j2 && (i = floor.endOffsetIndex) != -1) {
                ChunkIndex chunkIndex = this.chunkIndex;
                if (i == chunkIndex.length - 1) {
                    if (j2 == chunkIndex.offsets[i] + chunkIndex.sizes[i]) {
                        return -2;
                    }
                }
                return (int) ((chunkIndex.timesUs[i] + (((j2 - chunkIndex.offsets[i]) * chunkIndex.durationsUs[i]) / chunkIndex.sizes[i])) / 1000);
            }
        }
        return -1;
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public synchronized void onSpanAdded(Cache cache, CacheSpan cacheSpan) {
        mergeSpan(cacheSpan);
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public synchronized void onSpanRemoved(Cache cache, CacheSpan cacheSpan) {
        long j = cacheSpan.position;
        Region region = new Region(j, cacheSpan.length + j);
        Region floor = this.regions.floor(region);
        if (floor == null) {
            Log.e(TAG, "Removed a span we were not aware of");
            return;
        }
        this.regions.remove(floor);
        long j2 = floor.startOffset;
        long j3 = region.startOffset;
        if (j2 < j3) {
            Region region2 = new Region(j2, j3);
            int binarySearch = Arrays.binarySearch(this.chunkIndex.offsets, region2.endOffset);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            region2.endOffsetIndex = binarySearch;
            this.regions.add(region2);
        }
        long j4 = floor.endOffset;
        long j5 = region.endOffset;
        if (j4 > j5) {
            Region region3 = new Region(j5 + 1, j4);
            region3.endOffsetIndex = floor.endOffsetIndex;
            this.regions.add(region3);
        }
    }

    public void release() {
        this.cache.removeListener(this.cacheKey, this);
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
    }
}
