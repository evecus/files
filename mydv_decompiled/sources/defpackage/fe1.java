package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fe1 implements ut4 {
    public final ge1 I;
    public long J;
    public boolean K;

    public fe1(ge1 ge1Var, long j) {
        this.I = ge1Var;
        this.J = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.K) {
            return;
        }
        this.K = true;
        ge1 ge1Var = this.I;
        ReentrantLock reentrantLock = ge1Var.K;
        reentrantLock.lock();
        try {
            int i = ge1Var.J - 1;
            ge1Var.J = i;
            if (i == 0) {
                if (ge1Var.I) {
                    reentrantLock.unlock();
                    ge1Var.e();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.ut4
    public final long read(cz czVar, long j) {
        long j2;
        long j3;
        czVar.getClass();
        if (this.K) {
            zy.i("closed");
            return 0L;
        }
        long j4 = this.J;
        if (j < 0) {
            s83.h(r7.A("byteCount < 0: ", j));
            return 0L;
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 >= j5) {
                j2 = -1;
                break;
            }
            kh4 a0 = czVar.a0(1);
            j2 = -1;
            int g = this.I.g(j6, a0.a, a0.c, (int) Math.min(j5 - j6, 8192 - r13));
            if (g == -1) {
                if (a0.b == a0.c) {
                    czVar.I = a0.a();
                    ph4.a(a0);
                }
                if (j4 == j6) {
                    j3 = -1;
                }
            } else {
                a0.c += g;
                long j7 = g;
                j6 += j7;
                czVar.J += j7;
            }
        }
        j3 = j6 - j4;
        if (j3 != j2) {
            this.J += j3;
        }
        return j3;
    }

    @Override // defpackage.ut4
    public final u75 timeout() {
        return u75.NONE;
    }
}
