package defpackage;

import android.util.Log;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class sb1 extends InputStream implements DataInput {
    public final DataInputStream I;
    public int J;
    public ByteOrder K;
    public byte[] L;
    public final int M;

    public sb1(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.I = dataInputStream;
        dataInputStream.mark(0);
        this.J = 0;
        this.K = byteOrder;
        this.M = inputStream instanceof sb1 ? ((sb1) inputStream).M : -1;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.I.available();
    }

    public final void e(int i) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.I;
            int skip = (int) dataInputStream.skip(i3);
            if (skip <= 0) {
                if (this.L == null) {
                    this.L = new byte[8192];
                }
                skip = dataInputStream.read(this.L, 0, Math.min(8192, i3));
                if (skip == -1) {
                    throw new EOFException(r7.z("Reached EOF while skipping ", i, " bytes."));
                }
            }
            i2 += skip;
        }
        this.J += i2;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.J++;
        return this.I.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.J++;
        return this.I.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.J++;
        int read = this.I.read();
        if (read >= 0) {
            return (byte) read;
        }
        zy.c();
        return (byte) 0;
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.J += 2;
        return this.I.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.J += bArr.length;
        this.I.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.J += 4;
        DataInputStream dataInputStream = this.I;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            zy.c();
            return 0;
        }
        ByteOrder byteOrder = this.K;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        zl1.f(this.K, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.J += 8;
        DataInputStream dataInputStream = this.I;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            zy.c();
            return 0L;
        }
        ByteOrder byteOrder = this.K;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        zl1.f(this.K, "Invalid byte order: ");
        return 0L;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.J += 2;
        DataInputStream dataInputStream = this.I;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            zy.c();
            return (short) 0;
        }
        ByteOrder byteOrder = this.K;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        zl1.f(this.K, "Invalid byte order: ");
        return (short) 0;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.J += 2;
        return this.I.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.J++;
        return this.I.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.J += 2;
        DataInputStream dataInputStream = this.I;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            zy.c();
            return 0;
        }
        ByteOrder byteOrder = this.K;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        zl1.f(this.K, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        this.J += i2;
        this.I.readFully(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.I.read(bArr, i, i2);
        this.J += read;
        return read;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sb1(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sb1(byte[] r3) {
        /*
            r2 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r3)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r1 = 0
            r2.<init>(r0, r1)
            int r3 = r3.length
            r2.M = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sb1.<init>(byte[]):void");
    }
}
