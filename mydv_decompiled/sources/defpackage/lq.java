package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lq implements cw4 {
    public final List I;
    public final gc5 J;
    public final tm1 K;
    public final jk3 L;
    public boolean M = true;

    public lq(List list, Object obj, gc5 gc5Var, pn pnVar, tm1 tm1Var, yc ycVar) {
        this.I = list;
        this.J = gc5Var;
        this.K = tm1Var;
        this.L = ad4.w(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0095 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0032, B:16:0x0095, B:24:0x0047, B:26:0x004c, B:28:0x0072, B:34:0x008b), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0095 -> B:14:0x009e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.gj0 r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.kq
            if (r0 == 0) goto L13
            r0 = r13
            kq r0 = (defpackage.kq) r0
            int r1 = r0.O
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.O = r1
            goto L18
        L13:
            kq r0 = new kq
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.M
            int r1 = r0.O
            wd5 r2 = defpackage.wd5.a
            tm1 r3 = r12.K
            jk3 r4 = r12.L
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L88
            r7 = 0
            r8 = 2
            if (r1 == r5) goto L3f
            if (r1 != r8) goto L39
            int r1 = r0.L
            int r7 = r0.K
            java.util.List r8 = r0.I
            defpackage.mu0.V(r13)     // Catch: java.lang.Throwable -> L36
            goto L9e
        L36:
            r13 = move-exception
            goto Lb4
        L39:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r12)
            return r7
        L3f:
            int r1 = r0.L
            int r9 = r0.K
            v44 r10 = r0.J
            java.util.List r11 = r0.I
            defpackage.mu0.V(r13)     // Catch: java.lang.Throwable -> L36
            if (r13 == 0) goto L72
            gc5 r1 = r12.J     // Catch: java.lang.Throwable -> L36
            int r5 = r1.d     // Catch: java.lang.Throwable -> L36
            qk1 r7 = r1.b     // Catch: java.lang.Throwable -> L36
            int r1 = r1.c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r13 = defpackage.e41.u0(r5, r13, r10, r7, r1)     // Catch: java.lang.Throwable -> L36
            r4.setValue(r13)     // Catch: java.lang.Throwable -> L36
            tk0 r13 = r0.getContext()
            boolean r13 = defpackage.vt0.E(r13)
            r12.M = r6
            ic5 r12 = new ic5
            java.lang.Object r0 = r4.getValue()
            r12.<init>(r0, r13)
        L6e:
            r3.invoke(r12)
            return r2
        L72:
            r0.I = r11     // Catch: java.lang.Throwable -> L36
            r0.J = r7     // Catch: java.lang.Throwable -> L36
            r0.K = r9     // Catch: java.lang.Throwable -> L36
            r0.L = r1     // Catch: java.lang.Throwable -> L36
            r0.O = r8     // Catch: java.lang.Throwable -> L36
            java.lang.Object r13 = defpackage.ry5.o(r0)     // Catch: java.lang.Throwable -> L36
            el0 r7 = defpackage.el0.I
            if (r13 != r7) goto L85
            return r7
        L85:
            r7 = r9
            r8 = r11
            goto L9e
        L88:
            defpackage.mu0.V(r13)
            java.util.List r13 = r12.I     // Catch: java.lang.Throwable -> L36
            int r1 = r13.size()     // Catch: java.lang.Throwable -> L36
            r8 = r13
            r7 = r6
        L93:
            if (r7 >= r1) goto La0
            java.lang.Object r13 = r8.get(r7)     // Catch: java.lang.Throwable -> L36
            v44 r13 = (defpackage.v44) r13     // Catch: java.lang.Throwable -> L36
            r13.getClass()     // Catch: java.lang.Throwable -> L36
        L9e:
            int r7 = r7 + r5
            goto L93
        La0:
            tk0 r13 = r0.getContext()
            boolean r13 = defpackage.vt0.E(r13)
            r12.M = r6
            ic5 r12 = new ic5
            java.lang.Object r0 = r4.getValue()
            r12.<init>(r0, r13)
            goto L6e
        Lb4:
            tk0 r0 = r0.getContext()
            boolean r0 = defpackage.vt0.E(r0)
            r12.M = r6
            ic5 r12 = new ic5
            java.lang.Object r1 = r4.getValue()
            r12.<init>(r1, r0)
            r3.invoke(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq.c(gj0):java.lang.Object");
    }

    @Override // defpackage.cw4
    public final Object getValue() {
        return this.L.getValue();
    }
}
