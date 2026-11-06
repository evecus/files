package defpackage;

import java.io.InputStream;

/* loaded from: classes2.dex */
public final class az1 extends jj2 {
    public int K;
    public int L;
    public boolean M;
    public boolean N;

    public az1(InputStream inputStream, int i) {
        super(inputStream, i);
        this.M = false;
        this.N = true;
        this.K = inputStream.read();
        int read = inputStream.read();
        this.L = read;
        if (read >= 0) {
            g();
        } else {
            zy.c();
            throw null;
        }
    }

    public final boolean g() {
        if (!this.M && this.N && this.K == 0 && this.L == 0) {
            this.M = true;
            e();
        }
        return this.M;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.N || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.M) {
            return -1;
        }
        InputStream inputStream = this.I;
        int read = inputStream.read(bArr, i + 2, i2 - 2);
        if (read < 0) {
            zy.c();
            return 0;
        }
        bArr[i] = (byte) this.K;
        bArr[i + 1] = (byte) this.L;
        this.K = inputStream.read();
        int read2 = inputStream.read();
        this.L = read2;
        if (read2 >= 0) {
            return read + 2;
        }
        zy.c();
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (g()) {
            return -1;
        }
        int read = this.I.read();
        if (read < 0) {
            zy.c();
            return 0;
        }
        int i = this.K;
        this.K = this.L;
        this.L = read;
        return i;
    }
}
