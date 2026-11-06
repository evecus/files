package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fu0 implements Iterator, w72 {
    public int I = -1;
    public int J;
    public int K;
    public u22 L;
    public int M;
    public final /* synthetic */ gu0 N;

    public fu0(gu0 gu0Var) {
        this.N = gu0Var;
        int r = ut0.r(0, 0, gu0Var.a.length());
        this.J = r;
        this.K = r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r4) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r8 = this;
            gu0 r0 = r8.N
            java.lang.CharSequence r1 = r0.a
            int r2 = r8.K
            r3 = 0
            if (r2 >= 0) goto Lf
            r8.I = r3
            r0 = 0
            r8.L = r0
            return
        Lf:
            int r4 = r0.b
            r5 = -1
            r6 = 1
            if (r4 <= 0) goto L1c
            int r7 = r8.M
            int r7 = r7 + r6
            r8.M = r7
            if (r7 >= r4) goto L22
        L1c:
            int r4 = r1.length()
            if (r2 <= r4) goto L36
        L22:
            u22 r0 = new u22
            int r2 = r8.J
            r1.getClass()
            int r1 = r1.length()
            int r1 = r1 - r6
            r0.<init>(r2, r1, r6)
            r8.L = r0
            r8.K = r5
            goto L7b
        L36:
            hn1 r0 = r0.c
            int r2 = r8.K
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r1, r2)
            uj3 r0 = (defpackage.uj3) r0
            if (r0 != 0) goto L5a
            u22 r0 = new u22
            int r2 = r8.J
            r1.getClass()
            int r1 = r1.length()
            int r1 = r1 - r6
            r0.<init>(r2, r1, r6)
            r8.L = r0
            r8.K = r5
            goto L7b
        L5a:
            java.lang.Object r1 = r0.I
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.J
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r2 = r8.J
            u22 r2 = defpackage.ut0.c0(r2, r1)
            r8.L = r2
            int r1 = r1 + r0
            r8.J = r1
            if (r0 != 0) goto L78
            r3 = r6
        L78:
            int r1 = r1 + r3
            r8.K = r1
        L7b:
            r8.I = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu0.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.I == -1) {
            a();
        }
        return this.I == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.I == -1) {
            a();
        }
        if (this.I == 0) {
            zy.k();
            return null;
        }
        u22 u22Var = this.L;
        u22Var.getClass();
        this.L = null;
        this.I = -1;
        return u22Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
