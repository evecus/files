package defpackage;

import java.io.EOFException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class nt0 extends jj2 {
    public static final byte[] M = new byte[0];
    public final long K;
    public long L;

    public nt0(InputStream inputStream, long j, int i) {
        super(inputStream, i);
        if (j <= 0) {
            if (j < 0) {
                s83.t("negative lengths not allowed");
                throw null;
            }
            e();
        }
        this.K = j;
        this.L = j;
    }

    public final int g() {
        long j = this.L;
        if (j <= 2147483647L) {
            return (int) j;
        }
        throw new IllegalStateException("definite-length too large for int: " + this.L);
    }

    public final void n(byte[] bArr) {
        long j = this.L;
        if (j == 0) {
            return;
        }
        eg5.i(j, this.J);
        long j2 = this.L;
        if (j2 > bArr.length) {
            s83.t("buffer length insufficient for data");
            return;
        }
        int i = (int) j2;
        int i2 = 0;
        while (i2 < i) {
            int read = this.I.read(bArr, i2, i - i2);
            if (read < 0) {
                break;
            } else {
                i2 += read;
            }
        }
        long j3 = j2 - i2;
        this.L = j3;
        if (j3 == 0) {
            e();
        } else {
            or0.e(this.K, this.L);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.L;
        if (j == 0) {
            return -1;
        }
        int read = this.I.read(bArr, i, (int) Math.min(i2, j));
        if (read < 0) {
            or0.e(this.K, this.L);
            return 0;
        }
        long j2 = this.L - read;
        this.L = j2;
        if (j2 == 0) {
            e();
        }
        return read;
    }

    public final byte[] t() {
        long j = this.L;
        if (j == 0) {
            return M;
        }
        eg5.i(j, this.J);
        int i = (int) this.L;
        if (i < 0) {
            s83.t("len cannot be negative");
            return null;
        }
        byte[] bArr = new byte[Math.min(i, 4096)];
        int i2 = 0;
        while (i2 < i) {
            if (i2 == bArr.length) {
                byte[] bArr2 = new byte[(int) Math.min(i, bArr.length * 8)];
                System.arraycopy(bArr, 0, bArr2, 0, i2);
                bArr = bArr2;
            }
            int read = read(bArr, i2, bArr.length - i2);
            if (read < 0) {
                throw new EOFException("premature end of stream");
            }
            i2 += read;
        }
        return bArr;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.L == 0) {
            return -1;
        }
        int read = this.I.read();
        if (read < 0) {
            or0.e(this.K, this.L);
            return 0;
        }
        long j = this.L - 1;
        this.L = j;
        if (j == 0) {
            e();
        }
        return read;
    }
}
