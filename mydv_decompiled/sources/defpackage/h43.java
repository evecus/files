package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class h43 implements Iterator, w72 {
    public final /* synthetic */ byte I;
    public int J;
    public Object K;
    public final Object L;

    public h43(q43 q43Var) {
        this.I = (byte) 1;
        this.L = q43Var;
        this.J = -1;
        this.K = oh4.n(new p43(q43Var, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.I) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (this.J < ((Map) this.L).size()) {
                }
                break;
        }
        return ((pj4) this.K).hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.I) {
            case 0:
                return ((pj4) this.K).next();
            case 1:
                return ((pj4) this.K).next();
            default:
                if (!hasNext()) {
                    zy.k();
                    return null;
                }
                Object obj = this.K;
                this.J++;
                Object obj2 = ((Map) this.L).get(obj);
                if (obj2 != null) {
                    this.K = ((ik2) obj2).b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.I;
        Object obj = this.L;
        switch (b) {
            case 0:
                int i = this.J;
                if (i != -1) {
                    ((i43) obj).J.h(i);
                    this.J = -1;
                    return;
                }
                return;
            case 1:
                int i2 = this.J;
                if (i2 != -1) {
                    ((q43) obj).J.m(i2);
                    this.J = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h43(Object obj, Map map) {
        this.I = (byte) 2;
        this.K = obj;
        this.L = map;
    }

    public h43(i43 i43Var) {
        this.I = (byte) 0;
        this.L = i43Var;
        this.J = -1;
        this.K = oh4.n(new g43(i43Var, this, null));
    }
}
