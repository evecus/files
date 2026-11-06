package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fi5 implements zh5 {
    public final int I;
    public final int J;
    public final ts0 K;

    public fi5(int i, int i2, l61 l61Var) {
        this.I = i;
        this.J = i2;
        this.K = new ts0(new wf1(i, i2, l61Var));
    }

    @Override // defpackage.xh5
    public final boolean a() {
        return false;
    }

    @Override // defpackage.xh5
    public final hj d(long j, hj hjVar, hj hjVar2, hj hjVar3) {
        return this.K.d(j, hjVar, hjVar2, hjVar3);
    }

    @Override // defpackage.zh5
    public final int f() {
        return this.J;
    }

    @Override // defpackage.zh5
    public final int h() {
        return this.I;
    }

    @Override // defpackage.xh5
    public final hj i(long j, hj hjVar, hj hjVar2, hj hjVar3) {
        return this.K.i(j, hjVar, hjVar2, hjVar3);
    }

    @Override // defpackage.xh5
    public final hj j(hj hjVar, hj hjVar2, hj hjVar3) {
        return this.K.d(k(hjVar, hjVar2, hjVar3), hjVar, hjVar2, hjVar3);
    }

    @Override // defpackage.xh5
    public final long k(hj hjVar, hj hjVar2, hj hjVar3) {
        return (h() + f()) * 1000000;
    }
}
