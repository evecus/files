package coil3.memory;

import coil3.Image;
import coil3.memory.MemoryCache;
import defpackage.er0;
import defpackage.o70;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class RealWeakMemoryCache implements WeakMemoryCache {
    private static final int CLEAN_UP_INTERVAL = 10;
    public static final Companion Companion = new Companion(null);
    private final LinkedHashMap<MemoryCache.Key, ArrayList<InternalValue>> cache = new LinkedHashMap<>();
    private int operationsSinceCleanUp;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class InternalValue {
        private final Map<String, Object> extras;
        private final WeakReference<Image> image;
        private final long size;

        public InternalValue(WeakReference<Image> weakReference, Map<String, ? extends Object> map, long j) {
            this.image = weakReference;
            this.extras = map;
            this.size = j;
        }

        public final Map<String, Object> getExtras() {
            return this.extras;
        }

        public final WeakReference<Image> getImage() {
            return this.image;
        }

        public final long getSize() {
            return this.size;
        }
    }

    private final void cleanUpIfNecessary() {
        int i = this.operationsSinceCleanUp;
        this.operationsSinceCleanUp = i + 1;
        if (i >= 10) {
            cleanUp$io_coil_kt_coil3_coil_core();
        }
    }

    public final void cleanUp$io_coil_kt_coil3_coil_core() {
        WeakReference<Image> image;
        this.operationsSinceCleanUp = 0;
        Iterator<ArrayList<InternalValue>> it = this.cache.values().iterator();
        while (it.hasNext()) {
            ArrayList<InternalValue> next = it.next();
            if (next.size() <= 1) {
                InternalValue internalValue = (InternalValue) o70.U0(next);
                if (((internalValue == null || (image = internalValue.getImage()) == null) ? null : image.get()) == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (next.get(i3).getImage().get() == null) {
                        next.remove(i3);
                        i++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    @Override // coil3.memory.WeakMemoryCache
    public void clear() {
        this.operationsSinceCleanUp = 0;
        this.cache.clear();
    }

    @Override // coil3.memory.WeakMemoryCache
    public MemoryCache.Value get(MemoryCache.Key key) {
        ArrayList<InternalValue> arrayList = this.cache.get(key);
        MemoryCache.Value value = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            InternalValue internalValue = arrayList.get(i);
            Image image = internalValue.getImage().get();
            MemoryCache.Value value2 = image != null ? new MemoryCache.Value(image, internalValue.getExtras()) : null;
            if (value2 != null) {
                value = value2;
                break;
            }
            i++;
        }
        cleanUpIfNecessary();
        return value;
    }

    public final LinkedHashMap<MemoryCache.Key, ArrayList<InternalValue>> getCache$io_coil_kt_coil3_coil_core() {
        return this.cache;
    }

    @Override // coil3.memory.WeakMemoryCache
    public Set<MemoryCache.Key> getKeys() {
        return o70.u1(this.cache.keySet());
    }

    @Override // coil3.memory.WeakMemoryCache
    public boolean remove(MemoryCache.Key key) {
        return this.cache.remove(key) != null;
    }

    @Override // coil3.memory.WeakMemoryCache
    public void set(MemoryCache.Key key, Image image, Map<String, ? extends Object> map, long j) {
        LinkedHashMap<MemoryCache.Key, ArrayList<InternalValue>> linkedHashMap = this.cache;
        ArrayList<InternalValue> arrayList = linkedHashMap.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            linkedHashMap.put(key, arrayList);
        }
        ArrayList<InternalValue> arrayList2 = arrayList;
        InternalValue internalValue = new InternalValue(new WeakReference(image), map, j);
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                InternalValue internalValue2 = arrayList2.get(i);
                if (j < internalValue2.getSize()) {
                    i++;
                } else if (internalValue2.getImage().get() == image) {
                    arrayList2.set(i, internalValue);
                } else {
                    arrayList2.add(i, internalValue);
                }
            }
        } else {
            arrayList2.add(internalValue);
        }
        cleanUpIfNecessary();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }
}
