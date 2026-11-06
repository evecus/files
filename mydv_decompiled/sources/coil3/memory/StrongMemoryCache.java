package coil3.memory;

import coil3.Image;
import coil3.memory.MemoryCache;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface StrongMemoryCache {
    void clear();

    MemoryCache.Value get(MemoryCache.Key key);

    long getInitialMaxSize();

    Set<MemoryCache.Key> getKeys();

    long getMaxSize();

    long getSize();

    boolean remove(MemoryCache.Key key);

    void set(MemoryCache.Key key, Image image, Map<String, ? extends Object> map, long j);

    void setMaxSize(long j);

    void trimToSize(long j);
}
