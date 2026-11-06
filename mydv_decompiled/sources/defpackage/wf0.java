package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class wf0 extends iz {
    public final ez b0;

    public wf0(int i, ez ezVar) {
        super(i);
        this.b0 = ezVar;
        if (ezVar == ez.I) {
            s83.j(s24.a(iz.class).c(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        s83.h(r7.z("Buffered channel capacity must be at least 1, but ", i, " was specified"));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            ez r1 = r15.b0
            ez r2 = defpackage.ez.K
            wd5 r8 = defpackage.wd5.a
            if (r1 != r2) goto L17
            java.lang.Object r0 = super.d(r16)
            boolean r1 = r0 instanceof defpackage.z40
            if (r1 == 0) goto L16
            boolean r1 = r0 instanceof defpackage.y40
            if (r1 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r0
        L17:
            ep r6 = defpackage.kz.d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.iz.N
            java.lang.Object r1 = r1.get(r15)
            c50 r1 = (defpackage.c50) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.iz.J
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.w(r2, r7)
            int r9 = defpackage.kz.b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.e
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            c50 r2 = r15.n(r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r0 = r15.s()
            y40 r1 = new y40
            r1.<init>(r0)
            return r1
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = r0.K(r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb3
            r3 = 1
            if (r12 == r3) goto Lb2
            r3 = 2
            r13 = 0
            if (r12 == r3) goto L8d
            r2 = 3
            if (r12 == r2) goto L87
            r2 = 4
            if (r12 == r2) goto L72
            r2 = 5
            if (r12 == r2) goto L6e
            goto L21
        L6e:
            r1.b()
            goto L21
        L72:
            long r2 = r15.r()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7d
            r1.b()
        L7d:
            java.lang.Throwable r0 = r15.s()
            y40 r1 = new y40
            r1.<init>(r0)
            return r1
        L87:
            java.lang.String r0 = "unexpected"
            defpackage.zy.i(r0)
            return r13
        L8d:
            if (r7 == 0) goto L9c
            r1.i()
            java.lang.Throwable r0 = r15.s()
            y40 r1 = new y40
            r1.<init>(r0)
            return r1
        L9c:
            boolean r3 = r6 instanceof defpackage.os5
            if (r3 == 0) goto La3
            r13 = r6
            os5 r13 = (defpackage.os5) r13
        La3:
            if (r13 == 0) goto Laa
            int r12 = r2 + r9
            r13.b(r1, r12)
        Laa:
            long r3 = r1.e
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.j(r3)
        Lb2:
            return r8
        Lb3:
            r1.b()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf0.N(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // defpackage.iz, defpackage.mj4
    public final Object b(fj0 fj0Var, Object obj) {
        if (N(obj, true) instanceof y40) {
            throw s();
        }
        return wd5.a;
    }

    @Override // defpackage.iz, defpackage.mj4
    public final Object d(Object obj) {
        return N(obj, false);
    }

    @Override // defpackage.iz
    public final boolean z() {
        return this.b0 == ez.J;
    }
}
