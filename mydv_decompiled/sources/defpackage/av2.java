package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class av2 extends y3 {
    public final /* synthetic */ byte I;
    public final zu2 J;

    public /* synthetic */ av2(zu2 zu2Var, byte b) {
        this.I = b;
        this.J = zu2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.I) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        byte b = this.I;
        collection.getClass();
        switch (b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.y3
    public final int c() {
        byte b = this.I;
        zu2 zu2Var = this.J;
        switch (b) {
        }
        return zu2Var.Q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.I;
        zu2 zu2Var = this.J;
        switch (b) {
            case 0:
                zu2Var.clear();
                break;
            default:
                zu2Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.I;
        zu2 zu2Var = this.J;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int g = zu2Var.g(entry.getKey());
                if (g < 0) {
                    return false;
                }
                Object[] objArr = zu2Var.J;
                objArr.getClass();
                return j42.c(objArr[g], entry.getValue());
            default:
                return zu2Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.I) {
            case 0:
                collection.getClass();
                return this.J.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        byte b = this.I;
        zu2 zu2Var = this.J;
        switch (b) {
        }
        return zu2Var.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.I;
        zu2 zu2Var = this.J;
        switch (b) {
            case 0:
                return new vu2(zu2Var, false);
            default:
                return new vu2(zu2Var, (byte) 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.I;
        zu2 zu2Var = this.J;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    zu2Var.c();
                    int g = zu2Var.g(entry.getKey());
                    if (g >= 0) {
                        Object[] objArr = zu2Var.J;
                        objArr.getClass();
                        if (j42.c(objArr[g], entry.getValue())) {
                            zu2Var.k(g);
                            break;
                        }
                    }
                }
                break;
            default:
                zu2Var.c();
                int g2 = zu2Var.g(obj);
                if (g2 >= 0) {
                    zu2Var.k(g2);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        byte b = this.I;
        zu2 zu2Var = this.J;
        collection.getClass();
        switch (b) {
            case 0:
                zu2Var.c();
                break;
            default:
                zu2Var.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        byte b = this.I;
        zu2 zu2Var = this.J;
        collection.getClass();
        switch (b) {
            case 0:
                zu2Var.c();
                break;
            default:
                zu2Var.c();
                break;
        }
        return super.retainAll(collection);
    }
}
