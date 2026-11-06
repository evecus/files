package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.WeakHashMap;
import javax.security.auth.Destroyable;

/* loaded from: classes2.dex */
public final class m92 extends k92 implements Destroyable {
    public static final l92 T;
    public static final l92[] U;
    public final byte[] J;
    public final p92 K;
    public final i92 L;
    public final int M;
    public final byte[] N;
    public final WeakHashMap O;
    public final int P;
    public int Q;
    public volatile boolean R;
    public n92 S;

    static {
        l92 l92Var = new l92(1);
        T = l92Var;
        l92[] l92VarArr = new l92[64];
        U = l92VarArr;
        l92VarArr[1] = l92Var;
        int i = 2;
        while (true) {
            l92[] l92VarArr2 = U;
            if (i >= l92VarArr2.length) {
                return;
            }
            l92VarArr2[i] = new l92(i);
            i++;
        }
    }

    public m92(p92 p92Var, i92 i92Var, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(true);
        byte b = p92Var.c;
        byte b2 = p92Var.b;
        if (bArr == null || bArr.length != 16) {
            s83.t("LMS key identifier I must be 16 bytes");
            throw null;
        }
        if (bArr2.length < b2) {
            s83.t(hf1.u(b2, "master secret is less than "));
            throw null;
        }
        int i3 = 1 << b;
        if (i < 0 || i2 < 0 || i2 > i3 || i > i2) {
            StringBuilder D = hf1.D("LMS private key q/maxQ out of range: q=", i, " maxQ=", i2, " 2^h=");
            D.append(i3);
            throw new IllegalArgumentException(D.toString());
        }
        this.K = p92Var;
        this.L = i92Var;
        this.Q = i;
        this.J = g4.s(bArr);
        this.M = i2;
        this.N = g4.s(bArr2);
        this.P = 1 << (b + 1);
        this.O = new WeakHashMap();
    }

