package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wt4 implements te0, Iterable, w72 {
    public final tr4 I;
    public final int J;
    public final f34 K;

    public wt4(tr4 tr4Var, int i, io1 io1Var, f34 f34Var) {
        this.I = tr4Var;
        this.J = i;
        this.K = f34Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wt4)) {
            return false;
        }
        wt4 wt4Var = (wt4) obj;
        return wt4Var.J == this.J && wt4Var.I == this.I && wt4Var.K.equals(this.K);
    }

    public final int hashCode() {
        return this.K.hashCode() + ((this.I.hashCode() + (this.J * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new vt4(this.I, this.J, null, this.K);
    }
}
