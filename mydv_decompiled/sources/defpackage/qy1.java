package defpackage;

import j$.util.Collection;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class qy1 extends vx1 implements Collection, java.util.Collection {
    public static final /* synthetic */ int L = 0;
    public transient x24 J;
    public transient sy1 K;

    @Override // defpackage.vx1
    public final dy1 c() {
        x24 x24Var = this.J;
        if (x24Var != null) {
            return x24Var;
        }
        dy1 c = super.c();
        this.J = (x24) c;
        return c;
    }

    @Override // defpackage.vx1
    public final int d(int i, Object[] objArr) {
        ee5 it = m().iterator();
        while (it.hasNext()) {
            zc3 zc3Var = (zc3) it.next();
            Arrays.fill(objArr, i, zc3Var.a() + i, zc3Var.a);
            i += zc3Var.a();
        }
        return i;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qy1)) {
            return false;
        }
        qy1 qy1Var = (qy1) obj;
        d34 d34Var = (d34) this;
        if (d34Var.size() != qy1Var.size() || m().size() != qy1Var.m().size()) {
            return false;
        }
        for (zc3 zc3Var : qy1Var.m()) {
            if (d34Var.M.b(zc3Var.a) != zc3Var.a()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return kb4.I(m());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public final ee5 iterator() {
        return new ny1(m().iterator());
    }

    public final sy1 m() {
        sy1 sy1Var = this.K;
        if (sy1Var == null) {
            sy1Var = isEmpty() ? e34.R : new py1(this, (byte) 0);
            this.K = sy1Var;
        }
        return sy1Var;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return m().toString();
    }
}
