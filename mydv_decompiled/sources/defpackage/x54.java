package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class x54 extends t2 {
    public int K;
    public int L;
    public final /* synthetic */ y54 M;

    public x54(y54 y54Var) {
        this.M = y54Var;
        this.K = y54Var.L;
        this.L = y54Var.K;
    }

    @Override // defpackage.t2
    public final void a() {
        int i = this.K;
        if (i == 0) {
            this.I = (byte) 2;
            return;
        }
        y54 y54Var = this.M;
        Object[] objArr = y54Var.I;
        int i2 = this.L;
        this.J = objArr[i2];
        this.I = (byte) 1;
        this.L = (i2 + 1) % y54Var.J;
        this.K = i - 1;
    }
}
