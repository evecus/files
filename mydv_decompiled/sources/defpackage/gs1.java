package defpackage;

import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.security.auth.Destroyable;

/* loaded from: classes2.dex */
public final class gs1 extends k92 implements Destroyable {
    public final int J;
    public final boolean K;
    public List L;
    public List M;
    public final long N;
    public final long O;
    public volatile boolean P;

    public gs1(m92 m92Var, long j, long j2) {
        super(true);
        boolean z;
        boolean z2;
        this.O = 0L;
        this.J = 1;
        this.L = Collections.singletonList(m92Var);
        this.M = Collections.EMPTY_LIST;
        long j3 = j;
        this.O = j3;
        this.N = j2;
        this.K = false;
        List e = e();
        int size = e.size();
        long[] jArr = new long[size];
        synchronized (this) {
        }
        for (int size2 = e.size() - 1; size2 >= 0; size2--) {
            byte b = ((m92) e.get(size2)).K.c;
            jArr[size2] = ((1 << b) - 1) & j3;
            j3 >>>= b;
        }
        m92[] m92VarArr = (m92[]) e.toArray(new m92[e.size()]);
        List list = this.M;
        o92[] o92VarArr = (o92[]) list.toArray(new o92[list.size()]);
        m92 m92Var2 = (m92) e().get(0);
        if (size <= 1 ? jArr[0] != m92VarArr[0].h() : jArr[0] != m92VarArr[0].h() - 1) {
            m92VarArr[0] = m92Var2.m((int) jArr[0]);
            z = true;
        } else {
            z = false;
        }
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            m92 m92Var3 = m92VarArr[i2];
            i92 i92Var = m92Var3.L;
            byte[] s = g4.s(m92Var3.J);
            byte[] s2 = g4.s(m92Var3.N);
            m92Var3.d();
            m92[] m92VarArr2 = m92VarArr;
            int i3 = (int) jArr[i2];
            int i4 = i92Var.b;
            gg ggVar = new gg(s, s2, d4.q(i92Var.f, i4));
            ggVar.a = i3;
            ggVar.b = -2;
            byte[] bArr = new byte[i4];
            ggVar.a(bArr, 0, true);
            byte[] bArr2 = new byte[i4];
            ggVar.a(bArr2, 0, false);
            byte[] bArr3 = new byte[16];
            System.arraycopy(bArr2, 0, bArr3, 0, 16);
            byte[][] bArr4 = {bArr3, bArr};
            byte[] bArr5 = bArr4[0];
            byte[] bArr6 = bArr4[1];
            boolean z3 = i >= size + (-1) ? jArr[i] == ((long) m92VarArr2[i].h()) : jArr[i] == ((long) (m92VarArr2[i].h() - 1));
            if (Arrays.equals(bArr5, g4.s(m92VarArr2[i].J))) {
                m92 m92Var4 = m92VarArr2[i];
                byte[] s3 = g4.s(m92Var4.N);
                m92Var4.d();
                if (g4.w(bArr6, s3)) {
                    if (!z3) {
                        m92VarArr2[i] = m92VarArr2[i].m((int) jArr[i]);
                        z = true;
                    }
                    z2 = true;
                    i++;
                    m92VarArr = m92VarArr2;
                }
            }
            p92 p92Var = ((m92) e.get(i)).K;
            i92 i92Var2 = ((m92) e.get(i)).L;
            int i5 = (int) jArr[i];
            if (bArr6 == null || bArr6.length < p92Var.b) {
                hn3.g(p92Var.b, "root seed is less than ");
                throw null;
            }
            z2 = true;
            m92 m92Var5 = new m92(p92Var, i92Var2, i5, bArr5, 1 << p92Var.c, bArr6);
            m92VarArr2[i] = m92Var5;
            o92VarArr[i2] = f(m92VarArr2[i2], m92Var5.j());
            z = true;
            i++;
            m92VarArr = m92VarArr2;
        }
        m92[] m92VarArr3 = m92VarArr;
        if (z) {
            g(m92VarArr3, o92VarArr);
        }
    }

    public static gs1 d(Object obj) {
        int i;
        if (obj instanceof gs1) {
            return (gs1) obj;
        }
        DataInputStream dataInputStream = null;
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            int readInt = dataInputStream2.readInt();
            if (readInt != 0 && readInt != 1) {
                zl1.g("unknown version for hss private key");
                return null;
            }
            int readInt2 = dataInputStream2.readInt();
            if (readInt2 < 1 || readInt2 > 8) {
                zl1.g(hf1.u(readInt2, "d value of HSS private key out of range: "));
                return null;
            }
            long readLong = dataInputStream2.readLong();
            long readLong2 = dataInputStream2.readLong();
            if (readLong < 0 || readLong2 < 0 || readLong > readLong2) {
                StringBuilder A = hf1.A(readLong, "HSS private key index out of range: index=", " maxIndex=");
                A.append(readLong2);
                throw new IOException(A.toString());
            }
            boolean readBoolean = dataInputStream2.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            for (int i3 = 0; i3 < readInt2; i3++) {
                boolean z = readInt != 0;
                m92 k = m92.k(dataInputStream2);
                if (z) {
                    m92.l(dataInputStream2, k);
                }
                arrayList.add(k);
            }
            int i4 = 0;
            while (true) {
                i = readInt2 - 1;
                if (i4 >= i) {
                    break;
                }
                arrayList2.add(o92.b(obj));
                i4++;
            }
            long h = ((m92) arrayList.get(i)).h();
            int i5 = readInt2 - 2;
            while (true) {
                if (i5 >= 0) {
                    i2 += ((m92) arrayList.get(i5 + 1)).K.c;
                    if (i2 >= 63) {
                        break;
                    }
                    h += (((m92) arrayList.get(i5)).h() - 1) << i2;
                    i5--;
                } else if (h != readLong) {
                    StringBuilder A2 = hf1.A(readLong, "HSS private key index ", " does not match the component key indices, which imply ");
                    A2.append(h);
                    throw new IOException(A2.toString());
                }
            }
            return new gs1(readInt2, arrayList, arrayList2, readLong, readLong2, readBoolean);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return d(fb4.P((InputStream) obj));
            }
            hn3.i(obj, "cannot parse ");
            return null;
        }
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                try {
                    gs1 d = d(dataInputStream3);
                    dataInputStream3.close();
                    return d;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream3;
                    if (dataInputStream != null) {
                        dataInputStream.close();
                    }
                    throw th;
                }
            } catch (Exception e) {
                try {
                    gs1 gs1Var = new gs1(m92.i(obj), r5.h(), r5.M);
                    dataInputStream3.close();
                    return gs1Var;
                } catch (Exception unused) {
                    if (e instanceof RuntimeException) {
                        throw ((RuntimeException) e);
                    }
                    if (e instanceof IOException) {
                        throw ((IOException) e);
                    }
                    throw k21.Z(e.getMessage(), e);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static o92 f(m92 m92Var, n92 n92Var) {
        int i;
        byte[] bArr;
        p92 p92Var = m92Var.K;
        int i2 = p92Var.c;
        synchronized (m92Var) {
            m92Var.d();
            i = m92Var.Q;
            if (i >= m92Var.M) {
                throw new b70("ots private key exhausted");
            }
            m92Var.Q = i + 1;
        }
        int i3 = (1 << i2) + i;
        byte[][] bArr2 = new byte[i2][];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = m92Var.e((i3 / (1 << i4)) ^ 1);
        }
        i92 i92Var = m92Var.L;
        byte[] bArr3 = m92Var.J;
        byte[] bArr4 = m92Var.N;
        int i5 = i92Var.b;
        byte[] bArr5 = new byte[i5];
        gg ggVar = new gg(bArr3, bArr4, d4.q(i92Var.f, i5));
        ggVar.a = i;
        ggVar.b = -3;
        ggVar.a(bArr5, 0, false);
        xw0 q = d4.q(i92Var.f, i92Var.b);
        q.update(bArr3, 0, bArr3.length);
        dq2.U0(i, q);
        q.b((byte) -127);
        q.b((byte) -127);
        q.update(bArr5, 0, i5);
        n92Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        k92.b(n92Var.J.a, byteArrayOutputStream);
        k92.b(n92Var.K.a, byteArrayOutputStream);
        k92.a(n92Var.L, byteArrayOutputStream);
        k92.a(n92Var.M, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        q.update(byteArray, 0, byteArray.length);
        byte[] bArr6 = new byte[34];
        q.a(0, bArr6);
        byte b = i92Var.b;
        short s = i92Var.d;
        byte b2 = i92Var.c;
        byte[] bArr7 = new byte[s * b];
        xw0 q2 = d4.q(i92Var.f, b);
        gg ggVar2 = new gg(bArr3, bArr4, d4.q(i92Var.f, i92Var.b));
        ggVar2.a = i;
        int i6 = (1 << b2) - 1;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            bArr = bArr6;
            if (i7 >= (b * 8) / b2) {
                break;
            }
            i8 = (i8 + i6) - ((bArr[(i7 * b2) / 8] >>> (((~i7) & ((8 / b2) - 1)) * b2)) & i6);
            i7++;
            bArr6 = bArr;
        }
        int i9 = i8 << i92Var.e;
        bArr[b] = (byte) ((i9 >>> 8) & 255);
        bArr[b + 1] = (byte) i9;
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream2.write(bArr3);
            byteArrayOutputStream2.write((byte) (i >>> 24));
            byteArrayOutputStream2.write((byte) (i >>> 16));
            byteArrayOutputStream2.write((byte) (i >>> 8));
            byteArrayOutputStream2.write((byte) i);
            int i10 = b + 23;
            while (byteArrayOutputStream2.size() < i10) {
                byteArrayOutputStream2.write(0);
            }
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            ggVar2.b = 0;
            int i11 = 0;
            while (i11 < s) {
                short s2 = (short) i11;
                int i12 = i6;
                byteArray2[20] = (byte) (s2 >>> 8);
                byteArray2[21] = (byte) s2;
                ggVar2.a(byteArray2, 23, i11 < s + (-1));
                int i13 = 0;
                for (int i14 = (bArr[(i11 * b2) / 8] >>> (((~i11) & ((8 / b2) - 1)) * b2)) & i12; i13 < i14; i14 = i14) {
                    byteArray2[22] = (byte) i13;
                    q2.update(byteArray2, 0, i10);
                    q2.a(23, byteArray2);
                    i13++;
                }
                System.arraycopy(byteArray2, 23, bArr7, b * i11, b);
                i11++;
                i6 = i12;
            }
            return new o92(i, new j92(i92Var, bArr5, bArr7), p92Var, bArr2);
        } catch (Exception e) {
            s83.p(e.getMessage(), e);
            return null;
        }
    }

    public final synchronized byte[] c() {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            if (this.P) {
                throw new IllegalStateException("key destroyed");
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            k92.b(1, byteArrayOutputStream);
            k92.b(this.J, byteArrayOutputStream);
            byte[] bArr = new byte[8];
            dq2.n0(bArr, 0, this.O);
            byteArrayOutputStream.write(bArr, 0, 8);
            byte[] bArr2 = new byte[8];
            dq2.n0(bArr2, 0, this.N);
            byteArrayOutputStream.write(bArr2, 0, 8);
            byteArrayOutputStream.write(this.K ? 1 : 0);
            Iterator it = this.L.iterator();
            while (it.hasNext()) {
                k92.a(((m92) it.next()).g(), byteArrayOutputStream);
            }
            Iterator it2 = this.M.iterator();
            while (it2.hasNext()) {
                k92.a(((o92) it2.next()).a(), byteArrayOutputStream);
            }
        } catch (Throwable th) {
            throw th;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final Object clone() {
        try {
            return d(c());
        } catch (Exception e) {
            s83.p(e.getMessage(), e);
            return null;
        }
    }

    @Override // javax.security.auth.Destroyable
    public final synchronized void destroy() {
        if (!this.P) {
            this.P = true;
            Iterator it = this.L.iterator();
            while (it.hasNext()) {
                ((m92) it.next()).destroy();
            }
        }
    }

    public final synchronized List e() {
        return this.L;
    }

    public final boolean equals(Object obj) {
        long j;
        List list;
        List list2;
        long j2;
        List list3;
        List list4;
        if (this == obj) {
            return true;
        }
        if (obj == null || gs1.class != obj.getClass()) {
            return false;
        }
        gs1 gs1Var = (gs1) obj;
        if (this.J != gs1Var.J || this.K != gs1Var.K || this.N != gs1Var.N || this.P || gs1Var.P) {
            return false;
        }
        synchronized (this) {
            j = this.O;
            list = this.L;
            list2 = this.M;
        }
        synchronized (gs1Var) {
            j2 = gs1Var.O;
            list3 = gs1Var.L;
            list4 = gs1Var.M;
        }
        return j == j2 && list.equals(list3) && list2.equals(list4);
    }

    public final void g(m92[] m92VarArr, o92[] o92VarArr) {
        synchronized (this) {
            this.L = DesugarCollections.unmodifiableList(Arrays.asList(m92VarArr));
            this.M = DesugarCollections.unmodifiableList(Arrays.asList(o92VarArr));
        }
    }

    public final int hashCode() {
        int i = ((this.J * 31) + (this.K ? 1 : 0)) * 31;
        long j = this.N;
        return ((m92) e().get(0)).hashCode() + ((i + ((int) (j ^ (j >>> 32)))) * 31);
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.P;
    }

    public gs1(int i, ArrayList arrayList, ArrayList arrayList2, long j, long j2, boolean z) {
        super(true);
        this.O = 0L;
        this.J = i;
        this.L = DesugarCollections.unmodifiableList(arrayList);
        this.M = DesugarCollections.unmodifiableList(arrayList2);
        this.O = j;
        this.N = j2;
        this.K = z;
    }
}
