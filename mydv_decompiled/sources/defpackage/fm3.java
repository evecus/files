package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fm3 extends y3 {
    public final /* synthetic */ byte I;
    public final dm3 J;

    public /* synthetic */ fm3(dm3 dm3Var, byte b) {
        this.I = b;
        this.J = dm3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.I) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.y3
    public final int c() {
        byte b = this.I;
        dm3 dm3Var = this.J;
        switch (b) {
        }
        return dm3Var.N;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.I;
        dm3 dm3Var = this.J;
        switch (b) {
            case 0:
                dm3Var.clear();
                break;
            default:
                dm3Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.I) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    dm3 dm3Var = this.J;
                    Object obj2 = dm3Var.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && dm3Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.J.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.I;
        dm3 dm3Var = this.J;
        switch (b) {
            case 0:
                return new q70(dm3Var);
            default:
                ta5[] ta5VarArr = new ta5[8];
                for (int i = 0; i < 8; i++) {
                    ta5VarArr[i] = new va5((byte) 0);
                }
                return new gm3(dm3Var, ta5VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.I) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.J.remove(entry.getKey(), entry.getValue());
            default:
                dm3 dm3Var = this.J;
                if (!dm3Var.containsKey(obj)) {
                    return false;
                }
                dm3Var.remove(obj);
                return true;
        }
    }
}
