package defpackage;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rb1 extends MediaDataSource {
    public long I;
    public final /* synthetic */ wb1 J;

    public rb1(wb1 wb1Var) {
        this.J = wb1Var;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        wb1 wb1Var = this.J;
        DataInputStream dataInputStream = wb1Var.I;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.I;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + dataInputStream.available()) {
                        wb1Var.g(j);
                        this.I = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int read = wb1Var.read(bArr, i, i2);
                if (read >= 0) {
                    this.I += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.I = -1L;
            return -1;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
