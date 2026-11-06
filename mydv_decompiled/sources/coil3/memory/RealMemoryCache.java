package coil3.memory;

import coil3.memory.MemoryCache;
import defpackage.zk4;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class RealMemoryCache implements MemoryCache {
    private final Object lock = new Object();
    private final StrongMemoryCache strongMemoryCache;
    private final WeakMemoryCache weakMemoryCache;

    public RealMemoryCache(StrongMemoryCache strongMemoryCache, WeakMemoryCache weakMemoryCache) {
        this.strongMemoryCache = strongMemoryCache;
        this.weakMemoryCache = weakMemoryCache;
    }

    @Override // coil3.memory.MemoryCache
    public void clear() {
        synchronized (this.lock) {
            this.strongMemoryCache.clear();
            this.weakMemoryCache.clear();
        }
    }

    @Override // coil3.memory.MemoryCache
    public MemoryCache.Value get(MemoryCache.Key key) {
        MemoryCache.Value value;
        synchronized (this.lock) {
            try {
                value = this.strongMemoryCache.get(key);
                if (value == null) {
                    value = this.weakMemoryCache.get(key);
                }
                if (value != null && !value.getImage().getShareable()) {
                    remove(key);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return value;
    }

    @Override // coil3.memory.MemoryCache
    public long getInitialMaxSize() {
        long initialMaxSize;
        synchronized (this.lock) {
            initialMaxSize = this.strongMemoryCache.getInitialMaxSize();
        }
        return initialMaxSize;
    }

    @Override // coil3.memory.MemoryCache
    public Set<MemoryCache.Key> getKeys() {
        LinkedHashSet u;
        synchronized (this.lock) {
            u = zk4.u(this.strongMemoryCache.getKeys(), this.weakMemoryCache.getKeys());
        }
        return u;
    }

    @Override // coil3.memory.MemoryCache
    public long getMaxSize() {
        long maxSize;
        synchronized (this.lock) {
            maxSize = this.strongMemoryCache.getMaxSize();
        }
        return maxSize;
    }

    @Override // coil3.memory.MemoryCache
    public long getSize() {
        long size;
        synchronized (this.lock) {
            size = this.strongMemoryCache.getSize();
        }
        return size;
    }

    @Override // coil3.memory.MemoryCache
    public boolean remove(MemoryCache.Key key) {
        boolean z;
        synchronized (this.lock) {
            z = this.strongMemoryCache.remove(key) || this.weakMemoryCache.remove(key);
        }
        return z;
    }

    @Override // coil3.memory.MemoryCache
    public void set(MemoryCache.Key key, MemoryCache.Value value) {
        synchronized (this.lock) {
            long size = value.getImage().getSize();
            if (size < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + size).toString());
            }
            this.strongMemoryCache.set(key, value.getImage(), value.getExtras(), size);
        }
    }

    @Override // coil3.memory.MemoryCache
    public void setMaxSize(long j) {
        synchronized (this.lock) {
            this.strongMemoryCache.setMaxSize(j);
        }
    }

    @Override // coil3.memory.MemoryCache
    public void trimToSize(long j) {
        synchronized (this.lock) {
            this.strongMemoryCache.trimToSize(j);
        }
    }
}
