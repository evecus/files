package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class p72 extends ge1 {
    public final /* synthetic */ byte L;
    public final Closeable M;

    public /* synthetic */ p72(Closeable closeable, byte b) {
        this.L = b;
        this.M = closeable;
    }

    private final synchronized void A() {
        ((FileChannel) this.M).close();
    }

    private final synchronized int E(long j, byte[] bArr, int i, int i2) {
        bArr.getClass();
        ((RandomAccessFile) this.M).seek(j);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int read = ((RandomAccessFile) this.M).read(bArr, i, i2 - i3);
            if (read != -1) {
                i3 += read;
            } else if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    private final synchronized int F(long j, byte[] bArr, int i, int i2) {
        bArr.getClass();
        ((FileChannel) this.M).position(j);
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int read = ((FileChannel) this.M).read(wrap);
            if (read != -1) {
                i3 += read;
            } else if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    private final synchronized long K() {
        return ((RandomAccessFile) this.M).length();
    }

    private final synchronized long M() {
        return ((FileChannel) this.M).size();
    }

    private final synchronized void y() {
        ((RandomAccessFile) this.M).close();
    }

    @Override // defpackage.ge1
    public final synchronized void e() {
        switch (this.L) {
            case 0:
                y();
                break;
            default:
                A();
                break;
        }
    }

    @Override // defpackage.ge1
    public final synchronized int g(long j, byte[] bArr, int i, int i2) {
        switch (this.L) {
            case 0:
                return E(j, bArr, i, i2);
            default:
                return F(j, bArr, i, i2);
        }
    }

    @Override // defpackage.ge1
    public final synchronized long n() {
        switch (this.L) {
            case 0:
                return K();
            default:
                return M();
        }
    }
}
