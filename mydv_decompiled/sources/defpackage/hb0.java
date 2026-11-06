package defpackage;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hb0 extends AbstractSet {
    public final /* synthetic */ byte I;
    public final /* synthetic */ jb0 J;

    public /* synthetic */ hb0(jb0 jb0Var, byte b) {
        this.I = b;
        this.J = jb0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.I;
        jb0 jb0Var = this.J;
        switch (b) {
            case 0:
                jb0Var.clear();
                break;
            default:
                jb0Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.I;
        jb0 jb0Var = this.J;
        switch (b) {
            case 0:
                Map c = jb0Var.c();
                if (c != null) {
                    return c.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e = jb0Var.e(entry.getKey());
                    if (e != -1 && jl2.z(jb0Var.k()[e], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return jb0Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.I;
        jb0 jb0Var = this.J;
        switch (b) {
            case 0:
                Map c = jb0Var.c();
                return c != null ? c.entrySet().iterator() : new gb0(jb0Var, (byte) 1);
            default:
                Map c2 = jb0Var.c();
                return c2 != null ? c2.keySet().iterator() : new gb0(jb0Var, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.I;
        jb0 jb0Var = this.J;
        switch (b) {
            case 0:
                Map c = jb0Var.c();
                if (c == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!jb0Var.g()) {
                            int d = jb0Var.d();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj2 = jb0Var.I;
                            Objects.requireNonNull(obj2);
                            int e0 = c5.e0(key, value, d, obj2, jb0Var.i(), jb0Var.j(), jb0Var.k());
                            if (e0 != -1) {
                                jb0Var.f(e0, d);
                                jb0Var.N--;
                                jb0Var.M += 32;
                                break;
                            }
                        }
                    }
                } else {
                    break;
                }
                break;
            default:
                Map c2 = jb0Var.c();
                if (c2 == null) {
                    if (jb0Var.h(obj) != jb0.R) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.I;
        jb0 jb0Var = this.J;
        switch (b) {
        }
        return jb0Var.size();
    }
}
