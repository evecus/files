package defpackage;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class q70 implements Iterator, w72 {
    public final /* synthetic */ byte I = 1;
    public final Object J;

    public q70(dm3 dm3Var) {
        ta5[] ta5VarArr = new ta5[8];
        for (int i = 0; i < 8; i++) {
            ta5VarArr[i] = new wa5(this);
        }
        this.J = new em3(dm3Var, ta5VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                return ((Enumeration) obj).hasMoreElements();
            case 1:
                return ((em3) obj).K;
            default:
                return ((Iterator) obj).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                return ((Enumeration) obj).nextElement();
            case 1:
                return (Map.Entry) ((em3) obj).next();
            default:
                return (uh5) ((Iterator) obj).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.I) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ((em3) this.J).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q70(Enumeration enumeration) {
        this.J = enumeration;
    }

    public q70(sh5 sh5Var) {
        this.J = sh5Var.R.iterator();
    }
}
