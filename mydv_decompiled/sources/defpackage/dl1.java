package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class dl1 extends el1 implements Map {
    @Override // java.util.Map
    public void clear() {
        delegate().clear();
    }

    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    @Override // defpackage.el1
    public abstract Map delegate();

    public Set entrySet() {
        return delegate().entrySet();
    }

    public Object get(Object obj) {
        return delegate().get(obj);
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set keySet() {
        return delegate().keySet();
    }

    @Override // java.util.Map
    @CheckForNull
    public Object put(Object obj, Object obj2) {
        return delegate().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> map) {
        delegate().putAll(map);
    }

    @Override // java.util.Map
    @CheckForNull
    public Object remove(@CheckForNull Object obj) {
        return delegate().remove(obj);
    }

    public int size() {
        return delegate().size();
    }

    public void standardClear() {
        ut0.o(entrySet().iterator());
    }

    public boolean standardContainsKey(@CheckForNull Object obj) {
        return ut0.z(new pv2(entrySet().iterator(), (byte) 0), obj);
    }

    public boolean standardContainsValue(@CheckForNull Object obj) {
        return ut0.z(new pv2(entrySet().iterator(), (byte) 1), obj);
    }

    public boolean standardEquals(@CheckForNull Object obj) {
        return lq2.C(obj, this);
    }

    public int standardHashCode() {
        return kb4.I(entrySet());
    }

    public boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    public void standardPutAll(Map<Object, Object> map) {
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @CheckForNull
    public Object standardRemove(@CheckForNull Object obj) {
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (jl2.z(entry.getKey(), obj)) {
                Object value = entry.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    public String standardToString() {
        return lq2.o0(this);
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return delegate().values();
    }
}
