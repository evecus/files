package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cg0 implements zf0 {
    public final iq3 I;
    public final iq3 J;
    public final ThreadLocal K;
    public final AtomicBoolean L;
    public final long M;

    public cg0(final g12 g12Var, final String str, int i) {
        str.getClass();
        this.K = new ThreadLocal();
        final byte b = 0;
        this.L = new AtomicBoolean(false);
        jp jpVar = t41.J;
        this.M = sp0.n0(30, x41.SECONDS);
        if (i <= 0) {
            s83.t("Maximum number of readers must be greater than 0");
            throw null;
        }
        this.I = new iq3(i, new rm1() { // from class: ag0
            @Override // defpackage.rm1
            public final Object invoke() {
                byte b2 = b;
                String str2 = str;
                g12 g12Var2 = g12Var;
                switch (b2) {
                    case 0:
                        o84 c = g12Var2.c(str2);
                        lq2.D(c, "PRAGMA query_only = 1");
                        return c;
                    default:
                        return g12Var2.c(str2);
                }
            }
        });
        final byte b2 = 1;
        this.J = new iq3(1, new rm1() { // from class: ag0
            @Override // defpackage.rm1
            public final Object invoke() {
                byte b22 = b2;
                String str2 = str;
                g12 g12Var2 = g12Var;
                switch (b22) {
                    case 0:
                        o84 c = g12Var2.c(str2);
                        lq2.D(c, "PRAGMA query_only = 1");
                        return c;
                    default:
                        return g12Var2.c(str2);
                }
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.L.compareAndSet(false, true)) {
            this.I.b();
            this.J.b();
        }
    }

    public final void e(boolean z) {
        String str = z ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append("\n\nWriter pool:\n");
        this.J.c(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.I.c(sb);
        lq2.l0(5, sb.toString());
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b4 A[Catch: all -> 0x01cc, TRY_LEAVE, TryCatch #6 {all -> 0x01cc, blocks: (B:17:0x01ae, B:19:0x01b4, B:24:0x01be, B:21:0x01c3), top: B:16:0x01ae }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0150 A[Catch: all -> 0x016d, TryCatch #7 {all -> 0x016d, blocks: (B:62:0x014a, B:64:0x0150, B:68:0x0169, B:69:0x0173, B:73:0x017d, B:77:0x01cd, B:78:0x01d4, B:79:0x01d5, B:80:0x01d6, B:81:0x01d9), top: B:61:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d6 A[Catch: all -> 0x016d, TryCatch #7 {all -> 0x016d, blocks: (B:62:0x014a, B:64:0x0150, B:68:0x0169, B:69:0x0173, B:73:0x017d, B:77:0x01cd, B:78:0x01d4, B:79:0x01d5, B:80:0x01d6, B:81:0x01d9), top: B:61:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0078  */
    @Override // defpackage.zf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(boolean r20, defpackage.hn1 r21, defpackage.gj0 r22) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg0.o(boolean, hn1, gj0):java.lang.Object");
    }

    public cg0(g12 g12Var) {
        this.K = new ThreadLocal();
        this.L = new AtomicBoolean(false);
        jp jpVar = t41.J;
        this.M = sp0.n0(30, x41.SECONDS);
        iq3 iq3Var = new iq3(1, new ce(g12Var, (byte) 10));
        this.I = iq3Var;
        this.J = iq3Var;
    }
}
