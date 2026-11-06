package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class j92 {
    public final i92 a;
    public final byte[] b;
    public final byte[] c;

    public j92(i92 i92Var, byte[] bArr, byte[] bArr2) {
        this.a = i92Var;
        this.b = bArr;
        this.c = bArr2;
    }

    public static j92 a(Object obj) {
        if (obj instanceof j92) {
            return (j92) obj;
        }
        DataInputStream dataInputStream = null;
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            int readInt = dataInputStream2.readInt();
            i92 i92Var = (i92) i92.g.get(Integer.valueOf(readInt));
            if (i92Var == null) {
                zl1.g(hf1.u(readInt, "unknown LM-OTS type code: "));
                return null;
            }
            int i = i92Var.b;
            byte[] bArr = new byte[i];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[i92Var.d * i];
            dataInputStream2.readFully(bArr2);
            return new j92(i92Var, bArr, bArr2);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return a(fb4.P((InputStream) obj));
            }
            hn3.i(obj, "cannot parse ");
            return null;
        }
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                j92 a = a(dataInputStream3);
                dataInputStream3.close();
                return a;
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
        if (obj != null && j92.class == obj.getClass()) {
            j92 j92Var = (j92) obj;
            if (this.a == j92Var.a && Arrays.equals(this.b, j92Var.b)) {
                return Arrays.equals(this.c, j92Var.c);
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31);
    }
}
