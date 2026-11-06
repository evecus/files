package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class c50 extends lh4 {
    public final iz h;
    public final /* synthetic */ AtomicReferenceArray i;

    public c50(long j, c50 c50Var, iz izVar, int i) {
        super(j, c50Var, i);
        this.h = izVar;
        this.i = new AtomicReferenceArray(kz.b * 2);
    }

    @Override // defpackage.lh4
    public final int g() {
        return kz.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0047, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // defpackage.lh4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r5, defpackage.tk0 r6) {
        /*
            r4 = this;
            int r6 = defpackage.kz.b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.i
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.l(r5)
            boolean r1 = r6 instanceof defpackage.os5
            iz r2 = r4.h
            r3 = 0
            if (r1 != 0) goto L50
            boolean r1 = r6 instanceof defpackage.ps5
            if (r1 == 0) goto L21
            goto L50
        L21:
            ep r1 = defpackage.kz.j
            if (r6 == r1) goto L47
            ep r1 = defpackage.kz.k
            if (r6 != r1) goto L2a
            goto L47
        L2a:
            ep r1 = defpackage.kz.g
            if (r6 == r1) goto L11
            ep r1 = defpackage.kz.f
            if (r6 != r1) goto L33
            goto L11
        L33:
            ep r4 = defpackage.kz.i
            if (r6 == r4) goto L6a
            ep r4 = defpackage.kz.d
            if (r6 != r4) goto L3c
            goto L6a
        L3c:
            ep r4 = defpackage.kz.l
            if (r6 != r4) goto L41
            goto L6a
        L41:
            java.lang.String r4 = "unexpected state: "
            defpackage.zy.h(r6, r4)
            return
        L47:
            r4.n(r5, r3)
            if (r0 == 0) goto L6a
            r2.getClass()
            return
        L50:
            if (r0 == 0) goto L55
            ep r1 = defpackage.kz.j
            goto L57
        L55:
            ep r1 = defpackage.kz.k
        L57:
            boolean r6 = r4.k(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.n(r5, r3)
            r6 = r0 ^ 1
            r4.m(r5, r6)
            if (r0 == 0) goto L6a
            r2.getClass()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c50.h(int, tk0):void");
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.i;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.i.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            iz izVar = this.h;
            izVar.getClass();
            izVar.M((this.e * kz.b) + i);
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.i.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.i.set((i * 2) + 1, obj);
    }
}
