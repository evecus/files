package defpackage;

import java.io.InputStream;

/* loaded from: classes2.dex */
public final class ih0 extends InputStream {
    public final a1 I;
    public boolean J = true;
    public int K = 0;
    public b0 L;
    public InputStream M;

    public ih0(a1 a1Var) {
        this.I = a1Var;
    }

    public final b0 e() {
        a1 a1Var = this.I;
        int read = ((jj2) a1Var.e).read();
        e0 e = read < 0 ? null : a1Var.e(read);
        if (e == null) {
            return null;
        }
        if (!(e instanceof b0)) {
            zl1.f(e.getClass(), "unknown object encountered: ");
            return null;
        }
        if (this.K == 0) {
            return (b0) e;
        }
        zl1.g("only the last nested bitstring can have padding");
        return null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        if (this.M == null) {
            if (!this.J) {
                return -1;
            }
            b0 e = e();
            this.L = e;
            if (e == null) {
                return -1;
            }
            this.J = false;
            this.M = e.f();
        }
        while (true) {
            int read = this.M.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                this.K = this.L.h();
                b0 e2 = e();
                this.L = e2;
                if (e2 == null) {
                    this.M = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.M = e2.f();
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.M == null) {
            if (this.J) {
                b0 e = e();
                this.L = e;
                if (e != null) {
                    this.J = false;
                    this.M = e.f();
                }
            }
            return -1;
        }
        while (true) {
            int read = this.M.read();
            if (read >= 0) {
                return read;
            }
            this.K = this.L.h();
            b0 e2 = e();
            this.L = e2;
            if (e2 == null) {
                this.M = null;
                return -1;
            }
            this.M = e2.f();
        }
    }
}
