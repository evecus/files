package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class b43 implements ListIterator, w72 {
    public final /* synthetic */ byte I;
    public final List J;
    public int K;

    public b43(List list, int i, byte b) {
        this.I = b;
        switch (b) {
            case 1:
                this.J = list;
                this.K = i;
                break;
            default:
                this.J = list;
                this.K = i - 1;
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        byte b = this.I;
        List list = this.J;
        switch (b) {
            case 0:
                int i = this.K + 1;
                this.K = i;
                list.add(i, obj);
                break;
            default:
                list.add(this.K, obj);
                this.K++;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.I;
        List list = this.J;
        switch (b) {
            case 0:
                if (this.K < list.size() - 1) {
                    break;
                }
                break;
            default:
                if (this.K < list.size()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.I) {
            case 0:
                if (this.K >= 0) {
                }
                break;
            default:
                if (this.K > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.I;
        List list = this.J;
        switch (b) {
            case 0:
                int i = this.K + 1;
                this.K = i;
                return list.get(i);
            default:
                int i2 = this.K;
                this.K = i2 + 1;
                return list.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.I) {
            case 0:
                return this.K + 1;
            default:
                return this.K;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.I;
        List list = this.J;
        switch (b) {
            case 0:
                int i = this.K;
                this.K = i - 1;
                return list.get(i);
            default:
                int i2 = this.K - 1;
                this.K = i2;
                return list.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.I) {
            case 0:
                return this.K;
            default:
                return this.K - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        byte b = this.I;
        List list = this.J;
        switch (b) {
            case 0:
                list.remove(this.K);
                this.K--;
                break;
            default:
                int i = this.K - 1;
                this.K = i;
                list.remove(i);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        byte b = this.I;
        List list = this.J;
        switch (b) {
            case 0:
                list.set(this.K, obj);
                break;
            default:
                list.set(this.K, obj);
                break;
        }
    }
}
