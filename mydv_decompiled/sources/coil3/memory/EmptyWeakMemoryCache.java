package coil3.memory;

import coil3.Image;
import coil3.memory.MemoryCache;
import defpackage.t91;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class EmptyWeakMemoryCache implements WeakMemoryCache {
    @Override // coil3.memory.WeakMemoryCache
    public MemoryCache.Value get(MemoryCache.Key key) {
        return null;
    }

    @Override // coil3.memory.WeakMemoryCache
    public Set<MemoryCache.Key> getKeys() {
        return t91.I;
    }

    @Override // coil3.memory.WeakMemoryCache
    public boolean remove(MemoryCache.Key key) {
        return false;
    }

    @Override // coil3.memory.WeakMemoryCache
    public void clear() {
    }

    @Override // coil3.memory.WeakMemoryCache
    public void set(MemoryCache.Key key, Image image, Map<String, ? extends Object> map, long j) {
    }
}
