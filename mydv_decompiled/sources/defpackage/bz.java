package defpackage;

import java.io.InputStream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bz extends InputStream {
    public final /* synthetic */ cz I;

    public bz(cz czVar) {
        this.I = czVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.I.J, 2147483647L);
    }

    @Override // java.io.InputStream
    public final int read() {
        cz czVar = this.I;
        if (czVar.J > 0) {
            return czVar.readByte() & 255;
        }
        return -1;
    }

    public final String toString() {
        return this.I + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        return this.I.read(bArr, i, i2);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
