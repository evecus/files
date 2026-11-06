package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rq implements ut4 {
    public final /* synthetic */ sq I;
    public final /* synthetic */ ut4 J;

    public rq(sq sqVar, ut4 ut4Var) {
        this.I = sqVar;
        this.J = ut4Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ut4 ut4Var = this.J;
        sq sqVar = this.I;
        sqVar.enter();
        try {
            ut4Var.close();
            if (sqVar.exit()) {
                throw sqVar.access$newTimeoutException(null);
            }
        } catch (IOException e) {
            if (!sqVar.exit()) {
                throw e;
            }
            throw sqVar.access$newTimeoutException(e);
        } finally {
            sqVar.exit();
        }
    }

    @Override // defpackage.ut4
    public final long read(cz czVar, long j) {
        czVar.getClass();
        ut4 ut4Var = this.J;
        sq sqVar = this.I;
        sqVar.enter();
        try {
            long read = ut4Var.read(czVar, j);
            if (sqVar.exit()) {
                throw sqVar.access$newTimeoutException(null);
            }
            return read;
        } catch (IOException e) {
            if (sqVar.exit()) {
                throw sqVar.access$newTimeoutException(e);
            }
            throw e;
        } finally {
            sqVar.exit();
        }
    }

    @Override // defpackage.ut4
    public final u75 timeout() {
        return this.I;
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.J + ')';
    }
}
