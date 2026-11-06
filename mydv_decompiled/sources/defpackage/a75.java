package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class a75 {
    public static final /* synthetic */ long b = gq.a.objectFieldOffset(a75.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public hb1[] a;

    public final void a(hb1 hb1Var) {
        hb1Var.d((ib1) this);
        hb1[] hb1VarArr = this.a;
        if (hb1VarArr == null) {
            hb1VarArr = new hb1[4];
            this.a = hb1VarArr;
        } else if (b() >= hb1VarArr.length) {
            hb1VarArr = (hb1[]) Arrays.copyOf(hb1VarArr, b() * 2);
            this.a = hb1VarArr;
        }
        int b2 = b();
        gq.a.putIntVolatile(this, b, b2 + 1);
        hb1VarArr[b2] = hb1Var;
        hb1Var.J = b2;
        e(b2);
    }

    public final int b() {
        return gq.a.getIntVolatile(this, b);
    }

    public final void c(hb1 hb1Var) {
        synchronized (this) {
            if (hb1Var.b() != null) {
                d(hb1Var.J);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        if (r5.compareTo(r6) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hb1 d(int r8) {
        /*
            r7 = this;
            hb1[] r0 = r7.a
            r0.getClass()
            int r1 = r7.b()
            r2 = -1
            int r1 = r1 + r2
            sun.misc.Unsafe r3 = defpackage.gq.a
            long r4 = defpackage.a75.b
            r3.putIntVolatile(r7, r4, r1)
            int r1 = r7.b()
            if (r8 >= r1) goto L7c
            int r1 = r7.b()
            r7.f(r8, r1)
            int r1 = r8 + (-1)
            int r1 = r1 / 2
            if (r8 <= 0) goto L3c
            r3 = r0[r8]
            r3.getClass()
            r4 = r0[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3c
            r7.f(r8, r1)
            r7.e(r1)
            goto L7c
        L3c:
            int r1 = r8 * 2
            int r3 = r1 + 1
            int r4 = r7.b()
            if (r3 < r4) goto L47
            goto L7c
        L47:
            hb1[] r4 = r7.a
            r4.getClass()
            int r1 = r1 + 2
            int r5 = r7.b()
            if (r1 >= r5) goto L65
            r5 = r4[r1]
            r5.getClass()
            r6 = r4[r3]
            r6.getClass()
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L65
            goto L66
        L65:
            r1 = r3
        L66:
            r3 = r4[r8]
            r3.getClass()
            r4 = r4[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L77
            goto L7c
        L77:
            r7.f(r8, r1)
            r8 = r1
            goto L3c
        L7c:
            int r8 = r7.b()
            r8 = r0[r8]
            r8.getClass()
            r1 = 0
            r8.d(r1)
            r8.J = r2
            int r7 = r7.b()
            r0[r7] = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a75.d(int):hb1");
    }

    public final void e(int i) {
        while (i > 0) {
            hb1[] hb1VarArr = this.a;
            hb1VarArr.getClass();
            int i2 = (i - 1) / 2;
            hb1 hb1Var = hb1VarArr[i2];
            hb1Var.getClass();
            hb1 hb1Var2 = hb1VarArr[i];
            hb1Var2.getClass();
            if (hb1Var.compareTo(hb1Var2) <= 0) {
                return;
            }
            f(i, i2);
            i = i2;
        }
    }

    public final void f(int i, int i2) {
        hb1[] hb1VarArr = this.a;
        hb1VarArr.getClass();
        hb1 hb1Var = hb1VarArr[i2];
        hb1Var.getClass();
        hb1 hb1Var2 = hb1VarArr[i];
        hb1Var2.getClass();
        hb1VarArr[i] = hb1Var;
        hb1VarArr[i2] = hb1Var2;
        hb1Var.J = i;
        hb1Var2.J = i2;
    }
}
