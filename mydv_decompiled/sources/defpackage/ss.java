package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class ss implements Serializable {
    public final TreeMap I = new TreeMap();
    public final transient long J;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
    
        if ((r23 % ((long) java.lang.Math.pow(r8, r5 + 1))) == 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ss(defpackage.k06 r26, long r27, byte[] r29, byte[] r30) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss.<init>(k06, long, byte[], byte[]):void");
    }

    public final void a() {
        synchronized (this) {
            try {
                Iterator it = this.I.values().iterator();
                while (it.hasNext()) {
                    mc3 mc3Var = ((qs) it.next()).I;
                    if (mc3Var != null) {
                        Arrays.fill((byte[]) mc3Var.c, (byte) 0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final qs b(int i) {
        qs qsVar;
        synchronized (this) {
            qsVar = (qs) this.I.get(Integer.valueOf(i));
        }
        return qsVar;
    }

    public final void c(int i, qs qsVar) {
        synchronized (this) {
            this.I.put(Integer.valueOf(i), qsVar);
        }
    }

    public final void d(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        synchronized (this) {
            TreeMap treeMap = this.I;
            Integer valueOf = Integer.valueOf(i);
            qs qsVar = (qs) this.I.get(Integer.valueOf(i));
            qs qsVar2 = new qs(qsVar, new mc3((yz) qsVar.I.a), qsVar.T, false);
            qsVar2.b(bArr, bArr2, bArr3);
        }
    }

    public final void e(k06 k06Var, long j) {
        synchronized (this) {
            try {
                long j2 = (1 << k06Var.b) - 1;
                long j3 = this.J;
                if (j3 < 0 || j3 > j2 || this.I.size() > k06Var.c) {
                    throw new IllegalStateException("BDS state map does not match XMSSMT parameters");
                }
                q06 q06Var = k06Var.a;
                for (Integer num : this.I.keySet()) {
                    if (num.intValue() < 0 || num.intValue() >= k06Var.c) {
                        throw new IllegalStateException("BDS state map has invalid layer");
                    }
                    qs qsVar = (qs) this.I.get(num);
                    if (qsVar == null) {
                        throw new IllegalStateException("BDS state map has null state");
                    }
                    qsVar.d(q06Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f(k06Var, j);
    }

    public final void f(k06 k06Var, long j) {
        synchronized (this) {
            try {
                int i = k06Var.a.a;
                int i2 = (1 << i) - 1;
                for (int i3 = 0; i3 < k06Var.c; i3++) {
                    int i4 = (int) (j & ((1 << i) - 1));
                    j >>= i;
                    qs qsVar = (qs) this.I.get(Integer.valueOf(i3));
                    if (qsVar != null) {
                        int i5 = qsVar.R;
                        if (i4 != 0) {
                            if (i5 != i4) {
                                throw new IllegalStateException("BDS state has wrong index for layer " + i3 + ": expected " + i4 + " but state is at " + i5);
                            }
                        } else if (i5 != 0 && i5 != i2) {
                            throw new IllegalStateException("BDS state has wrong index for layer " + i3 + ": expected " + i4 + " but state is at " + i5);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(k06 k06Var, byte[] bArr) {
        synchronized (this) {
            try {
                qs qsVar = (qs) this.I.get(Integer.valueOf(k06Var.c - 1));
                if (qsVar != null) {
                    qsVar.f(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ss h(long j, q0 q0Var, int i) {
        ss ssVar = new ss(j);
        synchronized (this) {
            try {
                for (Integer num : this.I.keySet()) {
                    TreeMap treeMap = ssVar.I;
                    qs qsVar = (qs) this.I.get(num);
                    qsVar.getClass();
                    treeMap.put(num, new qs(qsVar, q0Var, i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ssVar;
    }

    public ss(long j) {
        this.J = j;
    }
}
