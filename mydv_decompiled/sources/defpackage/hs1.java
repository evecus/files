package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class hs1 extends k92 {
    public final int J;
    public final n92 K;

    public hs1(int i, n92 n92Var) {
        super(false);
        if (n92Var == null) {
            zy.m("lmsPublicKey");
            throw null;
        }
        this.J = i;
        this.K = n92Var;
    }

    public static hs1 c(Object obj) {
        if (obj instanceof hs1) {
            return (hs1) obj;
        }
        DataInputStream dataInputStream = null;
        if (obj instanceof DataInputStream) {
            int readInt = ((DataInputStream) obj).readInt();
            if (readInt >= 1 && readInt <= 8) {
                return new hs1(readInt, n92.c(obj));
            }
            zl1.g(hf1.u(readInt, "L value of HSS public key out of range: "));
            return null;
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return c(fb4.P((InputStream) obj));
            }
            hn3.i(obj, "cannot parse ");
            return null;
        }
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                hs1 c = c(dataInputStream2);
                if (dataInputStream2.available() != 0) {
                    throw new IOException("unexpected data found after HSS public key");
                }
                dataInputStream2.close();
                return c;
            } catch (Throwable th) {
                th = th;
                dataInputStream = dataInputStream2;
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
        if (obj == null || hs1.class != obj.getClass()) {
            return false;
        }
        hs1 hs1Var = (hs1) obj;
        if (this.J != hs1Var.J) {
            return false;
        }
        return this.K.equals(hs1Var.K);
    }

    public final int hashCode() {
        return this.K.hashCode() + (this.J * 31);
    }
}
