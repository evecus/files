package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class n92 extends k92 {
    public final p92 J;
    public final i92 K;
    public final byte[] L;
    public final byte[] M;

    public n92(p92 p92Var, i92 i92Var, byte[] bArr, byte[] bArr2) {
        super(false);
        this.J = p92Var;
        this.K = i92Var;
        this.L = g4.s(bArr2);
        this.M = g4.s(bArr);
    }

    public static n92 c(Object obj) {
        if (obj instanceof n92) {
            return (n92) obj;
        }
        DataInputStream dataInputStream = null;
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            int readInt = dataInputStream2.readInt();
            p92 p92Var = (p92) p92.e.get(Integer.valueOf(readInt));
            if (p92Var == null) {
                zl1.g(hf1.u(readInt, "unknown LMS type code: "));
                return null;
            }
            int readInt2 = dataInputStream2.readInt();
            i92 i92Var = (i92) i92.g.get(Integer.valueOf(readInt2));
            if (i92Var == null) {
                zl1.g(hf1.u(readInt2, "unknown LM-OTS type code: "));
                return null;
            }
            byte[] bArr = new byte[16];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[p92Var.b];
            dataInputStream2.readFully(bArr2);
            return new n92(p92Var, i92Var, bArr2, bArr);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return c(fb4.P((InputStream) obj));
            }
            hn3.i(obj, "cannot parse ");
            return null;
        }
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                n92 c = c(dataInputStream3);
                if (dataInputStream3.available() != 0) {
                    throw new IOException("unexpected data found after LMS public key");
                }
                dataInputStream3.close();
                return c;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n92.class == obj.getClass()) {
            n92 n92Var = (n92) obj;
            if (this.J == n92Var.J && this.K == n92Var.K && Arrays.equals(this.L, n92Var.L)) {
                return Arrays.equals(this.M, n92Var.M);
            }
        }
        return false;
    }

    public final int hashCode() {
        return g4.N(this.M) + ((g4.N(this.L) + ((this.K.hashCode() + (this.J.hashCode() * 31)) * 31)) * 31);
    }
}
