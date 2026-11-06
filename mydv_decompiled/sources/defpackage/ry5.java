package defpackage;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class ry5 {
    public static final LinkedHashSet a(byte[] bArr) {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        Uri parse = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        parse.getClass();
                        linkedHashSet.add(new bh0(parse, readBoolean));
                    }
                    objectInputStream.close();
                } finally {
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } finally {
        }
    }

    public static Object b(byte[] bArr, Class cls, byte[] bArr2) {
        if (cls == qs.class || cls == ss.class) {
            qg5.L(bArr);
            int i = 0;
            if (bArr.length >= 4 && dq2.k(0, bArr) == 1111773952) {
                if (cls != qs.class) {
                    zl1.g("unexpected BDS state encoding");
                    return null;
                }
                qg5.L(bArr);
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr, 0, qg5.M(bArr, bArr2)));
                if (dataInputStream.readInt() != 1111773952) {
                    zl1.g("unexpected BDS state magic");
                    return null;
                }
                if (dataInputStream.readInt() != 1) {
                    zl1.g("unsupported BDS state version");
                    return null;
                }
                qs j0 = qg5.j0(dataInputStream, new rs((byte) 0));
                if (dataInputStream.available() == 0) {
                    return j0;
                }
                zl1.g("unexpected data at end of BDS state");
                return null;
            }
            if (bArr.length >= 4 && dq2.k(0, bArr) == 1111772416) {
                if (cls != ss.class) {
                    zl1.g("unexpected BDS state map encoding");
                    return null;
                }
                qg5.L(bArr);
                DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(bArr, 0, qg5.M(bArr, bArr2)));
                if (dataInputStream2.readInt() != 1111772416) {
                    zl1.g("unexpected BDS state magic");
                    return null;
                }
                if (dataInputStream2.readInt() != 1) {
                    zl1.g("unsupported BDS state version");
                    return null;
                }
                long readLong = dataInputStream2.readLong();
                if (readLong < 0) {
                    zl1.g("negative BDS state map maxIndex");
                    return null;
                }
                int m0 = qg5.m0(dataInputStream2, 64, "BDS state map");
                ss ssVar = new ss(readLong);
                rs rsVar = new rs((byte) 0);
                int i2 = -1;
                while (i < m0) {
                    int readInt = dataInputStream2.readInt();
                    if (readInt <= i2) {
                        zl1.g("invalid BDS state map layer");
                        return null;
                    }
                    ssVar.c(readInt, qg5.j0(dataInputStream2, rsVar));
                    i++;
                    i2 = readInt;
                }
                if (dataInputStream2.available() == 0) {
                    return ssVar;
                }
                zl1.g("unexpected data at end of BDS state");
                return null;
            }
        }
        w06 w06Var = new w06(cls, new ByteArrayInputStream(bArr));
        Object readObject = w06Var.readObject();
        if (w06Var.available() != 0) {
            zl1.g("unexpected data found at end of ObjectInputStream");
            return null;
        }
        if (cls.isInstance(readObject)) {
            return readObject;
        }
        zl1.g("unexpected class found in ObjectInputStream");
        return null;
    }

    public static final byte[] c(r93 r93Var) {
        int[] q1;
        int[] q12;
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest = (NetworkRequest) r93Var.a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                if (i >= 31) {
                    q1 = ub.x(networkRequest);
                } else {
                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < 10; i2++) {
                        int i3 = iArr[i2];
                        if (ck.C(networkRequest, i3)) {
                            arrayList.add(Integer.valueOf(i3));
                        }
                    }
                    q1 = o70.q1(arrayList);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    q12 = ub.c(networkRequest);
                } else {
                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                    ArrayList arrayList2 = new ArrayList();
                    for (int i4 = 0; i4 < 30; i4++) {
                        int i5 = iArr2[i4];
                        if (ck.B(networkRequest, i5)) {
                            arrayList2.add(Integer.valueOf(i5));
                        }
                    }
                    q12 = o70.q1(arrayList2);
                }
                objectOutputStream.writeInt(q1.length);
                for (int i6 : q1) {
                    objectOutputStream.writeInt(i6);
                }
                objectOutputStream.writeInt(q12.length);
                for (int i7 : q12) {
                    objectOutputStream.writeInt(i7);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final ut d(int i) {
        if (i == 0) {
            return ut.I;
        }
        if (i == 1) {
            return ut.J;
        }
        s83.t(r7.z("Could not convert ", i, " to BackoffPolicy"));
        return null;
    }

    public static final x93 e(int i) {
        if (i == 0) {
            return x93.I;
        }
        if (i == 1) {
            return x93.J;
        }
        if (i == 2) {
            return x93.K;
        }
        if (i == 3) {
            return x93.L;
        }
        if (i == 4) {
            return x93.M;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return x93.N;
        }
        s83.t(r7.z("Could not convert ", i, " to NetworkType"));
        return null;
    }

    public static final ug3 f(int i) {
        if (i == 0) {
            return ug3.I;
        }
        if (i == 1) {
            return ug3.J;
        }
        s83.t(r7.z("Could not convert ", i, " to OutOfQuotaPolicy"));
        return null;
    }

    public static final sx5 g(int i) {
        if (i == 0) {
            return sx5.I;
        }
        if (i == 1) {
            return sx5.J;
        }
        if (i == 2) {
            return sx5.K;
        }
        if (i == 3) {
            return sx5.L;
        }
        if (i == 4) {
            return sx5.M;
        }
        if (i == 5) {
            return sx5.N;
        }
        s83.t(r7.z("Could not convert ", i, " to State"));
        return null;
    }

    public static final int h(x93 x93Var) {
        int ordinal = x93Var.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && x93Var == x93.N) {
                            return 5;
                        }
                        hn3.h(x93Var, " to int", "Could not convert ");
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static byte[] i(Object obj, byte[] bArr) {
        TreeMap treeMap;
        if (obj instanceof qs) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(1111773952);
            dataOutputStream.writeInt(1);
            qg5.S0(dataOutputStream, (qs) obj);
            dataOutputStream.flush();
            int size = byteArrayOutputStream.size();
            byteArrayOutputStream.write(qg5.i, 0, 32);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            f84 f84Var = new f84();
            if (bArr != null) {
                f84Var.update(bArr, 0, bArr.length);
            }
            f84Var.update(byteArray, 0, size);
            f84Var.a(size, byteArray);
            qg5.L(byteArray);
            return byteArray;
        }
        if (!(obj instanceof ss)) {
            throw new IllegalArgumentException("unsupported BDS state type: ".concat(obj != null ? obj.getClass().getName() : "null"));
        }
        ss ssVar = (ss) obj;
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream2);
        dataOutputStream2.writeInt(1111772416);
        dataOutputStream2.writeInt(1);
        dataOutputStream2.writeLong(ssVar.J);
        synchronized (ssVar) {
            treeMap = new TreeMap((Map) ssVar.I);
        }
        if (treeMap.size() > 64) {
            zl1.g("too many BDS states");
            return null;
        }
        dataOutputStream2.writeInt(treeMap.size());
        for (Integer num : treeMap.keySet()) {
            dataOutputStream2.writeInt(num.intValue());
            qg5.S0(dataOutputStream2, (qs) treeMap.get(num));
        }
        dataOutputStream2.flush();
        int size2 = byteArrayOutputStream2.size();
        byteArrayOutputStream2.write(qg5.i, 0, 32);
        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
        f84 f84Var2 = new f84();
        if (bArr != null) {
            f84Var2.update(bArr, 0, bArr.length);
        }
        f84Var2.update(byteArray2, 0, size2);
        f84Var2.a(size2, byteArray2);
        qg5.L(byteArray2);
        return byteArray2;
    }

    public static final byte[] j(Set set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    bh0 bh0Var = (bh0) it.next();
                    objectOutputStream.writeUTF(bh0Var.a.toString());
                    objectOutputStream.writeBoolean(bh0Var.b);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int k(sx5 sx5Var) {
        sx5Var.getClass();
        int ordinal = sx5Var.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        s83.v();
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static final r93 l(byte[] bArr) {
        bArr.getClass();
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new r93(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                int[] iArr = new int[readInt];
                for (int i = 0; i < readInt; i++) {
                    iArr[i] = objectInputStream.readInt();
                }
                int readInt2 = objectInputStream.readInt();
                int[] iArr2 = new int[readInt2];
                for (int i2 = 0; i2 < readInt2; i2++) {
                    iArr2[i2] = objectInputStream.readInt();
                }
                r93 h = ck.h(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return h;
            } finally {
            }
        } finally {
        }
    }

    public static byte[] m(String str, int i, byte[] bArr) {
        if (bArr == null) {
            return new byte[i];
        }
        n(str, i, bArr);
        return bArr;
    }

    public static void n(String str, int i, byte[] bArr) {
        if (bArr.length == i) {
            return;
        }
        s83.t(r7.C("size of ", str, " needs to be equal to size of digest"));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0083 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(defpackage.gj0 r8) {
        /*
            tk0 r0 = r8.getContext()
            defpackage.vt0.p(r0)
            fj0 r8 = defpackage.mu0.G(r8)
            boolean r1 = r8 instanceof defpackage.nx0
            if (r1 == 0) goto L12
            nx0 r8 = (defpackage.nx0) r8
            goto L13
        L12:
            r8 = 0
        L13:
            el0 r1 = defpackage.el0.I
            wd5 r2 = defpackage.wd5.a
            if (r8 != 0) goto L1b
        L19:
            r8 = r2
            goto L81
        L1b:
            vk0 r3 = r8.L
            boolean r4 = defpackage.qb.e0(r3, r0)
            r5 = 1
            if (r4 == 0) goto L2c
            r8.N = r2
            r8.K = r5
            r3.dispatchYield(r0, r8)
            goto L65
        L2c:
            b16 r4 = new b16
            l95 r6 = defpackage.b16.J
            r4.<init>(r6)
            tk0 r0 = r0.plus(r4)
            r8.N = r2
            r8.K = r5
            r3.dispatchYield(r0, r8)
            boolean r0 = r4.I
            if (r0 == 0) goto L65
            eb1 r0 = defpackage.x65.a()
            pp r3 = r0.K
            if (r3 == 0) goto L4f
            boolean r3 = r3.isEmpty()
            goto L50
        L4f:
            r3 = r5
        L50:
            if (r3 == 0) goto L53
            goto L19
        L53:
            long r3 = r0.I
            r6 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 < 0) goto L67
            r8.N = r2
            r8.K = r5
            r0.b0(r8)
        L65:
            r8 = r1
            goto L81
        L67:
            r0.c0(r5)
            r8.run()     // Catch: java.lang.Throwable -> L77
        L6d:
            boolean r3 = r0.e0()     // Catch: java.lang.Throwable -> L77
            if (r3 != 0) goto L6d
        L73:
            r0.a0(r5)
            goto L19
        L77:
            r3 = move-exception
            r8.g(r3)     // Catch: java.lang.Throwable -> L7c
            goto L73
        L7c:
            r8 = move-exception
            r0.a0(r5)
            throw r8
        L81:
            if (r8 != r1) goto L84
            return r8
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry5.o(gj0):java.lang.Object");
    }
}
