package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vv4 implements xh5 {
    public final xh5 I;
    public final long J;

    public vv4(xh5 xh5Var, long j) {
        this.I = xh5Var;
        this.J = j;
    }

    @Override // defpackage.xh5
    public final boolean a() {
        return this.I.a();
    }

    @Override // defpackage.xh5
    public final hj d(long j, hj hjVar, hj hjVar2, hj hjVar3) {
        long j2 = this.J;
        return j < j2 ? hjVar3 : this.I.d(j - j2, hjVar, hjVar2, hjVar3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vv4)) {
            return false;
        }
        vv4 vv4Var = (vv4) obj;
        return vv4Var.J == this.J && j42.c(vv4Var.I, this.I);
    }

    public final int hashCode() {
        int hashCode = this.I.hashCode() * 31;
        long j = this.J;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    @Override // defpackage.xh5
    public final hj i(long j, hj hjVar, hj hjVar2, hj hjVar3) {
        long j2 = this.J;
        return j < j2 ? hjVar : this.I.i(j - j2, hjVar, hjVar2, hjVar3);
    }

    @Override // defpackage.xh5
    public final hj j(hj hjVar, hj hjVar2, hj hjVar3) {
        return d(k(hjVar, hjVar2, hjVar3), hjVar, hjVar2, hjVar3);
    }

    @Override // defpackage.xh5
    public final long k(hj hjVar, hj hjVar2, hj hjVar3) {
        return this.I.k(hjVar, hjVar2, hjVar3) + this.J;
    }
}
