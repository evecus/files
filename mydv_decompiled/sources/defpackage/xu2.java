package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class xu2 {
    public final zu2 I;
    public int J;
    public int K = -1;
    public int L;

    public xu2(zu2 zu2Var) {
        this.I = zu2Var;
        this.L = zu2Var.P;
        b();
    }

    public final void a() {
        if (this.I.P == this.L) {
            return;
        }
        y9.e();
    }

    public final void b() {
        while (true) {
            int i = this.J;
            zu2 zu2Var = this.I;
            if (i >= zu2Var.N || zu2Var.K[i] >= 0) {
                return;
            } else {
                this.J = i + 1;
            }
        }
    }

    public final boolean hasNext() {
        return this.J < this.I.N;
    }

    public final void remove() {
        a();
        if (this.K == -1) {
            zy.i("Call next() before removing element from the iterator.");
            return;
        }
        zu2 zu2Var = this.I;
        zu2Var.c();
        zu2Var.k(this.K);
        this.K = -1;
        this.L = zu2Var.P;
    }
}
