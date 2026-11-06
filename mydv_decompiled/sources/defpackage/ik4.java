package defpackage;

import androidx.glance.session.SessionWorker;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ik4 implements ck4 {
    public final Class a;
    public final fa4 b;
    public final l95 c;
    public final o53 d;
    public final hk4 e;

    public ik4() {
        fa4 fa4Var = new fa4((byte) 17);
        this.a = SessionWorker.class;
        this.b = fa4Var;
        this.c = yx5.a;
        this.d = new o53();
        this.e = new hk4(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r9.e(r0) == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(defpackage.ik4 r7, defpackage.hn1 r8, defpackage.fj0 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.dk4
            if (r0 == 0) goto L13
            r0 = r9
            dk4 r0 = (defpackage.dk4) r0
            int r1 = r0.N
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.N = r1
            goto L18
        L13:
            dk4 r0 = new dk4
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.L
            int r1 = r0.N
            r2 = 2
            r3 = 1
            r4 = 0
            el0 r5 = defpackage.el0.I
            if (r1 == 0) goto L47
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r7 = r0.I
            m53 r7 = (defpackage.m53) r7
            defpackage.mu0.V(r9)     // Catch: java.lang.Throwable -> L2f
            goto L72
        L2f:
            r8 = move-exception
            goto L78
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            return r4
        L37:
            o53 r7 = r0.K
            k05 r8 = r0.J
            hn1 r8 = (defpackage.hn1) r8
            java.lang.Object r1 = r0.I
            ik4 r1 = (defpackage.ik4) r1
            defpackage.mu0.V(r9)
            r9 = r7
            r7 = r1
            goto L5e
        L47:
            defpackage.mu0.V(r9)
            o53 r9 = r7.d
            r0.I = r7
            r1 = r8
            k05 r1 = (defpackage.k05) r1
            r0.J = r1
            r0.K = r9
            r0.N = r3
            java.lang.Object r1 = r9.e(r0)
            if (r1 != r5) goto L5e
            goto L6e
        L5e:
            hk4 r7 = r7.e     // Catch: java.lang.Throwable -> L76
            r0.I = r9     // Catch: java.lang.Throwable -> L76
            r0.J = r4     // Catch: java.lang.Throwable -> L76
            r0.K = r4     // Catch: java.lang.Throwable -> L76
            r0.N = r2     // Catch: java.lang.Throwable -> L76
            java.lang.Object r7 = r8.invoke(r7, r0)     // Catch: java.lang.Throwable -> L76
            if (r7 != r5) goto L6f
        L6e:
            return r5
        L6f:
            r6 = r9
            r9 = r7
            r7 = r6
        L72:
            r7.g(r4)
            return r9
        L76:
            r8 = move-exception
            r7 = r9
        L78:
            r7.g(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik4.a(ik4, hn1, fj0):java.lang.Object");
    }
}
