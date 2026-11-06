package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ei5 implements ai5 {
    public final byte I;
    public final zh5 J;
    public final d44 K;
    public final long L;
    public final long M;

    /* JADX WARN: Multi-variable type inference failed */
    public ei5(int i, zh5 zh5Var, d44 d44Var, long j) {
        this.I = i;
        this.J = zh5Var;
        this.K = d44Var;
        if (i < 1) {
            s83.t("Iterations count can't be less than 1");
            throw null;
        }
        this.L = (zh5Var.h() + zh5Var.f()) * 1000000;
        this.M = j * 1000000;
    }

    @Override // defpackage.xh5
    public final boolean a() {
        return false;
    }

    public final long b(long j) {
        long j2 = j + this.M;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.L;
        long min = Math.min(j2 / j3, this.I - 1);
        if (this.K != d44.I && min % 2 != 0) {
            return ((min + 1) * j3) - j2;
        }
        Long.signum(min);
        return j2 - (min * j3);
    }

    public final hj c(long j, hj hjVar, hj hjVar2, hj hjVar3) {
        long j2 = this.M;
        long j3 = j + j2;
        long j4 = this.L;
        return j3 > j4 ? d(j4 - j2, hjVar, hjVar2, hjVar3) : hjVar2;
    }

    @Override // defpackage.xh5
    public final hj d(long j, hj hjVar, hj hjVar2, hj hjVar3) {
        return this.J.d(b(j), hjVar, hjVar2, c(j, hjVar, hjVar3, hjVar2));
    }

    @Override // defpackage.xh5
    public final hj i(long j, hj hjVar, hj hjVar2, hj hjVar3) {
        return this.J.i(b(j), hjVar, hjVar2, c(j, hjVar, hjVar3, hjVar2));
    }

    @Override // defpackage.xh5
    public final hj j(hj hjVar, hj hjVar2, hj hjVar3) {
        return d(k(hjVar, hjVar2, hjVar3), hjVar, hjVar2, hjVar3);
    }

    @Override // defpackage.xh5
    public final long k(hj hjVar, hj hjVar2, hj hjVar3) {
        return (this.I * this.L) - this.M;
    }
}
