package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o92 {
    public final int a;
    public final j92 b;
    public final p92 c;
    public final byte[][] d;

    public o92(int i, j92 j92Var, p92 p92Var, byte[][] bArr) {
        this.a = i;
        this.b = j92Var;
        this.c = p92Var;
        this.d = bArr;
    }

    public static o92 b(Object obj) {
        if (obj instanceof o92) {
            return (o92) obj;
        }
        DataInputStream dataInputStream = null;
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            int readInt = dataInputStream2.readInt();
            j92 a = j92.a(obj);
            int readInt2 = dataInputStream2.readInt();
            p92 p92Var = (p92) p92.e.get(Integer.valueOf(readInt2));
            if (p92Var == null) {
                zl1.g(hf1.u(readInt2, "unknown LMS type code: "));
                return null;
            }
            int i = p92Var.c;
            byte[][] bArr = new byte[i][];
            for (int i2 = 0; i2 < i; i2++) {
                byte[] bArr2 = new byte[p92Var.b];
                bArr[i2] = bArr2;
                dataInputStream2.readFully(bArr2);
            }
            return new o92(readInt, a, p92Var, bArr);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return b(fb4.P((InputStream) obj));
            }
            hn3.i(obj, "cannot parse ");
            return null;
        }
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                o92 b = b(dataInputStream3);
                if (dataInputStream3.available() != 0) {
                    throw new IOException("unexpected data found after LMS signature");
                }
                dataInputStream3.close();
                return b;
            } catch (Throwable th) {
                th = th;
                dataInputStream = dataInputStream3;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.a;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
        j92 j92Var = this.b;
        j92Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        byte b = j92Var.a.a;
        byteArrayOutputStream2.write(0);
        byteArrayOutputStream2.write(0);
        byteArrayOutputStream2.write(0);
        byteArrayOutputStream2.write(b);
        try {
            byteArrayOutputStream2.write(j92Var.b);
            try {
                byteArrayOutputStream2.write(j92Var.c);
                try {
                    byteArrayOutputStream.write(byteArrayOutputStream2.toByteArray());
                    byte b2 = this.c.a;
                    byteArrayOutputStream.write((byte) (b2 >>> 24));
                    byteArrayOutputStream.write((byte) (b2 >>> 16));
                    byteArrayOutputStream.write((byte) (b2 >>> 8));
                    byteArrayOutputStream.write(b2);
                    try {
                        for (byte[] bArr : this.d) {
                            byteArrayOutputStream.write(bArr);
                        }
                        return byteArrayOutputStream.toByteArray();
                    } catch (Exception e) {
                        s83.p(e.getMessage(), e);
                        return null;
                    }
                } catch (Exception e2) {
                    s83.p(e2.getMessage(), e2);
                    return null;
                }
            } catch (Exception e3) {
                s83.p(e3.getMessage(), e3);
                return null;
            }
        } catch (Exception e4) {
            s83.p(e4.getMessage(), e4);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o92.class == obj.getClass()) {
            o92 o92Var = (o92) obj;
            if (this.a == o92Var.a) {
                j92 j92Var = o92Var.b;
                j92 j92Var2 = this.b;
                if (j92Var2 == null ? j92Var == null : j92Var2.equals(j92Var)) {
                    if (this.c != o92Var.c) {
                        return false;
                    }
                    return Arrays.deepEquals(this.d, o92Var.d);
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        j92 j92Var = this.b;
        return Arrays.deepHashCode(this.d) + ((this.c.hashCode() + ((i + (j92Var != null ? j92Var.hashCode() : 0)) * 31)) * 31);
    }
}
