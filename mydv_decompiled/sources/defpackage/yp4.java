package defpackage;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yp4 implements mp0 {
    public static final LinkedHashSet j = new LinkedHashSet();
    public static final Object k = new Object();
    public final rm1 a;
    public final ak4 b;
    public final j81 c;
    public final w84 d;
    public final String e = ".tmp";
    public final u05 f = new u05(new mq1(this, 4));
    public final fw4 g = o7.c(od5.a);
    public List h;
    public final mc3 i;

    public yp4(rm1 rm1Var, ak4 ak4Var, List list, j81 j81Var, dl0 dl0Var) {
        this.a = rm1Var;
        this.b = ak4Var;
        this.c = j81Var;
        fj0 fj0Var = null;
        this.d = new w84(new gu2(this, fj0Var, (byte) 16), (byte) 0);
        this.h = o70.r1(list);
        this.i = new mc3(dl0Var, new am0(this, (byte) 6), new jd(this, fj0Var, (byte) 9));
    }

    @Override // defpackage.mp0
    public final Object a(hn1 hn1Var, gj0 gj0Var) {
        qb0 c = g4.c();
        this.i.j(new kp4(hn1Var, c, (bw4) this.g.getValue(), gj0Var.getContext()));
        return c.p(gj0Var);
    }

    public final File b() {
        return (File) this.f.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r9 != r6) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.kp4 r10, defpackage.gj0 r11) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp4.c(kp4, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.gj0 r12) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp4.d(gj0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, wd5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.gj0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.sp4
            if (r0 == 0) goto L13
            r0 = r5
            sp4 r0 = (defpackage.sp4) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            sp4 r0 = new sp4
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.J
            int r1 = r0.L
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            yp4 r4 = r0.I
            defpackage.mu0.V(r5)     // Catch: java.lang.Throwable -> L28
            goto L40
        L28:
            r5 = move-exception
            goto L43
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r2
        L30:
            defpackage.mu0.V(r5)
            r0.I = r4     // Catch: java.lang.Throwable -> L28
            r0.L = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r4 = r4.d(r0)     // Catch: java.lang.Throwable -> L28
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L40
            return r5
        L40:
            wd5 r4 = defpackage.wd5.a
            return r4
        L43:
            fw4 r4 = r4.g
            l04 r0 = new l04
            r0.<init>(r5)
            r4.getClass()
            r4.i(r2, r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp4.e(gj0):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(4:19|20|21|(1:23))|12|13|14))|26|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0028, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        r4 = r4.g;
        r0 = new defpackage.l04(r5);
        r4.getClass();
        r4.i(null, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.gj0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.tp4
            if (r0 == 0) goto L13
            r0 = r5
            tp4 r0 = (defpackage.tp4) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            tp4 r0 = new tp4
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.J
            int r1 = r0.L
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            yp4 r4 = r0.I
            defpackage.mu0.V(r5)     // Catch: java.lang.Throwable -> L28
            goto L4d
        L28:
            r5 = move-exception
            goto L40
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r2
        L30:
            defpackage.mu0.V(r5)
            r0.I = r4     // Catch: java.lang.Throwable -> L28
            r0.L = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r4 = r4.d(r0)     // Catch: java.lang.Throwable -> L28
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L4d
            return r5
        L40:
            fw4 r4 = r4.g
            l04 r0 = new l04
            r0.<init>(r5)
            r4.getClass()
            r4.i(r2, r0)
        L4d:
            wd5 r4 = defpackage.wd5.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp4.f(gj0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [yp4] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [up4] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [yp4] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.gj0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.up4
            if (r0 == 0) goto L13
            r0 = r6
            up4 r0 = (defpackage.up4) r0
            int r1 = r0.M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.M = r1
            goto L18
        L13:
            up4 r0 = new up4
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.K
            int r1 = r0.M
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            java.io.FileInputStream r5 = r0.J
            yp4 r0 = r0.I
            defpackage.mu0.V(r6)     // Catch: java.lang.Throwable -> L2a
            goto L53
        L2a:
            r6 = move-exception
            goto L5e
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            return r2
        L32:
            defpackage.mu0.V(r6)
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L64
            java.io.File r1 = r5.b()     // Catch: java.io.FileNotFoundException -> L64
            r6.<init>(r1)     // Catch: java.io.FileNotFoundException -> L64
            ak4 r1 = r5.b     // Catch: java.lang.Throwable -> L59
            r0.I = r5     // Catch: java.lang.Throwable -> L59
            r0.J = r6     // Catch: java.lang.Throwable -> L59
            r0.M = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = r1.f(r6)     // Catch: java.lang.Throwable -> L59
            el0 r1 = defpackage.el0.I
            if (r0 != r1) goto L4f
            return r1
        L4f:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L53:
            defpackage.i42.h0(r5, r2)     // Catch: java.io.FileNotFoundException -> L57
            return r6
        L57:
            r5 = move-exception
            goto L67
        L59:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L5e:
            throw r6     // Catch: java.lang.Throwable -> L5f
        L5f:
            r1 = move-exception
            defpackage.i42.h0(r5, r6)     // Catch: java.io.FileNotFoundException -> L57
            throw r1     // Catch: java.io.FileNotFoundException -> L57
        L64:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L67:
            java.io.File r6 = r0.b()
            boolean r6 = r6.exists()
            if (r6 != 0) goto L78
            ak4 r5 = r0.b
            java.lang.Object r5 = r5.b()
            return r5
        L78:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp4.g(gj0):java.lang.Object");
    }

    @Override // defpackage.mp0
    public final zf1 getData() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.gj0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.vp4
            if (r0 == 0) goto L13
            r0 = r6
            vp4 r0 = (defpackage.vp4) r0
            int r1 = r0.M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.M = r1
            goto L18
        L13:
            vp4 r0 = new vp4
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.K
            int r1 = r0.M
            r2 = 2
            r3 = 1
            el0 r4 = defpackage.el0.I
            if (r1 == 0) goto L65
            if (r1 == r3) goto L5b
            r5 = 3
            if (r1 == r2) goto L3c
            if (r1 != r5) goto L35
            java.lang.Object r5 = r0.J
            java.lang.Object r0 = r0.I
            kl0 r0 = (defpackage.kl0) r0
            defpackage.mu0.V(r6)     // Catch: java.io.IOException -> L33
            return r5
        L33:
            r5 = move-exception
            goto L57
        L35:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            r5 = 0
            return r5
        L3c:
            java.lang.Object r1 = r0.J
            kl0 r1 = (defpackage.kl0) r1
            java.lang.Object r2 = r0.I
            yp4 r2 = (defpackage.yp4) r2
            defpackage.mu0.V(r6)
            r0.I = r1     // Catch: java.io.IOException -> L55
            r0.J = r6     // Catch: java.io.IOException -> L55
            r0.M = r5     // Catch: java.io.IOException -> L55
            java.lang.Object r5 = r2.j(r6, r0)     // Catch: java.io.IOException -> L55
            if (r5 != r4) goto L54
            goto L72
        L54:
            return r6
        L55:
            r5 = move-exception
            r0 = r1
        L57:
            defpackage.sv2.i(r0, r5)
            throw r0
        L5b:
            java.lang.Object r5 = r0.I
            yp4 r5 = (defpackage.yp4) r5
            defpackage.mu0.V(r6)     // Catch: defpackage.kl0 -> L63
            return r6
        L63:
            r6 = move-exception
            goto L74
        L65:
            defpackage.mu0.V(r6)
            r0.I = r5     // Catch: defpackage.kl0 -> L63
            r0.M = r3     // Catch: defpackage.kl0 -> L63
            java.lang.Object r5 = r5.g(r0)     // Catch: defpackage.kl0 -> L63
            if (r5 != r4) goto L73
        L72:
            return r4
        L73:
            return r5
        L74:
            j81 r1 = r5.c
            r0.I = r5
            r0.J = r6
            r0.M = r2
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp4.h(gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.hn1 r10, defpackage.tk0 r11, defpackage.gj0 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.wp4
            if (r0 == 0) goto L13
            r0 = r12
            wp4 r0 = (defpackage.wp4) r0
            int r1 = r0.N
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.N = r1
            goto L18
        L13:
            wp4 r0 = new wp4
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.L
            int r1 = r0.N
            java.lang.String r2 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            el0 r7 = defpackage.el0.I
            if (r1 == 0) goto L45
            if (r1 == r5) goto L39
            if (r1 != r4) goto L33
            java.lang.Object r9 = r0.J
            yp4 r10 = r0.I
            defpackage.mu0.V(r12)
            goto L9f
        L33:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r9)
            return r6
        L39:
            java.lang.Object r9 = r0.K
            java.lang.Object r10 = r0.J
            ep0 r10 = (defpackage.ep0) r10
            yp4 r11 = r0.I
            defpackage.mu0.V(r12)
            goto L79
        L45:
            defpackage.mu0.V(r12)
            fw4 r12 = r9.g
            java.lang.Object r12 = r12.getValue()
            ep0 r12 = (defpackage.ep0) r12
            java.lang.Object r1 = r12.a
            if (r1 == 0) goto L59
            int r1 = r1.hashCode()
            goto L5a
        L59:
            r1 = r3
        L5a:
            int r8 = r12.b
            if (r1 != r8) goto Lb7
            java.lang.Object r1 = r12.a
            qk0 r8 = new qk0
            r8.<init>(r10, r1, r6)
            r0.I = r9
            r0.J = r12
            r0.K = r1
            r0.N = r5
            java.lang.Object r10 = defpackage.p70.D0(r11, r8, r0)
            if (r10 != r7) goto L74
            goto L9c
        L74:
            r11 = r12
            r12 = r10
            r10 = r11
            r11 = r9
            r9 = r1
        L79:
            java.lang.Object r1 = r10.a
            if (r1 == 0) goto L82
            int r1 = r1.hashCode()
            goto L83
        L82:
            r1 = r3
        L83:
            int r10 = r10.b
            if (r1 != r10) goto Lb3
            boolean r10 = defpackage.j42.c(r9, r12)
            if (r10 == 0) goto L8e
            return r9
        L8e:
            r0.I = r11
            r0.J = r12
            r0.K = r6
            r0.N = r4
            java.lang.Object r9 = r11.j(r12, r0)
            if (r9 != r7) goto L9d
        L9c:
            return r7
        L9d:
            r10 = r11
            r9 = r12
        L9f:
            fw4 r10 = r10.g
            ep0 r11 = new ep0
            if (r9 == 0) goto La9
            int r3 = r9.hashCode()
        La9:
            r11.<init>(r3, r9)
            r10.getClass()
            r10.i(r6, r11)
            return r9
        Lb3:
            defpackage.zy.i(r2)
            return r6
        Lb7:
            defpackage.zy.i(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp4.i(hn1, tk0, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009f A[Catch: IOException -> 0x00b6, TryCatch #1 {IOException -> 0x00b6, blocks: (B:13:0x0091, B:17:0x009f, B:18:0x00b5, B:25:0x00bc, B:26:0x00bf, B:42:0x0069, B:22:0x00ba), top: B:41:0x0069, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.Object r9, defpackage.gj0 r10) {
        /*
            r8 = this;
            java.lang.String r0 = "Unable to rename "
            boolean r1 = r10 instanceof defpackage.xp4
            if (r1 == 0) goto L15
            r1 = r10
            xp4 r1 = (defpackage.xp4) r1
            int r2 = r1.O
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.O = r2
            goto L1a
        L15:
            xp4 r1 = new xp4
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.M
            int r2 = r1.O
            wd5 r3 = defpackage.wd5.a
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 != r5) goto L35
            java.io.FileOutputStream r8 = r1.L
            java.io.FileOutputStream r9 = r1.K
            java.io.File r2 = r1.J
            yp4 r1 = r1.I
            defpackage.mu0.V(r10)     // Catch: java.lang.Throwable -> L32
            goto L8a
        L32:
            r8 = move-exception
            goto Lba
        L35:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r8)
            return r4
        L3b:
            defpackage.mu0.V(r10)
            java.io.File r10 = r8.b()
            java.io.File r2 = r10.getCanonicalFile()
            java.io.File r2 = r2.getParentFile()
            if (r2 != 0) goto L4d
            goto L56
        L4d:
            r2.mkdirs()
            boolean r2 = r2.isDirectory()
            if (r2 == 0) goto Lca
        L56:
            java.io.File r2 = new java.io.File
            java.io.File r10 = r8.b()
            java.lang.String r10 = r10.getAbsolutePath()
            java.lang.String r6 = r8.e
            java.lang.String r10 = defpackage.j42.d0(r6, r10)
            r2.<init>(r10)
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lb6
            r10.<init>(r2)     // Catch: java.io.IOException -> Lb6
            ak4 r6 = r8.b     // Catch: java.lang.Throwable -> Lb8
            mp4 r7 = new mp4     // Catch: java.lang.Throwable -> Lb8
            r7.<init>(r10)     // Catch: java.lang.Throwable -> Lb8
            r1.I = r8     // Catch: java.lang.Throwable -> Lb8
            r1.J = r2     // Catch: java.lang.Throwable -> Lb8
            r1.K = r10     // Catch: java.lang.Throwable -> Lb8
            r1.L = r10     // Catch: java.lang.Throwable -> Lb8
            r1.O = r5     // Catch: java.lang.Throwable -> Lb8
            r6.a(r9, r7)     // Catch: java.lang.Throwable -> Lb8
            el0 r9 = defpackage.el0.I
            if (r3 != r9) goto L87
            return r9
        L87:
            r1 = r8
            r8 = r10
            r9 = r8
        L8a:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L32
            r8.sync()     // Catch: java.lang.Throwable -> L32
            defpackage.i42.h0(r9, r4)     // Catch: java.io.IOException -> Lb6
            java.io.File r8 = r1.b()     // Catch: java.io.IOException -> Lb6
            boolean r8 = r2.renameTo(r8)     // Catch: java.io.IOException -> Lb6
            if (r8 == 0) goto L9f
            return r3
        L9f:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lb6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lb6
            r9.<init>(r0)     // Catch: java.io.IOException -> Lb6
            r9.append(r2)     // Catch: java.io.IOException -> Lb6
            java.lang.String r10 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r10)     // Catch: java.io.IOException -> Lb6
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lb6
            r8.<init>(r9)     // Catch: java.io.IOException -> Lb6
            throw r8     // Catch: java.io.IOException -> Lb6
        Lb6:
            r8 = move-exception
            goto Lc0
        Lb8:
            r8 = move-exception
            r9 = r10
        Lba:
            throw r8     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r10 = move-exception
            defpackage.i42.h0(r9, r8)     // Catch: java.io.IOException -> Lb6
            throw r10     // Catch: java.io.IOException -> Lb6
        Lc0:
            boolean r9 = r2.exists()
            if (r9 == 0) goto Lc9
            r2.delete()
        Lc9:
            throw r8
        Lca:
            java.lang.String r8 = "Unable to create parent directories of "
            java.lang.String r8 = defpackage.j42.d0(r10, r8)
            defpackage.zl1.g(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp4.j(java.lang.Object, gj0):java.lang.Object");
    }
}
