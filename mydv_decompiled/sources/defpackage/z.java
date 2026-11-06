package defpackage;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class z extends OutputStream {
    public final byte[] I;
    public int J = 1;

    public z(byte[] bArr) {
        this.I = bArr;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        System.arraycopy(bArr, i, this.I, this.J, i2);
        this.J += i2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.J;
        this.J = i2 + 1;
        this.I[i2] = (byte) i;
    }
}
