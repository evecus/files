package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gb0 implements Iterator {
    public int I;
    public int J;
    public int K;
    public final /* synthetic */ jb0 L;
    public final /* synthetic */ byte M;
    public final /* synthetic */ jb0 N;

    public gb0(jb0 jb0Var, byte b) {
        this.M = b;
        this.N = jb0Var;
        this.L = jb0Var;
        this.I = jb0Var.M;
        this.J = jb0Var.isEmpty() ? -1 : 0;
        this.K = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.J >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        jb0 jb0Var = this.L;
        if (jb0Var.M != this.I) {
            y9.e();
            return null;
        }
        if (!hasNext()) {
            zy.k();
            return null;
        }
        int i = this.J;
        this.K = i;
        byte b = this.M;
        jb0 jb0Var2 = this.N;
        switch (b) {
            case 0:
                obj = jb0Var2.j()[i];
                break;
            case 1:
                obj = new ib0(jb0Var2, i);
                break;
            default:
                obj = jb0Var2.k()[i];
                break;
        }
        int i2 = this.J + 1;
        if (i2 >= jb0Var.N) {
            i2 = -1;
        }
        this.J = i2;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        jb0 jb0Var = this.L;
        if (jb0Var.M != this.I) {
            y9.e();
            return;
        }
        sp0.A(this.K >= 0, "no calls to next() since the last call to remove()");
        this.I += 32;
        int i = this.K;
        Object obj = jb0.R;
        jb0Var.remove(jb0Var.j()[i]);
        this.J--;
        this.K = -1;
    }
}
