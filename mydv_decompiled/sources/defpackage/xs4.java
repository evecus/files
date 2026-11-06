package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class xs4 implements Set, b82 {
    public final it4 I;
    public final /* synthetic */ byte J;

    public xs4(it4 it4Var, byte b) {
        this.J = b;
        this.I = it4Var;
    }

    private final boolean c(Collection collection) {
        om3 om3Var;
        int i;
        ns4 h;
        boolean a;
        Collection<Map.Entry> collection2 = collection;
        int J = sv2.J(p70.J(collection2, 10));
        if (J < 16) {
            J = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(J);
        for (Map.Entry entry : collection2) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        it4 it4Var = this.I;
        boolean z = false;
        do {
            synchronized (mw2.l) {
                ht4 ht4Var = (ht4) ws4.f(it4Var.I);
                om3Var = ht4Var.c;
                i = ht4Var.d;
            }
            om3Var.getClass();
            nm3 builder = om3Var.builder();
            Iterator it = it4Var.J.iterator();
            while (((jw4) it).hasNext()) {
                Map.Entry entry2 = (Map.Entry) ((jw4) it).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !j42.c(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    builder.remove(entry2.getKey());
                    z = true;
                }
            }
            om3 build = builder.build();
            if (j42.c(build, om3Var)) {
                break;
            }
            ht4 ht4Var2 = it4Var.I;
            synchronized (ws4.c) {
                h = ws4.h();
                a = it4.a((ht4) ws4.x(ht4Var2, it4Var, h), i, build);
            }
            ws4.m(h, it4Var);
        } while (!a);
        return z;
    }

    private final boolean d(Collection collection) {
        om3 om3Var;
        int i;
        ns4 h;
        boolean a;
        Set u1 = o70.u1(collection);
        it4 it4Var = this.I;
        boolean z = false;
        do {
            synchronized (mw2.l) {
                ht4 ht4Var = (ht4) ws4.f(it4Var.I);
                om3Var = ht4Var.c;
                i = ht4Var.d;
            }
            om3Var.getClass();
            nm3 builder = om3Var.builder();
            Iterator it = it4Var.J.iterator();
            while (((jw4) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((jw4) it).next();
                if (!u1.contains(entry.getKey())) {
                    builder.remove(entry.getKey());
                    z = true;
                }
            }
            om3 build = builder.build();
            if (j42.c(build, om3Var)) {
                break;
            }
            ht4 ht4Var2 = it4Var.I;
            synchronized (ws4.c) {
                h = ws4.h();
                a = it4.a((ht4) ws4.x(ht4Var2, it4Var, h), i, build);
            }
            ws4.m(h, it4Var);
        } while (!a);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.J) {
            case 0:
                mw2.Y();
                throw null;
            case 1:
                mw2.Y();
                throw null;
            default:
                mw2.Y();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.J) {
            case 0:
                mw2.Y();
                throw null;
            case 1:
                mw2.Y();
                throw null;
            default:
                mw2.Y();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.I.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.J;
        it4 it4Var = this.I;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof w72) && !(obj instanceof z72))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return j42.c(it4Var.get(entry.getKey()), entry.getValue());
            case 1:
                return it4Var.containsKey(obj);
            default:
                return it4Var.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.J;
        it4 it4Var = this.I;
        switch (b) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            break;
                        }
                    }
                }
                break;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!it4Var.containsKey(it2.next())) {
                            break;
                        }
                    }
                }
                break;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!it4Var.containsValue(it3.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.I.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.J;
        it4 it4Var = this.I;
        switch (b) {
            case 0:
                return new jw4(it4Var, ((ty1) ((bm3) it4Var.f().c).entrySet()).iterator(), (byte) 0);
            case 1:
                return new jw4(it4Var, ((ty1) ((bm3) it4Var.f().c).entrySet()).iterator(), (byte) 1);
            default:
                return new jw4(it4Var, ((ty1) ((bm3) it4Var.f().c).entrySet()).iterator(), (byte) 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        byte b = this.J;
        it4 it4Var = this.I;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    if ((!(obj instanceof w72) || (obj instanceof z72)) && it4Var.remove(((Map.Entry) obj).getKey()) != null) {
                        break;
                    }
                }
                break;
            case 1:
                if (it4Var.remove(obj) != null) {
                    break;
                }
                break;
            default:
                Iterator it = it4Var.J.iterator();
                while (true) {
                    if (((jw4) it).hasNext()) {
                        obj2 = ((jw4) it).next();
                        if (j42.c(((Map.Entry) obj2).getValue(), obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Map.Entry entry = (Map.Entry) obj2;
                if (entry != null) {
                    it4Var.remove(entry.getKey());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        om3 om3Var;
        int i;
        ns4 h;
        boolean a;
        boolean z = false;
        switch (this.J) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.I.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                    break;
                }
                break;
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        if (this.I.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                    break;
                }
                break;
            default:
                Set u1 = o70.u1(collection);
                it4 it4Var = this.I;
                do {
                    synchronized (mw2.l) {
                        ht4 ht4Var = (ht4) ws4.f(it4Var.I);
                        om3Var = ht4Var.c;
                        i = ht4Var.d;
                    }
                    om3Var.getClass();
                    nm3 builder = om3Var.builder();
                    Iterator it3 = it4Var.J.iterator();
                    while (((jw4) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((jw4) it3).next();
                        if (u1.contains(entry.getValue())) {
                            builder.remove(entry.getKey());
                            z = true;
                        }
                    }
                    om3 build = builder.build();
                    if (!j42.c(build, om3Var)) {
                        ht4 ht4Var2 = it4Var.I;
                        synchronized (ws4.c) {
                            h = ws4.h();
                            a = it4.a((ht4) ws4.x(ht4Var2, it4Var, h), i, build);
                        }
                        ws4.m(h, it4Var);
                    }
                    return z;
                } while (!a);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        om3 om3Var;
        int i;
        ns4 h;
        boolean a;
        switch (this.J) {
            case 0:
                return c(collection);
            case 1:
                return d(collection);
            default:
                Set u1 = o70.u1(collection);
                it4 it4Var = this.I;
                boolean z = false;
                do {
                    synchronized (mw2.l) {
                        ht4 ht4Var = (ht4) ws4.f(it4Var.I);
                        om3Var = ht4Var.c;
                        i = ht4Var.d;
                    }
                    om3Var.getClass();
                    nm3 builder = om3Var.builder();
                    Iterator it = it4Var.J.iterator();
                    while (((jw4) it).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((jw4) it).next();
                        if (!u1.contains(entry.getValue())) {
                            builder.remove(entry.getKey());
                            z = true;
                        }
                    }
                    om3 build = builder.build();
                    if (!j42.c(build, om3Var)) {
                        ht4 ht4Var2 = it4Var.I;
                        synchronized (ws4.c) {
                            h = ws4.h();
                            a = it4.a((ht4) ws4.x(ht4Var2, it4Var, h), i, build);
                        }
                        ws4.m(h, it4Var);
                    }
                    return z;
                } while (!a);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.I.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return j42.h0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j42.i0(this, objArr);
    }
}
