package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class l52 extends ee5 {
    public int I;
    public Object J;
    public final /* synthetic */ byte K;
    public final Iterator L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l52(vk4 vk4Var) {
        this();
        this.K = (byte) 1;
        this.M = vk4Var;
        this.L = vk4Var.I.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        sp0.z(this.I != 4);
        int F = pt1.F(this.I);
        if (F == 0) {
            return true;
        }
        if (F != 2) {
            this.I = 4;
            byte b = this.K;
            Object obj = null;
            Object obj2 = this.M;
            Iterator it = this.L;
            switch (b) {
                case 0:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((mr3) obj2).apply(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.I = 3;
                    break;
                default:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((vk4) obj2).J.contains(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.I = 3;
                    break;
            }
            this.J = obj;
            if (this.I != 3) {
                this.I = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            zy.k();
            return null;
        }
        this.I = 2;
        Object obj = this.J;
        this.J = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l52(Iterator it, mr3 mr3Var) {
        this();
        this.K = (byte) 0;
        this.L = it;
        this.M = mr3Var;
    }

    public l52() {
        this.I = 2;
    }
}
