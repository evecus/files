package okhttp3.internal.dns;

import defpackage.d4;
import defpackage.kb0;
import defpackage.o75;
import defpackage.p75;
import defpackage.rm1;
import defpackage.s83;
import defpackage.uj3;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class MemoryCache<K, V> {
    private final ConcurrentHashMap<K, V> entries;
    private final int maxSize;
    private final p75 timeSource;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class NewestFirst implements Comparator<uj3> {
        public static final NewestFirst INSTANCE = new NewestFirst();

        private NewestFirst() {
        }

        @Override // java.util.Comparator
        public int compare(uj3 uj3Var, uj3 uj3Var2) {
            uj3Var.getClass();
            uj3Var2.getClass();
            kb0 kb0Var = (kb0) uj3Var2.I;
            kb0 kb0Var2 = (kb0) uj3Var.I;
            o75 o75Var = (o75) kb0Var;
            o75Var.getClass();
            return d4.l(o75Var, kb0Var2);
        }
    }

    public MemoryCache(p75 p75Var, int i) {
        p75Var.getClass();
        this.timeSource = p75Var;
        this.maxSize = i;
        this.entries = new ConcurrentHashMap<>();
        if (i >= 0) {
            return;
        }
        s83.t("Failed requirement.");
        throw null;
    }

    public final V computeIfAbsent(K k, rm1 rm1Var) {
        k.getClass();
        rm1Var.getClass();
        if (this.maxSize == 0) {
            return (V) rm1Var.invoke();
        }
        V v = this.entries.get(k);
        if (v != null) {
            return v;
        }
        V v2 = (V) rm1Var.invoke();
        V v3 = (V) this.entries.putIfAbsent(k, v2);
        if (v3 != null) {
            return v3;
        }
        int size = this.entries.size();
        int i = this.maxSize;
        int i2 = size - i;
        if (i2 >= i) {
            evict(i2);
        }
        return v2;
    }

    public final void evict(int i) {
        o75 f = this.timeSource.f();
        PriorityQueue priorityQueue = new PriorityQueue(i + 1, NewestFirst.INSTANCE);
        Iterator<Map.Entry<K, V>> it = this.entries.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            next.getClass();
            Map.Entry<K, V> entry = next;
            V value = entry.getValue();
            value.getClass();
            kb0 lastRequestedAt = lastRequestedAt(f, value);
            if (lastRequestedAt == null) {
                it.remove();
                i--;
            } else {
                priorityQueue.add(new uj3(lastRequestedAt, entry));
            }
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
        Iterator it2 = priorityQueue.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) ((uj3) it2.next()).J;
            this.entries.remove(entry2.getKey(), entry2.getValue());
        }
    }

    public final void evictAll() {
        this.entries.clear();
    }

    public final int getMaxSize() {
        return this.maxSize;
    }

    public final int getSize() {
        return this.entries.size();
    }

    public final p75 getTimeSource() {
        return this.timeSource;
    }

    public abstract kb0 lastRequestedAt(kb0 kb0Var, V v);
}
