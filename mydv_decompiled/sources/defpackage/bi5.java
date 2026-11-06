package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class bi5 implements xh5 {
    public final zh5 I;
    public final d44 J;
    public final long K;
    public final long L;

    public bi5(zh5 zh5Var, d44 d44Var, long j) {
        this.I = zh5Var;
        this.J = d44Var;
        this.K = (zh5Var.h() + zh5Var.f()) * 1000000;
        this.L = j * 1000000;
    }

    @Override // defpackage.xh5
    public final boolean a() {
        return true;
    }

    public final long b(long j) {
        long j2 = this.L;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.K;
        long j5 = j3 / j4;
        if (this.J != d44.I && j5 % 2 != 0) {
            return ((j5 + 1) * j4) - j3;
        }
        Long.signum(j5);
        return j3 - (j5 * j4);
    }

    public final hj c(long j, hj hjVar, hj hjVar2, hj hjVar3) {
        long j2 = this.L;
        long j3 = j + j2;
        long j4 = this.K;
        return j3 > j4 ? this.I.d(j4 - j2, hjVar, hjVar3, hjVar2) : hjVar2;
    }

    @Override // defpackage.xh5
    public final hj d(long j, hj hjVar, hj hjVar2, hj hjVar3) {
        return this.I.d(b(j), hjVar, hjVar2, c(j, hjVar, hjVar3, hjVar2));
    }

    @Override // defpackage.xh5
    public final hj i(long j, hj hjVar, hj hjVar2, hj hjVar3) {
        return this.I.i(b(j), hjVar, hjVar2, c(j, hjVar, hjVar3, hjVar2));
    }

    @Override // defpackage.xh5
    public final hj j(hj hjVar, hj hjVar2, hj hjVar3) {
        return d(Long.MAX_VALUE, hjVar, hjVar2, hjVar3);
    }

    @Override // defpackage.xh5
    public final long k(hj hjVar, hj hjVar2, hj hjVar3) {
        return Long.MAX_VALUE;
    }
}
