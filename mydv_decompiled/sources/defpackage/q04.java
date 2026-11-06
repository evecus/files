package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class q04 implements lz {
    public final eq4 I;
    public final cz J;
    public boolean K;

    public q04(eq4 eq4Var) {
        eq4Var.getClass();
        this.I = eq4Var;
        this.J = new cz();
    }

    @Override // defpackage.lz
    public final lz B(String str) {
        str.getClass();
        if (this.K) {
            zy.i("closed");
            return null;
        }
        this.J.k0(str);
        r();
        return this;
    }

    @Override // defpackage.lz
    public final lz G(long j) {
        if (this.K) {
            zy.i("closed");
            return null;
        }
        this.J.f0(j);
        r();
        return this;
    }

    @Override // defpackage.lz
    public final lz J(int i, int i2, String str) {
        str.getClass();
        if (this.K) {
            zy.i("closed");
            return null;
        }
        this.J.j0(i, i2, str);
        r();
        return this;
    }

    @Override // defpackage.lz
    public final lz S(h00 h00Var) {
        h00Var.getClass();
        if (this.K) {
            zy.i("closed");
            return null;
        }
        this.J.c0(h00Var);
        r();
        return this;
    }

    @Override // defpackage.lz
    public final lz V(long j) {
        if (this.K) {
            zy.i("closed");
            return null;
        }
        this.J.e0(j);
        r();
        return this;
    }

    @Override // defpackage.lz
    public final cz a() {
        return this.J;
    }

    @Override // defpackage.eq4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        eq4 eq4Var = this.I;
        if (this.K) {
            return;
        }
        try {
            cz czVar = this.J;
            long j = czVar.J;
            if (j > 0) {
                eq4Var.write(czVar, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            eq4Var.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.K = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.lz, defpackage.eq4, java.io.Flushable
    public final void flush() {
        if (this.K) {
            zy.i("closed");
            return;
        }
        cz czVar = this.J;
        long j = czVar.J;
        eq4 eq4Var = this.I;
        if (j > 0) {
            eq4Var.write(czVar, j);
        }
        eq4Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.K;
    }

    @Override // defpackage.lz
    public final lz k(int i) {
        if (this.K) {
            zy.i("closed");
            return null;
        }
        this.J.l0(i);
        r();
        return this;
    }

    @Override // defpackage.lz
    public final long q(ut4 ut4Var) {
        ut4Var.getClass();
        long j = 0;
        while (true) {
            long read = ut4Var.read(this.J, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
            r();
        }
    }

    @Override // defpackage.lz
    public final lz r() {
        if (this.K) {
            zy.i("closed");
            return null;
        }
        cz czVar = this.J;
        long g = czVar.g();
        if (g > 0) {
            this.I.write(czVar, g);
        }
        return this;
    }

    @Override // defpackage.eq4
    public final u75 timeout() {
        return this.I.timeout();
    }

    public final String toString() {
        return "buffer(" + this.I + ')';
    }

    @Override // defpackage.lz
    public final lz write(byte[] bArr) {
        bArr.getClass();
        if (this.K) {
            zy.i("closed");
            return null;
        }
        this.J.m196write(bArr, 0, bArr.length);
        r();
        return this;
    }

    @Override // defpackage.lz
    public final lz writeByte(int i) {
        if (this.K) {
            zy.i("closed");
            return null;
        }
        this.J.d0(i);
        r();
        return this;
    }

    @Override // defpackage.lz
    public final lz writeInt(int i) {
        if (this.K) {
            zy.i("closed");
            return null;
        }
        this.J.g0(i);
        r();
        return this;
    }

    @Override // defpackage.lz
    public final lz writeShort(int i) {
        if (this.K) {
            zy.i("closed");
            return null;
        }
        this.J.h0(i);
        r();
        return this;
    }

    @Override // defpackage.eq4
    public final void write(cz czVar, long j) {
        czVar.getClass();
        if (!this.K) {
            this.J.write(czVar, j);
            r();
        } else {
            zy.i("closed");
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.K) {
            int write = this.J.write(byteBuffer);
            r();
            return write;
        }
        zy.i("closed");
        return 0;
    }

    @Override // defpackage.lz
    public final lz write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (!this.K) {
            this.J.m196write(bArr, i, i2);
            r();
            return this;
        }
        zy.i("closed");
        return null;
    }
}
