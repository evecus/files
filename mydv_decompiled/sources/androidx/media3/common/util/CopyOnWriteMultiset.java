package androidx.media3.common.util;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class CopyOnWriteMultiset<E> implements Iterable<E> {
    private final Object lock = new Object();
    private final Map<E, Integer> elementCounts = new HashMap();
    private Set<E> elementSet = Collections.EMPTY_SET;
    private List<E> elements = Collections.EMPTY_LIST;

    public void add(E e) {
        synchronized (this.lock) {
            try {
                ArrayList arrayList = new ArrayList(this.elements);
                arrayList.add(e);
                this.elements = DesugarCollections.unmodifiableList(arrayList);
                Integer num = this.elementCounts.get(e);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.elementSet);
                    hashSet.add(e);
                    this.elementSet = DesugarCollections.unmodifiableSet(hashSet);
                }
                this.elementCounts.put(e, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int count(E e) {
        int intValue;
        synchronized (this.lock) {
            try {
                intValue = this.elementCounts.containsKey(e) ? this.elementCounts.get(e).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return intValue;
    }

    public Set<E> elementSet() {
        Set<E> set;
        synchronized (this.lock) {
            set = this.elementSet;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.lock) {
            it = this.elements.iterator();
        }
        return it;
    }

    public void remove(E e) {
        synchronized (this.lock) {
            try {
                Integer num = this.elementCounts.get(e);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.elements);
                arrayList.remove(e);
                this.elements = DesugarCollections.unmodifiableList(arrayList);
                int intValue = num.intValue();
                Map<E, Integer> map = this.elementCounts;
                if (intValue == 1) {
                    map.remove(e);
                    HashSet hashSet = new HashSet(this.elementSet);
                    hashSet.remove(e);
                    this.elementSet = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    map.put(e, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
