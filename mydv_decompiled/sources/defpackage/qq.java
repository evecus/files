package defpackage;

import androidx.media3.common.video.Frame;
import java.io.IOException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qq implements eq4 {
    public final /* synthetic */ sq I;
    public final /* synthetic */ eq4 J;

    public qq(sq sqVar, eq4 eq4Var) {
        this.I = sqVar;
        this.J = eq4Var;
    }

    @Override // defpackage.eq4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        eq4 eq4Var = this.J;
        sq sqVar = this.I;
        sqVar.enter();
        try {
            eq4Var.close();
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

    @Override // defpackage.eq4, java.io.Flushable
    public final void flush() {
        eq4 eq4Var = this.J;
        sq sqVar = this.I;
        sqVar.enter();
        try {
            eq4Var.flush();
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

    @Override // defpackage.eq4
    public final u75 timeout() {
        return this.I;
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.J + ')';
    }

    @Override // defpackage.eq4
    public final void write(cz czVar, long j) {
        czVar.getClass();
        o7.j(czVar.J, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            kh4 kh4Var = czVar.I;
            kh4Var.getClass();
            while (true) {
                if (j2 >= Frame.USAGE_VIDEO_ENCODE) {
                    break;
                }
                j2 += kh4Var.c - kh4Var.b;
                if (j2 >= j) {
                    j2 = j;
                    break;
                } else {
                    kh4Var = kh4Var.f;
                    kh4Var.getClass();
                }
            }
            eq4 eq4Var = this.J;
            sq sqVar = this.I;
            sqVar.enter();
            try {
                try {
                    eq4Var.write(czVar, j2);
                    if (sqVar.exit()) {
                        throw sqVar.access$newTimeoutException(null);
                    }
                    j -= j2;
                } catch (IOException e) {
                    if (!sqVar.exit()) {
                        throw e;
                    }
                    throw sqVar.access$newTimeoutException(e);
                }
            } catch (Throwable th) {
                sqVar.exit();
                throw th;
            }
        }
    }
}
