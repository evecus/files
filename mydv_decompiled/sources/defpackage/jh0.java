package defpackage;

import java.io.InputStream;

/* loaded from: classes2.dex */
public final class jh0 extends InputStream {
    public final a1 I;
    public boolean J = true;
    public InputStream K;

    public jh0(a1 a1Var) {
        this.I = a1Var;
    }

    public final s0 e() {
        a1 a1Var = this.I;
        int read = ((jj2) a1Var.e).read();
        e0 e = read < 0 ? null : a1Var.e(read);
        if (e == null) {
            return null;
        }
        if (e instanceof s0) {
            return (s0) e;
        }
        zl1.f(e.getClass(), "unknown object encountered: ");
        return null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        s0 e;
        int i3 = 0;
        if (this.K == null) {
            if (!this.J || (e = e()) == null) {
                return -1;
            }
            this.J = false;
            this.K = e.c();
        }
        while (true) {
            int read = this.K.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                s0 e2 = e();
                if (e2 == null) {
                    this.K = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.K = e2.c();
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        s0 e;
        if (this.K == null) {
            if (!this.J || (e = e()) == null) {
                return -1;
            }
            this.J = false;
            this.K = e.c();
        }
        while (true) {
            int read = this.K.read();
            if (read >= 0) {
                return read;
            }
            s0 e2 = e();
            if (e2 == null) {
                this.K = null;
                return -1;
            }
            this.K = e2.c();
        }
    }
}
