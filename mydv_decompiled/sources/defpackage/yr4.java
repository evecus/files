package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yr4 extends AbstractMap {
    public static final /* synthetic */ int O = 0;
    public final byte I;
    public List J = Collections.EMPTY_LIST;
    public Map K;
    public boolean L;
    public volatile tp M;
    public Map N;

    /* JADX WARN: Multi-variable type inference failed */
    public yr4(int i) {
        this.I = i;
        Map map = Collections.EMPTY_MAP;
        this.K = map;
        this.N = map;
    }

    public final int a(Comparable comparable) {
        int i;
        int size = this.J.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((bs4) this.J.get(i2)).I);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((bs4) this.J.get(i4)).I);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    public final void b() {
        if (this.L) {
            e1.a();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.J.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.J.isEmpty()) {
            this.J.clear();
        }
        if (this.K.isEmpty()) {
            return;
        }
        this.K.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.K.containsKey(comparable);
    }

    public final Iterable d() {
        return this.K.isEmpty() ? eu5.N : this.K.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.K.isEmpty() && !(this.K instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.K = treeMap;
            this.N = treeMap.descendingMap();
        }
        return (SortedMap) this.K;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.M == null) {
            this.M = new tp(this, (byte) 1);
        }
        return this.M;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr4)) {
            return super.equals(obj);
        }
        yr4 yr4Var = (yr4) obj;
        int size = size();
        if (size == yr4Var.size()) {
            int size2 = this.J.size();
            if (size2 != yr4Var.J.size()) {
                return ((AbstractSet) entrySet()).equals(yr4Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(yr4Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.K.equals(yr4Var.K);
            }
            return true;
        }
        return false;
    }

    public final Object f(Comparable comparable, Object obj) {
        b();
        int a = a(comparable);
        if (a >= 0) {
            return ((bs4) this.J.get(a)).setValue(obj);
        }
        b();
        boolean isEmpty = this.J.isEmpty();
        byte b = this.I;
        if (isEmpty && !(this.J instanceof ArrayList)) {
            this.J = new ArrayList(b);
        }
        int i = -(a + 1);
        if (i >= b) {
            return e().put(comparable, obj);
        }
        if (this.J.size() == b) {
            bs4 bs4Var = (bs4) this.J.remove(b - 1);
            e().put(bs4Var.I, bs4Var.J);
        }
        this.J.add(i, new bs4(this, comparable, obj));
        return null;
    }

    public final Object g(int i) {
        b();
        Object obj = ((bs4) this.J.remove(i)).J;
        if (!this.K.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.J;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new bs4(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        return a >= 0 ? ((bs4) this.J.get(a)).J : this.K.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.J.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((bs4) this.J.get(i2)).hashCode();
        }
        return this.K.size() > 0 ? this.K.hashCode() + i : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        if (obj == null) {
            return f(null, obj2);
        }
        zl1.c();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return g(a);
        }
        if (this.K.isEmpty()) {
            return null;
        }
        return this.K.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.K.size() + this.J.size();
    }
}