    public static m92 i(Object obj) {
        if (obj instanceof m92) {
            return (m92) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            m92 k = k(dataInputStream);
            if (dataInputStream.available() > 0) {
                l(dataInputStream, k);
            }
            return k;
        }
        DataInputStream dataInputStream2 = null;
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return i(fb4.P((InputStream) obj));
            }
            hn3.i(obj, "cannot parse ");
            return null;
        }
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                m92 i = i(dataInputStream3);
                dataInputStream3.close();
                return i;
            } catch (Throwable th) {
                th = th;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static m92 k(DataInputStream dataInputStream) {
        if (dataInputStream.readInt() != 0) {
            zl1.g("expected version 0 lms private key");
            return null;
        }
        int readInt = dataInputStream.readInt();
        p92 p92Var = (p92) p92.e.get(Integer.valueOf(readInt));
        if (p92Var == null) {
            zl1.g(hf1.u(readInt, "unknown LMS type code: "));
            return null;
        }
        byte b = p92Var.b;
        int readInt2 = dataInputStream.readInt();
        i92 i92Var = (i92) i92.g.get(Integer.valueOf(readInt2));
        if (i92Var == null) {
            zl1.g(hf1.u(readInt2, "unknown LM-OTS type code: "));
            return null;
        }
        byte[] bArr = new byte[16];
        dataInputStream.readFully(bArr);
        int readInt3 = dataInputStream.readInt();
        int readInt4 = dataInputStream.readInt();
        int i = 1 << p92Var.c;
        if (readInt3 < 0 || readInt4 < 0 || readInt4 > i || readInt3 > readInt4) {
            StringBuilder D = hf1.D("LMS private key q/maxQ out of range: q=", readInt3, " maxQ=", readInt4, " 2^h=");
            D.append(i);
            throw new IOException(D.toString());
        }
        int readInt5 = dataInputStream.readInt();
        if (readInt5 < b) {
            zl1.g(r7.x(b, readInt5, "secret length less than ", ": "));
            return null;
        }
        if (readInt5 > dataInputStream.available()) {
            or0.d(dataInputStream.available(), "secret length exceeded ");
            return null;
        }
        byte[] bArr2 = new byte[readInt5];
        dataInputStream.readFully(bArr2);
        return new m92(p92Var, i92Var, readInt3, bArr, readInt4, bArr2);
    }

    public static void l(DataInputStream dataInputStream, m92 m92Var) {
        int readInt = dataInputStream.readInt();
        if (readInt < 0 || readInt >= 64) {
            zl1.g(hf1.u(readInt, "tree cache node count out of range: "));
            return;
        }
        if (readInt != 0 && (readInt < 3 || ((readInt + 1) & readInt) != 0)) {
            zl1.g(hf1.u(readInt, "tree cache node count is not a complete top of tree: "));
            return;
        }
        int i = m92Var.K.b;
        if (readInt * i > dataInputStream.available()) {
            or0.d(dataInputStream.available(), "tree cache length exceeded ");
            return;
        }
        int i2 = readInt + 1;
        byte[][] bArr = new byte[i2][];
        for (int i3 = 1; i3 <= readInt; i3++) {
            byte[] bArr2 = new byte[i];
            bArr[i3] = bArr2;
            dataInputStream.readFully(bArr2);
        }
        p92 p92Var = m92Var.K;
        int i4 = 1 << p92Var.c;
        xw0 q = d4.q(p92Var.d, p92Var.b);
        for (int i5 = 1; i5 < i4; i5++) {
            int i6 = i5 * 2;
            int i7 = i6 + 1;
            if (i7 > readInt) {
                break;
            }
            byte[] bArr3 = m92Var.J;
            byte[] bArr4 = bArr[i6];
            byte[] bArr5 = bArr[i7];
            q.update(bArr3, 0, bArr3.length);
            dq2.U0(i5, q);
            q.b((byte) -125);
            q.b((byte) -125);
            q.update(bArr4, 0, bArr4.length);
            q.update(bArr5, 0, bArr5.length);
            byte[] bArr6 = new byte[q.d()];
            q.a(0, bArr6);
            if (!Arrays.equals(bArr6, bArr[i5])) {
                zl1.g(hf1.u(i5, "LMS private key tree cache inconsistent at node "));
                return;
            }
        }
        synchronized (m92Var.O) {
            for (int i8 = 1; i8 < i2; i8++) {
                try {
                    byte[] bArr7 = bArr[i8];
                    if (bArr7 != null) {
                        m92Var.O.put(U[i8], bArr7);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final byte[] c(int i) {
        byte[] bArr;
        byte b;
        byte b2;
        byte b3;
        byte b4;
        xw0 q;
        ByteArrayOutputStream byteArrayOutputStream;
        p92 p92Var = this.K;
        xw0 q2 = d4.q(p92Var.d, p92Var.b);
        int i2 = 1 << p92Var.c;
        byte[] bArr2 = this.J;
        if (i < i2) {
            int i3 = i * 2;
            byte[] e = e(i3);
            byte[] e2 = e(i3 + 1);
            q2.update(bArr2, 0, bArr2.length);
            dq2.U0(i, q2);
            q2.b((byte) -125);
            q2.b((byte) -125);
            q2.update(e, 0, e.length);
            q2.update(e2, 0, e2.length);
            byte[] bArr3 = new byte[q2.d()];
            q2.a(0, bArr3);
            return bArr3;
        }
        d();
        i92 i92Var = this.L;
        byte b5 = i92Var.b;
        q0 q0Var = i92Var.f;
        int i4 = i - i2;
        xw0 q3 = d4.q(q0Var, b5);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream2.write(bArr2);
            b = (byte) (i4 >>> 24);
            byteArrayOutputStream2.write(b);
            b2 = (byte) (i4 >>> 16);
            byteArrayOutputStream2.write(b2);
            b3 = (byte) (i4 >>> 8);
            byteArrayOutputStream2.write(b3);
            b4 = (byte) i4;
            byteArrayOutputStream2.write(b4);
            bArr = null;
            byteArrayOutputStream2.write(-128);
            byteArrayOutputStream2.write(-128);
            while (byteArrayOutputStream2.size() < 22) {
                byteArrayOutputStream2.write(0);
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            q3.update(byteArray, 0, byteArray.length);
            q = d4.q(q0Var, b5);
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Exception e3) {
            e = e3;
            bArr = null;
        }
        try {
            byteArrayOutputStream.write(bArr2);
            byteArrayOutputStream.write(b);
            byteArrayOutputStream.write(b2);
            byteArrayOutputStream.write(b3);
            byteArrayOutputStream.write(b4);
            int d = q.d() + 23;
            while (byteArrayOutputStream.size() < d) {
                byteArrayOutputStream.write(0);
            }
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            gg ggVar = new gg(bArr2, this.N, d4.q(q0Var, b5));
            ggVar.a = i4;
            ggVar.b = 0;
            short s = i92Var.d;
            int i5 = (1 << i92Var.c) - 1;
            int i6 = 0;
            while (i6 < s) {
                ggVar.a(byteArray2, 23, i6 < s + (-1));
                short s2 = (short) i6;
                byteArray2[20] = (byte) (s2 >>> 8);
                byteArray2[21] = (byte) s2;
                for (int i7 = 0; i7 < i5; i7++) {
                    byteArray2[22] = (byte) i7;
                    q.update(byteArray2, 0, byteArray2.length);
                    q.a(23, byteArray2);
                }
                q3.update(byteArray2, 23, b5);
                i6++;
            }
            int d2 = q3.d();
            byte[] bArr4 = new byte[d2];
            q3.a(0, bArr4);
            q2.update(bArr2, 0, bArr2.length);
            dq2.U0(i, q2);
            q2.b((byte) -126);
            q2.b((byte) -126);
            q2.update(bArr4, 0, d2);
            byte[] bArr5 = new byte[q2.d()];
            q2.a(0, bArr5);
            return bArr5;
        } catch (Exception e4) {
            e = e4;
            s83.p(e.getMessage(), e);
            return bArr;
        }
    }

    public final void d() {
        if (this.R) {
            zy.i("key destroyed");
        }
    }

    @Override // javax.security.auth.Destroyable
    public final synchronized void destroy() {
        if (!this.R) {
            this.R = true;
            g4.q(this.N);
        }
    }

    public final byte[] e(int i) {
        if (i < this.P) {
            return f(i < 64 ? U[i] : new l92(i));
        }
        return c(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m92.class != obj.getClass()) {
            return false;
        }
        m92 m92Var = (m92) obj;
        return !this.R && !m92Var.R && h() == m92Var.h() && this.M == m92Var.M && Arrays.equals(this.J, m92Var.J) && il2.j(this.K, m92Var.K) && il2.j(this.L, m92Var.L) && g4.w(this.N, m92Var.N);
    }

    public final byte[] f(l92 l92Var) {
        synchronized (this.O) {
            try {
                byte[] bArr = (byte[]) this.O.get(l92Var);
                if (bArr != null) {
                    return bArr;
                }
                byte[] c = c(l92Var.a);
                this.O.put(l92Var, c);
                return c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final byte[] g() {
        d();
        int h = h();
        int min = Math.min(64, this.P);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        k92.b(0, byteArrayOutputStream);
        k92.b(this.K.a, byteArrayOutputStream);
        k92.b(this.L.a, byteArrayOutputStream);
        k92.a(this.J, byteArrayOutputStream);
        k92.b(h, byteArrayOutputStream);
        k92.b(this.M, byteArrayOutputStream);
        byte[] bArr = this.N;
        k92.b(bArr.length, byteArrayOutputStream);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
        k92.b(min - 1, byteArrayOutputStream);
        for (int i = 1; i < min; i++) {
            byte[] e = e(i);
            byteArrayOutputStream.write(e, 0, e.length);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final synchronized int h() {
        return this.Q;
    }

    public final int hashCode() {
        return g4.N(this.J) + ((((this.L.hashCode() + (this.K.hashCode() * 31)) * 31) + this.M) * 31);
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.R;
    }

    public final n92 j() {
        n92 n92Var;
        synchronized (this) {
            try {
                n92Var = this.S;
                if (n92Var == null) {
                    n92Var = new n92(this.K, this.L, f(T), this.J);
                    this.S = n92Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return n92Var;
    }

    public final synchronized m92 m(int i) {
        int i2;
        i2 = 1 << this.K.c;
        if (i < 0 || i > i2) {
            throw new IllegalArgumentException("LMS private key q out of range: q=" + i + " 2^h=" + i2);
        }
        return new m92(this, i, i2, this.P);
    }

    public m92(m92 m92Var, int i, int i2, int i3) {
        super(true);
        this.K = m92Var.K;
        this.L = m92Var.L;
        this.Q = i;
        this.J = m92Var.J;
        this.M = i2;
        this.N = m92Var.N;
        this.P = i3;
        this.O = m92Var.O;
        this.S = m92Var.S;
    }
}
