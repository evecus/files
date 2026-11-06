package defpackage;

import java.io.PrintStream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class j44 {
    public static final int a;
    public static final int b;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r0.equalsIgnoreCase("WARN") != false) goto L26;
     */
    static {
        /*
            java.lang.String r0 = "stdout"
            java.lang.String r1 = "sysout"
            java.lang.String r2 = "System.out"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.lang.String r1 = "slf4j.internal.report.stream"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            r2 = 2
            r3 = 3
            r4 = 1
            if (r1 == 0) goto L2c
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L1c
            goto L2c
        L1c:
            r5 = 0
        L1d:
            if (r5 >= r3) goto L2c
            r6 = r0[r5]
            boolean r6 = r6.equalsIgnoreCase(r1)
            if (r6 == 0) goto L29
            r0 = r2
            goto L2d
        L29:
            int r5 = r5 + 1
            goto L1d
        L2c:
            r0 = r4
        L2d:
            defpackage.j44.a = r0
            java.lang.String r0 = "slf4j.internal.verbosity"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L51
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L3e
            goto L51
        L3e:
            java.lang.String r1 = "ERROR"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L48
            r2 = r3
            goto L52
        L48:
            java.lang.String r1 = "WARN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L51
            goto L52
        L51:
            r2 = r4
        L52:
            defpackage.j44.b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j44.<clinit>():void");
    }

    public static final void a(String str, Throwable th) {
        b().println("SLF4J(E): ".concat(str));
        b().println("SLF4J(E): Reported exception:");
        th.printStackTrace(b());
    }

    public static PrintStream b() {
        return pt1.F(a) != 1 ? System.err : System.out;
    }

    public static final void c(String str) {
        if (nt3.h(2) >= nt3.h(b)) {
            b().println("SLF4J(W): ".concat(str));
        }
    }
}
