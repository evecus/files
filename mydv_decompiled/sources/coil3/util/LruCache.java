package coil3.util;

import defpackage.o70;
import defpackage.s83;
import defpackage.zy;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class LruCache<K, V> {
    private final Map<K, V> map = Collections_jvmCommonKt.LruMutableMap$default(0, 0.0f, 3, null);
    private long maxSize;
    private long size;

    public LruCache(long j) {
        this.maxSize = j;
        if (j > 0) {
            return;
        }
        s83.t("maxSize <= 0");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long recomputeSize() {
        Iterator<T> it = this.map.entrySet().iterator();
        long j = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j += safeSizeOf(entry.getKey(), entry.getValue());
        }
        return j;
    }

    private final long safeSizeOf(K k, V v) {
        try {
            long sizeOf = sizeOf(k, v);
            if (sizeOf >= 0) {
                return sizeOf;
            }
            throw new IllegalStateException(("sizeOf(" + k + ", " + v + ") returned a negative value: " + sizeOf).toString());
        } catch (Exception e) {
            this.size = -1L;
            throw e;
        }
    }

    public final void clear() {
        trimToSize(-1L);
    }

    public final V get(K k) {
        return this.map.get(k);
    }

    public final Set<K> getKeys() {
        return o70.u1(this.map.keySet());
    }

    public final long getMaxSize() {
        return this.maxSize;
    }

    public final long getSize() {
        long j = this.size;
        if (j != -1) {
            return j;
        }
        long recomputeSize = recomputeSize();
        this.size = recomputeSize;
        return recomputeSize;
    }

    public final V put(K k, V v) {
        V put = this.map.put(k, v);
        this.size = getSize() + safeSizeOf(k, v);
        if (put != null) {
            this.size = getSize() - safeSizeOf(k, put);
            entryRemoved(k, put, v);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final V remove(K k) {
        V remove = this.map.remove(k);
        if (remove != null) {
            this.size = getSize() - safeSizeOf(k, remove);
            entryRemoved(k, remove, null);
        }
        return remove;
    }

    public final void setMaxSize(long j) {
        this.maxSize = j;
        trimToSize(j);
    }

    public long sizeOf(K k, V v) {
        return 1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void trimToSize(long j) {
        while (getSize() > j) {
            if (this.map.isEmpty()) {
                if (getSize() == 0) {
                    return;
                }
                zy.i("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) o70.S0(this.map.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                this.map.remove(key);
                this.size = getSize() - safeSizeOf(key, value);
                entryRemoved(key, value, null);
            }
        }
    }

    public void entryRemoved(K k, V v, V v2) {
    }
}
