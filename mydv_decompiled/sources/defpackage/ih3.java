package defpackage;

import java.io.OutputStream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ih3 implements eq4 {
    public final OutputStream I;
    public final u75 J;

    public ih3(OutputStream outputStream, u75 u75Var) {
        this.I = outputStream;
        this.J = u75Var;
    }

    @Override // defpackage.eq4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.I.close();
    }

    @Override // defpackage.eq4, java.io.Flushable
    public final void flush() {
        this.I.flush();
    }

    @Override // defpackage.eq4
    public final u75 timeout() {
        return this.J;
    }

    public final String toString() {
        return "sink(" + this.I + ')';
    }

    @Override // defpackage.eq4
    public final void write(cz czVar, long j) {
        czVar.getClass();
        o7.j(czVar.J, 0L, j);
        while (j > 0) {
            this.J.throwIfReached();
            kh4 kh4Var = czVar.I;
            kh4Var.getClass();
            int min = (int) Math.min(j, kh4Var.c - kh4Var.b);
            this.I.write(kh4Var.a, kh4Var.b, min);
            int i = kh4Var.b + min;
            kh4Var.b = i;
            long j2 = min;
            j -= j2;
            czVar.J -= j2;
            if (i == kh4Var.c) {
                czVar.I = kh4Var.a();
                ph4.a(kh4Var);
            }
        }
    }
}
