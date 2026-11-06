package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class h02 implements ut4 {
    public final s04 I;
    public final Inflater J;
    public int K;
    public boolean L;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h02(ut4 ut4Var, Inflater inflater) {
        this(new s04(ut4Var), inflater);
        ut4Var.getClass();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.L) {
            return;
        }
        this.J.end();
        this.L = true;
        this.I.close();
    }

    public final long e(cz czVar, long j) {
        Inflater inflater = this.J;
        czVar.getClass();
        if (j < 0) {
            s83.h(r7.A("byteCount < 0: ", j));
            return 0L;
        }
        if (this.L) {
            zy.i("closed");
            return 0L;
        }
        if (j != 0) {
            try {
                kh4 a0 = czVar.a0(1);
                int min = (int) Math.min(j, 8192 - a0.c);
                boolean needsInput = inflater.needsInput();
                s04 s04Var = this.I;
                if (needsInput && !s04Var.p()) {
                    kh4 kh4Var = s04Var.J.I;
                    kh4Var.getClass();
                    int i = kh4Var.c;
                    int i2 = kh4Var.b;
                    int i3 = i - i2;
                    this.K = i3;
                    inflater.setInput(kh4Var.a, i2, i3);
                }
                int inflate = inflater.inflate(a0.a, a0.c, min);
                int i4 = this.K;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.K -= remaining;
                    s04Var.skip(remaining);
                }
                if (inflate > 0) {
                    a0.c += inflate;
                    long j2 = inflate;
                    czVar.J += j2;
                    return j2;
                }
                if (a0.b == a0.c) {
                    czVar.I = a0.a();
                    ph4.a(a0);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // defpackage.ut4
    public final long read(cz czVar, long j) {
        czVar.getClass();
        do {
            long e = e(czVar, j);
            if (e > 0) {
                return e;
            }
            Inflater inflater = this.J;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.I.p());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // defpackage.ut4
    public final u75 timeout() {
        return this.I.I.timeout();
    }

    public h02(s04 s04Var, Inflater inflater) {
        this.I = s04Var;
        this.J = inflater;
    }
}
