package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class wa3 {
    public final oc4 a;
    public final hn1 b;
    public iu0 c;
    public boolean d;
    public final g12 e = new g12((byte) 8);

    public wa3(oc4 oc4Var, hn1 hn1Var, iu0 iu0Var) {
        this.a = oc4Var;
        this.b = hn1Var;
        this.c = iu0Var;
    }

    public static void a(kp3 kp3Var) {
        List list = kp3Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((rp3) list.get(i)).a();
        }
    }

    public final void b(iu0 iu0Var) {
        this.c = iu0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.hn1 r5, defpackage.gj0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.va3
            if (r0 == 0) goto L13
            r0 = r6
            va3 r0 = (defpackage.va3) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            va3 r0 = new va3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.K
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.mu0.V(r6)
            goto L4b
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r2
        L2c:
            defpackage.mu0.V(r6)
            r4.d = r3
            gu2 r6 = new gu2
            r1 = 2
            r6.<init>(r4, r5, r2, r1)
            r0.K = r3
            ez4 r5 = new ez4
            tk0 r1 = r0.getContext()
            r5.<init>(r0, r1)
            java.lang.Object r5 = defpackage.oh4.s(r5, r3, r5, r6)
            el0 r6 = defpackage.el0.I
            if (r5 != r6) goto L4b
            return r6
        L4b:
            r5 = 0
            r4.d = r5
            wd5 r4 = defpackage.wd5.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa3.c(hn1, gj0):java.lang.Object");
    }
}
