package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class m73 implements Iterator, w72 {
    public int I = -1;
    public boolean J;
    public final /* synthetic */ n73 K;

    public m73(n73 n73Var) {
        this.K = n73Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.I + 1 < this.K.b.e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            zy.k();
            return null;
        }
        this.J = true;
        cu4 cu4Var = this.K.b;
        int i = this.I + 1;
        this.I = i;
        return (i73) cu4Var.f(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.J) {
            zy.i("You must call next() before you can remove an element");
            return;
        }
        cu4 cu4Var = this.K.b;
        ((i73) cu4Var.f(this.I)).K = null;
        int i = this.I;
        Object[] objArr = cu4Var.K;
        Object obj = objArr[i];
        Object obj2 = qb.p;
        if (obj != obj2) {
            objArr[i] = obj2;
            cu4Var.I = true;
        }
        this.I = i - 1;
        this.J = false;
    }
}
