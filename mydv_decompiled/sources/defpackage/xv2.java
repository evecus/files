package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class xv2 extends y2 {
    public final /* synthetic */ byte I = 1;
    public final Object J;

    public xv2(List list) {
        list.getClass();
        this.J = list;
    }

    @Override // defpackage.w1
    public final int c() {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                return ((zv2) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.w1, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.I) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                String group = ((zv2) obj).a.group(i);
                return group == null ? "" : group;
            default:
                List list = (List) obj;
                if (i >= 0 && i <= p70.X(this)) {
                    return list.get(p70.X(this) - i);
                }
                StringBuilder C = hf1.C("Element index ", i, " must be in range [");
                C.append(new u22(0, p70.X(this), 1));
                C.append("].");
                throw new IndexOutOfBoundsException(C.toString());
        }
    }

    @Override // defpackage.y2, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.I) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.y2, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.I) {
            case 1:
                return new q54(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.y2, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.I) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.y2, java.util.List
    public ListIterator listIterator() {
        switch (this.I) {
            case 1:
                return new q54(this, 0);
            default:
                return super.listIterator();
        }
    }

    public xv2(zv2 zv2Var) {
        this.J = zv2Var;
    }

    @Override // defpackage.y2, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.I) {
            case 1:
                return new q54(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
