package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class al0 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Q = AtomicIntegerFieldUpdater.newUpdater(al0.class, "workerCtl$volatile");
    public static final /* synthetic */ long R = gq.a.objectFieldOffset(al0.class.getDeclaredField("workerCtl$volatile"));
    public final ey5 I;
    public final r24 J;
    public bl0 K;
    public long L;
    public long M;
    public int N;
    public boolean O;
    public final /* synthetic */ cl0 P;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public al0(cl0 cl0Var, int i) {
        this.P = cl0Var;
        setDaemon(true);
        setContextClassLoader(cl0.class.getClassLoader());
        this.I = new ey5();
        this.J = new r24();
        this.K = bl0.L;
        this.nextParkedWorker = cl0.S;
        int nanoTime = (int) System.nanoTime();
        this.N = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.b25 a(boolean r12) {
        /*
            r11 = this;
            bl0 r0 = r11.K
            cl0 r2 = r11.P
            r7 = 0
            r8 = 1
            ey5 r9 = r11.I
            bl0 r10 = defpackage.bl0.I
            if (r0 != r10) goto Le
            goto L84
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.cl0.Q
        L10:
            long r3 = r0.get(r2)
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r1 = 42
            long r5 = r5 >> r1
            int r1 = (int) r5
            if (r1 != 0) goto L73
            r9.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = defpackage.ey5.b
            sun.misc.Unsafe r12 = defpackage.gq.a
            long r0 = defpackage.ey5.g
            java.lang.Object r0 = r12.getObjectVolatile(r9, r0)
            b25 r0 = (defpackage.b25) r0
            if (r0 != 0) goto L32
            goto L3e
        L32:
            boolean r1 = r0.J
            if (r1 != r8) goto L3e
            boolean r12 = defpackage.nt3.q(r9, r0)
            if (r12 == 0) goto L23
            r7 = r0
            goto L60
        L3e:
            long r0 = defpackage.ey5.f
            int r0 = r12.getIntVolatile(r9, r0)
            long r3 = defpackage.ey5.h
            int r12 = r12.getIntVolatile(r9, r3)
        L4a:
            if (r0 == r12) goto L60
            sun.misc.Unsafe r1 = defpackage.gq.a
            long r3 = defpackage.ey5.e
            int r1 = r1.getIntVolatile(r9, r3)
            if (r1 != 0) goto L57
            goto L60
        L57:
            int r12 = r12 + (-1)
            b25 r1 = r9.d(r12, r8)
            if (r1 == 0) goto L4a
            r7 = r1
        L60:
            if (r7 != 0) goto L72
            wq1 r12 = r2.N
            java.lang.Object r12 = r12.c()
            b25 r12 = (defpackage.b25) r12
            if (r12 != 0) goto L71
            b25 r11 = r11.i(r8)
            return r11
        L71:
            return r12
        L72:
            return r7
        L73:
            r5 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r5 = r3 - r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.cl0.Q
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L10
            r11.K = r10
        L84:
            if (r12 == 0) goto Lb8
            int r12 = r2.I
            int r12 = r12 * 2
            int r12 = r11.d(r12)
            if (r12 != 0) goto L91
            goto L92
        L91:
            r8 = 0
        L92:
            if (r8 == 0) goto L9b
            b25 r12 = r11.e()
            if (r12 == 0) goto L9b
            return r12
        L9b:
            r9.getClass()
            long r0 = defpackage.ey5.g
            java.lang.Object r12 = defpackage.gq.a(r9, r0, r7)
            b25 r12 = (defpackage.b25) r12
            if (r12 != 0) goto Lac
            b25 r12 = r9.c()
        Lac:
            if (r12 == 0) goto Laf
            return r12
        Laf:
            if (r8 != 0) goto Lbf
            b25 r12 = r11.e()
            if (r12 == 0) goto Lbf
            return r12
        Lb8:
            b25 r12 = r11.e()
            if (r12 == 0) goto Lbf
            return r12
        Lbf:
            r12 = 3
            b25 r11 = r11.i(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al0.a(boolean):b25");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.N;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.N = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final b25 e() {
        int d = d(2);
        cl0 cl0Var = this.P;
        wq1 wq1Var = cl0Var.N;
        wq1 wq1Var2 = cl0Var.M;
        if (d == 0) {
            b25 b25Var = (b25) wq1Var2.c();
            return b25Var != null ? b25Var : (b25) wq1Var.c();
        }
        b25 b25Var2 = (b25) wq1Var.c();
        return b25Var2 != null ? b25Var2 : (b25) wq1Var2.c();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.P.L);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(bl0 bl0Var) {
        bl0 bl0Var2 = this.K;
        boolean z = bl0Var2 == bl0.I;
        if (z) {
            cl0.Q.addAndGet(this.P, 4398046511104L);
        }
        if (bl0Var2 != bl0Var) {
            this.K = bl0Var;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0072, code lost:
    
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.b25 i(int r29) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al0.i(int):b25");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al0.run():void");
    }
}
