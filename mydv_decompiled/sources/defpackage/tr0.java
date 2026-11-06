package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tr0 implements pw2 {
    public final /* synthetic */ byte I;
    public final a42 J;
    public final Enum K;
    public final Enum L;

    public /* synthetic */ tr0(a42 a42Var, Enum r2, Enum r3, byte b) {
        this.I = b;
        this.J = a42Var;
        this.K = r2;
        this.L = r3;
    }

    @Override // defpackage.a42
    public final int Q(int i) {
        switch (this.I) {
        }
        return this.J.Q(i);
    }

    @Override // defpackage.a42
    public final int b(int i) {
        switch (this.I) {
        }
        return this.J.b(i);
    }

    @Override // defpackage.a42
    public final int p(int i) {
        switch (this.I) {
        }
        return this.J.p(i);
    }

    @Override // defpackage.a42
    public final int t(int i) {
        switch (this.I) {
        }
        return this.J.t(i);
    }

    @Override // defpackage.pw2
    public final bn3 u(long j) {
        byte b = this.I;
        Enum r1 = this.K;
        Enum r2 = this.L;
        a42 a42Var = this.J;
        switch (b) {
            case 0:
                g42 g42Var = (g42) r2;
                c42 c42Var = (c42) r1;
                c42 c42Var2 = c42.J;
                if (g42Var == g42.I) {
                    return new ef1((byte) 0, c42Var == c42Var2 ? a42Var.t(dh0.g(j)) : a42Var.p(dh0.g(j)), dh0.c(j) ? dh0.g(j) : 32767);
                }
                return new ef1((byte) 0, dh0.d(j) ? dh0.h(j) : 32767, c42Var == c42Var2 ? a42Var.b(dh0.h(j)) : a42Var.Q(dh0.h(j)));
            case 1:
                ex2 ex2Var = (ex2) r2;
                dx2 dx2Var = (dx2) r1;
                dx2 dx2Var2 = dx2.J;
                if (ex2Var == ex2.I) {
                    return new ef1((byte) 1, dx2Var == dx2Var2 ? a42Var.t(dh0.g(j)) : a42Var.p(dh0.g(j)), dh0.c(j) ? dh0.g(j) : 32767);
                }
                return new ef1((byte) 1, dh0.d(j) ? dh0.h(j) : 32767, dx2Var == dx2Var2 ? a42Var.b(dh0.h(j)) : a42Var.Q(dh0.h(j)));
            default:
                ra3 ra3Var = (ra3) r2;
                qa3 qa3Var = (qa3) r1;
                qa3 qa3Var2 = qa3.J;
                if (ra3Var == ra3.I) {
                    return new ef1((byte) 2, qa3Var == qa3Var2 ? a42Var.t(dh0.g(j)) : a42Var.p(dh0.g(j)), dh0.c(j) ? dh0.g(j) : 32767);
                }
                return new ef1((byte) 2, dh0.d(j) ? dh0.h(j) : 32767, qa3Var == qa3Var2 ? a42Var.b(dh0.h(j)) : a42Var.Q(dh0.h(j)));
        }
    }

    @Override // defpackage.a42
    public final Object z() {
        switch (this.I) {
        }
        return this.J.z();
    }
}
