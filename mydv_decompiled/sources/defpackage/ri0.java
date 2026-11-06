package defpackage;

import android.util.LruCache;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ri0 {
    public static final ri0 a = new ri0();
    public static final LruCache b = new LruCache(256);

    public static Integer a(String str) {
        str.getClass();
        if (jx4.D(str, "aweme_default_avatar", false)) {
            return 0;
        }
        return (Integer) b.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
    
        if (r7 == r6) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(coil3.ImageLoader r8, android.content.Context r9, java.lang.String r10, defpackage.gj0 r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.oi0
            if (r0 == 0) goto L13
            r0 = r11
            oi0 r0 = (defpackage.oi0) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            oi0 r0 = new oi0
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r7 = r0.J
            int r11 = r0.L
            android.util.LruCache r1 = defpackage.ri0.b
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 0
            el0 r6 = defpackage.el0.I
            if (r11 == 0) goto L3d
            if (r11 == r3) goto L37
            if (r11 != r2) goto L31
            java.lang.String r8 = r0.I
            defpackage.mu0.V(r7)
            goto Lb0
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            return r5
        L37:
            java.lang.String r10 = r0.I
            defpackage.mu0.V(r7)
            goto L85
        L3d:
            defpackage.mu0.V(r7)
            r10.getClass()
            java.lang.String r7 = "aweme_default_avatar"
            boolean r7 = defpackage.jx4.D(r10, r7, r4)
            if (r7 == 0) goto L51
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r4)
            return r7
        L51:
            java.lang.Object r7 = r1.get(r10)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L63
            int r7 = r7.intValue()
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            return r8
        L63:
            coil3.request.ImageRequest$Builder r7 = new coil3.request.ImageRequest$Builder
            r7.<init>(r9)
            coil3.request.ImageRequest$Builder r7 = r7.data(r10)
            r9 = 112(0x70, float:1.57E-43)
            coil3.request.ImageRequest$Builder r7 = r7.size(r9)
            coil3.request.ImageRequest$Builder r7 = coil3.request.ImageRequests_androidKt.allowHardware(r7, r4)
            coil3.request.ImageRequest r7 = r7.build()
            r0.I = r10
            r0.L = r3
            java.lang.Object r7 = r8.execute(r7, r0)
            if (r7 != r6) goto L85
            goto Lae
        L85:
            boolean r8 = r7 instanceof coil3.request.SuccessResult
            if (r8 == 0) goto L8c
            coil3.request.SuccessResult r7 = (coil3.request.SuccessResult) r7
            goto L8d
        L8c:
            r7 = r5
        L8d:
            if (r7 == 0) goto Lc8
            coil3.Image r7 = r7.getImage()
            if (r7 == 0) goto Lc8
            r8 = 3
            android.graphics.Bitmap r7 = coil3.Image_androidKt.toBitmap$default(r7, r4, r4, r8, r5)
            if (r7 != 0) goto L9d
            goto Lc8
        L9d:
            os0 r8 = defpackage.sx0.a
            pi0 r9 = new pi0
            r9.<init>(r7, r5, r4)
            r0.I = r10
            r0.L = r2
            java.lang.Object r7 = defpackage.p70.D0(r8, r9, r0)
            if (r7 != r6) goto Laf
        Lae:
            return r6
        Laf:
            r8 = r10
        Lb0:
            x70 r7 = (defpackage.x70) r7
            if (r7 == 0) goto Lba
            long r9 = r7.a
            int r4 = defpackage.qb.i0(r9)
        Lba:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r4)
            r1.put(r8, r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r4)
            return r7
        Lc8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri0.b(coil3.ImageLoader, android.content.Context, java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(coil3.ImageLoader r5, android.content.Context r6, java.lang.String r7, defpackage.gj0 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.qi0
            if (r0 == 0) goto L13
            r0 = r8
            qi0 r0 = (defpackage.qi0) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            qi0 r0 = new qi0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.I
            int r1 = r0.K
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.mu0.V(r8)
            goto L3a
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r3
        L2c:
            defpackage.mu0.V(r8)
            r0.K = r2
            java.lang.Object r8 = r4.b(r5, r6, r7, r0)
            el0 r4 = defpackage.el0.I
            if (r8 != r4) goto L3a
            return r4
        L3a:
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L4f
            int r4 = r8.intValue()
            if (r4 != 0) goto L45
            goto L4f
        L45:
            long r4 = defpackage.qb.i(r4)
            x70 r6 = new x70
            r6.<init>(r4)
            return r6
        L4f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri0.c(coil3.ImageLoader, android.content.Context, java.lang.String, gj0):java.lang.Object");
    }
}
