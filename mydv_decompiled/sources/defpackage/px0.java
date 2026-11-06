package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class px0 extends b25 {
    public int K;

    public px0(int i) {
        super(0L, false);
        this.K = i;
    }

    public abstract fj0 d();

    public Throwable e(Object obj) {
        ub0 ub0Var = obj instanceof ub0 ? (ub0) obj : null;
        if (ub0Var != null) {
            return ub0Var.a;
        }
        return null;
    }

    public final void g(Throwable th) {
        o7.C(d().getContext(), new jl0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        r4 = (defpackage.v52) r5.get(defpackage.q8.r0);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            fj0 r0 = r11.d()     // Catch: java.lang.Throwable -> L1f defpackage.mx0 -> L22
            r0.getClass()     // Catch: java.lang.Throwable -> L1f defpackage.mx0 -> L22
            nx0 r0 = (defpackage.nx0) r0     // Catch: java.lang.Throwable -> L1f defpackage.mx0 -> L22
            fj0 r1 = r0.M     // Catch: java.lang.Throwable -> L1f defpackage.mx0 -> L22
            java.lang.Object r0 = r0.O     // Catch: java.lang.Throwable -> L1f defpackage.mx0 -> L22
            tk0 r2 = r1.getContext()     // Catch: java.lang.Throwable -> L1f defpackage.mx0 -> L22
            java.lang.Object r0 = defpackage.j42.l0(r2, r0)     // Catch: java.lang.Throwable -> L1f defpackage.mx0 -> L22
            ep r3 = defpackage.j42.s     // Catch: java.lang.Throwable -> L1f defpackage.mx0 -> L22
            r4 = 0
            if (r0 == r3) goto L25
            qd5 r3 = defpackage.qb.l0(r1, r2, r0)     // Catch: java.lang.Throwable -> L1f defpackage.mx0 -> L22
            goto L26
        L1f:
            r0 = move-exception
            goto L8c
        L22:
            r0 = move-exception
            goto L90
        L25:
            r3 = r4
        L26:
            tk0 r5 = r1.getContext()     // Catch: java.lang.Throwable -> L49
            java.lang.Object r6 = r11.h()     // Catch: java.lang.Throwable -> L49
            java.lang.Throwable r7 = r11.e(r6)     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L4b
            int r8 = r11.K     // Catch: java.lang.Throwable -> L49
            r9 = 1
            if (r8 == r9) goto L3e
            r10 = 2
            if (r8 != r10) goto L3d
            goto L3e
        L3d:
            r9 = 0
        L3e:
            if (r9 == 0) goto L4b
            q8 r4 = defpackage.q8.r0     // Catch: java.lang.Throwable -> L49
            rk0 r4 = r5.get(r4)     // Catch: java.lang.Throwable -> L49
            v52 r4 = (defpackage.v52) r4     // Catch: java.lang.Throwable -> L49
            goto L4b
        L49:
            r1 = move-exception
            goto L80
        L4b:
            if (r4 == 0) goto L62
            boolean r5 = r4.isActive()     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L62
            java.util.concurrent.CancellationException r4 = r4.t()     // Catch: java.lang.Throwable -> L49
            r11.c(r4)     // Catch: java.lang.Throwable -> L49
            g54 r4 = defpackage.mu0.o(r4)     // Catch: java.lang.Throwable -> L49
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L49
            goto L74
        L62:
            if (r7 == 0) goto L6d
            g54 r4 = new g54     // Catch: java.lang.Throwable -> L49
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L49
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L49
            goto L74
        L6d:
            java.lang.Object r4 = r11.f(r6)     // Catch: java.lang.Throwable -> L49
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L49
        L74:
            if (r3 == 0) goto L7c
            boolean r1 = r3.j0()     // Catch: java.lang.Throwable -> L1f defpackage.mx0 -> L22
            if (r1 == 0) goto L9d
        L7c:
            defpackage.j42.Y(r2, r0)     // Catch: java.lang.Throwable -> L1f defpackage.mx0 -> L22
            return
        L80:
            if (r3 == 0) goto L88
            boolean r3 = r3.j0()     // Catch: java.lang.Throwable -> L1f defpackage.mx0 -> L22
            if (r3 == 0) goto L8b
        L88:
            defpackage.j42.Y(r2, r0)     // Catch: java.lang.Throwable -> L1f defpackage.mx0 -> L22
        L8b:
            throw r1     // Catch: java.lang.Throwable -> L1f defpackage.mx0 -> L22
        L8c:
            r11.g(r0)
            goto L9d
        L90:
            fj0 r11 = r11.d()
            tk0 r11 = r11.getContext()
            java.lang.Throwable r0 = r0.I
            defpackage.o7.C(r11, r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.px0.run():void");
    }

    public void c(CancellationException cancellationException) {
    }

    public Object f(Object obj) {
        return obj;
    }
}
