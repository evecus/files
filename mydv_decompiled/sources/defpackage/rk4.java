package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rk4 extends y3 implements Serializable {
    public static final rk4 J = new rk4(zu2.V);
    public final zu2 I;

    public rk4() {
        this.I = new zu2();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.I.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        this.I.c();
        return super.addAll(collection);
    }

    @Override // defpackage.y3
    public final int c() {
        return this.I.Q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.I.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.I.containsKey(obj);
    }

    public final rk4 d() {
        zu2 zu2Var = this.I;
        zu2Var.b();
        return zu2Var.Q > 0 ? this : J;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.I.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new vu2(this.I, (byte) 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zu2 zu2Var = this.I;
        zu2Var.c();
        int g = zu2Var.g(obj);
        if (g < 0) {
            return false;
        }
        zu2Var.k(g);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.I.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.I.c();
        return super.retainAll(collection);
    }

    public rk4(zu2 zu2Var) {
        zu2Var.getClass();
        this.I = zu2Var;
    }
}
