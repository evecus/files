package coil3.memory;

import coil3.Image;
import coil3.memory.MemoryCache;
import coil3.memory.RealStrongMemoryCache;
import coil3.util.LruCache;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class RealStrongMemoryCache implements StrongMemoryCache {
    private final RealStrongMemoryCache$cache$1 cache;
    private final long initialMaxSize;
    private final WeakMemoryCache weakMemoryCache;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class InternalValue {
        private final Map<String, Object> extras;
        private final Image image;
        private final long size;

        public InternalValue(Image image, Map<String, ? extends Object> map, long j) {
            this.image = image;
            this.extras = map;
            this.size = j;
        }

        public final Map<String, Object> getExtras() {
            return this.extras;
        }

        public final Image getImage() {
            return this.image;
        }

        public final long getSize() {
            return this.size;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [coil3.memory.RealStrongMemoryCache$cache$1] */
    public RealStrongMemoryCache(long j, WeakMemoryCache weakMemoryCache) {
        this.initialMaxSize = j;
        this.weakMemoryCache = weakMemoryCache;
        final long initialMaxSize = getInitialMaxSize();
        this.cache = new LruCache<MemoryCache.Key, InternalValue>(initialMaxSize) { // from class: coil3.memory.RealStrongMemoryCache$cache$1
            @Override // coil3.util.LruCache
            public void entryRemoved(MemoryCache.Key key, RealStrongMemoryCache.InternalValue internalValue, RealStrongMemoryCache.InternalValue internalValue2) {
                WeakMemoryCache weakMemoryCache2;
                weakMemoryCache2 = RealStrongMemoryCache.this.weakMemoryCache;
                weakMemoryCache2.set(key, internalValue.getImage(), internalValue.getExtras(), internalValue.getSize());
            }

            @Override // coil3.util.LruCache
            public long sizeOf(MemoryCache.Key key, RealStrongMemoryCache.InternalValue internalValue) {
                return internalValue.getSize();
            }
        };
    }

    @Override // coil3.memory.StrongMemoryCache
    public void clear() {
        clear();
    }

    @Override // coil3.memory.StrongMemoryCache
    public MemoryCache.Value get(MemoryCache.Key key) {
        InternalValue internalValue = get(key);
        if (internalValue != null) {
            return new MemoryCache.Value(internalValue.getImage(), internalValue.getExtras());
        }
        return null;
    }

    @Override // coil3.memory.StrongMemoryCache
    public long getInitialMaxSize() {
        return this.initialMaxSize;
    }

    @Override // coil3.memory.StrongMemoryCache
    public Set<MemoryCache.Key> getKeys() {
        return getKeys();
    }

    @Override // coil3.memory.StrongMemoryCache
    public long getMaxSize() {
        return getMaxSize();
    }

    @Override // coil3.memory.StrongMemoryCache
    public long getSize() {
        return getSize();
    }

    @Override // coil3.memory.StrongMemoryCache
    public boolean remove(MemoryCache.Key key) {
        return remove(key) != null;
    }

    @Override // coil3.memory.StrongMemoryCache
    public void set(MemoryCache.Key key, Image image, Map<String, ? extends Object> map, long j) {
        long maxSize = getMaxSize();
        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = this.cache;
        if (j <= maxSize) {
            realStrongMemoryCache$cache$1.put(key, new InternalValue(image, map, j));
        } else {
            realStrongMemoryCache$cache$1.remove(key);
            this.weakMemoryCache.set(key, image, map, j);
        }
    }

    @Override // coil3.memory.StrongMemoryCache
    public void setMaxSize(long j) {
        setMaxSize(j);
    }

    @Override // coil3.memory.StrongMemoryCache
    public void trimToSize(long j) {
        trimToSize(j);
    }
}
