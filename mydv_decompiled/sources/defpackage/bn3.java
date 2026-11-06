package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class bn3 {
    public int I;
    public int J;
    public long K = 0;
    public long L = cn3.b;
    public long M = 0;

    public abstract int R(v8 v8Var);

    public int U() {
        return (int) (this.K & 4294967295L);
    }

    public int V() {
        return (int) (this.K >> 32);
    }

    public final void a0() {
        this.I = ut0.r((int) (this.K >> 32), dh0.j(this.L), dh0.h(this.L));
        this.J = ut0.r((int) (this.K & 4294967295L), dh0.i(this.L), dh0.g(this.L));
        int i = this.I;
        long j = this.K;
        this.M = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public abstract void d0(long j, float f, tm1 tm1Var);

    public final void e0(long j) {
        if (z22.b(this.K, j)) {
            return;
        }
        this.K = j;
        a0();
    }

    public final void g0(long j) {
        if (dh0.b(this.L, j)) {
            return;
        }
        this.L = j;
        a0();
    }

    public Object z() {
        return null;
    }
}
