package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class py1 extends sy1 {
    public final /* synthetic */ byte L;
    public final /* synthetic */ qy1 M;

    public /* synthetic */ py1(qy1 qy1Var, byte b) {
        this.L = b;
        this.M = qy1Var;
    }

    @Override // defpackage.vx1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.L;
        qy1 qy1Var = this.M;
        switch (b) {
            case 0:
                if (obj instanceof zc3) {
                    zc3 zc3Var = (zc3) obj;
                    if (zc3Var.a() > 0) {
                        if (((d34) qy1Var).M.b(zc3Var.a) == zc3Var.a()) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return ((d34) qy1Var).contains(obj);
        }
    }

    @Override // defpackage.vx1
    public final int d(int i, Object[] objArr) {
        return c().d(i, objArr);
    }

    @Override // defpackage.sy1, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.L) {
            case 0:
                return this.M.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // defpackage.vx1
    public final boolean j() {
        switch (this.L) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ee5 iterator() {
        return c().listIterator(0);
    }

    @Override // defpackage.sy1
    public final dy1 p() {
        return new hz1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.L;
        qy1 qy1Var = this.M;
        switch (b) {
            case 0:
                d34 d34Var = (d34) qy1Var;
                py1 py1Var = d34Var.O;
                if (py1Var == null) {
                    py1Var = new py1(d34Var, (byte) 1);
                    d34Var.O = py1Var;
                }
                return py1Var.size();
            default:
                return ((d34) qy1Var).M.c;
        }
    }
}
