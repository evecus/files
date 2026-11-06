package defpackage;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bh2 extends f4 implements ch2, RandomAccess {
    public final ArrayList J;

    static {
        new bh2(10).I = false;
    }

    public bh2(int i) {
        this(new ArrayList(i));
    }

    @Override // defpackage.o32
    public final o32 a(int i) {
        ArrayList arrayList = this.J;
        if (i < arrayList.size()) {
            s83.d();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new bh2(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        c();
        this.J.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.f4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        c();
        if (collection instanceof ch2) {
            collection = ((ch2) collection).g();
        }
        boolean addAll = this.J.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // defpackage.ch2
    public final void b(f00 f00Var) {
        c();
        this.J.add(f00Var);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.f4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.J.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.ch2
    public final List g() {
        return DesugarCollections.unmodifiableList(this.J);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.J;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof f00)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, r32.a);
            if (ng5.a.N(bArr, 0, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        }
        f00 f00Var = (f00) obj;
        String str2 = f00Var.size() == 0 ? "" : new String(f00Var.J, f00Var.d(), f00Var.size(), r32.a);
        int d = f00Var.d();
        if (ng5.a.N(f00Var.J, d, f00Var.size() + d) == 0) {
            arrayList.set(i, str2);
        }
        return str2;
    }

    @Override // defpackage.ch2
    public final ch2 i() {
        return this.I ? new he5(this) : this;
    }

    @Override // defpackage.ch2
    public final Object k(int i) {
        return this.J.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        c();
        Object remove = this.J.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof f00)) {
            return new String((byte[]) remove, r32.a);
        }
        f00 f00Var = (f00) remove;
        return f00Var.size() == 0 ? "" : new String(f00Var.J, f00Var.d(), f00Var.size(), r32.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        c();
        Object obj2 = this.J.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof f00)) {
            return new String((byte[]) obj2, r32.a);
        }
        f00 f00Var = (f00) obj2;
        return f00Var.size() == 0 ? "" : new String(f00Var.J, f00Var.d(), f00Var.size(), r32.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.J.size();
    }

    public bh2(ArrayList arrayList) {
        this.J = arrayList;
    }

    @Override // defpackage.f4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.J.size(), collection);
    }
}
