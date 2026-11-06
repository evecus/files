package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class iq3 {
    public final int a;
    public final rm1 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final eg0[] f;
    public final ij4 g;
    public final h60 h;

    public iq3(int i, rm1 rm1Var) {
        this.a = i;
        this.b = rm1Var;
        this.f = new eg0[i];
        int i2 = jj4.a;
        this.g = new ij4(i);
        h60 h60Var = new h60((byte) 0);
        if (i < 1) {
            s83.t("capacity must be >= 1");
            throw null;
        }
        if (i > 1073741824) {
            s83.t("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        h60Var.d = i - 1;
        h60Var.e = new Object[i];
        this.h = h60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[Catch: all -> 0x008e, TryCatch #1 {all -> 0x008e, blocks: (B:13:0x0047, B:15:0x004b, B:17:0x0051, B:20:0x0058, B:21:0x0072, B:23:0x0078, B:27:0x0090, B:28:0x0095, B:29:0x0096, B:30:0x009d), top: B:12:0x0047, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096 A[Catch: all -> 0x008e, TryCatch #1 {all -> 0x008e, blocks: (B:13:0x0047, B:15:0x004b, B:17:0x0051, B:20:0x0058, B:21:0x0072, B:23:0x0078, B:27:0x0090, B:28:0x0095, B:29:0x0096, B:30:0x009d), top: B:12:0x0047, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.gj0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.hq3
            if (r0 == 0) goto L13
            r0 = r8
            hq3 r0 = (defpackage.hq3) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            hq3 r0 = new hq3
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.J
            int r1 = r0.L
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            iq3 r7 = r0.I
            defpackage.mu0.V(r8)
            goto L40
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            return r2
        L2e:
            defpackage.mu0.V(r8)
            r0.I = r7
            r0.L = r3
            ij4 r8 = r7.g
            java.lang.Object r8 = r8.a(r0)
            el0 r0 = defpackage.el0.I
            if (r8 != r0) goto L40
            return r0
        L40:
            java.util.concurrent.locks.ReentrantLock r8 = r7.c     // Catch: java.lang.Throwable -> L8c
            h60 r0 = r7.h     // Catch: java.lang.Throwable -> L8c
            r8.lock()     // Catch: java.lang.Throwable -> L8c
            boolean r1 = r7.e     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L96
            int r1 = r0.b     // Catch: java.lang.Throwable -> L8e
            int r4 = r0.c     // Catch: java.lang.Throwable -> L8e
            if (r1 != r4) goto L72
            int r1 = r7.d     // Catch: java.lang.Throwable -> L8e
            int r4 = r7.a     // Catch: java.lang.Throwable -> L8e
            if (r1 < r4) goto L58
            goto L72
        L58:
            eg0 r1 = new eg0     // Catch: java.lang.Throwable -> L8e
            rm1 r4 = r7.b     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L8e
            o84 r4 = (defpackage.o84) r4     // Catch: java.lang.Throwable -> L8e
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L8e
            eg0[] r4 = r7.f     // Catch: java.lang.Throwable -> L8e
            int r5 = r7.d     // Catch: java.lang.Throwable -> L8e
            int r6 = r5 + 1
            r7.d = r6     // Catch: java.lang.Throwable -> L8e
            r4[r5] = r1     // Catch: java.lang.Throwable -> L8e
            r0.a(r1)     // Catch: java.lang.Throwable -> L8e
        L72:
            int r1 = r0.b     // Catch: java.lang.Throwable -> L8e
            int r4 = r0.c     // Catch: java.lang.Throwable -> L8e
            if (r1 == r4) goto L90
            java.lang.Object r4 = r0.e     // Catch: java.lang.Throwable -> L8e
            java.lang.Object[] r4 = (java.lang.Object[]) r4     // Catch: java.lang.Throwable -> L8e
            r5 = r4[r1]     // Catch: java.lang.Throwable -> L8e
            r4[r1] = r2     // Catch: java.lang.Throwable -> L8e
            int r1 = r1 + r3
            int r2 = r0.d     // Catch: java.lang.Throwable -> L8e
            r1 = r1 & r2
            r0.b = r1     // Catch: java.lang.Throwable -> L8e
            eg0 r5 = (defpackage.eg0) r5     // Catch: java.lang.Throwable -> L8e
            r8.unlock()     // Catch: java.lang.Throwable -> L8c
            return r5
        L8c:
            r8 = move-exception
            goto La2
        L8e:
            r0 = move-exception
            goto L9e
        L90:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L8e
            r0.<init>()     // Catch: java.lang.Throwable -> L8e
            throw r0     // Catch: java.lang.Throwable -> L8e
        L96:
            java.lang.String r0 = "Connection pool is closed"
            r1 = 21
            defpackage.lq2.l0(r1, r0)     // Catch: java.lang.Throwable -> L8e
            throw r2     // Catch: java.lang.Throwable -> L8e
        L9e:
            r8.unlock()     // Catch: java.lang.Throwable -> L8c
            throw r0     // Catch: java.lang.Throwable -> L8c
        La2:
            ij4 r7 = r7.g
            r7.c()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iq3.a(gj0):java.lang.Object");
    }

    public final void b() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (eg0 eg0Var : this.f) {
                if (eg0Var != null) {
                    eg0Var.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c(StringBuilder sb) {
        h60 h60Var = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            mk2 K = p70.K();
            int i = (h60Var.c - h60Var.b) & h60Var.d;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 >= 0) {
                    int i3 = h60Var.c;
                    int i4 = h60Var.b;
                    int i5 = h60Var.d;
                    if (i2 < ((i3 - i4) & i5)) {
                        Object obj = ((Object[]) h60Var.e)[(i4 + i2) & i5];
                        obj.getClass();
                        K.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            mk2 D = p70.D(K);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            sb.append("permits=" + Math.max(gq.a.getIntVolatile(this.g, hj4.N), 0) + ", ");
            sb.append("queue=(size=" + D.c() + ")[" + o70.Z0(D, null, null, null, 0, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            eg0[] eg0VarArr = this.f;
            int length = eg0VarArr.length;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                eg0 eg0Var = eg0VarArr[i7];
                i6++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i6);
                sb2.append("] - ");
                sb2.append(eg0Var != null ? eg0Var.I.toString() : null);
                sb.append(sb2.toString());
                sb.append('\n');
                if (eg0Var != null) {
                    eg0Var.n(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(eg0 eg0Var) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.a(eg0Var);
            reentrantLock.unlock();
            this.g.c();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
