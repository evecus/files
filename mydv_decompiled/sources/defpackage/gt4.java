package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gt4 implements Parcelable, kw4, List, RandomAccess, y72 {
    public static final Parcelable.Creator<gt4> CREATOR = new ft4();
    public hw4 I;

    public gt4(a4 a4Var) {
        ns4 h = ws4.h();
        hw4 hw4Var = new hw4(h.g(), a4Var);
        if (!(h instanceof zq1)) {
            hw4Var.b = new hw4(1L, a4Var);
        }
        this.I = hw4Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        a4 a4Var;
        ns4 h;
        boolean f;
        do {
            synchronized (j42.r) {
                hw4 hw4Var = this.I;
                hw4Var.getClass();
                hw4 hw4Var2 = (hw4) ws4.f(hw4Var);
                i = hw4Var2.d;
                a4Var = hw4Var2.c;
            }
            a4Var.getClass();
            a4 e = a4Var.e(obj);
            if (e.equals(a4Var)) {
                return false;
            }
            hw4 hw4Var3 = this.I;
            hw4Var3.getClass();
            synchronized (ws4.c) {
                h = ws4.h();
                f = j42.f((hw4) ws4.x(hw4Var3, this, h), i, e, true);
            }
            ws4.m(h, this);
        } while (!f);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        a4 a4Var;
        ns4 h;
        boolean f;
        do {
            synchronized (j42.r) {
                hw4 hw4Var = this.I;
                hw4Var.getClass();
                hw4 hw4Var2 = (hw4) ws4.f(hw4Var);
                i = hw4Var2.d;
                a4Var = hw4Var2.c;
            }
            a4Var.getClass();
            a4 f2 = a4Var.f(collection);
            if (j42.c(f2, a4Var)) {
                return false;
            }
            hw4 hw4Var3 = this.I;
            hw4Var3.getClass();
            synchronized (ws4.c) {
                h = ws4.h();
                f = j42.f((hw4) ws4.x(hw4Var3, this, h), i, f2, true);
            }
            ws4.m(h, this);
        } while (!f);
        return true;
    }

    @Override // defpackage.kw4
    public final mw4 c() {
        return this.I;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        ns4 h;
        hw4 hw4Var = this.I;
        hw4Var.getClass();
        synchronized (ws4.c) {
            h = ws4.h();
            hw4 hw4Var2 = (hw4) ws4.x(hw4Var, this, h);
            synchronized (j42.r) {
                hw4Var2.c = xr4.J;
                hw4Var2.d++;
                hw4Var2.e++;
            }
        }
        ws4.m(h, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return j42.D(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return j42.D(this).c.containsAll(collection);
    }

    @Override // defpackage.kw4
    public final /* synthetic */ mw4 d(mw4 mw4Var, mw4 mw4Var2, mw4 mw4Var3) {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.kw4
    public final void e(mw4 mw4Var) {
        mw4Var.b = this.I;
        this.I = (hw4) mw4Var;
    }

    public final void f(int i, int i2) {
        int i3;
        a4 a4Var;
        ns4 h;
        boolean f;
        do {
            synchronized (j42.r) {
                hw4 hw4Var = this.I;
                hw4Var.getClass();
                hw4 hw4Var2 = (hw4) ws4.f(hw4Var);
                i3 = hw4Var2.d;
                a4Var = hw4Var2.c;
            }
            a4Var.getClass();
            rm3 h2 = a4Var.h();
            h2.subList(i, i2).clear();
            a4 e = h2.e();
            if (j42.c(e, a4Var)) {
                return;
            }
            hw4 hw4Var3 = this.I;
            hw4Var3.getClass();
            synchronized (ws4.c) {
                h = ws4.h();
                f = j42.f((hw4) ws4.x(hw4Var3, this, h), i3, e, true);
            }
            ws4.m(h, this);
        } while (!f);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return j42.D(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return j42.D(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return j42.D(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return j42.D(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new lk2(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        a4 a4Var;
        ns4 h;
        boolean f;
        do {
            synchronized (j42.r) {
                hw4 hw4Var = this.I;
                hw4Var.getClass();
                hw4 hw4Var2 = (hw4) ws4.f(hw4Var);
                i = hw4Var2.d;
                a4Var = hw4Var2.c;
            }
            a4Var.getClass();
            int indexOf = a4Var.indexOf(obj);
            a4 l = indexOf != -1 ? a4Var.l(indexOf) : a4Var;
            if (l.equals(a4Var)) {
                return false;
            }
            hw4 hw4Var3 = this.I;
            hw4Var3.getClass();
            synchronized (ws4.c) {
                h = ws4.h();
                f = j42.f((hw4) ws4.x(hw4Var3, this, h), i, l, true);
            }
            ws4.m(h, this);
        } while (!f);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        a4 a4Var;
        ns4 h;
        boolean f;
        do {
            synchronized (j42.r) {
                hw4 hw4Var = this.I;
                hw4Var.getClass();
                hw4 hw4Var2 = (hw4) ws4.f(hw4Var);
                i = hw4Var2.d;
                a4Var = hw4Var2.c;
            }
            a4Var.getClass();
            a4 j = a4Var.j(new z3(collection, (byte) 0));
            if (j42.c(j, a4Var)) {
                return false;
            }
            hw4 hw4Var3 = this.I;
            hw4Var3.getClass();
            synchronized (ws4.c) {
                h = ws4.h();
                f = j42.f((hw4) ws4.x(hw4Var3, this, h), i, j, true);
            }
            ws4.m(h, this);
        } while (!f);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return j42.Q(this, new z3(collection, (byte) 2));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        a4 a4Var;
        ns4 h;
        boolean f;
        Object obj2 = get(i);
        do {
            synchronized (j42.r) {
                hw4 hw4Var = this.I;
                hw4Var.getClass();
                hw4 hw4Var2 = (hw4) ws4.f(hw4Var);
                i2 = hw4Var2.d;
                a4Var = hw4Var2.c;
            }
            a4Var.getClass();
            a4 m = a4Var.m(i, obj);
            if (m.equals(a4Var)) {
                break;
            }
            hw4 hw4Var3 = this.I;
            hw4Var3.getClass();
            synchronized (ws4.c) {
                h = ws4.h();
                f = j42.f((hw4) ws4.x(hw4Var3, this, h), i2, m, false);
            }
            ws4.m(h, this);
        } while (!f);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return j42.D(this).c.c();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            jr3.a("fromIndex or toIndex are out of bounds");
        }
        return new ny4(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return j42.h0(this);
    }

    public final String toString() {
        hw4 hw4Var = this.I;
        hw4Var.getClass();
        return "SnapshotStateList(value=" + ((hw4) ws4.f(hw4Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        a4 a4Var = j42.D(this).c;
        int c = a4Var.c();
        parcel.writeInt(c);
        for (int i2 = 0; i2 < c; i2++) {
            parcel.writeValue(a4Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j42.i0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new lk2(this, i);
    }

    public gt4() {
        this(xr4.J);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        a4 a4Var;
        ns4 h;
        boolean f;
        do {
            synchronized (j42.r) {
                hw4 hw4Var = this.I;
                hw4Var.getClass();
                hw4 hw4Var2 = (hw4) ws4.f(hw4Var);
                i2 = hw4Var2.d;
                a4Var = hw4Var2.c;
            }
            a4Var.getClass();
            a4 d = a4Var.d(i, obj);
            if (d.equals(a4Var)) {
                return;
            }
            hw4 hw4Var3 = this.I;
            hw4Var3.getClass();
            synchronized (ws4.c) {
                h = ws4.h();
                f = j42.f((hw4) ws4.x(hw4Var3, this, h), i2, d, true);
            }
            ws4.m(h, this);
        } while (!f);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return j42.Q(this, new ha(i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        a4 a4Var;
        ns4 h;
        boolean f;
        Object obj = get(i);
        do {
            synchronized (j42.r) {
                hw4 hw4Var = this.I;
                hw4Var.getClass();
                hw4 hw4Var2 = (hw4) ws4.f(hw4Var);
                i2 = hw4Var2.d;
                a4Var = hw4Var2.c;
            }
            a4Var.getClass();
            a4 l = a4Var.l(i);
            if (l.equals(a4Var)) {
                break;
            }
            hw4 hw4Var3 = this.I;
            hw4Var3.getClass();
            synchronized (ws4.c) {
                h = ws4.h();
                f = j42.f((hw4) ws4.x(hw4Var3, this, h), i2, l, true);
            }
            ws4.m(h, this);
        } while (!f);
        return obj;
    }
}
